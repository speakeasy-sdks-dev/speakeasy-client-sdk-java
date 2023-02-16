package .models.operations;

import .utils.SpeakeasyMetadata;

public class UpsertApiRequest {
    public UpsertApiPathParams pathParams;
    public UpsertApiRequest withPathParams(UpsertApiPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.ApiInput request;
    public UpsertApiRequest withRequest(.models.shared.ApiInput request) {
        this.request = request;
        return this;
    }
    
}
