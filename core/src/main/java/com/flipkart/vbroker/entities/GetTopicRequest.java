// automatically generated by the FlatBuffers compiler, do not modify

package com.flipkart.vbroker.entities;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class GetTopicRequest extends Table {
    public static GetTopicRequest getRootAsGetTopicRequest(ByteBuffer _bb) {
        return getRootAsGetTopicRequest(_bb, new GetTopicRequest());
    }

    public static GetTopicRequest getRootAsGetTopicRequest(ByteBuffer _bb, GetTopicRequest obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb));
    }

    public static int createGetTopicRequest(FlatBufferBuilder builder,
                                            short topicId) {
        builder.startObject(1);
        GetTopicRequest.addTopicId(builder, topicId);
        return GetTopicRequest.endGetTopicRequest(builder);
    }

    public static void startGetTopicRequest(FlatBufferBuilder builder) {
        builder.startObject(1);
    }

    public static void addTopicId(FlatBufferBuilder builder, short topicId) {
        builder.addShort(0, topicId, 0);
    }

    public static int endGetTopicRequest(FlatBufferBuilder builder) {
        int o = builder.endObject();
        return o;
    }

    public void __init(int _i, ByteBuffer _bb) {
        bb_pos = _i;
        bb = _bb;
    }

    public GetTopicRequest __assign(int _i, ByteBuffer _bb) {
        __init(_i, _bb);
        return this;
    }

    public short topicId() {
        int o = __offset(4);
        return o != 0 ? bb.getShort(o + bb_pos) : 0;
    }
}

