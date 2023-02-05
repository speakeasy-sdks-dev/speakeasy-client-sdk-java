package dev.speakeasyapi.javaclientsdk.models.operations;



public class UpsertApiEndpointResponse {
    public dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint apiEndpoint;
    public UpsertApiEndpointResponse withApiEndpoint(dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
        return this;
    }
    public String contentType;
    public UpsertApiEndpointResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public UpsertApiEndpointResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public Long statusCode;
    public UpsertApiEndpointResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
