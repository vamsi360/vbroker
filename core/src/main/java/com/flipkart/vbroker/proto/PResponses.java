// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: responses.proto

package com.flipkart.vbroker.proto;

public final class PResponses {
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_VStatus_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_VStatus_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_ProtoResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_ProtoResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_CreateTopicResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_CreateTopicResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_CreateTopicsResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_CreateTopicsResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_CreateSubscriptionResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_CreateSubscriptionResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_CreateSubscriptionsResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_CreateSubscriptionsResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_CreateQueueResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_CreateQueueResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_CreateQueuesResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_CreateQueuesResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_GetTopicResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_GetTopicResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_GetTopicsResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_GetTopicsResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_GetSubscriptionResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_GetSubscriptionResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_GetSubscriptionsResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_GetSubscriptionsResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_GetQueueResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_GetQueueResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_GetQueuesResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_GetQueuesResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_PartitionLag_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_PartitionLag_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_SubscriptionLag_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_SubscriptionLag_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_GetSubscriptionLagsResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_GetSubscriptionLagsResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
        internal_static_proto_GetClusterMetadataResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_proto_GetClusterMetadataResponse_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.FileDescriptor
        descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\017responses.proto\022\005proto\032\016entities.proto" +
                "\".\n\007VStatus\022\022\n\nstatusCode\030\001 \001(\005\022\017\n\007messa" +
                "ge\030\002 \001(\t\"\343\003\n\rProtoResponse\022;\n\024createTopi" +
                "csResponse\030\001 \001(\0132\033.proto.CreateTopicsRes" +
                "ponseH\000\022I\n\033createSubscriptionsResponse\030\002" +
                " \001(\0132\".proto.CreateSubscriptionsResponse" +
                "H\000\022;\n\024createQueuesResponse\030\003 \001(\0132\033.proto" +
                ".CreateQueuesResponseH\000\0225\n\021getTopicsResp" +
                "onse\030\004 \001(\0132\030.proto.GetTopicsResponseH\000\0225" +
                "\n\021getQueuesResponse\030\005 \001(\0132\030.proto.GetQue" +
                "uesResponseH\000\022C\n\030getSubscriptionsRespons" +
                "e\030\006 \001(\0132\037.proto.GetSubscriptionsResponse" +
                "H\000\022I\n\033getSubscriptionLagsResponse\030\007 \001(\0132" +
                "\".proto.GetSubscriptionLagsResponseH\000B\017\n" +
                "\rprotoResponse\"C\n\023CreateTopicResponse\022\014\n" +
                "\004name\030\002 \001(\t\022\036\n\006status\030\003 \001(\0132\016.proto.VSta" +
                "tus\"P\n\024CreateTopicsResponse\0228\n\024createTop" +
                "icsResponse\030\001 \003(\0132\032.proto.CreateTopicRes" +
                "ponse\"[\n\032CreateSubscriptionResponse\022\017\n\007t" +
                "opicId\030\002 \001(\005\022\014\n\004name\030\003 \001(\t\022\036\n\006status\030\004 \001" +
                "(\0132\016.proto.VStatus\"e\n\033CreateSubscription" +
                "sResponse\022F\n\033createSubscriptionResponses" +
                "\030\001 \003(\0132!.proto.CreateSubscriptionRespons" +
                "e\"H\n\023CreateQueueResponse\022\021\n\tqueueName\030\001 " +
                "\001(\t\022\036\n\006status\030\002 \001(\0132\016.proto.VStatus\"P\n\024C" +
                "reateQueuesResponse\0228\n\024createQueueRespon" +
                "ses\030\001 \003(\0132\032.proto.CreateQueueResponse\"T\n" +
                "\020GetTopicResponse\022 \n\005topic\030\001 \001(\0132\021.proto" +
                ".ProtoTopic\022\036\n\006status\030\002 \001(\0132\016.proto.VSta" +
                "tus\"<\n\021GetTopicsResponse\022\'\n\006topics\030\001 \003(\013" +
                "2\027.proto.GetTopicResponse\"i\n\027GetSubscrip" +
                "tionResponse\022.\n\014subscription\030\001 \001(\0132\030.pro" +
                "to.ProtoSubscription\022\036\n\006status\030\002 \001(\0132\016.p" +
                "roto.VStatus\"Q\n\030GetSubscriptionsResponse" +
                "\0225\n\rsubscriptions\030\001 \003(\0132\036.proto.GetSubsc" +
                "riptionResponse\"T\n\020GetQueueResponse\022 \n\005q" +
                "ueue\030\001 \001(\0132\021.proto.ProtoQueue\022\036\n\006status\030" +
                "\002 \001(\0132\016.proto.VStatus\"<\n\021GetQueuesRespon" +
                "se\022\'\n\006queues\030\001 \003(\0132\027.proto.GetQueueRespo" +
                "nse\"P\n\014PartitionLag\022\023\n\013partitionId\030\001 \001(\005" +
                "\022\013\n\003lag\030\002 \001(\005\022\036\n\006status\030\003 \001(\0132\016.proto.VS" +
                "tatus\"f\n\017SubscriptionLag\022\026\n\016subscription" +
                "Id\030\001 \001(\005\022\017\n\007topicId\030\002 \001(\005\022*\n\rpartitionLa" +
                "gs\030\003 \003(\0132\023.proto.PartitionLag\"O\n\033GetSubs" +
                "criptionLagsResponse\0220\n\020subscriptionLags" +
                "\030\001 \003(\0132\026.proto.SubscriptionLag\"m\n\032GetClu" +
                "sterMetadataResponse\022/\n\017clusterMetadata\030" +
                "\001 \001(\0132\026.proto.ClusterMetadata\022\036\n\006status\030" +
                "\002 \001(\0132\016.proto.VStatusB*\n\032com.flipkart.vb" +
                "roker.protoB\nPResponsesP\001b\006proto3"
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
        internal_static_proto_VStatus_descriptor =
            getDescriptor().getMessageTypes().get(0);
        internal_static_proto_VStatus_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_VStatus_descriptor,
            new java.lang.String[]{"StatusCode", "Message",});
        internal_static_proto_ProtoResponse_descriptor =
            getDescriptor().getMessageTypes().get(1);
        internal_static_proto_ProtoResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_ProtoResponse_descriptor,
            new java.lang.String[]{"CreateTopicsResponse", "CreateSubscriptionsResponse", "CreateQueuesResponse", "GetTopicsResponse", "GetQueuesResponse", "GetSubscriptionsResponse", "GetSubscriptionLagsResponse", "ProtoResponse",});
        internal_static_proto_CreateTopicResponse_descriptor =
            getDescriptor().getMessageTypes().get(2);
        internal_static_proto_CreateTopicResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_CreateTopicResponse_descriptor,
            new java.lang.String[]{"Name", "Status",});
        internal_static_proto_CreateTopicsResponse_descriptor =
            getDescriptor().getMessageTypes().get(3);
        internal_static_proto_CreateTopicsResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_CreateTopicsResponse_descriptor,
            new java.lang.String[]{"CreateTopicsResponse",});
        internal_static_proto_CreateSubscriptionResponse_descriptor =
            getDescriptor().getMessageTypes().get(4);
        internal_static_proto_CreateSubscriptionResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_CreateSubscriptionResponse_descriptor,
            new java.lang.String[]{"TopicId", "Name", "Status",});
        internal_static_proto_CreateSubscriptionsResponse_descriptor =
            getDescriptor().getMessageTypes().get(5);
        internal_static_proto_CreateSubscriptionsResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_CreateSubscriptionsResponse_descriptor,
            new java.lang.String[]{"CreateSubscriptionResponses",});
        internal_static_proto_CreateQueueResponse_descriptor =
            getDescriptor().getMessageTypes().get(6);
        internal_static_proto_CreateQueueResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_CreateQueueResponse_descriptor,
            new java.lang.String[]{"QueueName", "Status",});
        internal_static_proto_CreateQueuesResponse_descriptor =
            getDescriptor().getMessageTypes().get(7);
        internal_static_proto_CreateQueuesResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_CreateQueuesResponse_descriptor,
            new java.lang.String[]{"CreateQueueResponses",});
        internal_static_proto_GetTopicResponse_descriptor =
            getDescriptor().getMessageTypes().get(8);
        internal_static_proto_GetTopicResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_GetTopicResponse_descriptor,
            new java.lang.String[]{"Topic", "Status",});
        internal_static_proto_GetTopicsResponse_descriptor =
            getDescriptor().getMessageTypes().get(9);
        internal_static_proto_GetTopicsResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_GetTopicsResponse_descriptor,
            new java.lang.String[]{"Topics",});
        internal_static_proto_GetSubscriptionResponse_descriptor =
            getDescriptor().getMessageTypes().get(10);
        internal_static_proto_GetSubscriptionResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_GetSubscriptionResponse_descriptor,
            new java.lang.String[]{"Subscription", "Status",});
        internal_static_proto_GetSubscriptionsResponse_descriptor =
            getDescriptor().getMessageTypes().get(11);
        internal_static_proto_GetSubscriptionsResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_GetSubscriptionsResponse_descriptor,
            new java.lang.String[]{"Subscriptions",});
        internal_static_proto_GetQueueResponse_descriptor =
            getDescriptor().getMessageTypes().get(12);
        internal_static_proto_GetQueueResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_GetQueueResponse_descriptor,
            new java.lang.String[]{"Queue", "Status",});
        internal_static_proto_GetQueuesResponse_descriptor =
            getDescriptor().getMessageTypes().get(13);
        internal_static_proto_GetQueuesResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_GetQueuesResponse_descriptor,
            new java.lang.String[]{"Queues",});
        internal_static_proto_PartitionLag_descriptor =
            getDescriptor().getMessageTypes().get(14);
        internal_static_proto_PartitionLag_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_PartitionLag_descriptor,
            new java.lang.String[]{"PartitionId", "Lag", "Status",});
        internal_static_proto_SubscriptionLag_descriptor =
            getDescriptor().getMessageTypes().get(15);
        internal_static_proto_SubscriptionLag_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_SubscriptionLag_descriptor,
            new java.lang.String[]{"SubscriptionId", "TopicId", "PartitionLags",});
        internal_static_proto_GetSubscriptionLagsResponse_descriptor =
            getDescriptor().getMessageTypes().get(16);
        internal_static_proto_GetSubscriptionLagsResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_GetSubscriptionLagsResponse_descriptor,
            new java.lang.String[]{"SubscriptionLags",});
        internal_static_proto_GetClusterMetadataResponse_descriptor =
            getDescriptor().getMessageTypes().get(17);
        internal_static_proto_GetClusterMetadataResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_proto_GetClusterMetadataResponse_descriptor,
            new java.lang.String[]{"ClusterMetadata", "Status",});
        com.flipkart.vbroker.proto.PEntities.getDescriptor();
    }
    private PResponses() {
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