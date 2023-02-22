package io.github.openapi_sdks.javaclientsdk.models.operations;



public class GenerateOpenApiSpecResponse {
    public String contentType;
    public GenerateOpenApiSpecResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public io.github.openapi_sdks.javaclientsdk.models.shared.Error error;
    public GenerateOpenApiSpecResponse withError(io.github.openapi_sdks.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public io.github.openapi_sdks.javaclientsdk.models.shared.GenerateOpenApiSpecDiff generateOpenApiSpecDiff;
    public GenerateOpenApiSpecResponse withGenerateOpenApiSpecDiff(io.github.openapi_sdks.javaclientsdk.models.shared.GenerateOpenApiSpecDiff generateOpenApiSpecDiff) {
        this.generateOpenApiSpecDiff = generateOpenApiSpecDiff;
        return this;
    }
    
    public Integer statusCode;
    public GenerateOpenApiSpecResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
