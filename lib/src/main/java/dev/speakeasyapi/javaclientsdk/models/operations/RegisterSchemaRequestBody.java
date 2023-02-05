package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class RegisterSchemaRequestBody {
    @SpeakeasyMetadata("multipartForm:file")
    public RegisterSchemaRequestBodyFile file;
    public RegisterSchemaRequestBody withFile(RegisterSchemaRequestBodyFile file) {
        this.file = file;
        return this;
    }
}
