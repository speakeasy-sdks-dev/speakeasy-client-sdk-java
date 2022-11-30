package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class RegisterSchemaRequestBodyFile {
    @SpeakeasyMetadata("multipartForm:content")
    public byte[] content;

    @SpeakeasyMetadata("multipartForm:name=file")
    public String file;
}