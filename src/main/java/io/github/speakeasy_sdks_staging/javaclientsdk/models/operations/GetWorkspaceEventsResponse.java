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


public class GetWorkspaceEventsResponse implements io.github.speakeasy_sdks_staging.javaclientsdk.utils.Response {

    /**
     * Success
     */
    private Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.CliEvent>> cliEventBatch;

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Error
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

    public GetWorkspaceEventsResponse(
            Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.CliEvent>> cliEventBatch,
            String contentType,
            Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error> error,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(cliEventBatch, "cliEventBatch");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.cliEventBatch = cliEventBatch;
        this.contentType = contentType;
        this.error = error;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * Success
     */
    public Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.CliEvent>> cliEventBatch() {
        return cliEventBatch;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * Error
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
     * Success
     */
    public GetWorkspaceEventsResponse withCliEventBatch(java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.CliEvent> cliEventBatch) {
        Utils.checkNotNull(cliEventBatch, "cliEventBatch");
        this.cliEventBatch = Optional.ofNullable(cliEventBatch);
        return this;
    }

    /**
     * Success
     */
    public GetWorkspaceEventsResponse withCliEventBatch(Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.CliEvent>> cliEventBatch) {
        Utils.checkNotNull(cliEventBatch, "cliEventBatch");
        this.cliEventBatch = cliEventBatch;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public GetWorkspaceEventsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Error
     */
    public GetWorkspaceEventsResponse withError(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    /**
     * Error
     */
    public GetWorkspaceEventsResponse withError(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetWorkspaceEventsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetWorkspaceEventsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetWorkspaceEventsResponse other = (GetWorkspaceEventsResponse) o;
        return 
            java.util.Objects.deepEquals(this.cliEventBatch, other.cliEventBatch) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.error, other.error) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            cliEventBatch,
            contentType,
            error,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetWorkspaceEventsResponse.class,
                "cliEventBatch", cliEventBatch,
                "contentType", contentType,
                "error", error,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.CliEvent>> cliEventBatch = Optional.empty();
 
        private String contentType;
 
        private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error> error = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Success
         */
        public Builder cliEventBatch(java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.CliEvent> cliEventBatch) {
            Utils.checkNotNull(cliEventBatch, "cliEventBatch");
            this.cliEventBatch = Optional.ofNullable(cliEventBatch);
            return this;
        }

        /**
         * Success
         */
        public Builder cliEventBatch(Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.CliEvent>> cliEventBatch) {
            Utils.checkNotNull(cliEventBatch, "cliEventBatch");
            this.cliEventBatch = cliEventBatch;
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
         * Error
         */
        public Builder error(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }

        /**
         * Error
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
        
        public GetWorkspaceEventsResponse build() {
            return new GetWorkspaceEventsResponse(
                cliEventBatch,
                contentType,
                error,
                statusCode,
                rawResponse);
        }
    }
}

