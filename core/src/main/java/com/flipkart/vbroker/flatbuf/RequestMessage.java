// automatically generated by the FlatBuffers compiler, do not modify

package com.flipkart.vbroker.flatbuf;

public final class RequestMessage {
    public static final byte NONE = 0;
    public static final byte ProduceRequest = 1;
    public static final byte FetchRequest = 2;
    public static final byte ControlRequest = 3;
    public static final String[] names = {"NONE", "ProduceRequest", "FetchRequest", "ControlRequest",};

    private RequestMessage() {
    }

    public static String name(int e) {
        return names[e];
    }
}

