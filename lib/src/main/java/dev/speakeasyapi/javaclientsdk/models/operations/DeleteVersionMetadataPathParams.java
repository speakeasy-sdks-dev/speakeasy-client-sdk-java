package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class DeleteVersionMetadataPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=metaKey")
    public String metaKey;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=metaValue")
    public String metaValue;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionId;
}