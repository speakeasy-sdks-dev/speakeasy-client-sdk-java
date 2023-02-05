package dev.speakeasyapi.javaclientsdk.models.operations;



public class GeneratePostmanCollectionForApiEndpointResponse {
    public String contentType;
    public GeneratePostmanCollectionForApiEndpointResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public GeneratePostmanCollectionForApiEndpointResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public byte[] postmanCollection;
    public GeneratePostmanCollectionForApiEndpointResponse withPostmanCollection(byte[] postmanCollection) {
        this.postmanCollection = postmanCollection;
        return this;
    }
    public Long statusCode;
    public GeneratePostmanCollectionForApiEndpointResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
