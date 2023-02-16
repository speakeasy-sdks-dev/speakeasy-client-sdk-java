package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import .utils.JSON;
import .utils.SerializedBody;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    public .models.operations.DeleteVersionMetadataResponse deleteVersionMetadata(.models.operations.DeleteVersionMetadataRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/metadata/{metaKey}/{metaValue}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        .models.operations.DeleteVersionMetadataResponse res = new .models.operations.DeleteVersionMetadataResponse() {{
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
     * getVersionMetadata - Get all metadata for a particular apiID and versionID.
    **/
    public .models.operations.GetVersionMetadataResponse getVersionMetadata(.models.operations.GetVersionMetadataRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/metadata", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        .models.operations.GetVersionMetadataResponse res = new .models.operations.GetVersionMetadataResponse() {{
            versionMetadata = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.VersionMetadata[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.VersionMetadata[].class);
                res.versionMetadata = out;
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
     * insertVersionMetadata - Insert metadata for a particular apiID and versionID.
    **/
    public .models.operations.InsertVersionMetadataResponse insertVersionMetadata(.models.operations.InsertVersionMetadataRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/metadata", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        .models.operations.InsertVersionMetadataResponse res = new .models.operations.InsertVersionMetadataResponse() {{
            versionMetadata = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.VersionMetadata out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.VersionMetadata.class);
                res.versionMetadata = out;
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