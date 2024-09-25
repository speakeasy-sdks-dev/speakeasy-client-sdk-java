/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.speakeasyapi.javaclientsdk.models.shared.Error;
import dev.speakeasyapi.javaclientsdk.utils.Response;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;


public class GetNamespacesResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Default error response
     */
    private Optional<? extends Error> error;

    /**
     * OK
     */
    private Optional<? extends dev.speakeasyapi.javaclientsdk.models.shared.GetNamespacesResponse> getNamespacesResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public GetNamespacesResponse(
            String contentType,
            Optional<? extends Error> error,
            Optional<? extends dev.speakeasyapi.javaclientsdk.models.shared.GetNamespacesResponse> getNamespacesResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(getNamespacesResponse, "getNamespacesResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.error = error;
        this.getNamespacesResponse = getNamespacesResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetNamespacesResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, Optional.empty(), Optional.empty(), statusCode, rawResponse);
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
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<dev.speakeasyapi.javaclientsdk.models.shared.GetNamespacesResponse> getNamespacesResponse() {
        return (Optional<dev.speakeasyapi.javaclientsdk.models.shared.GetNamespacesResponse>) getNamespacesResponse;
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
     * HTTP response content type for this operation
     */
    public GetNamespacesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Default error response
     */
    public GetNamespacesResponse withError(Error error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    /**
     * Default error response
     */
    public GetNamespacesResponse withError(Optional<? extends Error> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    /**
     * OK
     */
    public GetNamespacesResponse withGetNamespacesResponse(dev.speakeasyapi.javaclientsdk.models.shared.GetNamespacesResponse getNamespacesResponse) {
        Utils.checkNotNull(getNamespacesResponse, "getNamespacesResponse");
        this.getNamespacesResponse = Optional.ofNullable(getNamespacesResponse);
        return this;
    }

    /**
     * OK
     */
    public GetNamespacesResponse withGetNamespacesResponse(Optional<? extends dev.speakeasyapi.javaclientsdk.models.shared.GetNamespacesResponse> getNamespacesResponse) {
        Utils.checkNotNull(getNamespacesResponse, "getNamespacesResponse");
        this.getNamespacesResponse = getNamespacesResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetNamespacesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetNamespacesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetNamespacesResponse other = (GetNamespacesResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.error, other.error) &&
            Objects.deepEquals(this.getNamespacesResponse, other.getNamespacesResponse) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            error,
            getNamespacesResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetNamespacesResponse.class,
                "contentType", contentType,
                "error", error,
                "getNamespacesResponse", getNamespacesResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends Error> error = Optional.empty();
 
        private Optional<? extends dev.speakeasyapi.javaclientsdk.models.shared.GetNamespacesResponse> getNamespacesResponse = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
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
         * OK
         */
        public Builder getNamespacesResponse(dev.speakeasyapi.javaclientsdk.models.shared.GetNamespacesResponse getNamespacesResponse) {
            Utils.checkNotNull(getNamespacesResponse, "getNamespacesResponse");
            this.getNamespacesResponse = Optional.ofNullable(getNamespacesResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder getNamespacesResponse(Optional<? extends dev.speakeasyapi.javaclientsdk.models.shared.GetNamespacesResponse> getNamespacesResponse) {
            Utils.checkNotNull(getNamespacesResponse, "getNamespacesResponse");
            this.getNamespacesResponse = getNamespacesResponse;
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
        
        public GetNamespacesResponse build() {
            return new GetNamespacesResponse(
                contentType,
                error,
                getNamespacesResponse,
                statusCode,
                rawResponse);
        }
    }
}

