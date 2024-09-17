/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class GetWorkspaceFeatureFlagsRequestBuilder {

    private GetWorkspaceFeatureFlagsRequest request;
    private final SDKMethodInterfaces.MethodCallGetWorkspaceFeatureFlags sdk;

    public GetWorkspaceFeatureFlagsRequestBuilder(SDKMethodInterfaces.MethodCallGetWorkspaceFeatureFlags sdk) {
        this.sdk = sdk;
    }

    public GetWorkspaceFeatureFlagsRequestBuilder request(dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceFeatureFlagsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetWorkspaceFeatureFlagsResponse call() throws Exception {

        return sdk.getWorkspaceFeatureFlags(
            request);
    }
}
