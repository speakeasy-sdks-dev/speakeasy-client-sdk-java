package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class UpsertApiEndpointRequest {
    public UpsertApiEndpointPathParams pathParams;
    public UpsertApiEndpointRequest withPathParams(UpsertApiEndpointPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpointInput request;
    public UpsertApiEndpointRequest withRequest(dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpointInput request) {
        this.request = request;
        return this;
    }
}
