package .models.operations;



public class UpsertApiResponse {
    public .models.shared.Api api;
    public UpsertApiResponse withApi(.models.shared.Api api) {
        this.api = api;
        return this;
    }
    
    public String contentType;
    public UpsertApiResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public .models.shared.Error error;
    public UpsertApiResponse withError(.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public UpsertApiResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
