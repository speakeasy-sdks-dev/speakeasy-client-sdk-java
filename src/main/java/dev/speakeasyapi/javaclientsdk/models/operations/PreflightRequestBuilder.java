/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.models.shared.PreflightRequest;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.util.Optional;

public class PreflightRequestBuilder {

    private Optional<? extends PreflightRequest> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallPreflight sdk;

    public PreflightRequestBuilder(SDKMethodInterfaces.MethodCallPreflight sdk) {
        this.sdk = sdk;
    }
                
    public PreflightRequestBuilder request(PreflightRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public PreflightRequestBuilder request(Optional<? extends PreflightRequest> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PreflightResponse call() throws Exception {

        return sdk.preflight(
            request);
    }
}