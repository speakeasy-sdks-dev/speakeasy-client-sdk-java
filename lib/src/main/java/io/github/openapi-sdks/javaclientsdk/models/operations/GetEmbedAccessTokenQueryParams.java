package io.github.openapi-sdks.javaclientsdk.models.operations;

import io.github.openapi-sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class GetEmbedAccessTokenQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=description")
    public String description;
    public GetEmbedAccessTokenQueryParams withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=duration")
    public Long duration;
    public GetEmbedAccessTokenQueryParams withDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:serialization=json,name=filters")
    public io.github.openapi-sdks.javaclientsdk.models.shared.Filters filters;
    public GetEmbedAccessTokenQueryParams withFilters(io.github.openapi-sdks.javaclientsdk.models.shared.Filters filters) {
        this.filters = filters;
        return this;
    }
    
}
