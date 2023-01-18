package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class GetSchemaRevisionPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public GetSchemaRevisionPathParams withApiId(String apiID) {
        this.apiID = apiID;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=revisionID")
    public String revisionID;
    public GetSchemaRevisionPathParams withRevisionId(String revisionID) {
        this.revisionID = revisionID;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;
    public GetSchemaRevisionPathParams withVersionId(String versionID) {
        this.versionID = versionID;
        return this;
    }
}