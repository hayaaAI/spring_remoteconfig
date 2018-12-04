package hayaa.remoteconfig.service;

import hayaa.basemodel.model.FunctionResult;

public interface IRemoteConfigService {
    FunctionResult<AppConfig> SendConfig(String solutionID, int version);
    FunctionResult<AppConfig> SendJsAppConfig(String solutionID, int version);
}
