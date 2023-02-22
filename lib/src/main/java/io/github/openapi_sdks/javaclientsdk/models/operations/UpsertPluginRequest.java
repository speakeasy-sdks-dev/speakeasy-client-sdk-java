package io.github.openapi_sdks.javaclientsdk.models.operations;

import io.github.openapi_sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class UpsertPluginRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public io.github.openapi_sdks.javaclientsdk.models.shared.Plugin request;
    public UpsertPluginRequest withRequest(io.github.openapi_sdks.javaclientsdk.models.shared.Plugin request) {
        this.request = request;
        return this;
    }
    
}
