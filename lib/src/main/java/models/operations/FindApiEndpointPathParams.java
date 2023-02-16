package .models.operations;

import .utils.SpeakeasyMetadata;

public class FindApiEndpointPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public FindApiEndpointPathParams withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=displayName")
    public String displayName;
    public FindApiEndpointPathParams withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;
    public FindApiEndpointPathParams withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
    
}
