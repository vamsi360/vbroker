package com.flipkart.vbroker.subscribers;

import com.flipkart.vbroker.core.MessageGroup;
import com.flipkart.vbroker.core.PartSubscription;
import com.flipkart.vbroker.core.TopicPartition;
import com.flipkart.vbroker.data.SubPartData;
import com.flipkart.vbroker.data.TopicPartDataManager;
import com.flipkart.vbroker.iterators.PartSubscriberIterator;
import com.google.common.collect.PeekingIterator;
import com.google.common.collect.Sets;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

@Slf4j
@EqualsAndHashCode(exclude = {"subscriberGroupsMap", "subscriberGroupIteratorMap"})
@ToString
public class PartSubscriber implements IPartSubscriber {
    public static final Integer DEFAULT_PARALLELISM = 5;
    public static final Integer MAX_GROUPS_IN_ITERATOR = 100;

    @Getter
    private final PartSubscription partSubscription;
    @Getter
    private final Map<String, SubscriberGroup> subscriberGroupsMap = new LinkedHashMap<>();
    private final Map<SubscriberGroup, PeekingIterator<MessageWithMetadata>> subscriberGroupIteratorMap = new LinkedHashMap<>();
    private final TopicPartDataManager topicPartDataManager;
    private final SubPartData subPartData;

    public PartSubscriber(TopicPartDataManager topicPartDataManager,
                          SubPartData subPartData,
                          PartSubscription partSubscription) {
        this.topicPartDataManager = topicPartDataManager;
        this.subPartData = subPartData;
        log.trace("Creating new PartSubscriber for part-subscription {}", partSubscription);
        this.partSubscription = partSubscription;
    }

    /**
     * Call this method to keep subscriberGroups in sync with messageGroups at any point
     */
    public void refreshSubscriberMetadata() {
        log.debug("Refreshing SubscriberGroups for part-subscriber {} for topic-partition {}",
            partSubscription.getId(), partSubscription.getTopicPartition().getId());
        TopicPartition topicPartition = partSubscription.getTopicPartition();

        topicPartDataManager.getUniqueGroups(topicPartition).thenAccept(uniqueMsgGroups -> {
            //Set<String> uniqueSubscriberGroups = subscriberGroupsMap.keySet();
            Set<String> uniqueSubscriberGroups = subPartData.getUniqueGroups().toCompletableFuture().join();
            Sets.SetView<String> difference = Sets.difference(uniqueMsgGroups, uniqueSubscriberGroups);

            difference.forEach(group -> {
                MessageGroup messageGroup = new MessageGroup(group, topicPartition);
                SubscriberGroup subscriberGroup = SubscriberGroup.newGroup(messageGroup, partSubscription, topicPartDataManager);
                //subscriberGroupsMap.put(group, subscriberGroup);
                //subscriberGroupIteratorMap.put(subscriberGroup, subscriberGroup.iterator());
                subPartData.addGroup(subscriberGroup);
            });
        });
    }

    @Override
    public PeekingIterator<MessageWithMetadata> iterator() {
        return getIterator(QType.MAIN);
    }

    @Override
    public PeekingIterator<MessageWithMetadata> sidelineIterator() {
        return getPartSubscriberIterator(QType.SIDELINE);
    }

    @Override
    public PeekingIterator<MessageWithMetadata> retryIterator(int retryQNo) {
        QType qType = QType.retryQType(retryQNo);
        return getPartSubscriberIterator(qType);
    }

    private PeekingIterator<MessageWithMetadata> getPartSubscriberIterator(QType qType) {
        return getIterator(qType);
    }

    private PeekingIterator<MessageWithMetadata> getIterator(QType qType) {
        return new PartSubscriberIterator() {
            @Override
            protected Optional<PeekingIterator<MessageWithMetadata>> nextIterator() {
                return subPartData.getIterator(qType);
            }
        };
    }
}
