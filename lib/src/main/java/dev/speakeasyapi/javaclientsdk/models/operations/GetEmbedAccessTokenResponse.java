package dev.speakeasyapi.javaclientsdk.models.operations;



public class GetEmbedAccessTokenResponse {
    public String contentType;
    public GetEmbedAccessTokenResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.speakeasyapi.javaclientsdk.models.shared.EmbedAccessTokenResponse embedAccessTokenResponse;
    public GetEmbedAccessTokenResponse withEmbedAccessTokenResponse(dev.speakeasyapi.javaclientsdk.models.shared.EmbedAccessTokenResponse embedAccessTokenResponse) {
        this.embedAccessTokenResponse = embedAccessTokenResponse;
        return this;
    }
    
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public GetEmbedAccessTokenResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public GetEmbedAccessTokenResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
