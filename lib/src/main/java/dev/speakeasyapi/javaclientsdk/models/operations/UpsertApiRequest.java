package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import dev.speakeasyapi.javaclientsdk.models.shared.ApiInput;

public class UpsertApiRequest {
    public UpsertApiPathParams pathParams;

    @SpeakeasyMetadata("request:mediaType=application/json")
    public ApiInput request;
}