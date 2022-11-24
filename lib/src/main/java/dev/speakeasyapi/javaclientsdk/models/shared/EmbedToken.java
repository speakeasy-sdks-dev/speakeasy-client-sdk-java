package dev.speakeasyapi.javaclientsdk.models.shared;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * EmbedToken
 * A representation of an embed token granted for working with Speakeasy components.
**/
public class EmbedToken {
    @JsonProperty("created_at")
    public Instant createdAt;

    @JsonProperty("created_by")
    public String createdBy;

    @JsonProperty("description")
    public String description;

    @JsonProperty("expires_at")
    public Instant expiresAt;

    @JsonProperty("filters")
    public String filters;

    @JsonProperty("id")
    public String id;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("last_used")
    public Instant lastUsed;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("revoked_at")
    public Instant revokedAt;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("revoked_by")
    public String revokedBy;

    @JsonProperty("workspace_id")
    public String workspaceId;
}