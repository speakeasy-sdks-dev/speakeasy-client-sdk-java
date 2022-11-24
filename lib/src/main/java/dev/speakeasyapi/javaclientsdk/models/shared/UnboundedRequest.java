package dev.speakeasyapi.javaclientsdk.models.shared;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UnboundedRequest
 * An UnboundedRequest represents the HAR content capture by Speakeasy when logging a request.
**/
public class UnboundedRequest {
    @JsonProperty("created_at")
    public Instant createdAt;

    @JsonProperty("har")
    public String har;

    @JsonProperty("har_size_bytes")
    public long harSizeBytes;

    @JsonProperty("request_id")
    public String requestId;

    @JsonProperty("workspace_id")
    public String workspaceId;
}