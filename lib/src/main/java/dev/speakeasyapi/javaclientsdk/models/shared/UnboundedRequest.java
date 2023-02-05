package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.speakeasyapi.javaclientsdk.utils.DateTimeDeserializer;
import dev.speakeasyapi.javaclientsdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

/**
 * UnboundedRequest
 * An UnboundedRequest represents the HAR content capture by Speakeasy when logging a request.
**/
public class UnboundedRequest {
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public UnboundedRequest withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonProperty("har")
    public String har;
    public UnboundedRequest withHar(String har) {
        this.har = har;
        return this;
    }
    @JsonProperty("har_size_bytes")
    public Long harSizeBytes;
    public UnboundedRequest withHarSizeBytes(Long harSizeBytes) {
        this.harSizeBytes = harSizeBytes;
        return this;
    }
    @JsonProperty("request_id")
    public String requestId;
    public UnboundedRequest withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    @JsonProperty("workspace_id")
    public String workspaceId;
    public UnboundedRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
}
