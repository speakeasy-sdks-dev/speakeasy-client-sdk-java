package dev.speakeasyapi.javaclientsdk.models.shared;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Map;

/**
 * Api
 * An Api is representation of a API (a collection of API Endpoints) within the Speakeasy Platform.
**/
public class Api {
    @JsonProperty("api_id")
    public String apiId;

    @JsonProperty("created_at")
    public Instant createdAt;

    @JsonProperty("description")
    public String description;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("matched")
    public Boolean matched;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("meta_data")
    public Map<String, String[]> metaData;

    @JsonProperty("updated_at")
    public Instant updatedAt;

    @JsonProperty("version_id")
    public String versionId;

    @JsonProperty("workspace_id")
    public String workspaceId;
}