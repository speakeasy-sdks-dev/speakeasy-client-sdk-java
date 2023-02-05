package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.speakeasyapi.javaclientsdk.utils.DateTimeDeserializer;
import dev.speakeasyapi.javaclientsdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

/**
 * EmbedToken
 * A representation of an embed token granted for working with Speakeasy components.
**/
public class EmbedToken {
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public EmbedToken withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonProperty("created_by")
    public String createdBy;
    public EmbedToken withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    @JsonProperty("description")
    public String description;
    public EmbedToken withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("expires_at")
    public OffsetDateTime expiresAt;
    public EmbedToken withExpiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    @JsonProperty("filters")
    public String filters;
    public EmbedToken withFilters(String filters) {
        this.filters = filters;
        return this;
    }
    @JsonProperty("id")
    public String id;
    public EmbedToken withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("last_used")
    public OffsetDateTime lastUsed;
    public EmbedToken withLastUsed(OffsetDateTime lastUsed) {
        this.lastUsed = lastUsed;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("revoked_at")
    public OffsetDateTime revokedAt;
    public EmbedToken withRevokedAt(OffsetDateTime revokedAt) {
        this.revokedAt = revokedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("revoked_by")
    public String revokedBy;
    public EmbedToken withRevokedBy(String revokedBy) {
        this.revokedBy = revokedBy;
        return this;
    }
    @JsonProperty("workspace_id")
    public String workspaceId;
    public EmbedToken withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
}
