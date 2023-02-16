package .models.operations;



public class QueryEventLogResponse {
    public .models.shared.BoundedRequest[] boundedRequests;
    public QueryEventLogResponse withBoundedRequests(.models.shared.BoundedRequest[] boundedRequests) {
        this.boundedRequests = boundedRequests;
        return this;
    }
    
    public String contentType;
    public QueryEventLogResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public .models.shared.Error error;
    public QueryEventLogResponse withError(.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public QueryEventLogResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
