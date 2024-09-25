/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class GetLintingReportSignedUrlRequestBuilder {

    private GetLintingReportSignedUrlRequest request;
    private final SDKMethodInterfaces.MethodCallGetLintingReportSignedUrl sdk;

    public GetLintingReportSignedUrlRequestBuilder(SDKMethodInterfaces.MethodCallGetLintingReportSignedUrl sdk) {
        this.sdk = sdk;
    }

    public GetLintingReportSignedUrlRequestBuilder request(GetLintingReportSignedUrlRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetLintingReportSignedUrlResponse call() throws Exception {

        return sdk.getLintingReportSignedUrl(
            request);
    }
}
