/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.DateTimeDeserializer;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

/**
 * ApiEndpoint - An ApiEndpoint is a description of an Endpoint for an API.
 */

public class ApiEndpoint {
    /**
     * The ID of this ApiEndpoint. This is a hash of the method and path.
     */
    @JsonProperty("api_endpoint_id")
    public String apiEndpointId;

    public ApiEndpoint withApiEndpointId(String apiEndpointId) {
        this.apiEndpointId = apiEndpointId;
        return this;
    }
    
    /**
     * The ID of the Api this ApiEndpoint belongs to.
     */
    @JsonProperty("api_id")
    public String apiId;

    public ApiEndpoint withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    
    /**
     * Creation timestamp.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public ApiEndpoint withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * A detailed description of the ApiEndpoint.
     */
    @JsonProperty("description")
    public String description;

    public ApiEndpoint withDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * A human-readable name for the ApiEndpoint.
     */
    @JsonProperty("display_name")
    public String displayName;

    public ApiEndpoint withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    
    /**
     * Determines if the endpoint was found in the OpenAPI spec associated with the parent Api.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("matched")
    public Boolean matched;

    public ApiEndpoint withMatched(Boolean matched) {
        this.matched = matched;
        return this;
    }
    
    /**
     * HTTP verb.
     */
    @JsonProperty("method")
    public String method;

    public ApiEndpoint withMethod(String method) {
        this.method = method;
        return this;
    }
    
    /**
     * Path that handles this Api.
     */
    @JsonProperty("path")
    public String path;

    public ApiEndpoint withPath(String path) {
        this.path = path;
        return this;
    }
    
    /**
     * Last update timestamp.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    public ApiEndpoint withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    /**
     * The version ID of the Api this ApiEndpoint belongs to.
     */
    @JsonProperty("version_id")
    public String versionId;

    public ApiEndpoint withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    
    /**
     * The workspace ID this ApiEndpoint belongs to.
     */
    @JsonProperty("workspace_id")
    public String workspaceId;

    public ApiEndpoint withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    
    public ApiEndpoint(@JsonProperty("api_endpoint_id") String apiEndpointId, @JsonProperty("api_id") String apiId, @JsonProperty("created_at") OffsetDateTime createdAt, @JsonProperty("description") String description, @JsonProperty("display_name") String displayName, @JsonProperty("method") String method, @JsonProperty("path") String path, @JsonProperty("updated_at") OffsetDateTime updatedAt, @JsonProperty("version_id") String versionId, @JsonProperty("workspace_id") String workspaceId) {
        this.apiEndpointId = apiEndpointId;
        this.apiId = apiId;
        this.createdAt = createdAt;
        this.description = description;
        this.displayName = displayName;
        this.method = method;
        this.path = path;
        this.updatedAt = updatedAt;
        this.versionId = versionId;
        this.workspaceId = workspaceId;
  }
}
