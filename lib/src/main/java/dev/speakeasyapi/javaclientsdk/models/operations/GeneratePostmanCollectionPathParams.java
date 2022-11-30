package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class GeneratePostmanCollectionPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionId;
}