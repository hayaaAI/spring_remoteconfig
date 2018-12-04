package hayaa.remoteconfig.service;

import hayaa.basemodel.model.BaseData;

public class ComponentConfig extends BaseData {
    private Integer componentConfigId;
    public int componentId;
    public String content;
    public int version;
    public String componentConfigTitle;
    public Boolean isDefault;

    public Integer getComponentConfigId() {
        return componentConfigId;
    }

    public void setComponentConfigId(Integer componentConfigId) {
        this.componentConfigId = componentConfigId;
    }

    public int getComponentId() {
        return componentId;
    }

    public void setComponentId(int componentId) {
        this.componentId = componentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getComponentConfigTitle() {
        return componentConfigTitle;
    }

    public void setComponentConfigTitle(String componentConfigTitle) {
        this.componentConfigTitle = componentConfigTitle;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }
}
