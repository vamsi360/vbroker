package com.flipkart.vbroker.core;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by hooda on 19/1/18
 */
@Getter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class TopicPartition {
    private final int id;
    private final int topicId;
    private final boolean grouped;
}
