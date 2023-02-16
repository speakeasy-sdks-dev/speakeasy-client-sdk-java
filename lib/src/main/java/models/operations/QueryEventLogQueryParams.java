package .models.operations;

import .utils.SpeakeasyMetadata;

public class QueryEventLogQueryParams {
    @SpeakeasyMetadata("queryParam:serialization=json,name=filters")
    public .models.shared.Filters filters;
    public QueryEventLogQueryParams withFilters(.models.shared.Filters filters) {
        this.filters = filters;
        return this;
    }
    
}
