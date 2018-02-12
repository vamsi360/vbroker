// automatically generated by the FlatBuffers compiler, do not modify

package com.flipkart.vbroker.entities;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class TopicFetchRequest extends Table {
    public static TopicFetchRequest getRootAsTopicFetchRequest(ByteBuffer _bb) {
        return getRootAsTopicFetchRequest(_bb, new TopicFetchRequest());
    }

    public static TopicFetchRequest getRootAsTopicFetchRequest(ByteBuffer _bb, TopicFetchRequest obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb));
    }

    public static int createTopicFetchRequest(FlatBufferBuilder builder,
                                              short subscriptionId,
                                              short topicId,
                                              int partitionRequestsOffset) {
        builder.startObject(3);
        TopicFetchRequest.addPartitionRequests(builder, partitionRequestsOffset);
        TopicFetchRequest.addTopicId(builder, topicId);
        TopicFetchRequest.addSubscriptionId(builder, subscriptionId);
        return TopicFetchRequest.endTopicFetchRequest(builder);
    }

    public static void startTopicFetchRequest(FlatBufferBuilder builder) {
        builder.startObject(3);
    }

    public static void addSubscriptionId(FlatBufferBuilder builder, short subscriptionId) {
        builder.addShort(0, subscriptionId, 0);
    }

    public static void addTopicId(FlatBufferBuilder builder, short topicId) {
        builder.addShort(1, topicId, 0);
    }

    public static void addPartitionRequests(FlatBufferBuilder builder, int partitionRequestsOffset) {
        builder.addOffset(2, partitionRequestsOffset, 0);
    }

    public static int createPartitionRequestsVector(FlatBufferBuilder builder, int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]);
        return builder.endVector();
    }

    public static void startPartitionRequestsVector(FlatBufferBuilder builder, int numElems) {
        builder.startVector(4, numElems, 4);
    }

    public static int endTopicFetchRequest(FlatBufferBuilder builder) {
        int o = builder.endObject();
        return o;
    }

    public void __init(int _i, ByteBuffer _bb) {
        bb_pos = _i;
        bb = _bb;
    }

    public TopicFetchRequest __assign(int _i, ByteBuffer _bb) {
        __init(_i, _bb);
        return this;
    }

    public short subscriptionId() {
        int o = __offset(4);
        return o != 0 ? bb.getShort(o + bb_pos) : 0;
    }

    public short topicId() {
        int o = __offset(6);
        return o != 0 ? bb.getShort(o + bb_pos) : 0;
    }

    public TopicPartitionFetchRequest partitionRequests(int j) {
        return partitionRequests(new TopicPartitionFetchRequest(), j);
    }

    public TopicPartitionFetchRequest partitionRequests(TopicPartitionFetchRequest obj, int j) {
        int o = __offset(8);
        return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null;
    }

    public int partitionRequestsLength() {
        int o = __offset(8);
        return o != 0 ? __vector_len(o) : 0;
    }
}
