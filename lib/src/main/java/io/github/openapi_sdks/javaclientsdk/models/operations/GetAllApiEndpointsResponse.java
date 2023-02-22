package io.github.openapi_sdks.javaclientsdk.models.operations;



public class GetAllApiEndpointsResponse {
    public io.github.openapi_sdks.javaclientsdk.models.shared.ApiEndpoint[] apiEndpoints;
    public GetAllApiEndpointsResponse withApiEndpoints(io.github.openapi_sdks.javaclientsdk.models.shared.ApiEndpoint[] apiEndpoints) {
        this.apiEndpoints = apiEndpoints;
        return this;
    }
    
    public String contentType;
    public GetAllApiEndpointsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public io.github.openapi_sdks.javaclientsdk.models.shared.Error error;
    public GetAllApiEndpointsResponse withError(io.github.openapi_sdks.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public GetAllApiEndpointsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
