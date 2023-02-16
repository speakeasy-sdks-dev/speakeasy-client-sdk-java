package .models.operations;



public class RevokeEmbedAccessTokenResponse {
    public String contentType;
    public RevokeEmbedAccessTokenResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public .models.shared.Error error;
    public RevokeEmbedAccessTokenResponse withError(.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public RevokeEmbedAccessTokenResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
