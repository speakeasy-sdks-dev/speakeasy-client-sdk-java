package io.github.openapi_sdks.javaclientsdk.models.operations;

import io.github.openapi_sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class DownloadSchemaRevisionPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public DownloadSchemaRevisionPathParams withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=revisionID")
    public String revisionID;
    public DownloadSchemaRevisionPathParams withRevisionID(String revisionID) {
        this.revisionID = revisionID;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;
    public DownloadSchemaRevisionPathParams withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
    
}
