/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.speakeasyapi.javaclientsdk.models.errors.SDKError;
import dev.speakeasyapi.javaclientsdk.models.operations.SDKMethodInterfaces.*;
import dev.speakeasyapi.javaclientsdk.utils.HTTPClient;
import dev.speakeasyapi.javaclientsdk.utils.HTTPRequest;
import dev.speakeasyapi.javaclientsdk.utils.JSON;
import dev.speakeasyapi.javaclientsdk.utils.SerializedBody;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
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
    public dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaRequestBuilder deleteSchema() {
        return new dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaRequestBuilder(this);
    }

    /**
     * Delete a particular schema revision for an Api.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaResponse deleteSchema(
            dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(
                dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaRequest.class, 
                baseUrl, 
                "/v1/apis/{apiID}/version/{versionID}/schema/{revisionID}", 
                request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = dev.speakeasyapi.javaclientsdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");

        dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaResponse.Builder resBuilder = 
            dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
        }else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<dev.speakeasyapi.javaclientsdk.models.shared.Error>() {});
                res.withError(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

    public dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRequestBuilder downloadSchema() {
        return new dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRequestBuilder(this);
    }

    /**
     * Download the latest schema for a particular apiID.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaResponse downloadSchema(
            dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(
                dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRequest.class, 
                baseUrl, 
                "/v1/apis/{apiID}/version/{versionID}/schema/download", 
                request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/x-yaml;q=0");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = dev.speakeasyapi.javaclientsdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");

        dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaResponse.Builder resBuilder = 
            dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);
        if ((httpRes.statusCode() == 200) && dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
            resBuilder.twoHundredApplicationJsonSchema(httpRes.body());
        }
        if ((httpRes.statusCode() == 200) && dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/x-yaml")) {
            resBuilder.twoHundredApplicationXYamlSchema(httpRes.body());
        }

        dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
            } else if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/x-yaml")) {
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<dev.speakeasyapi.javaclientsdk.models.shared.Error>() {});
                res.withError(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

    public dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionRequestBuilder downloadSchemaRevision() {
        return new dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionRequestBuilder(this);
    }

    /**
     * Download a particular schema revision for an Api.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionResponse downloadSchemaRevision(
            dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(
                dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionRequest.class, 
                baseUrl, 
                "/v1/apis/{apiID}/version/{versionID}/schema/{revisionID}/download", 
                request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/x-yaml;q=0");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = dev.speakeasyapi.javaclientsdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");

        dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionResponse.Builder resBuilder = 
            dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);
        if ((httpRes.statusCode() == 200) && dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
            resBuilder.twoHundredApplicationJsonSchema(httpRes.body());
        }
        if ((httpRes.statusCode() == 200) && dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/x-yaml")) {
            resBuilder.twoHundredApplicationXYamlSchema(httpRes.body());
        }

        dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
            } else if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/x-yaml")) {
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<dev.speakeasyapi.javaclientsdk.models.shared.Error>() {});
                res.withError(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

    public dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRequestBuilder getSchema() {
        return new dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRequestBuilder(this);
    }

    /**
     * Get information about the latest schema.
     * Returns information about the last uploaded schema for a particular API version. 
     * This won't include the schema itself, that can be retrieved via the downloadSchema operation.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaResponse getSchema(
            dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(
                dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRequest.class, 
                baseUrl, 
                "/v1/apis/{apiID}/version/{versionID}/schema", 
                request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = dev.speakeasyapi.javaclientsdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");

        dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaResponse.Builder resBuilder = 
            dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.Schema out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<dev.speakeasyapi.javaclientsdk.models.shared.Schema>() {});
                res.withSchema(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<dev.speakeasyapi.javaclientsdk.models.shared.Error>() {});
                res.withError(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

    public dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffRequestBuilder getSchemaDiff() {
        return new dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffRequestBuilder(this);
    }

    /**
     * Get a diff of two schema revisions for an Api.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffResponse getSchemaDiff(
            dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(
                dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffRequest.class, 
                baseUrl, 
                "/v1/apis/{apiID}/version/{versionID}/schema/{baseRevisionID}/diff/{targetRevisionID}", 
                request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = dev.speakeasyapi.javaclientsdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");

        dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffResponse.Builder resBuilder = 
            dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.SchemaDiff out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<dev.speakeasyapi.javaclientsdk.models.shared.SchemaDiff>() {});
                res.withSchemaDiff(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<dev.speakeasyapi.javaclientsdk.models.shared.Error>() {});
                res.withError(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

    public dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionRequestBuilder getSchemaRevision() {
        return new dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionRequestBuilder(this);
    }

    /**
     * Get information about a particular schema revision for an Api.
     * Returns information about the last uploaded schema for a particular schema revision. 
     * This won't include the schema itself, that can be retrieved via the downloadSchema operation.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionResponse getSchemaRevision(
            dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(
                dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionRequest.class, 
                baseUrl, 
                "/v1/apis/{apiID}/version/{versionID}/schema/{revisionID}", 
                request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = dev.speakeasyapi.javaclientsdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");

        dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionResponse.Builder resBuilder = 
            dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.Schema out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<dev.speakeasyapi.javaclientsdk.models.shared.Schema>() {});
                res.withSchema(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<dev.speakeasyapi.javaclientsdk.models.shared.Error>() {});
                res.withError(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

    public dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasRequestBuilder getSchemas() {
        return new dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasRequestBuilder(this);
    }

    /**
     * Get information about all schemas associated with a particular apiID.
     * Returns information the schemas associated with a particular apiID. 
     * This won't include the schemas themselves, they can be retrieved via the downloadSchema operation.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasResponse getSchemas(
            dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(
                dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasRequest.class, 
                baseUrl, 
                "/v1/apis/{apiID}/version/{versionID}/schemas", 
                request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = dev.speakeasyapi.javaclientsdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");

        dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasResponse.Builder resBuilder = 
            dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.List<dev.speakeasyapi.javaclientsdk.models.shared.Schema> out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<java.util.List<dev.speakeasyapi.javaclientsdk.models.shared.Schema>>() {});
                res.withClasses(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<dev.speakeasyapi.javaclientsdk.models.shared.Error>() {});
                res.withError(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

    public dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaRequestBuilder registerSchema() {
        return new dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaRequestBuilder(this);
    }

    /**
     * Register a schema.
     * Allows uploading a schema for a particular API version.
     * This will be used to populate ApiEndpoints and used as a base for any schema generation if present.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaResponse registerSchema(
            dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(
                dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaRequest.class, 
                baseUrl, 
                "/v1/apis/{apiID}/version/{versionID}/schema", 
                request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.speakeasyapi.javaclientsdk.utils.Utils.serializeRequestBody(
                request, "requestBody", "multipart", false);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = dev.speakeasyapi.javaclientsdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");

        dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaResponse.Builder resBuilder = 
            dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
        }else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<dev.speakeasyapi.javaclientsdk.models.shared.Error>() {});
                res.withError(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

}
