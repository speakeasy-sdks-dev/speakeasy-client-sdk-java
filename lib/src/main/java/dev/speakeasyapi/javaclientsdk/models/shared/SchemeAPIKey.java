package dev.speakeasyapi.javaclientsdk.models.shared;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class SchemeAPIKey {
    @SpeakeasyMetadata("security:name=x-api-key")
    public String apiKey;
    public SchemeAPIKey withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
}
