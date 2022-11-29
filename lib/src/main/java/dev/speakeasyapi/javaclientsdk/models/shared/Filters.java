package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Filters
 * Filters are used to query requests.
**/
public class Filters {
    @JsonProperty("filters")
    public java.util.List<Filter> filters;

    @JsonProperty("limit")
    public Long limit;

    @JsonProperty("offset")
    public Long offset;

    @JsonProperty("operator")
    public String operator;
}