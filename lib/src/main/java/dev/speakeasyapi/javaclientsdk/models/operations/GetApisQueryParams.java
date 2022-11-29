package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class GetApisQueryParams {
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=metadata")
    public java.util.Optional<java.util.Map<String, java.util.List<String>>> metadata;

    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=op")
    public java.util.Optional<GetApisOp> op;
}