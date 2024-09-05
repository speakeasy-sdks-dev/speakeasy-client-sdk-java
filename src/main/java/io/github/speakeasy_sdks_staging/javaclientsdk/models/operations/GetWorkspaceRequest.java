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
import java.util.Objects;
import java.util.Optional;


public class GetWorkspaceRequest {

    /**
     * Unique identifier of the workspace.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspaceID")
    private Optional<String> workspaceID;

    @JsonCreator
    public GetWorkspaceRequest(
            Optional<String> workspaceID) {
        Utils.checkNotNull(workspaceID, "workspaceID");
        this.workspaceID = workspaceID;
    }
    
    public GetWorkspaceRequest() {
        this(Optional.empty());
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
     * Unique identifier of the workspace.
     */
    public GetWorkspaceRequest withWorkspaceID(String workspaceID) {
        Utils.checkNotNull(workspaceID, "workspaceID");
        this.workspaceID = Optional.ofNullable(workspaceID);
        return this;
    }

    /**
     * Unique identifier of the workspace.
     */
    public GetWorkspaceRequest withWorkspaceID(Optional<String> workspaceID) {
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
        GetWorkspaceRequest other = (GetWorkspaceRequest) o;
        return 
            Objects.deepEquals(this.workspaceID, other.workspaceID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            workspaceID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetWorkspaceRequest.class,
                "workspaceID", workspaceID);
    }
    
    public final static class Builder {
 
        private Optional<String> workspaceID = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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
        
        public GetWorkspaceRequest build() {
            return new GetWorkspaceRequest(
                workspaceID);
        }
    }
}

