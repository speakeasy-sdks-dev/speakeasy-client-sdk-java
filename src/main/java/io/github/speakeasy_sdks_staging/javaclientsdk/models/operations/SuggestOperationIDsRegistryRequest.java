/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.SuggestOperationIDsOpts;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.SpeakeasyMetadata;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class SuggestOperationIDsRegistryRequest {

    /**
     * The schema file to upload provided as a multipart/form-data file segment.
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends SuggestOperationIDsOpts> suggestOperationIDsOpts;

    /**
     * Max number of suggestions to request
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<Double> limit;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=namespace_name")
    private String namespaceName;

    /**
     * Tag or digest
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=revision_reference")
    private String revisionReference;

    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-session-id")
    private String xSessionId;

    @JsonCreator
    public SuggestOperationIDsRegistryRequest(
            Optional<? extends SuggestOperationIDsOpts> suggestOperationIDsOpts,
            Optional<Double> limit,
            String namespaceName,
            String revisionReference,
            String xSessionId) {
        Utils.checkNotNull(suggestOperationIDsOpts, "suggestOperationIDsOpts");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(namespaceName, "namespaceName");
        Utils.checkNotNull(revisionReference, "revisionReference");
        Utils.checkNotNull(xSessionId, "xSessionId");
        this.suggestOperationIDsOpts = suggestOperationIDsOpts;
        this.limit = limit;
        this.namespaceName = namespaceName;
        this.revisionReference = revisionReference;
        this.xSessionId = xSessionId;
    }
    
    public SuggestOperationIDsRegistryRequest(
            String namespaceName,
            String revisionReference,
            String xSessionId) {
        this(Optional.empty(), Optional.empty(), namespaceName, revisionReference, xSessionId);
    }

    /**
     * The schema file to upload provided as a multipart/form-data file segment.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SuggestOperationIDsOpts> suggestOperationIDsOpts() {
        return (Optional<SuggestOperationIDsOpts>) suggestOperationIDsOpts;
    }

    /**
     * Max number of suggestions to request
     */
    @JsonIgnore
    public Optional<Double> limit() {
        return limit;
    }

    @JsonIgnore
    public String namespaceName() {
        return namespaceName;
    }

    /**
     * Tag or digest
     */
    @JsonIgnore
    public String revisionReference() {
        return revisionReference;
    }

    @JsonIgnore
    public String xSessionId() {
        return xSessionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The schema file to upload provided as a multipart/form-data file segment.
     */
    public SuggestOperationIDsRegistryRequest withSuggestOperationIDsOpts(SuggestOperationIDsOpts suggestOperationIDsOpts) {
        Utils.checkNotNull(suggestOperationIDsOpts, "suggestOperationIDsOpts");
        this.suggestOperationIDsOpts = Optional.ofNullable(suggestOperationIDsOpts);
        return this;
    }

    /**
     * The schema file to upload provided as a multipart/form-data file segment.
     */
    public SuggestOperationIDsRegistryRequest withSuggestOperationIDsOpts(Optional<? extends SuggestOperationIDsOpts> suggestOperationIDsOpts) {
        Utils.checkNotNull(suggestOperationIDsOpts, "suggestOperationIDsOpts");
        this.suggestOperationIDsOpts = suggestOperationIDsOpts;
        return this;
    }

    /**
     * Max number of suggestions to request
     */
    public SuggestOperationIDsRegistryRequest withLimit(double limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    /**
     * Max number of suggestions to request
     */
    public SuggestOperationIDsRegistryRequest withLimit(Optional<Double> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    public SuggestOperationIDsRegistryRequest withNamespaceName(String namespaceName) {
        Utils.checkNotNull(namespaceName, "namespaceName");
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * Tag or digest
     */
    public SuggestOperationIDsRegistryRequest withRevisionReference(String revisionReference) {
        Utils.checkNotNull(revisionReference, "revisionReference");
        this.revisionReference = revisionReference;
        return this;
    }

    public SuggestOperationIDsRegistryRequest withXSessionId(String xSessionId) {
        Utils.checkNotNull(xSessionId, "xSessionId");
        this.xSessionId = xSessionId;
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
        SuggestOperationIDsRegistryRequest other = (SuggestOperationIDsRegistryRequest) o;
        return 
            Objects.deepEquals(this.suggestOperationIDsOpts, other.suggestOperationIDsOpts) &&
            Objects.deepEquals(this.limit, other.limit) &&
            Objects.deepEquals(this.namespaceName, other.namespaceName) &&
            Objects.deepEquals(this.revisionReference, other.revisionReference) &&
            Objects.deepEquals(this.xSessionId, other.xSessionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            suggestOperationIDsOpts,
            limit,
            namespaceName,
            revisionReference,
            xSessionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SuggestOperationIDsRegistryRequest.class,
                "suggestOperationIDsOpts", suggestOperationIDsOpts,
                "limit", limit,
                "namespaceName", namespaceName,
                "revisionReference", revisionReference,
                "xSessionId", xSessionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends SuggestOperationIDsOpts> suggestOperationIDsOpts = Optional.empty();
 
        private Optional<Double> limit = Optional.empty();
 
        private String namespaceName;
 
        private String revisionReference;
 
        private String xSessionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The schema file to upload provided as a multipart/form-data file segment.
         */
        public Builder suggestOperationIDsOpts(SuggestOperationIDsOpts suggestOperationIDsOpts) {
            Utils.checkNotNull(suggestOperationIDsOpts, "suggestOperationIDsOpts");
            this.suggestOperationIDsOpts = Optional.ofNullable(suggestOperationIDsOpts);
            return this;
        }

        /**
         * The schema file to upload provided as a multipart/form-data file segment.
         */
        public Builder suggestOperationIDsOpts(Optional<? extends SuggestOperationIDsOpts> suggestOperationIDsOpts) {
            Utils.checkNotNull(suggestOperationIDsOpts, "suggestOperationIDsOpts");
            this.suggestOperationIDsOpts = suggestOperationIDsOpts;
            return this;
        }

        /**
         * Max number of suggestions to request
         */
        public Builder limit(double limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        /**
         * Max number of suggestions to request
         */
        public Builder limit(Optional<Double> limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            Utils.checkNotNull(namespaceName, "namespaceName");
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * Tag or digest
         */
        public Builder revisionReference(String revisionReference) {
            Utils.checkNotNull(revisionReference, "revisionReference");
            this.revisionReference = revisionReference;
            return this;
        }

        public Builder xSessionId(String xSessionId) {
            Utils.checkNotNull(xSessionId, "xSessionId");
            this.xSessionId = xSessionId;
            return this;
        }
        
        public SuggestOperationIDsRegistryRequest build() {
            return new SuggestOperationIDsRegistryRequest(
                suggestOperationIDsOpts,
                limit,
                namespaceName,
                revisionReference,
                xSessionId);
        }
    }
}

