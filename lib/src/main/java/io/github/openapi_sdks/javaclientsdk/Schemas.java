package io.github.openapi_sdks.javaclientsdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.openapi_sdks.javaclientsdk.utils.HTTPClient;
import io.github.openapi_sdks.javaclientsdk.utils.HTTPRequest;
import io.github.openapi_sdks.javaclientsdk.utils.JSON;
import io.github.openapi_sdks.javaclientsdk.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;

public class Schemas {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Schemas(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
    
    /**
     * deleteSchema - Delete a particular schema revision for an Api.
    **/
    public io.github.openapi_sdks.javaclientsdk.models.operations.DeleteSchemaResponse deleteSchema(io.github.openapi_sdks.javaclientsdk.models.operations.DeleteSchemaRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi_sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/schema/{revisionID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        io.github.openapi_sdks.javaclientsdk.models.operations.DeleteSchemaResponse res = new io.github.openapi_sdks.javaclientsdk.models.operations.DeleteSchemaResponse() {{
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
        }
        else {
            if (io.github.openapi_sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi_sdks.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi_sdks.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
    
    /**
     * downloadSchema - Download the latest schema for a particular apiID.
    **/
    public io.github.openapi_sdks.javaclientsdk.models.operations.DownloadSchemaResponse downloadSchema(io.github.openapi_sdks.javaclientsdk.models.operations.DownloadSchemaRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi_sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/schema/download", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        io.github.openapi_sdks.javaclientsdk.models.operations.DownloadSchemaResponse res = new io.github.openapi_sdks.javaclientsdk.models.operations.DownloadSchemaResponse() {{
            schema = null;
            schema = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (io.github.openapi_sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                byte[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), byte[].class);
                res.schema = out;
            }
            if (io.github.openapi_sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/x-yaml")) {
                byte[] out = httpRes.body();
                res.schema = out;
            }
        }
        else {
            if (io.github.openapi_sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi_sdks.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi_sdks.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
    
    /**
     * downloadSchemaRevision - Download a particular schema revision for an Api.
    **/
    public io.github.openapi_sdks.javaclientsdk.models.operations.DownloadSchemaRevisionResponse downloadSchemaRevision(io.github.openapi_sdks.javaclientsdk.models.operations.DownloadSchemaRevisionRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi_sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/schema/{revisionID}/download", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        io.github.openapi_sdks.javaclientsdk.models.operations.DownloadSchemaRevisionResponse res = new io.github.openapi_sdks.javaclientsdk.models.operations.DownloadSchemaRevisionResponse() {{
            schema = null;
            schema = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (io.github.openapi_sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                byte[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), byte[].class);
                res.schema = out;
            }
            if (io.github.openapi_sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/x-yaml")) {
                byte[] out = httpRes.body();
                res.schema = out;
            }
        }
        else {
            if (io.github.openapi_sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi_sdks.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi_sdks.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
    
    /**
     * getSchema - Get information about the latest schema.
     *
     * Returns information about the last uploaded schema for a particular API version. 
     * This won't include the schema itself, that can be retrieved via the downloadSchema operation.
    **/
    public io.github.openapi_sdks.javaclientsdk.models.operations.GetSchemaResponse getSchema(io.github.openapi_sdks.javaclientsdk.models.operations.GetSchemaRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi_sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/schema", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        io.github.openapi_sdks.javaclientsdk.models.operations.GetSchemaResponse res = new io.github.openapi_sdks.javaclientsdk.models.operations.GetSchemaResponse() {{
            schema = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (io.github.openapi_sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi_sdks.javaclientsdk.models.shared.Schema out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi_sdks.javaclientsdk.models.shared.Schema.class);
                res.schema = out;
            }
        }
        else {
            if (io.github.openapi_sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi_sdks.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi_sdks.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
    
    /**
     * getSchemaDiff - Get a diff of two schema revisions for an Api.
    **/
    public io.github.openapi_sdks.javaclientsdk.models.operations.GetSchemaDiffResponse getSchemaDiff(io.github.openapi_sdks.javaclientsdk.models.operations.GetSchemaDiffRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi_sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/schema/{baseRevisionID}/diff/{targetRevisionID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        io.github.openapi_sdks.javaclientsdk.models.operations.GetSchemaDiffResponse res = new io.github.openapi_sdks.javaclientsdk.models.operations.GetSchemaDiffResponse() {{
            schemaDiff = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (io.github.openapi_sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi_sdks.javaclientsdk.models.shared.SchemaDiff out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi_sdks.javaclientsdk.models.shared.SchemaDiff.class);
                res.schemaDiff = out;
            }
        }
        else {
            if (io.github.openapi_sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi_sdks.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi_sdks.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
    
    /**
     * getSchemaRevision - Get information about a particular schema revision for an Api.
     *
     * Returns information about the last uploaded schema for a particular schema revision. 
     * This won't include the schema itself, that can be retrieved via the downloadSchema operation.
    **/
    public io.github.openapi_sdks.javaclientsdk.models.operations.GetSchemaRevisionResponse getSchemaRevision(io.github.openapi_sdks.javaclientsdk.models.operations.GetSchemaRevisionRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi_sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/schema/{revisionID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        io.github.openapi_sdks.javaclientsdk.models.operations.GetSchemaRevisionResponse res = new io.github.openapi_sdks.javaclientsdk.models.operations.GetSchemaRevisionResponse() {{
            schema = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (io.github.openapi_sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi_sdks.javaclientsdk.models.shared.Schema out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi_sdks.javaclientsdk.models.shared.Schema.class);
                res.schema = out;
            }
        }
        else {
            if (io.github.openapi_sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi_sdks.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi_sdks.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
    
    /**
     * getSchemas - Get information about all schemas associated with a particular apiID.
     *
     * Returns information the schemas associated with a particular apiID. 
     * This won't include the schemas themselves, they can be retrieved via the downloadSchema operation.
    **/
    public io.github.openapi_sdks.javaclientsdk.models.operations.GetSchemasResponse getSchemas(io.github.openapi_sdks.javaclientsdk.models.operations.GetSchemasRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi_sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/schemas", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        io.github.openapi_sdks.javaclientsdk.models.operations.GetSchemasResponse res = new io.github.openapi_sdks.javaclientsdk.models.operations.GetSchemasResponse() {{
            schemata = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (io.github.openapi_sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi_sdks.javaclientsdk.models.shared.Schema[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi_sdks.javaclientsdk.models.shared.Schema[].class);
                res.schemata = out;
            }
        }
        else {
            if (io.github.openapi_sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi_sdks.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi_sdks.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
    
    /**
     * registerSchema - Register a schema.
     *
     * Allows uploading a schema for a particular API version.
     * This will be used to populate ApiEndpoints and used as a base for any schema generation if present.
    **/
    public io.github.openapi_sdks.javaclientsdk.models.operations.RegisterSchemaResponse registerSchema(io.github.openapi_sdks.javaclientsdk.models.operations.RegisterSchemaRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi_sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/schema", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = io.github.openapi_sdks.javaclientsdk.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        io.github.openapi_sdks.javaclientsdk.models.operations.RegisterSchemaResponse res = new io.github.openapi_sdks.javaclientsdk.models.operations.RegisterSchemaResponse() {{
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
        }
        else {
            if (io.github.openapi_sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi_sdks.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi_sdks.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
}