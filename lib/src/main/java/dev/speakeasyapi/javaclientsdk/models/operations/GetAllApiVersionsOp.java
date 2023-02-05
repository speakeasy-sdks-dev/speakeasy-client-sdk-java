package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class GetAllApiVersionsOp {
    @SpeakeasyMetadata("queryParam:name=and")
    public Boolean and;
    public GetAllApiVersionsOp withAnd(Boolean and) {
        this.and = and;
        return this;
    }
}
