// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: requests.proto

package com.flipkart.vbroker.proto;

public interface GetPartSubscriptionOffsetsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.GetPartSubscriptionOffsetsRequest)
    com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 partitionId = 1;</code>
     */
    int getPartitionId();

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
