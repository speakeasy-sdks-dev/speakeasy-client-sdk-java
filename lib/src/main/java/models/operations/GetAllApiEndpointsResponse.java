package .models.operations;



public class GetAllApiEndpointsResponse {
    public .models.shared.ApiEndpoint[] apiEndpoints;
    public GetAllApiEndpointsResponse withApiEndpoints(.models.shared.ApiEndpoint[] apiEndpoints) {
        this.apiEndpoints = apiEndpoints;
        return this;
    }
    
    public String contentType;
    public GetAllApiEndpointsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public .models.shared.Error error;
    public GetAllApiEndpointsResponse withError(.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public GetAllApiEndpointsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
