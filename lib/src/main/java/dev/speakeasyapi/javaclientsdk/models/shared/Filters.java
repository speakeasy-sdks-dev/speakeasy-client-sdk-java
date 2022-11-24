package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Filters
 * Filters are used to query requests.
**/
public class Filters {
    @JsonProperty("filters")
    public Filter[] filters;

    @JsonProperty("limit")
    public long limit;

    @JsonProperty("offset")
    public long offset;

    @JsonProperty("operator")
    public String operator;
}