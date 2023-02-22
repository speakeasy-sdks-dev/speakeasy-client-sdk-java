package io.github.openapi_sdks.javaclientsdk.models.operations;



public class GetAllApiVersionsResponse {
    public io.github.openapi_sdks.javaclientsdk.models.shared.Api[] apis;
    public GetAllApiVersionsResponse withApis(io.github.openapi_sdks.javaclientsdk.models.shared.Api[] apis) {
        this.apis = apis;
        return this;
    }
    
    public String contentType;
    public GetAllApiVersionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public io.github.openapi_sdks.javaclientsdk.models.shared.Error error;
    public GetAllApiVersionsResponse withError(io.github.openapi_sdks.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public GetAllApiVersionsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
