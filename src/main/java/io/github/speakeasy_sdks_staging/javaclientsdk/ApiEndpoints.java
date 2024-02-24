/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SDKMethodInterfaces.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.HTTPClient;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.HTTPRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.JSON;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.SerializedBody;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * REST APIs for managing ApiEndpoint entities
 */
public class ApiEndpoints implements
            MethodCallDeleteApiEndpoint,
            MethodCallFindApiEndpoint,
            MethodCallGenerateOpenApiSpecForApiEndpoint,
            MethodCallGeneratePostmanCollectionForApiEndpoint,
            MethodCallGetAllApiEndpoints,
            MethodCallGetAllForVersionApiEndpoints,
            MethodCallGetApiEndpoint,
            MethodCallUpsertApiEndpoint {

    private final SDKConfiguration sdkConfiguration;

    ApiEndpoints(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiEndpointRequestBuilder deleteApiEndpoint() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiEndpointRequestBuilder(this);
    }

    /**
     * Delete an ApiEndpoint.
     * Delete an ApiEndpoint. This will also delete all associated Request Logs (if using a Postgres datastore).
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiEndpointResponse deleteApiEndpoint(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiEndpointRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiEndpointRequest.class,
                baseUrl,
                "/v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID}",
                request, this.sdkConfiguration.globals);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiEndpointResponse.Builder resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiEndpointResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiEndpointResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
        }else {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error>() {});
                res.withError(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }


    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FindApiEndpointRequestBuilder findApiEndpoint() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FindApiEndpointRequestBuilder(this);
    }

    /**
     * Find an ApiEndpoint via its displayName.
     * Find an ApiEndpoint via its displayName (set by operationId from a registered OpenAPI schema).
     * This is useful for finding the ID of an ApiEndpoint to use in the /v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID} endpoints.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FindApiEndpointResponse findApiEndpoint(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FindApiEndpointRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FindApiEndpointRequest.class,
                baseUrl,
                "/v1/apis/{apiID}/version/{versionID}/api_endpoints/find/{displayName}",
                request, this.sdkConfiguration.globals);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FindApiEndpointResponse.Builder resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FindApiEndpointResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FindApiEndpointResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint>() {});
                res.withApiEndpoint(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }else {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error>() {});
                res.withError(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }


    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointRequestBuilder generateOpenApiSpecForApiEndpoint() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointRequestBuilder(this);
    }

    /**
     * Generate an OpenAPI specification for a particular ApiEndpoint.
     * This endpoint will generate a new operation in any registered OpenAPI document if the operation does not already exist in the document.
     * Returns the original document and the newly generated document allowing a diff to be performed to see what has changed.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse generateOpenApiSpecForApiEndpoint(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointRequest.class,
                baseUrl,
                "/v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID}/generate/openapi",
                request, this.sdkConfiguration.globals);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse.Builder resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GenerateOpenApiSpecDiff out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GenerateOpenApiSpecDiff>() {});
                res.withGenerateOpenApiSpecDiff(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }else {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error>() {});
                res.withError(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }


    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointRequestBuilder generatePostmanCollectionForApiEndpoint() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointRequestBuilder(this);
    }

    /**
     * Generate a Postman collection for a particular ApiEndpoint.
     * Generates a postman collection that allows the endpoint to be called from postman variables produced for any path/query/header parameters included in the OpenAPI document.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse generatePostmanCollectionForApiEndpoint(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointRequest.class,
                baseUrl,
                "/v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID}/generate/postman",
                request, this.sdkConfiguration.globals);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/octet-stream;q=0");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse.Builder resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);
        if ((httpRes.statusCode() == 200) && io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/octet-stream")) {
            resBuilder.postmanCollection(httpRes.body());
        }

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/octet-stream")) {
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }else {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error>() {});
                res.withError(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }


    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiEndpointsRequestBuilder getAllApiEndpoints() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiEndpointsRequestBuilder(this);
    }

    /**
     * Get all Api endpoints for a particular apiID.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiEndpointsResponse getAllApiEndpoints(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiEndpointsRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiEndpointsRequest.class,
                baseUrl,
                "/v1/apis/{apiID}/api_endpoints",
                request, this.sdkConfiguration.globals);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiEndpointsResponse.Builder resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiEndpointsResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiEndpointsResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint> out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint>>() {});
                res.withApiEndpoints(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }else {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error>() {});
                res.withError(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }


    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllForVersionApiEndpointsRequestBuilder getAllForVersionApiEndpoints() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllForVersionApiEndpointsRequestBuilder(this);
    }

    /**
     * Get all ApiEndpoints for a particular apiID and versionID.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse getAllForVersionApiEndpoints(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllForVersionApiEndpointsRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllForVersionApiEndpointsRequest.class,
                baseUrl,
                "/v1/apis/{apiID}/version/{versionID}/api_endpoints",
                request, this.sdkConfiguration.globals);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse.Builder resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint> out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint>>() {});
                res.withAPIEndpoints(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }else {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error>() {});
                res.withError(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }


    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApiEndpointRequestBuilder getApiEndpoint() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApiEndpointRequestBuilder(this);
    }

    /**
     * Get an ApiEndpoint.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApiEndpointResponse getApiEndpoint(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApiEndpointRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApiEndpointRequest.class,
                baseUrl,
                "/v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID}",
                request, this.sdkConfiguration.globals);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApiEndpointResponse.Builder resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApiEndpointResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApiEndpointResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint>() {});
                res.withApiEndpoint(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }else {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error>() {});
                res.withError(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }


    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiEndpointRequestBuilder upsertApiEndpoint() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiEndpointRequestBuilder(this);
    }

    /**
     * Upsert an ApiEndpoint.
     * Upsert an ApiEndpoint. If the ApiEndpoint does not exist it will be created, otherwise it will be updated.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiEndpointResponse upsertApiEndpoint(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiEndpointRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiEndpointRequest.class,
                baseUrl,
                "/v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID}",
                request, this.sdkConfiguration.globals);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiEndpointRequest>() {});
        SerializedBody serializedRequestBody = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.serializeRequestBody(
                _convertedRequest, "apiEndpoint", "json", false);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiEndpointResponse.Builder resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiEndpointResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiEndpointResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint>() {});
                res.withApiEndpoint(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }else {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error>() {});
                res.withError(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

}
