package dev.speakeasyapi.javaclientsdk.models.operations;



public class GetRequestFromEventLogResponse {
    public String contentType;
    public GetRequestFromEventLogResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public GetRequestFromEventLogResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public Long statusCode;
    public GetRequestFromEventLogResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public dev.speakeasyapi.javaclientsdk.models.shared.UnboundedRequest unboundedRequest;
    public GetRequestFromEventLogResponse withUnboundedRequest(dev.speakeasyapi.javaclientsdk.models.shared.UnboundedRequest unboundedRequest) {
        this.unboundedRequest = unboundedRequest;
        return this;
    }
}
