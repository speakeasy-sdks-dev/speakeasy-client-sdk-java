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


public class GetSchemasRequestBuilder {

    private GetSchemasRequest request;
    private final SDKMethodInterfaces.MethodCallGetSchemas sdk;

    public GetSchemasRequestBuilder(SDKMethodInterfaces.MethodCallGetSchemas sdk) {
        this.sdk = sdk;
    }

    public GetSchemasRequestBuilder request(GetSchemasRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetSchemasResponse call() throws Exception {

        return sdk.getSchemas(
            request);
    }
}
