/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.time.OffsetDateTime;

/**
 * VersionMetadata - A set of keys and associated values, attached to a particular version of an Api.
 */

public class VersionMetadata {

    /**
     * The ID of the Api this Metadata belongs to.
     */
    @JsonProperty("api_id")
    private String apiId;

    /**
     * Creation timestamp.
     */
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    /**
     * The key for this metadata.
     */
    @JsonProperty("meta_key")
    private String metaKey;

    /**
     * One of the values for this metadata.
     */
    @JsonProperty("meta_value")
    private String metaValue;

    /**
     * The version ID of the Api this Metadata belongs to.
     */
    @JsonProperty("version_id")
    private String versionId;

    /**
     * The workspace ID this Metadata belongs to.
     */
    @JsonProperty("workspace_id")
    private String workspaceId;

    public VersionMetadata(
            @JsonProperty("api_id") String apiId,
            @JsonProperty("created_at") OffsetDateTime createdAt,
            @JsonProperty("meta_key") String metaKey,
            @JsonProperty("meta_value") String metaValue,
            @JsonProperty("version_id") String versionId,
            @JsonProperty("workspace_id") String workspaceId) {
        Utils.checkNotNull(apiId, "apiId");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(metaKey, "metaKey");
        Utils.checkNotNull(metaValue, "metaValue");
        Utils.checkNotNull(versionId, "versionId");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.apiId = apiId;
        this.createdAt = createdAt;
        this.metaKey = metaKey;
        this.metaValue = metaValue;
        this.versionId = versionId;
        this.workspaceId = workspaceId;
    }

    /**
     * The ID of the Api this Metadata belongs to.
     */
    public String apiId() {
        return apiId;
    }

    /**
     * Creation timestamp.
     */
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    /**
     * The key for this metadata.
     */
    public String metaKey() {
        return metaKey;
    }

    /**
     * One of the values for this metadata.
     */
    public String metaValue() {
        return metaValue;
    }

    /**
     * The version ID of the Api this Metadata belongs to.
     */
    public String versionId() {
        return versionId;
    }

    /**
     * The workspace ID this Metadata belongs to.
     */
    public String workspaceId() {
        return workspaceId;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the Api this Metadata belongs to.
     */
    public VersionMetadata withApiId(String apiId) {
        Utils.checkNotNull(apiId, "apiId");
        this.apiId = apiId;
        return this;
    }

    /**
     * Creation timestamp.
     */
    public VersionMetadata withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The key for this metadata.
     */
    public VersionMetadata withMetaKey(String metaKey) {
        Utils.checkNotNull(metaKey, "metaKey");
        this.metaKey = metaKey;
        return this;
    }

    /**
     * One of the values for this metadata.
     */
    public VersionMetadata withMetaValue(String metaValue) {
        Utils.checkNotNull(metaValue, "metaValue");
        this.metaValue = metaValue;
        return this;
    }

    /**
     * The version ID of the Api this Metadata belongs to.
     */
    public VersionMetadata withVersionId(String versionId) {
        Utils.checkNotNull(versionId, "versionId");
        this.versionId = versionId;
        return this;
    }

    /**
     * The workspace ID this Metadata belongs to.
     */
    public VersionMetadata withWorkspaceId(String workspaceId) {
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspaceId = workspaceId;
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
        VersionMetadata other = (VersionMetadata) o;
        return 
            java.util.Objects.deepEquals(this.apiId, other.apiId) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.metaKey, other.metaKey) &&
            java.util.Objects.deepEquals(this.metaValue, other.metaValue) &&
            java.util.Objects.deepEquals(this.versionId, other.versionId) &&
            java.util.Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiId,
            createdAt,
            metaKey,
            metaValue,
            versionId,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(VersionMetadata.class,
                "apiId", apiId,
                "createdAt", createdAt,
                "metaKey", metaKey,
                "metaValue", metaValue,
                "versionId", versionId,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private String apiId;
 
        private OffsetDateTime createdAt;
 
        private String metaKey;
 
        private String metaValue;
 
        private String versionId;
 
        private String workspaceId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the Api this Metadata belongs to.
         */
        public Builder apiId(String apiId) {
            Utils.checkNotNull(apiId, "apiId");
            this.apiId = apiId;
            return this;
        }

        /**
         * Creation timestamp.
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        /**
         * The key for this metadata.
         */
        public Builder metaKey(String metaKey) {
            Utils.checkNotNull(metaKey, "metaKey");
            this.metaKey = metaKey;
            return this;
        }

        /**
         * One of the values for this metadata.
         */
        public Builder metaValue(String metaValue) {
            Utils.checkNotNull(metaValue, "metaValue");
            this.metaValue = metaValue;
            return this;
        }

        /**
         * The version ID of the Api this Metadata belongs to.
         */
        public Builder versionId(String versionId) {
            Utils.checkNotNull(versionId, "versionId");
            this.versionId = versionId;
            return this;
        }

        /**
         * The workspace ID this Metadata belongs to.
         */
        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }        
        
        public VersionMetadata build() {
            return new VersionMetadata(
                apiId,
                createdAt,
                metaKey,
                metaValue,
                versionId,
                workspaceId);
        }
    }
}

