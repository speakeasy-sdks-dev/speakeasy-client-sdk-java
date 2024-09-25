/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.models.shared.GithubStorePublishingSecretsRequest;
import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class GithubStorePublishingSecretsRequestBuilder {

    private GithubStorePublishingSecretsRequest request;
    private final SDKMethodInterfaces.MethodCallGithubStorePublishingSecrets sdk;

    public GithubStorePublishingSecretsRequestBuilder(SDKMethodInterfaces.MethodCallGithubStorePublishingSecrets sdk) {
        this.sdk = sdk;
    }

    public GithubStorePublishingSecretsRequestBuilder request(GithubStorePublishingSecretsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GithubStorePublishingSecretsResponse call() throws Exception {

        return sdk.githubStorePublishingSecrets(
            request);
    }
}
