package hayaa.remoteconfi.service.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author hsieh
 */
@Component
@ConfigurationProperties(prefix = "springrpcconfig")
public class SpringRpcConfig {
    private Integer sessiontimeout;

    public Integer getSessiontimeout() {
        return sessiontimeout;
    }

    public void setSessiontimeout(Integer sessiontimeout) {
        this.sessiontimeout = sessiontimeout;
    }
    //    private int cpuCore;
//    private String serviceRegUrl;
//    private String servicePubliceUrl;
//    private String keepUrl;
//    private String consumerName;
//    private int messageSize = 1048576;
  //  private List<ServiceConfig> consumerServices;



}
