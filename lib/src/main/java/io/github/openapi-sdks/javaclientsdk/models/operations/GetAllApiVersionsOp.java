package io.github.openapi-sdks.javaclientsdk.models.operations;

import io.github.openapi-sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class GetAllApiVersionsOp {
    @SpeakeasyMetadata("queryParam:name=and")
    public Boolean and;
    public GetAllApiVersionsOp withAnd(Boolean and) {
        this.and = and;
        return this;
    }
    
}
