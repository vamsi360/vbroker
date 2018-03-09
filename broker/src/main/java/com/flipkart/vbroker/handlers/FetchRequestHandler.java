package com.flipkart.vbroker.handlers;

import com.flipkart.vbroker.core.PartSubscription;
import com.flipkart.vbroker.core.TopicPartition;
import com.flipkart.vbroker.flatbuf.*;
import com.flipkart.vbroker.services.SubscriptionService;
import com.flipkart.vbroker.services.TopicService;
import com.flipkart.vbroker.subscribers.IterableMessage;
import com.flipkart.vbroker.subscribers.PartSubscriber;
import com.flipkart.vbroker.subscribers.QType;
import com.flipkart.vbroker.wrappers.Subscription;
import com.flipkart.vbroker.wrappers.Topic;
import com.google.common.collect.PeekingIterator;
import com.google.common.primitives.Ints;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.flatbuffers.FlatBufferBuilder;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static java.util.Objects.nonNull;
import static java.util.Objects.requireNonNull;

@Slf4j
@AllArgsConstructor
public class FetchRequestHandler implements RequestHandler {

    private final TopicService topicService;
    private final SubscriptionService subscriptionService;
    private final ListeningExecutorService listeningExecutorService;

    @Override
    public CompletionStage<VResponse> handle(VRequest vRequest) {
        FetchRequest fetchRequest = (FetchRequest) vRequest.requestMessage(new FetchRequest());
        assert nonNull(fetchRequest);

        return CompletableFuture.supplyAsync(() -> {
            FlatBufferBuilder builder = new FlatBufferBuilder();
            int fetchResponse = buildFetchResponse(fetchRequest, builder);
            int vResponse = VResponse.createVResponse(builder,
                1001,
                ResponseMessage.FetchResponse,
                fetchResponse);
            builder.finish(vResponse);

            return VResponse.getRootAsVResponse(builder.dataBuffer());
        });
    }

    private int buildFetchResponse(FetchRequest fetchRequest, FlatBufferBuilder builder) {
        int noOfTopics = fetchRequest.topicRequestsLength();
        int[] topicFetchResponses = new int[noOfTopics];

        for (int i = 0; i < noOfTopics; i++) {
            TopicFetchRequest topicFetchRequest = fetchRequest.topicRequests(i);

            Topic topic = topicService.getTopic(topicFetchRequest.topicId()).toCompletableFuture().join();
            Subscription subscription = subscriptionService.getSubscription(topicFetchRequest.topicId(), topicFetchRequest.subscriptionId()).toCompletableFuture().join();

            int noOfPartitionsInFetchReq = topicFetchRequest.partitionRequestsLength();
            log.info("Handling FetchRequest for topic {} and subscription {} with {} partition requests",
                topic.id(), subscription.id(), noOfPartitionsInFetchReq);
            int[] partitionFetchResponses = new int[noOfPartitionsInFetchReq];
            for (int j = 0; j < noOfPartitionsInFetchReq; j++) {
                TopicPartitionFetchRequest topicPartitionFetchRequest = topicFetchRequest.partitionRequests(j);
                int partitionId = topicPartitionFetchRequest.partitionId();

                TopicPartition topicPartition = topicService.getTopicPartition(topic, partitionId).toCompletableFuture().join();
                PartSubscription partSubscription = subscriptionService.getPartSubscription(subscription, topicPartition.getId()).toCompletableFuture().join();

                partitionFetchResponses[j] = buildTopicPartitionFetchResponse(
                    builder,
                    topic,
                    topicPartition,
                    partSubscription,
                    topicPartitionFetchRequest);
            }

            int partitionResponsesVector = TopicFetchResponse.createPartitionResponsesVector(builder, partitionFetchResponses);
            int topicFetchResponse = TopicFetchResponse.createTopicFetchResponse(
                builder,
                subscription.id(),
                topicFetchRequest.topicId(),
                partitionResponsesVector);
            topicFetchResponses[i] = topicFetchResponse;
        }

        int topicResponsesVector = FetchResponse.createTopicResponsesVector(builder, topicFetchResponses);
        return FetchResponse.createFetchResponse(builder, topicResponsesVector);
    }

    private int buildTopicPartitionFetchResponse(FlatBufferBuilder builder,
                                                 Topic topic,
                                                 TopicPartition topicPartition,
                                                 PartSubscription partSubscription,
                                                 TopicPartitionFetchRequest topicPartitionFetchRequest) {
        int noOfMessagesToFetch = topicPartitionFetchRequest.noOfMessages();
        int partitionId = topicPartitionFetchRequest.partitionId();
        log.info("Handling FetchRequest for {} messages for topic {} and partition {}",
            noOfMessagesToFetch, topic.id(), partitionId);

        int[] messages = buildMessages(builder, partSubscription, noOfMessagesToFetch);
        log.debug("Writing {} messages for topic {} and partition {} in FetchResponse",
            messages.length, topicPartition.getId(), partitionId);
        int messagesVector = MessageSet.createMessagesVector(builder, messages);
        int messageSet = MessageSet.createMessageSet(builder, messagesVector);
        int vStatus = VStatus.createVStatus(builder, StatusCode.ConsumeSuccess_NoError, builder.createString(""));

        return TopicPartitionFetchResponse.createTopicPartitionFetchResponse(
            builder,
            partitionId,
            vStatus,
            messageSet);
    }

    private int[] buildMessages(FlatBufferBuilder builder,
                                PartSubscription partSubscription,
                                int noOfMessagesToFetch) {
        PartSubscriber partSubscriber = subscriptionService.getPartSubscriber(partSubscription).toCompletableFuture().join();
        List<Integer> messages = new LinkedList<>();

        int i = 0;
        PeekingIterator<IterableMessage> iterator = partSubscriber.iterator(QType.MAIN);
        while (iterator.hasNext() && i < noOfMessagesToFetch) {
            Message message = iterator.peek().getMessage();
            messages.add(buildMessage(builder, message));
            iterator.next();
        }

        return Ints.toArray(messages);
    }

    private int buildMessage(FlatBufferBuilder builder, Message message) {
        int headersVector = Message.createHeadersVector(builder, new int[0]);

        ByteBuffer payloadByteBuffer = message.bodyPayloadAsByteBuffer();
        byte[] messageBytes = new byte[payloadByteBuffer.remaining()];
        payloadByteBuffer.get(messageBytes);

        return Message.createMessage(
            builder,
            builder.createString(requireNonNull(message.messageId())),
            builder.createString(requireNonNull(message.groupId())),
            message.crc(),
            message.version(),
            message.seqNo(),
            message.topicId(),
            message.partitionId(),
            201,
            builder.createString(requireNonNull(message.httpUri())),
            message.httpMethod(),
            message.callbackTopicId(),
            builder.createString(requireNonNull(message.callbackHttpUri())),
            message.callbackHttpMethod(),
            headersVector,
            messageBytes.length,
            builder.createByteVector(messageBytes));
    }
}
