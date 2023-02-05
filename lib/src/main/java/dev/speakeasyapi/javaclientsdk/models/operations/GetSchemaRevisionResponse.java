package dev.speakeasyapi.javaclientsdk.models.operations;



public class GetSchemaRevisionResponse {
    public String contentType;
    public GetSchemaRevisionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public GetSchemaRevisionResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public dev.speakeasyapi.javaclientsdk.models.shared.Schema schema;
    public GetSchemaRevisionResponse withSchema(dev.speakeasyapi.javaclientsdk.models.shared.Schema schema) {
        this.schema = schema;
        return this;
    }
    public Long statusCode;
    public GetSchemaRevisionResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
