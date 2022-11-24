package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.models.shared.Error;
import dev.speakeasyapi.javaclientsdk.models.shared.UnboundedRequest;

public class GetRequestFromEventLogResponse {
    public String contentType;

    public Error error;

    public long statusCode;

    public UnboundedRequest unboundedRequest;
}