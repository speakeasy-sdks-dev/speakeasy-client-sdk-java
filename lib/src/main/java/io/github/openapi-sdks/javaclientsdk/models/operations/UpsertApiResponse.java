package io.github.openapi-sdks.javaclientsdk.models.operations;



public class UpsertApiResponse {
    public io.github.openapi-sdks.javaclientsdk.models.shared.Api api;
    public UpsertApiResponse withApi(io.github.openapi-sdks.javaclientsdk.models.shared.Api api) {
        this.api = api;
        return this;
    }
    
    public String contentType;
    public UpsertApiResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public io.github.openapi-sdks.javaclientsdk.models.shared.Error error;
    public UpsertApiResponse withError(io.github.openapi-sdks.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public UpsertApiResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
