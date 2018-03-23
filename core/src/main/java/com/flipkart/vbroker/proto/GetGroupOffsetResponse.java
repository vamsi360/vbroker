// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: responses.proto

package com.flipkart.vbroker.proto;

/**
 * <pre>
 * get offset
 * </pre>
 * <p>
 * Protobuf type {@code proto.GetGroupOffsetResponse}
 */
public final class GetGroupOffsetResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.GetGroupOffsetResponse)
    GetGroupOffsetResponseOrBuilder {
    public static final int GROUPID_FIELD_NUMBER = 1;
    public static final int OFFSET_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0L;
    // @@protoc_insertion_point(class_scope:proto.GetGroupOffsetResponse)
    private static final com.flipkart.vbroker.proto.GetGroupOffsetResponse DEFAULT_INSTANCE;
    private static final com.google.protobuf.Parser<GetGroupOffsetResponse>
        PARSER = new com.google.protobuf.AbstractParser<GetGroupOffsetResponse>() {
        public GetGroupOffsetResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return new GetGroupOffsetResponse(input, extensionRegistry);
        }
    };

    static {
        DEFAULT_INSTANCE = new com.flipkart.vbroker.proto.GetGroupOffsetResponse();
    }

    private volatile java.lang.Object groupId_;
    private int offset_;
    private com.flipkart.vbroker.proto.VStatus status_;
    private byte memoizedIsInitialized = -1;

    // Use GetGroupOffsetResponse.newBuilder() to construct.
    private GetGroupOffsetResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }
    private GetGroupOffsetResponse() {
        groupId_ = "";
        offset_ = 0;
    }

    private GetGroupOffsetResponse(
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
                        java.lang.String s = input.readStringRequireUtf8();

                        groupId_ = s;
                        break;
                    }
                    case 16: {

                        offset_ = input.readInt32();
                        break;
                    }
                    case 26: {
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
                }
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(
                e).setUnfinishedMessage(this);
        } finally {
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return com.flipkart.vbroker.proto.PResponses.internal_static_proto_GetGroupOffsetResponse_descriptor;
    }

    public static com.flipkart.vbroker.proto.GetGroupOffsetResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.flipkart.vbroker.proto.GetGroupOffsetResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetGroupOffsetResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.flipkart.vbroker.proto.GetGroupOffsetResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetGroupOffsetResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.flipkart.vbroker.proto.GetGroupOffsetResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetGroupOffsetResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.GetGroupOffsetResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetGroupOffsetResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.GetGroupOffsetResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.flipkart.vbroker.proto.GetGroupOffsetResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
    }

    public static com.flipkart.vbroker.proto.GetGroupOffsetResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.flipkart.vbroker.proto.GetGroupOffsetResponse prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public static com.flipkart.vbroker.proto.GetGroupOffsetResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<GetGroupOffsetResponse> parser() {
        return PARSER;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return com.flipkart.vbroker.proto.PResponses.internal_static_proto_GetGroupOffsetResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.flipkart.vbroker.proto.GetGroupOffsetResponse.class, com.flipkart.vbroker.proto.GetGroupOffsetResponse.Builder.class);
    }

    /**
     * <code>string groupId = 1;</code>
     */
    public java.lang.String getGroupId() {
        java.lang.Object ref = groupId_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            groupId_ = s;
            return s;
        }
    }

    /**
     * <code>string groupId = 1;</code>
     */
    public com.google.protobuf.ByteString
    getGroupIdBytes() {
        java.lang.Object ref = groupId_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            groupId_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    /**
     * <code>int32 offset = 2;</code>
     */
    public int getOffset() {
        return offset_;
    }

    /**
     * <code>.proto.VStatus status = 3;</code>
     */
    public boolean hasStatus() {
        return status_ != null;
    }

    /**
     * <code>.proto.VStatus status = 3;</code>
     */
    public com.flipkart.vbroker.proto.VStatus getStatus() {
        return status_ == null ? com.flipkart.vbroker.proto.VStatus.getDefaultInstance() : status_;
    }

    /**
     * <code>.proto.VStatus status = 3;</code>
     */
    public com.flipkart.vbroker.proto.VStatusOrBuilder getStatusOrBuilder() {
        return getStatus();
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
        if (!getGroupIdBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupId_);
        }
        if (offset_ != 0) {
            output.writeInt32(2, offset_);
        }
        if (status_ != null) {
            output.writeMessage(3, getStatus());
        }
        unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (!getGroupIdBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupId_);
        }
        if (offset_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                .computeInt32Size(2, offset_);
        }
        if (status_ != null) {
            size += com.google.protobuf.CodedOutputStream
                .computeMessageSize(3, getStatus());
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
        if (!(obj instanceof com.flipkart.vbroker.proto.GetGroupOffsetResponse)) {
            return super.equals(obj);
        }
        com.flipkart.vbroker.proto.GetGroupOffsetResponse other = (com.flipkart.vbroker.proto.GetGroupOffsetResponse) obj;

        boolean result = true;
        result = result && getGroupId()
            .equals(other.getGroupId());
        result = result && (getOffset()
            == other.getOffset());
        result = result && (hasStatus() == other.hasStatus());
        if (hasStatus()) {
            result = result && getStatus()
                .equals(other.getStatus());
        }
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
        hash = (37 * hash) + GROUPID_FIELD_NUMBER;
        hash = (53 * hash) + getGroupId().hashCode();
        hash = (37 * hash) + OFFSET_FIELD_NUMBER;
        hash = (53 * hash) + getOffset();
        if (hasStatus()) {
            hash = (37 * hash) + STATUS_FIELD_NUMBER;
            hash = (53 * hash) + getStatus().hashCode();
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
    public com.google.protobuf.Parser<GetGroupOffsetResponse> getParserForType() {
        return PARSER;
    }

    public com.flipkart.vbroker.proto.GetGroupOffsetResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    /**
     * <pre>
     * get offset
     * </pre>
     * <p>
     * Protobuf type {@code proto.GetGroupOffsetResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.GetGroupOffsetResponse)
        com.flipkart.vbroker.proto.GetGroupOffsetResponseOrBuilder {
        private java.lang.Object groupId_ = "";
        private int offset_;
        private com.flipkart.vbroker.proto.VStatus status_ = null;
        private com.google.protobuf.SingleFieldBuilderV3<
            com.flipkart.vbroker.proto.VStatus, com.flipkart.vbroker.proto.VStatus.Builder, com.flipkart.vbroker.proto.VStatusOrBuilder> statusBuilder_;

        // Construct using com.flipkart.vbroker.proto.GetGroupOffsetResponse.newBuilder()
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
            return com.flipkart.vbroker.proto.PResponses.internal_static_proto_GetGroupOffsetResponse_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.flipkart.vbroker.proto.PResponses.internal_static_proto_GetGroupOffsetResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    com.flipkart.vbroker.proto.GetGroupOffsetResponse.class, com.flipkart.vbroker.proto.GetGroupOffsetResponse.Builder.class);
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
            }
        }

        public Builder clear() {
            super.clear();
            groupId_ = "";

            offset_ = 0;

            if (statusBuilder_ == null) {
                status_ = null;
            } else {
                status_ = null;
                statusBuilder_ = null;
            }
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return com.flipkart.vbroker.proto.PResponses.internal_static_proto_GetGroupOffsetResponse_descriptor;
        }

        public com.flipkart.vbroker.proto.GetGroupOffsetResponse getDefaultInstanceForType() {
            return com.flipkart.vbroker.proto.GetGroupOffsetResponse.getDefaultInstance();
        }

        public com.flipkart.vbroker.proto.GetGroupOffsetResponse build() {
            com.flipkart.vbroker.proto.GetGroupOffsetResponse result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public com.flipkart.vbroker.proto.GetGroupOffsetResponse buildPartial() {
            com.flipkart.vbroker.proto.GetGroupOffsetResponse result = new com.flipkart.vbroker.proto.GetGroupOffsetResponse(this);
            result.groupId_ = groupId_;
            result.offset_ = offset_;
            if (statusBuilder_ == null) {
                result.status_ = status_;
            } else {
                result.status_ = statusBuilder_.build();
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
            if (other instanceof com.flipkart.vbroker.proto.GetGroupOffsetResponse) {
                return mergeFrom((com.flipkart.vbroker.proto.GetGroupOffsetResponse) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(com.flipkart.vbroker.proto.GetGroupOffsetResponse other) {
            if (other == com.flipkart.vbroker.proto.GetGroupOffsetResponse.getDefaultInstance()) return this;
            if (!other.getGroupId().isEmpty()) {
                groupId_ = other.groupId_;
                onChanged();
            }
            if (other.getOffset() != 0) {
                setOffset(other.getOffset());
            }
            if (other.hasStatus()) {
                mergeStatus(other.getStatus());
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
            com.flipkart.vbroker.proto.GetGroupOffsetResponse parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (com.flipkart.vbroker.proto.GetGroupOffsetResponse) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        /**
         * <code>string groupId = 1;</code>
         */
        public java.lang.String getGroupId() {
            java.lang.Object ref = groupId_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                groupId_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>string groupId = 1;</code>
         */
        public Builder setGroupId(
            java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            groupId_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>string groupId = 1;</code>
         */
        public com.google.protobuf.ByteString
        getGroupIdBytes() {
            java.lang.Object ref = groupId_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
                groupId_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string groupId = 1;</code>
         */
        public Builder setGroupIdBytes(
            com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            groupId_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>string groupId = 1;</code>
         */
        public Builder clearGroupId() {

            groupId_ = getDefaultInstance().getGroupId();
            onChanged();
            return this;
        }

        /**
         * <code>int32 offset = 2;</code>
         */
        public int getOffset() {
            return offset_;
        }

        /**
         * <code>int32 offset = 2;</code>
         */
        public Builder setOffset(int value) {

            offset_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>int32 offset = 2;</code>
         */
        public Builder clearOffset() {

            offset_ = 0;
            onChanged();
            return this;
        }

        /**
         * <code>.proto.VStatus status = 3;</code>
         */
        public boolean hasStatus() {
            return statusBuilder_ != null || status_ != null;
        }

        /**
         * <code>.proto.VStatus status = 3;</code>
         */
        public com.flipkart.vbroker.proto.VStatus getStatus() {
            if (statusBuilder_ == null) {
                return status_ == null ? com.flipkart.vbroker.proto.VStatus.getDefaultInstance() : status_;
            } else {
                return statusBuilder_.getMessage();
            }
        }

        /**
         * <code>.proto.VStatus status = 3;</code>
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
         * <code>.proto.VStatus status = 3;</code>
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
         * <code>.proto.VStatus status = 3;</code>
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
         * <code>.proto.VStatus status = 3;</code>
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
         * <code>.proto.VStatus status = 3;</code>
         */
        public com.flipkart.vbroker.proto.VStatus.Builder getStatusBuilder() {

            onChanged();
            return getStatusFieldBuilder().getBuilder();
        }

        /**
         * <code>.proto.VStatus status = 3;</code>
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
         * <code>.proto.VStatus status = 3;</code>
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

        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFieldsProto3(unknownFields);
        }

        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:proto.GetGroupOffsetResponse)
    }

}

