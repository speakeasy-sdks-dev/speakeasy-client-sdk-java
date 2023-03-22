/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class InsertVersionMetadataRequest {
    public InsertVersionMetadataPathParams pathParams;
    public InsertVersionMetadataRequest withPathParams(InsertVersionMetadataPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    /**
     * A JSON representation of the metadata to insert.
     */
    @SpeakeasyMetadata("request:mediaType=application/json")public dev.speakeasyapi.javaclientsdk.models.shared.VersionMetadataInput request;
    public InsertVersionMetadataRequest withRequest(dev.speakeasyapi.javaclientsdk.models.shared.VersionMetadataInput request) {
        this.request = request;
        return this;
    }
    
}
