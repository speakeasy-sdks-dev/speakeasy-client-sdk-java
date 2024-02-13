/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;


public class QueryEventLogResponse {

    /**
     * OK
     */
    private Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.BoundedRequest>> boundedRequests;

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

    public QueryEventLogResponse(
            Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.BoundedRequest>> boundedRequests,
            String contentType,
            Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error> error,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(boundedRequests, "boundedRequests");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.boundedRequests = boundedRequests;
        this.contentType = contentType;
        this.error = error;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * OK
     */
    public Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.BoundedRequest>> boundedRequests() {
        return boundedRequests;
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
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * OK
     */
    public QueryEventLogResponse withBoundedRequests(java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.BoundedRequest> boundedRequests) {
        Utils.checkNotNull(boundedRequests, "boundedRequests");
        this.boundedRequests = Optional.ofNullable(boundedRequests);
        return this;
    }
    
    /**
     * OK
     */
    public QueryEventLogResponse withBoundedRequests(Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.BoundedRequest>> boundedRequests) {
        Utils.checkNotNull(boundedRequests, "boundedRequests");
        this.boundedRequests = boundedRequests;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public QueryEventLogResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Default error response
     */
    public QueryEventLogResponse withError(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }
    
    /**
     * Default error response
     */
    public QueryEventLogResponse withError(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public QueryEventLogResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public QueryEventLogResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
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
        QueryEventLogResponse other = (QueryEventLogResponse) o;
        return 
            java.util.Objects.deepEquals(this.boundedRequests, other.boundedRequests) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.error, other.error) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            boundedRequests,
            contentType,
            error,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(QueryEventLogResponse.class,
                "boundedRequests", boundedRequests,
                "contentType", contentType,
                "error", error,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.BoundedRequest>> boundedRequests = Optional.empty();
 
        private String contentType;
 
        private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error> error = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * OK
         */
        public Builder boundedRequests(java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.BoundedRequest> boundedRequests) {
            Utils.checkNotNull(boundedRequests, "boundedRequests");
            this.boundedRequests = Optional.ofNullable(boundedRequests);
            return this;
        }
        
        /**
         * OK
         */
        public Builder boundedRequests(Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.BoundedRequest>> boundedRequests) {
            Utils.checkNotNull(boundedRequests, "boundedRequests");
            this.boundedRequests = boundedRequests;
            return this;
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
        
        public QueryEventLogResponse build() {
            return new QueryEventLogResponse(
                boundedRequests,
                contentType,
                error,
                statusCode,
                rawResponse);
        }
    }
}
