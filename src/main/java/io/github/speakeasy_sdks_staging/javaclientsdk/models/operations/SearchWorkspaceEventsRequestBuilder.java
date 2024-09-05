/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;

public class SearchWorkspaceEventsRequestBuilder {

    private SearchWorkspaceEventsRequest request;
    private final SDKMethodInterfaces.MethodCallSearchWorkspaceEvents sdk;

    public SearchWorkspaceEventsRequestBuilder(SDKMethodInterfaces.MethodCallSearchWorkspaceEvents sdk) {
        this.sdk = sdk;
    }

    public SearchWorkspaceEventsRequestBuilder request(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SearchWorkspaceEventsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public SearchWorkspaceEventsResponse call() throws Exception {

        return sdk.searchWorkspaceEvents(
            request);
    }
}