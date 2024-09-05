/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.CliEvent;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.SpeakeasyMetadata;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class PostWorkspaceEventsRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private List<CliEvent> requestBody;

    /**
     * Unique identifier of the workspace.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspaceID")
    private Optional<String> workspaceID;

    @JsonCreator
    public PostWorkspaceEventsRequest(
            List<CliEvent> requestBody,
            Optional<String> workspaceID) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(workspaceID, "workspaceID");
        this.requestBody = requestBody;
        this.workspaceID = workspaceID;
    }
    
    public PostWorkspaceEventsRequest(
            List<CliEvent> requestBody) {
        this(requestBody, Optional.empty());
    }

    @JsonIgnore
    public List<CliEvent> requestBody() {
        return requestBody;
    }

    /**
     * Unique identifier of the workspace.
     */
    @JsonIgnore
    public Optional<String> workspaceID() {
        return workspaceID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostWorkspaceEventsRequest withRequestBody(List<CliEvent> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Unique identifier of the workspace.
     */
    public PostWorkspaceEventsRequest withWorkspaceID(String workspaceID) {
        Utils.checkNotNull(workspaceID, "workspaceID");
        this.workspaceID = Optional.ofNullable(workspaceID);
        return this;
    }

    /**
     * Unique identifier of the workspace.
     */
    public PostWorkspaceEventsRequest withWorkspaceID(Optional<String> workspaceID) {
        Utils.checkNotNull(workspaceID, "workspaceID");
        this.workspaceID = workspaceID;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostWorkspaceEventsRequest other = (PostWorkspaceEventsRequest) o;
        return 
            Objects.deepEquals(this.requestBody, other.requestBody) &&
            Objects.deepEquals(this.workspaceID, other.workspaceID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            requestBody,
            workspaceID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostWorkspaceEventsRequest.class,
                "requestBody", requestBody,
                "workspaceID", workspaceID);
    }
    
    public final static class Builder {
 
        private List<CliEvent> requestBody;
 
        private Optional<String> workspaceID = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder requestBody(List<CliEvent> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }

        /**
         * Unique identifier of the workspace.
         */
        public Builder workspaceID(String workspaceID) {
            Utils.checkNotNull(workspaceID, "workspaceID");
            this.workspaceID = Optional.ofNullable(workspaceID);
            return this;
        }

        /**
         * Unique identifier of the workspace.
         */
        public Builder workspaceID(Optional<String> workspaceID) {
            Utils.checkNotNull(workspaceID, "workspaceID");
            this.workspaceID = workspaceID;
            return this;
        }
        
        public PostWorkspaceEventsRequest build() {
            return new PostWorkspaceEventsRequest(
                requestBody,
                workspaceID);
        }
    }
}

