package .models.operations;

import .utils.SpeakeasyMetadata;

public class InsertVersionMetadataRequest {
    public InsertVersionMetadataPathParams pathParams;
    public InsertVersionMetadataRequest withPathParams(InsertVersionMetadataPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.VersionMetadataInput request;
    public InsertVersionMetadataRequest withRequest(.models.shared.VersionMetadataInput request) {
        this.request = request;
        return this;
    }
    
}
