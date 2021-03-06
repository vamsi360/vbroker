package com.flipkart.vbroker.app;

import com.flipkart.vbroker.app.MockHttp.MockURI;
import com.flipkart.vbroker.client.*;
import com.flipkart.vbroker.flatbuf.Message;
import com.flipkart.vbroker.utils.DummyEntities;
import com.flipkart.vbroker.wrappers.Subscription;
import com.flipkart.vbroker.wrappers.Topic;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.xebialabs.restito.builder.verify.VerifySequenced;
import lombok.extern.slf4j.Slf4j;
import org.glassfish.grizzly.http.Method;
import org.testng.annotations.Test;
import org.testng.collections.Maps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.flipkart.vbroker.app.MockHttp.MOCK_HTTP_SERVER_PORT;
import static com.flipkart.vbroker.app.MockHttp.MockURI.URI_200;
import static com.flipkart.vbroker.app.MockHttp.MockURI.URI_201;
import static com.xebialabs.restito.builder.verify.VerifyHttp.verifyHttp;
import static com.xebialabs.restito.semantics.Condition.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Slf4j
public class MessageFlowIntegrationTest extends AbstractVBrokerBaseTest {
    private static final String payloadPrefix = "SampleMsg_";

    @Test(invocationCount = 1)
    public void shouldProduceAndConsumeMessages_MultipleMessagesOfSameTopic_Grouped() throws InterruptedException, MalformedURLException {
        produceAndConsumeMessages_ValidateConsumingSequence(MockURI.URI_200, 0);
    }

    @Test
    public void shouldProduceAndConsumeMessage_InOrderForSameGroup_WithSlowDestinations() throws InterruptedException, MalformedURLException {
        produceAndConsumeMessages_ValidateConsumingSequence(MockURI.SLEEP_200, 6000);
    }

    @Test
    public void shouldProduceMessages_SidelineThem_ThenPollSidelinedMessages_MultipleGroups() throws Exception {
        int noOfRecords = 3;
        int noOfGroups = 5;

        Topic topic = createTopic(true);
        Subscription subscription = createSubscription(true);

        List<ProducerRecord> producedRecords = Lists.newArrayList();
        Map<String, Queue<String>> groupMessagesQueueMap = Maps.newHashMap();

        IntStream.range(0, noOfGroups)
            .forEachOrdered(i -> {
                String group = "group_" + i;
                Queue<String> messageQueue = Queues.newArrayDeque();
                List<ProducerRecord> groupRecords = IntStream.range(0, noOfRecords)
                    .mapToObj(j -> newProducerRecord(topic, group, MockURI.URI_404, getMsgBody(payloadPrefix, j).getBytes()))
                    .collect(Collectors.toList());
                producedRecords.addAll(groupRecords);

                groupRecords.forEach(record -> messageQueue.add(record.getMessageId()));
                groupMessagesQueueMap.put(group, messageQueue);
            });

        //produce all groups now
        produceRecords(producedRecords);
        Set<String> messageIds = producedRecords.stream()
            .map(ProducerRecord::getMessageId)
            .collect(Collectors.toSet());

        Set<Subscription> subscriptions = Sets.newHashSet(subscription);
        VBClientConfig config = getVbClientConfig();
        VBrokerConsumer consumer = new VBrokerConsumer(config, metricRegistry);
        try {
            consumer.subscribe(subscriptions);

            int timeoutMs = 5000;
            CompletionStage<List<ConsumerRecord>> polledRecordsStage = consumer.poll(producedRecords.size(), timeoutMs);
            polledRecordsStage.thenAccept(consumerRecords -> {
                log.info("No of records consumed are: {}", consumerRecords.size());
                assertEquals(consumerRecords.size(), producedRecords.size());
                consumerRecords.forEach(consumerRecord -> {
                    log.info("Consumed record with msg_id: {} and grp_id: {}",
                        consumerRecord.getMessageId(), consumerRecord.getGroupId());

                    assertTrue(messageIds.contains(consumerRecord.getMessageId()));
                    assertEquals(groupMessagesQueueMap.get(consumerRecord.getGroupId()).poll(), consumerRecord.getMessageId());
                });
            }).toCompletableFuture().join();
        } finally {
            consumer.unSubscribe(subscriptions);
            consumer.close();
        }
    }

