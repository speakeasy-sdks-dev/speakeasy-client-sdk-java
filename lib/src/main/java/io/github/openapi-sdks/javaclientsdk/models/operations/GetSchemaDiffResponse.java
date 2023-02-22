package io.github.openapi-sdks.javaclientsdk.models.operations;



public class GetSchemaDiffResponse {
    public String contentType;
    public GetSchemaDiffResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public io.github.openapi-sdks.javaclientsdk.models.shared.Error error;
    public GetSchemaDiffResponse withError(io.github.openapi-sdks.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public io.github.openapi-sdks.javaclientsdk.models.shared.SchemaDiff schemaDiff;
    public GetSchemaDiffResponse withSchemaDiff(io.github.openapi-sdks.javaclientsdk.models.shared.SchemaDiff schemaDiff) {
        this.schemaDiff = schemaDiff;
        return this;
    }
    
    public Integer statusCode;
    public GetSchemaDiffResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}