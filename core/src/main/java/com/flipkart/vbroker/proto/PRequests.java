// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: requests.proto

package com.flipkart.vbroker.proto;

public final class PRequests {
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_ProtoRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_ProtoRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_CreateTopicsRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_CreateTopicsRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_CreateSubscriptionsRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_CreateSubscriptionsRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_CreateQueuesRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_CreateQueuesRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_GetQueuesRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_GetQueuesRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_GetAllQueuesRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_GetAllQueuesRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_GetTopicsRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_GetTopicsRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_GetAllTopicsRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_GetAllTopicsRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_GetSubscriptionsRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_GetSubscriptionsRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_GetAllSubscriptionsForTopicsRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_GetAllSubscriptionsForTopicsRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_PartitionLagRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_PartitionLagRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_SubscriptionLagRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_SubscriptionLagRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_GetSubscriptionLagsRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_GetSubscriptionLagsRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_GetClusterMetadataRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_GetClusterMetadataRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_UnsidelineRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_UnsidelineRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_UnsidelineRequests_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_UnsidelineRequests_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_GroupOffset_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_GroupOffset_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_SetPartSubscriptionOffsetsRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_SetPartSubscriptionOffsetsRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_SetSubscriptionOffsetsRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_SetSubscriptionOffsetsRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_SetSubscriptionsOffsetsRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_SetSubscriptionsOffsetsRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_GetPartSubscriptionOffsetsRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_GetPartSubscriptionOffsetsRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_GetSubscriptionOffsetsRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_GetSubscriptionOffsetsRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_GetSubscriptionsOffsetsRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_GetSubscriptionsOffsetsRequest_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.FileDescriptor
        descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\016requests.proto\022\005proto\032\016entities.proto\"" +
                "\306\007\n\014ProtoRequest\0229\n\023createTopicsRequest\030" +
                "\001 \001(\0132\032.proto.CreateTopicsRequestH\000\022G\n\032c" +
                "reateSubscriptionsRequest\030\002 \001(\0132!.proto." +
                "CreateSubscriptionsRequestH\000\0229\n\023createQu" +
                "euesRequest\030\003 \001(\0132\032.proto.CreateQueuesRe" +
                "questH\000\0223\n\020getTopicsRequest\030\004 \001(\0132\027.prot" +
                "o.GetTopicsRequestH\000\0229\n\023getAllTopicsRequ" +
                "est\030\005 \001(\0132\032.proto.GetAllTopicsRequestH\000\022" +
                "A\n\027getSubscriptionsRequest\030\006 \001(\0132\036.proto" +
                ".GetSubscriptionsRequestH\000\022Y\n#getAllSubs" +
                "criptionsForTopicsRequest\030\007 \001(\0132*.proto." +
                "GetAllSubscriptionsForTopicsRequestH\000\0223\n" +
                "\020getQueuesRequest\030\010 \001(\0132\027.proto.GetQueue" +
                "sRequestH\000\0229\n\023getAllQueuesRequest\030\t \001(\0132" +
                "\032.proto.GetAllQueuesRequestH\000\022G\n\032getSubs" +
                "criptionLagsRequest\030\n \001(\0132!.proto.GetSub" +
                "scriptionLagsRequestH\000\022E\n\031getClusterMeta" +
                "dataRequest\030\013 \001(\0132 .proto.GetClusterMeta" +
                "dataRequestH\000\0227\n\022unsidelineRequests\030\014 \001(" +
                "\0132\031.proto.UnsidelineRequestsH\000\022O\n\036setSub" +
                "scriptionsOffsetsRequest\030\r \001(\0132%.proto.S" +
                "etSubscriptionsOffsetsRequestH\000\022O\n\036getSu" +
                "bscriptionsOffsetsRequest\030\016 \001(\0132%.proto." +
                "GetSubscriptionsOffsetsRequestH\000B\016\n\014prot" +
                "oRequest\"8\n\023CreateTopicsRequest\022!\n\006topic" +
                "s\030\001 \003(\0132\021.proto.ProtoTopic\"M\n\032CreateSubs" +
                "criptionsRequest\022/\n\rsubscriptions\030\001 \003(\0132" +
                "\030.proto.ProtoSubscription\"8\n\023CreateQueue" +
                "sRequest\022!\n\006queues\030\001 \003(\0132\021.proto.ProtoQu" +
                "eue\"\037\n\020GetQueuesRequest\022\013\n\003ids\030\001 \003(\005\"\025\n\023" +
                "GetAllQueuesRequest\"\037\n\020GetTopicsRequest\022" +
                "\013\n\003ids\030\001 \003(\005\"\025\n\023GetAllTopicsRequest\"J\n\027G" +
                "etSubscriptionsRequest\022/\n\rsubscriptions\030" +
                "\001 \003(\0132\030.proto.TopicSubscription\"7\n#GetAl" +
                "lSubscriptionsForTopicsRequest\022\020\n\010topicI" +
                "ds\030\001 \003(\005\"*\n\023PartitionLagRequest\022\023\n\013parti" +
                "tionId\030\001 \001(\005\"\200\001\n\026SubscriptionLagRequest\022" +
                "3\n\021topicSubscription\030\001 \001(\0132\030.proto.Topic" +
                "Subscription\0221\n\rpartitionLags\030\002 \003(\0132\032.pr" +
                "oto.PartitionLagRequest\"\\\n\032GetSubscripti" +
                "onLagsRequest\022>\n\027subscriptionLagRequests" +
                "\030\001 \003(\0132\035.proto.SubscriptionLagRequest\"-\n" +
                "\031GetClusterMetadataRequest\022\020\n\010topicIds\030\001" +
                " \003(\005\"Z\n\021UnsidelineRequest\0223\n\021topicSubscr" +
                "iption\030\001 \001(\0132\030.proto.TopicSubscription\022\020" +
                "\n\010groupIds\030\002 \003(\t\"J\n\022UnsidelineRequests\0224" +
                "\n\022unsidelineRequests\030\001 \003(\0132\030.proto.Unsid" +
                "elineRequest\".\n\013GroupOffset\022\017\n\007groupId\030\001" +
                " \001(\t\022\016\n\006offset\030\002 \001(\005\"b\n!SetPartSubscript" +
                "ionOffsetsRequest\022\023\n\013partitionId\030\001 \001(\005\022(" +
                "\n\014groupOffsets\030\002 \003(\0132\022.proto.GroupOffset" +
                "\"\252\001\n\035SetSubscriptionOffsetsRequest\0223\n\021to" +
                "picSubscription\030\001 \001(\0132\030.proto.TopicSubsc" +
                "ription\022T\n\"setPartSubscriptionOffsetsReq" +
                "uests\030\002 \003(\0132(.proto.SetPartSubscriptionO" +
                "ffsetsRequest\"n\n\036SetSubscriptionsOffsets" +
                "Request\022L\n\036setSubscriptionOffsetsRequest" +
                "s\030\001 \003(\0132$.proto.SetSubscriptionOffsetsRe" +
                "quest\"J\n!GetPartSubscriptionOffsetsReque" +
                "st\022\023\n\013partitionId\030\001 \001(\005\022\020\n\010groupIds\030\002 \003(" +
                "\t\"\252\001\n\035GetSubscriptionOffsetsRequest\0223\n\021t" +
                "opicSubscription\030\001 \001(\0132\030.proto.TopicSubs" +
                "cription\022T\n\"getPartSubscriptionOffsetsRe" +
                "quests\030\002 \003(\0132(.proto.GetPartSubscription" +
                "OffsetsRequest\"n\n\036GetSubscriptionsOffset" +
                "sRequest\022L\n\036getSubscriptionOffsetsReques" +
                "ts\030\001 \003(\0132$.proto.GetSubscriptionOffsetsR" +
                "equestB)\n\032com.flipkart.vbroker.protoB\tPR" +
                "equestsP\001b\006proto3"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
            new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                public com.google.protobuf.ExtensionRegistry assignDescriptors(
                    com.google.protobuf.Descriptors.FileDescriptor root) {
                    descriptor = root;
                    return null;
                }
            };
        com.google.protobuf.Descriptors.FileDescriptor
            .internalBuildGeneratedFileFrom(descriptorData,
                new com.google.protobuf.Descriptors.FileDescriptor[]{
                    com.flipkart.vbroker.proto.PEntities.getDescriptor(),
                }, assigner);
        internal_static_proto_ProtoRequest_descriptor =
            getDescriptor().getMessageTypes().get(0);
        internal_static_proto_ProtoRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_ProtoRequest_descriptor,
            new java.lang.String[]{"CreateTopicsRequest", "CreateSubscriptionsRequest", "CreateQueuesRequest", "GetTopicsRequest", "GetAllTopicsRequest", "GetSubscriptionsRequest", "GetAllSubscriptionsForTopicsRequest", "GetQueuesRequest", "GetAllQueuesRequest", "GetSubscriptionLagsRequest", "GetClusterMetadataRequest", "UnsidelineRequests", "SetSubscriptionsOffsetsRequest", "GetSubscriptionsOffsetsRequest", "ProtoRequest",});
        internal_static_proto_CreateTopicsRequest_descriptor =
            getDescriptor().getMessageTypes().get(1);
        internal_static_proto_CreateTopicsRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_CreateTopicsRequest_descriptor,
            new java.lang.String[]{"Topics",});
        internal_static_proto_CreateSubscriptionsRequest_descriptor =
            getDescriptor().getMessageTypes().get(2);
        internal_static_proto_CreateSubscriptionsRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_CreateSubscriptionsRequest_descriptor,
            new java.lang.String[]{"Subscriptions",});
        internal_static_proto_CreateQueuesRequest_descriptor =
            getDescriptor().getMessageTypes().get(3);
        internal_static_proto_CreateQueuesRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_CreateQueuesRequest_descriptor,
            new java.lang.String[]{"Queues",});
        internal_static_proto_GetQueuesRequest_descriptor =
            getDescriptor().getMessageTypes().get(4);
        internal_static_proto_GetQueuesRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_GetQueuesRequest_descriptor,
            new java.lang.String[]{"Ids",});
        internal_static_proto_GetAllQueuesRequest_descriptor =
            getDescriptor().getMessageTypes().get(5);
        internal_static_proto_GetAllQueuesRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_GetAllQueuesRequest_descriptor,
            new java.lang.String[]{});
        internal_static_proto_GetTopicsRequest_descriptor =
            getDescriptor().getMessageTypes().get(6);
        internal_static_proto_GetTopicsRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_GetTopicsRequest_descriptor,
            new java.lang.String[]{"Ids",});
        internal_static_proto_GetAllTopicsRequest_descriptor =
            getDescriptor().getMessageTypes().get(7);
        internal_static_proto_GetAllTopicsRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_GetAllTopicsRequest_descriptor,
            new java.lang.String[]{});
        internal_static_proto_GetSubscriptionsRequest_descriptor =
            getDescriptor().getMessageTypes().get(8);
        internal_static_proto_GetSubscriptionsRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_GetSubscriptionsRequest_descriptor,
            new java.lang.String[]{"Subscriptions",});
        internal_static_proto_GetAllSubscriptionsForTopicsRequest_descriptor =
            getDescriptor().getMessageTypes().get(9);
        internal_static_proto_GetAllSubscriptionsForTopicsRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_GetAllSubscriptionsForTopicsRequest_descriptor,
            new java.lang.String[]{"TopicIds",});
        internal_static_proto_PartitionLagRequest_descriptor =
            getDescriptor().getMessageTypes().get(10);
        internal_static_proto_PartitionLagRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_PartitionLagRequest_descriptor,
            new java.lang.String[]{"PartitionId",});
        internal_static_proto_SubscriptionLagRequest_descriptor =
            getDescriptor().getMessageTypes().get(11);
        internal_static_proto_SubscriptionLagRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_SubscriptionLagRequest_descriptor,
            new java.lang.String[]{"TopicSubscription", "PartitionLags",});
        internal_static_proto_GetSubscriptionLagsRequest_descriptor =
            getDescriptor().getMessageTypes().get(12);
        internal_static_proto_GetSubscriptionLagsRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_GetSubscriptionLagsRequest_descriptor,
            new java.lang.String[]{"SubscriptionLagRequests",});
        internal_static_proto_GetClusterMetadataRequest_descriptor =
            getDescriptor().getMessageTypes().get(13);
        internal_static_proto_GetClusterMetadataRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_GetClusterMetadataRequest_descriptor,
            new java.lang.String[]{"TopicIds",});
        internal_static_proto_UnsidelineRequest_descriptor =
            getDescriptor().getMessageTypes().get(14);
        internal_static_proto_UnsidelineRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_UnsidelineRequest_descriptor,
            new java.lang.String[]{"TopicSubscription", "GroupIds",});
        internal_static_proto_UnsidelineRequests_descriptor =
            getDescriptor().getMessageTypes().get(15);
        internal_static_proto_UnsidelineRequests_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_UnsidelineRequests_descriptor,
            new java.lang.String[]{"UnsidelineRequests",});
        internal_static_proto_GroupOffset_descriptor =
            getDescriptor().getMessageTypes().get(16);
        internal_static_proto_GroupOffset_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_GroupOffset_descriptor,
            new java.lang.String[]{"GroupId", "Offset",});
        internal_static_proto_SetPartSubscriptionOffsetsRequest_descriptor =
            getDescriptor().getMessageTypes().get(17);
        internal_static_proto_SetPartSubscriptionOffsetsRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_SetPartSubscriptionOffsetsRequest_descriptor,
            new java.lang.String[]{"PartitionId", "GroupOffsets",});
        internal_static_proto_SetSubscriptionOffsetsRequest_descriptor =
            getDescriptor().getMessageTypes().get(18);
        internal_static_proto_SetSubscriptionOffsetsRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_SetSubscriptionOffsetsRequest_descriptor,
            new java.lang.String[]{"TopicSubscription", "SetPartSubscriptionOffsetsRequests",});
        internal_static_proto_SetSubscriptionsOffsetsRequest_descriptor =
            getDescriptor().getMessageTypes().get(19);
        internal_static_proto_SetSubscriptionsOffsetsRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_SetSubscriptionsOffsetsRequest_descriptor,
            new java.lang.String[]{"SetSubscriptionOffsetsRequests",});
        internal_static_proto_GetPartSubscriptionOffsetsRequest_descriptor =
            getDescriptor().getMessageTypes().get(20);
        internal_static_proto_GetPartSubscriptionOffsetsRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_GetPartSubscriptionOffsetsRequest_descriptor,
            new java.lang.String[]{"PartitionId", "GroupIds",});
        internal_static_proto_GetSubscriptionOffsetsRequest_descriptor =
            getDescriptor().getMessageTypes().get(21);
        internal_static_proto_GetSubscriptionOffsetsRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_GetSubscriptionOffsetsRequest_descriptor,
            new java.lang.String[]{"TopicSubscription", "GetPartSubscriptionOffsetsRequests",});
        internal_static_proto_GetSubscriptionsOffsetsRequest_descriptor =
            getDescriptor().getMessageTypes().get(22);
        internal_static_proto_GetSubscriptionsOffsetsRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_GetSubscriptionsOffsetsRequest_descriptor,
            new java.lang.String[]{"GetSubscriptionOffsetsRequests",});
        com.flipkart.vbroker.proto.PEntities.getDescriptor();
    }
    private PRequests() {
    }

    public static void registerAllExtensions(
        com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
        com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
            (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    // @@protoc_insertion_point(outer_class_scope)
}
