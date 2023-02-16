package .models.operations;



public class GetEmbedAccessTokenResponse {
    public String contentType;
    public GetEmbedAccessTokenResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public .models.shared.EmbedAccessTokenResponse embedAccessTokenResponse;
    public GetEmbedAccessTokenResponse withEmbedAccessTokenResponse(.models.shared.EmbedAccessTokenResponse embedAccessTokenResponse) {
        this.embedAccessTokenResponse = embedAccessTokenResponse;
        return this;
    }
    
    public .models.shared.Error error;
    public GetEmbedAccessTokenResponse withError(.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public GetEmbedAccessTokenResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
