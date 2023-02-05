package dev.speakeasyapi.javaclientsdk.models.operations;



public class UpsertApiResponse {
    public dev.speakeasyapi.javaclientsdk.models.shared.Api api;
    public UpsertApiResponse withApi(dev.speakeasyapi.javaclientsdk.models.shared.Api api) {
        this.api = api;
        return this;
    }
    public String contentType;
    public UpsertApiResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public UpsertApiResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public Long statusCode;
    public UpsertApiResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
