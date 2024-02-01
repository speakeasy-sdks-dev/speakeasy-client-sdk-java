/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.net.http.HttpResponse;
import java.util.Optional;


public class GenerateRequestPostmanCollectionResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Default error response
     */
    private Optional<? extends dev.speakeasyapi.javaclientsdk.models.shared.Error> error;

    /**
     * OK
     */
    private Optional<? extends InputStream> postmanCollection;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public GenerateRequestPostmanCollectionResponse(
            String contentType,
            Optional<? extends dev.speakeasyapi.javaclientsdk.models.shared.Error> error,
            Optional<? extends InputStream> postmanCollection,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(postmanCollection, "postmanCollection");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.error = error;
        this.postmanCollection = postmanCollection;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
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
     * OK
     */
    public Optional<? extends InputStream> postmanCollection() {
        return postmanCollection;
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
     * HTTP response content type for this operation
     */
    public GenerateRequestPostmanCollectionResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Default error response
     */
    public GenerateRequestPostmanCollectionResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }
    
    /**
     * Default error response
     */
    public GenerateRequestPostmanCollectionResponse withError(Optional<? extends dev.speakeasyapi.javaclientsdk.models.shared.Error> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    /**
     * OK
     */
    public GenerateRequestPostmanCollectionResponse withPostmanCollection(InputStream postmanCollection) {
        Utils.checkNotNull(postmanCollection, "postmanCollection");
        this.postmanCollection = Optional.ofNullable(postmanCollection);
        return this;
    }
    
    /**
     * OK
     */
    public GenerateRequestPostmanCollectionResponse withPostmanCollection(Optional<? extends InputStream> postmanCollection) {
        Utils.checkNotNull(postmanCollection, "postmanCollection");
        this.postmanCollection = postmanCollection;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GenerateRequestPostmanCollectionResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GenerateRequestPostmanCollectionResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GenerateRequestPostmanCollectionResponse other = (GenerateRequestPostmanCollectionResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.error, other.error) &&
            java.util.Objects.deepEquals(this.postmanCollection, other.postmanCollection) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            error,
            postmanCollection,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GenerateRequestPostmanCollectionResponse.class,
                "contentType", contentType,
                "error", error,
                "postmanCollection", postmanCollection,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends dev.speakeasyapi.javaclientsdk.models.shared.Error> error = Optional.empty();
 
        private Optional<? extends InputStream> postmanCollection = Optional.empty();
 
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
         * OK
         */
        public Builder postmanCollection(InputStream postmanCollection) {
            Utils.checkNotNull(postmanCollection, "postmanCollection");
            this.postmanCollection = Optional.ofNullable(postmanCollection);
            return this;
        }
        
        /**
         * OK
         */
        public Builder postmanCollection(Optional<? extends InputStream> postmanCollection) {
            Utils.checkNotNull(postmanCollection, "postmanCollection");
            this.postmanCollection = postmanCollection;
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
        
        public GenerateRequestPostmanCollectionResponse build() {
            return new GenerateRequestPostmanCollectionResponse(
                contentType,
                error,
                postmanCollection,
                statusCode,
                rawResponse);
        }
    }
}

