package dev.speakeasyapi.javaclientsdk.models.operations;



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
    public Long statusCode;
    public GenerateOpenApiSpecResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
