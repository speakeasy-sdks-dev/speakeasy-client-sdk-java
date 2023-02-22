package io.github.openapi_sdks.javaclientsdk.models.operations;

import io.github.openapi_sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class RunPluginPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=pluginID")
    public String pluginID;
    public RunPluginPathParams withPluginID(String pluginID) {
        this.pluginID = pluginID;
        return this;
    }
    
}
