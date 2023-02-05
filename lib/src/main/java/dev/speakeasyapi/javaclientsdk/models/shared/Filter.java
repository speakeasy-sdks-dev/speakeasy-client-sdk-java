package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Filter
 * A filter is a key-value pair that can be used to filter a list of requests.
**/
public class Filter {
    @JsonProperty("key")
    public String key;
    public Filter withKey(String key) {
        this.key = key;
        return this;
    }
    @JsonProperty("operator")
    public String operator;
    public Filter withOperator(String operator) {
        this.operator = operator;
        return this;
    }
    @JsonProperty("value")
    public String value;
    public Filter withValue(String value) {
        this.value = value;
        return this;
    }
}
