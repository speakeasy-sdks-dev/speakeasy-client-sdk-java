package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class RunPluginQueryParams {
    @SpeakeasyMetadata("queryParam:serialization=json,name=filters")
    public dev.speakeasyapi.javaclientsdk.models.shared.Filters filters;
    public RunPluginQueryParams withFilters(dev.speakeasyapi.javaclientsdk.models.shared.Filters filters) {
        this.filters = filters;
        return this;
    }
}
