/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;


public class GenerateOpenApiSpecRequest {
    /**
     * The ID of the Api to generate an OpenAPI specification for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;

    public GenerateOpenApiSpecRequest withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    
    /**
     * The version ID of the Api to generate an OpenAPI specification for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;

    public GenerateOpenApiSpecRequest withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
    
    public GenerateOpenApiSpecRequest(@JsonProperty("apiID") String apiID, @JsonProperty("versionID") String versionID) {
        this.apiID = apiID;
        this.versionID = versionID;
  }
}
