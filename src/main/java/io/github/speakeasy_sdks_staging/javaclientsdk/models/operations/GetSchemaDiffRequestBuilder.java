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


public class GetSchemaDiffRequestBuilder {

    private GetSchemaDiffRequest request;
    private final SDKMethodInterfaces.MethodCallGetSchemaDiff sdk;

    public GetSchemaDiffRequestBuilder(SDKMethodInterfaces.MethodCallGetSchemaDiff sdk) {
        this.sdk = sdk;
    }

    public GetSchemaDiffRequestBuilder request(GetSchemaDiffRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetSchemaDiffResponse call() throws Exception {

        return sdk.getSchemaDiff(
            request);
    }
}
