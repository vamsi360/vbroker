// automatically generated by the FlatBuffers compiler, do not modify

package com.flipkart.vbroker.entities;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class GetSubscriptionsResponse extends Table {
    public static GetSubscriptionsResponse getRootAsGetSubscriptionsResponse(ByteBuffer _bb) {
        return getRootAsGetSubscriptionsResponse(_bb, new GetSubscriptionsResponse());
    }

    public static GetSubscriptionsResponse getRootAsGetSubscriptionsResponse(ByteBuffer _bb, GetSubscriptionsResponse obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb));
    }

    public static int createGetSubscriptionsResponse(FlatBufferBuilder builder,
                                                     int subscriptionsOffset) {
        builder.startObject(1);
        GetSubscriptionsResponse.addSubscriptions(builder, subscriptionsOffset);
        return GetSubscriptionsResponse.endGetSubscriptionsResponse(builder);
    }

    public static void startGetSubscriptionsResponse(FlatBufferBuilder builder) {
        builder.startObject(1);
    }

    public static void addSubscriptions(FlatBufferBuilder builder, int subscriptionsOffset) {
        builder.addOffset(0, subscriptionsOffset, 0);
    }

    public static int createSubscriptionsVector(FlatBufferBuilder builder, int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]);
        return builder.endVector();
    }

    public static void startSubscriptionsVector(FlatBufferBuilder builder, int numElems) {
        builder.startVector(4, numElems, 4);
    }

    public static int endGetSubscriptionsResponse(FlatBufferBuilder builder) {
        int o = builder.endObject();
        return o;
    }

    public void __init(int _i, ByteBuffer _bb) {
        bb_pos = _i;
        bb = _bb;
    }

    public GetSubscriptionsResponse __assign(int _i, ByteBuffer _bb) {
        __init(_i, _bb);
        return this;
    }

    public GetSubscriptionResponse subscriptions(int j) {
        return subscriptions(new GetSubscriptionResponse(), j);
    }

    public GetSubscriptionResponse subscriptions(GetSubscriptionResponse obj, int j) {
        int o = __offset(4);
        return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null;
    }

    public int subscriptionsLength() {
        int o = __offset(4);
        return o != 0 ? __vector_len(o) : 0;
    }
}
