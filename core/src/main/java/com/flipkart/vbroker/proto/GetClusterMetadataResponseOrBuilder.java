// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: responses.proto

package com.flipkart.vbroker.proto;

public interface GetClusterMetadataResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.GetClusterMetadataResponse)
    com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.proto.ClusterMetadata clusterMetadata = 1;</code>
     */
    boolean hasClusterMetadata();

    /**
     * <code>.proto.ClusterMetadata clusterMetadata = 1;</code>
     */
    com.flipkart.vbroker.proto.ClusterMetadata getClusterMetadata();

    /**
     * <code>.proto.ClusterMetadata clusterMetadata = 1;</code>
     */
    com.flipkart.vbroker.proto.ClusterMetadataOrBuilder getClusterMetadataOrBuilder();

    /**
     * <code>.proto.VStatus status = 2;</code>
     */
    boolean hasStatus();

    /**
     * <code>.proto.VStatus status = 2;</code>
     */
    com.flipkart.vbroker.proto.VStatus getStatus();

    /**
     * <code>.proto.VStatus status = 2;</code>
     */
    com.flipkart.vbroker.proto.VStatusOrBuilder getStatusOrBuilder();
}
