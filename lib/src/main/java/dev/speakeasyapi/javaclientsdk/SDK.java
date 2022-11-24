package dev.speakeasyapi.javaclientsdk;

import java.util.Map;
import java.util.HashMap;
import dev.speakeasyapi.javaclientsdk.utils.HTTPClient;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyHTTPClient;
import dev.speakeasyapi.javaclientsdk.utils.Utils;

import dev.speakeasyapi.javaclientsdk.models.shared.Security;

/** SDK Documentation: https://docs.speakeasyapi.dev - The Speakeasy Platform Documentation**/
public class SDK {
	public enum Servers {
		ServerProd("prod");

		public final String server;

		private Servers(String server) {
			this.server = server;
		}
	}

	public static final Map<Servers, String> SERVERS = new HashMap<Servers, String>() {{
		put(Servers.ServerProd, "https://api.prod.speakeasyapi.dev");
	}};
  	
  	public ApiEndpoints apiEndpoints;
  	public Apis apis;
  	public Embeds embeds;
  	public Metadata metadata;
  	public Requests requests;
  	public Schemas schemas;	

	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private Security _security;
	private String _serverURL;
	private String _language = "java";
	private String _sdkVersion = "0.0.1";
	private String _genVersion = "internal";

	public static class Builder {
		private HTTPClient client;
		private Security security;
		private String serverURL;
		private Map<String, String> params = new HashMap<String, String>();

		private Builder() {
		}

		public void setClient(HTTPClient client) {
			this.client = client;
		}
		
		public void setSecurity(Security security) {
			this.security = security;
		}
		
		public void setServerURL(String serverURL) {
			this.serverURL = serverURL;
		}
		
		public void setServerURL(String serverURL, Map<String, String> params) {
			this.serverURL = serverURL;
			this.params = params;
		}
		
		public void setServer(Servers server) {
			this.serverURL = SERVERS.get(server);
		}

		public void setServer(Servers server, Map<String, String> params) {
			this.serverURL = SERVERS.get(server);
			this.params = params;
		}
		
		public SDK build() throws Exception {
			return new SDK(this.client, this.security, this.serverURL, this.params);
		}
	}

	public static Builder builder() {
		return new Builder();
	}

	private SDK(HTTPClient client, Security security, String serverURL, Map<String, String> params) throws Exception {
		this._defaultClient = client;
		
		if (this._defaultClient == null) {
			this._defaultClient = new SpeakeasyHTTPClient();
		}
		
		if (security != null) {
			this._security = security;
			this._securityClient = Utils.configureSecurityClient(this._defaultClient, this._security);
		}
		
		if (this._securityClient == null) {
			this._securityClient = this._defaultClient;
		}

		if (serverURL != null && !serverURL.isBlank()) {
			this._serverURL = Utils.replaceParameters(serverURL, params);
		}
		
		if (this._serverURL == null) {
			this._serverURL = SERVERS.get(Servers.ServerProd);
		}
		
		this.apiEndpoints = new ApiEndpoints(
			this._defaultClient,
			this._securityClient,
			this._serverURL,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.apis = new Apis(
			this._defaultClient,
			this._securityClient,
			this._serverURL,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.embeds = new Embeds(
			this._defaultClient,
			this._securityClient,
			this._serverURL,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.metadata = new Metadata(
			this._defaultClient,
			this._securityClient,
			this._serverURL,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.requests = new Requests(
			this._defaultClient,
			this._securityClient,
			this._serverURL,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.schemas = new Schemas(
			this._defaultClient,
			this._securityClient,
			this._serverURL,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
	}
}

