package dev.speakeasyapi.javaclientsdk.models.operations;

import java.time.OffsetDateTime;

public class GetSchemasResponse {
    public String contentType;
    public GetSchemasResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public GetSchemasResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public dev.speakeasyapi.javaclientsdk.models.shared.Schema[] schemata;
    public GetSchemasResponse withSchemata(dev.speakeasyapi.javaclientsdk.models.shared.Schema[] schemata) {
        this.schemata = schemata;
        return this;
    }
    public Long statusCode;
    public GetSchemasResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
