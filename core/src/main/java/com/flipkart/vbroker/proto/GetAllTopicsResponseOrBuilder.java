// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: responses.proto

package com.flipkart.vbroker.proto;

public interface GetAllTopicsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.GetAllTopicsResponse)
    com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .proto.VStatus status = 1;</code>
     */
    boolean hasStatus();

    /**
     * <code>optional .proto.VStatus status = 1;</code>
     */
    com.flipkart.vbroker.proto.VStatus getStatus();

    /**
     * <code>optional .proto.VStatus status = 1;</code>
     */
    com.flipkart.vbroker.proto.VStatusOrBuilder getStatusOrBuilder();

    /**
     * <code>repeated .proto.ProtoTopic topics = 2;</code>
     */
    java.util.List<com.flipkart.vbroker.proto.ProtoTopic>
    getTopicsList();

    /**
     * <code>repeated .proto.ProtoTopic topics = 2;</code>
     */
    com.flipkart.vbroker.proto.ProtoTopic getTopics(int index);

    /**
     * <code>repeated .proto.ProtoTopic topics = 2;</code>
     */
    int getTopicsCount();

    /**
     * <code>repeated .proto.ProtoTopic topics = 2;</code>
     */
    java.util.List<? extends com.flipkart.vbroker.proto.ProtoTopicOrBuilder>
    getTopicsOrBuilderList();

    /**
     * <code>repeated .proto.ProtoTopic topics = 2;</code>
     */
    com.flipkart.vbroker.proto.ProtoTopicOrBuilder getTopicsOrBuilder(
        int index);
}
