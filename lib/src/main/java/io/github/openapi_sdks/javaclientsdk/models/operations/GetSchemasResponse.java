package io.github.openapi_sdks.javaclientsdk.models.operations;



public class GetSchemasResponse {
    public String contentType;
    public GetSchemasResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public io.github.openapi_sdks.javaclientsdk.models.shared.Error error;
    public GetSchemasResponse withError(io.github.openapi_sdks.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public io.github.openapi_sdks.javaclientsdk.models.shared.Schema[] schemata;
    public GetSchemasResponse withSchemata(io.github.openapi_sdks.javaclientsdk.models.shared.Schema[] schemata) {
        this.schemata = schemata;
        return this;
    }
    
    public Integer statusCode;
    public GetSchemasResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
