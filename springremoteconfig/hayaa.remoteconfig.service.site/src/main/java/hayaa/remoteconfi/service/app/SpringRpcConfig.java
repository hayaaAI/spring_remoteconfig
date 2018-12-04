package hayaa.remoteconfi.service.app;

import hayaa.rpc.common.config.RpcConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author hsieh
 */
@Component
@ConfigurationProperties(prefix="RpcConfig")
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

    private SpringRpcConfig.ConsumerConfig consumerConfiguation;
    public class ServiceConfig {
        private String name;
        private String group;
        private String interfaceName;
        private String assemblyName;
        private String serverHost;
        private int serverPort;

        public ServiceConfig() {
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGroup() {
            return this.group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public String getInterfaceName() {
            return this.interfaceName;
        }

        public void setInterfaceName(String interfaceName) {
            this.interfaceName = interfaceName;
        }

        public String getAssemblyName() {
            return this.assemblyName;
        }

        public void setAssemblyName(String assemblyName) {
            this.assemblyName = assemblyName;
        }

        public String getServerHost() {
            return this.serverHost;
        }

        public void setServerHost(String serverHost) {
            this.serverHost = serverHost;
        }

        public int getServerPort() {
            return this.serverPort;
        }

        public void setServerPort(int serverPort) {
            this.serverPort = serverPort;
        }
    }
    public class ConsumerConfig {
        private int messageSize = 1048576;
        private String name;
        private List<RpcConfig.ServiceConfig> services;

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

        public List<RpcConfig.ServiceConfig> getServices() {
            return this.services;
        }

        public void setServices(List<RpcConfig.ServiceConfig> services) {
            this.services = services;
        }
    }
}
