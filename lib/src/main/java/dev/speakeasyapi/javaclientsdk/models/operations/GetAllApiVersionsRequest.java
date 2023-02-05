package dev.speakeasyapi.javaclientsdk.models.operations;



public class GetAllApiVersionsRequest {
    public GetAllApiVersionsPathParams pathParams;
    public GetAllApiVersionsRequest withPathParams(GetAllApiVersionsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetAllApiVersionsQueryParams queryParams;
    public GetAllApiVersionsRequest withQueryParams(GetAllApiVersionsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}
