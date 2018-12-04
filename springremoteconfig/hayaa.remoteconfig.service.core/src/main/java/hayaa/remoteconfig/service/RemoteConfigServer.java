package hayaa.remoteconfig.service;

import hayaa.basemodel.model.FunctionResult;
import hayaa.rpc.client.RpcClient;
import hayaa.rpc.client.RpcServiceFactory;
import hayaa.rpc.common.config.RpcConfig;

/**
 * @author hsieh
 */
public class RemoteConfigServer  {
    private IRemoteConfigService remoteConfigService=RpcServiceFactory.
            createService(IRemoteConfigService.class.getName());
    public RemoteConfigServer(RpcConfig rpcConfig) {
        RpcClient rpcClient=new RpcClient();
        rpcClient.run(rpcConfig);
    }

    public FunctionResult<AppConfig> sendConfig(String solutionID, int version) {
        return remoteConfigService.SendConfig(solutionID,version);
    }
}
