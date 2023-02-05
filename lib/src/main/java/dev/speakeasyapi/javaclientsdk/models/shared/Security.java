package dev.speakeasyapi.javaclientsdk.models.shared;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class Security {
    @SpeakeasyMetadata("security:scheme=true,type=apiKey,subtype=header")
    public SchemeAPIKey apiKey;
    public Security withAPIKey(SchemeAPIKey apiKey) {
        this.apiKey = apiKey;
        return this;
    }
}
