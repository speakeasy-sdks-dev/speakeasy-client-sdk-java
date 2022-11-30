package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class RegisterSchemaRequest {
    public RegisterSchemaPathParams pathParams;

    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    public RegisterSchemaRequestBody request;
}