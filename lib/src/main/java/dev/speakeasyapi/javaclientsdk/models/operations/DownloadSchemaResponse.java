package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.models.shared.Error;

public class DownloadSchemaResponse {
    public String contentType;

    public Error error;

    public byte[] schema;

    public long statusCode;
}