// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entities.proto

package com.flipkart.vbroker.proto;

public interface ProtoQueueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.ProtoQueue)
    com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 id = 1;</code>
     */
    int getId();

    /**
     * <code>.proto.ProtoTopic topic = 2;</code>
     */
    boolean hasTopic();

    /**
     * <code>.proto.ProtoTopic topic = 2;</code>
     */
    com.flipkart.vbroker.proto.ProtoTopic getTopic();

    /**
     * <code>.proto.ProtoTopic topic = 2;</code>
     */
    com.flipkart.vbroker.proto.ProtoTopicOrBuilder getTopicOrBuilder();

    /**
     * <code>.proto.ProtoSubscription subscription = 3;</code>
     */
    boolean hasSubscription();

    /**
     * <code>.proto.ProtoSubscription subscription = 3;</code>
     */
    com.flipkart.vbroker.proto.ProtoSubscription getSubscription();

    /**
     * <code>.proto.ProtoSubscription subscription = 3;</code>
     */
    com.flipkart.vbroker.proto.ProtoSubscriptionOrBuilder getSubscriptionOrBuilder();
}