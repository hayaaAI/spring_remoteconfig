package hayaa.remoteconfig.service;

import hayaa.basemodel.model.BaseData;

import java.util.List;

public class AppConfig extends BaseData {
    private Integer appConfigId;
    private Integer appId;
    private String solutionID;
    private String solutionName;
    private String configContent;
    private Integer version;
    private List<ComponentConfig> Components;



    public Integer getAppConfigId() {
        return appConfigId;
    }

    public void setAppConfigId(Integer appConfigId) {
        this.appConfigId = appConfigId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getSolutionID() {
        return solutionID;
    }

    public void setSolutionID(String solutionID) {
        this.solutionID = solutionID;
    }

    public String getSolutionName() {
        return solutionName;
    }

    public void setSolutionName(String solutionName) {
        this.solutionName = solutionName;
    }

    public String getConfigContent() {
        return configContent;
    }

    public void setConfigContent(String configContent) {
        this.configContent = configContent;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public List<ComponentConfig> getComponents() {
        return Components;
    }

    public void setComponents(List<ComponentConfig> components) {
        Components = components;
    }
}
