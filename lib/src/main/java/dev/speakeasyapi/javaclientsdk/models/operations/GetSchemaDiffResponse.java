package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.models.shared.Error;
import dev.speakeasyapi.javaclientsdk.models.shared.SchemaDiff;

public class GetSchemaDiffResponse {
    public String contentType;

    public Error error;

    public SchemaDiff schemaDiff;

    public long statusCode;
}