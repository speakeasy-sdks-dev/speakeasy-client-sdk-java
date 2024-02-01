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

public class GetRequestFromEventLogRequestBuilder {

    private GetRequestFromEventLogRequest request;

    private final SDKMethodInterfaces.MethodCallGetRequestFromEventLog sdk;
    
    public GetRequestFromEventLogRequestBuilder(SDKMethodInterfaces.MethodCallGetRequestFromEventLog sdk) {
        this.sdk = sdk;
    }
             
    public GetRequestFromEventLogRequestBuilder request(GetRequestFromEventLogRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetRequestFromEventLogResponse call() throws Exception {
        return sdk.getRequestFromEventLog(
            request);
    }
}