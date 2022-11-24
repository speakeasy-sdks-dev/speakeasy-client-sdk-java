package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.models.shared.EmbedToken;
import dev.speakeasyapi.javaclientsdk.models.shared.Error;

public class GetValidEmbedAccessTokensResponse {
    public String contentType;

    public EmbedToken[] embedTokens;

    public Error error;

    public long statusCode;
}