package io.github.openapi-sdks.javaclientsdk.models.operations;



public class QueryEventLogResponse {
    public io.github.openapi-sdks.javaclientsdk.models.shared.BoundedRequest[] boundedRequests;
    public QueryEventLogResponse withBoundedRequests(io.github.openapi-sdks.javaclientsdk.models.shared.BoundedRequest[] boundedRequests) {
        this.boundedRequests = boundedRequests;
        return this;
    }
    
    public String contentType;
    public QueryEventLogResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public io.github.openapi-sdks.javaclientsdk.models.shared.Error error;
    public QueryEventLogResponse withError(io.github.openapi-sdks.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public QueryEventLogResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
