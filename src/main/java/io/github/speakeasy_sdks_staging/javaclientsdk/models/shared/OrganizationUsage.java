/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class OrganizationUsage {

    /**
     * Indicates if the features are accessible
     */
    @JsonProperty("accessible")
    private boolean accessible;

    /**
     * Features that are accessible
     */
    @JsonProperty("accessible_features")
    private java.util.List<String> accessibleFeatures;

    /**
     * List of generation lock IDs
     */
    @JsonProperty("gen_lock_ids")
    private java.util.List<String> genLockIds;

    /**
     * The programming language used
     */
    @JsonProperty("language")
    private String language;

    /**
     * Number of operations performed
     */
    @JsonProperty("number_of_operations")
    private long numberOfOperations;

    /**
     * Features that have been used
     */
    @JsonProperty("used_features")
    private java.util.List<String> usedFeatures;

    /**
     * List of workspace IDs
     */
    @JsonProperty("workspaces")
    private java.util.List<String> workspaces;

    @JsonCreator
    public OrganizationUsage(
            @JsonProperty("accessible") boolean accessible,
            @JsonProperty("accessible_features") java.util.List<String> accessibleFeatures,
            @JsonProperty("gen_lock_ids") java.util.List<String> genLockIds,
            @JsonProperty("language") String language,
            @JsonProperty("number_of_operations") long numberOfOperations,
            @JsonProperty("used_features") java.util.List<String> usedFeatures,
            @JsonProperty("workspaces") java.util.List<String> workspaces) {
        Utils.checkNotNull(accessible, "accessible");
        Utils.checkNotNull(accessibleFeatures, "accessibleFeatures");
        Utils.checkNotNull(genLockIds, "genLockIds");
        Utils.checkNotNull(language, "language");
        Utils.checkNotNull(numberOfOperations, "numberOfOperations");
        Utils.checkNotNull(usedFeatures, "usedFeatures");
        Utils.checkNotNull(workspaces, "workspaces");
        this.accessible = accessible;
        this.accessibleFeatures = accessibleFeatures;
        this.genLockIds = genLockIds;
        this.language = language;
        this.numberOfOperations = numberOfOperations;
        this.usedFeatures = usedFeatures;
        this.workspaces = workspaces;
    }

    /**
     * Indicates if the features are accessible
     */
    @JsonIgnore
    public boolean accessible() {
        return accessible;
    }

    /**
     * Features that are accessible
     */
    @JsonIgnore
    public java.util.List<String> accessibleFeatures() {
        return accessibleFeatures;
    }

    /**
     * List of generation lock IDs
     */
    @JsonIgnore
    public java.util.List<String> genLockIds() {
        return genLockIds;
    }

    /**
     * The programming language used
     */
    @JsonIgnore
    public String language() {
        return language;
    }

    /**
     * Number of operations performed
     */
    @JsonIgnore
    public long numberOfOperations() {
        return numberOfOperations;
    }

    /**
     * Features that have been used
     */
    @JsonIgnore
    public java.util.List<String> usedFeatures() {
        return usedFeatures;
    }

    /**
     * List of workspace IDs
     */
    @JsonIgnore
    public java.util.List<String> workspaces() {
        return workspaces;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Indicates if the features are accessible
     */
    public OrganizationUsage withAccessible(boolean accessible) {
        Utils.checkNotNull(accessible, "accessible");
        this.accessible = accessible;
        return this;
    }

    /**
     * Features that are accessible
     */
    public OrganizationUsage withAccessibleFeatures(java.util.List<String> accessibleFeatures) {
        Utils.checkNotNull(accessibleFeatures, "accessibleFeatures");
        this.accessibleFeatures = accessibleFeatures;
        return this;
    }

    /**
     * List of generation lock IDs
     */
    public OrganizationUsage withGenLockIds(java.util.List<String> genLockIds) {
        Utils.checkNotNull(genLockIds, "genLockIds");
        this.genLockIds = genLockIds;
        return this;
    }

    /**
     * The programming language used
     */
    public OrganizationUsage withLanguage(String language) {
        Utils.checkNotNull(language, "language");
        this.language = language;
        return this;
    }

    /**
     * Number of operations performed
     */
    public OrganizationUsage withNumberOfOperations(long numberOfOperations) {
        Utils.checkNotNull(numberOfOperations, "numberOfOperations");
        this.numberOfOperations = numberOfOperations;
        return this;
    }

    /**
     * Features that have been used
     */
    public OrganizationUsage withUsedFeatures(java.util.List<String> usedFeatures) {
        Utils.checkNotNull(usedFeatures, "usedFeatures");
        this.usedFeatures = usedFeatures;
        return this;
    }

    /**
     * List of workspace IDs
     */
    public OrganizationUsage withWorkspaces(java.util.List<String> workspaces) {
        Utils.checkNotNull(workspaces, "workspaces");
        this.workspaces = workspaces;
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
        OrganizationUsage other = (OrganizationUsage) o;
        return 
            java.util.Objects.deepEquals(this.accessible, other.accessible) &&
            java.util.Objects.deepEquals(this.accessibleFeatures, other.accessibleFeatures) &&
            java.util.Objects.deepEquals(this.genLockIds, other.genLockIds) &&
            java.util.Objects.deepEquals(this.language, other.language) &&
            java.util.Objects.deepEquals(this.numberOfOperations, other.numberOfOperations) &&
            java.util.Objects.deepEquals(this.usedFeatures, other.usedFeatures) &&
            java.util.Objects.deepEquals(this.workspaces, other.workspaces);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accessible,
            accessibleFeatures,
            genLockIds,
            language,
            numberOfOperations,
            usedFeatures,
            workspaces);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OrganizationUsage.class,
                "accessible", accessible,
                "accessibleFeatures", accessibleFeatures,
                "genLockIds", genLockIds,
                "language", language,
                "numberOfOperations", numberOfOperations,
                "usedFeatures", usedFeatures,
                "workspaces", workspaces);
    }
    
    public final static class Builder {
 
        private Boolean accessible;
 
        private java.util.List<String> accessibleFeatures;
 
        private java.util.List<String> genLockIds;
 
        private String language;
 
        private Long numberOfOperations;
 
        private java.util.List<String> usedFeatures;
 
        private java.util.List<String> workspaces;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Indicates if the features are accessible
         */
        public Builder accessible(boolean accessible) {
            Utils.checkNotNull(accessible, "accessible");
            this.accessible = accessible;
            return this;
        }

        /**
         * Features that are accessible
         */
        public Builder accessibleFeatures(java.util.List<String> accessibleFeatures) {
            Utils.checkNotNull(accessibleFeatures, "accessibleFeatures");
            this.accessibleFeatures = accessibleFeatures;
            return this;
        }

        /**
         * List of generation lock IDs
         */
        public Builder genLockIds(java.util.List<String> genLockIds) {
            Utils.checkNotNull(genLockIds, "genLockIds");
            this.genLockIds = genLockIds;
            return this;
        }

        /**
         * The programming language used
         */
        public Builder language(String language) {
            Utils.checkNotNull(language, "language");
            this.language = language;
            return this;
        }

        /**
         * Number of operations performed
         */
        public Builder numberOfOperations(long numberOfOperations) {
            Utils.checkNotNull(numberOfOperations, "numberOfOperations");
            this.numberOfOperations = numberOfOperations;
            return this;
        }

        /**
         * Features that have been used
         */
        public Builder usedFeatures(java.util.List<String> usedFeatures) {
            Utils.checkNotNull(usedFeatures, "usedFeatures");
            this.usedFeatures = usedFeatures;
            return this;
        }

        /**
         * List of workspace IDs
         */
        public Builder workspaces(java.util.List<String> workspaces) {
            Utils.checkNotNull(workspaces, "workspaces");
            this.workspaces = workspaces;
            return this;
        }
        
        public OrganizationUsage build() {
            return new OrganizationUsage(
                accessible,
                accessibleFeatures,
                genLockIds,
                language,
                numberOfOperations,
                usedFeatures,
                workspaces);
        }
    }
}

