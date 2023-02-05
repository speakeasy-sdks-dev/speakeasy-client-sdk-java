package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class GetApisOp {
    @SpeakeasyMetadata("queryParam:name=and")
    public Boolean and;
    public GetApisOp withAnd(Boolean and) {
        this.and = and;
        return this;
    }
}
