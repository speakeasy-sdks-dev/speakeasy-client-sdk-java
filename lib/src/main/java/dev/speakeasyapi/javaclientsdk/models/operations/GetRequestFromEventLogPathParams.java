package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class GetRequestFromEventLogPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=requestID")
    public String requestID;
    public GetRequestFromEventLogPathParams withRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }
}
