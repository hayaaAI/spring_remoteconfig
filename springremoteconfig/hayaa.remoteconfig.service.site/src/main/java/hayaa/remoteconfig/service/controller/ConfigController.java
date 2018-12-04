package hayaa.remoteconfig.service.controller;

import hayaa.basemodel.model.FunctionResult;
import hayaa.basemodel.model.TransactionResult;
import hayaa.common.AssertHelper;
import hayaa.common.ErrorCode;
import hayaa.remoteconfi.service.app.SpringAppConfig;
import hayaa.remoteconfi.service.app.SpringRpcConfig;
import hayaa.remoteconfig.service.AppConfig;
import hayaa.remoteconfig.service.RemoteConfigServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hsieh
 */
@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
@CrossOrigin(origins = "*", allowCredentials = "true")
public class ConfigController {
   private RemoteConfigServer remoteConfigServer=null;
   @Autowired
   private SpringRpcConfig springRpcConfig;
    @RequestMapping(value = "get")
    public TransactionResult<AppConfig> get(String application, Integer profile, String label) throws Exception {
        //AssertHelper.AssertStringNullorEmpty(application);
        //AssertHelper.AssertRangInt(profile, Integer.MIN_VALUE, Integer.MAX_VALUE);
        TransactionResult<AppConfig> result = new TransactionResult<AppConfig>();
        String solutionID = application;
        Integer version = profile;
        if(remoteConfigServer==null){
            remoteConfigServer=new RemoteConfigServer(SpringAppConfig.parseRpcConfig(springRpcConfig));
        }
        FunctionResult<AppConfig> serviceResult =remoteConfigServer.sendConfig(solutionID,version.intValue());
        if (serviceResult.isActionResult() && serviceResult.isHavingData()) {
            result.setData(serviceResult.getData());
        } else {
            result.setCode(ErrorCode.NO_DATA);
            result.setMessage("暂无数据");
        }
        return result;
    }
}
