package dev.speakeasyapi.javaclientsdk;

import dev.speakeasyapi.javaclientsdk.utils.HTTPClient;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import dev.speakeasyapi.javaclientsdk.utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.apache.http.NameValuePair;
import dev.speakeasyapi.javaclientsdk.models.operations.GetEmbedAccessTokenRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetEmbedAccessTokenResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.EmbedAccessTokenResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetValidEmbedAccessTokensResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.EmbedToken;
import dev.speakeasyapi.javaclientsdk.models.operations.RevokeEmbedAccessTokenRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.RevokeEmbedAccessTokenResponse;

public class Embeds {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverURL;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Embeds(HTTPClient defaultClient, HTTPClient securityClient, String serverURL, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverURL = serverURL;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * GetEmbedAccessToken - Get an embed access token for the current workspace.
     *
     * Returns an embed access token for the current workspace. This can be used to authenticate access to externally embedded content.
     * Filters can be applied allowing views to be filtered to things like particular customerIds.
    **/
    public GetEmbedAccessTokenResponse GetEmbedAccessToken(GetEmbedAccessTokenRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/workspace/embed-access-token");
        
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

        GetEmbedAccessTokenResponse res = new GetEmbedAccessTokenResponse();
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                res.embedAccessTokenResponse = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), EmbedAccessTokenResponse.class);
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
     * GetValidEmbedAccessTokens - Get all valid embed access tokens for the current workspace.
    **/
    public GetValidEmbedAccessTokensResponse GetValidEmbedAccessTokens() throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/workspace/embed-access-tokens/valid");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        GetValidEmbedAccessTokensResponse res = new GetValidEmbedAccessTokensResponse();
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                res.embedTokens = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), EmbedToken[].class);
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
     * RevokeEmbedAccessToken - Revoke an embed access EmbedToken.
    **/
    public RevokeEmbedAccessTokenResponse RevokeEmbedAccessToken(RevokeEmbedAccessTokenRequest request) throws Exception {
        String baseURL = this._serverURL;
        String url = Utils.generateURL(baseURL, "/v1/workspace/embed-access-tokens/{tokenID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        RevokeEmbedAccessTokenResponse res = new RevokeEmbedAccessTokenResponse();
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
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