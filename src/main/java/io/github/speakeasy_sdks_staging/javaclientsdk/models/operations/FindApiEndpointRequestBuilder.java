/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;

public class FindApiEndpointRequestBuilder {

    private FindApiEndpointRequest request;
    private final SDKMethodInterfaces.MethodCallFindApiEndpoint sdk;

    public FindApiEndpointRequestBuilder(SDKMethodInterfaces.MethodCallFindApiEndpoint sdk) {
        this.sdk = sdk;
    }

    public FindApiEndpointRequestBuilder request(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FindApiEndpointRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public FindApiEndpointResponse call() throws Exception {

        return sdk.findApiEndpoint(
            request);
    }
}
