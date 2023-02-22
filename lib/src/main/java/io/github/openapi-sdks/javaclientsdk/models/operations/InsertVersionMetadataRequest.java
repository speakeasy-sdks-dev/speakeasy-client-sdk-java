package io.github.openapi-sdks.javaclientsdk.models.operations;

import io.github.openapi-sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class InsertVersionMetadataRequest {
    public InsertVersionMetadataPathParams pathParams;
    public InsertVersionMetadataRequest withPathParams(InsertVersionMetadataPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public io.github.openapi-sdks.javaclientsdk.models.shared.VersionMetadataInput request;
    public InsertVersionMetadataRequest withRequest(io.github.openapi-sdks.javaclientsdk.models.shared.VersionMetadataInput request) {
        this.request = request;
        return this;
    }
    
}
