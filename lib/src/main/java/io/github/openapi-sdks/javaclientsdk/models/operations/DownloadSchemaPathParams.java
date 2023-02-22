package io.github.openapi-sdks.javaclientsdk.models.operations;

import io.github.openapi-sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class DownloadSchemaPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public DownloadSchemaPathParams withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;
    public DownloadSchemaPathParams withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
    
}