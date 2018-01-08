// automatically generated by the FlatBuffers compiler, do not modify

package com.flipkart.vbroker.entities;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class ProduceRequest extends Table {
    public static ProduceRequest getRootAsProduceRequest(ByteBuffer _bb) {
        return getRootAsProduceRequest(_bb, new ProduceRequest());
    }

    public static ProduceRequest getRootAsProduceRequest(ByteBuffer _bb, ProduceRequest obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb));
    }

    public static int createProduceRequest(FlatBufferBuilder builder,
                                           byte topicId,
                                           byte partitionId,
                                           short requiredAcks,
                                           int messageSetOffset) {
        builder.startObject(4);
        ProduceRequest.addMessageSet(builder, messageSetOffset);
        ProduceRequest.addRequiredAcks(builder, requiredAcks);
        ProduceRequest.addPartitionId(builder, partitionId);
        ProduceRequest.addTopicId(builder, topicId);
        return ProduceRequest.endProduceRequest(builder);
    }

    public static void startProduceRequest(FlatBufferBuilder builder) {
        builder.startObject(4);
    }

    public static void addTopicId(FlatBufferBuilder builder, byte topicId) {
        builder.addByte(0, topicId, 0);
    }

    public static void addPartitionId(FlatBufferBuilder builder, byte partitionId) {
        builder.addByte(1, partitionId, 0);
    }

    public static void addRequiredAcks(FlatBufferBuilder builder, short requiredAcks) {
        builder.addShort(2, requiredAcks, 0);
    }

    public static void addMessageSet(FlatBufferBuilder builder, int messageSetOffset) {
        builder.addOffset(3, messageSetOffset, 0);
    }

    public static int endProduceRequest(FlatBufferBuilder builder) {
        int o = builder.endObject();
        return o;
    }

    public void __init(int _i, ByteBuffer _bb) {
        bb_pos = _i;
        bb = _bb;
    }

    public ProduceRequest __assign(int _i, ByteBuffer _bb) {
        __init(_i, _bb);
        return this;
    }

    public byte topicId() {
        int o = __offset(4);
        return o != 0 ? bb.get(o + bb_pos) : 0;
    }

    public byte partitionId() {
        int o = __offset(6);
        return o != 0 ? bb.get(o + bb_pos) : 0;
    }

    public short requiredAcks() {
        int o = __offset(8);
        return o != 0 ? bb.getShort(o + bb_pos) : 0;
    }

    public MessageSet messageSet() {
        return messageSet(new MessageSet());
    }

    public MessageSet messageSet(MessageSet obj) {
        int o = __offset(10);
        return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null;
    }
}

