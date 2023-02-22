package io.github.openapi-sdks.javaclientsdk.models.operations;



public class DeleteApiResponse {
    public String contentType;
    public DeleteApiResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public io.github.openapi-sdks.javaclientsdk.models.shared.Error error;
    public DeleteApiResponse withError(io.github.openapi-sdks.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public DeleteApiResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}