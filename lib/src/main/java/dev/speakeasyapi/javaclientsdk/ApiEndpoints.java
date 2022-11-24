package dev.speakeasyapi.javaclientsdk;

import dev.speakeasyapi.javaclientsdk.utils.HTTPClient;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import dev.speakeasyapi.javaclientsdk.utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import dev.speakeasyapi.javaclientsdk.utils.SerializedBody;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiEndpointResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.FindApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.FindApiEndpointResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.GenerateOpenApiSpecDiff;
import dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiEndpointsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiEndpointsResponse;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllForVersionApiEndpointsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApiEndpointResponse;
import dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiEndpointResponse;

public class ApiEndpoints {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverURL;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public ApiEndpoints(HTTPClient defaultClient, HTTPClient securityClient, String serverURL, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverURL = serverURL;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * DeleteApiEndpoint - Delete an ApiEndpoint.
     *
     * Delete an ApiEndpoint. This will also delete all associated Request Logs (if using a Postgres datastore).
    **/
    public DeleteApiEndpointResponse DeleteApiEndpoint(DeleteApiEndpointRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        DeleteApiEndpointResponse res = new DeleteApiEndpointResponse();
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
        }
        else {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.error = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Error.class);
            }
        }

        return res;
    }
	
	
    /**
     * FindApiEndpoint - Find an ApiEndpoint via its displayName.
     *
     * Find an ApiEndpoint via its displayName (set by operationId from a registered OpenAPI schema).
     * This is useful for finding the ID of an ApiEndpoint to use in the /v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID} endpoints.
    **/
    public FindApiEndpointResponse FindApiEndpoint(FindApiEndpointRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/apis/{apiID}/version/{versionID}/api_endpoints/find/{displayName}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        FindApiEndpointResponse res = new FindApiEndpointResponse();
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.apiEndpoint = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ApiEndpoint.class);
            }
        }
        else {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.error = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Error.class);
            }
        }

        return res;
    }
	
	
    /**
     * GenerateOpenApiSpecForApiEndpoint - Generate an OpenAPI specification for a particular ApiEndpoint.
     *
     * This endpoint will generate a new operation in any registered OpenAPI document if the operation does not already exist in the document.
     * Returns the original document and the newly generated document allowing a diff to be performed to see what has changed.
    **/
    public GenerateOpenApiSpecForApiEndpointResponse GenerateOpenApiSpecForApiEndpoint(GenerateOpenApiSpecForApiEndpointRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID}/generate/openapi", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        GenerateOpenApiSpecForApiEndpointResponse res = new GenerateOpenApiSpecForApiEndpointResponse();
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.generateOpenApiSpecDiff = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), GenerateOpenApiSpecDiff.class);
            }
        }
        else {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.error = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Error.class);
            }
        }

        return res;
    }
	
	
    /**
     * GeneratePostmanCollectionForApiEndpoint - Generate a Postman collection for a particular ApiEndpoint.
     *
     * Generates a postman collection that allows the endpoint to be called from postman variables produced for any path/query/header parameters included in the OpenAPI document.
    **/
    public GeneratePostmanCollectionForApiEndpointResponse GeneratePostmanCollectionForApiEndpoint(GeneratePostmanCollectionForApiEndpointRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID}/generate/postman", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        GeneratePostmanCollectionForApiEndpointResponse res = new GeneratePostmanCollectionForApiEndpointResponse();
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.postmanCollection = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), byte[].class);
            }
        }
        else {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.error = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Error.class);
            }
        }

        return res;
    }
	
	
    /**
     * GetAllApiEndpoints - Get all Api endpoints for a particular apiID.
    **/
    public GetAllApiEndpointsResponse GetAllApiEndpoints(GetAllApiEndpointsRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/apis/{apiID}/api_endpoints", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        GetAllApiEndpointsResponse res = new GetAllApiEndpointsResponse();
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.apiEndpoints = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ApiEndpoint[].class);
            }
        }
        else {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.error = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Error.class);
            }
        }

        return res;
    }
	
	
    /**
     * GetAllForVersionApiEndpoints - Get all ApiEndpoints for a particular apiID and versionID.
    **/
    public GetAllForVersionApiEndpointsResponse GetAllForVersionApiEndpoints(GetAllForVersionApiEndpointsRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/apis/{apiID}/version/{versionID}/api_endpoints", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        GetAllForVersionApiEndpointsResponse res = new GetAllForVersionApiEndpointsResponse();
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.apiEndpoints = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ApiEndpoint[].class);
            }
        }
        else {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.error = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Error.class);
            }
        }

        return res;
    }
	
	
    /**
     * GetApiEndpoint - Get an ApiEndpoint.
    **/
    public GetApiEndpointResponse GetApiEndpoint(GetApiEndpointRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        GetApiEndpointResponse res = new GetApiEndpointResponse();
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.apiEndpoint = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ApiEndpoint.class);
            }
        }
        else {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.error = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Error.class);
            }
        }

        return res;
    }
	
	
    /**
     * UpsertApiEndpoint - Upsert an ApiEndpoint.
     *
     * Upsert an ApiEndpoint. If the ApiEndpoint does not exist it will be created, otherwise it will be updated.
    **/
    public UpsertApiEndpointResponse UpsertApiEndpoint(UpsertApiEndpointRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        UpsertApiEndpointResponse res = new UpsertApiEndpointResponse();
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.apiEndpoint = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ApiEndpoint.class);
            }
        }
        else {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.error = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Error.class);
            }
        }

        return res;
    }
	
}