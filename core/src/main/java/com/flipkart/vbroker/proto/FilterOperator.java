// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entities.proto

package com.flipkart.vbroker.proto;

/**
 * Protobuf enum {@code proto.FilterOperator}
 */
public enum FilterOperator
    implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>OR = 0;</code>
     */
    OR(0),
    /**
     * <code>NOR = 1;</code>
     */
    NOR(1),
    /**
     * <code>NAND = 2;</code>
     */
    NAND(2),
    UNRECOGNIZED(-1),;

    /**
     * <code>OR = 0;</code>
     */
    public static final int OR_VALUE = 0;
    /**
     * <code>NOR = 1;</code>
     */
    public static final int NOR_VALUE = 1;
    /**
     * <code>NAND = 2;</code>
     */
    public static final int NAND_VALUE = 2;
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FilterOperator> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FilterOperator>() {
            public FilterOperator findValueByNumber(int number) {
                return FilterOperator.forNumber(number);
            }
        };
    private static final FilterOperator[] VALUES = values();
    private final int value;

    private FilterOperator(int value) {
        this.value = value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FilterOperator valueOf(int value) {
        return forNumber(value);
    }

    public static FilterOperator forNumber(int value) {
        switch (value) {
            case 0:
                return OR;
            case 1:
                return NOR;
            case 2:
                return NAND;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FilterOperator>
    internalGetValueMap() {
        return internalValueMap;
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor
    getDescriptor() {
        return com.flipkart.vbroker.proto.PEntities.getDescriptor().getEnumTypes().get(4);
    }

    public static FilterOperator valueOf(
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

    // @@protoc_insertion_point(enum_scope:proto.FilterOperator)
}
