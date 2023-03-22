/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class GenerateRequestPostmanCollectionPathParams {
    /**
     * The ID of the request to retrieve.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=requestID")public String requestID;
    public GenerateRequestPostmanCollectionPathParams withRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }
    
}
