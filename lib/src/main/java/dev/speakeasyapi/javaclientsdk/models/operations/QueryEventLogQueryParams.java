package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class QueryEventLogQueryParams {
    @SpeakeasyMetadata("queryParam:serialization=json,name=filters")
    public dev.speakeasyapi.javaclientsdk.models.shared.Filters filters;
    public QueryEventLogQueryParams withFilters(dev.speakeasyapi.javaclientsdk.models.shared.Filters filters) {
        this.filters = filters;
        return this;
    }
}
