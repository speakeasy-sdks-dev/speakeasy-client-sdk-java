package dev.speakeasyapi.javaclientsdk;

import dev.speakeasyapi.javaclientsdk.utils.HTTPClient;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import dev.speakeasyapi.javaclientsdk.utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import dev.speakeasyapi.javaclientsdk.utils.SerializedBody;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaResponse;
import dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionResponse;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Schema;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.SchemaDiff;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionResponse;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasResponse;
import dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaResponse;

public class Schemas {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverURL;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Schemas(HTTPClient defaultClient, HTTPClient securityClient, String serverURL, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverURL = serverURL;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * DeleteSchema - Delete a particular schema revision for an Api.
    **/
    public DeleteSchemaResponse DeleteSchema(DeleteSchemaRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/apis/{apiID}/version/{versionID}/schema/{revisionID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        DeleteSchemaResponse res = new DeleteSchemaResponse();
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
     * DownloadSchema - Download the latest schema for a particular apiID.
    **/
    public DownloadSchemaResponse DownloadSchema(DownloadSchemaRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/apis/{apiID}/version/{versionID}/schema/download", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        DownloadSchemaResponse res = new DownloadSchemaResponse();
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.schema = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), byte[].class);
            }
            if (Utils.matchContentType(contentType, "application/x-yaml")) {
                res.schema = httpRes.body();
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
     * DownloadSchemaRevision - Download a particular schema revision for an Api.
    **/
    public DownloadSchemaRevisionResponse DownloadSchemaRevision(DownloadSchemaRevisionRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/apis/{apiID}/version/{versionID}/schema/{revisionID}/download", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        DownloadSchemaRevisionResponse res = new DownloadSchemaRevisionResponse();
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.schema = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), byte[].class);
            }
            if (Utils.matchContentType(contentType, "application/x-yaml")) {
                res.schema = httpRes.body();
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
     * GetSchema - Get information about the latest schema.
     *
     * Returns information about the last uploaded schema for a particular API version. 
     * This won't include the schema itself, that can be retrieved via the downloadSchema operation.
    **/
    public GetSchemaResponse GetSchema(GetSchemaRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/apis/{apiID}/version/{versionID}/schema", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        GetSchemaResponse res = new GetSchemaResponse();
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.schema = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Schema.class);
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
     * GetSchemaDiff - Get a diff of two schema revisions for an Api.
    **/
    public GetSchemaDiffResponse GetSchemaDiff(GetSchemaDiffRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/apis/{apiID}/version/{versionID}/schema/{baseRevisionID}/diff/{targetRevisionID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        GetSchemaDiffResponse res = new GetSchemaDiffResponse();
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.schemaDiff = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), SchemaDiff.class);
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
     * GetSchemaRevision - Get information about a particular schema revision for an Api.
     *
     * Returns information about the last uploaded schema for a particular schema revision. 
     * This won't include the schema itself, that can be retrieved via the downloadSchema operation.
    **/
    public GetSchemaRevisionResponse GetSchemaRevision(GetSchemaRevisionRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/apis/{apiID}/version/{versionID}/schema/{revisionID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        GetSchemaRevisionResponse res = new GetSchemaRevisionResponse();
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.schema = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Schema.class);
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
     * GetSchemas - Get information about all schemas associated with a particular apiID.
     *
     * Returns information the schemas associated with a particular apiID. 
     * This won't include the schemas themselves, they can be retrieved via the downloadSchema operation.
    **/
    public GetSchemasResponse GetSchemas(GetSchemasRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/apis/{apiID}/version/{versionID}/schemas", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        GetSchemasResponse res = new GetSchemasResponse();
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.schemata = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Schema[].class);
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
     * RegisterSchema - Register a schema.
     *
     * Allows uploading a schema for a particular API version.
     * This will be used to populate ApiEndpoints and used as a base for any schema generation if present.
    **/
    public RegisterSchemaResponse RegisterSchema(RegisterSchemaRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/apis/{apiID}/version/{versionID}/schema", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
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

        RegisterSchemaResponse res = new RegisterSchemaResponse();
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
	
}