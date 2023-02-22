package dev.speakeasyapi.javaclientsdk.models.operations;



public class DownloadSchemaResponse {
    public String contentType;
    public DownloadSchemaResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public DownloadSchemaResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public byte[] schema;
    public DownloadSchemaResponse withSchema(byte[] schema) {
        this.schema = schema;
        return this;
    }
    
    public Integer statusCode;
    public DownloadSchemaResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
