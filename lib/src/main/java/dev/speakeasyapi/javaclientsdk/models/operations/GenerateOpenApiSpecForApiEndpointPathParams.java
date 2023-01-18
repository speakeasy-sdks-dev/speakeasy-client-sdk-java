package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class GenerateOpenApiSpecForApiEndpointPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiEndpointID")
    public String apiEndpointID;
    public GenerateOpenApiSpecForApiEndpointPathParams withApiEndpointId(String apiEndpointID) {
        this.apiEndpointID = apiEndpointID;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public GenerateOpenApiSpecForApiEndpointPathParams withApiId(String apiID) {
        this.apiID = apiID;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;
    public GenerateOpenApiSpecForApiEndpointPathParams withVersionId(String versionID) {
        this.versionID = versionID;
        return this;
    }
}