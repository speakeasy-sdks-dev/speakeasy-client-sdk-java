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
 * ApiEndpoint
 * An ApiEndpoint is a description of an Endpoint for an API.
**/
public class ApiEndpoint {
    @JsonProperty("api_endpoint_id")
    public String apiEndpointId;
    public ApiEndpoint withApiEndpointId(String apiEndpointId) {
        this.apiEndpointId = apiEndpointId;
        return this;
    }
    @JsonProperty("api_id")
    public String apiId;
    public ApiEndpoint withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public ApiEndpoint withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonProperty("description")
    public String description;
    public ApiEndpoint withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonProperty("display_name")
    public String displayName;
    public ApiEndpoint withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("matched")
    public Boolean matched;
    public ApiEndpoint withMatched(Boolean matched) {
        this.matched = matched;
        return this;
    }
    @JsonProperty("method")
    public String method;
    public ApiEndpoint withMethod(String method) {
        this.method = method;
        return this;
    }
    @JsonProperty("path")
    public String path;
    public ApiEndpoint withPath(String path) {
        this.path = path;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public ApiEndpoint withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    @JsonProperty("version_id")
    public String versionId;
    public ApiEndpoint withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    @JsonProperty("workspace_id")
    public String workspaceId;
    public ApiEndpoint withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
}
