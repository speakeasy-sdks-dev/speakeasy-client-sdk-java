package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class UpsertApiRequest {
    public UpsertApiPathParams pathParams;

    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.speakeasyapi.javaclientsdk.models.shared.ApiInput request;
}