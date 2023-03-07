package dev.speakeasyapi.javaclientsdk.models.operations;

import java.net.http.HttpResponse;

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
    
    public Integer statusCode;
    public InsertVersionMetadataResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public InsertVersionMetadataResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public dev.speakeasyapi.javaclientsdk.models.shared.VersionMetadata versionMetadata;
    public InsertVersionMetadataResponse withVersionMetadata(dev.speakeasyapi.javaclientsdk.models.shared.VersionMetadata versionMetadata) {
        this.versionMetadata = versionMetadata;
        return this;
    }
    
}