package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

/**
 * GetAllApiVersionsOp
 * Configuration for filter operations
**/
public class GetAllApiVersionsOp {
    @SpeakeasyMetadata("queryParam:name=and")
    public Boolean and;
    public GetAllApiVersionsOp withAnd(Boolean and) {
        this.and = and;
        return this;
    }
    
}
