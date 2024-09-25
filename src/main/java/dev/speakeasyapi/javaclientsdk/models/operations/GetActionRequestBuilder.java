/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class GetActionRequestBuilder {

    private GetActionRequest request;
    private final SDKMethodInterfaces.MethodCallGetAction sdk;

    public GetActionRequestBuilder(SDKMethodInterfaces.MethodCallGetAction sdk) {
        this.sdk = sdk;
    }

    public GetActionRequestBuilder request(GetActionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetActionResponse call() throws Exception {

        return sdk.getAction(
            request);
    }
}
