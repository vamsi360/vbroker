package com.flipkart.vbroker.handlers;

import com.flipkart.vbroker.core.Topic;
import com.flipkart.vbroker.entities.*;
import com.flipkart.vbroker.services.TopicService;
import com.google.flatbuffers.FlatBufferBuilder;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class TopicCreateRequestHandler implements RequestHandler {

    private final TopicService topicService;

    @Override
    public VResponse handle(VRequest vRequest) {
        TopicCreateRequest topicCreateRequest = (TopicCreateRequest) vRequest.requestMessage(new TopicCreateRequest());
        Topic topic = Topic.TopicBuilder.aTopic().withGrouped(topicCreateRequest.grouped())
                .withId(topicCreateRequest.topicId()).withName(topicCreateRequest.topicName())
                .withNoOfPartitions(topicCreateRequest.partitions())
                .withReplicationFactor(topicCreateRequest.replicationFactor()).withTeam(topicCreateRequest.team())
                .withTopicCategory(com.flipkart.vbroker.core.Topic.TopicCategory
                        .valueOf(TopicCategory.name(topicCreateRequest.topicCategory())))
                .build();
        log.info("Creating topic with id {}, name {}", topic.getId(), topic.getName());
        topicService.createTopic(topic);

        FlatBufferBuilder topicResponseBuilder = new FlatBufferBuilder();
        int topicCreateResponse = TopicCreateResponse.createTopicCreateResponse(topicResponseBuilder, topic.getId(),
                (short) 200);
        int topicVResponse = VResponse.createVResponse(topicResponseBuilder, 1002, RequestMessage.TopicCreateRequest,
                topicCreateResponse);
        topicResponseBuilder.finish(topicVResponse);
        return VResponse.getRootAsVResponse(topicResponseBuilder.dataBuffer());

    }

}