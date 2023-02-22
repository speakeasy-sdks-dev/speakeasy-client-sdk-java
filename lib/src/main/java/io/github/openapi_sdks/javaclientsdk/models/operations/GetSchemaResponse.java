package io.github.openapi_sdks.javaclientsdk.models.operations;



public class GetSchemaResponse {
    public String contentType;
    public GetSchemaResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public io.github.openapi_sdks.javaclientsdk.models.shared.Error error;
    public GetSchemaResponse withError(io.github.openapi_sdks.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public io.github.openapi_sdks.javaclientsdk.models.shared.Schema schema;
    public GetSchemaResponse withSchema(io.github.openapi_sdks.javaclientsdk.models.shared.Schema schema) {
        this.schema = schema;
        return this;
    }
    
    public Integer statusCode;
    public GetSchemaResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
