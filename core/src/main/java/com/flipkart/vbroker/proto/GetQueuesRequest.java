// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: requests.proto

package com.flipkart.vbroker.proto;

/**
 * <pre>
 * get queues request
 * </pre>
 * <p>
 * Protobuf type {@code proto.GetQueuesRequest}
 */
public final class GetQueuesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.GetQueuesRequest)
    GetQueuesRequestOrBuilder {
    public static final int IDS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0L;
    // @@protoc_insertion_point(class_scope:proto.GetQueuesRequest)
    private static final com.flipkart.vbroker.proto.GetQueuesRequest DEFAULT_INSTANCE;
    private static final com.google.protobuf.Parser<GetQueuesRequest>
        PARSER = new com.google.protobuf.AbstractParser<GetQueuesRequest>() {
        public GetQueuesRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return new GetQueuesRequest(input, extensionRegistry);
        }
    };

    static {
        DEFAULT_INSTANCE = new com.flipkart.vbroker.proto.GetQueuesRequest();
    }

    private java.util.List<java.lang.Integer> ids_;
    private int idsMemoizedSerializedSize = -1;
    private byte memoizedIsInitialized = -1;

    // Use GetQueuesRequest.newBuilder() to construct.
    private GetQueuesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private GetQueuesRequest() {
        ids_ = java.util.Collections.emptyList();
    }

    private GetQueuesRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        int mutable_bitField0_ = 0;
        try {
            boolean done = false;
            while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0:
                        done = true;
                        break;
                    default: {
                        if (!input.skipField(tag)) {
                            done = true;
                        }
                        break;
                    }
                    case 8: {
                        if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                            ids_ = new java.util.ArrayList<java.lang.Integer>();
                            mutable_bitField0_ |= 0x00000001;
                        }
                        ids_.add(input.readInt32());
                        break;
                    }
                    case 10: {
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
                            ids_ = new java.util.ArrayList<java.lang.Integer>();
                            mutable_bitField0_ |= 0x00000001;
                        }
                        while (input.getBytesUntilLimit() > 0) {
                            ids_.add(input.readInt32());
                        }
                        input.popLimit(limit);
                        break;
                    }
                }
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(
                e).setUnfinishedMessage(this);
        } finally {
            if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                ids_ = java.util.Collections.unmodifiableList(ids_);
            }
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return com.flipkart.vbroker.proto.PRequests.internal_static_proto_GetQueuesRequest_descriptor;
    }

    public static com.flipkart.vbroker.proto.GetQueuesRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.flipkart.vbroker.proto.GetQueuesRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetQueuesRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.flipkart.vbroker.proto.GetQueuesRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetQueuesRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.GetQueuesRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetQueuesRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.GetQueuesRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetQueuesRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.GetQueuesRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.flipkart.vbroker.proto.GetQueuesRequest prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public static com.flipkart.vbroker.proto.GetQueuesRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<GetQueuesRequest> parser() {
        return PARSER;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return com.flipkart.vbroker.proto.PRequests.internal_static_proto_GetQueuesRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.flipkart.vbroker.proto.GetQueuesRequest.class, com.flipkart.vbroker.proto.GetQueuesRequest.Builder.class);
    }

    /**
     * <code>repeated int32 ids = 1;</code>
     */
    public java.util.List<java.lang.Integer>
    getIdsList() {
        return ids_;
    }

    /**
     * <code>repeated int32 ids = 1;</code>
     */
    public int getIdsCount() {
        return ids_.size();
    }

    /**
     * <code>repeated int32 ids = 1;</code>
     */
    public int getIds(int index) {
        return ids_.get(index);
    }

    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
        throws java.io.IOException {
        getSerializedSize();
        if (getIdsList().size() > 0) {
            output.writeUInt32NoTag(10);
            output.writeUInt32NoTag(idsMemoizedSerializedSize);
        }
        for (int i = 0; i < ids_.size(); i++) {
            output.writeInt32NoTag(ids_.get(i));
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        {
            int dataSize = 0;
            for (int i = 0; i < ids_.size(); i++) {
                dataSize += com.google.protobuf.CodedOutputStream
                    .computeInt32SizeNoTag(ids_.get(i));
            }
            size += dataSize;
            if (!getIdsList().isEmpty()) {
                size += 1;
                size += com.google.protobuf.CodedOutputStream
                    .computeInt32SizeNoTag(dataSize);
            }
            idsMemoizedSerializedSize = dataSize;
        }
        memoizedSize = size;
        return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.flipkart.vbroker.proto.GetQueuesRequest)) {
            return super.equals(obj);
        }
        com.flipkart.vbroker.proto.GetQueuesRequest other = (com.flipkart.vbroker.proto.GetQueuesRequest) obj;

        boolean result = true;
        result = result && getIdsList()
            .equals(other.getIdsList());
        return result;
    }

    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptorForType().hashCode();
        if (getIdsCount() > 0) {
            hash = (37 * hash) + IDS_FIELD_NUMBER;
            hash = (53 * hash) + getIdsList().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetQueuesRequest> getParserForType() {
        return PARSER;
    }

    public com.flipkart.vbroker.proto.GetQueuesRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    /**
     * <pre>
     * get queues request
     * </pre>
     * <p>
     * Protobuf type {@code proto.GetQueuesRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.GetQueuesRequest)
        com.flipkart.vbroker.proto.GetQueuesRequestOrBuilder {
        private int bitField0_;
        private java.util.List<java.lang.Integer> ids_ = java.util.Collections.emptyList();

        // Construct using com.flipkart.vbroker.proto.GetQueuesRequest.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.flipkart.vbroker.proto.PRequests.internal_static_proto_GetQueuesRequest_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.flipkart.vbroker.proto.PRequests.internal_static_proto_GetQueuesRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    com.flipkart.vbroker.proto.GetQueuesRequest.class, com.flipkart.vbroker.proto.GetQueuesRequest.Builder.class);
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
            }
        }

        public Builder clear() {
            super.clear();
            ids_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000001);
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return com.flipkart.vbroker.proto.PRequests.internal_static_proto_GetQueuesRequest_descriptor;
        }

        public com.flipkart.vbroker.proto.GetQueuesRequest getDefaultInstanceForType() {
            return com.flipkart.vbroker.proto.GetQueuesRequest.getDefaultInstance();
        }

        public com.flipkart.vbroker.proto.GetQueuesRequest build() {
            com.flipkart.vbroker.proto.GetQueuesRequest result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public com.flipkart.vbroker.proto.GetQueuesRequest buildPartial() {
            com.flipkart.vbroker.proto.GetQueuesRequest result = new com.flipkart.vbroker.proto.GetQueuesRequest(this);
            int from_bitField0_ = bitField0_;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                ids_ = java.util.Collections.unmodifiableList(ids_);
                bitField0_ = (bitField0_ & ~0x00000001);
            }
            result.ids_ = ids_;
            onBuilt();
            return result;
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            Object value) {
            return (Builder) super.setField(field, value);
        }

        public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
            return (Builder) super.clearField(field);
        }

        public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return (Builder) super.clearOneof(oneof);
        }

        public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, Object value) {
            return (Builder) super.setRepeatedField(field, index, value);
        }

        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            Object value) {
            return (Builder) super.addRepeatedField(field, value);
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof com.flipkart.vbroker.proto.GetQueuesRequest) {
                return mergeFrom((com.flipkart.vbroker.proto.GetQueuesRequest) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(com.flipkart.vbroker.proto.GetQueuesRequest other) {
            if (other == com.flipkart.vbroker.proto.GetQueuesRequest.getDefaultInstance()) return this;
            if (!other.ids_.isEmpty()) {
                if (ids_.isEmpty()) {
                    ids_ = other.ids_;
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    ensureIdsIsMutable();
                    ids_.addAll(other.ids_);
                }
                onChanged();
            }
            onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
            com.flipkart.vbroker.proto.GetQueuesRequest parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (com.flipkart.vbroker.proto.GetQueuesRequest) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private void ensureIdsIsMutable() {
            if (!((bitField0_ & 0x00000001) == 0x00000001)) {
                ids_ = new java.util.ArrayList<java.lang.Integer>(ids_);
                bitField0_ |= 0x00000001;
            }
        }

        /**
         * <code>repeated int32 ids = 1;</code>
         */
        public java.util.List<java.lang.Integer>
        getIdsList() {
            return java.util.Collections.unmodifiableList(ids_);
        }

        /**
         * <code>repeated int32 ids = 1;</code>
         */
        public int getIdsCount() {
            return ids_.size();
        }

        /**
         * <code>repeated int32 ids = 1;</code>
         */
        public int getIds(int index) {
            return ids_.get(index);
        }

        /**
         * <code>repeated int32 ids = 1;</code>
         */
        public Builder setIds(
            int index, int value) {
            ensureIdsIsMutable();
            ids_.set(index, value);
            onChanged();
            return this;
        }

        /**
         * <code>repeated int32 ids = 1;</code>
         */
        public Builder addIds(int value) {
            ensureIdsIsMutable();
            ids_.add(value);
            onChanged();
            return this;
        }

        /**
         * <code>repeated int32 ids = 1;</code>
         */
        public Builder addAllIds(
            java.lang.Iterable<? extends java.lang.Integer> values) {
            ensureIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(
                values, ids_);
            onChanged();
            return this;
        }

        /**
         * <code>repeated int32 ids = 1;</code>
         */
        public Builder clearIds() {
            ids_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000001);
            onChanged();
            return this;
        }

        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }

        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }


        // @@protoc_insertion_point(builder_scope:proto.GetQueuesRequest)
    }

}

