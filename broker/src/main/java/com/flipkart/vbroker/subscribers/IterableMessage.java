package com.flipkart.vbroker.subscribers;

import com.flipkart.vbroker.core.PartSubscription;
import com.flipkart.vbroker.flatbuf.Message;

/**
 * this is the model interface used by message iterators
 */
public interface IterableMessage {

    Message getMessage();

    String getGroupId();

    PartSubscription getPartSubscription();

    int subscriptionId();

    int getTopicId();

    QType getQType();

    void setQType(QType qType);

    boolean isUnlocked();

    boolean lock();

    void unlock();
}
