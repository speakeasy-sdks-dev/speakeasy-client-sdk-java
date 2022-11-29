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
 * BoundedRequest
 * A BoundedRequest is a request that has been logged by the Speakeasy without the contents of the request.
**/
public class BoundedRequest {
    @JsonProperty("api_endpoint_id")
    public String apiEndpointId;

    @JsonProperty("api_id")
    public String apiId;

    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    @JsonProperty("customer_id")
    public String customerId;

    @JsonProperty("latency")
    public Long latency;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public java.util.Optional<java.util.Map<String, String[]>> metadata;

    @JsonProperty("method")
    public String method;

    @JsonProperty("path")
    public String path;

    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("request_finish_time")
    public OffsetDateTime requestFinishTime;

    @JsonProperty("request_id")
    public String requestId;

    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("request_start_time")
    public OffsetDateTime requestStartTime;

    @JsonProperty("status")
    public Long status;

    @JsonProperty("version_id")
    public String versionId;

    @JsonProperty("workspace_id")
    public String workspaceId;
}