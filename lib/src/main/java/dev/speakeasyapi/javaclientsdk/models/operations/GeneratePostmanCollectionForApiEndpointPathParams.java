package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class GeneratePostmanCollectionForApiEndpointPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiEndpointID")
    public String apiEndpointID;
    public GeneratePostmanCollectionForApiEndpointPathParams withApiEndpointId(String apiEndpointID) {
        this.apiEndpointID = apiEndpointID;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public GeneratePostmanCollectionForApiEndpointPathParams withApiId(String apiID) {
        this.apiID = apiID;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;
    public GeneratePostmanCollectionForApiEndpointPathParams withVersionId(String versionID) {
        this.versionID = versionID;
        return this;
    }
}