package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.speakeasyapi.javaclientsdk.utils.DateTimeDeserializer;
import dev.speakeasyapi.javaclientsdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

/**
 * BoundedRequest
 * A BoundedRequest is a request that has been logged by the Speakeasy without the contents of the request.
**/
public class BoundedRequest {
    @JsonProperty("api_endpoint_id")
    public String apiEndpointId;
    public BoundedRequest withApiEndpointId(String apiEndpointId) {
        this.apiEndpointId = apiEndpointId;
        return this;
    }
    @JsonProperty("api_id")
    public String apiId;
    public BoundedRequest withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public BoundedRequest withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonProperty("customer_id")
    public String customerId;
    public BoundedRequest withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    @JsonProperty("latency")
    public Long latency;
    public BoundedRequest withLatency(Long latency) {
        this.latency = latency;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public RequestMetadata[] metadata;
    public BoundedRequest withMetadata(RequestMetadata[] metadata) {
        this.metadata = metadata;
        return this;
    }
    @JsonProperty("method")
    public String method;
    public BoundedRequest withMethod(String method) {
        this.method = method;
        return this;
    }
    @JsonProperty("path")
    public String path;
    public BoundedRequest withPath(String path) {
        this.path = path;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("request_finish_time")
    public OffsetDateTime requestFinishTime;
    public BoundedRequest withRequestFinishTime(OffsetDateTime requestFinishTime) {
        this.requestFinishTime = requestFinishTime;
        return this;
    }
    @JsonProperty("request_id")
    public String requestId;
    public BoundedRequest withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("request_start_time")
    public OffsetDateTime requestStartTime;
    public BoundedRequest withRequestStartTime(OffsetDateTime requestStartTime) {
        this.requestStartTime = requestStartTime;
        return this;
    }
    @JsonProperty("status")
    public Long status;
    public BoundedRequest withStatus(Long status) {
        this.status = status;
        return this;
    }
    @JsonProperty("version_id")
    public String versionId;
    public BoundedRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    @JsonProperty("workspace_id")
    public String workspaceId;
    public BoundedRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
}
