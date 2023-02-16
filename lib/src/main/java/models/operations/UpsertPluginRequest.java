package .models.operations;

import .utils.SpeakeasyMetadata;

public class UpsertPluginRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.Plugin request;
    public UpsertPluginRequest withRequest(.models.shared.Plugin request) {
        this.request = request;
        return this;
    }
    
}
