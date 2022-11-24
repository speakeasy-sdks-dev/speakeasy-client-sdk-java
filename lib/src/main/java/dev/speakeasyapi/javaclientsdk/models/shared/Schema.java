package dev.speakeasyapi.javaclientsdk.models.shared;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schema
 * A Schema represents an API schema for a particular Api and Version.
**/
public class Schema {
    @JsonProperty("api_id")
    public String apiId;

    @JsonProperty("created_at")
    public Instant createdAt;

    @JsonProperty("description")
    public String description;

    @JsonProperty("revision_id")
    public String revisionId;

    @JsonProperty("version_id")
    public String versionId;

    @JsonProperty("workspace_id")
    public String workspaceId;
}