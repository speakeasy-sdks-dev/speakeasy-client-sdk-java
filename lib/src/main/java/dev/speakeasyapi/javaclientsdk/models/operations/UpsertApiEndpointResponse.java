package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint;
import dev.speakeasyapi.javaclientsdk.models.shared.Error;

public class UpsertApiEndpointResponse {
    public ApiEndpoint apiEndpoint;

    public String contentType;

    public Error error;

    public long statusCode;
}