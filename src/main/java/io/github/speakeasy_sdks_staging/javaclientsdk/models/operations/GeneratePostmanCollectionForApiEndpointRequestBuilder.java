/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.LazySingletonValue;

public class GeneratePostmanCollectionForApiEndpointRequestBuilder {

    private GeneratePostmanCollectionForApiEndpointRequest request;

    private final SDKMethodInterfaces.MethodCallGeneratePostmanCollectionForApiEndpoint sdk;
    
    public GeneratePostmanCollectionForApiEndpointRequestBuilder(SDKMethodInterfaces.MethodCallGeneratePostmanCollectionForApiEndpoint sdk) {
        this.sdk = sdk;
    }
             
    public GeneratePostmanCollectionForApiEndpointRequestBuilder request(GeneratePostmanCollectionForApiEndpointRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GeneratePostmanCollectionForApiEndpointResponse call() throws Exception {
        return sdk.generatePostmanCollectionForApiEndpoint(
            request);
    }
}