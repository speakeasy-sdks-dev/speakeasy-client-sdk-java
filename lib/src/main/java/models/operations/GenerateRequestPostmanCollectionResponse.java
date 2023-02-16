package .models.operations;



public class GenerateRequestPostmanCollectionResponse {
    public String contentType;
    public GenerateRequestPostmanCollectionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public .models.shared.Error error;
    public GenerateRequestPostmanCollectionResponse withError(.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public byte[] postmanCollection;
    public GenerateRequestPostmanCollectionResponse withPostmanCollection(byte[] postmanCollection) {
        this.postmanCollection = postmanCollection;
        return this;
    }
    
    public Integer statusCode;
    public GenerateRequestPostmanCollectionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
