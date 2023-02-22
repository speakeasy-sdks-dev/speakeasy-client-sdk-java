package io.github.openapi_sdks.javaclientsdk.models.operations;



public class GetApiEndpointResponse {
    public io.github.openapi_sdks.javaclientsdk.models.shared.ApiEndpoint apiEndpoint;
    public GetApiEndpointResponse withApiEndpoint(io.github.openapi_sdks.javaclientsdk.models.shared.ApiEndpoint apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
        return this;
    }
    
    public String contentType;
    public GetApiEndpointResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public io.github.openapi_sdks.javaclientsdk.models.shared.Error error;
    public GetApiEndpointResponse withError(io.github.openapi_sdks.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public GetApiEndpointResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
