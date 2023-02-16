package dev.speakeasyapi.javaclientsdk.models.operations;



public class DeleteVersionMetadataResponse {
    public String contentType;
    public DeleteVersionMetadataResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public DeleteVersionMetadataResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public DeleteVersionMetadataResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
