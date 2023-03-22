/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class InsertVersionMetadataPathParams {
    /**
     * The ID of the Api to insert metadata for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")public String apiID;
    public InsertVersionMetadataPathParams withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    
    /**
     * The version ID of the Api to insert metadata for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")public String versionID;
    public InsertVersionMetadataPathParams withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
    
}
