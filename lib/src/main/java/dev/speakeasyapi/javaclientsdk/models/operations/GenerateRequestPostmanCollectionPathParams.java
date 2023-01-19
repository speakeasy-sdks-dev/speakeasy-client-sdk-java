package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
public class GenerateRequestPostmanCollectionPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=requestID")
    public String requestID;
    public GenerateRequestPostmanCollectionPathParams withRequestId(String requestID) {
        this.requestID = requestID;
        return this;
    }
}