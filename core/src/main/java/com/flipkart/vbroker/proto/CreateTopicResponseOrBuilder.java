// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: responses.proto

package com.flipkart.vbroker.proto;

public interface CreateTopicResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.CreateTopicResponse)
    com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 2;</code>
     */
    java.lang.String getName();

    /**
     * <code>string name = 2;</code>
     */
    com.google.protobuf.ByteString
    getNameBytes();

    /**
     * <code>.proto.VStatus status = 3;</code>
     */
    boolean hasStatus();

    /**
     * <code>.proto.VStatus status = 3;</code>
     */
    com.flipkart.vbroker.proto.VStatus getStatus();

    /**
     * <code>.proto.VStatus status = 3;</code>
     */
    com.flipkart.vbroker.proto.VStatusOrBuilder getStatusOrBuilder();
}
