// automatically generated by the FlatBuffers compiler, do not modify

package com.flipkart.vbroker.flatbuf;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class FetchRequest extends Table {
    public static FetchRequest getRootAsFetchRequest(ByteBuffer _bb) {
        return getRootAsFetchRequest(_bb, new FetchRequest());
    }

    public static FetchRequest getRootAsFetchRequest(ByteBuffer _bb, FetchRequest obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb));
    }

    public static int createFetchRequest(FlatBufferBuilder builder,
                                         int topicRequestsOffset) {
        builder.startObject(1);
        FetchRequest.addTopicRequests(builder, topicRequestsOffset);
        return FetchRequest.endFetchRequest(builder);
    }

    public static void startFetchRequest(FlatBufferBuilder builder) {
        builder.startObject(1);
    }

    public static void addTopicRequests(FlatBufferBuilder builder, int topicRequestsOffset) {
        builder.addOffset(0, topicRequestsOffset, 0);
    }

    public static int createTopicRequestsVector(FlatBufferBuilder builder, int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]);
        return builder.endVector();
    }

    public static void startTopicRequestsVector(FlatBufferBuilder builder, int numElems) {
        builder.startVector(4, numElems, 4);
    }

    public static int endFetchRequest(FlatBufferBuilder builder) {
        int o = builder.endObject();
        return o;
    }

    public void __init(int _i, ByteBuffer _bb) {
        bb_pos = _i;
        bb = _bb;
    }

    public FetchRequest __assign(int _i, ByteBuffer _bb) {
        __init(_i, _bb);
        return this;
    }

    public TopicFetchRequest topicRequests(int j) {
        return topicRequests(new TopicFetchRequest(), j);
    }

    public TopicFetchRequest topicRequests(TopicFetchRequest obj, int j) {
        int o = __offset(4);
        return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null;
    }

    public int topicRequestsLength() {
        int o = __offset(4);
        return o != 0 ? __vector_len(o) : 0;
    }
}

