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
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * REST APIs for managing Schema entities
 */
public class Schemas implements
            MethodCallDeleteSchema,
            MethodCallDownloadSchema,
            MethodCallDownloadSchemaRevision,
            MethodCallGetSchema,
            MethodCallGetSchemaDiff,
            MethodCallGetSchemaRevision,
            MethodCallGetSchemas,
            MethodCallRegisterSchema {

    private final SDKConfiguration sdkConfiguration;

    Schemas(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteSchemaRequestBuilder deleteSchema() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteSchemaRequestBuilder(this);
    }

    /**
     * Delete a particular schema revision for an Api.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteSchemaResponse deleteSchema(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteSchemaRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteSchemaRequest.class,
                baseUrl,
                "/v1/apis/{apiID}/version/{versionID}/schema/{revisionID}",
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
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteSchemaResponse.Builder resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteSchemaResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteSchemaResponse res = resBuilder.build();

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


    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRequestBuilder downloadSchema() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRequestBuilder(this);
    }

    /**
     * Download the latest schema for a particular apiID.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaResponse downloadSchema(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRequest.class,
                baseUrl,
                "/v1/apis/{apiID}/version/{versionID}/schema/download",
                request, this.sdkConfiguration.globals);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/x-yaml;q=0");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaResponse.Builder resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);
        if ((httpRes.statusCode() == 200) && io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
            resBuilder.twoHundredApplicationJsonSchema(httpRes.body());
        }
        if ((httpRes.statusCode() == 200) && io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/x-yaml")) {
            resBuilder.twoHundredApplicationXYamlSchema(httpRes.body());
        }

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
            } else if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/x-yaml")) {
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


    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRevisionRequestBuilder downloadSchemaRevision() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRevisionRequestBuilder(this);
    }

    /**
     * Download a particular schema revision for an Api.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRevisionResponse downloadSchemaRevision(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRevisionRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRevisionRequest.class,
                baseUrl,
                "/v1/apis/{apiID}/version/{versionID}/schema/{revisionID}/download",
                request, this.sdkConfiguration.globals);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/x-yaml;q=0");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRevisionResponse.Builder resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRevisionResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);
        if ((httpRes.statusCode() == 200) && io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
            resBuilder.twoHundredApplicationJsonSchema(httpRes.body());
        }
        if ((httpRes.statusCode() == 200) && io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/x-yaml")) {
            resBuilder.twoHundredApplicationXYamlSchema(httpRes.body());
        }

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRevisionResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
            } else if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/x-yaml")) {
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


    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRequestBuilder getSchema() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRequestBuilder(this);
    }

    /**
     * Get information about the latest schema.
     * Returns information about the last uploaded schema for a particular API version. 
     * This won't include the schema itself, that can be retrieved via the downloadSchema operation.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaResponse getSchema(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRequest.class,
                baseUrl,
                "/v1/apis/{apiID}/version/{versionID}/schema",
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
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaResponse.Builder resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Schema out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Schema>() {});
                res.withSchema(java.util.Optional.ofNullable(out));
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


    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaDiffRequestBuilder getSchemaDiff() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaDiffRequestBuilder(this);
    }

    /**
     * Get a diff of two schema revisions for an Api.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaDiffResponse getSchemaDiff(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaDiffRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaDiffRequest.class,
                baseUrl,
                "/v1/apis/{apiID}/version/{versionID}/schema/{baseRevisionID}/diff/{targetRevisionID}",
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
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaDiffResponse.Builder resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaDiffResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaDiffResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.SchemaDiff out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.SchemaDiff>() {});
                res.withSchemaDiff(java.util.Optional.ofNullable(out));
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


    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRevisionRequestBuilder getSchemaRevision() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRevisionRequestBuilder(this);
    }

    /**
     * Get information about a particular schema revision for an Api.
     * Returns information about the last uploaded schema for a particular schema revision. 
     * This won't include the schema itself, that can be retrieved via the downloadSchema operation.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRevisionResponse getSchemaRevision(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRevisionRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRevisionRequest.class,
                baseUrl,
                "/v1/apis/{apiID}/version/{versionID}/schema/{revisionID}",
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
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRevisionResponse.Builder resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRevisionResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRevisionResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Schema out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Schema>() {});
                res.withSchema(java.util.Optional.ofNullable(out));
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


    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemasRequestBuilder getSchemas() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemasRequestBuilder(this);
    }

    /**
     * Get information about all schemas associated with a particular apiID.
     * Returns information the schemas associated with a particular apiID. 
     * This won't include the schemas themselves, they can be retrieved via the downloadSchema operation.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemasResponse getSchemas(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemasRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemasRequest.class,
                baseUrl,
                "/v1/apis/{apiID}/version/{versionID}/schemas",
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
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemasResponse.Builder resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemasResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemasResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Schema> out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Schema>>() {});
                res.withClasses(java.util.Optional.ofNullable(out));
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


    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RegisterSchemaRequestBuilder registerSchema() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RegisterSchemaRequestBuilder(this);
    }

    /**
     * Register a schema.
     * Allows uploading a schema for a particular API version.
     * This will be used to populate ApiEndpoints and used as a base for any schema generation if present.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RegisterSchemaResponse registerSchema(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RegisterSchemaRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RegisterSchemaRequest.class,
                baseUrl,
                "/v1/apis/{apiID}/version/{versionID}/schema",
                request, this.sdkConfiguration.globals);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        SerializedBody serializedRequestBody = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.serializeRequestBody(
                request, "requestBody", "multipart", false);
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
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RegisterSchemaResponse.Builder resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RegisterSchemaResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RegisterSchemaResponse res = resBuilder.build();

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

}
