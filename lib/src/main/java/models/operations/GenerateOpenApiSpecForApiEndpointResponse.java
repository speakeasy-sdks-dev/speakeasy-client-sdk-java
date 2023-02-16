package .models.operations;



public class GenerateOpenApiSpecForApiEndpointResponse {
    public String contentType;
    public GenerateOpenApiSpecForApiEndpointResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public .models.shared.Error error;
    public GenerateOpenApiSpecForApiEndpointResponse withError(.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public .models.shared.GenerateOpenApiSpecDiff generateOpenApiSpecDiff;
    public GenerateOpenApiSpecForApiEndpointResponse withGenerateOpenApiSpecDiff(.models.shared.GenerateOpenApiSpecDiff generateOpenApiSpecDiff) {
        this.generateOpenApiSpecDiff = generateOpenApiSpecDiff;
        return this;
    }
    
    public Integer statusCode;
    public GenerateOpenApiSpecForApiEndpointResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
