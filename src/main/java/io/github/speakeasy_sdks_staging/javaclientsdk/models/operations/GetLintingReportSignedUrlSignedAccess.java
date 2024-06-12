/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
/**
 * GetLintingReportSignedUrlSignedAccess - OK
 */

public class GetLintingReportSignedUrlSignedAccess {

    @JsonProperty("url")
    private String url;

    @JsonCreator
    public GetLintingReportSignedUrlSignedAccess(
            @JsonProperty("url") String url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
    }

    @JsonIgnore
    public String url() {
        return url;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetLintingReportSignedUrlSignedAccess withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
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
        GetLintingReportSignedUrlSignedAccess other = (GetLintingReportSignedUrlSignedAccess) o;
        return 
            java.util.Objects.deepEquals(this.url, other.url);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            url);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLintingReportSignedUrlSignedAccess.class,
                "url", url);
    }
    
    public final static class Builder {
 
        private String url;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }
        
        public GetLintingReportSignedUrlSignedAccess build() {
            return new GetLintingReportSignedUrlSignedAccess(
                url);
        }
    }
}

