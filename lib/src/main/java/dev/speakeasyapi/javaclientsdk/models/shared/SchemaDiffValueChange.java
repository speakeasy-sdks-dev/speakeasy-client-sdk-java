package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SchemaDiffValueChange {
    @JsonProperty("From")
    public String from;

    @JsonProperty("To")
    public String to;
}