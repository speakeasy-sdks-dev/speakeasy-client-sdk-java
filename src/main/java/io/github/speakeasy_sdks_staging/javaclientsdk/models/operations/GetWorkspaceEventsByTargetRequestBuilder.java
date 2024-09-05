/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;

public class GetWorkspaceEventsByTargetRequestBuilder {

    private GetWorkspaceEventsByTargetRequest request;
    private final SDKMethodInterfaces.MethodCallGetWorkspaceEventsByTarget sdk;

    public GetWorkspaceEventsByTargetRequestBuilder(SDKMethodInterfaces.MethodCallGetWorkspaceEventsByTarget sdk) {
        this.sdk = sdk;
    }

    public GetWorkspaceEventsByTargetRequestBuilder request(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceEventsByTargetRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetWorkspaceEventsByTargetResponse call() throws Exception {

        return sdk.getWorkspaceEventsByTarget(
            request);
    }
}