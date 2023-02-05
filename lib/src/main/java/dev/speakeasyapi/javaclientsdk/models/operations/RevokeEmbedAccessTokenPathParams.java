package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class RevokeEmbedAccessTokenPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=tokenID")
    public String tokenID;
    public RevokeEmbedAccessTokenPathParams withTokenID(String tokenID) {
        this.tokenID = tokenID;
        return this;
    }
}
