package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.models.shared.BoundedRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.Error;

public class QueryEventLogResponse {
    public BoundedRequest[] boundedRequests;

    public String contentType;

    public Error error;

    public long statusCode;
}