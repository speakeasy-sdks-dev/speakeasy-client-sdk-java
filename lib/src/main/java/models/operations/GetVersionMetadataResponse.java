package .models.operations;



public class GetVersionMetadataResponse {
    public String contentType;
    public GetVersionMetadataResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public .models.shared.Error error;
    public GetVersionMetadataResponse withError(.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public GetVersionMetadataResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public .models.shared.VersionMetadata[] versionMetadata;
    public GetVersionMetadataResponse withVersionMetadata(.models.shared.VersionMetadata[] versionMetadata) {
        this.versionMetadata = versionMetadata;
        return this;
    }
    
}
