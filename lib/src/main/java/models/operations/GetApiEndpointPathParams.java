package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetApiEndpointPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiEndpointID")
    public String apiEndpointID;
    public GetApiEndpointPathParams withApiEndpointID(String apiEndpointID) {
        this.apiEndpointID = apiEndpointID;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public GetApiEndpointPathParams withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;
    public GetApiEndpointPathParams withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
    
}
