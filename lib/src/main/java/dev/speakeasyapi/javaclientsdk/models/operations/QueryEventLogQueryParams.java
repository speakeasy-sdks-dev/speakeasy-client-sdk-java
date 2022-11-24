package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import dev.speakeasyapi.javaclientsdk.models.shared.Filters;

public class QueryEventLogQueryParams {
    @SpeakeasyMetadata("queryParam:serialization=json,name=filters")
    public Filters filters;
}