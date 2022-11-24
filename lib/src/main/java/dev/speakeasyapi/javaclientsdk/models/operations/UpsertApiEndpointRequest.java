package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpointInput;

public class UpsertApiEndpointRequest {
    public UpsertApiEndpointPathParams pathParams;

    @SpeakeasyMetadata("request:mediaType=application/json")
    public ApiEndpointInput request;
}