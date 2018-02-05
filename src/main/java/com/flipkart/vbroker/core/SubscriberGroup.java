package com.flipkart.vbroker.core;

import com.flipkart.vbroker.entities.Message;
import com.flipkart.vbroker.exceptions.VBrokerException;
import com.google.common.collect.PeekingIterator;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by hooda on 19/1/18
 */
@EqualsAndHashCode(exclude = {"qType", "currSeqNo"})
//TODO: crude implementation of seqNo. Handle the concurrency here correctly
public class SubscriberGroup implements Iterable<MessageWithGroup> {
    private final MessageGroup messageGroup;
    @Getter
    private final TopicPartition topicPartition;
    @Getter
    @Setter
    private QType qType = QType.MAIN;
    @Getter
    @Setter
    private AtomicInteger currSeqNo = new AtomicInteger(0);
    @Getter
    private volatile AtomicBoolean locked = new AtomicBoolean(false);

    private SubscriberGroup(MessageGroup messageGroup,
                            TopicPartition topicPartition) {
        this.messageGroup = messageGroup;
        this.topicPartition = topicPartition;
    }

    public static SubscriberGroup newGroup(MessageGroup messageGroup,
                                           TopicPartition topicPartition) {
        return new SubscriberGroup(messageGroup, topicPartition);
    }

    /**
     * @return true if locking for the first time
     * false if already locked
     */
    public boolean lock() {
        return locked.compareAndSet(false, true);
    }

    /**
     * @return true if successfully unlocked
     * false if already unlocked
     */
    public boolean unlock() {
        return locked.compareAndSet(true, false);
    }

    /**
     * @return locked status
     */
    public boolean isLocked() {
        return locked.get();
    }

    public synchronized List<Message> getUnconsumedMessages(int count) {
        List<Message> messages = messageGroup.getMessages().subList(currSeqNo.get(), currSeqNo.get() + count);
        currSeqNo.set(currSeqNo.get() + count);
        return messages;
    }

    @Override
    public PeekingIterator<MessageWithGroup> iterator() {
        return new SubscriberGroupIterator(this);
    }

    public String getGroupId() {
        return messageGroup.getGroupId();
    }

    public enum QType {
        MAIN, SIDELINE, RETRY_1, RETRY_2, RETRY_3
    }

    private class SubscriberGroupIterator implements PeekingIterator<MessageWithGroup> {

        SubscriberGroup subscriberGroup;
        PeekingIterator<Message> groupIterator = messageGroup.iteratorFrom(currSeqNo.get());

        public SubscriberGroupIterator(SubscriberGroup subscriberGroup) {
            this.subscriberGroup = subscriberGroup;
        }

        @Override
        public MessageWithGroup peek() {
            return MessageWithGroup.newInstance(groupIterator.peek(), subscriberGroup);
        }

        @Override
        public synchronized MessageWithGroup next() {
            MessageWithGroup messageWithGroup = MessageWithGroup.newInstance(groupIterator.next(), subscriberGroup);
            currSeqNo.incrementAndGet();
            return messageWithGroup;
        }

        @Override
        public void remove() {
            throw new VBrokerException("Unsupported operation");
        }

        @Override
        public boolean hasNext() {
            return groupIterator.hasNext();
        }
    }
}
