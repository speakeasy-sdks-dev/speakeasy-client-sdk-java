package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Filters
 * Filters are used to query requests.
**/
public class Filters {
    @JsonProperty("filters")
    public Filter[] filters;
    public Filters withFilters(Filter[] filters) {
        this.filters = filters;
        return this;
    }
    @JsonProperty("limit")
    public Long limit;
    public Filters withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonProperty("offset")
    public Long offset;
    public Filters withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    @JsonProperty("operator")
    public String operator;
    public Filters withOperator(String operator) {
        this.operator = operator;
        return this;
    }
}
