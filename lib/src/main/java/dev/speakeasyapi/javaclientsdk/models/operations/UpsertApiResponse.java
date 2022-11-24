package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.models.shared.Api;
import dev.speakeasyapi.javaclientsdk.models.shared.Error;

public class UpsertApiResponse {
    public Api api;

    public String contentType;

    public Error error;

    public long statusCode;
}