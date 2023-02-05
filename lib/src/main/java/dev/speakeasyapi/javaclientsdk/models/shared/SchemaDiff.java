package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * SchemaDiff
 * A SchemaDiff represents a diff of two Schemas.
**/
public class SchemaDiff {
    @JsonProperty("additions")
    public String[] additions;
    public SchemaDiff withAdditions(String[] additions) {
        this.additions = additions;
        return this;
    }
    @JsonProperty("deletions")
    public String[] deletions;
    public SchemaDiff withDeletions(String[] deletions) {
        this.deletions = deletions;
        return this;
    }
    @JsonProperty("modifications")
    public java.util.Map<String, SchemaDiffValueChange> modifications;
    public SchemaDiff withModifications(java.util.Map<String, SchemaDiffValueChange> modifications) {
        this.modifications = modifications;
        return this;
    }
}
