package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class RunPluginPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=pluginID")
    public String pluginID;
    public RunPluginPathParams withPluginID(String pluginID) {
        this.pluginID = pluginID;
        return this;
    }
}
