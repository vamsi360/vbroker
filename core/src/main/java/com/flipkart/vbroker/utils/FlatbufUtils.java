package com.flipkart.vbroker.utils;

/**
 * Created by kaushal.hooda on 23/02/18.
 */

import com.flipkart.vbroker.flatbuf.*;
import com.flipkart.vbroker.proto.ProtoRequest;
import com.flipkart.vbroker.proto.ProtoResponse;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.protobuf.InvalidProtocolBufferException;

/**
 * Utility methods to generate flatbufs properly
 * build methods take a builder and build the object and return the offset.
 * create methods use their own builder and return the final created object itself, not the offset.
 */
public class FlatbufUtils {

//    public static int buildPartitionLag(FlatBufferBuilder builder, short partitionId, int lag, VStatus vStatus) {
//        int vStatusOffset = buildVStatus(builder, vStatus.statusCode(), vStatus.message());
//        return PartitionLag.createPartitionLag(builder, partitionId, lag, vStatusOffset);
//    }

//    public static PartitionLag createPartitionLag(short partitionId, int lag, VStatus vStatus) {
//        FlatBufferBuilder builder = new FlatBufferBuilder();
//        int partitionLagOffset = buildPartitionLag(builder, partitionId, lag, vStatus);
//        builder.finish(partitionLagOffset);
//        return PartitionLag.getRootAsPartitionLag(builder.dataBuffer());
//    }

//    public static int buildSubscriptionLag(FlatBufferBuilder builder, short topicId, short subscriptionId, List<PartitionLag> partitionLags) {
//        int[] partitionLagOffsets = partitionLags.stream()
//            .map(partitionLag ->
//                FlatbufUtils.buildPartitionLag(builder,
//                    partitionLag.partitionId(),
//                    partitionLag.lag(),
//                    partitionLag.status()))
//            .mapToInt(value -> value)
//            .toArray();
//
//        int partitionLagsVectorOffset = SubscriptionLag.createPartitionLagsVector(builder, partitionLagOffsets);
//        return SubscriptionLag.createSubscriptionLag(builder, subscriptionId, topicId, partitionLagsVectorOffset);
//    }
//
//    public static SubscriptionLag createSubscriptionLag(short topicId, short subscriptionId, List<PartitionLag> partitionLags) {
//        FlatBufferBuilder builder = new FlatBufferBuilder();
//        int subscriptionLagOffset = buildSubscriptionLag(builder, topicId, subscriptionId, partitionLags);
//        builder.finish(subscriptionLagOffset);
//        return SubscriptionLag.getRootAsSubscriptionLag(builder.dataBuffer());
//    }

    public static int buildVStatus(FlatBufferBuilder builder, short statusCode, String message) {
        return VStatus.createVStatus(builder, statusCode, builder.createString(message));
    }

    public static VStatus createVStatus(short statusCode, String message) {
        FlatBufferBuilder builder = new FlatBufferBuilder();
        int vStatusOffset = buildVStatus(builder, statusCode, message);
        builder.finish(vStatusOffset);
        return VStatus.getRootAsVStatus(builder.dataBuffer());
    }

    public static ProtoResponse getProtoResponse(VResponse response) {
        ControlResponse controlResponse = (ControlResponse) response.responseMessage(new ControlResponse());
        byte[] protoResponseBytes = ByteBufUtils.getBytes(controlResponse.payloadAsByteBuffer());
        try {
            return ProtoResponse.parseFrom(protoResponseBytes);
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);
        }
    }

    public static ProtoRequest getProtoRequest(VRequest vRequest) {
        try {
            ControlRequest controlRequest = (ControlRequest) vRequest.requestMessage(new ControlRequest());
            byte[] protoRequestBytes = ByteBufUtils.getBytes(controlRequest.payloadAsByteBuffer());
            return ProtoRequest.parseFrom(protoRequestBytes);
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);
        }
    }

    public static VRequest createVRequest(byte apiVersion, int correlationId, ProtoRequest protoRequest) {
        FlatBufferBuilder builder = new FlatBufferBuilder();
        int payloadOffset = builder.createByteVector(protoRequest.toByteArray());
        int controlRequestOffset = ControlRequest.createControlRequest(builder, payloadOffset);
        int vRequestOffset = VRequest.createVRequest(builder, apiVersion, correlationId, RequestMessage.ControlRequest, controlRequestOffset);
        builder.finish(vRequestOffset);
        return VRequest.getRootAsVRequest(builder.dataBuffer());
    }

    public static VResponse createVResponse(int correlationId, ProtoResponse protoResponse) {
        FlatBufferBuilder builder = new FlatBufferBuilder();
        ;
        int protoResponseOffset = builder.createByteVector(protoResponse.toByteArray());
        int controlResponseOffset = ControlResponse.createControlResponse(builder, protoResponseOffset);
        int vResponse = VResponse.createVResponse(builder, correlationId, ResponseMessage.ControlResponse, controlResponseOffset);
        builder.finish(vResponse);
        return VResponse.getRootAsVResponse(builder.dataBuffer());
    }


//    public static int buildTopicSubscription(FlatBufferBuilder builder, short topicId, short subscriptionId) {
//        return TopicSubscription.createTopicSubscription(builder, topicId, subscriptionId);
//    }
//
//    public static TopicSubscription createTopicSubscription(short topicId, short subscriptionId) {
//        FlatBufferBuilder builder = new FlatBufferBuilder();
//        int topicSubOffset = buildTopicSubscription(builder, topicId, subscriptionId);
//        builder.finish(topicSubOffset);
//        return TopicSubscription.getRootAsTopicSubscription(builder.dataBuffer());
//    }
//
//    public static int buildGetSubscriptionsRequest(FlatBufferBuilder builder, List<TopicSubscription> subscriptions) {
//        int[] subscriptionOffsets = subscriptions.stream()
//            .map(topicSub -> FlatbufUtils.buildTopicSubscription(builder, topicSub.topicId(), topicSub.subscriptionId()))
//            .mapToInt(value -> value)
//            .toArray();
//
//        int topicSubsVectorOffset = GetSubscriptionsRequest.createSubscriptionsVector(builder, subscriptionOffsets);
//        return GetSubscriptionsRequest.createGetSubscriptionsRequest(builder, topicSubsVectorOffset);
//    }
//
//    public static GetSubscriptionsRequest createGetSubscriptionsRequest(List<TopicSubscription> topicSubscriptions) {
//        FlatBufferBuilder builder = new FlatBufferBuilder();
//        int getSubscriptionsRequestOffset = buildGetSubscriptionsRequest(builder, topicSubscriptions);
//        builder.finish(getSubscriptionsRequestOffset);
//        return GetSubscriptionsRequest.getRootAsGetSubscriptionsRequest(builder.dataBuffer());
//    }

}