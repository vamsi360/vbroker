// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: responses.proto

package com.flipkart.vbroker.proto;

public interface GetTopicsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.GetTopicsResponse)
    com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .proto.GetTopicResponse topics = 1;</code>
     */
    java.util.List<com.flipkart.vbroker.proto.GetTopicResponse>
    getTopicsList();

    /**
     * <code>repeated .proto.GetTopicResponse topics = 1;</code>
     */
    com.flipkart.vbroker.proto.GetTopicResponse getTopics(int index);

    /**
     * <code>repeated .proto.GetTopicResponse topics = 1;</code>
     */
    int getTopicsCount();

    /**
     * <code>repeated .proto.GetTopicResponse topics = 1;</code>
     */
    java.util.List<? extends com.flipkart.vbroker.proto.GetTopicResponseOrBuilder>
    getTopicsOrBuilderList();

    /**
     * <code>repeated .proto.GetTopicResponse topics = 1;</code>
     */
    com.flipkart.vbroker.proto.GetTopicResponseOrBuilder getTopicsOrBuilder(
        int index);
}