    private void produceAndConsumeMessages_ValidateConsumingSequence(MockURI mockURI, int sleepTimeMs) throws InterruptedException, MalformedURLException {
        int noOfRecords = 3;
        Topic topic = createTopic(true);

        List<ProducerRecord> records = IntStream.range(0, noOfRecords)
            .mapToObj(i -> newProducerRecord(topic, "group_0", mockURI, getMsgBody(payloadPrefix, i).getBytes()))
            .collect(Collectors.toList());
        produceRecords(records);

        Thread.sleep(sleepTimeMs);
        //Verify the message is consumed

        validateSequence(records);
    }

    private void validateSequence(List<ProducerRecord> records) throws MalformedURLException {
        //noinspection ConstantConditions
        assertTrue(records.size() >= 1);

        ProducerRecord record = records.get(0);
        String body = getBody(record);
        URL url = new URL(record.getHttpUri());
        VerifySequenced verifySequenced = verifyHttp(httpServer).times(1,
            method(Method.POST), uri(url.getPath()), withPostBodyContaining(body));

        for (int i = 1; i < records.size(); i++) {
            record = records.get(i);
            body = new String(record.getPayload());
            url = new URL(record.getHttpUri());
            verifySequenced = verifySequenced.then().times(1,
                method(Method.POST), uri(url.getPath()), withPostBodyContaining(body));
        }
    }

    private String getBody(ProducerRecord record) {
        return new String(record.getPayload());
    }

    private String getMsgBody(String payloadPrefix, int i) {
        return String.format("%s_msg_%s", payloadPrefix, i);
    }

    @Test(invocationCount = 10)
    public void shouldProduceAndConsumeMessages_MultipleMessagesOfSameTopic_MultipleGroups() throws InterruptedException {
        int noOfRecords = 10;
        int noOfGroups = 50;

        Topic topic = createTopic(true);
        byte[] payload = "This is a sample message".getBytes();

        List<ProducerRecord> allRecords = Lists.newArrayList();
        IntStream.range(0, noOfGroups)
            .forEachOrdered(groupIdx -> {
                List<ProducerRecord> records = IntStream.range(0, noOfRecords)
                    .mapToObj(i -> newProducerRecordWithCallback(topic, "group_" + groupIdx, getUrl(groupIdx),
                        -1, getUrl(groupIdx), payload))
                    .collect(Collectors.toList());
                allRecords.addAll(records);
            });

        produceRecords(allRecords);
        Thread.sleep(2 * 1000);

        IntStream.range(0, noOfGroups)
            .forEachOrdered(groupIdx -> {
                log.info("GroupIdx {}", groupIdx);
                verifyHttp(httpServer).times(noOfRecords, method(Method.POST),
                    uri(getUri(groupIdx)));
            });
    }

    private String getUri(int groupIdx) {
        return "/" + String.valueOf(250 + groupIdx);
    }

    private String getUrl(int groupIdx) {
        String uri = getUri(groupIdx);
        return String.format("http://localhost:%d%s", MOCK_HTTP_SERVER_PORT, uri);
    }

    @Test
    public void shouldProduceAndConsumeMessages_WithCallback() {
        int noOfRecords = 3;
        Topic topic = createTopic(true);

        List<ProducerRecord> records = IntStream.range(0, noOfRecords)
            .mapToObj(i -> newProducerRecordWithCallback(topic, "group_0",
                MockURI.URI_200,
                topic.id(),
                MockURI.URI_201,
                getMsgBody(payloadPrefix, i).getBytes()))
            .collect(Collectors.toList());
        produceRecords(records);

        //Thread.sleep(4 * 1000);

        //verify forward messages
        log.info("Verify forward messages at consuming end");
        verifyHttp(httpServer).times(noOfRecords,
            method(Method.POST), uri(URI_200.uri()), withPostBodyContaining(payloadPrefix));

        log.info("Verify callback messages at consuming end");
        verifyHttp(httpServer).times(noOfRecords,
            method(Method.POST), uri(URI_201.uri()));
    }

