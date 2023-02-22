package io.github.openapi_sdks.javaclientsdk.models.operations;

import io.github.openapi_sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class InsertVersionMetadataRequest {
    public InsertVersionMetadataPathParams pathParams;
    public InsertVersionMetadataRequest withPathParams(InsertVersionMetadataPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public io.github.openapi_sdks.javaclientsdk.models.shared.VersionMetadataInput request;
    public InsertVersionMetadataRequest withRequest(io.github.openapi_sdks.javaclientsdk.models.shared.VersionMetadataInput request) {
        this.request = request;
        return this;
    }
    
}
