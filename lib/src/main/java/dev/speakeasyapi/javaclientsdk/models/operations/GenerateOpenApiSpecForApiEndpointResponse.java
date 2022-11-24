package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.models.shared.Error;
import dev.speakeasyapi.javaclientsdk.models.shared.GenerateOpenApiSpecDiff;

public class GenerateOpenApiSpecForApiEndpointResponse {
    public String contentType;

    public Error error;

    public GenerateOpenApiSpecDiff generateOpenApiSpecDiff;

    public long statusCode;
}