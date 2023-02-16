package .models.operations;



public class UpsertApiEndpointResponse {
    public .models.shared.ApiEndpoint apiEndpoint;
    public UpsertApiEndpointResponse withApiEndpoint(.models.shared.ApiEndpoint apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
        return this;
    }
    
    public String contentType;
    public UpsertApiEndpointResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public .models.shared.Error error;
    public UpsertApiEndpointResponse withError(.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public UpsertApiEndpointResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
