package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class GetEmbedAccessTokenQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=description")
    public String description;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=duration")
    public Long duration;

    @SpeakeasyMetadata("queryParam:serialization=json,name=filters")
    public dev.speakeasyapi.javaclientsdk.models.shared.Filters filters;
}