package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class QueryEventLogQueryParams {
    @SpeakeasyMetadata("queryParam:serialization=json,name=filters")
    public java.util.Optional<dev.speakeasyapi.javaclientsdk.models.shared.Filters> filters;
}