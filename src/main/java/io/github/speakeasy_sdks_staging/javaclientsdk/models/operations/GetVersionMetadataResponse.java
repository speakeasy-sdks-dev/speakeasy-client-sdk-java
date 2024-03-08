/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;


public class GetVersionMetadataResponse implements io.github.speakeasy_sdks_staging.javaclientsdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Default error response
     */
    private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error> error;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * OK
     */
    private Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.VersionMetadata>> versionMetadata;

    public GetVersionMetadataResponse(
            String contentType,
            Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error> error,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.VersionMetadata>> versionMetadata) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(versionMetadata, "versionMetadata");
        this.contentType = contentType;
        this.error = error;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.versionMetadata = versionMetadata;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * Default error response
     */
    public Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error> error() {
        return error;
    }

    /**
     * HTTP response status code for this operation
     */
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * OK
     */
    public Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.VersionMetadata>> versionMetadata() {
        return versionMetadata;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetVersionMetadataResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Default error response
     */
    public GetVersionMetadataResponse withError(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    /**
     * Default error response
     */
    public GetVersionMetadataResponse withError(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetVersionMetadataResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetVersionMetadataResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public GetVersionMetadataResponse withVersionMetadata(java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.VersionMetadata> versionMetadata) {
        Utils.checkNotNull(versionMetadata, "versionMetadata");
        this.versionMetadata = Optional.ofNullable(versionMetadata);
        return this;
    }

    /**
     * OK
     */
    public GetVersionMetadataResponse withVersionMetadata(Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.VersionMetadata>> versionMetadata) {
        Utils.checkNotNull(versionMetadata, "versionMetadata");
        this.versionMetadata = versionMetadata;
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
        GetVersionMetadataResponse other = (GetVersionMetadataResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.error, other.error) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.versionMetadata, other.versionMetadata);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            error,
            statusCode,
            rawResponse,
            versionMetadata);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetVersionMetadataResponse.class,
                "contentType", contentType,
                "error", error,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "versionMetadata", versionMetadata);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error> error = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.VersionMetadata>> versionMetadata = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * Default error response
         */
        public Builder error(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }

        /**
         * Default error response
         */
        public Builder error(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error> error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * OK
         */
        public Builder versionMetadata(java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.VersionMetadata> versionMetadata) {
            Utils.checkNotNull(versionMetadata, "versionMetadata");
            this.versionMetadata = Optional.ofNullable(versionMetadata);
            return this;
        }

        /**
         * OK
         */
        public Builder versionMetadata(Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.VersionMetadata>> versionMetadata) {
            Utils.checkNotNull(versionMetadata, "versionMetadata");
            this.versionMetadata = versionMetadata;
            return this;
        }
        
        public GetVersionMetadataResponse build() {
            return new GetVersionMetadataResponse(
                contentType,
                error,
                statusCode,
                rawResponse,
                versionMetadata);
        }
    }
}

