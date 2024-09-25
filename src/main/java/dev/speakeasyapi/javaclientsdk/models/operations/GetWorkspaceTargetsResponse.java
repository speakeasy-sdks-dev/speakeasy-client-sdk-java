/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.speakeasyapi.javaclientsdk.models.shared.TargetSDK;
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


public class GetWorkspaceTargetsResponse implements Response {

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

    /**
     * Success
     */
    private Optional<? extends List<TargetSDK>> targetSDKList;

    @JsonCreator
    public GetWorkspaceTargetsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends List<TargetSDK>> targetSDKList) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(targetSDKList, "targetSDKList");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.targetSDKList = targetSDKList;
    }
    
    public GetWorkspaceTargetsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
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

    /**
     * Success
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<TargetSDK>> targetSDKList() {
        return (Optional<List<TargetSDK>>) targetSDKList;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetWorkspaceTargetsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetWorkspaceTargetsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetWorkspaceTargetsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Success
     */
    public GetWorkspaceTargetsResponse withTargetSDKList(List<TargetSDK> targetSDKList) {
        Utils.checkNotNull(targetSDKList, "targetSDKList");
        this.targetSDKList = Optional.ofNullable(targetSDKList);
        return this;
    }

    /**
     * Success
     */
    public GetWorkspaceTargetsResponse withTargetSDKList(Optional<? extends List<TargetSDK>> targetSDKList) {
        Utils.checkNotNull(targetSDKList, "targetSDKList");
        this.targetSDKList = targetSDKList;
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
        GetWorkspaceTargetsResponse other = (GetWorkspaceTargetsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.targetSDKList, other.targetSDKList);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            targetSDKList);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetWorkspaceTargetsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "targetSDKList", targetSDKList);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends List<TargetSDK>> targetSDKList = Optional.empty();  
        
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
         * Success
         */
        public Builder targetSDKList(List<TargetSDK> targetSDKList) {
            Utils.checkNotNull(targetSDKList, "targetSDKList");
            this.targetSDKList = Optional.ofNullable(targetSDKList);
            return this;
        }

        /**
         * Success
         */
        public Builder targetSDKList(Optional<? extends List<TargetSDK>> targetSDKList) {
            Utils.checkNotNull(targetSDKList, "targetSDKList");
            this.targetSDKList = targetSDKList;
            return this;
        }
        
        public GetWorkspaceTargetsResponse build() {
            return new GetWorkspaceTargetsResponse(
                contentType,
                statusCode,
                rawResponse,
                targetSDKList);
        }
    }
}
