package dev.speakeasyapi.javaclientsdk.models.operations;



public class InsertVersionMetadataResponse {
    public String contentType;
    public InsertVersionMetadataResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public InsertVersionMetadataResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public Long statusCode;
    public InsertVersionMetadataResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public dev.speakeasyapi.javaclientsdk.models.shared.VersionMetadata versionMetadata;
    public InsertVersionMetadataResponse withVersionMetadata(dev.speakeasyapi.javaclientsdk.models.shared.VersionMetadata versionMetadata) {
        this.versionMetadata = versionMetadata;
        return this;
    }
}
