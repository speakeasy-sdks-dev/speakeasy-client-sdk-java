/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class GetEmbedAccessTokenQueryParams {
    /**
     * The description of the embed access token.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=description")public String description;
    public GetEmbedAccessTokenQueryParams withDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * The duration (in minutes) of the embed access token.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=duration")public Long duration;
    public GetEmbedAccessTokenQueryParams withDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    
    /**
     * The filter to apply to the query.
     */
    @SpeakeasyMetadata("queryParam:serialization=json,name=filters")public dev.speakeasyapi.javaclientsdk.models.shared.Filters filters;
    public GetEmbedAccessTokenQueryParams withFilters(dev.speakeasyapi.javaclientsdk.models.shared.Filters filters) {
        this.filters = filters;
        return this;
    }
    
}
