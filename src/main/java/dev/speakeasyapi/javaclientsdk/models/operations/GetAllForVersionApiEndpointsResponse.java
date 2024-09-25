/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint;
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


public class GetAllForVersionApiEndpointsResponse implements Response {

    /**
     * OK
     */
    private Optional<? extends List<ApiEndpoint>> apiEndpoints;

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
    public GetAllForVersionApiEndpointsResponse(
            Optional<? extends List<ApiEndpoint>> apiEndpoints,
            String contentType,
            Optional<? extends Error> error,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(apiEndpoints, "apiEndpoints");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.apiEndpoints = apiEndpoints;
        this.contentType = contentType;
        this.error = error;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetAllForVersionApiEndpointsResponse(
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
    public Optional<List<ApiEndpoint>> apiEndpoints() {
        return (Optional<List<ApiEndpoint>>) apiEndpoints;
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
    public GetAllForVersionApiEndpointsResponse withAPIEndpoints(List<ApiEndpoint> apiEndpoints) {
        Utils.checkNotNull(apiEndpoints, "apiEndpoints");
        this.apiEndpoints = Optional.ofNullable(apiEndpoints);
        return this;
    }

    /**
     * OK
     */
    public GetAllForVersionApiEndpointsResponse withAPIEndpoints(Optional<? extends List<ApiEndpoint>> apiEndpoints) {
        Utils.checkNotNull(apiEndpoints, "apiEndpoints");
        this.apiEndpoints = apiEndpoints;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public GetAllForVersionApiEndpointsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Default error response
     */
    public GetAllForVersionApiEndpointsResponse withError(Error error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    /**
     * Default error response
     */
    public GetAllForVersionApiEndpointsResponse withError(Optional<? extends Error> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetAllForVersionApiEndpointsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetAllForVersionApiEndpointsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetAllForVersionApiEndpointsResponse other = (GetAllForVersionApiEndpointsResponse) o;
        return 
            Objects.deepEquals(this.apiEndpoints, other.apiEndpoints) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.error, other.error) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiEndpoints,
            contentType,
            error,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAllForVersionApiEndpointsResponse.class,
                "apiEndpoints", apiEndpoints,
                "contentType", contentType,
                "error", error,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<ApiEndpoint>> apiEndpoints = Optional.empty();
 
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
        public Builder apiEndpoints(List<ApiEndpoint> apiEndpoints) {
            Utils.checkNotNull(apiEndpoints, "apiEndpoints");
            this.apiEndpoints = Optional.ofNullable(apiEndpoints);
            return this;
        }

        /**
         * OK
         */
        public Builder apiEndpoints(Optional<? extends List<ApiEndpoint>> apiEndpoints) {
            Utils.checkNotNull(apiEndpoints, "apiEndpoints");
            this.apiEndpoints = apiEndpoints;
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
        
        public GetAllForVersionApiEndpointsResponse build() {
            return new GetAllForVersionApiEndpointsResponse(
                apiEndpoints,
                contentType,
                error,
                statusCode,
                rawResponse);
        }
    }
}
