package dev.speakeasyapi.javaclientsdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.speakeasyapi.javaclientsdk.utils.HTTPClient;
import dev.speakeasyapi.javaclientsdk.utils.HTTPRequest;
import dev.speakeasyapi.javaclientsdk.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.apache.http.NameValuePair;

public class Apis {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Apis(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
    
    /**
     * deleteApi - Delete an Api.
     *
     * Delete a particular version of an Api. The will also delete all associated ApiEndpoints, Metadata, Schemas & Request Logs (if using a Postgres datastore).
    **/
    public dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiResponse deleteApi(dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiResponse() {{
            error = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
        }
        else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
    
    /**
     * generateOpenApiSpec - Generate an OpenAPI specification for a particular Api.
     *
     * This endpoint will generate any missing operations in any registered OpenAPI document if the operation does not already exist in the document.
     * Returns the original document and the newly generated document allowing a diff to be performed to see what has changed.
    **/
    public dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecResponse generateOpenApiSpec(dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/generate/openapi", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecResponse() {{
            generateOpenApiSpecDiff = null;
            error = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.javaclientsdk.models.shared.GenerateOpenApiSpecDiff out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.GenerateOpenApiSpecDiff.class);
                res.generateOpenApiSpecDiff = out;
            }
        }
        else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
    
    /**
     * generatePostmanCollection - Generate a Postman collection for a particular Api.
     *
     * Generates a postman collection containing all endpoints for a particular API. Includes variables produced for any path/query/header parameters included in the OpenAPI document.
    **/
    public dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionResponse generatePostmanCollection(dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/generate/postman", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionResponse() {{
            postmanCollection = null;
            error = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/octet-stream")) {
                byte[] out = httpRes.body();
                res.postmanCollection = out;
            }
        }
        else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
    
    /**
     * getAllApiVersions - Get all Api versions for a particular ApiEndpoint.
     *
     * Get all Api versions for a particular ApiEndpoint.
     * Supports filtering the versions based on metadata attributes.
    **/
    public dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsResponse getAllApiVersions(dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        java.util.List<NameValuePair> queryParams = dev.speakeasyapi.javaclientsdk.utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsResponse() {{
            apis = null;
            error = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.javaclientsdk.models.shared.Api[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.Api[].class);
                res.apis = out;
            }
        }
        else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
    
    /**
     * getApis - Get a list of Apis for a given workspace
     *
     * Get a list of all Apis and their versions for a given workspace.
     * Supports filtering the APIs based on metadata attributes.
    **/
    public dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse getApis(dev.speakeasyapi.javaclientsdk.models.operations.GetApisRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        java.util.List<NameValuePair> queryParams = dev.speakeasyapi.javaclientsdk.utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse() {{
            apis = null;
            error = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.javaclientsdk.models.shared.Api[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.Api[].class);
                res.apis = out;
            }
        }
        else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
    
    /**
     * upsertApi - Upsert an Api
     *
     * Upsert an Api. If the Api does not exist, it will be created.
     * If the Api exists, it will be updated.
    **/
    public dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiResponse upsertApi(dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.speakeasyapi.javaclientsdk.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiResponse() {{
            api = null;
            error = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.javaclientsdk.models.shared.Api out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.Api.class);
                res.api = out;
            }
        }
        else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
}