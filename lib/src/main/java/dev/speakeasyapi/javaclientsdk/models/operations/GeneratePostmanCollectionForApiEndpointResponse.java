package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.models.shared.Error;

public class GeneratePostmanCollectionForApiEndpointResponse {
    public String contentType;

    public Error error;

    public byte[] postmanCollection;

    public long statusCode;
}