package .models.operations;



public class GenerateOpenApiSpecResponse {
    public String contentType;
    public GenerateOpenApiSpecResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public .models.shared.Error error;
    public GenerateOpenApiSpecResponse withError(.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public .models.shared.GenerateOpenApiSpecDiff generateOpenApiSpecDiff;
    public GenerateOpenApiSpecResponse withGenerateOpenApiSpecDiff(.models.shared.GenerateOpenApiSpecDiff generateOpenApiSpecDiff) {
        this.generateOpenApiSpecDiff = generateOpenApiSpecDiff;
        return this;
    }
    
    public Integer statusCode;
    public GenerateOpenApiSpecResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