    @Test
    public void shouldProduceAndConsumeMessages_MultipleMessagesOfSameTopic_UnGrouped() throws InterruptedException {
        int noOfRecords = 5;
        Topic topic = createTopic(false);
        byte[] payload = "This is a sample message".getBytes();
        List<ProducerRecord> records = IntStream.range(0, noOfRecords)
            .mapToObj(i -> newProducerRecord(topic, "group_" + i, payload))
            .collect(Collectors.toList());
        produceRecords(records);

        Thread.sleep(2 * 1000);
        //Verify the message is consumed
        verifyHttp(httpServer).times(noOfRecords, method(Method.POST),
            uri(URI_200.uri()));
    }

    @Test
    public void shouldProduceAndConsumeMultipleMessages_GroupedAndUnGrouped() throws InterruptedException {
        int noOfRecords = 5;
        byte[] payload = "This is a sample message".getBytes();
        List<ProducerRecord> recordsGrouped = IntStream.range(0, noOfRecords)
            .mapToObj(i -> newProducerRecord(DummyEntities.groupedTopic, "group_0", payload))
            .collect(Collectors.toList());
        List<ProducerRecord> recordsUnGrouped = IntStream.range(0, noOfRecords)
            .mapToObj(i -> newProducerRecord(DummyEntities.unGroupedTopic, "group_" + i, payload))
            .collect(Collectors.toList());

        List<ProducerRecord> records = Lists.newArrayList(recordsGrouped);
        records.addAll(recordsUnGrouped);

        produceRecords(records);

        Thread.sleep(4 * 1000);
        //Verify the message is consumed
        verifyHttp(httpServer).times(noOfRecords * 2, method(Method.POST),
            uri(URI_200.uri()));
    }

    private void produceRecords(List<ProducerRecord> records) {
        VBClientConfig config = getVbClientConfig();

        try (Producer producer = new VBrokerProducer(config)) {
            List<CompletionStage<MessageMetadata>> resultStages = records.stream()
                .map(producer::produce)
                .collect(Collectors.toList());

            CompletableFuture[] completableFutures = new CompletableFuture[resultStages.size()];
            CompletableFuture<Void> allFuture = CompletableFuture.allOf(resultStages.toArray(completableFutures));

            CompletableFuture<Void> resultFuture = allFuture.thenAccept(aVoid -> resultStages.stream()
                .map(stage -> stage.toCompletableFuture().join())
                .forEach(messageMetadata -> {
                    log.info("Message with msg_id {} got produced to topic {} and partition {}",
                        messageMetadata.getMessageId(),
                        messageMetadata.getTopicId(),
                        messageMetadata.getPartitionId());
                }));

            resultFuture.join();
        }
    }

    private ProducerRecord newProducerRecord(Topic topic,
                                             String group,
                                             byte[] payload) {
        return newProducerRecord(topic, group, MockURI.URI_200, payload);
    }

    //without callbacks
    private ProducerRecord newProducerRecord(Topic topic,
                                             String group,
                                             MockURI mockURI,
                                             byte[] payload) {
        return newProducerRecordWithCallback(topic, group, mockURI, -1, mockURI, payload);
    }

    private ProducerRecord newProducerRecordWithCallback(Topic topic,
                                                         String group,
                                                         String httpUrl,
                                                         int callbackTopicId,
                                                         String callbackHttpUrl,
                                                         byte[] payload) {
        Message message = MessageStore.getRandomMsg(group);
        return ProducerRecord.builder()
            .groupId(message.groupId())
            .messageId(message.messageId())
            .crc((byte) 1)
            .version((byte) 1)
            .seqNo(1)
            .topicId(topic.id())
            .attributes(201)
            .httpUri(httpUrl)
            .httpMethod(ProducerRecord.HttpMethod.POST)
            .callbackTopicId(callbackTopicId)
            .callbackHttpUri(callbackHttpUrl)
            .callbackHttpMethod(ProducerRecord.HttpMethod.POST)
            .headers(new HashMap<>())
            .payload(payload)
            .build();
    }

    private ProducerRecord newProducerRecordWithCallback(Topic topic,
                                                         String group,
                                                         MockURI mockURI,
                                                         int callbackTopicId,
                                                         MockURI callbackMockURI,
                                                         byte[] payload) {
        return newProducerRecordWithCallback(topic, group, mockURI.url(), callbackTopicId, callbackMockURI.url(), payload);
    }

}