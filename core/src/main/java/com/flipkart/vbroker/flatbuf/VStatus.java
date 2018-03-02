// automatically generated by the FlatBuffers compiler, do not modify

package com.flipkart.vbroker.flatbuf;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class VStatus extends Table {
    public static VStatus getRootAsVStatus(ByteBuffer _bb) {
        return getRootAsVStatus(_bb, new VStatus());
    }

    public static VStatus getRootAsVStatus(ByteBuffer _bb, VStatus obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb));
    }

    public static int createVStatus(FlatBufferBuilder builder,
                                    int statusCode,
                                    int messageOffset) {
        builder.startObject(2);
        VStatus.addMessage(builder, messageOffset);
        VStatus.addStatusCode(builder, statusCode);
        return VStatus.endVStatus(builder);
    }

    public static void startVStatus(FlatBufferBuilder builder) {
        builder.startObject(2);
    }

    public static void addStatusCode(FlatBufferBuilder builder, int statusCode) {
        builder.addInt(0, statusCode, 0);
    }

    public static void addMessage(FlatBufferBuilder builder, int messageOffset) {
        builder.addOffset(1, messageOffset, 0);
    }

    public static int endVStatus(FlatBufferBuilder builder) {
        int o = builder.endObject();
        return o;
    }

    public void __init(int _i, ByteBuffer _bb) {
        bb_pos = _i;
        bb = _bb;
    }

    public VStatus __assign(int _i, ByteBuffer _bb) {
        __init(_i, _bb);
        return this;
    }

    public int statusCode() {
        int o = __offset(4);
        return o != 0 ? bb.getInt(o + bb_pos) : 0;
    }

    public String message() {
        int o = __offset(6);
        return o != 0 ? __string(o + bb_pos) : null;
    }

    public ByteBuffer messageAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }
}

