package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * ApiInput
 * An Api is representation of a API (a collection of API Endpoints) within the Speakeasy Platform.
**/
public class ApiInput {
    @JsonProperty("api_id")
    public String apiId;
    public ApiInput withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    @JsonProperty("description")
    public String description;
    public ApiInput withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta_data")
    public java.util.Map<String, String[]> metaData;
    public ApiInput withMetaData(java.util.Map<String, String[]> metaData) {
        this.metaData = metaData;
        return this;
    }
    @JsonProperty("version_id")
    public String versionId;
    public ApiInput withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
}
