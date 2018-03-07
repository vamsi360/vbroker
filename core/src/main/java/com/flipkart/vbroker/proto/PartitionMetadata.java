// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entities.proto

package com.flipkart.vbroker.proto;

/**
 * Protobuf type {@code proto.PartitionMetadata}
 */
public final class PartitionMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.PartitionMetadata)
    PartitionMetadataOrBuilder {
    public static final int ID_FIELD_NUMBER = 1;
    public static final int TOPICID_FIELD_NUMBER = 2;
    public static final int LEADERID_FIELD_NUMBER = 3;
    public static final int REPLICAS_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0L;
    // @@protoc_insertion_point(class_scope:proto.PartitionMetadata)
    private static final com.flipkart.vbroker.proto.PartitionMetadata DEFAULT_INSTANCE;
    private static final com.google.protobuf.Parser<PartitionMetadata>
        PARSER = new com.google.protobuf.AbstractParser<PartitionMetadata>() {
        public PartitionMetadata parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return new PartitionMetadata(input, extensionRegistry);
        }
    };

    static {
        DEFAULT_INSTANCE = new com.flipkart.vbroker.proto.PartitionMetadata();
    }

    private int bitField0_;
    private int id_;
    private int topicId_;
    private int leaderId_;
    private java.util.List<java.lang.Integer> replicas_;
    private int replicasMemoizedSerializedSize = -1;
    private byte memoizedIsInitialized = -1;

    // Use PartitionMetadata.newBuilder() to construct.
    private PartitionMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private PartitionMetadata() {
        id_ = 0;
        topicId_ = 0;
        leaderId_ = 0;
        replicas_ = java.util.Collections.emptyList();
    }
    private PartitionMetadata(
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
                    case 16: {

                        topicId_ = input.readInt32();
                        break;
                    }
                    case 24: {

                        leaderId_ = input.readInt32();
                        break;
                    }
                    case 32: {
                        if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                            replicas_ = new java.util.ArrayList<java.lang.Integer>();
                            mutable_bitField0_ |= 0x00000008;
                        }
                        replicas_.add(input.readInt32());
                        break;
                    }
                    case 34: {
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if (!((mutable_bitField0_ & 0x00000008) == 0x00000008) && input.getBytesUntilLimit() > 0) {
                            replicas_ = new java.util.ArrayList<java.lang.Integer>();
                            mutable_bitField0_ |= 0x00000008;
                        }
                        while (input.getBytesUntilLimit() > 0) {
                            replicas_.add(input.readInt32());
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
            if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                replicas_ = java.util.Collections.unmodifiableList(replicas_);
            }
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return com.flipkart.vbroker.proto.PEntities.internal_static_proto_PartitionMetadata_descriptor;
    }

    public static com.flipkart.vbroker.proto.PartitionMetadata parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.flipkart.vbroker.proto.PartitionMetadata parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.PartitionMetadata parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.flipkart.vbroker.proto.PartitionMetadata parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.PartitionMetadata parseFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.PartitionMetadata parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.PartitionMetadata parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.PartitionMetadata parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.PartitionMetadata parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.PartitionMetadata parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.flipkart.vbroker.proto.PartitionMetadata prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public static com.flipkart.vbroker.proto.PartitionMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<PartitionMetadata> parser() {
        return PARSER;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return com.flipkart.vbroker.proto.PEntities.internal_static_proto_PartitionMetadata_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.flipkart.vbroker.proto.PartitionMetadata.class, com.flipkart.vbroker.proto.PartitionMetadata.Builder.class);
    }

    /**
     * <code>optional int32 id = 1;</code>
     */
    public int getId() {
        return id_;
    }

    /**
     * <code>optional int32 topicId = 2;</code>
     */
    public int getTopicId() {
        return topicId_;
    }

    /**
     * <code>optional int32 leaderId = 3;</code>
     */
    public int getLeaderId() {
        return leaderId_;
    }

    /**
     * <code>repeated int32 replicas = 4;</code>
     */
    public java.util.List<java.lang.Integer>
    getReplicasList() {
        return replicas_;
    }

    /**
     * <code>repeated int32 replicas = 4;</code>
     */
    public int getReplicasCount() {
        return replicas_.size();
    }

    /**
     * <code>repeated int32 replicas = 4;</code>
     */
    public int getReplicas(int index) {
        return replicas_.get(index);
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
        if (id_ != 0) {
            output.writeInt32(1, id_);
        }
        if (topicId_ != 0) {
            output.writeInt32(2, topicId_);
        }
        if (leaderId_ != 0) {
            output.writeInt32(3, leaderId_);
        }
        if (getReplicasList().size() > 0) {
            output.writeUInt32NoTag(34);
            output.writeUInt32NoTag(replicasMemoizedSerializedSize);
        }
        for (int i = 0; i < replicas_.size(); i++) {
            output.writeInt32NoTag(replicas_.get(i));
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
        if (topicId_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                .computeInt32Size(2, topicId_);
        }
        if (leaderId_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                .computeInt32Size(3, leaderId_);
        }
        {
            int dataSize = 0;
            for (int i = 0; i < replicas_.size(); i++) {
                dataSize += com.google.protobuf.CodedOutputStream
                    .computeInt32SizeNoTag(replicas_.get(i));
            }
            size += dataSize;
            if (!getReplicasList().isEmpty()) {
                size += 1;
                size += com.google.protobuf.CodedOutputStream
                    .computeInt32SizeNoTag(dataSize);
            }
            replicasMemoizedSerializedSize = dataSize;
        }
        memoizedSize = size;
        return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.flipkart.vbroker.proto.PartitionMetadata)) {
            return super.equals(obj);
        }
        com.flipkart.vbroker.proto.PartitionMetadata other = (com.flipkart.vbroker.proto.PartitionMetadata) obj;

        boolean result = true;
        result = result && (getId()
            == other.getId());
        result = result && (getTopicId()
            == other.getTopicId());
        result = result && (getLeaderId()
            == other.getLeaderId());
        result = result && getReplicasList()
            .equals(other.getReplicasList());
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
        hash = (37 * hash) + TOPICID_FIELD_NUMBER;
        hash = (53 * hash) + getTopicId();
        hash = (37 * hash) + LEADERID_FIELD_NUMBER;
        hash = (53 * hash) + getLeaderId();
        if (getReplicasCount() > 0) {
            hash = (37 * hash) + REPLICAS_FIELD_NUMBER;
            hash = (53 * hash) + getReplicasList().hashCode();
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
    public com.google.protobuf.Parser<PartitionMetadata> getParserForType() {
        return PARSER;
    }

    public com.flipkart.vbroker.proto.PartitionMetadata getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    /**
     * Protobuf type {@code proto.PartitionMetadata}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.PartitionMetadata)
        com.flipkart.vbroker.proto.PartitionMetadataOrBuilder {
        private int bitField0_;
        private int id_;
        private int topicId_;
        private int leaderId_;
        private java.util.List<java.lang.Integer> replicas_ = java.util.Collections.emptyList();

        // Construct using com.flipkart.vbroker.proto.PartitionMetadata.newBuilder()
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
            return com.flipkart.vbroker.proto.PEntities.internal_static_proto_PartitionMetadata_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.flipkart.vbroker.proto.PEntities.internal_static_proto_PartitionMetadata_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    com.flipkart.vbroker.proto.PartitionMetadata.class, com.flipkart.vbroker.proto.PartitionMetadata.Builder.class);
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
            }
        }

        public Builder clear() {
            super.clear();
            id_ = 0;

            topicId_ = 0;

            leaderId_ = 0;

            replicas_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000008);
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return com.flipkart.vbroker.proto.PEntities.internal_static_proto_PartitionMetadata_descriptor;
        }

        public com.flipkart.vbroker.proto.PartitionMetadata getDefaultInstanceForType() {
            return com.flipkart.vbroker.proto.PartitionMetadata.getDefaultInstance();
        }

        public com.flipkart.vbroker.proto.PartitionMetadata build() {
            com.flipkart.vbroker.proto.PartitionMetadata result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public com.flipkart.vbroker.proto.PartitionMetadata buildPartial() {
            com.flipkart.vbroker.proto.PartitionMetadata result = new com.flipkart.vbroker.proto.PartitionMetadata(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            result.id_ = id_;
            result.topicId_ = topicId_;
            result.leaderId_ = leaderId_;
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                replicas_ = java.util.Collections.unmodifiableList(replicas_);
                bitField0_ = (bitField0_ & ~0x00000008);
            }
            result.replicas_ = replicas_;
            result.bitField0_ = to_bitField0_;
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
            if (other instanceof com.flipkart.vbroker.proto.PartitionMetadata) {
                return mergeFrom((com.flipkart.vbroker.proto.PartitionMetadata) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(com.flipkart.vbroker.proto.PartitionMetadata other) {
            if (other == com.flipkart.vbroker.proto.PartitionMetadata.getDefaultInstance()) return this;
            if (other.getId() != 0) {
                setId(other.getId());
            }
            if (other.getTopicId() != 0) {
                setTopicId(other.getTopicId());
            }
            if (other.getLeaderId() != 0) {
                setLeaderId(other.getLeaderId());
            }
            if (!other.replicas_.isEmpty()) {
                if (replicas_.isEmpty()) {
                    replicas_ = other.replicas_;
                    bitField0_ = (bitField0_ & ~0x00000008);
                } else {
                    ensureReplicasIsMutable();
                    replicas_.addAll(other.replicas_);
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
            com.flipkart.vbroker.proto.PartitionMetadata parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (com.flipkart.vbroker.proto.PartitionMetadata) e.getUnfinishedMessage();
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
         * <code>optional int32 topicId = 2;</code>
         */
        public int getTopicId() {
            return topicId_;
        }

        /**
         * <code>optional int32 topicId = 2;</code>
         */
        public Builder setTopicId(int value) {

            topicId_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 topicId = 2;</code>
         */
        public Builder clearTopicId() {

            topicId_ = 0;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 leaderId = 3;</code>
         */
        public int getLeaderId() {
            return leaderId_;
        }

        /**
         * <code>optional int32 leaderId = 3;</code>
         */
        public Builder setLeaderId(int value) {

            leaderId_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 leaderId = 3;</code>
         */
        public Builder clearLeaderId() {

            leaderId_ = 0;
            onChanged();
            return this;
        }

        private void ensureReplicasIsMutable() {
            if (!((bitField0_ & 0x00000008) == 0x00000008)) {
                replicas_ = new java.util.ArrayList<java.lang.Integer>(replicas_);
                bitField0_ |= 0x00000008;
            }
        }

        /**
         * <code>repeated int32 replicas = 4;</code>
         */
        public java.util.List<java.lang.Integer>
        getReplicasList() {
            return java.util.Collections.unmodifiableList(replicas_);
        }

        /**
         * <code>repeated int32 replicas = 4;</code>
         */
        public int getReplicasCount() {
            return replicas_.size();
        }

        /**
         * <code>repeated int32 replicas = 4;</code>
         */
        public int getReplicas(int index) {
            return replicas_.get(index);
        }

        /**
         * <code>repeated int32 replicas = 4;</code>
         */
        public Builder setReplicas(
            int index, int value) {
            ensureReplicasIsMutable();
            replicas_.set(index, value);
            onChanged();
            return this;
        }

        /**
         * <code>repeated int32 replicas = 4;</code>
         */
        public Builder addReplicas(int value) {
            ensureReplicasIsMutable();
            replicas_.add(value);
            onChanged();
            return this;
        }

        /**
         * <code>repeated int32 replicas = 4;</code>
         */
        public Builder addAllReplicas(
            java.lang.Iterable<? extends java.lang.Integer> values) {
            ensureReplicasIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(
                values, replicas_);
            onChanged();
            return this;
        }

        /**
         * <code>repeated int32 replicas = 4;</code>
         */
        public Builder clearReplicas() {
            replicas_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000008);
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


        // @@protoc_insertion_point(builder_scope:proto.PartitionMetadata)
    }

}

