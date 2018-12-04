package hayaa.remoteconfi.service.app;

import hayaa.rpc.common.config.RpcConfig;
import hayaa.rpc.common.config.ServiceConfig;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hsieh
 */
public class SpringAppConfig {


    public static  RpcConfig parseRpcConfig(SpringRpcConfig springRpcConfig) {
        RpcConfig rpcConfig=new RpcConfig();
        BeanUtils.copyProperties(springRpcConfig,rpcConfig);
        hayaa.rpc.common.config.ConsumerConfig rpcConsumerConfig=new hayaa.rpc.common.config.ConsumerConfig();
        rpcConsumerConfig.setMessageSize(springRpcConfig.getConsumerConfiguation().getMessageSize());
        rpcConsumerConfig.setName(springRpcConfig.getConsumerConfiguation().getName());
        List<ServiceConfig> serviceConfigs=new ArrayList<>(1);
        for(int i=0;i<springRpcConfig.getConsumerConfiguation().getServices().size();i++){
            ServiceConfig serviceConfig=new ServiceConfig();
            BeanUtils.copyProperties(springRpcConfig.getConsumerConfiguation().getServices().get(i)
                    ,serviceConfig);
            serviceConfigs.add(serviceConfig);
        }
        rpcConsumerConfig.setServices(serviceConfigs);
        rpcConfig.setConsumerConfiguation(rpcConsumerConfig);
        return rpcConfig;
    }
}
