package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.models.shared.Error;
import dev.speakeasyapi.javaclientsdk.models.shared.Schema;

public class GetSchemasResponse {
    public String contentType;

    public Error error;

    public Schema[] schemata;

    public long statusCode;
}