/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;

public class GetActionRequestBuilder {

    private GetActionRequest request;
    private final SDKMethodInterfaces.MethodCallGetAction sdk;

    public GetActionRequestBuilder(SDKMethodInterfaces.MethodCallGetAction sdk) {
        this.sdk = sdk;
    }

    public GetActionRequestBuilder request(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetActionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetActionResponse call() throws Exception {

        return sdk.getAction(
            request);
    }
}
