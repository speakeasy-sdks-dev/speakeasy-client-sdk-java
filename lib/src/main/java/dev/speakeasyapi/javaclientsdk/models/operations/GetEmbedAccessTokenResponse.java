/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import java.net.http.HttpResponse;

public class GetEmbedAccessTokenResponse {
    
    public String contentType;
    public GetEmbedAccessTokenResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * OK
     */
    
    public dev.speakeasyapi.javaclientsdk.models.shared.EmbedAccessTokenResponse embedAccessTokenResponse;
    public GetEmbedAccessTokenResponse withEmbedAccessTokenResponse(dev.speakeasyapi.javaclientsdk.models.shared.EmbedAccessTokenResponse embedAccessTokenResponse) {
        this.embedAccessTokenResponse = embedAccessTokenResponse;
        return this;
    }
    
    /**
     * Default error response
     */
    
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public GetEmbedAccessTokenResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    
    public Integer statusCode;
    public GetEmbedAccessTokenResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetEmbedAccessTokenResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
