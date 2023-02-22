package io.github.openapi-sdks.javaclientsdk.models.operations;



public class GetAllForVersionApiEndpointsResponse {
    public io.github.openapi-sdks.javaclientsdk.models.shared.ApiEndpoint[] apiEndpoints;
    public GetAllForVersionApiEndpointsResponse withApiEndpoints(io.github.openapi-sdks.javaclientsdk.models.shared.ApiEndpoint[] apiEndpoints) {
        this.apiEndpoints = apiEndpoints;
        return this;
    }
    
    public String contentType;
    public GetAllForVersionApiEndpointsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public io.github.openapi-sdks.javaclientsdk.models.shared.Error error;
    public GetAllForVersionApiEndpointsResponse withError(io.github.openapi-sdks.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public GetAllForVersionApiEndpointsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
