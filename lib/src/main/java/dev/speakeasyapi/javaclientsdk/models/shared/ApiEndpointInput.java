package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApiEndpointInput
 * An ApiEndpoint is a description of an Endpoint for an API.
**/
public class ApiEndpointInput {
    @JsonProperty("api_endpoint_id")
    public String apiEndpointId;

    @JsonProperty("description")
    public String description;

    @JsonProperty("display_name")
    public String displayName;

    @JsonProperty("method")
    public String method;

    @JsonProperty("path")
    public String path;

    @JsonProperty("version_id")
    public String versionId;
}