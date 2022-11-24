package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class GetSchemaDiffPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=baseRevisionID")
    public String baseRevisionId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=targetRevisionID")
    public String targetRevisionId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionId;
}