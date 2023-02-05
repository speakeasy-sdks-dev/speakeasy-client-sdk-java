package dev.speakeasyapi.javaclientsdk.models.operations;

import java.time.OffsetDateTime;

public class GetVersionMetadataResponse {
    public String contentType;
    public GetVersionMetadataResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public GetVersionMetadataResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public Long statusCode;
    public GetVersionMetadataResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public dev.speakeasyapi.javaclientsdk.models.shared.VersionMetadata[] versionMetadata;
    public GetVersionMetadataResponse withVersionMetadata(dev.speakeasyapi.javaclientsdk.models.shared.VersionMetadata[] versionMetadata) {
        this.versionMetadata = versionMetadata;
        return this;
    }
}
