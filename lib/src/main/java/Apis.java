package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import .utils.JSON;
import .utils.SerializedBody;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    public .models.operations.DeleteApiResponse deleteApi(.models.operations.DeleteApiRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        .models.operations.DeleteApiResponse res = new .models.operations.DeleteApiResponse() {{
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
        }
        else {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.Error.class);
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
    public .models.operations.GenerateOpenApiSpecResponse generateOpenApiSpec(.models.operations.GenerateOpenApiSpecRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/generate/openapi", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        .models.operations.GenerateOpenApiSpecResponse res = new .models.operations.GenerateOpenApiSpecResponse() {{
            generateOpenApiSpecDiff = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.GenerateOpenApiSpecDiff out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.GenerateOpenApiSpecDiff.class);
                res.generateOpenApiSpecDiff = out;
            }
        }
        else {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.Error.class);
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
    public .models.operations.GeneratePostmanCollectionResponse generatePostmanCollection(.models.operations.GeneratePostmanCollectionRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/generate/postman", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        .models.operations.GeneratePostmanCollectionResponse res = new .models.operations.GeneratePostmanCollectionResponse() {{
            postmanCollection = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/octet-stream")) {
                byte[] out = httpRes.body();
                res.postmanCollection = out;
            }
        }
        else {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.Error.class);
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
    public .models.operations.GetAllApiVersionsResponse getAllApiVersions(.models.operations.GetAllApiVersionsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = .utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        .models.operations.GetAllApiVersionsResponse res = new .models.operations.GetAllApiVersionsResponse() {{
            apis = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.Api[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.Api[].class);
                res.apis = out;
            }
        }
        else {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.Error.class);
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
    public .models.operations.GetApisResponse getApis(.models.operations.GetApisRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/apis");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = .utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        .models.operations.GetApisResponse res = new .models.operations.GetApisResponse() {{
            apis = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.Api[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.Api[].class);
                res.apis = out;
            }
        }
        else {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.Error.class);
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
    public .models.operations.UpsertApiResponse upsertApi(.models.operations.UpsertApiRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        .models.operations.UpsertApiResponse res = new .models.operations.UpsertApiResponse() {{
            api = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.Api out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.Api.class);
                res.api = out;
            }
        }
        else {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
}