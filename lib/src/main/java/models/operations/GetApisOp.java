package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetApisOp {
    @SpeakeasyMetadata("queryParam:name=and")
    public Boolean and;
    public GetApisOp withAnd(Boolean and) {
        this.and = and;
        return this;
    }
    
}
