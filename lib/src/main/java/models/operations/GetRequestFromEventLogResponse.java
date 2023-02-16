package .models.operations;



public class GetRequestFromEventLogResponse {
    public String contentType;
    public GetRequestFromEventLogResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public .models.shared.Error error;
    public GetRequestFromEventLogResponse withError(.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public GetRequestFromEventLogResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public .models.shared.UnboundedRequest unboundedRequest;
    public GetRequestFromEventLogResponse withUnboundedRequest(.models.shared.UnboundedRequest unboundedRequest) {
        this.unboundedRequest = unboundedRequest;
        return this;
    }
    
}
