package io.github.openapi_sdks.javaclientsdk.models.operations;

import io.github.openapi_sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class RevokeEmbedAccessTokenPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=tokenID")
    public String tokenID;
    public RevokeEmbedAccessTokenPathParams withTokenID(String tokenID) {
        this.tokenID = tokenID;
        return this;
    }
    
}
