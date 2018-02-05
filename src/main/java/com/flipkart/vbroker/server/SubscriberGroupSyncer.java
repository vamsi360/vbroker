package com.flipkart.vbroker.server;

import com.flipkart.vbroker.core.PartSubscriber;

import java.util.List;

//TODO: this is temporary for now until we implement eventing
public class SubscriberGroupSyncer implements Runnable {
    private final List<PartSubscriber> partSubscribers;
    private volatile boolean active = true;

    public SubscriberGroupSyncer(List<PartSubscriber> partSubscribers) {
        this.partSubscribers = partSubscribers;
    }

    @Override
    public void run() {
        while (active) {
            for (PartSubscriber partSubscriber : partSubscribers) {
                partSubscriber.refreshSubscriberGroups();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            }
        }
    }

    public void stop() {
        active = false;
    }
}