package io.github.openapi_sdks.javaclientsdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.openapi_sdks.javaclientsdk.utils.HTTPClient;
import io.github.openapi_sdks.javaclientsdk.utils.HTTPRequest;
import io.github.openapi_sdks.javaclientsdk.utils.JSON;
import io.github.openapi_sdks.javaclientsdk.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.apache.http.NameValuePair;

public class Plugins {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Plugins(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
    
    /**
     * getPlugins - Get all plugins for the current workspace.
    **/
    public io.github.openapi_sdks.javaclientsdk.models.operations.GetPluginsResponse getPlugins() throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi_sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/plugins");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        io.github.openapi_sdks.javaclientsdk.models.operations.GetPluginsResponse res = new io.github.openapi_sdks.javaclientsdk.models.operations.GetPluginsResponse() {{
            plugins = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (io.github.openapi_sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi_sdks.javaclientsdk.models.shared.Plugin[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi_sdks.javaclientsdk.models.shared.Plugin[].class);
                res.plugins = out;
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
     * runPlugin - Run a plugin
    **/
    public io.github.openapi_sdks.javaclientsdk.models.operations.RunPluginResponse runPlugin(io.github.openapi_sdks.javaclientsdk.models.operations.RunPluginRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi_sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/plugins/{pluginID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        java.util.List<NameValuePair> queryParams = io.github.openapi_sdks.javaclientsdk.utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        io.github.openapi_sdks.javaclientsdk.models.operations.RunPluginResponse res = new io.github.openapi_sdks.javaclientsdk.models.operations.RunPluginResponse() {{
            boundedRequests = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (io.github.openapi_sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi_sdks.javaclientsdk.models.shared.BoundedRequest[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi_sdks.javaclientsdk.models.shared.BoundedRequest[].class);
                res.boundedRequests = out;
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
     * upsertPlugin - Upsert a plugin
    **/
    public io.github.openapi_sdks.javaclientsdk.models.operations.UpsertPluginResponse upsertPlugin(io.github.openapi_sdks.javaclientsdk.models.operations.UpsertPluginRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi_sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/plugins");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
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

        io.github.openapi_sdks.javaclientsdk.models.operations.UpsertPluginResponse res = new io.github.openapi_sdks.javaclientsdk.models.operations.UpsertPluginResponse() {{
            plugin = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (io.github.openapi_sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi_sdks.javaclientsdk.models.shared.Plugin out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi_sdks.javaclientsdk.models.shared.Plugin.class);
                res.plugin = out;
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
}