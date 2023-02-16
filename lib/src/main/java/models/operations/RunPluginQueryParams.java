package .models.operations;

import .utils.SpeakeasyMetadata;

public class RunPluginQueryParams {
    @SpeakeasyMetadata("queryParam:serialization=json,name=filters")
    public .models.shared.Filters filters;
    public RunPluginQueryParams withFilters(.models.shared.Filters filters) {
        this.filters = filters;
        return this;
    }
    
}
