package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerateOpenApiSpecDiff {
    @JsonProperty("current_schema")
    public String currentSchema;

    @JsonProperty("new_schema")
    public String newSchema;
}