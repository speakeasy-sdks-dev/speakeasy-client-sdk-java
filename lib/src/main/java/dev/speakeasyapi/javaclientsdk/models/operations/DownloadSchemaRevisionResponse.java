package dev.speakeasyapi.javaclientsdk.models.operations;



public class DownloadSchemaRevisionResponse {
    public String contentType;
    public DownloadSchemaRevisionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public DownloadSchemaRevisionResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public byte[] schema;
    public DownloadSchemaRevisionResponse withSchema(byte[] schema) {
        this.schema = schema;
        return this;
    }
    public Long statusCode;
    public DownloadSchemaRevisionResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
