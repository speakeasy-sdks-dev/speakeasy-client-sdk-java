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


public class FindApiEndpointRequest {

    /**
     * The ID of the Api the ApiEndpoint belongs to.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    private String apiID;

    /**
     * The displayName of the ApiEndpoint to find (set by operationId from OpenAPI schema).
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=displayName")
    private String displayName;

    /**
     * The version ID of the Api the ApiEndpoint belongs to.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    private String versionID;

    public FindApiEndpointRequest(
            String apiID,
            String displayName,
            String versionID) {
        Utils.checkNotNull(apiID, "apiID");
        Utils.checkNotNull(displayName, "displayName");
        Utils.checkNotNull(versionID, "versionID");
        this.apiID = apiID;
        this.displayName = displayName;
        this.versionID = versionID;
    }

    /**
     * The ID of the Api the ApiEndpoint belongs to.
     */
    public String apiID() {
        return apiID;
    }

    /**
     * The displayName of the ApiEndpoint to find (set by operationId from OpenAPI schema).
     */
    public String displayName() {
        return displayName;
    }

    /**
     * The version ID of the Api the ApiEndpoint belongs to.
     */
    public String versionID() {
        return versionID;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the Api the ApiEndpoint belongs to.
     */
    public FindApiEndpointRequest withApiID(String apiID) {
        Utils.checkNotNull(apiID, "apiID");
        this.apiID = apiID;
        return this;
    }

    /**
     * The displayName of the ApiEndpoint to find (set by operationId from OpenAPI schema).
     */
    public FindApiEndpointRequest withDisplayName(String displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = displayName;
        return this;
    }

    /**
     * The version ID of the Api the ApiEndpoint belongs to.
     */
    public FindApiEndpointRequest withVersionID(String versionID) {
        Utils.checkNotNull(versionID, "versionID");
        this.versionID = versionID;
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
        FindApiEndpointRequest other = (FindApiEndpointRequest) o;
        return 
            java.util.Objects.deepEquals(this.apiID, other.apiID) &&
            java.util.Objects.deepEquals(this.displayName, other.displayName) &&
            java.util.Objects.deepEquals(this.versionID, other.versionID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiID,
            displayName,
            versionID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FindApiEndpointRequest.class,
                "apiID", apiID,
                "displayName", displayName,
                "versionID", versionID);
    }
    
    public final static class Builder {
 
        private String apiID;
 
        private String displayName;
 
        private String versionID;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the Api the ApiEndpoint belongs to.
         */
        public Builder apiID(String apiID) {
            Utils.checkNotNull(apiID, "apiID");
            this.apiID = apiID;
            return this;
        }

        /**
         * The displayName of the ApiEndpoint to find (set by operationId from OpenAPI schema).
         */
        public Builder displayName(String displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = displayName;
            return this;
        }

        /**
         * The version ID of the Api the ApiEndpoint belongs to.
         */
        public Builder versionID(String versionID) {
            Utils.checkNotNull(versionID, "versionID");
            this.versionID = versionID;
            return this;
        }
        
        public FindApiEndpointRequest build() {
            return new FindApiEndpointRequest(
                apiID,
                displayName,
                versionID);
        }
    }
}

