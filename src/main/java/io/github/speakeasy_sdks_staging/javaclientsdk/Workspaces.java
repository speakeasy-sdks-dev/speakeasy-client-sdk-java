/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk;

import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceRequestBuilder;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SDKMethodInterfaces.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Workspace;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.HTTPClient;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.HTTPRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Hook.AfterErrorContextImpl;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Hook.AfterSuccessContextImpl;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Hook.BeforeRequestContextImpl;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

public class Workspaces implements
            MethodCallGetWorkspace {

    private final SDKConfiguration sdkConfiguration;

    Workspaces(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Get workspace
     * Get information about a particular workspace.
     * @return The call builder
     */
    public GetWorkspaceRequestBuilder getWorkspace() {
        return new GetWorkspaceRequestBuilder(this);
    }

    /**
     * Get workspace
     * Get information about a particular workspace.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetWorkspaceResponse getWorkspace(
            GetWorkspaceRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetWorkspaceRequest.class,
                _baseUrl,
                "/v1/workspace/{workspaceID}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "getWorkspace", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getWorkspace",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "getWorkspace",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getWorkspace",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetWorkspaceResponse.Builder _resBuilder = 
            GetWorkspaceResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetWorkspaceResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                Workspace _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Workspace>() {});
                _res.withWorkspace(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "default")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                Error _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Error>() {});
                _res.withError(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }

}
