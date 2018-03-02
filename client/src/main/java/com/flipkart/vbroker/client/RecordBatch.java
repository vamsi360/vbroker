package com.flipkart.vbroker.client;

import com.flipkart.vbroker.core.TopicPartition;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Set;

/**
 * A set of records going to a particular node in the cluster
 * records can belong to multiple topic-partitions within the broker
 * each topic partition can have multiple messages
 */
@Slf4j
@ToString
public class RecordBatch {
    private final Node node;
    private final long lingerTimeMs;
    private final Multimap<TopicPartition, ProducerRecord> partRecordsMap = HashMultimap.create();
    private long createdTimeMs;

    public RecordBatch(Node node, long lingerTimeMs) {
        this.node = node;
        this.lingerTimeMs = lingerTimeMs;
        this.createdTimeMs = System.currentTimeMillis();
    }

    public static RecordBatch newInstance(Node node, long lingerTimeMs) {
        log.info("Creating new RecordBatch for node {}", node);
        return new RecordBatch(node, lingerTimeMs);
    }

    public void addRecord(TopicPartition topicPartition, ProducerRecord record) {
        log.info("Adding record {} into topic partition {}", record.getMessageId(), topicPartition);
        partRecordsMap.put(topicPartition, record);
    }

    public boolean isFull() {
        return partRecordsMap.values().size() >= 1;
    }

    /**
     * this determines if this batch can be sent if
     * 1. batch is full (or)
     * 2. batch expired
     *
     * @return
     */
    public boolean isReady() {
        return isFull() || hasExpired();
    }

    private boolean hasExpired() {
        return (System.currentTimeMillis() - createdTimeMs) > lingerTimeMs;
    }

    public int getTotalNoOfRecords() {
        return partRecordsMap.values().size();
    }

    public List<ProducerRecord> getRecords(TopicPartition topicPartition) {
        return Lists.newArrayList(partRecordsMap.get(topicPartition));
    }

    public Set<TopicPartition> getTopicPartitionsWithRecords() {
        return partRecordsMap.keySet();
    }
}
