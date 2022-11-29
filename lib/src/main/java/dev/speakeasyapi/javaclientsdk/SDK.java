

package dev.speakeasyapi.javaclientsdk;

import dev.speakeasyapi.javaclientsdk.utils.HTTPClient;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyHTTPClient;


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
  	public Requests requests;
  	public Schemas schemas;	

	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private dev.speakeasyapi.javaclientsdk.models.shared.Security _security;
	private String _serverUrl;
	private String _language = "java";
	private String _sdkVersion = "0.0.1";
	private String _genVersion = "internal";

	public static class Builder {
		private HTTPClient client;
		private dev.speakeasyapi.javaclientsdk.models.shared.Security security;
		private String serverUrl;
		private java.util.Map<String, String> params = new java.util.HashMap<String, String>();

		private Builder() {
		}

		public Builder setClient(HTTPClient client) {
			this.client = client;
			return this;
		}
		
		public Builder setSecurity(dev.speakeasyapi.javaclientsdk.models.shared.Security security) {
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

	private SDK(HTTPClient client, dev.speakeasyapi.javaclientsdk.models.shared.Security security, String serverUrl, java.util.Map<String, String> params) throws Exception {
		this._defaultClient = client;
		
		if (this._defaultClient == null) {
			this._defaultClient = new SpeakeasyHTTPClient();
		}
		
		if (security != null) {
			this._security = security;
			this._securityClient = dev.speakeasyapi.javaclientsdk.utils.Utils.configureSecurityClient(this._defaultClient, this._security);
		}
		
		if (this._securityClient == null) {
			this._securityClient = this._defaultClient;
		}

		if (serverUrl != null && !serverUrl.isBlank()) {
			this._serverUrl = dev.speakeasyapi.javaclientsdk.utils.Utils.replaceParameters(serverUrl, params);
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
	
}