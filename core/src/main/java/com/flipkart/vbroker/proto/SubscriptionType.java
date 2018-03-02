// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entities.proto

package com.flipkart.vbroker.proto;

/**
 * Protobuf enum {@code proto.SubscriptionType}
 */
public enum SubscriptionType
    implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>STATIC = 0;</code>
     */
    STATIC(0),
    /**
     * <code>DYNAMIC = 1;</code>
     */
    DYNAMIC(1),
    UNRECOGNIZED(-1),;

    /**
     * <code>STATIC = 0;</code>
     */
    public static final int STATIC_VALUE = 0;
    /**
     * <code>DYNAMIC = 1;</code>
     */
    public static final int DYNAMIC_VALUE = 1;
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SubscriptionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SubscriptionType>() {
            public SubscriptionType findValueByNumber(int number) {
                return SubscriptionType.forNumber(number);
            }
        };
    private static final SubscriptionType[] VALUES = values();
    private final int value;

    private SubscriptionType(int value) {
        this.value = value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SubscriptionType valueOf(int value) {
        return forNumber(value);
    }

    public static SubscriptionType forNumber(int value) {
        switch (value) {
            case 0:
                return STATIC;
            case 1:
                return DYNAMIC;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SubscriptionType>
    internalGetValueMap() {
        return internalValueMap;
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor
    getDescriptor() {
        return com.flipkart.vbroker.proto.PEntities.getDescriptor().getEnumTypes().get(2);
    }

    public static SubscriptionType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
                "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
            return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
    }

    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new java.lang.IllegalArgumentException(
                "Can't get the number of an unknown enum value.");
        }
        return value;
    }

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
    getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor
    getDescriptorForType() {
        return getDescriptor();
    }

    // @@protoc_insertion_point(enum_scope:proto.SubscriptionType)
}

