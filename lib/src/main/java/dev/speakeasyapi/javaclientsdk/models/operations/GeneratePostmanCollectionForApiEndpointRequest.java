/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class GeneratePostmanCollectionForApiEndpointRequest {
    /**
     * The ID of the ApiEndpoint to generate a Postman collection for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiEndpointID")
    public String apiEndpointID;

    public GeneratePostmanCollectionForApiEndpointRequest withApiEndpointID(String apiEndpointID) {
        this.apiEndpointID = apiEndpointID;
        return this;
    }
    
    /**
     * The ID of the Api to generate a Postman collection for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;

    public GeneratePostmanCollectionForApiEndpointRequest withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    
    /**
     * The version ID of the Api to generate a Postman collection for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;

    public GeneratePostmanCollectionForApiEndpointRequest withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
    
    public GeneratePostmanCollectionForApiEndpointRequest(@JsonProperty("apiEndpointID") String apiEndpointID, @JsonProperty("apiID") String apiID, @JsonProperty("versionID") String versionID) {
        this.apiEndpointID = apiEndpointID;
        this.apiID = apiID;
        this.versionID = versionID;
  }
}
