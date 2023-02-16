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
    public .models.operations.GetPluginsResponse getPlugins() throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/plugins");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        .models.operations.GetPluginsResponse res = new .models.operations.GetPluginsResponse() {{
            plugins = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.Plugin[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.Plugin[].class);
                res.plugins = out;
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
     * runPlugin - Run a plugin
    **/
    public .models.operations.RunPluginResponse runPlugin(.models.operations.RunPluginRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/plugins/{pluginID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
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

        .models.operations.RunPluginResponse res = new .models.operations.RunPluginResponse() {{
            boundedRequests = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.BoundedRequest[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.BoundedRequest[].class);
                res.boundedRequests = out;
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
     * upsertPlugin - Upsert a plugin
    **/
    public .models.operations.UpsertPluginResponse upsertPlugin(.models.operations.UpsertPluginRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/plugins");
        
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

        .models.operations.UpsertPluginResponse res = new .models.operations.UpsertPluginResponse() {{
            plugin = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.Plugin out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.Plugin.class);
                res.plugin = out;
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