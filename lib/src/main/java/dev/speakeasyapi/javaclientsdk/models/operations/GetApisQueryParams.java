package dev.speakeasyapi.javaclientsdk.models.operations;

import java.util.Map;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class GetApisQueryParams {
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=metadata")
    public Map<String, String[]> metadata;

    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=op")
    public GetApisOp op;
}