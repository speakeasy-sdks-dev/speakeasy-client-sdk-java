/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.SpeakeasyMetadata;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class GetWorkspaceEventsRequest {

    /**
     * Filter to only return events corresponding to a particular gen_lock_id
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=generate_gen_lock_id")
    private Optional<? extends String> generateGenLockId;

    /**
     * Unique identifier of the workspace.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspaceID")
    private Optional<? extends String> workspaceID;

    public GetWorkspaceEventsRequest(
            Optional<? extends String> generateGenLockId,
            Optional<? extends String> workspaceID) {
        Utils.checkNotNull(generateGenLockId, "generateGenLockId");
        Utils.checkNotNull(workspaceID, "workspaceID");
        this.generateGenLockId = generateGenLockId;
        this.workspaceID = workspaceID;
    }

    /**
     * Filter to only return events corresponding to a particular gen_lock_id
     */
    public Optional<? extends String> generateGenLockId() {
        return generateGenLockId;
    }

    /**
     * Unique identifier of the workspace.
     */
    public Optional<? extends String> workspaceID() {
        return workspaceID;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Filter to only return events corresponding to a particular gen_lock_id
     */
    public GetWorkspaceEventsRequest withGenerateGenLockId(String generateGenLockId) {
        Utils.checkNotNull(generateGenLockId, "generateGenLockId");
        this.generateGenLockId = Optional.ofNullable(generateGenLockId);
        return this;
    }

    /**
     * Filter to only return events corresponding to a particular gen_lock_id
     */
    public GetWorkspaceEventsRequest withGenerateGenLockId(Optional<? extends String> generateGenLockId) {
        Utils.checkNotNull(generateGenLockId, "generateGenLockId");
        this.generateGenLockId = generateGenLockId;
        return this;
    }

    /**
     * Unique identifier of the workspace.
     */
    public GetWorkspaceEventsRequest withWorkspaceID(String workspaceID) {
        Utils.checkNotNull(workspaceID, "workspaceID");
        this.workspaceID = Optional.ofNullable(workspaceID);
        return this;
    }

    /**
     * Unique identifier of the workspace.
     */
    public GetWorkspaceEventsRequest withWorkspaceID(Optional<? extends String> workspaceID) {
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
        GetWorkspaceEventsRequest other = (GetWorkspaceEventsRequest) o;
        return 
            java.util.Objects.deepEquals(this.generateGenLockId, other.generateGenLockId) &&
            java.util.Objects.deepEquals(this.workspaceID, other.workspaceID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            generateGenLockId,
            workspaceID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetWorkspaceEventsRequest.class,
                "generateGenLockId", generateGenLockId,
                "workspaceID", workspaceID);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> generateGenLockId = Optional.empty();
 
        private Optional<? extends String> workspaceID = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Filter to only return events corresponding to a particular gen_lock_id
         */
        public Builder generateGenLockId(String generateGenLockId) {
            Utils.checkNotNull(generateGenLockId, "generateGenLockId");
            this.generateGenLockId = Optional.ofNullable(generateGenLockId);
            return this;
        }

        /**
         * Filter to only return events corresponding to a particular gen_lock_id
         */
        public Builder generateGenLockId(Optional<? extends String> generateGenLockId) {
            Utils.checkNotNull(generateGenLockId, "generateGenLockId");
            this.generateGenLockId = generateGenLockId;
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
        public Builder workspaceID(Optional<? extends String> workspaceID) {
            Utils.checkNotNull(workspaceID, "workspaceID");
            this.workspaceID = workspaceID;
            return this;
        }
        
        public GetWorkspaceEventsRequest build() {
            return new GetWorkspaceEventsRequest(
                generateGenLockId,
                workspaceID);
        }
    }
}
