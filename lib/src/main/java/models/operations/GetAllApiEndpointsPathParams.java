package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetAllApiEndpointsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public GetAllApiEndpointsPathParams withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    
}
