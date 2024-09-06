/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.CliEvent;
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


public class SearchWorkspaceEventsResponse implements Response {

    /**
     * Success
     */
    private Optional<? extends List<CliEvent>> cliEventBatch;

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public SearchWorkspaceEventsResponse(
            Optional<? extends List<CliEvent>> cliEventBatch,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(cliEventBatch, "cliEventBatch");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.cliEventBatch = cliEventBatch;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public SearchWorkspaceEventsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(Optional.empty(), contentType, statusCode, rawResponse);
    }

    /**
     * Success
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<CliEvent>> cliEventBatch() {
        return (Optional<List<CliEvent>>) cliEventBatch;
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
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
     * Success
     */
    public SearchWorkspaceEventsResponse withCliEventBatch(List<CliEvent> cliEventBatch) {
        Utils.checkNotNull(cliEventBatch, "cliEventBatch");
        this.cliEventBatch = Optional.ofNullable(cliEventBatch);
        return this;
    }

    /**
     * Success
     */
    public SearchWorkspaceEventsResponse withCliEventBatch(Optional<? extends List<CliEvent>> cliEventBatch) {
        Utils.checkNotNull(cliEventBatch, "cliEventBatch");
        this.cliEventBatch = cliEventBatch;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public SearchWorkspaceEventsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public SearchWorkspaceEventsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public SearchWorkspaceEventsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        SearchWorkspaceEventsResponse other = (SearchWorkspaceEventsResponse) o;
        return 
            Objects.deepEquals(this.cliEventBatch, other.cliEventBatch) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            cliEventBatch,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SearchWorkspaceEventsResponse.class,
                "cliEventBatch", cliEventBatch,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<CliEvent>> cliEventBatch = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Success
         */
        public Builder cliEventBatch(List<CliEvent> cliEventBatch) {
            Utils.checkNotNull(cliEventBatch, "cliEventBatch");
            this.cliEventBatch = Optional.ofNullable(cliEventBatch);
            return this;
        }

        /**
         * Success
         */
        public Builder cliEventBatch(Optional<? extends List<CliEvent>> cliEventBatch) {
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
        
        public SearchWorkspaceEventsResponse build() {
            return new SearchWorkspaceEventsResponse(
                cliEventBatch,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

