/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.LazySingletonValue;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class GenerateRequestPostmanCollectionRequestBuilder {

    private GenerateRequestPostmanCollectionRequest request;
    private final SDKMethodInterfaces.MethodCallGenerateRequestPostmanCollection sdk;

    public GenerateRequestPostmanCollectionRequestBuilder(SDKMethodInterfaces.MethodCallGenerateRequestPostmanCollection sdk) {
        this.sdk = sdk;
    }

    public GenerateRequestPostmanCollectionRequestBuilder request(GenerateRequestPostmanCollectionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GenerateRequestPostmanCollectionResponse call() throws Exception {

        return sdk.generateRequestPostmanCollection(
            request);
    }
}