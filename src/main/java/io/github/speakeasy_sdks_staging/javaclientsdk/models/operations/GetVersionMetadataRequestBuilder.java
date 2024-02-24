/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.LazySingletonValue;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


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
