package .models.operations;



public class GetEmbedAccessTokenRequest {
    public GetEmbedAccessTokenQueryParams queryParams;
    public GetEmbedAccessTokenRequest withQueryParams(GetEmbedAccessTokenQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
}
