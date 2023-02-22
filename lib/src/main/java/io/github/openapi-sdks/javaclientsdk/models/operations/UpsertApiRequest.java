package io.github.openapi-sdks.javaclientsdk.models.operations;

import io.github.openapi-sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class UpsertApiRequest {
    public UpsertApiPathParams pathParams;
    public UpsertApiRequest withPathParams(UpsertApiPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public io.github.openapi-sdks.javaclientsdk.models.shared.ApiInput request;
    public UpsertApiRequest withRequest(io.github.openapi-sdks.javaclientsdk.models.shared.ApiInput request) {
        this.request = request;
        return this;
    }
    
}
