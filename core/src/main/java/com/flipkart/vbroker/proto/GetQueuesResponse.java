// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: responses.proto

package com.flipkart.vbroker.proto;

/**
 * Protobuf type {@code proto.GetQueuesResponse}
 */
public final class GetQueuesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.GetQueuesResponse)
    GetQueuesResponseOrBuilder {
    public static final int QUEUES_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0L;
    // @@protoc_insertion_point(class_scope:proto.GetQueuesResponse)
    private static final com.flipkart.vbroker.proto.GetQueuesResponse DEFAULT_INSTANCE;
    private static final com.google.protobuf.Parser<GetQueuesResponse>
        PARSER = new com.google.protobuf.AbstractParser<GetQueuesResponse>() {
        public GetQueuesResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return new GetQueuesResponse(input, extensionRegistry);
        }
    };

    static {
        DEFAULT_INSTANCE = new com.flipkart.vbroker.proto.GetQueuesResponse();
    }

    private java.util.List<com.flipkart.vbroker.proto.GetQueueResponse> queues_;
    private byte memoizedIsInitialized = -1;

    // Use GetQueuesResponse.newBuilder() to construct.
    private GetQueuesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }
    private GetQueuesResponse() {
        queues_ = java.util.Collections.emptyList();
    }

    private GetQueuesResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
        }
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
            com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0:
                        done = true;
                        break;
                    default: {
                        if (!parseUnknownFieldProto3(
                            input, unknownFields, extensionRegistry, tag)) {
                            done = true;
                        }
                        break;
                    }
                    case 10: {
                        if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                            queues_ = new java.util.ArrayList<com.flipkart.vbroker.proto.GetQueueResponse>();
                            mutable_bitField0_ |= 0x00000001;
                        }
                        queues_.add(
                            input.readMessage(com.flipkart.vbroker.proto.GetQueueResponse.parser(), extensionRegistry));
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
                queues_ = java.util.Collections.unmodifiableList(queues_);
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return com.flipkart.vbroker.proto.PResponses.internal_static_proto_GetQueuesResponse_descriptor;
    }

    public static com.flipkart.vbroker.proto.GetQueuesResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.flipkart.vbroker.proto.GetQueuesResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetQueuesResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.flipkart.vbroker.proto.GetQueuesResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetQueuesResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.flipkart.vbroker.proto.GetQueuesResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetQueuesResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.GetQueuesResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetQueuesResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.GetQueuesResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetQueuesResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.GetQueuesResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.flipkart.vbroker.proto.GetQueuesResponse prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public static com.flipkart.vbroker.proto.GetQueuesResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<GetQueuesResponse> parser() {
        return PARSER;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return com.flipkart.vbroker.proto.PResponses.internal_static_proto_GetQueuesResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.flipkart.vbroker.proto.GetQueuesResponse.class, com.flipkart.vbroker.proto.GetQueuesResponse.Builder.class);
    }

    /**
     * <code>repeated .proto.GetQueueResponse queues = 1;</code>
     */
    public java.util.List<com.flipkart.vbroker.proto.GetQueueResponse> getQueuesList() {
        return queues_;
    }

    /**
     * <code>repeated .proto.GetQueueResponse queues = 1;</code>
     */
    public java.util.List<? extends com.flipkart.vbroker.proto.GetQueueResponseOrBuilder>
    getQueuesOrBuilderList() {
        return queues_;
    }

    /**
     * <code>repeated .proto.GetQueueResponse queues = 1;</code>
     */
    public int getQueuesCount() {
        return queues_.size();
    }

    /**
     * <code>repeated .proto.GetQueueResponse queues = 1;</code>
     */
    public com.flipkart.vbroker.proto.GetQueueResponse getQueues(int index) {
        return queues_.get(index);
    }

    /**
     * <code>repeated .proto.GetQueueResponse queues = 1;</code>
     */
    public com.flipkart.vbroker.proto.GetQueueResponseOrBuilder getQueuesOrBuilder(
        int index) {
        return queues_.get(index);
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
        for (int i = 0; i < queues_.size(); i++) {
            output.writeMessage(1, queues_.get(i));
        }
        unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        for (int i = 0; i < queues_.size(); i++) {
            size += com.google.protobuf.CodedOutputStream
                .computeMessageSize(1, queues_.get(i));
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.flipkart.vbroker.proto.GetQueuesResponse)) {
            return super.equals(obj);
        }
        com.flipkart.vbroker.proto.GetQueuesResponse other = (com.flipkart.vbroker.proto.GetQueuesResponse) obj;

        boolean result = true;
        result = result && getQueuesList()
            .equals(other.getQueuesList());
        result = result && unknownFields.equals(other.unknownFields);
        return result;
    }

    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (getQueuesCount() > 0) {
            hash = (37 * hash) + QUEUES_FIELD_NUMBER;
            hash = (53 * hash) + getQueuesList().hashCode();
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
    public com.google.protobuf.Parser<GetQueuesResponse> getParserForType() {
        return PARSER;
    }

    public com.flipkart.vbroker.proto.GetQueuesResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    /**
     * Protobuf type {@code proto.GetQueuesResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.GetQueuesResponse)
        com.flipkart.vbroker.proto.GetQueuesResponseOrBuilder {
        private int bitField0_;
        private java.util.List<com.flipkart.vbroker.proto.GetQueueResponse> queues_ =
            java.util.Collections.emptyList();
        private com.google.protobuf.RepeatedFieldBuilderV3<
            com.flipkart.vbroker.proto.GetQueueResponse, com.flipkart.vbroker.proto.GetQueueResponse.Builder, com.flipkart.vbroker.proto.GetQueueResponseOrBuilder> queuesBuilder_;

        // Construct using com.flipkart.vbroker.proto.GetQueuesResponse.newBuilder()
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
            return com.flipkart.vbroker.proto.PResponses.internal_static_proto_GetQueuesResponse_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.flipkart.vbroker.proto.PResponses.internal_static_proto_GetQueuesResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    com.flipkart.vbroker.proto.GetQueuesResponse.class, com.flipkart.vbroker.proto.GetQueuesResponse.Builder.class);
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
                getQueuesFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            if (queuesBuilder_ == null) {
                queues_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000001);
            } else {
                queuesBuilder_.clear();
            }
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return com.flipkart.vbroker.proto.PResponses.internal_static_proto_GetQueuesResponse_descriptor;
        }

        public com.flipkart.vbroker.proto.GetQueuesResponse getDefaultInstanceForType() {
            return com.flipkart.vbroker.proto.GetQueuesResponse.getDefaultInstance();
        }

        public com.flipkart.vbroker.proto.GetQueuesResponse build() {
            com.flipkart.vbroker.proto.GetQueuesResponse result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public com.flipkart.vbroker.proto.GetQueuesResponse buildPartial() {
            com.flipkart.vbroker.proto.GetQueuesResponse result = new com.flipkart.vbroker.proto.GetQueuesResponse(this);
            int from_bitField0_ = bitField0_;
            if (queuesBuilder_ == null) {
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    queues_ = java.util.Collections.unmodifiableList(queues_);
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.queues_ = queues_;
            } else {
                result.queues_ = queuesBuilder_.build();
            }
            onBuilt();
            return result;
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
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
            int index, java.lang.Object value) {
            return (Builder) super.setRepeatedField(field, index, value);
        }

        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
            return (Builder) super.addRepeatedField(field, value);
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof com.flipkart.vbroker.proto.GetQueuesResponse) {
                return mergeFrom((com.flipkart.vbroker.proto.GetQueuesResponse) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(com.flipkart.vbroker.proto.GetQueuesResponse other) {
            if (other == com.flipkart.vbroker.proto.GetQueuesResponse.getDefaultInstance()) return this;
            if (queuesBuilder_ == null) {
                if (!other.queues_.isEmpty()) {
                    if (queues_.isEmpty()) {
                        queues_ = other.queues_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureQueuesIsMutable();
                        queues_.addAll(other.queues_);
                    }
                    onChanged();
                }
            } else {
                if (!other.queues_.isEmpty()) {
                    if (queuesBuilder_.isEmpty()) {
                        queuesBuilder_.dispose();
                        queuesBuilder_ = null;
                        queues_ = other.queues_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                        queuesBuilder_ =
                            com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                getQueuesFieldBuilder() : null;
                    } else {
                        queuesBuilder_.addAllMessages(other.queues_);
                    }
                }
            }
            this.mergeUnknownFields(other.unknownFields);
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
            com.flipkart.vbroker.proto.GetQueuesResponse parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (com.flipkart.vbroker.proto.GetQueuesResponse) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private void ensureQueuesIsMutable() {
            if (!((bitField0_ & 0x00000001) == 0x00000001)) {
                queues_ = new java.util.ArrayList<com.flipkart.vbroker.proto.GetQueueResponse>(queues_);
                bitField0_ |= 0x00000001;
            }
        }

        /**
         * <code>repeated .proto.GetQueueResponse queues = 1;</code>
         */
        public java.util.List<com.flipkart.vbroker.proto.GetQueueResponse> getQueuesList() {
            if (queuesBuilder_ == null) {
                return java.util.Collections.unmodifiableList(queues_);
            } else {
                return queuesBuilder_.getMessageList();
            }
        }

        /**
         * <code>repeated .proto.GetQueueResponse queues = 1;</code>
         */
        public int getQueuesCount() {
            if (queuesBuilder_ == null) {
                return queues_.size();
            } else {
                return queuesBuilder_.getCount();
            }
        }

        /**
         * <code>repeated .proto.GetQueueResponse queues = 1;</code>
         */
        public com.flipkart.vbroker.proto.GetQueueResponse getQueues(int index) {
            if (queuesBuilder_ == null) {
                return queues_.get(index);
            } else {
                return queuesBuilder_.getMessage(index);
            }
        }

        /**
         * <code>repeated .proto.GetQueueResponse queues = 1;</code>
         */
        public Builder setQueues(
            int index, com.flipkart.vbroker.proto.GetQueueResponse value) {
            if (queuesBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureQueuesIsMutable();
                queues_.set(index, value);
                onChanged();
            } else {
                queuesBuilder_.setMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .proto.GetQueueResponse queues = 1;</code>
         */
        public Builder setQueues(
            int index, com.flipkart.vbroker.proto.GetQueueResponse.Builder builderForValue) {
            if (queuesBuilder_ == null) {
                ensureQueuesIsMutable();
                queues_.set(index, builderForValue.build());
                onChanged();
            } else {
                queuesBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .proto.GetQueueResponse queues = 1;</code>
         */
        public Builder addQueues(com.flipkart.vbroker.proto.GetQueueResponse value) {
            if (queuesBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureQueuesIsMutable();
                queues_.add(value);
                onChanged();
            } else {
                queuesBuilder_.addMessage(value);
            }
            return this;
        }

        /**
         * <code>repeated .proto.GetQueueResponse queues = 1;</code>
         */
        public Builder addQueues(
            int index, com.flipkart.vbroker.proto.GetQueueResponse value) {
            if (queuesBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureQueuesIsMutable();
                queues_.add(index, value);
                onChanged();
            } else {
                queuesBuilder_.addMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .proto.GetQueueResponse queues = 1;</code>
         */
        public Builder addQueues(
            com.flipkart.vbroker.proto.GetQueueResponse.Builder builderForValue) {
            if (queuesBuilder_ == null) {
                ensureQueuesIsMutable();
                queues_.add(builderForValue.build());
                onChanged();
            } else {
                queuesBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .proto.GetQueueResponse queues = 1;</code>
         */
        public Builder addQueues(
            int index, com.flipkart.vbroker.proto.GetQueueResponse.Builder builderForValue) {
            if (queuesBuilder_ == null) {
                ensureQueuesIsMutable();
                queues_.add(index, builderForValue.build());
                onChanged();
            } else {
                queuesBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .proto.GetQueueResponse queues = 1;</code>
         */
        public Builder addAllQueues(
            java.lang.Iterable<? extends com.flipkart.vbroker.proto.GetQueueResponse> values) {
            if (queuesBuilder_ == null) {
                ensureQueuesIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(
                    values, queues_);
                onChanged();
            } else {
                queuesBuilder_.addAllMessages(values);
            }
            return this;
        }

        /**
         * <code>repeated .proto.GetQueueResponse queues = 1;</code>
         */
        public Builder clearQueues() {
            if (queuesBuilder_ == null) {
                queues_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
            } else {
                queuesBuilder_.clear();
            }
            return this;
        }

        /**
         * <code>repeated .proto.GetQueueResponse queues = 1;</code>
         */
        public Builder removeQueues(int index) {
            if (queuesBuilder_ == null) {
                ensureQueuesIsMutable();
                queues_.remove(index);
                onChanged();
            } else {
                queuesBuilder_.remove(index);
            }
            return this;
        }

        /**
         * <code>repeated .proto.GetQueueResponse queues = 1;</code>
         */
        public com.flipkart.vbroker.proto.GetQueueResponse.Builder getQueuesBuilder(
            int index) {
            return getQueuesFieldBuilder().getBuilder(index);
        }

        /**
         * <code>repeated .proto.GetQueueResponse queues = 1;</code>
         */
        public com.flipkart.vbroker.proto.GetQueueResponseOrBuilder getQueuesOrBuilder(
            int index) {
            if (queuesBuilder_ == null) {
                return queues_.get(index);
            } else {
                return queuesBuilder_.getMessageOrBuilder(index);
            }
        }

        /**
         * <code>repeated .proto.GetQueueResponse queues = 1;</code>
         */
        public java.util.List<? extends com.flipkart.vbroker.proto.GetQueueResponseOrBuilder>
        getQueuesOrBuilderList() {
            if (queuesBuilder_ != null) {
                return queuesBuilder_.getMessageOrBuilderList();
            } else {
                return java.util.Collections.unmodifiableList(queues_);
            }
        }

        /**
         * <code>repeated .proto.GetQueueResponse queues = 1;</code>
         */
        public com.flipkart.vbroker.proto.GetQueueResponse.Builder addQueuesBuilder() {
            return getQueuesFieldBuilder().addBuilder(
                com.flipkart.vbroker.proto.GetQueueResponse.getDefaultInstance());
        }

        /**
         * <code>repeated .proto.GetQueueResponse queues = 1;</code>
         */
        public com.flipkart.vbroker.proto.GetQueueResponse.Builder addQueuesBuilder(
            int index) {
            return getQueuesFieldBuilder().addBuilder(
                index, com.flipkart.vbroker.proto.GetQueueResponse.getDefaultInstance());
        }

        /**
         * <code>repeated .proto.GetQueueResponse queues = 1;</code>
         */
        public java.util.List<com.flipkart.vbroker.proto.GetQueueResponse.Builder>
        getQueuesBuilderList() {
            return getQueuesFieldBuilder().getBuilderList();
        }

        private com.google.protobuf.RepeatedFieldBuilderV3<
            com.flipkart.vbroker.proto.GetQueueResponse, com.flipkart.vbroker.proto.GetQueueResponse.Builder, com.flipkart.vbroker.proto.GetQueueResponseOrBuilder>
        getQueuesFieldBuilder() {
            if (queuesBuilder_ == null) {
                queuesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                    com.flipkart.vbroker.proto.GetQueueResponse, com.flipkart.vbroker.proto.GetQueueResponse.Builder, com.flipkart.vbroker.proto.GetQueueResponseOrBuilder>(
                    queues_,
                    ((bitField0_ & 0x00000001) == 0x00000001),
                    getParentForChildren(),
                    isClean());
                queues_ = null;
            }
            return queuesBuilder_;
        }

        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFieldsProto3(unknownFields);
        }

        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:proto.GetQueuesResponse)
    }

}

