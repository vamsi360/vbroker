// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: responses.proto

package com.flipkart.vbroker.proto;

public interface GetAllQueuesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.GetAllQueuesResponse)
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
     * <code>repeated .proto.ProtoQueue queues = 2;</code>
     */
    java.util.List<com.flipkart.vbroker.proto.ProtoQueue>
    getQueuesList();

    /**
     * <code>repeated .proto.ProtoQueue queues = 2;</code>
     */
    com.flipkart.vbroker.proto.ProtoQueue getQueues(int index);

    /**
     * <code>repeated .proto.ProtoQueue queues = 2;</code>
     */
    int getQueuesCount();

    /**
     * <code>repeated .proto.ProtoQueue queues = 2;</code>
     */
    java.util.List<? extends com.flipkart.vbroker.proto.ProtoQueueOrBuilder>
    getQueuesOrBuilderList();

    /**
     * <code>repeated .proto.ProtoQueue queues = 2;</code>
     */
    com.flipkart.vbroker.proto.ProtoQueueOrBuilder getQueuesOrBuilder(
        int index);
}
