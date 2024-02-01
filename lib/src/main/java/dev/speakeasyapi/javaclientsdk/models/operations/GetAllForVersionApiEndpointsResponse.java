/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.net.http.HttpResponse;
import java.util.Optional;


public class GetAllForVersionApiEndpointsResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Default error response
     */
    private Optional<? extends dev.speakeasyapi.javaclientsdk.models.shared.Error> error;

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
    private Optional<? extends java.util.List<dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint>> classes;

    public GetAllForVersionApiEndpointsResponse(
            String contentType,
            Optional<? extends dev.speakeasyapi.javaclientsdk.models.shared.Error> error,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends java.util.List<dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint>> classes) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(classes, "classes");
        this.contentType = contentType;
        this.error = error;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.classes = classes;
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
    public Optional<? extends dev.speakeasyapi.javaclientsdk.models.shared.Error> error() {
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
    public Optional<? extends java.util.List<dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint>> classes() {
        return classes;
    }
    
    public final static Builder builder() {
        return new Builder();
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
    public GetAllForVersionApiEndpointsResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }
    
    /**
     * Default error response
     */
    public GetAllForVersionApiEndpointsResponse withError(Optional<? extends dev.speakeasyapi.javaclientsdk.models.shared.Error> error) {
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

    /**
     * OK
     */
    public GetAllForVersionApiEndpointsResponse withClasses(java.util.List<dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint> classes) {
        Utils.checkNotNull(classes, "classes");
        this.classes = Optional.ofNullable(classes);
        return this;
    }
    
    /**
     * OK
     */
    public GetAllForVersionApiEndpointsResponse withClasses(Optional<? extends java.util.List<dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint>> classes) {
        Utils.checkNotNull(classes, "classes");
        this.classes = classes;
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
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.error, other.error) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.classes, other.classes);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            error,
            statusCode,
            rawResponse,
            classes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAllForVersionApiEndpointsResponse.class,
                "contentType", contentType,
                "error", error,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "classes", classes);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends dev.speakeasyapi.javaclientsdk.models.shared.Error> error = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends java.util.List<dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint>> classes = Optional.empty();  
        
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
        public Builder error(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }
        
        /**
         * Default error response
         */
        public Builder error(Optional<? extends dev.speakeasyapi.javaclientsdk.models.shared.Error> error) {
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
        public Builder classes(java.util.List<dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint> classes) {
            Utils.checkNotNull(classes, "classes");
            this.classes = Optional.ofNullable(classes);
            return this;
        }
        
        /**
         * OK
         */
        public Builder classes(Optional<? extends java.util.List<dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint>> classes) {
            Utils.checkNotNull(classes, "classes");
            this.classes = classes;
            return this;
        }        
        
        public GetAllForVersionApiEndpointsResponse build() {
            return new GetAllForVersionApiEndpointsResponse(
                contentType,
                error,
                statusCode,
                rawResponse,
                classes);
        }
    }
}

