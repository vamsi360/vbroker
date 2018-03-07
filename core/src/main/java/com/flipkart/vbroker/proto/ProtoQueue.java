// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entities.proto

package com.flipkart.vbroker.proto;

/**
 * Protobuf type {@code proto.ProtoQueue}
 */
public final class ProtoQueue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.ProtoQueue)
    ProtoQueueOrBuilder {
    public static final int ID_FIELD_NUMBER = 1;
    public static final int TOPIC_FIELD_NUMBER = 2;
    public static final int SUBSCRIPTION_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0L;
    // @@protoc_insertion_point(class_scope:proto.ProtoQueue)
    private static final com.flipkart.vbroker.proto.ProtoQueue DEFAULT_INSTANCE;
    private static final com.google.protobuf.Parser<ProtoQueue>
        PARSER = new com.google.protobuf.AbstractParser<ProtoQueue>() {
        public ProtoQueue parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return new ProtoQueue(input, extensionRegistry);
        }
    };

    static {
        DEFAULT_INSTANCE = new com.flipkart.vbroker.proto.ProtoQueue();
    }

    private int id_;
    private com.flipkart.vbroker.proto.ProtoTopic topic_;
    private com.flipkart.vbroker.proto.ProtoSubscription subscription_;
    private byte memoizedIsInitialized = -1;

    // Use ProtoQueue.newBuilder() to construct.
    private ProtoQueue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ProtoQueue() {
        id_ = 0;
    }

    private ProtoQueue(
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

                        id_ = input.readInt32();
                        break;
                    }
                    case 18: {
                        com.flipkart.vbroker.proto.ProtoTopic.Builder subBuilder = null;
                        if (topic_ != null) {
                            subBuilder = topic_.toBuilder();
                        }
                        topic_ = input.readMessage(com.flipkart.vbroker.proto.ProtoTopic.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(topic_);
                            topic_ = subBuilder.buildPartial();
                        }

                        break;
                    }
                    case 26: {
                        com.flipkart.vbroker.proto.ProtoSubscription.Builder subBuilder = null;
                        if (subscription_ != null) {
                            subBuilder = subscription_.toBuilder();
                        }
                        subscription_ = input.readMessage(com.flipkart.vbroker.proto.ProtoSubscription.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(subscription_);
                            subscription_ = subBuilder.buildPartial();
                        }

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
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return com.flipkart.vbroker.proto.PEntities.internal_static_proto_ProtoQueue_descriptor;
    }

    public static com.flipkart.vbroker.proto.ProtoQueue parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.flipkart.vbroker.proto.ProtoQueue parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.ProtoQueue parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.flipkart.vbroker.proto.ProtoQueue parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.ProtoQueue parseFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.ProtoQueue parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.ProtoQueue parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.ProtoQueue parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.ProtoQueue parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.ProtoQueue parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.flipkart.vbroker.proto.ProtoQueue prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public static com.flipkart.vbroker.proto.ProtoQueue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<ProtoQueue> parser() {
        return PARSER;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return com.flipkart.vbroker.proto.PEntities.internal_static_proto_ProtoQueue_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.flipkart.vbroker.proto.ProtoQueue.class, com.flipkart.vbroker.proto.ProtoQueue.Builder.class);
    }

    /**
     * <code>optional int32 id = 1;</code>
     */
    public int getId() {
        return id_;
    }

    /**
     * <code>optional .proto.ProtoTopic topic = 2;</code>
     */
    public boolean hasTopic() {
        return topic_ != null;
    }

    /**
     * <code>optional .proto.ProtoTopic topic = 2;</code>
     */
    public com.flipkart.vbroker.proto.ProtoTopic getTopic() {
        return topic_ == null ? com.flipkart.vbroker.proto.ProtoTopic.getDefaultInstance() : topic_;
    }

    /**
     * <code>optional .proto.ProtoTopic topic = 2;</code>
     */
    public com.flipkart.vbroker.proto.ProtoTopicOrBuilder getTopicOrBuilder() {
        return getTopic();
    }

    /**
     * <code>optional .proto.ProtoSubscription subscription = 3;</code>
     */
    public boolean hasSubscription() {
        return subscription_ != null;
    }

    /**
     * <code>optional .proto.ProtoSubscription subscription = 3;</code>
     */
    public com.flipkart.vbroker.proto.ProtoSubscription getSubscription() {
        return subscription_ == null ? com.flipkart.vbroker.proto.ProtoSubscription.getDefaultInstance() : subscription_;
    }

    /**
     * <code>optional .proto.ProtoSubscription subscription = 3;</code>
     */
    public com.flipkart.vbroker.proto.ProtoSubscriptionOrBuilder getSubscriptionOrBuilder() {
        return getSubscription();
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
        if (id_ != 0) {
            output.writeInt32(1, id_);
        }
        if (topic_ != null) {
            output.writeMessage(2, getTopic());
        }
        if (subscription_ != null) {
            output.writeMessage(3, getSubscription());
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (id_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                .computeInt32Size(1, id_);
        }
        if (topic_ != null) {
            size += com.google.protobuf.CodedOutputStream
                .computeMessageSize(2, getTopic());
        }
        if (subscription_ != null) {
            size += com.google.protobuf.CodedOutputStream
                .computeMessageSize(3, getSubscription());
        }
        memoizedSize = size;
        return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.flipkart.vbroker.proto.ProtoQueue)) {
            return super.equals(obj);
        }
        com.flipkart.vbroker.proto.ProtoQueue other = (com.flipkart.vbroker.proto.ProtoQueue) obj;

        boolean result = true;
        result = result && (getId()
            == other.getId());
        result = result && (hasTopic() == other.hasTopic());
        if (hasTopic()) {
            result = result && getTopic()
                .equals(other.getTopic());
        }
        result = result && (hasSubscription() == other.hasSubscription());
        if (hasSubscription()) {
            result = result && getSubscription()
                .equals(other.getSubscription());
        }
        return result;
    }

    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptorForType().hashCode();
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId();
        if (hasTopic()) {
            hash = (37 * hash) + TOPIC_FIELD_NUMBER;
            hash = (53 * hash) + getTopic().hashCode();
        }
        if (hasSubscription()) {
            hash = (37 * hash) + SUBSCRIPTION_FIELD_NUMBER;
            hash = (53 * hash) + getSubscription().hashCode();
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
    public com.google.protobuf.Parser<ProtoQueue> getParserForType() {
        return PARSER;
    }

    public com.flipkart.vbroker.proto.ProtoQueue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    /**
     * Protobuf type {@code proto.ProtoQueue}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ProtoQueue)
        com.flipkart.vbroker.proto.ProtoQueueOrBuilder {
        private int id_;
        private com.flipkart.vbroker.proto.ProtoTopic topic_ = null;
        private com.google.protobuf.SingleFieldBuilderV3<
            com.flipkart.vbroker.proto.ProtoTopic, com.flipkart.vbroker.proto.ProtoTopic.Builder, com.flipkart.vbroker.proto.ProtoTopicOrBuilder> topicBuilder_;
        private com.flipkart.vbroker.proto.ProtoSubscription subscription_ = null;
        private com.google.protobuf.SingleFieldBuilderV3<
            com.flipkart.vbroker.proto.ProtoSubscription, com.flipkart.vbroker.proto.ProtoSubscription.Builder, com.flipkart.vbroker.proto.ProtoSubscriptionOrBuilder> subscriptionBuilder_;

        // Construct using com.flipkart.vbroker.proto.ProtoQueue.newBuilder()
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
            return com.flipkart.vbroker.proto.PEntities.internal_static_proto_ProtoQueue_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.flipkart.vbroker.proto.PEntities.internal_static_proto_ProtoQueue_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    com.flipkart.vbroker.proto.ProtoQueue.class, com.flipkart.vbroker.proto.ProtoQueue.Builder.class);
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
            }
        }

        public Builder clear() {
            super.clear();
            id_ = 0;

            if (topicBuilder_ == null) {
                topic_ = null;
            } else {
                topic_ = null;
                topicBuilder_ = null;
            }
            if (subscriptionBuilder_ == null) {
                subscription_ = null;
            } else {
                subscription_ = null;
                subscriptionBuilder_ = null;
            }
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return com.flipkart.vbroker.proto.PEntities.internal_static_proto_ProtoQueue_descriptor;
        }

        public com.flipkart.vbroker.proto.ProtoQueue getDefaultInstanceForType() {
            return com.flipkart.vbroker.proto.ProtoQueue.getDefaultInstance();
        }

        public com.flipkart.vbroker.proto.ProtoQueue build() {
            com.flipkart.vbroker.proto.ProtoQueue result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public com.flipkart.vbroker.proto.ProtoQueue buildPartial() {
            com.flipkart.vbroker.proto.ProtoQueue result = new com.flipkart.vbroker.proto.ProtoQueue(this);
            result.id_ = id_;
            if (topicBuilder_ == null) {
                result.topic_ = topic_;
            } else {
                result.topic_ = topicBuilder_.build();
            }
            if (subscriptionBuilder_ == null) {
                result.subscription_ = subscription_;
            } else {
                result.subscription_ = subscriptionBuilder_.build();
            }
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
            if (other instanceof com.flipkart.vbroker.proto.ProtoQueue) {
                return mergeFrom((com.flipkart.vbroker.proto.ProtoQueue) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(com.flipkart.vbroker.proto.ProtoQueue other) {
            if (other == com.flipkart.vbroker.proto.ProtoQueue.getDefaultInstance()) return this;
            if (other.getId() != 0) {
                setId(other.getId());
            }
            if (other.hasTopic()) {
                mergeTopic(other.getTopic());
            }
            if (other.hasSubscription()) {
                mergeSubscription(other.getSubscription());
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
            com.flipkart.vbroker.proto.ProtoQueue parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (com.flipkart.vbroker.proto.ProtoQueue) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        /**
         * <code>optional int32 id = 1;</code>
         */
        public int getId() {
            return id_;
        }

        /**
         * <code>optional int32 id = 1;</code>
         */
        public Builder setId(int value) {

            id_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 id = 1;</code>
         */
        public Builder clearId() {

            id_ = 0;
            onChanged();
            return this;
        }

        /**
         * <code>optional .proto.ProtoTopic topic = 2;</code>
         */
        public boolean hasTopic() {
            return topicBuilder_ != null || topic_ != null;
        }

        /**
         * <code>optional .proto.ProtoTopic topic = 2;</code>
         */
        public com.flipkart.vbroker.proto.ProtoTopic getTopic() {
            if (topicBuilder_ == null) {
                return topic_ == null ? com.flipkart.vbroker.proto.ProtoTopic.getDefaultInstance() : topic_;
            } else {
                return topicBuilder_.getMessage();
            }
        }

        /**
         * <code>optional .proto.ProtoTopic topic = 2;</code>
         */
        public Builder setTopic(
            com.flipkart.vbroker.proto.ProtoTopic.Builder builderForValue) {
            if (topicBuilder_ == null) {
                topic_ = builderForValue.build();
                onChanged();
            } else {
                topicBuilder_.setMessage(builderForValue.build());
            }

            return this;
        }

        /**
         * <code>optional .proto.ProtoTopic topic = 2;</code>
         */
        public Builder setTopic(com.flipkart.vbroker.proto.ProtoTopic value) {
            if (topicBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                topic_ = value;
                onChanged();
            } else {
                topicBuilder_.setMessage(value);
            }

            return this;
        }

        /**
         * <code>optional .proto.ProtoTopic topic = 2;</code>
         */
        public Builder mergeTopic(com.flipkart.vbroker.proto.ProtoTopic value) {
            if (topicBuilder_ == null) {
                if (topic_ != null) {
                    topic_ =
                        com.flipkart.vbroker.proto.ProtoTopic.newBuilder(topic_).mergeFrom(value).buildPartial();
                } else {
                    topic_ = value;
                }
                onChanged();
            } else {
                topicBuilder_.mergeFrom(value);
            }

            return this;
        }

        /**
         * <code>optional .proto.ProtoTopic topic = 2;</code>
         */
        public Builder clearTopic() {
            if (topicBuilder_ == null) {
                topic_ = null;
                onChanged();
            } else {
                topic_ = null;
                topicBuilder_ = null;
            }

            return this;
        }

        /**
         * <code>optional .proto.ProtoTopic topic = 2;</code>
         */
        public com.flipkart.vbroker.proto.ProtoTopic.Builder getTopicBuilder() {

            onChanged();
            return getTopicFieldBuilder().getBuilder();
        }

        /**
         * <code>optional .proto.ProtoTopic topic = 2;</code>
         */
        public com.flipkart.vbroker.proto.ProtoTopicOrBuilder getTopicOrBuilder() {
            if (topicBuilder_ != null) {
                return topicBuilder_.getMessageOrBuilder();
            } else {
                return topic_ == null ?
                    com.flipkart.vbroker.proto.ProtoTopic.getDefaultInstance() : topic_;
            }
        }

        /**
         * <code>optional .proto.ProtoTopic topic = 2;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
            com.flipkart.vbroker.proto.ProtoTopic, com.flipkart.vbroker.proto.ProtoTopic.Builder, com.flipkart.vbroker.proto.ProtoTopicOrBuilder>
        getTopicFieldBuilder() {
            if (topicBuilder_ == null) {
                topicBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                    com.flipkart.vbroker.proto.ProtoTopic, com.flipkart.vbroker.proto.ProtoTopic.Builder, com.flipkart.vbroker.proto.ProtoTopicOrBuilder>(
                    getTopic(),
                    getParentForChildren(),
                    isClean());
                topic_ = null;
            }
            return topicBuilder_;
        }

        /**
         * <code>optional .proto.ProtoSubscription subscription = 3;</code>
         */
        public boolean hasSubscription() {
            return subscriptionBuilder_ != null || subscription_ != null;
        }

        /**
         * <code>optional .proto.ProtoSubscription subscription = 3;</code>
         */
        public com.flipkart.vbroker.proto.ProtoSubscription getSubscription() {
            if (subscriptionBuilder_ == null) {
                return subscription_ == null ? com.flipkart.vbroker.proto.ProtoSubscription.getDefaultInstance() : subscription_;
            } else {
                return subscriptionBuilder_.getMessage();
            }
        }

        /**
         * <code>optional .proto.ProtoSubscription subscription = 3;</code>
         */
        public Builder setSubscription(
            com.flipkart.vbroker.proto.ProtoSubscription.Builder builderForValue) {
            if (subscriptionBuilder_ == null) {
                subscription_ = builderForValue.build();
                onChanged();
            } else {
                subscriptionBuilder_.setMessage(builderForValue.build());
            }

            return this;
        }

        /**
         * <code>optional .proto.ProtoSubscription subscription = 3;</code>
         */
        public Builder setSubscription(com.flipkart.vbroker.proto.ProtoSubscription value) {
            if (subscriptionBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                subscription_ = value;
                onChanged();
            } else {
                subscriptionBuilder_.setMessage(value);
            }

            return this;
        }

        /**
         * <code>optional .proto.ProtoSubscription subscription = 3;</code>
         */
        public Builder mergeSubscription(com.flipkart.vbroker.proto.ProtoSubscription value) {
            if (subscriptionBuilder_ == null) {
                if (subscription_ != null) {
                    subscription_ =
                        com.flipkart.vbroker.proto.ProtoSubscription.newBuilder(subscription_).mergeFrom(value).buildPartial();
                } else {
                    subscription_ = value;
                }
                onChanged();
            } else {
                subscriptionBuilder_.mergeFrom(value);
            }

            return this;
        }

        /**
         * <code>optional .proto.ProtoSubscription subscription = 3;</code>
         */
        public Builder clearSubscription() {
            if (subscriptionBuilder_ == null) {
                subscription_ = null;
                onChanged();
            } else {
                subscription_ = null;
                subscriptionBuilder_ = null;
            }

            return this;
        }

        /**
         * <code>optional .proto.ProtoSubscription subscription = 3;</code>
         */
        public com.flipkart.vbroker.proto.ProtoSubscription.Builder getSubscriptionBuilder() {

            onChanged();
            return getSubscriptionFieldBuilder().getBuilder();
        }

        /**
         * <code>optional .proto.ProtoSubscription subscription = 3;</code>
         */
        public com.flipkart.vbroker.proto.ProtoSubscriptionOrBuilder getSubscriptionOrBuilder() {
            if (subscriptionBuilder_ != null) {
                return subscriptionBuilder_.getMessageOrBuilder();
            } else {
                return subscription_ == null ?
                    com.flipkart.vbroker.proto.ProtoSubscription.getDefaultInstance() : subscription_;
            }
        }

        /**
         * <code>optional .proto.ProtoSubscription subscription = 3;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
            com.flipkart.vbroker.proto.ProtoSubscription, com.flipkart.vbroker.proto.ProtoSubscription.Builder, com.flipkart.vbroker.proto.ProtoSubscriptionOrBuilder>
        getSubscriptionFieldBuilder() {
            if (subscriptionBuilder_ == null) {
                subscriptionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                    com.flipkart.vbroker.proto.ProtoSubscription, com.flipkart.vbroker.proto.ProtoSubscription.Builder, com.flipkart.vbroker.proto.ProtoSubscriptionOrBuilder>(
                    getSubscription(),
                    getParentForChildren(),
                    isClean());
                subscription_ = null;
            }
            return subscriptionBuilder_;
        }

        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }

        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }


        // @@protoc_insertion_point(builder_scope:proto.ProtoQueue)
    }

}

