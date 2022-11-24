package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.models.shared.Error;
import dev.speakeasyapi.javaclientsdk.models.shared.VersionMetadata;

public class InsertVersionMetadataResponse {
    public String contentType;

    public Error error;

    public long statusCode;

    public VersionMetadata versionMetadata;
}