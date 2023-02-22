package io.github.openapi_sdks.javaclientsdk.models.operations;

import io.github.openapi_sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class UpsertApiPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public UpsertApiPathParams withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    
}
