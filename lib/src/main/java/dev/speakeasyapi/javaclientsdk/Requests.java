package dev.speakeasyapi.javaclientsdk;

import dev.speakeasyapi.javaclientsdk.utils.HTTPClient;
import dev.speakeasyapi.javaclientsdk.utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class Requests {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Requests(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * generateRequestPostmanCollection - Generate a Postman collection for a particular request.
     *
     * Generates a Postman collection for a particular request. 
     * Allowing it to be replayed with the same inputs that were captured by the SDK.
    **/
    public dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionResponse generateRequestPostmanCollection(dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/eventlog/{requestID}/generate/postman", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionResponse() {{
            postmanCollection = java.util.Optional.empty();
            error = java.util.Optional.empty();
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                byte[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), byte[].class);
                res.postmanCollection = java.util.Optional.of(out);
            }
        }
        else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.Error.class);
                res.error = java.util.Optional.of(out);
            }
        }

        return res;
    }
	
	
    /**
     * getRequestFromEventLog - Get information about a particular request.
    **/
    public dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogResponse getRequestFromEventLog(dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/eventlog/{requestID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogResponse() {{
            unboundedRequest = java.util.Optional.empty();
            error = java.util.Optional.empty();
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.javaclientsdk.models.shared.UnboundedRequest out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.UnboundedRequest.class);
                res.unboundedRequest = java.util.Optional.of(out);
            }
        }
        else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.Error.class);
                res.error = java.util.Optional.of(out);
            }
        }

        return res;
    }
	
	
    /**
     * queryEventLog - Query the event log to retrieve a list of requests.
     *
     * Supports retrieving a list of request captured by the SDK for this workspace.
     * Allows the filtering of requests on a number of criteria such as ApiID, VersionID, Path, Method, etc.
    **/
    public dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogResponse queryEventLog(dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/eventlog/query");
        
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

        dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogResponse() {{
            boundedRequests = java.util.Optional.empty();
            error = java.util.Optional.empty();
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                java.util.List<dev.speakeasyapi.javaclientsdk.models.shared.BoundedRequest> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), java.util.List.class);
                res.boundedRequests = java.util.Optional.of(out);
            }
        }
        else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.Error.class);
                res.error = java.util.Optional.of(out);
            }
        }

        return res;
    }
	
}