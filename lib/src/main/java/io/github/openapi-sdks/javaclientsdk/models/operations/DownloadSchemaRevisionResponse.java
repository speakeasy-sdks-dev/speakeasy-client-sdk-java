package io.github.openapi-sdks.javaclientsdk.models.operations;



public class DownloadSchemaRevisionResponse {
    public String contentType;
    public DownloadSchemaRevisionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public io.github.openapi-sdks.javaclientsdk.models.shared.Error error;
    public DownloadSchemaRevisionResponse withError(io.github.openapi-sdks.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public byte[] schema;
    public DownloadSchemaRevisionResponse withSchema(byte[] schema) {
        this.schema = schema;
        return this;
    }
    
    public Integer statusCode;
    public DownloadSchemaRevisionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}