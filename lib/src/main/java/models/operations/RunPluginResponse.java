package .models.operations;



public class RunPluginResponse {
    public .models.shared.BoundedRequest[] boundedRequests;
    public RunPluginResponse withBoundedRequests(.models.shared.BoundedRequest[] boundedRequests) {
        this.boundedRequests = boundedRequests;
        return this;
    }
    
    public String contentType;
    public RunPluginResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public .models.shared.Error error;
    public RunPluginResponse withError(.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public RunPluginResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
