package io.github.openapi-sdks.javaclientsdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.openapi-sdks.javaclientsdk.utils.HTTPClient;
import io.github.openapi-sdks.javaclientsdk.utils.HTTPRequest;
import io.github.openapi-sdks.javaclientsdk.utils.JSON;
import io.github.openapi-sdks.javaclientsdk.utils.SerializedBody;
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
    public io.github.openapi-sdks.javaclientsdk.models.operations.DeleteApiEndpointResponse deleteApiEndpoint(io.github.openapi-sdks.javaclientsdk.models.operations.DeleteApiEndpointRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi-sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        io.github.openapi-sdks.javaclientsdk.models.operations.DeleteApiEndpointResponse res = new io.github.openapi-sdks.javaclientsdk.models.operations.DeleteApiEndpointResponse() {{
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
        }
        else {
            if (io.github.openapi-sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi-sdks.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi-sdks.javaclientsdk.models.shared.Error.class);
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
    public io.github.openapi-sdks.javaclientsdk.models.operations.FindApiEndpointResponse findApiEndpoint(io.github.openapi-sdks.javaclientsdk.models.operations.FindApiEndpointRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi-sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/api_endpoints/find/{displayName}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        io.github.openapi-sdks.javaclientsdk.models.operations.FindApiEndpointResponse res = new io.github.openapi-sdks.javaclientsdk.models.operations.FindApiEndpointResponse() {{
            apiEndpoint = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (io.github.openapi-sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi-sdks.javaclientsdk.models.shared.ApiEndpoint out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi-sdks.javaclientsdk.models.shared.ApiEndpoint.class);
                res.apiEndpoint = out;
            }
        }
        else {
            if (io.github.openapi-sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi-sdks.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi-sdks.javaclientsdk.models.shared.Error.class);
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
    public io.github.openapi-sdks.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse generateOpenApiSpecForApiEndpoint(io.github.openapi-sdks.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi-sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID}/generate/openapi", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        io.github.openapi-sdks.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse res = new io.github.openapi-sdks.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse() {{
            generateOpenApiSpecDiff = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (io.github.openapi-sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi-sdks.javaclientsdk.models.shared.GenerateOpenApiSpecDiff out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi-sdks.javaclientsdk.models.shared.GenerateOpenApiSpecDiff.class);
                res.generateOpenApiSpecDiff = out;
            }
        }
        else {
            if (io.github.openapi-sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi-sdks.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi-sdks.javaclientsdk.models.shared.Error.class);
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
    public io.github.openapi-sdks.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse generatePostmanCollectionForApiEndpoint(io.github.openapi-sdks.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi-sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID}/generate/postman", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        io.github.openapi-sdks.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse res = new io.github.openapi-sdks.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse() {{
            postmanCollection = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (io.github.openapi-sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/octet-stream")) {
                byte[] out = httpRes.body();
                res.postmanCollection = out;
            }
        }
        else {
            if (io.github.openapi-sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi-sdks.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi-sdks.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
    
    /**
     * getAllApiEndpoints - Get all Api endpoints for a particular apiID.
    **/
    public io.github.openapi-sdks.javaclientsdk.models.operations.GetAllApiEndpointsResponse getAllApiEndpoints(io.github.openapi-sdks.javaclientsdk.models.operations.GetAllApiEndpointsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi-sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/api_endpoints", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        io.github.openapi-sdks.javaclientsdk.models.operations.GetAllApiEndpointsResponse res = new io.github.openapi-sdks.javaclientsdk.models.operations.GetAllApiEndpointsResponse() {{
            apiEndpoints = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (io.github.openapi-sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi-sdks.javaclientsdk.models.shared.ApiEndpoint[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi-sdks.javaclientsdk.models.shared.ApiEndpoint[].class);
                res.apiEndpoints = out;
            }
        }
        else {
            if (io.github.openapi-sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi-sdks.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi-sdks.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
    
    /**
     * getAllForVersionApiEndpoints - Get all ApiEndpoints for a particular apiID and versionID.
    **/
    public io.github.openapi-sdks.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse getAllForVersionApiEndpoints(io.github.openapi-sdks.javaclientsdk.models.operations.GetAllForVersionApiEndpointsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi-sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/api_endpoints", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        io.github.openapi-sdks.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse res = new io.github.openapi-sdks.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse() {{
            apiEndpoints = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (io.github.openapi-sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi-sdks.javaclientsdk.models.shared.ApiEndpoint[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi-sdks.javaclientsdk.models.shared.ApiEndpoint[].class);
                res.apiEndpoints = out;
            }
        }
        else {
            if (io.github.openapi-sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi-sdks.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi-sdks.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
    
    /**
     * getApiEndpoint - Get an ApiEndpoint.
    **/
    public io.github.openapi-sdks.javaclientsdk.models.operations.GetApiEndpointResponse getApiEndpoint(io.github.openapi-sdks.javaclientsdk.models.operations.GetApiEndpointRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi-sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        io.github.openapi-sdks.javaclientsdk.models.operations.GetApiEndpointResponse res = new io.github.openapi-sdks.javaclientsdk.models.operations.GetApiEndpointResponse() {{
            apiEndpoint = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (io.github.openapi-sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi-sdks.javaclientsdk.models.shared.ApiEndpoint out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi-sdks.javaclientsdk.models.shared.ApiEndpoint.class);
                res.apiEndpoint = out;
            }
        }
        else {
            if (io.github.openapi-sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi-sdks.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi-sdks.javaclientsdk.models.shared.Error.class);
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
    public io.github.openapi-sdks.javaclientsdk.models.operations.UpsertApiEndpointResponse upsertApiEndpoint(io.github.openapi-sdks.javaclientsdk.models.operations.UpsertApiEndpointRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi-sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = io.github.openapi-sdks.javaclientsdk.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        io.github.openapi-sdks.javaclientsdk.models.operations.UpsertApiEndpointResponse res = new io.github.openapi-sdks.javaclientsdk.models.operations.UpsertApiEndpointResponse() {{
            apiEndpoint = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (io.github.openapi-sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi-sdks.javaclientsdk.models.shared.ApiEndpoint out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi-sdks.javaclientsdk.models.shared.ApiEndpoint.class);
                res.apiEndpoint = out;
            }
        }
        else {
            if (io.github.openapi-sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi-sdks.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi-sdks.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
}