/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.SpeakeasyMetadata;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;


public class GetWorkspaceTargetsRequest {

    /**
     * Filter to only return targets with events created after this timestamp
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=after_last_event_created_at")
    private Optional<OffsetDateTime> afterLastEventCreatedAt;

    /**
     * Unique identifier of the workspace.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspaceID")
    private Optional<String> workspaceID;

    @JsonCreator
    public GetWorkspaceTargetsRequest(
            Optional<OffsetDateTime> afterLastEventCreatedAt,
            Optional<String> workspaceID) {
        Utils.checkNotNull(afterLastEventCreatedAt, "afterLastEventCreatedAt");
        Utils.checkNotNull(workspaceID, "workspaceID");
        this.afterLastEventCreatedAt = afterLastEventCreatedAt;
        this.workspaceID = workspaceID;
    }
    
    public GetWorkspaceTargetsRequest() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * Filter to only return targets with events created after this timestamp
     */
    @JsonIgnore
    public Optional<OffsetDateTime> afterLastEventCreatedAt() {
        return afterLastEventCreatedAt;
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

    /**
     * Filter to only return targets with events created after this timestamp
     */
    public GetWorkspaceTargetsRequest withAfterLastEventCreatedAt(OffsetDateTime afterLastEventCreatedAt) {
        Utils.checkNotNull(afterLastEventCreatedAt, "afterLastEventCreatedAt");
        this.afterLastEventCreatedAt = Optional.ofNullable(afterLastEventCreatedAt);
        return this;
    }

    /**
     * Filter to only return targets with events created after this timestamp
     */
    public GetWorkspaceTargetsRequest withAfterLastEventCreatedAt(Optional<OffsetDateTime> afterLastEventCreatedAt) {
        Utils.checkNotNull(afterLastEventCreatedAt, "afterLastEventCreatedAt");
        this.afterLastEventCreatedAt = afterLastEventCreatedAt;
        return this;
    }

    /**
     * Unique identifier of the workspace.
     */
    public GetWorkspaceTargetsRequest withWorkspaceID(String workspaceID) {
        Utils.checkNotNull(workspaceID, "workspaceID");
        this.workspaceID = Optional.ofNullable(workspaceID);
        return this;
    }

    /**
     * Unique identifier of the workspace.
     */
    public GetWorkspaceTargetsRequest withWorkspaceID(Optional<String> workspaceID) {
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
        GetWorkspaceTargetsRequest other = (GetWorkspaceTargetsRequest) o;
        return 
            Objects.deepEquals(this.afterLastEventCreatedAt, other.afterLastEventCreatedAt) &&
            Objects.deepEquals(this.workspaceID, other.workspaceID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            afterLastEventCreatedAt,
            workspaceID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetWorkspaceTargetsRequest.class,
                "afterLastEventCreatedAt", afterLastEventCreatedAt,
                "workspaceID", workspaceID);
    }
    
    public final static class Builder {
 
        private Optional<OffsetDateTime> afterLastEventCreatedAt = Optional.empty();
 
        private Optional<String> workspaceID = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Filter to only return targets with events created after this timestamp
         */
        public Builder afterLastEventCreatedAt(OffsetDateTime afterLastEventCreatedAt) {
            Utils.checkNotNull(afterLastEventCreatedAt, "afterLastEventCreatedAt");
            this.afterLastEventCreatedAt = Optional.ofNullable(afterLastEventCreatedAt);
            return this;
        }

        /**
         * Filter to only return targets with events created after this timestamp
         */
        public Builder afterLastEventCreatedAt(Optional<OffsetDateTime> afterLastEventCreatedAt) {
            Utils.checkNotNull(afterLastEventCreatedAt, "afterLastEventCreatedAt");
            this.afterLastEventCreatedAt = afterLastEventCreatedAt;
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
        
        public GetWorkspaceTargetsRequest build() {
            return new GetWorkspaceTargetsRequest(
                afterLastEventCreatedAt,
                workspaceID);
        }
    }
}

