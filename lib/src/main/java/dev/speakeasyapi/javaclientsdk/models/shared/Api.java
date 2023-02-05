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
 * Api
 * An Api is representation of a API (a collection of API Endpoints) within the Speakeasy Platform.
**/
public class Api {
    @JsonProperty("api_id")
    public String apiId;
    public Api withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public Api withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonProperty("description")
    public String description;
    public Api withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("matched")
    public Boolean matched;
    public Api withMatched(Boolean matched) {
        this.matched = matched;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta_data")
    public java.util.Map<String, String[]> metaData;
    public Api withMetaData(java.util.Map<String, String[]> metaData) {
        this.metaData = metaData;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public Api withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    @JsonProperty("version_id")
    public String versionId;
    public Api withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    @JsonProperty("workspace_id")
    public String workspaceId;
    public Api withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
}
