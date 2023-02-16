package .models.operations;



public class GetSchemaResponse {
    public String contentType;
    public GetSchemaResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public .models.shared.Error error;
    public GetSchemaResponse withError(.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public .models.shared.Schema schema;
    public GetSchemaResponse withSchema(.models.shared.Schema schema) {
        this.schema = schema;
        return this;
    }
    
    public Integer statusCode;
    public GetSchemaResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
