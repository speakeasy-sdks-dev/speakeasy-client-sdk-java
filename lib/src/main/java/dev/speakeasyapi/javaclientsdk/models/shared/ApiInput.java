package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * ApiInput
 * An Api is representation of a API (a collection of API Endpoints) within the Speakeasy Platform.
**/
public class ApiInput {
    @JsonProperty("api_id")
    public String apiId;

    @JsonProperty("description")
    public String description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta_data")
    public java.util.Optional<java.util.Map<String, java.util.List<String>>> metaData;

    @JsonProperty("version_id")
    public String versionId;
}