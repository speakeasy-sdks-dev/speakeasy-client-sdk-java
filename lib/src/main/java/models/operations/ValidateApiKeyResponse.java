package .models.operations;



public class ValidateApiKeyResponse {
    public String contentType;
    public ValidateApiKeyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public .models.shared.Error error;
    public ValidateApiKeyResponse withError(.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public ValidateApiKeyResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
