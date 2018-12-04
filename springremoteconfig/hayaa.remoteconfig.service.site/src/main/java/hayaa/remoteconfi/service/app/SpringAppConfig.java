package hayaa.remoteconfi.service.app;

import hayaa.rpc.common.config.RpcConfig;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author hsieh
 */
public class SpringAppConfig {
    public static SpringAppConfig getInstance() {
        return springAppConfig;
    }

    private static SpringAppConfig springAppConfig=new SpringAppConfig();
    @Autowired
    private SpringRpcConfig springRpcConfig;
    public  RpcConfig getRpcConfig() {
        RpcConfig rpcConfig=new RpcConfig();
        BeanUtils.copyProperties(springAppConfig,rpcConfig);
        return rpcConfig;
    }
}
