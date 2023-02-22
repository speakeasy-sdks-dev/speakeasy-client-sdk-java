package io.github.openapi_sdks.javaclientsdk.models.operations;



public class FindApiEndpointResponse {
    public io.github.openapi_sdks.javaclientsdk.models.shared.ApiEndpoint apiEndpoint;
    public FindApiEndpointResponse withApiEndpoint(io.github.openapi_sdks.javaclientsdk.models.shared.ApiEndpoint apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
        return this;
    }
    
    public String contentType;
    public FindApiEndpointResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public io.github.openapi_sdks.javaclientsdk.models.shared.Error error;
    public FindApiEndpointResponse withError(io.github.openapi_sdks.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public FindApiEndpointResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
