package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.models.shared.EmbedAccessTokenResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Error;

public class GetEmbedAccessTokenResponse {
    public String contentType;

    public EmbedAccessTokenResponse embedAccessTokenResponse;

    public Error error;

    public long statusCode;
}