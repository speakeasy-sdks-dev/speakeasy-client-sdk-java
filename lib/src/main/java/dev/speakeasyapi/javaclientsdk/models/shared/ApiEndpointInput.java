package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApiEndpointInput
 * An ApiEndpoint is a description of an Endpoint for an API.
**/
public class ApiEndpointInput {
    @JsonProperty("api_endpoint_id")
    public String apiEndpointId;
    public ApiEndpointInput withApiEndpointId(String apiEndpointId) {
        this.apiEndpointId = apiEndpointId;
        return this;
    }
    @JsonProperty("description")
    public String description;
    public ApiEndpointInput withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonProperty("display_name")
    public String displayName;
    public ApiEndpointInput withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    @JsonProperty("method")
    public String method;
    public ApiEndpointInput withMethod(String method) {
        this.method = method;
        return this;
    }
    @JsonProperty("path")
    public String path;
    public ApiEndpointInput withPath(String path) {
        this.path = path;
        return this;
    }
    @JsonProperty("version_id")
    public String versionId;
    public ApiEndpointInput withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
}
