/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.SpeakeasyMetadata;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class UpsertApiRequest {

    /**
     * A JSON representation of the Api to upsert
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiInput api;

    /**
     * The ID of the Api to upsert.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    private String apiID;

    public UpsertApiRequest(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiInput api,
            String apiID) {
        Utils.checkNotNull(api, "api");
        Utils.checkNotNull(apiID, "apiID");
        this.api = api;
        this.apiID = apiID;
    }

    /**
     * A JSON representation of the Api to upsert
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiInput api() {
        return api;
    }

    /**
     * The ID of the Api to upsert.
     */
    public String apiID() {
        return apiID;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A JSON representation of the Api to upsert
     */
    public UpsertApiRequest withApi(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiInput api) {
        Utils.checkNotNull(api, "api");
        this.api = api;
        return this;
    }

    /**
     * The ID of the Api to upsert.
     */
    public UpsertApiRequest withApiID(String apiID) {
        Utils.checkNotNull(apiID, "apiID");
        this.apiID = apiID;
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
        UpsertApiRequest other = (UpsertApiRequest) o;
        return 
            java.util.Objects.deepEquals(this.api, other.api) &&
            java.util.Objects.deepEquals(this.apiID, other.apiID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            api,
            apiID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpsertApiRequest.class,
                "api", api,
                "apiID", apiID);
    }
    
    public final static class Builder {
 
        private io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiInput api;
 
        private String apiID;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A JSON representation of the Api to upsert
         */
        public Builder api(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiInput api) {
            Utils.checkNotNull(api, "api");
            this.api = api;
            return this;
        }

        /**
         * The ID of the Api to upsert.
         */
        public Builder apiID(String apiID) {
            Utils.checkNotNull(apiID, "apiID");
            this.apiID = apiID;
            return this;
        }
        
        public UpsertApiRequest build() {
            return new UpsertApiRequest(
                api,
                apiID);
        }
    }
}

