// automatically generated by the FlatBuffers compiler, do not modify

package com.flipkart.vbroker.entities;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class CreateSubscriptionResponse extends Table {
    public static CreateSubscriptionResponse getRootAsCreateSubscriptionResponse(ByteBuffer _bb) {
        return getRootAsCreateSubscriptionResponse(_bb, new CreateSubscriptionResponse());
    }

    public static CreateSubscriptionResponse getRootAsCreateSubscriptionResponse(ByteBuffer _bb, CreateSubscriptionResponse obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb));
    }

    public static int createCreateSubscriptionResponse(FlatBufferBuilder builder,
                                                       short id,
                                                       short topicId,
                                                       int nameOffset,
                                                       int statusOffset) {
        builder.startObject(4);
        CreateSubscriptionResponse.addStatus(builder, statusOffset);
        CreateSubscriptionResponse.addName(builder, nameOffset);
        CreateSubscriptionResponse.addTopicId(builder, topicId);
        CreateSubscriptionResponse.addId(builder, id);
        return CreateSubscriptionResponse.endCreateSubscriptionResponse(builder);
    }

    public static void startCreateSubscriptionResponse(FlatBufferBuilder builder) {
        builder.startObject(4);
    }

    public static void addId(FlatBufferBuilder builder, short id) {
        builder.addShort(0, id, 0);
    }

    public static void addTopicId(FlatBufferBuilder builder, short topicId) {
        builder.addShort(1, topicId, 0);
    }

    public static void addName(FlatBufferBuilder builder, int nameOffset) {
        builder.addOffset(2, nameOffset, 0);
    }

    public static void addStatus(FlatBufferBuilder builder, int statusOffset) {
        builder.addOffset(3, statusOffset, 0);
    }

    public static int endCreateSubscriptionResponse(FlatBufferBuilder builder) {
        int o = builder.endObject();
        return o;
    }

    public void __init(int _i, ByteBuffer _bb) {
        bb_pos = _i;
        bb = _bb;
    }

    public CreateSubscriptionResponse __assign(int _i, ByteBuffer _bb) {
        __init(_i, _bb);
        return this;
    }

    public short id() {
        int o = __offset(4);
        return o != 0 ? bb.getShort(o + bb_pos) : 0;
    }

    public short topicId() {
        int o = __offset(6);
        return o != 0 ? bb.getShort(o + bb_pos) : 0;
    }

    public String name() {
        int o = __offset(8);
        return o != 0 ? __string(o + bb_pos) : null;
    }

    public ByteBuffer nameAsByteBuffer() {
        return __vector_as_bytebuffer(8, 1);
    }

    public VStatus status() {
        return status(new VStatus());
    }

    public VStatus status(VStatus obj) {
        int o = __offset(10);
        return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null;
    }
}

