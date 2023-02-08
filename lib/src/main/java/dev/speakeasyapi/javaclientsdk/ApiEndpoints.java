package dev.speakeasyapi.javaclientsdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.speakeasyapi.javaclientsdk.utils.HTTPClient;
import dev.speakeasyapi.javaclientsdk.utils.HTTPRequest;
import dev.speakeasyapi.javaclientsdk.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;

public class ApiEndpoints {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public ApiEndpoints(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
    
    /**
     * deleteApiEndpoint - Delete an ApiEndpoint.
     *
     * Delete an ApiEndpoint. This will also delete all associated Request Logs (if using a Postgres datastore).
    **/
    public dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiEndpointResponse deleteApiEndpoint(dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiEndpointRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiEndpointResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiEndpointResponse() {{
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
     * findApiEndpoint - Find an ApiEndpoint via its displayName.
     *
     * Find an ApiEndpoint via its displayName (set by operationId from a registered OpenAPI schema).
     * This is useful for finding the ID of an ApiEndpoint to use in the /v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID} endpoints.
    **/
    public dev.speakeasyapi.javaclientsdk.models.operations.FindApiEndpointResponse findApiEndpoint(dev.speakeasyapi.javaclientsdk.models.operations.FindApiEndpointRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/api_endpoints/find/{displayName}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.speakeasyapi.javaclientsdk.models.operations.FindApiEndpointResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.FindApiEndpointResponse() {{
            apiEndpoint = null;
            error = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint.class);
                res.apiEndpoint = out;
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
     * generateOpenApiSpecForApiEndpoint - Generate an OpenAPI specification for a particular ApiEndpoint.
     *
     * This endpoint will generate a new operation in any registered OpenAPI document if the operation does not already exist in the document.
     * Returns the original document and the newly generated document allowing a diff to be performed to see what has changed.
    **/
    public dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse generateOpenApiSpecForApiEndpoint(dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID}/generate/openapi", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse() {{
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
     * generatePostmanCollectionForApiEndpoint - Generate a Postman collection for a particular ApiEndpoint.
     *
     * Generates a postman collection that allows the endpoint to be called from postman variables produced for any path/query/header parameters included in the OpenAPI document.
    **/
    public dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse generatePostmanCollectionForApiEndpoint(dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID}/generate/postman", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse() {{
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
     * getAllApiEndpoints - Get all Api endpoints for a particular apiID.
    **/
    public dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiEndpointsResponse getAllApiEndpoints(dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiEndpointsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/api_endpoints", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiEndpointsResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiEndpointsResponse() {{
            apiEndpoints = null;
            error = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint[].class);
                res.apiEndpoints = out;
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
     * getAllForVersionApiEndpoints - Get all ApiEndpoints for a particular apiID and versionID.
    **/
    public dev.speakeasyapi.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse getAllForVersionApiEndpoints(dev.speakeasyapi.javaclientsdk.models.operations.GetAllForVersionApiEndpointsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/api_endpoints", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.speakeasyapi.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse() {{
            apiEndpoints = null;
            error = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint[].class);
                res.apiEndpoints = out;
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
     * getApiEndpoint - Get an ApiEndpoint.
    **/
    public dev.speakeasyapi.javaclientsdk.models.operations.GetApiEndpointResponse getApiEndpoint(dev.speakeasyapi.javaclientsdk.models.operations.GetApiEndpointRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.speakeasyapi.javaclientsdk.models.operations.GetApiEndpointResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.GetApiEndpointResponse() {{
            apiEndpoint = null;
            error = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint.class);
                res.apiEndpoint = out;
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
     * upsertApiEndpoint - Upsert an ApiEndpoint.
     *
     * Upsert an ApiEndpoint. If the ApiEndpoint does not exist it will be created, otherwise it will be updated.
    **/
    public dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiEndpointResponse upsertApiEndpoint(dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiEndpointRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID}", request.pathParams);
        
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

        dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiEndpointResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiEndpointResponse() {{
            apiEndpoint = null;
            error = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint.class);
                res.apiEndpoint = out;
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