package .models.shared;

import .utils.SpeakeasyMetadata;

public class Security {
    @SpeakeasyMetadata("security:scheme=true,type=apiKey,subtype=header")
    public SchemeAPIKey apiKey;
    public Security withAPIKey(SchemeAPIKey apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
}
