/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.EmbedToken;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Response;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class GetValidEmbedAccessTokensResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * OK
     */
    private Optional<? extends List<EmbedToken>> embedTokens;

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
    public GetValidEmbedAccessTokensResponse(
            String contentType,
            Optional<? extends List<EmbedToken>> embedTokens,
            Optional<? extends Error> error,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(embedTokens, "embedTokens");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.embedTokens = embedTokens;
        this.error = error;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetValidEmbedAccessTokensResponse(
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
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<EmbedToken>> embedTokens() {
        return (Optional<List<EmbedToken>>) embedTokens;
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
     * HTTP response content type for this operation
     */
    public GetValidEmbedAccessTokensResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * OK
     */
    public GetValidEmbedAccessTokensResponse withEmbedTokens(List<EmbedToken> embedTokens) {
        Utils.checkNotNull(embedTokens, "embedTokens");
        this.embedTokens = Optional.ofNullable(embedTokens);
        return this;
    }

    /**
     * OK
     */
    public GetValidEmbedAccessTokensResponse withEmbedTokens(Optional<? extends List<EmbedToken>> embedTokens) {
        Utils.checkNotNull(embedTokens, "embedTokens");
        this.embedTokens = embedTokens;
        return this;
    }

    /**
     * Default error response
     */
    public GetValidEmbedAccessTokensResponse withError(Error error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    /**
     * Default error response
     */
    public GetValidEmbedAccessTokensResponse withError(Optional<? extends Error> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetValidEmbedAccessTokensResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetValidEmbedAccessTokensResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetValidEmbedAccessTokensResponse other = (GetValidEmbedAccessTokensResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.embedTokens, other.embedTokens) &&
            Objects.deepEquals(this.error, other.error) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            embedTokens,
            error,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetValidEmbedAccessTokensResponse.class,
                "contentType", contentType,
                "embedTokens", embedTokens,
                "error", error,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends List<EmbedToken>> embedTokens = Optional.empty();
 
        private Optional<? extends Error> error = Optional.empty();
 
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
         * OK
         */
        public Builder embedTokens(List<EmbedToken> embedTokens) {
            Utils.checkNotNull(embedTokens, "embedTokens");
            this.embedTokens = Optional.ofNullable(embedTokens);
            return this;
        }

        /**
         * OK
         */
        public Builder embedTokens(Optional<? extends List<EmbedToken>> embedTokens) {
            Utils.checkNotNull(embedTokens, "embedTokens");
            this.embedTokens = embedTokens;
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
        
        public GetValidEmbedAccessTokensResponse build() {
            return new GetValidEmbedAccessTokensResponse(
                contentType,
                embedTokens,
                error,
                statusCode,
                rawResponse);
        }
    }
}

