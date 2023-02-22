package io.github.openapi_sdks.javaclientsdk.models.shared;

import io.github.openapi_sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class Security {
    @SpeakeasyMetadata("security:scheme=true,type=apiKey,subtype=header")
    public SchemeAPIKey apiKey;
    public Security withAPIKey(SchemeAPIKey apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
}
