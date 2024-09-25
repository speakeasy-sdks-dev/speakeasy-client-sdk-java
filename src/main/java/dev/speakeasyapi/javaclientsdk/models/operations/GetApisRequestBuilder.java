/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class GetApisRequestBuilder {

    private GetApisRequest request;
    private final SDKMethodInterfaces.MethodCallGetApis sdk;

    public GetApisRequestBuilder(SDKMethodInterfaces.MethodCallGetApis sdk) {
        this.sdk = sdk;
    }

    public GetApisRequestBuilder request(GetApisRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetApisResponse call() throws Exception {

        return sdk.getApis(
            request);
    }
}