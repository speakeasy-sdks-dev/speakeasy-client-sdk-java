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
 * ApiEndpoint
 * An ApiEndpoint is a description of an Endpoint for an API.
**/
public class ApiEndpoint {
    @JsonProperty("api_endpoint_id")
    public String apiEndpointId;

    @JsonProperty("api_id")
    public String apiId;

    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    @JsonProperty("description")
    public String description;

    @JsonProperty("display_name")
    public String displayName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("matched")
    public java.util.Optional<Boolean> matched;

    @JsonProperty("method")
    public String method;

    @JsonProperty("path")
    public String path;

    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    @JsonProperty("version_id")
    public String versionId;

    @JsonProperty("workspace_id")
    public String workspaceId;
}