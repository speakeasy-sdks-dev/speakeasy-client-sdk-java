package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.speakeasyapi.javaclientsdk.utils.DateTimeDeserializer;
import dev.speakeasyapi.javaclientsdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

/**
 * Schema
 * A Schema represents an API schema for a particular Api and Version.
**/
public class Schema {
    @JsonProperty("api_id")
    public String apiId;
    public Schema withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public Schema withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonProperty("description")
    public String description;
    public Schema withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonProperty("revision_id")
    public String revisionId;
    public Schema withRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }
    @JsonProperty("version_id")
    public String versionId;
    public Schema withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    @JsonProperty("workspace_id")
    public String workspaceId;
    public Schema withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
}
