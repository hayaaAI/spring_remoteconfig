package hayaa.remoteconfi.service.app;

import java.util.List;

public class ConsumerConfig {
    private int messageSize = 1048576;
    private String name;
    private List<ServiceConfig> services;

    public ConsumerConfig() {
    }

    public int getMessageSize() {
        return this.messageSize;
    }

    public void setMessageSize(int messageSize) {
        this.messageSize = messageSize;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ServiceConfig> getServices() {
        return this.services;
    }

    public void setServices(List<ServiceConfig> services) {
        this.services = services;
    }
}