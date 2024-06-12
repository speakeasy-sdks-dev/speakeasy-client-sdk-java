/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
/**
 * V2Descriptor - V2 descriptor
 */

public class V2Descriptor {

    /**
     * Annotations
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("annotations")
    private Optional<? extends Annotations> annotations;

    /**
     * Digest
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("digest")
    private Optional<? extends String> digest;

    /**
     * Media type
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mediaType")
    private Optional<? extends String> mediaType;

    /**
     * Size
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<? extends Long> size;

    @JsonCreator
    public V2Descriptor(
            @JsonProperty("annotations") Optional<? extends Annotations> annotations,
            @JsonProperty("digest") Optional<? extends String> digest,
            @JsonProperty("mediaType") Optional<? extends String> mediaType,
            @JsonProperty("size") Optional<? extends Long> size) {
        Utils.checkNotNull(annotations, "annotations");
        Utils.checkNotNull(digest, "digest");
        Utils.checkNotNull(mediaType, "mediaType");
        Utils.checkNotNull(size, "size");
        this.annotations = annotations;
        this.digest = digest;
        this.mediaType = mediaType;
        this.size = size;
    }
    
    public V2Descriptor() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Annotations
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Annotations> annotations() {
        return (Optional<Annotations>) annotations;
    }

    /**
     * Digest
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> digest() {
        return (Optional<String>) digest;
    }

    /**
     * Media type
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> mediaType() {
        return (Optional<String>) mediaType;
    }

    /**
     * Size
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> size() {
        return (Optional<Long>) size;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Annotations
     */
    public V2Descriptor withAnnotations(Annotations annotations) {
        Utils.checkNotNull(annotations, "annotations");
        this.annotations = Optional.ofNullable(annotations);
        return this;
    }

    /**
     * Annotations
     */
    public V2Descriptor withAnnotations(Optional<? extends Annotations> annotations) {
        Utils.checkNotNull(annotations, "annotations");
        this.annotations = annotations;
        return this;
    }

    /**
     * Digest
     */
    public V2Descriptor withDigest(String digest) {
        Utils.checkNotNull(digest, "digest");
        this.digest = Optional.ofNullable(digest);
        return this;
    }

    /**
     * Digest
     */
    public V2Descriptor withDigest(Optional<? extends String> digest) {
        Utils.checkNotNull(digest, "digest");
        this.digest = digest;
        return this;
    }

    /**
     * Media type
     */
    public V2Descriptor withMediaType(String mediaType) {
        Utils.checkNotNull(mediaType, "mediaType");
        this.mediaType = Optional.ofNullable(mediaType);
        return this;
    }

    /**
     * Media type
     */
    public V2Descriptor withMediaType(Optional<? extends String> mediaType) {
        Utils.checkNotNull(mediaType, "mediaType");
        this.mediaType = mediaType;
        return this;
    }

    /**
     * Size
     */
    public V2Descriptor withSize(long size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    /**
     * Size
     */
    public V2Descriptor withSize(Optional<? extends Long> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
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
        V2Descriptor other = (V2Descriptor) o;
        return 
            java.util.Objects.deepEquals(this.annotations, other.annotations) &&
            java.util.Objects.deepEquals(this.digest, other.digest) &&
            java.util.Objects.deepEquals(this.mediaType, other.mediaType) &&
            java.util.Objects.deepEquals(this.size, other.size);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            annotations,
            digest,
            mediaType,
            size);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2Descriptor.class,
                "annotations", annotations,
                "digest", digest,
                "mediaType", mediaType,
                "size", size);
    }
    
    public final static class Builder {
 
        private Optional<? extends Annotations> annotations = Optional.empty();
 
        private Optional<? extends String> digest = Optional.empty();
 
        private Optional<? extends String> mediaType = Optional.empty();
 
        private Optional<? extends Long> size = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Annotations
         */
        public Builder annotations(Annotations annotations) {
            Utils.checkNotNull(annotations, "annotations");
            this.annotations = Optional.ofNullable(annotations);
            return this;
        }

        /**
         * Annotations
         */
        public Builder annotations(Optional<? extends Annotations> annotations) {
            Utils.checkNotNull(annotations, "annotations");
            this.annotations = annotations;
            return this;
        }

        /**
         * Digest
         */
        public Builder digest(String digest) {
            Utils.checkNotNull(digest, "digest");
            this.digest = Optional.ofNullable(digest);
            return this;
        }

        /**
         * Digest
         */
        public Builder digest(Optional<? extends String> digest) {
            Utils.checkNotNull(digest, "digest");
            this.digest = digest;
            return this;
        }

        /**
         * Media type
         */
        public Builder mediaType(String mediaType) {
            Utils.checkNotNull(mediaType, "mediaType");
            this.mediaType = Optional.ofNullable(mediaType);
            return this;
        }

        /**
         * Media type
         */
        public Builder mediaType(Optional<? extends String> mediaType) {
            Utils.checkNotNull(mediaType, "mediaType");
            this.mediaType = mediaType;
            return this;
        }

        /**
         * Size
         */
        public Builder size(long size) {
            Utils.checkNotNull(size, "size");
            this.size = Optional.ofNullable(size);
            return this;
        }

        /**
         * Size
         */
        public Builder size(Optional<? extends Long> size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
            return this;
        }
        
        public V2Descriptor build() {
            return new V2Descriptor(
                annotations,
                digest,
                mediaType,
                size);
        }
    }
}

