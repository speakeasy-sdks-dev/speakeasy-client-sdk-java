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
 * Api
 * An Api is representation of a API (a collection of API Endpoints) within the Speakeasy Platform.
**/
public class Api {
    @JsonProperty("api_id")
    public String apiId;

    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    @JsonProperty("description")
    public String description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("matched")
    public java.util.Optional<Boolean> matched;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta_data")
    public java.util.Optional<java.util.Map<String, String[]>> metaData;

    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    @JsonProperty("version_id")
    public String versionId;

    @JsonProperty("workspace_id")
    public String workspaceId;
}