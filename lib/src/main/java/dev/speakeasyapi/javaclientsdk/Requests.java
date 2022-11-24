package dev.speakeasyapi.javaclientsdk;

import dev.speakeasyapi.javaclientsdk.utils.HTTPClient;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import dev.speakeasyapi.javaclientsdk.utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.apache.http.NameValuePair;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.UnboundedRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.BoundedRequest;

public class Requests {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverURL;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Requests(HTTPClient defaultClient, HTTPClient securityClient, String serverURL, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverURL = serverURL;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * GenerateRequestPostmanCollection - Generate a Postman collection for a particular request.
     *
     * Generates a Postman collection for a particular request. 
     * Allowing it to be replayed with the same inputs that were captured by the SDK.
    **/
    public GenerateRequestPostmanCollectionResponse GenerateRequestPostmanCollection(GenerateRequestPostmanCollectionRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/eventlog/{requestID}/generate/postman", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        GenerateRequestPostmanCollectionResponse res = new GenerateRequestPostmanCollectionResponse();
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                res.postmanCollection = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), byte[].class);
            }
        }
        else {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                res.error = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Error.class);
            }
        }

        return res;
    }
	
	
    /**
     * GetRequestFromEventLog - Get information about a particular request.
    **/
    public GetRequestFromEventLogResponse GetRequestFromEventLog(GetRequestFromEventLogRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/eventlog/{requestID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        GetRequestFromEventLogResponse res = new GetRequestFromEventLogResponse();
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                res.unboundedRequest = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), UnboundedRequest.class);
            }
        }
        else {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                res.error = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Error.class);
            }
        }

        return res;
    }
	
	
    /**
     * QueryEventLog - Query the event log to retrieve a list of requests.
     *
     * Supports retrieving a list of request captured by the SDK for this workspace.
     * Allows the filtering of requests on a number of criteria such as ApiID, VersionID, Path, Method, etc.
    **/
    public QueryEventLogResponse QueryEventLog(QueryEventLogRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/eventlog/query");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        List<NameValuePair> queryParams = Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        QueryEventLogResponse res = new QueryEventLogResponse();
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                res.boundedRequests = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), BoundedRequest[].class);
            }
        }
        else {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                res.error = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Error.class);
            }
        }

        return res;
    }
	
}