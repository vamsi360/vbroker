package com.flipkart.vbroker.subscribers;

import com.flipkart.vbroker.core.PartSubscription;
import com.flipkart.vbroker.data.TopicPartDataManager;
import com.flipkart.vbroker.entities.Message;
import com.flipkart.vbroker.exceptions.NotImplementedException;
import com.flipkart.vbroker.iterators.PartSubscriberIterator;
import com.google.common.collect.PeekingIterator;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@EqualsAndHashCode(exclude = {"topicPartDataManager", "currSeqNo"})
@ToString(exclude = {"topicPartDataManager", "currSeqNo"})
public class UnGroupedPartSubscriber implements IPartSubscriber {

    @Getter
    private final PartSubscription partSubscription;
    private final TopicPartDataManager topicPartDataManager;
    private final AtomicInteger currSeqNo = new AtomicInteger(0);

    public UnGroupedPartSubscriber(TopicPartDataManager topicPartDataManager,
                                   PartSubscription partSubscription) {
        this.topicPartDataManager = topicPartDataManager;
        this.partSubscription = partSubscription;

        log.info("Creating UnGroupedPartSubscriber object for partSubscription {}", partSubscription);
    }

    @Override
    public void refreshSubscriberMetadata() {
        log.debug("Ignoring refresh of subscriber metadata for un-grouped part subscriber");
    }

    @Override
    public PeekingIterator<IMessageWithGroup> iterator() {
        log.info("Creating UnGroupedPartSubscriber iterator for partSub {} from seqNo {}", partSubscription, currSeqNo.get());
        return new PartSubscriberIterator() {
            @Override
            protected Optional<PeekingIterator<IMessageWithGroup>> nextIterator() {
                PeekingIterator<Message> iterator = topicPartDataManager
                    .getIterator(partSubscription.getTopicPartition(), currSeqNo.get());

                PeekingIterator<IMessageWithGroup> peekingIterator = new PeekingIterator<IMessageWithGroup>() {
                    @Override
                    public IMessageWithGroup peek() {
                        return new UnGroupedMessageWithGroup(iterator.peek(), partSubscription);
                    }

                    @Override
                    public boolean hasNext() {
                        return iterator.hasNext();
                    }

                    @Override
                    public synchronized IMessageWithGroup next() {
                        IMessageWithGroup messageWithGroup = new UnGroupedMessageWithGroup(iterator.next(), partSubscription);
                        currSeqNo.incrementAndGet();
                        return messageWithGroup;
                    }

                    @Override
                    public void remove() {
                        throw new NotImplementedException();
                    }
                };

                return Optional.of(peekingIterator);
            }
        };
    }
}