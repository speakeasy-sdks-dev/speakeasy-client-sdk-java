package dev.speakeasyapi.javaclientsdk.models.operations;

import java.time.OffsetDateTime;

public class QueryEventLogResponse {
    public dev.speakeasyapi.javaclientsdk.models.shared.BoundedRequest[] boundedRequests;
    public QueryEventLogResponse withBoundedRequests(dev.speakeasyapi.javaclientsdk.models.shared.BoundedRequest[] boundedRequests) {
        this.boundedRequests = boundedRequests;
        return this;
    }
    public String contentType;
    public QueryEventLogResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public QueryEventLogResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public Long statusCode;
    public QueryEventLogResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
