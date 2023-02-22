package io.github.openapi-sdks.javaclientsdk.models.operations;

import io.github.openapi-sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class UpsertApiEndpointPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiEndpointID")
    public String apiEndpointID;
    public UpsertApiEndpointPathParams withApiEndpointID(String apiEndpointID) {
        this.apiEndpointID = apiEndpointID;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public UpsertApiEndpointPathParams withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;
    public UpsertApiEndpointPathParams withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
    
}