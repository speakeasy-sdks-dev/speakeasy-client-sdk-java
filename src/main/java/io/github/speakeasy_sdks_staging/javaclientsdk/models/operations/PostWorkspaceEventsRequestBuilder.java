/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Options;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.RetryConfig;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.util.Optional;

public class PostWorkspaceEventsRequestBuilder {

    private PostWorkspaceEventsRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallPostWorkspaceEvents sdk;

    public PostWorkspaceEventsRequestBuilder(SDKMethodInterfaces.MethodCallPostWorkspaceEvents sdk) {
        this.sdk = sdk;
    }

    public PostWorkspaceEventsRequestBuilder request(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PostWorkspaceEventsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public PostWorkspaceEventsRequestBuilder retryConfig(io.github.speakeasy_sdks_staging.javaclientsdk.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public PostWorkspaceEventsRequestBuilder retryConfig(java.util.Optional<io.github.speakeasy_sdks_staging.javaclientsdk.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public PostWorkspaceEventsResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.postWorkspaceEvents(
            request,
            options);
    }
}
