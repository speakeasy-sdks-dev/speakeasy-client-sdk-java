/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class DownloadSchemaRevisionResponse {
    /**
     * OK
     */
    
    public byte[] twoHundredApplicationJsonSchema;

    public DownloadSchemaRevisionResponse withTwoHundredApplicationJsonSchema(byte[] twoHundredApplicationJsonSchema) {
        this.twoHundredApplicationJsonSchema = twoHundredApplicationJsonSchema;
        return this;
    }
    
    /**
     * OK
     */
    
    public byte[] twoHundredApplicationXYamlSchema;

    public DownloadSchemaRevisionResponse withTwoHundredApplicationXYamlSchema(byte[] twoHundredApplicationXYamlSchema) {
        this.twoHundredApplicationXYamlSchema = twoHundredApplicationXYamlSchema;
        return this;
    }
    
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public DownloadSchemaRevisionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Default error response
     */
    
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error error;

    public DownloadSchemaRevisionResponse withError(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public DownloadSchemaRevisionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public DownloadSchemaRevisionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public DownloadSchemaRevisionResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
