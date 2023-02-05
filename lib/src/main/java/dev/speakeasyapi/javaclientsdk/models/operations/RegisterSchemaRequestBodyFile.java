package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class RegisterSchemaRequestBodyFile {
    @SpeakeasyMetadata("multipartForm:content")
    public byte[] content;
    public RegisterSchemaRequestBodyFile withContent(byte[] content) {
        this.content = content;
        return this;
    }
    @SpeakeasyMetadata("multipartForm:name=file")
    public String file;
    public RegisterSchemaRequestBodyFile withFile(String file) {
        this.file = file;
        return this;
    }
}
