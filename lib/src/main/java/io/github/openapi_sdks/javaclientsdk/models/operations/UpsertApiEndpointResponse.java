package io.github.openapi_sdks.javaclientsdk.models.operations;



public class UpsertApiEndpointResponse {
    public io.github.openapi_sdks.javaclientsdk.models.shared.ApiEndpoint apiEndpoint;
    public UpsertApiEndpointResponse withApiEndpoint(io.github.openapi_sdks.javaclientsdk.models.shared.ApiEndpoint apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
        return this;
    }
    
    public String contentType;
    public UpsertApiEndpointResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public io.github.openapi_sdks.javaclientsdk.models.shared.Error error;
    public UpsertApiEndpointResponse withError(io.github.openapi_sdks.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public UpsertApiEndpointResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
