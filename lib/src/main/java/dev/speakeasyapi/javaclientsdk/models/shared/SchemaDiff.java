package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SchemaDiff
 * A SchemaDiff represents a diff of two Schemas.
**/
public class SchemaDiff {
    @JsonProperty("additions")
    public String[] additions;

    @JsonProperty("deletions")
    public String[] deletions;

    @JsonProperty("modifications")
    public java.util.Map<String, SchemaDiffValueChange> modifications;
}