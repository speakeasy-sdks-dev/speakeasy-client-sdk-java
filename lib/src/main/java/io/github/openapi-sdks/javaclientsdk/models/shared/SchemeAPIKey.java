package io.github.openapi-sdks.javaclientsdk.models.shared;

import io.github.openapi-sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class SchemeAPIKey {
    @SpeakeasyMetadata("security:name=x-api-key")
    public String apiKey;
    public SchemeAPIKey withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
}
