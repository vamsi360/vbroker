// automatically generated by the FlatBuffers compiler, do not modify

package com.flipkart.vbroker.entities;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class VRequest extends Table {
    public static VRequest getRootAsVRequest(ByteBuffer _bb) {
        return getRootAsVRequest(_bb, new VRequest());
    }

    public static VRequest getRootAsVRequest(ByteBuffer _bb, VRequest obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb));
    }

    public static int createVRequest(FlatBufferBuilder builder,
                                     byte version,
                                     int correlationId,
                                     byte requestMessage_type,
                                     int requestMessageOffset) {
        builder.startObject(4);
        VRequest.addRequestMessage(builder, requestMessageOffset);
        VRequest.addCorrelationId(builder, correlationId);
        VRequest.addRequestMessageType(builder, requestMessage_type);
        VRequest.addVersion(builder, version);
        return VRequest.endVRequest(builder);
    }

    public static void startVRequest(FlatBufferBuilder builder) {
        builder.startObject(4);
    }

    public static void addVersion(FlatBufferBuilder builder, byte version) {
        builder.addByte(0, version, 0);
    }

    public static void addCorrelationId(FlatBufferBuilder builder, int correlationId) {
        builder.addInt(1, correlationId, 0);
    }

    public static void addRequestMessageType(FlatBufferBuilder builder, byte requestMessageType) {
        builder.addByte(2, requestMessageType, 0);
    }

    public static void addRequestMessage(FlatBufferBuilder builder, int requestMessageOffset) {
        builder.addOffset(3, requestMessageOffset, 0);
    }

    public static int endVRequest(FlatBufferBuilder builder) {
        int o = builder.endObject();
        return o;
    }

    public static void finishVRequestBuffer(FlatBufferBuilder builder, int offset) {
        builder.finish(offset);
    }

    public void __init(int _i, ByteBuffer _bb) {
        bb_pos = _i;
        bb = _bb;
    }

    public VRequest __assign(int _i, ByteBuffer _bb) {
        __init(_i, _bb);
        return this;
    }

    public byte version() {
        int o = __offset(4);
        return o != 0 ? bb.get(o + bb_pos) : 0;
    }

    public int correlationId() {
        int o = __offset(6);
        return o != 0 ? bb.getInt(o + bb_pos) : 0;
    }

    public byte requestMessageType() {
        int o = __offset(8);
        return o != 0 ? bb.get(o + bb_pos) : 0;
    }

    public Table requestMessage(Table obj) {
        int o = __offset(10);
        return o != 0 ? __union(obj, o) : null;
    }
}

