// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: responses.proto

package com.flipkart.vbroker.proto;

public interface SetSubscriptionOffsetsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.SetSubscriptionOffsetsResponse)
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
     * <code>repeated .proto.SetPartSubscriptionOffsetsResponse setPartSubscriptionOffsetsResponses = 2;</code>
     */
    java.util.List<com.flipkart.vbroker.proto.SetPartSubscriptionOffsetsResponse>
    getSetPartSubscriptionOffsetsResponsesList();

    /**
     * <code>repeated .proto.SetPartSubscriptionOffsetsResponse setPartSubscriptionOffsetsResponses = 2;</code>
     */
    com.flipkart.vbroker.proto.SetPartSubscriptionOffsetsResponse getSetPartSubscriptionOffsetsResponses(int index);

    /**
     * <code>repeated .proto.SetPartSubscriptionOffsetsResponse setPartSubscriptionOffsetsResponses = 2;</code>
     */
    int getSetPartSubscriptionOffsetsResponsesCount();

    /**
     * <code>repeated .proto.SetPartSubscriptionOffsetsResponse setPartSubscriptionOffsetsResponses = 2;</code>
     */
    java.util.List<? extends com.flipkart.vbroker.proto.SetPartSubscriptionOffsetsResponseOrBuilder>
    getSetPartSubscriptionOffsetsResponsesOrBuilderList();

    /**
     * <code>repeated .proto.SetPartSubscriptionOffsetsResponse setPartSubscriptionOffsetsResponses = 2;</code>
     */
    com.flipkart.vbroker.proto.SetPartSubscriptionOffsetsResponseOrBuilder getSetPartSubscriptionOffsetsResponsesOrBuilder(
        int index);
}
