package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import java.time.OffsetDateTime;

public class GetAllApiVersionsQueryParams {
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=metadata")
    public java.util.Map<String, String[]> metadata;
    public GetAllApiVersionsQueryParams withMetadata(java.util.Map<String, String[]> metadata) {
        this.metadata = metadata;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=op")
    public GetAllApiVersionsOp op;
    public GetAllApiVersionsQueryParams withOp(GetAllApiVersionsOp op) {
        this.op = op;
        return this;
    }
}
