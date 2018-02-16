package com.flipkart.vbroker.subscribers;

import com.flipkart.vbroker.entities.Message;
import com.flipkart.vbroker.exceptions.VBrokerException;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
@EqualsAndHashCode
public class MessageWithGroup {
    @Getter
    private final Message message;
    private final SubscriberGroup subscriberGroup;

    public static MessageWithGroup newInstance(Message message, SubscriberGroup subscriberGroup) {
        return new MessageWithGroup(message, subscriberGroup);
    }

    public void setQType(SubscriberGroup.QType qType) {
        this.subscriberGroup.setQType(qType);
    }

    public void sidelineGroup() {
        log.info("Sidelining the group {}", subscriberGroup.getGroupId());
        this.subscriberGroup.setQType(SubscriberGroup.QType.SIDELINE);
    }

    public void retry() {
        SubscriberGroup.QType destinationQType;
        switch (subscriberGroup.getQType()) {
            case MAIN:
                destinationQType = SubscriberGroup.QType.RETRY_1;
                break;
            case RETRY_1:
                destinationQType = SubscriberGroup.QType.RETRY_2;
                break;
            case RETRY_2:
                destinationQType = SubscriberGroup.QType.RETRY_3;
                break;
            case RETRY_3:
                destinationQType = SubscriberGroup.QType.SIDELINE;
                break;
            default:
                throw new VBrokerException("Unknown QType: " + subscriberGroup.getQType());
        }
        this.subscriberGroup.setQType(destinationQType);
    }

    public boolean isGroupLocked() {
        return subscriberGroup.isLocked();
    }

    public boolean lockGroup() {
        log.info("Locking the group {}", subscriberGroup.getGroupId());
        return subscriberGroup.lock();
    }

    public void forceUnlockGroup() {
        log.info("Unlocking the group {}", subscriberGroup.getGroupId());
        subscriberGroup.forceUnlock();
    }

    public short subscriptionId() {
        return subscriberGroup.getPartSubscription().getSubscriptionId();
    }

    public short getTopicId() {
        return subscriberGroup.getTopicPartition().getTopicId();
    }
}
