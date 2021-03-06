package com.flipkart.vbroker.subscribers;

import com.flipkart.vbroker.core.PartSubscription;
import com.flipkart.vbroker.data.SubPartDataManager;
import com.flipkart.vbroker.iterators.DataIterator;
import com.flipkart.vbroker.iterators.MsgIterators;
import com.flipkart.vbroker.iterators.PartSubscriberIterator;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.CompletionStage;

@Slf4j
@EqualsAndHashCode(exclude = {"subPartDataManager"})
@ToString(exclude = {"subPartDataManager"})
public class UnGroupedPartSubscriber implements PartSubscriber {

    private final SubPartDataManager subPartDataManager;
    @Getter
    private final PartSubscription partSubscription;

    public UnGroupedPartSubscriber(SubPartDataManager subPartDataManager,
                                   PartSubscription partSubscription) {
        this.subPartDataManager = subPartDataManager;
        this.partSubscription = partSubscription;
        log.info("Creating UnGroupedPartSubscriber object for partSubscription {}", partSubscription);
    }

    @Override
    public void refreshSubscriberMetadata() {
        log.debug("Ignoring refresh of subscriber metadata for un-grouped part subscriber");
    }

    @Override
    public PartSubscriberIterator<IterableMessage> iterator(QType qType) {
        log.info("Creating UnGroupedPartSubscriber iterator for partSub {}", partSubscription);

        //TODO: validate if across QType's a cached dataIterator like below works or not
        DataIterator<IterableMessage> dataIterator =
            subPartDataManager.getIterator(partSubscription, QType.MAIN);
        return MsgIterators.partSubscriberIterator(dataIterator);
    }

    @Override
    public List<IterableMessage> poll(QType qType, int maxRecords, long pollTimeMs) {
        return subPartDataManager.poll(partSubscription, qType, maxRecords, pollTimeMs);
    }

    @Override
    public CompletionStage<Void> commitOffset(String group, int offset) {
        return subPartDataManager.commitOffset(partSubscription, group, offset);
    }

    @Override
    public CompletionStage<Integer> getOffset(String group) {
        return subPartDataManager.getOffset(partSubscription, group);
    }
}
