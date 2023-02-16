package .models.operations;

import .utils.SpeakeasyMetadata;

public class UpsertApiEndpointRequest {
    public UpsertApiEndpointPathParams pathParams;
    public UpsertApiEndpointRequest withPathParams(UpsertApiEndpointPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.ApiEndpointInput request;
    public UpsertApiEndpointRequest withRequest(.models.shared.ApiEndpointInput request) {
        this.request = request;
        return this;
    }
    
}
