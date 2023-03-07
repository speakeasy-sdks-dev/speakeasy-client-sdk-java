package dev.speakeasyapi.javaclientsdk.models.operations;

import java.net.http.HttpResponse;

public class GetSchemaResponse {
    public String contentType;
    public GetSchemaResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public GetSchemaResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public dev.speakeasyapi.javaclientsdk.models.shared.Schema schema;
    public GetSchemaResponse withSchema(dev.speakeasyapi.javaclientsdk.models.shared.Schema schema) {
        this.schema = schema;
        return this;
    }
    
    public Integer statusCode;
    public GetSchemaResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetSchemaResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}