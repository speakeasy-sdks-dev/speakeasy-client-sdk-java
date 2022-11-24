package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import dev.speakeasyapi.javaclientsdk.models.shared.VersionMetadataInput;

public class InsertVersionMetadataRequest {
    public InsertVersionMetadataPathParams pathParams;

    @SpeakeasyMetadata("request:mediaType=application/json")
    public VersionMetadataInput request;
}