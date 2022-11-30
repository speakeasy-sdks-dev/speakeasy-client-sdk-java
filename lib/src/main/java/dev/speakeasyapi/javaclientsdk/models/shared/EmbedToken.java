package dev.speakeasyapi.javaclientsdk.models.shared;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import dev.speakeasyapi.javaclientsdk.utils.DateTimeSerializer;
import dev.speakeasyapi.javaclientsdk.utils.DateTimeDeserializer;

/**
 * EmbedToken
 * A representation of an embed token granted for working with Speakeasy components.
**/
public class EmbedToken {
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    @JsonProperty("created_by")
    public String createdBy;

    @JsonProperty("description")
    public String description;

    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("expires_at")
    public OffsetDateTime expiresAt;

    @JsonProperty("filters")
    public String filters;

    @JsonProperty("id")
    public String id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("last_used")
    public java.util.Optional<OffsetDateTime> lastUsed;

    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("revoked_at")
    public java.util.Optional<OffsetDateTime> revokedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("revoked_by")
    public java.util.Optional<String> revokedBy;

    @JsonProperty("workspace_id")
    public String workspaceId;
}