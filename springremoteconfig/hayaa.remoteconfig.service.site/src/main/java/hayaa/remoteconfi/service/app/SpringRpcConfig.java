package hayaa.remoteconfi.service.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "rpc")
public class SpringRpcConfig {
    private int sessionTimeout;
    private int cpuCore;
    private String serviceRegUrl;
    private String servicePubliceUrl;
    private String keepUrl;

    public int getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(int sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public int getCpuCore() {
        return cpuCore;
    }

    public void setCpuCore(int cpuCore) {
        this.cpuCore = cpuCore;
    }

    public String getServiceRegUrl() {
        return serviceRegUrl;
    }

    public void setServiceRegUrl(String serviceRegUrl) {
        this.serviceRegUrl = serviceRegUrl;
    }

    public String getServicePubliceUrl() {
        return servicePubliceUrl;
    }

    public void setServicePubliceUrl(String servicePubliceUrl) {
        this.servicePubliceUrl = servicePubliceUrl;
    }

    public String getKeepUrl() {
        return keepUrl;
    }

    public void setKeepUrl(String keepUrl) {
        this.keepUrl = keepUrl;
    }

    public ConsumerConfig getConsumerConfiguation() {
        return consumerConfiguation;
    }

    public void setConsumerConfiguation(ConsumerConfig consumerConfiguation) {
        this.consumerConfiguation = consumerConfiguation;
    }

    private ConsumerConfig consumerConfiguation;


}
