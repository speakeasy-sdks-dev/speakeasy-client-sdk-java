package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class RegisterSchemaRequestBody {
    @SpeakeasyMetadata("multipartForm:file")
    public RegisterSchemaRequestBodyFile file;
}