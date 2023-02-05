package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class UpsertPluginRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.speakeasyapi.javaclientsdk.models.shared.Plugin request;
    public UpsertPluginRequest withRequest(dev.speakeasyapi.javaclientsdk.models.shared.Plugin request) {
        this.request = request;
        return this;
    }
}
