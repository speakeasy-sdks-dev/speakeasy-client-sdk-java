/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.SpeakeasyMetadata;


public class RegisterSchemaRequest {
    /**
     * The schema file to upload provided as a multipart/form-data file segment.
     */
    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    public RegisterSchemaRequestBody requestBody;

    public RegisterSchemaRequest withRequestBody(RegisterSchemaRequestBody requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * The ID of the Api to get the schema for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;

    public RegisterSchemaRequest withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    
    /**
     * The version ID of the Api to delete metadata for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;

    public RegisterSchemaRequest withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
    
    public RegisterSchemaRequest(@JsonProperty("RequestBody") RegisterSchemaRequestBody requestBody, @JsonProperty("apiID") String apiID, @JsonProperty("versionID") String versionID) {
        this.requestBody = requestBody;
        this.apiID = apiID;
        this.versionID = versionID;
  }
}
