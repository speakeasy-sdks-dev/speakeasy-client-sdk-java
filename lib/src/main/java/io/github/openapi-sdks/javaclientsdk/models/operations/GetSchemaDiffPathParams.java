package io.github.openapi-sdks.javaclientsdk.models.operations;

import io.github.openapi-sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class GetSchemaDiffPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public GetSchemaDiffPathParams withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=baseRevisionID")
    public String baseRevisionID;
    public GetSchemaDiffPathParams withBaseRevisionID(String baseRevisionID) {
        this.baseRevisionID = baseRevisionID;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=targetRevisionID")
    public String targetRevisionID;
    public GetSchemaDiffPathParams withTargetRevisionID(String targetRevisionID) {
        this.targetRevisionID = targetRevisionID;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;
    public GetSchemaDiffPathParams withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
    
}