package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.models.shared.Api;
import dev.speakeasyapi.javaclientsdk.models.shared.Error;

public class GetAllApiVersionsResponse {
    public Api[] apis;

    public String contentType;

    public Error error;

    public long statusCode;
}