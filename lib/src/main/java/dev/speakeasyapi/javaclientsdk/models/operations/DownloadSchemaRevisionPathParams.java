package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class DownloadSchemaRevisionPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public DownloadSchemaRevisionPathParams withApiId(String apiID) {
        this.apiID = apiID;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=revisionID")
    public String revisionID;
    public DownloadSchemaRevisionPathParams withRevisionId(String revisionID) {
        this.revisionID = revisionID;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;
    public DownloadSchemaRevisionPathParams withVersionId(String versionID) {
        this.versionID = versionID;
        return this;
    }
}