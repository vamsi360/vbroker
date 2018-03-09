// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: requests.proto

package com.flipkart.vbroker.proto;

/**
 * Protobuf type {@code proto.GetSubscriptionLagsRequest}
 */
public final class GetSubscriptionLagsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.GetSubscriptionLagsRequest)
    GetSubscriptionLagsRequestOrBuilder {
    public static final int SUBSCRIPTIONLAGREQUESTS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0L;
    // @@protoc_insertion_point(class_scope:proto.GetSubscriptionLagsRequest)
    private static final com.flipkart.vbroker.proto.GetSubscriptionLagsRequest DEFAULT_INSTANCE;
    private static final com.google.protobuf.Parser<GetSubscriptionLagsRequest>
        PARSER = new com.google.protobuf.AbstractParser<GetSubscriptionLagsRequest>() {
        public GetSubscriptionLagsRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return new GetSubscriptionLagsRequest(input, extensionRegistry);
        }
    };

    static {
        DEFAULT_INSTANCE = new com.flipkart.vbroker.proto.GetSubscriptionLagsRequest();
    }

    private java.util.List<com.flipkart.vbroker.proto.SubscriptionLagRequest> subscriptionLagRequests_;
    private byte memoizedIsInitialized = -1;

    // Use GetSubscriptionLagsRequest.newBuilder() to construct.
    private GetSubscriptionLagsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private GetSubscriptionLagsRequest() {
        subscriptionLagRequests_ = java.util.Collections.emptyList();
    }

    private GetSubscriptionLagsRequest(
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
                            subscriptionLagRequests_ = new java.util.ArrayList<com.flipkart.vbroker.proto.SubscriptionLagRequest>();
                            mutable_bitField0_ |= 0x00000001;
                        }
                        subscriptionLagRequests_.add(
                            input.readMessage(com.flipkart.vbroker.proto.SubscriptionLagRequest.parser(), extensionRegistry));
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
                subscriptionLagRequests_ = java.util.Collections.unmodifiableList(subscriptionLagRequests_);
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return com.flipkart.vbroker.proto.PRequests.internal_static_proto_GetSubscriptionLagsRequest_descriptor;
    }

    public static com.flipkart.vbroker.proto.GetSubscriptionLagsRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.flipkart.vbroker.proto.GetSubscriptionLagsRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetSubscriptionLagsRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.flipkart.vbroker.proto.GetSubscriptionLagsRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetSubscriptionLagsRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.flipkart.vbroker.proto.GetSubscriptionLagsRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetSubscriptionLagsRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.GetSubscriptionLagsRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetSubscriptionLagsRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.GetSubscriptionLagsRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetSubscriptionLagsRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.GetSubscriptionLagsRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.flipkart.vbroker.proto.GetSubscriptionLagsRequest prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public static com.flipkart.vbroker.proto.GetSubscriptionLagsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<GetSubscriptionLagsRequest> parser() {
        return PARSER;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return com.flipkart.vbroker.proto.PRequests.internal_static_proto_GetSubscriptionLagsRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.flipkart.vbroker.proto.GetSubscriptionLagsRequest.class, com.flipkart.vbroker.proto.GetSubscriptionLagsRequest.Builder.class);
    }

    /**
     * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
     */
    public java.util.List<com.flipkart.vbroker.proto.SubscriptionLagRequest> getSubscriptionLagRequestsList() {
        return subscriptionLagRequests_;
    }

    /**
     * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
     */
    public java.util.List<? extends com.flipkart.vbroker.proto.SubscriptionLagRequestOrBuilder>
    getSubscriptionLagRequestsOrBuilderList() {
        return subscriptionLagRequests_;
    }

    /**
     * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
     */
    public int getSubscriptionLagRequestsCount() {
        return subscriptionLagRequests_.size();
    }

    /**
     * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
     */
    public com.flipkart.vbroker.proto.SubscriptionLagRequest getSubscriptionLagRequests(int index) {
        return subscriptionLagRequests_.get(index);
    }

    /**
     * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
     */
    public com.flipkart.vbroker.proto.SubscriptionLagRequestOrBuilder getSubscriptionLagRequestsOrBuilder(
        int index) {
        return subscriptionLagRequests_.get(index);
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
        for (int i = 0; i < subscriptionLagRequests_.size(); i++) {
            output.writeMessage(1, subscriptionLagRequests_.get(i));
        }
        unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        for (int i = 0; i < subscriptionLagRequests_.size(); i++) {
            size += com.google.protobuf.CodedOutputStream
                .computeMessageSize(1, subscriptionLagRequests_.get(i));
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
        if (!(obj instanceof com.flipkart.vbroker.proto.GetSubscriptionLagsRequest)) {
            return super.equals(obj);
        }
        com.flipkart.vbroker.proto.GetSubscriptionLagsRequest other = (com.flipkart.vbroker.proto.GetSubscriptionLagsRequest) obj;

        boolean result = true;
        result = result && getSubscriptionLagRequestsList()
            .equals(other.getSubscriptionLagRequestsList());
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
        if (getSubscriptionLagRequestsCount() > 0) {
            hash = (37 * hash) + SUBSCRIPTIONLAGREQUESTS_FIELD_NUMBER;
            hash = (53 * hash) + getSubscriptionLagRequestsList().hashCode();
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
    public com.google.protobuf.Parser<GetSubscriptionLagsRequest> getParserForType() {
        return PARSER;
    }

    public com.flipkart.vbroker.proto.GetSubscriptionLagsRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    /**
     * Protobuf type {@code proto.GetSubscriptionLagsRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.GetSubscriptionLagsRequest)
        com.flipkart.vbroker.proto.GetSubscriptionLagsRequestOrBuilder {
        private int bitField0_;
        private java.util.List<com.flipkart.vbroker.proto.SubscriptionLagRequest> subscriptionLagRequests_ =
            java.util.Collections.emptyList();
        private com.google.protobuf.RepeatedFieldBuilderV3<
            com.flipkart.vbroker.proto.SubscriptionLagRequest, com.flipkart.vbroker.proto.SubscriptionLagRequest.Builder, com.flipkart.vbroker.proto.SubscriptionLagRequestOrBuilder> subscriptionLagRequestsBuilder_;

        // Construct using com.flipkart.vbroker.proto.GetSubscriptionLagsRequest.newBuilder()
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
            return com.flipkart.vbroker.proto.PRequests.internal_static_proto_GetSubscriptionLagsRequest_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.flipkart.vbroker.proto.PRequests.internal_static_proto_GetSubscriptionLagsRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    com.flipkart.vbroker.proto.GetSubscriptionLagsRequest.class, com.flipkart.vbroker.proto.GetSubscriptionLagsRequest.Builder.class);
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
                getSubscriptionLagRequestsFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            if (subscriptionLagRequestsBuilder_ == null) {
                subscriptionLagRequests_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000001);
            } else {
                subscriptionLagRequestsBuilder_.clear();
            }
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return com.flipkart.vbroker.proto.PRequests.internal_static_proto_GetSubscriptionLagsRequest_descriptor;
        }

        public com.flipkart.vbroker.proto.GetSubscriptionLagsRequest getDefaultInstanceForType() {
            return com.flipkart.vbroker.proto.GetSubscriptionLagsRequest.getDefaultInstance();
        }

        public com.flipkart.vbroker.proto.GetSubscriptionLagsRequest build() {
            com.flipkart.vbroker.proto.GetSubscriptionLagsRequest result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public com.flipkart.vbroker.proto.GetSubscriptionLagsRequest buildPartial() {
            com.flipkart.vbroker.proto.GetSubscriptionLagsRequest result = new com.flipkart.vbroker.proto.GetSubscriptionLagsRequest(this);
            int from_bitField0_ = bitField0_;
            if (subscriptionLagRequestsBuilder_ == null) {
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    subscriptionLagRequests_ = java.util.Collections.unmodifiableList(subscriptionLagRequests_);
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.subscriptionLagRequests_ = subscriptionLagRequests_;
            } else {
                result.subscriptionLagRequests_ = subscriptionLagRequestsBuilder_.build();
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
            if (other instanceof com.flipkart.vbroker.proto.GetSubscriptionLagsRequest) {
                return mergeFrom((com.flipkart.vbroker.proto.GetSubscriptionLagsRequest) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(com.flipkart.vbroker.proto.GetSubscriptionLagsRequest other) {
            if (other == com.flipkart.vbroker.proto.GetSubscriptionLagsRequest.getDefaultInstance()) return this;
            if (subscriptionLagRequestsBuilder_ == null) {
                if (!other.subscriptionLagRequests_.isEmpty()) {
                    if (subscriptionLagRequests_.isEmpty()) {
                        subscriptionLagRequests_ = other.subscriptionLagRequests_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureSubscriptionLagRequestsIsMutable();
                        subscriptionLagRequests_.addAll(other.subscriptionLagRequests_);
                    }
                    onChanged();
                }
            } else {
                if (!other.subscriptionLagRequests_.isEmpty()) {
                    if (subscriptionLagRequestsBuilder_.isEmpty()) {
                        subscriptionLagRequestsBuilder_.dispose();
                        subscriptionLagRequestsBuilder_ = null;
                        subscriptionLagRequests_ = other.subscriptionLagRequests_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                        subscriptionLagRequestsBuilder_ =
                            com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                getSubscriptionLagRequestsFieldBuilder() : null;
                    } else {
                        subscriptionLagRequestsBuilder_.addAllMessages(other.subscriptionLagRequests_);
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
            com.flipkart.vbroker.proto.GetSubscriptionLagsRequest parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (com.flipkart.vbroker.proto.GetSubscriptionLagsRequest) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private void ensureSubscriptionLagRequestsIsMutable() {
            if (!((bitField0_ & 0x00000001) == 0x00000001)) {
                subscriptionLagRequests_ = new java.util.ArrayList<com.flipkart.vbroker.proto.SubscriptionLagRequest>(subscriptionLagRequests_);
                bitField0_ |= 0x00000001;
            }
        }

        /**
         * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
         */
        public java.util.List<com.flipkart.vbroker.proto.SubscriptionLagRequest> getSubscriptionLagRequestsList() {
            if (subscriptionLagRequestsBuilder_ == null) {
                return java.util.Collections.unmodifiableList(subscriptionLagRequests_);
            } else {
                return subscriptionLagRequestsBuilder_.getMessageList();
            }
        }

        /**
         * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
         */
        public int getSubscriptionLagRequestsCount() {
            if (subscriptionLagRequestsBuilder_ == null) {
                return subscriptionLagRequests_.size();
            } else {
                return subscriptionLagRequestsBuilder_.getCount();
            }
        }

        /**
         * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
         */
        public com.flipkart.vbroker.proto.SubscriptionLagRequest getSubscriptionLagRequests(int index) {
            if (subscriptionLagRequestsBuilder_ == null) {
                return subscriptionLagRequests_.get(index);
            } else {
                return subscriptionLagRequestsBuilder_.getMessage(index);
            }
        }

        /**
         * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
         */
        public Builder setSubscriptionLagRequests(
            int index, com.flipkart.vbroker.proto.SubscriptionLagRequest value) {
            if (subscriptionLagRequestsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureSubscriptionLagRequestsIsMutable();
                subscriptionLagRequests_.set(index, value);
                onChanged();
            } else {
                subscriptionLagRequestsBuilder_.setMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
         */
        public Builder setSubscriptionLagRequests(
            int index, com.flipkart.vbroker.proto.SubscriptionLagRequest.Builder builderForValue) {
            if (subscriptionLagRequestsBuilder_ == null) {
                ensureSubscriptionLagRequestsIsMutable();
                subscriptionLagRequests_.set(index, builderForValue.build());
                onChanged();
            } else {
                subscriptionLagRequestsBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
         */
        public Builder addSubscriptionLagRequests(com.flipkart.vbroker.proto.SubscriptionLagRequest value) {
            if (subscriptionLagRequestsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureSubscriptionLagRequestsIsMutable();
                subscriptionLagRequests_.add(value);
                onChanged();
            } else {
                subscriptionLagRequestsBuilder_.addMessage(value);
            }
            return this;
        }

        /**
         * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
         */
        public Builder addSubscriptionLagRequests(
            int index, com.flipkart.vbroker.proto.SubscriptionLagRequest value) {
            if (subscriptionLagRequestsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureSubscriptionLagRequestsIsMutable();
                subscriptionLagRequests_.add(index, value);
                onChanged();
            } else {
                subscriptionLagRequestsBuilder_.addMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
         */
        public Builder addSubscriptionLagRequests(
            com.flipkart.vbroker.proto.SubscriptionLagRequest.Builder builderForValue) {
            if (subscriptionLagRequestsBuilder_ == null) {
                ensureSubscriptionLagRequestsIsMutable();
                subscriptionLagRequests_.add(builderForValue.build());
                onChanged();
            } else {
                subscriptionLagRequestsBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
         */
        public Builder addSubscriptionLagRequests(
            int index, com.flipkart.vbroker.proto.SubscriptionLagRequest.Builder builderForValue) {
            if (subscriptionLagRequestsBuilder_ == null) {
                ensureSubscriptionLagRequestsIsMutable();
                subscriptionLagRequests_.add(index, builderForValue.build());
                onChanged();
            } else {
                subscriptionLagRequestsBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
         */
        public Builder addAllSubscriptionLagRequests(
            java.lang.Iterable<? extends com.flipkart.vbroker.proto.SubscriptionLagRequest> values) {
            if (subscriptionLagRequestsBuilder_ == null) {
                ensureSubscriptionLagRequestsIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(
                    values, subscriptionLagRequests_);
                onChanged();
            } else {
                subscriptionLagRequestsBuilder_.addAllMessages(values);
            }
            return this;
        }

        /**
         * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
         */
        public Builder clearSubscriptionLagRequests() {
            if (subscriptionLagRequestsBuilder_ == null) {
                subscriptionLagRequests_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
            } else {
                subscriptionLagRequestsBuilder_.clear();
            }
            return this;
        }

        /**
         * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
         */
        public Builder removeSubscriptionLagRequests(int index) {
            if (subscriptionLagRequestsBuilder_ == null) {
                ensureSubscriptionLagRequestsIsMutable();
                subscriptionLagRequests_.remove(index);
                onChanged();
            } else {
                subscriptionLagRequestsBuilder_.remove(index);
            }
            return this;
        }

        /**
         * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
         */
        public com.flipkart.vbroker.proto.SubscriptionLagRequest.Builder getSubscriptionLagRequestsBuilder(
            int index) {
            return getSubscriptionLagRequestsFieldBuilder().getBuilder(index);
        }

        /**
         * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
         */
        public com.flipkart.vbroker.proto.SubscriptionLagRequestOrBuilder getSubscriptionLagRequestsOrBuilder(
            int index) {
            if (subscriptionLagRequestsBuilder_ == null) {
                return subscriptionLagRequests_.get(index);
            } else {
                return subscriptionLagRequestsBuilder_.getMessageOrBuilder(index);
            }
        }

        /**
         * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
         */
        public java.util.List<? extends com.flipkart.vbroker.proto.SubscriptionLagRequestOrBuilder>
        getSubscriptionLagRequestsOrBuilderList() {
            if (subscriptionLagRequestsBuilder_ != null) {
                return subscriptionLagRequestsBuilder_.getMessageOrBuilderList();
            } else {
                return java.util.Collections.unmodifiableList(subscriptionLagRequests_);
            }
        }

        /**
         * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
         */
        public com.flipkart.vbroker.proto.SubscriptionLagRequest.Builder addSubscriptionLagRequestsBuilder() {
            return getSubscriptionLagRequestsFieldBuilder().addBuilder(
                com.flipkart.vbroker.proto.SubscriptionLagRequest.getDefaultInstance());
        }

        /**
         * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
         */
        public com.flipkart.vbroker.proto.SubscriptionLagRequest.Builder addSubscriptionLagRequestsBuilder(
            int index) {
            return getSubscriptionLagRequestsFieldBuilder().addBuilder(
                index, com.flipkart.vbroker.proto.SubscriptionLagRequest.getDefaultInstance());
        }

        /**
         * <code>repeated .proto.SubscriptionLagRequest subscriptionLagRequests = 1;</code>
         */
        public java.util.List<com.flipkart.vbroker.proto.SubscriptionLagRequest.Builder>
        getSubscriptionLagRequestsBuilderList() {
            return getSubscriptionLagRequestsFieldBuilder().getBuilderList();
        }

        private com.google.protobuf.RepeatedFieldBuilderV3<
            com.flipkart.vbroker.proto.SubscriptionLagRequest, com.flipkart.vbroker.proto.SubscriptionLagRequest.Builder, com.flipkart.vbroker.proto.SubscriptionLagRequestOrBuilder>
        getSubscriptionLagRequestsFieldBuilder() {
            if (subscriptionLagRequestsBuilder_ == null) {
                subscriptionLagRequestsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                    com.flipkart.vbroker.proto.SubscriptionLagRequest, com.flipkart.vbroker.proto.SubscriptionLagRequest.Builder, com.flipkart.vbroker.proto.SubscriptionLagRequestOrBuilder>(
                    subscriptionLagRequests_,
                    ((bitField0_ & 0x00000001) == 0x00000001),
                    getParentForChildren(),
                    isClean());
                subscriptionLagRequests_ = null;
            }
            return subscriptionLagRequestsBuilder_;
        }

        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFieldsProto3(unknownFields);
        }

        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:proto.GetSubscriptionLagsRequest)
    }

}

