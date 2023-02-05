package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import java.time.OffsetDateTime;

public class GetApisQueryParams {
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=metadata")
    public java.util.Map<String, String[]> metadata;
    public GetApisQueryParams withMetadata(java.util.Map<String, String[]> metadata) {
        this.metadata = metadata;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=op")
    public GetApisOp op;
    public GetApisQueryParams withOp(GetApisOp op) {
        this.op = op;
        return this;
    }
}
