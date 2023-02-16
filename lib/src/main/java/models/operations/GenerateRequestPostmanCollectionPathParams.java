package .models.operations;

import .utils.SpeakeasyMetadata;

public class GenerateRequestPostmanCollectionPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=requestID")
    public String requestID;
    public GenerateRequestPostmanCollectionPathParams withRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }
    
}
