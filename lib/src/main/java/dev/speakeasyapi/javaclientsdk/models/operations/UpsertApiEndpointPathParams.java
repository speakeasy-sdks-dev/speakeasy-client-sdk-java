package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
public class UpsertApiEndpointPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiEndpointID")
    public String apiEndpointID;
    public UpsertApiEndpointPathParams withApiEndpointId(String apiEndpointID) {
        this.apiEndpointID = apiEndpointID;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public UpsertApiEndpointPathParams withApiId(String apiID) {
        this.apiID = apiID;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;
    public UpsertApiEndpointPathParams withVersionId(String versionID) {
        this.versionID = versionID;
        return this;
    }
}