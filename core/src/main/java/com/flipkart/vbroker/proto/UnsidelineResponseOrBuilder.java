// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: responses.proto

package com.flipkart.vbroker.proto;

public interface UnsidelineResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.UnsidelineResponse)
    com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.proto.TopicSubscription topicSubscription = 1;</code>
     */
    boolean hasTopicSubscription();

    /**
     * <code>.proto.TopicSubscription topicSubscription = 1;</code>
     */
    com.flipkart.vbroker.proto.TopicSubscription getTopicSubscription();

    /**
     * <code>.proto.TopicSubscription topicSubscription = 1;</code>
     */
    com.flipkart.vbroker.proto.TopicSubscriptionOrBuilder getTopicSubscriptionOrBuilder();

    /**
     * <code>repeated .proto.UnsidelineGroupResponse unsidelineGroupResponses = 2;</code>
     */
    java.util.List<com.flipkart.vbroker.proto.UnsidelineGroupResponse>
    getUnsidelineGroupResponsesList();

    /**
     * <code>repeated .proto.UnsidelineGroupResponse unsidelineGroupResponses = 2;</code>
     */
    com.flipkart.vbroker.proto.UnsidelineGroupResponse getUnsidelineGroupResponses(int index);

    /**
     * <code>repeated .proto.UnsidelineGroupResponse unsidelineGroupResponses = 2;</code>
     */
    int getUnsidelineGroupResponsesCount();

    /**
     * <code>repeated .proto.UnsidelineGroupResponse unsidelineGroupResponses = 2;</code>
     */
    java.util.List<? extends com.flipkart.vbroker.proto.UnsidelineGroupResponseOrBuilder>
    getUnsidelineGroupResponsesOrBuilderList();

    /**
     * <code>repeated .proto.UnsidelineGroupResponse unsidelineGroupResponses = 2;</code>
     */
    com.flipkart.vbroker.proto.UnsidelineGroupResponseOrBuilder getUnsidelineGroupResponsesOrBuilder(
        int index);
}
