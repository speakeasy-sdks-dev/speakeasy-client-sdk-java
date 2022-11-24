package dev.speakeasyapi.javaclientsdk;

import dev.speakeasyapi.javaclientsdk.utils.HTTPClient;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import dev.speakeasyapi.javaclientsdk.utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import dev.speakeasyapi.javaclientsdk.utils.SerializedBody;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.VersionMetadata;
import dev.speakeasyapi.javaclientsdk.models.operations.InsertVersionMetadataRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.InsertVersionMetadataResponse;

public class Metadata {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverURL;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Metadata(HTTPClient defaultClient, HTTPClient securityClient, String serverURL, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverURL = serverURL;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * DeleteVersionMetadata - Delete metadata for a particular apiID and versionID.
    **/
    public DeleteVersionMetadataResponse DeleteVersionMetadata(DeleteVersionMetadataRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/apis/{apiID}/version/{versionID}/metadata/{metaKey}/{metaValue}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        DeleteVersionMetadataResponse res = new DeleteVersionMetadataResponse();
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
     * GetVersionMetadata - Get all metadata for a particular apiID and versionID.
    **/
    public GetVersionMetadataResponse GetVersionMetadata(GetVersionMetadataRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/apis/{apiID}/version/{versionID}/metadata", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        GetVersionMetadataResponse res = new GetVersionMetadataResponse();
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.versionMetadata = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), VersionMetadata[].class);
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
     * InsertVersionMetadata - Insert metadata for a particular apiID and versionID.
    **/
    public InsertVersionMetadataResponse InsertVersionMetadata(InsertVersionMetadataRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/apis/{apiID}/version/{versionID}/metadata", request.pathParams);
        
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

        InsertVersionMetadataResponse res = new InsertVersionMetadataResponse();
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                res.versionMetadata = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), VersionMetadata.class);
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