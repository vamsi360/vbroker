// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: requests.proto

package com.flipkart.vbroker.proto;

public interface ProtoRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.ProtoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.proto.CreateTopicsRequest createTopicsRequest = 1;</code>
   */
  boolean hasCreateTopicsRequest();
  /**
   * <code>.proto.CreateTopicsRequest createTopicsRequest = 1;</code>
   */
  com.flipkart.vbroker.proto.CreateTopicsRequest getCreateTopicsRequest();
  /**
   * <code>.proto.CreateTopicsRequest createTopicsRequest = 1;</code>
   */
  com.flipkart.vbroker.proto.CreateTopicsRequestOrBuilder getCreateTopicsRequestOrBuilder();

  /**
   * <code>.proto.CreateSubscriptionsRequest createSubscriptionsRequest = 2;</code>
   */
  boolean hasCreateSubscriptionsRequest();
  /**
   * <code>.proto.CreateSubscriptionsRequest createSubscriptionsRequest = 2;</code>
   */
  com.flipkart.vbroker.proto.CreateSubscriptionsRequest getCreateSubscriptionsRequest();
  /**
   * <code>.proto.CreateSubscriptionsRequest createSubscriptionsRequest = 2;</code>
   */
  com.flipkart.vbroker.proto.CreateSubscriptionsRequestOrBuilder getCreateSubscriptionsRequestOrBuilder();

  /**
   * <code>.proto.CreateQueuesRequest createQueuesRequest = 3;</code>
   */
  boolean hasCreateQueuesRequest();
  /**
   * <code>.proto.CreateQueuesRequest createQueuesRequest = 3;</code>
   */
  com.flipkart.vbroker.proto.CreateQueuesRequest getCreateQueuesRequest();
  /**
   * <code>.proto.CreateQueuesRequest createQueuesRequest = 3;</code>
   */
  com.flipkart.vbroker.proto.CreateQueuesRequestOrBuilder getCreateQueuesRequestOrBuilder();

  /**
   * <code>.proto.GetTopicsRequest getTopicsRequest = 4;</code>
   */
  boolean hasGetTopicsRequest();
  /**
   * <code>.proto.GetTopicsRequest getTopicsRequest = 4;</code>
   */
  com.flipkart.vbroker.proto.GetTopicsRequest getGetTopicsRequest();
  /**
   * <code>.proto.GetTopicsRequest getTopicsRequest = 4;</code>
   */
  com.flipkart.vbroker.proto.GetTopicsRequestOrBuilder getGetTopicsRequestOrBuilder();

  /**
   * <code>.proto.GetSubscriptionsRequest getSubscriptionsRequest = 5;</code>
   */
  boolean hasGetSubscriptionsRequest();
  /**
   * <code>.proto.GetSubscriptionsRequest getSubscriptionsRequest = 5;</code>
   */
  com.flipkart.vbroker.proto.GetSubscriptionsRequest getGetSubscriptionsRequest();
  /**
   * <code>.proto.GetSubscriptionsRequest getSubscriptionsRequest = 5;</code>
   */
  com.flipkart.vbroker.proto.GetSubscriptionsRequestOrBuilder getGetSubscriptionsRequestOrBuilder();

  /**
   * <code>.proto.GetQueuesRequest getQueuesRequest = 6;</code>
   */
  boolean hasGetQueuesRequest();
  /**
   * <code>.proto.GetQueuesRequest getQueuesRequest = 6;</code>
   */
  com.flipkart.vbroker.proto.GetQueuesRequest getGetQueuesRequest();
  /**
   * <code>.proto.GetQueuesRequest getQueuesRequest = 6;</code>
   */
  com.flipkart.vbroker.proto.GetQueuesRequestOrBuilder getGetQueuesRequestOrBuilder();

  /**
   * <code>.proto.GetSubscriptionLagsRequest getLagsRequest = 7;</code>
   */
  boolean hasGetLagsRequest();
  /**
   * <code>.proto.GetSubscriptionLagsRequest getLagsRequest = 7;</code>
   */
  com.flipkart.vbroker.proto.GetSubscriptionLagsRequest getGetLagsRequest();
  /**
   * <code>.proto.GetSubscriptionLagsRequest getLagsRequest = 7;</code>
   */
  com.flipkart.vbroker.proto.GetSubscriptionLagsRequestOrBuilder getGetLagsRequestOrBuilder();

  public com.flipkart.vbroker.proto.ProtoRequest.ProtoRequestCase getProtoRequestCase();
}
