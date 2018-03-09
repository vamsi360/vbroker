// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: responses.proto

package com.flipkart.vbroker.proto;

/**
 * Protobuf type {@code proto.GetAllTopicsResponse}
 */
public final class GetAllTopicsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.GetAllTopicsResponse)
    GetAllTopicsResponseOrBuilder {
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int TOPICS_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0L;
    // @@protoc_insertion_point(class_scope:proto.GetAllTopicsResponse)
    private static final com.flipkart.vbroker.proto.GetAllTopicsResponse DEFAULT_INSTANCE;
    private static final com.google.protobuf.Parser<GetAllTopicsResponse>
        PARSER = new com.google.protobuf.AbstractParser<GetAllTopicsResponse>() {
        public GetAllTopicsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return new GetAllTopicsResponse(input, extensionRegistry);
        }
    };

    static {
        DEFAULT_INSTANCE = new com.flipkart.vbroker.proto.GetAllTopicsResponse();
    }

    private int bitField0_;
    private com.flipkart.vbroker.proto.VStatus status_;
    private java.util.List<com.flipkart.vbroker.proto.ProtoTopic> topics_;
    private byte memoizedIsInitialized = -1;

    // Use GetAllTopicsResponse.newBuilder() to construct.
    private GetAllTopicsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private GetAllTopicsResponse() {
        topics_ = java.util.Collections.emptyList();
    }

    private GetAllTopicsResponse(
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
                        com.flipkart.vbroker.proto.VStatus.Builder subBuilder = null;
                        if (status_ != null) {
                            subBuilder = status_.toBuilder();
                        }
                        status_ = input.readMessage(com.flipkart.vbroker.proto.VStatus.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(status_);
                            status_ = subBuilder.buildPartial();
                        }

                        break;
                    }
                    case 18: {
                        if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                            topics_ = new java.util.ArrayList<com.flipkart.vbroker.proto.ProtoTopic>();
                            mutable_bitField0_ |= 0x00000002;
                        }
                        topics_.add(
                            input.readMessage(com.flipkart.vbroker.proto.ProtoTopic.parser(), extensionRegistry));
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
            if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                topics_ = java.util.Collections.unmodifiableList(topics_);
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return com.flipkart.vbroker.proto.PResponses.internal_static_proto_GetAllTopicsResponse_descriptor;
    }

    public static com.flipkart.vbroker.proto.GetAllTopicsResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.flipkart.vbroker.proto.GetAllTopicsResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetAllTopicsResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.flipkart.vbroker.proto.GetAllTopicsResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetAllTopicsResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.flipkart.vbroker.proto.GetAllTopicsResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetAllTopicsResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.GetAllTopicsResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetAllTopicsResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.GetAllTopicsResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetAllTopicsResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.GetAllTopicsResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.flipkart.vbroker.proto.GetAllTopicsResponse prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public static com.flipkart.vbroker.proto.GetAllTopicsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<GetAllTopicsResponse> parser() {
        return PARSER;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return com.flipkart.vbroker.proto.PResponses.internal_static_proto_GetAllTopicsResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.flipkart.vbroker.proto.GetAllTopicsResponse.class, com.flipkart.vbroker.proto.GetAllTopicsResponse.Builder.class);
    }

    /**
     * <code>.proto.VStatus status = 1;</code>
     */
    public boolean hasStatus() {
        return status_ != null;
    }

    /**
     * <code>.proto.VStatus status = 1;</code>
     */
    public com.flipkart.vbroker.proto.VStatus getStatus() {
        return status_ == null ? com.flipkart.vbroker.proto.VStatus.getDefaultInstance() : status_;
    }

    /**
     * <code>.proto.VStatus status = 1;</code>
     */
    public com.flipkart.vbroker.proto.VStatusOrBuilder getStatusOrBuilder() {
        return getStatus();
    }

    /**
     * <code>repeated .proto.ProtoTopic topics = 2;</code>
     */
    public java.util.List<com.flipkart.vbroker.proto.ProtoTopic> getTopicsList() {
        return topics_;
    }

    /**
     * <code>repeated .proto.ProtoTopic topics = 2;</code>
     */
    public java.util.List<? extends com.flipkart.vbroker.proto.ProtoTopicOrBuilder>
    getTopicsOrBuilderList() {
        return topics_;
    }

    /**
     * <code>repeated .proto.ProtoTopic topics = 2;</code>
     */
    public int getTopicsCount() {
        return topics_.size();
    }

    /**
     * <code>repeated .proto.ProtoTopic topics = 2;</code>
     */
    public com.flipkart.vbroker.proto.ProtoTopic getTopics(int index) {
        return topics_.get(index);
    }

    /**
     * <code>repeated .proto.ProtoTopic topics = 2;</code>
     */
    public com.flipkart.vbroker.proto.ProtoTopicOrBuilder getTopicsOrBuilder(
        int index) {
        return topics_.get(index);
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
        if (status_ != null) {
            output.writeMessage(1, getStatus());
        }
        for (int i = 0; i < topics_.size(); i++) {
            output.writeMessage(2, topics_.get(i));
        }
        unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (status_ != null) {
            size += com.google.protobuf.CodedOutputStream
                .computeMessageSize(1, getStatus());
        }
        for (int i = 0; i < topics_.size(); i++) {
            size += com.google.protobuf.CodedOutputStream
                .computeMessageSize(2, topics_.get(i));
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
        if (!(obj instanceof com.flipkart.vbroker.proto.GetAllTopicsResponse)) {
            return super.equals(obj);
        }
        com.flipkart.vbroker.proto.GetAllTopicsResponse other = (com.flipkart.vbroker.proto.GetAllTopicsResponse) obj;

        boolean result = true;
        result = result && (hasStatus() == other.hasStatus());
        if (hasStatus()) {
            result = result && getStatus()
                .equals(other.getStatus());
        }
        result = result && getTopicsList()
            .equals(other.getTopicsList());
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
        if (hasStatus()) {
            hash = (37 * hash) + STATUS_FIELD_NUMBER;
            hash = (53 * hash) + getStatus().hashCode();
        }
        if (getTopicsCount() > 0) {
            hash = (37 * hash) + TOPICS_FIELD_NUMBER;
            hash = (53 * hash) + getTopicsList().hashCode();
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
    public com.google.protobuf.Parser<GetAllTopicsResponse> getParserForType() {
        return PARSER;
    }

    public com.flipkart.vbroker.proto.GetAllTopicsResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    /**
     * Protobuf type {@code proto.GetAllTopicsResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.GetAllTopicsResponse)
        com.flipkart.vbroker.proto.GetAllTopicsResponseOrBuilder {
        private int bitField0_;
        private com.flipkart.vbroker.proto.VStatus status_ = null;
        private com.google.protobuf.SingleFieldBuilderV3<
            com.flipkart.vbroker.proto.VStatus, com.flipkart.vbroker.proto.VStatus.Builder, com.flipkart.vbroker.proto.VStatusOrBuilder> statusBuilder_;
        private java.util.List<com.flipkart.vbroker.proto.ProtoTopic> topics_ =
            java.util.Collections.emptyList();
        private com.google.protobuf.RepeatedFieldBuilderV3<
            com.flipkart.vbroker.proto.ProtoTopic, com.flipkart.vbroker.proto.ProtoTopic.Builder, com.flipkart.vbroker.proto.ProtoTopicOrBuilder> topicsBuilder_;

        // Construct using com.flipkart.vbroker.proto.GetAllTopicsResponse.newBuilder()
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
            return com.flipkart.vbroker.proto.PResponses.internal_static_proto_GetAllTopicsResponse_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.flipkart.vbroker.proto.PResponses.internal_static_proto_GetAllTopicsResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    com.flipkart.vbroker.proto.GetAllTopicsResponse.class, com.flipkart.vbroker.proto.GetAllTopicsResponse.Builder.class);
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
                getTopicsFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            if (statusBuilder_ == null) {
                status_ = null;
            } else {
                status_ = null;
                statusBuilder_ = null;
            }
            if (topicsBuilder_ == null) {
                topics_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000002);
            } else {
                topicsBuilder_.clear();
            }
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return com.flipkart.vbroker.proto.PResponses.internal_static_proto_GetAllTopicsResponse_descriptor;
        }

        public com.flipkart.vbroker.proto.GetAllTopicsResponse getDefaultInstanceForType() {
            return com.flipkart.vbroker.proto.GetAllTopicsResponse.getDefaultInstance();
        }

        public com.flipkart.vbroker.proto.GetAllTopicsResponse build() {
            com.flipkart.vbroker.proto.GetAllTopicsResponse result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public com.flipkart.vbroker.proto.GetAllTopicsResponse buildPartial() {
            com.flipkart.vbroker.proto.GetAllTopicsResponse result = new com.flipkart.vbroker.proto.GetAllTopicsResponse(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (statusBuilder_ == null) {
                result.status_ = status_;
            } else {
                result.status_ = statusBuilder_.build();
            }
            if (topicsBuilder_ == null) {
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    topics_ = java.util.Collections.unmodifiableList(topics_);
                    bitField0_ = (bitField0_ & ~0x00000002);
                }
                result.topics_ = topics_;
            } else {
                result.topics_ = topicsBuilder_.build();
            }
            result.bitField0_ = to_bitField0_;
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
            if (other instanceof com.flipkart.vbroker.proto.GetAllTopicsResponse) {
                return mergeFrom((com.flipkart.vbroker.proto.GetAllTopicsResponse) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(com.flipkart.vbroker.proto.GetAllTopicsResponse other) {
            if (other == com.flipkart.vbroker.proto.GetAllTopicsResponse.getDefaultInstance()) return this;
            if (other.hasStatus()) {
                mergeStatus(other.getStatus());
            }
            if (topicsBuilder_ == null) {
                if (!other.topics_.isEmpty()) {
                    if (topics_.isEmpty()) {
                        topics_ = other.topics_;
                        bitField0_ = (bitField0_ & ~0x00000002);
                    } else {
                        ensureTopicsIsMutable();
                        topics_.addAll(other.topics_);
                    }
                    onChanged();
                }
            } else {
                if (!other.topics_.isEmpty()) {
                    if (topicsBuilder_.isEmpty()) {
                        topicsBuilder_.dispose();
                        topicsBuilder_ = null;
                        topics_ = other.topics_;
                        bitField0_ = (bitField0_ & ~0x00000002);
                        topicsBuilder_ =
                            com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                getTopicsFieldBuilder() : null;
                    } else {
                        topicsBuilder_.addAllMessages(other.topics_);
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
            com.flipkart.vbroker.proto.GetAllTopicsResponse parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (com.flipkart.vbroker.proto.GetAllTopicsResponse) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        /**
         * <code>.proto.VStatus status = 1;</code>
         */
        public boolean hasStatus() {
            return statusBuilder_ != null || status_ != null;
        }

        /**
         * <code>.proto.VStatus status = 1;</code>
         */
        public com.flipkart.vbroker.proto.VStatus getStatus() {
            if (statusBuilder_ == null) {
                return status_ == null ? com.flipkart.vbroker.proto.VStatus.getDefaultInstance() : status_;
            } else {
                return statusBuilder_.getMessage();
            }
        }

        /**
         * <code>.proto.VStatus status = 1;</code>
         */
        public Builder setStatus(
            com.flipkart.vbroker.proto.VStatus.Builder builderForValue) {
            if (statusBuilder_ == null) {
                status_ = builderForValue.build();
                onChanged();
            } else {
                statusBuilder_.setMessage(builderForValue.build());
            }

            return this;
        }

        /**
         * <code>.proto.VStatus status = 1;</code>
         */
        public Builder setStatus(com.flipkart.vbroker.proto.VStatus value) {
            if (statusBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                status_ = value;
                onChanged();
            } else {
                statusBuilder_.setMessage(value);
            }

            return this;
        }

        /**
         * <code>.proto.VStatus status = 1;</code>
         */
        public Builder mergeStatus(com.flipkart.vbroker.proto.VStatus value) {
            if (statusBuilder_ == null) {
                if (status_ != null) {
                    status_ =
                        com.flipkart.vbroker.proto.VStatus.newBuilder(status_).mergeFrom(value).buildPartial();
                } else {
                    status_ = value;
                }
                onChanged();
            } else {
                statusBuilder_.mergeFrom(value);
            }

            return this;
        }

        /**
         * <code>.proto.VStatus status = 1;</code>
         */
        public Builder clearStatus() {
            if (statusBuilder_ == null) {
                status_ = null;
                onChanged();
            } else {
                status_ = null;
                statusBuilder_ = null;
            }

            return this;
        }

        /**
         * <code>.proto.VStatus status = 1;</code>
         */
        public com.flipkart.vbroker.proto.VStatus.Builder getStatusBuilder() {

            onChanged();
            return getStatusFieldBuilder().getBuilder();
        }

        /**
         * <code>.proto.VStatus status = 1;</code>
         */
        public com.flipkart.vbroker.proto.VStatusOrBuilder getStatusOrBuilder() {
            if (statusBuilder_ != null) {
                return statusBuilder_.getMessageOrBuilder();
            } else {
                return status_ == null ?
                    com.flipkart.vbroker.proto.VStatus.getDefaultInstance() : status_;
            }
        }

        /**
         * <code>.proto.VStatus status = 1;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
            com.flipkart.vbroker.proto.VStatus, com.flipkart.vbroker.proto.VStatus.Builder, com.flipkart.vbroker.proto.VStatusOrBuilder>
        getStatusFieldBuilder() {
            if (statusBuilder_ == null) {
                statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                    com.flipkart.vbroker.proto.VStatus, com.flipkart.vbroker.proto.VStatus.Builder, com.flipkart.vbroker.proto.VStatusOrBuilder>(
                    getStatus(),
                    getParentForChildren(),
                    isClean());
                status_ = null;
            }
            return statusBuilder_;
        }

        private void ensureTopicsIsMutable() {
            if (!((bitField0_ & 0x00000002) == 0x00000002)) {
                topics_ = new java.util.ArrayList<com.flipkart.vbroker.proto.ProtoTopic>(topics_);
                bitField0_ |= 0x00000002;
            }
        }

        /**
         * <code>repeated .proto.ProtoTopic topics = 2;</code>
         */
        public java.util.List<com.flipkart.vbroker.proto.ProtoTopic> getTopicsList() {
            if (topicsBuilder_ == null) {
                return java.util.Collections.unmodifiableList(topics_);
            } else {
                return topicsBuilder_.getMessageList();
            }
        }

        /**
         * <code>repeated .proto.ProtoTopic topics = 2;</code>
         */
        public int getTopicsCount() {
            if (topicsBuilder_ == null) {
                return topics_.size();
            } else {
                return topicsBuilder_.getCount();
            }
        }

        /**
         * <code>repeated .proto.ProtoTopic topics = 2;</code>
         */
        public com.flipkart.vbroker.proto.ProtoTopic getTopics(int index) {
            if (topicsBuilder_ == null) {
                return topics_.get(index);
            } else {
                return topicsBuilder_.getMessage(index);
            }
        }

        /**
         * <code>repeated .proto.ProtoTopic topics = 2;</code>
         */
        public Builder setTopics(
            int index, com.flipkart.vbroker.proto.ProtoTopic value) {
            if (topicsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureTopicsIsMutable();
                topics_.set(index, value);
                onChanged();
            } else {
                topicsBuilder_.setMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .proto.ProtoTopic topics = 2;</code>
         */
        public Builder setTopics(
            int index, com.flipkart.vbroker.proto.ProtoTopic.Builder builderForValue) {
            if (topicsBuilder_ == null) {
                ensureTopicsIsMutable();
                topics_.set(index, builderForValue.build());
                onChanged();
            } else {
                topicsBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .proto.ProtoTopic topics = 2;</code>
         */
        public Builder addTopics(com.flipkart.vbroker.proto.ProtoTopic value) {
            if (topicsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureTopicsIsMutable();
                topics_.add(value);
                onChanged();
            } else {
                topicsBuilder_.addMessage(value);
            }
            return this;
        }

        /**
         * <code>repeated .proto.ProtoTopic topics = 2;</code>
         */
        public Builder addTopics(
            int index, com.flipkart.vbroker.proto.ProtoTopic value) {
            if (topicsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureTopicsIsMutable();
                topics_.add(index, value);
                onChanged();
            } else {
                topicsBuilder_.addMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .proto.ProtoTopic topics = 2;</code>
         */
        public Builder addTopics(
            com.flipkart.vbroker.proto.ProtoTopic.Builder builderForValue) {
            if (topicsBuilder_ == null) {
                ensureTopicsIsMutable();
                topics_.add(builderForValue.build());
                onChanged();
            } else {
                topicsBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .proto.ProtoTopic topics = 2;</code>
         */
        public Builder addTopics(
            int index, com.flipkart.vbroker.proto.ProtoTopic.Builder builderForValue) {
            if (topicsBuilder_ == null) {
                ensureTopicsIsMutable();
                topics_.add(index, builderForValue.build());
                onChanged();
            } else {
                topicsBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .proto.ProtoTopic topics = 2;</code>
         */
        public Builder addAllTopics(
            java.lang.Iterable<? extends com.flipkart.vbroker.proto.ProtoTopic> values) {
            if (topicsBuilder_ == null) {
                ensureTopicsIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(
                    values, topics_);
                onChanged();
            } else {
                topicsBuilder_.addAllMessages(values);
            }
            return this;
        }

        /**
         * <code>repeated .proto.ProtoTopic topics = 2;</code>
         */
        public Builder clearTopics() {
            if (topicsBuilder_ == null) {
                topics_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000002);
                onChanged();
            } else {
                topicsBuilder_.clear();
            }
            return this;
        }

        /**
         * <code>repeated .proto.ProtoTopic topics = 2;</code>
         */
        public Builder removeTopics(int index) {
            if (topicsBuilder_ == null) {
                ensureTopicsIsMutable();
                topics_.remove(index);
                onChanged();
            } else {
                topicsBuilder_.remove(index);
            }
            return this;
        }

        /**
         * <code>repeated .proto.ProtoTopic topics = 2;</code>
         */
        public com.flipkart.vbroker.proto.ProtoTopic.Builder getTopicsBuilder(
            int index) {
            return getTopicsFieldBuilder().getBuilder(index);
        }

        /**
         * <code>repeated .proto.ProtoTopic topics = 2;</code>
         */
        public com.flipkart.vbroker.proto.ProtoTopicOrBuilder getTopicsOrBuilder(
            int index) {
            if (topicsBuilder_ == null) {
                return topics_.get(index);
            } else {
                return topicsBuilder_.getMessageOrBuilder(index);
            }
        }

        /**
         * <code>repeated .proto.ProtoTopic topics = 2;</code>
         */
        public java.util.List<? extends com.flipkart.vbroker.proto.ProtoTopicOrBuilder>
        getTopicsOrBuilderList() {
            if (topicsBuilder_ != null) {
                return topicsBuilder_.getMessageOrBuilderList();
            } else {
                return java.util.Collections.unmodifiableList(topics_);
            }
        }

        /**
         * <code>repeated .proto.ProtoTopic topics = 2;</code>
         */
        public com.flipkart.vbroker.proto.ProtoTopic.Builder addTopicsBuilder() {
            return getTopicsFieldBuilder().addBuilder(
                com.flipkart.vbroker.proto.ProtoTopic.getDefaultInstance());
        }

        /**
         * <code>repeated .proto.ProtoTopic topics = 2;</code>
         */
        public com.flipkart.vbroker.proto.ProtoTopic.Builder addTopicsBuilder(
            int index) {
            return getTopicsFieldBuilder().addBuilder(
                index, com.flipkart.vbroker.proto.ProtoTopic.getDefaultInstance());
        }

        /**
         * <code>repeated .proto.ProtoTopic topics = 2;</code>
         */
        public java.util.List<com.flipkart.vbroker.proto.ProtoTopic.Builder>
        getTopicsBuilderList() {
            return getTopicsFieldBuilder().getBuilderList();
        }

        private com.google.protobuf.RepeatedFieldBuilderV3<
            com.flipkart.vbroker.proto.ProtoTopic, com.flipkart.vbroker.proto.ProtoTopic.Builder, com.flipkart.vbroker.proto.ProtoTopicOrBuilder>
        getTopicsFieldBuilder() {
            if (topicsBuilder_ == null) {
                topicsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                    com.flipkart.vbroker.proto.ProtoTopic, com.flipkart.vbroker.proto.ProtoTopic.Builder, com.flipkart.vbroker.proto.ProtoTopicOrBuilder>(
                    topics_,
                    ((bitField0_ & 0x00000002) == 0x00000002),
                    getParentForChildren(),
                    isClean());
                topics_ = null;
            }
            return topicsBuilder_;
        }

        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFieldsProto3(unknownFields);
        }

        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:proto.GetAllTopicsResponse)
    }

}

