package dev.speakeasyapi.javaclientsdk.models.shared;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import dev.speakeasyapi.javaclientsdk.utils.DateTimeSerializer;
import dev.speakeasyapi.javaclientsdk.utils.DateTimeDeserializer;

/**
 * UnboundedRequest
 * An UnboundedRequest represents the HAR content capture by Speakeasy when logging a request.
**/
public class UnboundedRequest {
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    @JsonProperty("har")
    public String har;

    @JsonProperty("har_size_bytes")
    public Long harSizeBytes;

    @JsonProperty("request_id")
    public String requestId;

    @JsonProperty("workspace_id")
    public String workspaceId;
}