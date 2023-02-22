package io.github.openapi_sdks.javaclientsdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.openapi_sdks.javaclientsdk.utils.HTTPClient;
import io.github.openapi_sdks.javaclientsdk.utils.HTTPRequest;
import io.github.openapi_sdks.javaclientsdk.utils.JSON;
import io.github.openapi_sdks.javaclientsdk.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;

public class Metadata {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Metadata(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
    
    /**
     * deleteVersionMetadata - Delete metadata for a particular apiID and versionID.
    **/
    public io.github.openapi_sdks.javaclientsdk.models.operations.DeleteVersionMetadataResponse deleteVersionMetadata(io.github.openapi_sdks.javaclientsdk.models.operations.DeleteVersionMetadataRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi_sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/metadata/{metaKey}/{metaValue}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        io.github.openapi_sdks.javaclientsdk.models.operations.DeleteVersionMetadataResponse res = new io.github.openapi_sdks.javaclientsdk.models.operations.DeleteVersionMetadataResponse() {{
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
     * getVersionMetadata - Get all metadata for a particular apiID and versionID.
    **/
    public io.github.openapi_sdks.javaclientsdk.models.operations.GetVersionMetadataResponse getVersionMetadata(io.github.openapi_sdks.javaclientsdk.models.operations.GetVersionMetadataRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi_sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/metadata", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        io.github.openapi_sdks.javaclientsdk.models.operations.GetVersionMetadataResponse res = new io.github.openapi_sdks.javaclientsdk.models.operations.GetVersionMetadataResponse() {{
            versionMetadata = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (io.github.openapi_sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi_sdks.javaclientsdk.models.shared.VersionMetadata[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi_sdks.javaclientsdk.models.shared.VersionMetadata[].class);
                res.versionMetadata = out;
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
     * insertVersionMetadata - Insert metadata for a particular apiID and versionID.
    **/
    public io.github.openapi_sdks.javaclientsdk.models.operations.InsertVersionMetadataResponse insertVersionMetadata(io.github.openapi_sdks.javaclientsdk.models.operations.InsertVersionMetadataRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi_sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/metadata", request.pathParams);
        
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

        io.github.openapi_sdks.javaclientsdk.models.operations.InsertVersionMetadataResponse res = new io.github.openapi_sdks.javaclientsdk.models.operations.InsertVersionMetadataResponse() {{
            versionMetadata = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (io.github.openapi_sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi_sdks.javaclientsdk.models.shared.VersionMetadata out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi_sdks.javaclientsdk.models.shared.VersionMetadata.class);
                res.versionMetadata = out;
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