package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class DeleteVersionMetadataPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public DeleteVersionMetadataPathParams withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=metaKey")
    public String metaKey;
    public DeleteVersionMetadataPathParams withMetaKey(String metaKey) {
        this.metaKey = metaKey;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=metaValue")
    public String metaValue;
    public DeleteVersionMetadataPathParams withMetaValue(String metaValue) {
        this.metaValue = metaValue;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;
    public DeleteVersionMetadataPathParams withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
}
