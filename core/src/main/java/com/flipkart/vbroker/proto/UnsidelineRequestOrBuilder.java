// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: requests.proto

package com.flipkart.vbroker.proto;

public interface UnsidelineRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.UnsidelineRequest)
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
     * <code>repeated string groupIds = 2;</code>
     */
    java.util.List<java.lang.String>
    getGroupIdsList();

    /**
     * <code>repeated string groupIds = 2;</code>
     */
    int getGroupIdsCount();

    /**
     * <code>repeated string groupIds = 2;</code>
     */
    java.lang.String getGroupIds(int index);

    /**
     * <code>repeated string groupIds = 2;</code>
     */
    com.google.protobuf.ByteString
    getGroupIdsBytes(int index);
}
