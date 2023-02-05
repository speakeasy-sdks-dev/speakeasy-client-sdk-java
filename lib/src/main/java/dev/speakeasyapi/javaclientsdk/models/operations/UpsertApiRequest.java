package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class UpsertApiRequest {
    public UpsertApiPathParams pathParams;
    public UpsertApiRequest withPathParams(UpsertApiPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.speakeasyapi.javaclientsdk.models.shared.ApiInput request;
    public UpsertApiRequest withRequest(dev.speakeasyapi.javaclientsdk.models.shared.ApiInput request) {
        this.request = request;
        return this;
    }
}
