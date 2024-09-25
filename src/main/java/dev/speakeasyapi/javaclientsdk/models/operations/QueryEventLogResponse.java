/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.speakeasyapi.javaclientsdk.models.shared.BoundedRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.Error;
import dev.speakeasyapi.javaclientsdk.utils.Response;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class QueryEventLogResponse implements Response {

    /**
     * OK
     */
    private Optional<? extends List<BoundedRequest>> boundedRequests;

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Default error response
     */
    private Optional<? extends Error> error;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public QueryEventLogResponse(
            Optional<? extends List<BoundedRequest>> boundedRequests,
            String contentType,
            Optional<? extends Error> error,
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
    
    public QueryEventLogResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(Optional.empty(), contentType, Optional.empty(), statusCode, rawResponse);
    }

    /**
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<BoundedRequest>> boundedRequests() {
        return (Optional<List<BoundedRequest>>) boundedRequests;
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * Default error response
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Error> error() {
        return (Optional<Error>) error;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * OK
     */
    public QueryEventLogResponse withBoundedRequests(List<BoundedRequest> boundedRequests) {
        Utils.checkNotNull(boundedRequests, "boundedRequests");
        this.boundedRequests = Optional.ofNullable(boundedRequests);
        return this;
    }

    /**
     * OK
     */
    public QueryEventLogResponse withBoundedRequests(Optional<? extends List<BoundedRequest>> boundedRequests) {
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
    public QueryEventLogResponse withError(Error error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    /**
     * Default error response
     */
    public QueryEventLogResponse withError(Optional<? extends Error> error) {
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
            Objects.deepEquals(this.boundedRequests, other.boundedRequests) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.error, other.error) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<? extends List<BoundedRequest>> boundedRequests = Optional.empty();
 
        private String contentType;
 
        private Optional<? extends Error> error = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * OK
         */
        public Builder boundedRequests(List<BoundedRequest> boundedRequests) {
            Utils.checkNotNull(boundedRequests, "boundedRequests");
            this.boundedRequests = Optional.ofNullable(boundedRequests);
            return this;
        }

        /**
         * OK
         */
        public Builder boundedRequests(Optional<? extends List<BoundedRequest>> boundedRequests) {
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
        public Builder error(Error error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }

        /**
         * Default error response
         */
        public Builder error(Optional<? extends Error> error) {
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

