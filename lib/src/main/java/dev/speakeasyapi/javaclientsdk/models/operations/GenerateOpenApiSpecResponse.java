package dev.speakeasyapi.javaclientsdk.models.operations;

import java.net.http.HttpResponse;

public class GenerateOpenApiSpecResponse {
    public String contentType;
    public GenerateOpenApiSpecResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public GenerateOpenApiSpecResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public dev.speakeasyapi.javaclientsdk.models.shared.GenerateOpenApiSpecDiff generateOpenApiSpecDiff;
    public GenerateOpenApiSpecResponse withGenerateOpenApiSpecDiff(dev.speakeasyapi.javaclientsdk.models.shared.GenerateOpenApiSpecDiff generateOpenApiSpecDiff) {
        this.generateOpenApiSpecDiff = generateOpenApiSpecDiff;
        return this;
    }
    
    public Integer statusCode;
    public GenerateOpenApiSpecResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GenerateOpenApiSpecResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}