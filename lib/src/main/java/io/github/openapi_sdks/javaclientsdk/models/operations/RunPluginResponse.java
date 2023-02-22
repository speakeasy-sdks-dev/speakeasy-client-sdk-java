package io.github.openapi_sdks.javaclientsdk.models.operations;



public class RunPluginResponse {
    public io.github.openapi_sdks.javaclientsdk.models.shared.BoundedRequest[] boundedRequests;
    public RunPluginResponse withBoundedRequests(io.github.openapi_sdks.javaclientsdk.models.shared.BoundedRequest[] boundedRequests) {
        this.boundedRequests = boundedRequests;
        return this;
    }
    
    public String contentType;
    public RunPluginResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public io.github.openapi_sdks.javaclientsdk.models.shared.Error error;
    public RunPluginResponse withError(io.github.openapi_sdks.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public RunPluginResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
