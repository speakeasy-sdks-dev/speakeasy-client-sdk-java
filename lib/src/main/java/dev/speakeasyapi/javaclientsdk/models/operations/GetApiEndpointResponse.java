package dev.speakeasyapi.javaclientsdk.models.operations;



public class GetApiEndpointResponse {
    public dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint apiEndpoint;
    public GetApiEndpointResponse withApiEndpoint(dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
        return this;
    }
    
    public String contentType;
    public GetApiEndpointResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public GetApiEndpointResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public GetApiEndpointResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
