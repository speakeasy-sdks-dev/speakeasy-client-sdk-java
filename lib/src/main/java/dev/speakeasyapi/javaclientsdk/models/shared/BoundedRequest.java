package dev.speakeasyapi.javaclientsdk.models.shared;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Map;

/**
 * BoundedRequest
 * A BoundedRequest is a request that has been logged by the Speakeasy without the contents of the request.
**/
public class BoundedRequest {
    @JsonProperty("api_endpoint_id")
    public String apiEndpointId;

    @JsonProperty("api_id")
    public String apiId;

    @JsonProperty("created_at")
    public Instant createdAt;

    @JsonProperty("customer_id")
    public String customerId;

    @JsonProperty("latency")
    public long latency;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("metadata")
    public Map<String, String[]> metadata;

    @JsonProperty("method")
    public String method;

    @JsonProperty("path")
    public String path;

    @JsonProperty("request_finish_time")
    public Instant requestFinishTime;

    @JsonProperty("request_id")
    public String requestId;

    @JsonProperty("request_start_time")
    public Instant requestStartTime;

    @JsonProperty("status")
    public long status;

    @JsonProperty("version_id")
    public String versionId;

    @JsonProperty("workspace_id")
    public String workspaceId;
}