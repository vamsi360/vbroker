package com.flipkart.vbroker.client;

import com.flipkart.vbroker.core.TopicPartition;
import com.flipkart.vbroker.entities.Topic;

import java.util.List;

public interface Metadata {

    public long aliveTimeMs();

    public List<Topic> getTopics();

    public TopicPartition getTopicPartition(short topicId, short partitionId);

    public List<TopicPartition> getTopicPartitions(short topicId);

    public List<TopicPartition> getTopicPartitions(Node node);

    public List<Node> getClusterNodes();

    public Node getLeaderNode(TopicPartition topicPartition);
}
