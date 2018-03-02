// automatically generated by the FlatBuffers compiler, do not modify

package com.flipkart.vbroker.flatbuf;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class MessageSet extends Table {
    public static MessageSet getRootAsMessageSet(ByteBuffer _bb) {
        return getRootAsMessageSet(_bb, new MessageSet());
    }

    public static MessageSet getRootAsMessageSet(ByteBuffer _bb, MessageSet obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb));
    }

    public static int createMessageSet(FlatBufferBuilder builder,
                                       int messagesOffset) {
        builder.startObject(1);
        MessageSet.addMessages(builder, messagesOffset);
        return MessageSet.endMessageSet(builder);
    }

    public static void startMessageSet(FlatBufferBuilder builder) {
        builder.startObject(1);
    }

    public static void addMessages(FlatBufferBuilder builder, int messagesOffset) {
        builder.addOffset(0, messagesOffset, 0);
    }

    public static int createMessagesVector(FlatBufferBuilder builder, int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]);
        return builder.endVector();
    }

    public static void startMessagesVector(FlatBufferBuilder builder, int numElems) {
        builder.startVector(4, numElems, 4);
    }

    public static int endMessageSet(FlatBufferBuilder builder) {
        int o = builder.endObject();
        return o;
    }

    public void __init(int _i, ByteBuffer _bb) {
        bb_pos = _i;
        bb = _bb;
    }

    public MessageSet __assign(int _i, ByteBuffer _bb) {
        __init(_i, _bb);
        return this;
    }

    public Message messages(int j) {
        return messages(new Message(), j);
    }

    public Message messages(Message obj, int j) {
        int o = __offset(4);
        return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null;
    }

    public int messagesLength() {
        int o = __offset(4);
        return o != 0 ? __vector_len(o) : 0;
    }
}

