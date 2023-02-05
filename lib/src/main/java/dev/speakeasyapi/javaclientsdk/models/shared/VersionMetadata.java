package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.speakeasyapi.javaclientsdk.utils.DateTimeDeserializer;
import dev.speakeasyapi.javaclientsdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

/**
 * VersionMetadata
 * A set of keys and associated values, attached to a particular version of an Api.
**/
public class VersionMetadata {
    @JsonProperty("api_id")
    public String apiId;
    public VersionMetadata withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public VersionMetadata withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonProperty("meta_key")
    public String metaKey;
    public VersionMetadata withMetaKey(String metaKey) {
        this.metaKey = metaKey;
        return this;
    }
    @JsonProperty("meta_value")
    public String metaValue;
    public VersionMetadata withMetaValue(String metaValue) {
        this.metaValue = metaValue;
        return this;
    }
    @JsonProperty("version_id")
    public String versionId;
    public VersionMetadata withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    @JsonProperty("workspace_id")
    public String workspaceId;
    public VersionMetadata withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
}
