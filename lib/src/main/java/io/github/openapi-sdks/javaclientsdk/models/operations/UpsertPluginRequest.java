package io.github.openapi-sdks.javaclientsdk.models.operations;

import io.github.openapi-sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class UpsertPluginRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public io.github.openapi-sdks.javaclientsdk.models.shared.Plugin request;
    public UpsertPluginRequest withRequest(io.github.openapi-sdks.javaclientsdk.models.shared.Plugin request) {
        this.request = request;
        return this;
    }
    
}
