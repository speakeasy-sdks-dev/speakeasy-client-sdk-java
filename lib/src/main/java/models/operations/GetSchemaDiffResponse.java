package .models.operations;



public class GetSchemaDiffResponse {
    public String contentType;
    public GetSchemaDiffResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public .models.shared.Error error;
    public GetSchemaDiffResponse withError(.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public .models.shared.SchemaDiff schemaDiff;
    public GetSchemaDiffResponse withSchemaDiff(.models.shared.SchemaDiff schemaDiff) {
        this.schemaDiff = schemaDiff;
        return this;
    }
    
    public Integer statusCode;
    public GetSchemaDiffResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
