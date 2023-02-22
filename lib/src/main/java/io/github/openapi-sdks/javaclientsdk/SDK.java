package io.github.openapi-sdks.javaclientsdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.openapi-sdks.javaclientsdk.utils.HTTPClient;
import io.github.openapi-sdks.javaclientsdk.utils.HTTPRequest;
import io.github.openapi-sdks.javaclientsdk.utils.JSON;
import io.github.openapi-sdks.javaclientsdk.utils.SpeakeasyHTTPClient;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

/** SDK Documentation: https://docs.speakeasyapi.dev - The Speakeasy Platform Documentation**/
public class SDK {
	public enum Servers {
		PROD("prod");

		public final String server;

		private Servers(String server) {
			this.server = server;
		}
	}

	public static final java.util.Map<Servers, String> SERVERS = new java.util.HashMap<Servers, String>() {{
		put(Servers.PROD, "https://api.prod.speakeasyapi.dev");
	}};
  	
  	public ApiEndpoints apiEndpoints;
  	public Apis apis;
  	public Embeds embeds;
  	public Metadata metadata;
  	public Plugins plugins;
  	public Requests requests;
  	public Schemas schemas;	

	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private io.github.openapi-sdks.javaclientsdk.models.shared.Security _security;
	private String _serverUrl;
	private String _language = "java";
	private String _sdkVersion = "1.4.8";
	private String _genVersion = "1.4.7";

	public static class Builder {
		private HTTPClient client;
		private io.github.openapi-sdks.javaclientsdk.models.shared.Security security;
		private String serverUrl;
		private java.util.Map<String, String> params = new java.util.HashMap<String, String>();

		private Builder() {
		}

		public Builder setClient(HTTPClient client) {
			this.client = client;
			return this;
		}
		
		public Builder setSecurity(io.github.openapi-sdks.javaclientsdk.models.shared.Security security) {
			this.security = security;
			return this;
		}
		
		public Builder setServerURL(String serverUrl) {
			this.serverUrl = serverUrl;
			return this;
		}
		
		public Builder setServerURL(String serverUrl, java.util.Map<String, String> params) {
			this.serverUrl = serverUrl;
			this.params = params;
			return this;
		}
		
		public Builder setServer(Servers server) {
			this.serverUrl = SERVERS.get(server);
			return this;
		}

		public Builder setServer(Servers server, java.util.Map<String, String> params) {
			this.serverUrl = SERVERS.get(server);
			this.params = params;
			return this;
		}
		
		public SDK build() throws Exception {
			return new SDK(this.client, this.security, this.serverUrl, this.params);
		}
	}

	public static Builder builder() {
		return new Builder();
	}

	private SDK(HTTPClient client, io.github.openapi-sdks.javaclientsdk.models.shared.Security security, String serverUrl, java.util.Map<String, String> params) throws Exception {
		this._defaultClient = client;
		
		if (this._defaultClient == null) {
			this._defaultClient = new SpeakeasyHTTPClient();
		}
		
		if (security != null) {
			this._security = security;
			this._securityClient = io.github.openapi-sdks.javaclientsdk.utils.Utils.configureSecurityClient(this._defaultClient, this._security);
		}
		
		if (this._securityClient == null) {
			this._securityClient = this._defaultClient;
		}

		if (serverUrl != null && !serverUrl.isBlank()) {
			this._serverUrl = io.github.openapi-sdks.javaclientsdk.utils.Utils.replaceParameters(serverUrl, params);
		}
		
		if (this._serverUrl == null) {
			this._serverUrl = SERVERS.get(Servers.PROD);
		}
		
		this.apiEndpoints = new ApiEndpoints(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.apis = new Apis(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.embeds = new Embeds(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.metadata = new Metadata(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.plugins = new Plugins(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.requests = new Requests(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.schemas = new Schemas(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
	}
    
    /**
     * validateApiKey - Validate the current api key.
    **/
    public io.github.openapi-sdks.javaclientsdk.models.operations.ValidateApiKeyResponse validateApiKey() throws Exception {
        String baseUrl = this._serverUrl;
        String url = io.github.openapi-sdks.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/auth/validate");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        io.github.openapi-sdks.javaclientsdk.models.operations.ValidateApiKeyResponse res = new io.github.openapi-sdks.javaclientsdk.models.operations.ValidateApiKeyResponse() {{
            error = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
        }
        else {
            if (io.github.openapi-sdks.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.openapi-sdks.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.openapi-sdks.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
}