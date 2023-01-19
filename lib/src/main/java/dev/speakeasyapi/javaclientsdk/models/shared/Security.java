package dev.speakeasyapi.javaclientsdk.models.shared;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
public class Security {
    @SpeakeasyMetadata("security:scheme=true,type=apiKey,subtype=header")
    public SchemeApiKey apiKey;
    public Security withApiKey(SchemeApiKey apiKey) {
        this.apiKey = apiKey;
        return this;
    }
}