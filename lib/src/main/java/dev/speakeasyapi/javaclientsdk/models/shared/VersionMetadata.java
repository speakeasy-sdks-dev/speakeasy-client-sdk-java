package dev.speakeasyapi.javaclientsdk.models.shared;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VersionMetadata
 * A set of keys and associated values, attached to a particular version of an Api.
**/
public class VersionMetadata {
    @JsonProperty("api_id")
    public String apiId;

    @JsonProperty("created_at")
    public Instant createdAt;

    @JsonProperty("meta_key")
    public String metaKey;

    @JsonProperty("meta_value")
    public String metaValue;

    @JsonProperty("version_id")
    public String versionId;

    @JsonProperty("workspace_id")
    public String workspaceId;
}