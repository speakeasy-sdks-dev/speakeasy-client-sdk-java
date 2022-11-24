package dev.speakeasyapi.javaclientsdk.models.shared;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * ApiEndpoint
 * An ApiEndpoint is a description of an Endpoint for an API.
**/
public class ApiEndpoint {
    @JsonProperty("api_endpoint_id")
    public String apiEndpointId;

    @JsonProperty("api_id")
    public String apiId;

    @JsonProperty("created_at")
    public Instant createdAt;

    @JsonProperty("description")
    public String description;

    @JsonProperty("display_name")
    public String displayName;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("matched")
    public Boolean matched;

    @JsonProperty("method")
    public String method;

    @JsonProperty("path")
    public String path;

    @JsonProperty("updated_at")
    public Instant updatedAt;

    @JsonProperty("version_id")
    public String versionId;

    @JsonProperty("workspace_id")
    public String workspaceId;
}