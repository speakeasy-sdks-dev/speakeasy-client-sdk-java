package io.github.openapi_sdks.javaclientsdk.models.operations;

import io.github.openapi_sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class RegisterSchemaRequestBody {
    @SpeakeasyMetadata("multipartForm:file")
    public RegisterSchemaRequestBodyFile file;
    public RegisterSchemaRequestBody withFile(RegisterSchemaRequestBodyFile file) {
        this.file = file;
        return this;
    }
    
}
