// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: responses.proto

package com.flipkart.vbroker.proto;

public interface SubscriptionLagOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.SubscriptionLag)
    com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 subscriptionId = 1;</code>
     */
    int getSubscriptionId();

    /**
     * <code>int32 topicId = 2;</code>
     */
    int getTopicId();

    /**
     * <code>repeated .proto.PartitionLag partitionLags = 3;</code>
     */
    java.util.List<com.flipkart.vbroker.proto.PartitionLag>
    getPartitionLagsList();

    /**
     * <code>repeated .proto.PartitionLag partitionLags = 3;</code>
     */
    com.flipkart.vbroker.proto.PartitionLag getPartitionLags(int index);

    /**
     * <code>repeated .proto.PartitionLag partitionLags = 3;</code>
     */
    int getPartitionLagsCount();

    /**
     * <code>repeated .proto.PartitionLag partitionLags = 3;</code>
     */
    java.util.List<? extends com.flipkart.vbroker.proto.PartitionLagOrBuilder>
    getPartitionLagsOrBuilderList();

    /**
     * <code>repeated .proto.PartitionLag partitionLags = 3;</code>
     */
    com.flipkart.vbroker.proto.PartitionLagOrBuilder getPartitionLagsOrBuilder(
        int index);
}
