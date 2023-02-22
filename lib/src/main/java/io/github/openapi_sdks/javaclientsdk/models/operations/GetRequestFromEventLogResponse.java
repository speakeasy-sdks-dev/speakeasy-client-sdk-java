package io.github.openapi_sdks.javaclientsdk.models.operations;



public class GetRequestFromEventLogResponse {
    public String contentType;
    public GetRequestFromEventLogResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public io.github.openapi_sdks.javaclientsdk.models.shared.Error error;
    public GetRequestFromEventLogResponse withError(io.github.openapi_sdks.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public GetRequestFromEventLogResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public io.github.openapi_sdks.javaclientsdk.models.shared.UnboundedRequest unboundedRequest;
    public GetRequestFromEventLogResponse withUnboundedRequest(io.github.openapi_sdks.javaclientsdk.models.shared.UnboundedRequest unboundedRequest) {
        this.unboundedRequest = unboundedRequest;
        return this;
    }
    
}
