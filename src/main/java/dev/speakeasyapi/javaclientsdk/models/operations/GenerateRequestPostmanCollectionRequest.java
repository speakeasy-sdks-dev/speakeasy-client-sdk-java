/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GenerateRequestPostmanCollectionRequest {

    /**
     * The ID of the request to retrieve.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=requestID")
    private String requestID;

    @JsonCreator
    public GenerateRequestPostmanCollectionRequest(
            String requestID) {
        Utils.checkNotNull(requestID, "requestID");
        this.requestID = requestID;
    }

    /**
     * The ID of the request to retrieve.
     */
    @JsonIgnore
    public String requestID() {
        return requestID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the request to retrieve.
     */
    public GenerateRequestPostmanCollectionRequest withRequestID(String requestID) {
        Utils.checkNotNull(requestID, "requestID");
        this.requestID = requestID;
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
        GenerateRequestPostmanCollectionRequest other = (GenerateRequestPostmanCollectionRequest) o;
        return 
            Objects.deepEquals(this.requestID, other.requestID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            requestID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GenerateRequestPostmanCollectionRequest.class,
                "requestID", requestID);
    }
    
    public final static class Builder {
 
        private String requestID;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the request to retrieve.
         */
        public Builder requestID(String requestID) {
            Utils.checkNotNull(requestID, "requestID");
            this.requestID = requestID;
            return this;
        }
        
        public GenerateRequestPostmanCollectionRequest build() {
            return new GenerateRequestPostmanCollectionRequest(
                requestID);
        }
    }
}
