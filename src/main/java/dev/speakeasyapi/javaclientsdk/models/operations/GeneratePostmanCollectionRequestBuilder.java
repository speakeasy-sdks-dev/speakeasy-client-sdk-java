/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class GeneratePostmanCollectionRequestBuilder {

    private GeneratePostmanCollectionRequest request;
    private final SDKMethodInterfaces.MethodCallGeneratePostmanCollection sdk;

    public GeneratePostmanCollectionRequestBuilder(SDKMethodInterfaces.MethodCallGeneratePostmanCollection sdk) {
        this.sdk = sdk;
    }

    public GeneratePostmanCollectionRequestBuilder request(GeneratePostmanCollectionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GeneratePostmanCollectionResponse call() throws Exception {

        return sdk.generatePostmanCollection(
            request);
    }
}