package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import .utils.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class Embeds {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Embeds(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
    
    /**
     * getEmbedAccessToken - Get an embed access token for the current workspace.
     *
     * Returns an embed access token for the current workspace. This can be used to authenticate access to externally embedded content.
     * Filters can be applied allowing views to be filtered to things like particular customerIds.
    **/
    public .models.operations.GetEmbedAccessTokenResponse getEmbedAccessToken(.models.operations.GetEmbedAccessTokenRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/workspace/embed-access-token");
        
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

        .models.operations.GetEmbedAccessTokenResponse res = new .models.operations.GetEmbedAccessTokenResponse() {{
            embedAccessTokenResponse = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.EmbedAccessTokenResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.EmbedAccessTokenResponse.class);
                res.embedAccessTokenResponse = out;
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
     * getValidEmbedAccessTokens - Get all valid embed access tokens for the current workspace.
    **/
    public .models.operations.GetValidEmbedAccessTokensResponse getValidEmbedAccessTokens() throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/workspace/embed-access-tokens/valid");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        .models.operations.GetValidEmbedAccessTokensResponse res = new .models.operations.GetValidEmbedAccessTokensResponse() {{
            embedTokens = null;
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.EmbedToken[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.EmbedToken[].class);
                res.embedTokens = out;
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
     * revokeEmbedAccessToken - Revoke an embed access EmbedToken.
    **/
    public .models.operations.RevokeEmbedAccessTokenResponse revokeEmbedAccessToken(.models.operations.RevokeEmbedAccessTokenRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/workspace/embed-access-tokens/{tokenID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        .models.operations.RevokeEmbedAccessTokenResponse res = new .models.operations.RevokeEmbedAccessTokenResponse() {{
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
}