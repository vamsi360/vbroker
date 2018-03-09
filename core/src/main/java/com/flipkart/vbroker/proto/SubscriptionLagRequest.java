// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: requests.proto

package com.flipkart.vbroker.proto;

/**
 * Protobuf type {@code proto.SubscriptionLagRequest}
 */
public final class SubscriptionLagRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.SubscriptionLagRequest)
    SubscriptionLagRequestOrBuilder {
    public static final int TOPICSUBSCRIPTION_FIELD_NUMBER = 1;
    public static final int PARTITIONLAGS_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0L;
    // @@protoc_insertion_point(class_scope:proto.SubscriptionLagRequest)
    private static final com.flipkart.vbroker.proto.SubscriptionLagRequest DEFAULT_INSTANCE;
    private static final com.google.protobuf.Parser<SubscriptionLagRequest>
        PARSER = new com.google.protobuf.AbstractParser<SubscriptionLagRequest>() {
        public SubscriptionLagRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return new SubscriptionLagRequest(input, extensionRegistry);
        }
    };

    static {
        DEFAULT_INSTANCE = new com.flipkart.vbroker.proto.SubscriptionLagRequest();
    }

    private int bitField0_;
    private com.flipkart.vbroker.proto.TopicSubscription topicSubscription_;
    private java.util.List<com.flipkart.vbroker.proto.PartitionLagRequest> partitionLags_;
    private byte memoizedIsInitialized = -1;

    // Use SubscriptionLagRequest.newBuilder() to construct.
    private SubscriptionLagRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private SubscriptionLagRequest() {
        partitionLags_ = java.util.Collections.emptyList();
    }

    private SubscriptionLagRequest(
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
                        com.flipkart.vbroker.proto.TopicSubscription.Builder subBuilder = null;
                        if (topicSubscription_ != null) {
                            subBuilder = topicSubscription_.toBuilder();
                        }
                        topicSubscription_ = input.readMessage(com.flipkart.vbroker.proto.TopicSubscription.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(topicSubscription_);
                            topicSubscription_ = subBuilder.buildPartial();
                        }

                        break;
                    }
                    case 18: {
                        if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                            partitionLags_ = new java.util.ArrayList<com.flipkart.vbroker.proto.PartitionLagRequest>();
                            mutable_bitField0_ |= 0x00000002;
                        }
                        partitionLags_.add(
                            input.readMessage(com.flipkart.vbroker.proto.PartitionLagRequest.parser(), extensionRegistry));
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
                partitionLags_ = java.util.Collections.unmodifiableList(partitionLags_);
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return com.flipkart.vbroker.proto.PRequests.internal_static_proto_SubscriptionLagRequest_descriptor;
    }

    public static com.flipkart.vbroker.proto.SubscriptionLagRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.flipkart.vbroker.proto.SubscriptionLagRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.SubscriptionLagRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.flipkart.vbroker.proto.SubscriptionLagRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.SubscriptionLagRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.flipkart.vbroker.proto.SubscriptionLagRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.SubscriptionLagRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.SubscriptionLagRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.SubscriptionLagRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.SubscriptionLagRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.SubscriptionLagRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.SubscriptionLagRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.flipkart.vbroker.proto.SubscriptionLagRequest prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public static com.flipkart.vbroker.proto.SubscriptionLagRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<SubscriptionLagRequest> parser() {
        return PARSER;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return com.flipkart.vbroker.proto.PRequests.internal_static_proto_SubscriptionLagRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.flipkart.vbroker.proto.SubscriptionLagRequest.class, com.flipkart.vbroker.proto.SubscriptionLagRequest.Builder.class);
    }

    /**
     * <code>.proto.TopicSubscription topicSubscription = 1;</code>
     */
    public boolean hasTopicSubscription() {
        return topicSubscription_ != null;
    }

    /**
     * <code>.proto.TopicSubscription topicSubscription = 1;</code>
     */
    public com.flipkart.vbroker.proto.TopicSubscription getTopicSubscription() {
        return topicSubscription_ == null ? com.flipkart.vbroker.proto.TopicSubscription.getDefaultInstance() : topicSubscription_;
    }

    /**
     * <code>.proto.TopicSubscription topicSubscription = 1;</code>
     */
    public com.flipkart.vbroker.proto.TopicSubscriptionOrBuilder getTopicSubscriptionOrBuilder() {
        return getTopicSubscription();
    }

    /**
     * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
     */
    public java.util.List<com.flipkart.vbroker.proto.PartitionLagRequest> getPartitionLagsList() {
        return partitionLags_;
    }

    /**
     * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
     */
    public java.util.List<? extends com.flipkart.vbroker.proto.PartitionLagRequestOrBuilder>
    getPartitionLagsOrBuilderList() {
        return partitionLags_;
    }

    /**
     * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
     */
    public int getPartitionLagsCount() {
        return partitionLags_.size();
    }

    /**
     * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
     */
    public com.flipkart.vbroker.proto.PartitionLagRequest getPartitionLags(int index) {
        return partitionLags_.get(index);
    }

    /**
     * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
     */
    public com.flipkart.vbroker.proto.PartitionLagRequestOrBuilder getPartitionLagsOrBuilder(
        int index) {
        return partitionLags_.get(index);
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
        if (topicSubscription_ != null) {
            output.writeMessage(1, getTopicSubscription());
        }
        for (int i = 0; i < partitionLags_.size(); i++) {
            output.writeMessage(2, partitionLags_.get(i));
        }
        unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (topicSubscription_ != null) {
            size += com.google.protobuf.CodedOutputStream
                .computeMessageSize(1, getTopicSubscription());
        }
        for (int i = 0; i < partitionLags_.size(); i++) {
            size += com.google.protobuf.CodedOutputStream
                .computeMessageSize(2, partitionLags_.get(i));
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
        if (!(obj instanceof com.flipkart.vbroker.proto.SubscriptionLagRequest)) {
            return super.equals(obj);
        }
        com.flipkart.vbroker.proto.SubscriptionLagRequest other = (com.flipkart.vbroker.proto.SubscriptionLagRequest) obj;

        boolean result = true;
        result = result && (hasTopicSubscription() == other.hasTopicSubscription());
        if (hasTopicSubscription()) {
            result = result && getTopicSubscription()
                .equals(other.getTopicSubscription());
        }
        result = result && getPartitionLagsList()
            .equals(other.getPartitionLagsList());
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
        if (hasTopicSubscription()) {
            hash = (37 * hash) + TOPICSUBSCRIPTION_FIELD_NUMBER;
            hash = (53 * hash) + getTopicSubscription().hashCode();
        }
        if (getPartitionLagsCount() > 0) {
            hash = (37 * hash) + PARTITIONLAGS_FIELD_NUMBER;
            hash = (53 * hash) + getPartitionLagsList().hashCode();
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
    public com.google.protobuf.Parser<SubscriptionLagRequest> getParserForType() {
        return PARSER;
    }

    public com.flipkart.vbroker.proto.SubscriptionLagRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    /**
     * Protobuf type {@code proto.SubscriptionLagRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.SubscriptionLagRequest)
        com.flipkart.vbroker.proto.SubscriptionLagRequestOrBuilder {
        private int bitField0_;
        private com.flipkart.vbroker.proto.TopicSubscription topicSubscription_ = null;
        private com.google.protobuf.SingleFieldBuilderV3<
            com.flipkart.vbroker.proto.TopicSubscription, com.flipkart.vbroker.proto.TopicSubscription.Builder, com.flipkart.vbroker.proto.TopicSubscriptionOrBuilder> topicSubscriptionBuilder_;
        private java.util.List<com.flipkart.vbroker.proto.PartitionLagRequest> partitionLags_ =
            java.util.Collections.emptyList();
        private com.google.protobuf.RepeatedFieldBuilderV3<
            com.flipkart.vbroker.proto.PartitionLagRequest, com.flipkart.vbroker.proto.PartitionLagRequest.Builder, com.flipkart.vbroker.proto.PartitionLagRequestOrBuilder> partitionLagsBuilder_;

        // Construct using com.flipkart.vbroker.proto.SubscriptionLagRequest.newBuilder()
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
            return com.flipkart.vbroker.proto.PRequests.internal_static_proto_SubscriptionLagRequest_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.flipkart.vbroker.proto.PRequests.internal_static_proto_SubscriptionLagRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    com.flipkart.vbroker.proto.SubscriptionLagRequest.class, com.flipkart.vbroker.proto.SubscriptionLagRequest.Builder.class);
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
                getPartitionLagsFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            if (topicSubscriptionBuilder_ == null) {
                topicSubscription_ = null;
            } else {
                topicSubscription_ = null;
                topicSubscriptionBuilder_ = null;
            }
            if (partitionLagsBuilder_ == null) {
                partitionLags_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000002);
            } else {
                partitionLagsBuilder_.clear();
            }
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return com.flipkart.vbroker.proto.PRequests.internal_static_proto_SubscriptionLagRequest_descriptor;
        }

        public com.flipkart.vbroker.proto.SubscriptionLagRequest getDefaultInstanceForType() {
            return com.flipkart.vbroker.proto.SubscriptionLagRequest.getDefaultInstance();
        }

        public com.flipkart.vbroker.proto.SubscriptionLagRequest build() {
            com.flipkart.vbroker.proto.SubscriptionLagRequest result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public com.flipkart.vbroker.proto.SubscriptionLagRequest buildPartial() {
            com.flipkart.vbroker.proto.SubscriptionLagRequest result = new com.flipkart.vbroker.proto.SubscriptionLagRequest(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (topicSubscriptionBuilder_ == null) {
                result.topicSubscription_ = topicSubscription_;
            } else {
                result.topicSubscription_ = topicSubscriptionBuilder_.build();
            }
            if (partitionLagsBuilder_ == null) {
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    partitionLags_ = java.util.Collections.unmodifiableList(partitionLags_);
                    bitField0_ = (bitField0_ & ~0x00000002);
                }
                result.partitionLags_ = partitionLags_;
            } else {
                result.partitionLags_ = partitionLagsBuilder_.build();
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
            if (other instanceof com.flipkart.vbroker.proto.SubscriptionLagRequest) {
                return mergeFrom((com.flipkart.vbroker.proto.SubscriptionLagRequest) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(com.flipkart.vbroker.proto.SubscriptionLagRequest other) {
            if (other == com.flipkart.vbroker.proto.SubscriptionLagRequest.getDefaultInstance()) return this;
            if (other.hasTopicSubscription()) {
                mergeTopicSubscription(other.getTopicSubscription());
            }
            if (partitionLagsBuilder_ == null) {
                if (!other.partitionLags_.isEmpty()) {
                    if (partitionLags_.isEmpty()) {
                        partitionLags_ = other.partitionLags_;
                        bitField0_ = (bitField0_ & ~0x00000002);
                    } else {
                        ensurePartitionLagsIsMutable();
                        partitionLags_.addAll(other.partitionLags_);
                    }
                    onChanged();
                }
            } else {
                if (!other.partitionLags_.isEmpty()) {
                    if (partitionLagsBuilder_.isEmpty()) {
                        partitionLagsBuilder_.dispose();
                        partitionLagsBuilder_ = null;
                        partitionLags_ = other.partitionLags_;
                        bitField0_ = (bitField0_ & ~0x00000002);
                        partitionLagsBuilder_ =
                            com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                getPartitionLagsFieldBuilder() : null;
                    } else {
                        partitionLagsBuilder_.addAllMessages(other.partitionLags_);
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
            com.flipkart.vbroker.proto.SubscriptionLagRequest parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (com.flipkart.vbroker.proto.SubscriptionLagRequest) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        /**
         * <code>.proto.TopicSubscription topicSubscription = 1;</code>
         */
        public boolean hasTopicSubscription() {
            return topicSubscriptionBuilder_ != null || topicSubscription_ != null;
        }

        /**
         * <code>.proto.TopicSubscription topicSubscription = 1;</code>
         */
        public com.flipkart.vbroker.proto.TopicSubscription getTopicSubscription() {
            if (topicSubscriptionBuilder_ == null) {
                return topicSubscription_ == null ? com.flipkart.vbroker.proto.TopicSubscription.getDefaultInstance() : topicSubscription_;
            } else {
                return topicSubscriptionBuilder_.getMessage();
            }
        }

        /**
         * <code>.proto.TopicSubscription topicSubscription = 1;</code>
         */
        public Builder setTopicSubscription(
            com.flipkart.vbroker.proto.TopicSubscription.Builder builderForValue) {
            if (topicSubscriptionBuilder_ == null) {
                topicSubscription_ = builderForValue.build();
                onChanged();
            } else {
                topicSubscriptionBuilder_.setMessage(builderForValue.build());
            }

            return this;
        }

        /**
         * <code>.proto.TopicSubscription topicSubscription = 1;</code>
         */
        public Builder setTopicSubscription(com.flipkart.vbroker.proto.TopicSubscription value) {
            if (topicSubscriptionBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                topicSubscription_ = value;
                onChanged();
            } else {
                topicSubscriptionBuilder_.setMessage(value);
            }

            return this;
        }

        /**
         * <code>.proto.TopicSubscription topicSubscription = 1;</code>
         */
        public Builder mergeTopicSubscription(com.flipkart.vbroker.proto.TopicSubscription value) {
            if (topicSubscriptionBuilder_ == null) {
                if (topicSubscription_ != null) {
                    topicSubscription_ =
                        com.flipkart.vbroker.proto.TopicSubscription.newBuilder(topicSubscription_).mergeFrom(value).buildPartial();
                } else {
                    topicSubscription_ = value;
                }
                onChanged();
            } else {
                topicSubscriptionBuilder_.mergeFrom(value);
            }

            return this;
        }

        /**
         * <code>.proto.TopicSubscription topicSubscription = 1;</code>
         */
        public Builder clearTopicSubscription() {
            if (topicSubscriptionBuilder_ == null) {
                topicSubscription_ = null;
                onChanged();
            } else {
                topicSubscription_ = null;
                topicSubscriptionBuilder_ = null;
            }

            return this;
        }

        /**
         * <code>.proto.TopicSubscription topicSubscription = 1;</code>
         */
        public com.flipkart.vbroker.proto.TopicSubscription.Builder getTopicSubscriptionBuilder() {

            onChanged();
            return getTopicSubscriptionFieldBuilder().getBuilder();
        }

        /**
         * <code>.proto.TopicSubscription topicSubscription = 1;</code>
         */
        public com.flipkart.vbroker.proto.TopicSubscriptionOrBuilder getTopicSubscriptionOrBuilder() {
            if (topicSubscriptionBuilder_ != null) {
                return topicSubscriptionBuilder_.getMessageOrBuilder();
            } else {
                return topicSubscription_ == null ?
                    com.flipkart.vbroker.proto.TopicSubscription.getDefaultInstance() : topicSubscription_;
            }
        }

        /**
         * <code>.proto.TopicSubscription topicSubscription = 1;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
            com.flipkart.vbroker.proto.TopicSubscription, com.flipkart.vbroker.proto.TopicSubscription.Builder, com.flipkart.vbroker.proto.TopicSubscriptionOrBuilder>
        getTopicSubscriptionFieldBuilder() {
            if (topicSubscriptionBuilder_ == null) {
                topicSubscriptionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                    com.flipkart.vbroker.proto.TopicSubscription, com.flipkart.vbroker.proto.TopicSubscription.Builder, com.flipkart.vbroker.proto.TopicSubscriptionOrBuilder>(
                    getTopicSubscription(),
                    getParentForChildren(),
                    isClean());
                topicSubscription_ = null;
            }
            return topicSubscriptionBuilder_;
        }

        private void ensurePartitionLagsIsMutable() {
            if (!((bitField0_ & 0x00000002) == 0x00000002)) {
                partitionLags_ = new java.util.ArrayList<com.flipkart.vbroker.proto.PartitionLagRequest>(partitionLags_);
                bitField0_ |= 0x00000002;
            }
        }

        /**
         * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
         */
        public java.util.List<com.flipkart.vbroker.proto.PartitionLagRequest> getPartitionLagsList() {
            if (partitionLagsBuilder_ == null) {
                return java.util.Collections.unmodifiableList(partitionLags_);
            } else {
                return partitionLagsBuilder_.getMessageList();
            }
        }

        /**
         * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
         */
        public int getPartitionLagsCount() {
            if (partitionLagsBuilder_ == null) {
                return partitionLags_.size();
            } else {
                return partitionLagsBuilder_.getCount();
            }
        }

        /**
         * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
         */
        public com.flipkart.vbroker.proto.PartitionLagRequest getPartitionLags(int index) {
            if (partitionLagsBuilder_ == null) {
                return partitionLags_.get(index);
            } else {
                return partitionLagsBuilder_.getMessage(index);
            }
        }

        /**
         * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
         */
        public Builder setPartitionLags(
            int index, com.flipkart.vbroker.proto.PartitionLagRequest value) {
            if (partitionLagsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensurePartitionLagsIsMutable();
                partitionLags_.set(index, value);
                onChanged();
            } else {
                partitionLagsBuilder_.setMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
         */
        public Builder setPartitionLags(
            int index, com.flipkart.vbroker.proto.PartitionLagRequest.Builder builderForValue) {
            if (partitionLagsBuilder_ == null) {
                ensurePartitionLagsIsMutable();
                partitionLags_.set(index, builderForValue.build());
                onChanged();
            } else {
                partitionLagsBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
         */
        public Builder addPartitionLags(com.flipkart.vbroker.proto.PartitionLagRequest value) {
            if (partitionLagsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensurePartitionLagsIsMutable();
                partitionLags_.add(value);
                onChanged();
            } else {
                partitionLagsBuilder_.addMessage(value);
            }
            return this;
        }

        /**
         * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
         */
        public Builder addPartitionLags(
            int index, com.flipkart.vbroker.proto.PartitionLagRequest value) {
            if (partitionLagsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensurePartitionLagsIsMutable();
                partitionLags_.add(index, value);
                onChanged();
            } else {
                partitionLagsBuilder_.addMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
         */
        public Builder addPartitionLags(
            com.flipkart.vbroker.proto.PartitionLagRequest.Builder builderForValue) {
            if (partitionLagsBuilder_ == null) {
                ensurePartitionLagsIsMutable();
                partitionLags_.add(builderForValue.build());
                onChanged();
            } else {
                partitionLagsBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
         */
        public Builder addPartitionLags(
            int index, com.flipkart.vbroker.proto.PartitionLagRequest.Builder builderForValue) {
            if (partitionLagsBuilder_ == null) {
                ensurePartitionLagsIsMutable();
                partitionLags_.add(index, builderForValue.build());
                onChanged();
            } else {
                partitionLagsBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
         */
        public Builder addAllPartitionLags(
            java.lang.Iterable<? extends com.flipkart.vbroker.proto.PartitionLagRequest> values) {
            if (partitionLagsBuilder_ == null) {
                ensurePartitionLagsIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(
                    values, partitionLags_);
                onChanged();
            } else {
                partitionLagsBuilder_.addAllMessages(values);
            }
            return this;
        }

        /**
         * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
         */
        public Builder clearPartitionLags() {
            if (partitionLagsBuilder_ == null) {
                partitionLags_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000002);
                onChanged();
            } else {
                partitionLagsBuilder_.clear();
            }
            return this;
        }

        /**
         * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
         */
        public Builder removePartitionLags(int index) {
            if (partitionLagsBuilder_ == null) {
                ensurePartitionLagsIsMutable();
                partitionLags_.remove(index);
                onChanged();
            } else {
                partitionLagsBuilder_.remove(index);
            }
            return this;
        }

        /**
         * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
         */
        public com.flipkart.vbroker.proto.PartitionLagRequest.Builder getPartitionLagsBuilder(
            int index) {
            return getPartitionLagsFieldBuilder().getBuilder(index);
        }

        /**
         * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
         */
        public com.flipkart.vbroker.proto.PartitionLagRequestOrBuilder getPartitionLagsOrBuilder(
            int index) {
            if (partitionLagsBuilder_ == null) {
                return partitionLags_.get(index);
            } else {
                return partitionLagsBuilder_.getMessageOrBuilder(index);
            }
        }

        /**
         * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
         */
        public java.util.List<? extends com.flipkart.vbroker.proto.PartitionLagRequestOrBuilder>
        getPartitionLagsOrBuilderList() {
            if (partitionLagsBuilder_ != null) {
                return partitionLagsBuilder_.getMessageOrBuilderList();
            } else {
                return java.util.Collections.unmodifiableList(partitionLags_);
            }
        }

        /**
         * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
         */
        public com.flipkart.vbroker.proto.PartitionLagRequest.Builder addPartitionLagsBuilder() {
            return getPartitionLagsFieldBuilder().addBuilder(
                com.flipkart.vbroker.proto.PartitionLagRequest.getDefaultInstance());
        }

        /**
         * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
         */
        public com.flipkart.vbroker.proto.PartitionLagRequest.Builder addPartitionLagsBuilder(
            int index) {
            return getPartitionLagsFieldBuilder().addBuilder(
                index, com.flipkart.vbroker.proto.PartitionLagRequest.getDefaultInstance());
        }

        /**
         * <code>repeated .proto.PartitionLagRequest partitionLags = 2;</code>
         */
        public java.util.List<com.flipkart.vbroker.proto.PartitionLagRequest.Builder>
        getPartitionLagsBuilderList() {
            return getPartitionLagsFieldBuilder().getBuilderList();
        }

        private com.google.protobuf.RepeatedFieldBuilderV3<
            com.flipkart.vbroker.proto.PartitionLagRequest, com.flipkart.vbroker.proto.PartitionLagRequest.Builder, com.flipkart.vbroker.proto.PartitionLagRequestOrBuilder>
        getPartitionLagsFieldBuilder() {
            if (partitionLagsBuilder_ == null) {
                partitionLagsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                    com.flipkart.vbroker.proto.PartitionLagRequest, com.flipkart.vbroker.proto.PartitionLagRequest.Builder, com.flipkart.vbroker.proto.PartitionLagRequestOrBuilder>(
                    partitionLags_,
                    ((bitField0_ & 0x00000002) == 0x00000002),
                    getParentForChildren(),
                    isClean());
                partitionLags_ = null;
            }
            return partitionLagsBuilder_;
        }

        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFieldsProto3(unknownFields);
        }

        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:proto.SubscriptionLagRequest)
    }

}
