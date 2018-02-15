package com.flipkart.vbroker;

import com.google.common.io.ByteSource;
import com.google.common.io.Resources;
import com.google.common.primitives.Ints;
import lombok.Getter;
import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Getter
@ToString
public class VBrokerConfig {
    private final Properties properties;

    private String brokerHost;
    private int brokerPort;
    private String zookeeperUrl;
    private int consumerPort;

    private String topicsPath;
    private String queuesPath;
    private String controllerPath;
    private int controllerQueueSize;
    private String adminTasksPath;

    private String redisUrl;

    public VBrokerConfig(Properties props) {
        this.properties = props;
        reloadConfigs();
    }

    public static VBrokerConfig newConfig(String propertiesFile) throws IOException {
        Properties properties = new Properties();
        ByteSource byteSource = Resources.asByteSource(Resources.getResource(propertiesFile));
        try (InputStream inputStream = byteSource.openBufferedStream()) {
            properties.load(inputStream);
        }
        return new VBrokerConfig(properties);
    }

    public void reloadConfigs() {
        this.brokerHost = properties.getProperty("broker.host");
        this.brokerPort = Ints.tryParse(properties.getProperty("broker.port"));
        this.zookeeperUrl = properties.getProperty("zookeeper.url");
        this.consumerPort = Ints.tryParse(properties.getProperty("consumer.port"));
        this.topicsPath = properties.getProperty("topics.path");
        this.queuesPath = properties.getProperty("queues.path");
        this.controllerPath = properties.getProperty("controller.path");
        this.controllerQueueSize = Ints.tryParse(properties.getProperty("controller.queue.size"));
        this.adminTasksPath = properties.getProperty("admin.tasks.path");
        this.redisUrl = properties.getProperty("redis.url");
    }
}
