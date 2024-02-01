/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import dev.speakeasyapi.javaclientsdk.utils.LazySingletonValue;

public class GetVersionMetadataRequestBuilder {

    private GetVersionMetadataRequest request;

    private final SDKMethodInterfaces.MethodCallGetVersionMetadata sdk;
    
    public GetVersionMetadataRequestBuilder(SDKMethodInterfaces.MethodCallGetVersionMetadata sdk) {
        this.sdk = sdk;
    }
             
    public GetVersionMetadataRequestBuilder request(GetVersionMetadataRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetVersionMetadataResponse call() throws Exception {
        return sdk.getVersionMetadata(
            request);
    }
}