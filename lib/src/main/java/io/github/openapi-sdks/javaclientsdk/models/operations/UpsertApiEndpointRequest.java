package io.github.openapi-sdks.javaclientsdk.models.operations;

import io.github.openapi-sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class UpsertApiEndpointRequest {
    public UpsertApiEndpointPathParams pathParams;
    public UpsertApiEndpointRequest withPathParams(UpsertApiEndpointPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public io.github.openapi-sdks.javaclientsdk.models.shared.ApiEndpointInput request;
    public UpsertApiEndpointRequest withRequest(io.github.openapi-sdks.javaclientsdk.models.shared.ApiEndpointInput request) {
        this.request = request;
        return this;
    }
    
}
