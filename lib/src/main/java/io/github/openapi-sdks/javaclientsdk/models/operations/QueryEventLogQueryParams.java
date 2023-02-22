package io.github.openapi-sdks.javaclientsdk.models.operations;

import io.github.openapi-sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class QueryEventLogQueryParams {
    @SpeakeasyMetadata("queryParam:serialization=json,name=filters")
    public io.github.openapi-sdks.javaclientsdk.models.shared.Filters filters;
    public QueryEventLogQueryParams withFilters(io.github.openapi-sdks.javaclientsdk.models.shared.Filters filters) {
        this.filters = filters;
        return this;
    }
    
}
