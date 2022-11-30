package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Filter
 * A filter is a key-value pair that can be used to filter a list of requests.
**/
public class Filter {
    @JsonProperty("key")
    public String key;

    @JsonProperty("operator")
    public String operator;

    @JsonProperty("value")
    public String value;
}