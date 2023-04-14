# <no value>

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'dev.speakeasyapi.javaclientsdk:speakeasy-client-sdk-java:1.16.0'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisOp;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetApisRequest req = new GetApisRequest() {{
                metadata = new java.util.HashMap<String, String[]>() {{
                    put("provident", new String[]{{
                        add("quibusdam"),
                        add("unde"),
                        add("nulla"),
                    }});
                    put("corrupti", new String[]{{
                        add("vel"),
                        add("error"),
                        add("deserunt"),
                        add("suscipit"),
                    }});
                    put("iure", new String[]{{
                        add("debitis"),
                        add("ipsa"),
                    }});
                }};
                op = new GetApisOp() {{
                    and = false;
                }};
            }}            

            GetApisResponse res = sdk.apis.getApis(req);

            if (res.apis.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations

### SDK SDK

* `validateApiKey` - Validate the current api key.

### apiEndpoints

* `deleteApiEndpoint` - Delete an ApiEndpoint.
* `findApiEndpoint` - Find an ApiEndpoint via its displayName.
* `generateOpenApiSpecForApiEndpoint` - Generate an OpenAPI specification for a particular ApiEndpoint.
* `generatePostmanCollectionForApiEndpoint` - Generate a Postman collection for a particular ApiEndpoint.
* `getAllApiEndpoints` - Get all Api endpoints for a particular apiID.
* `getAllForVersionApiEndpoints` - Get all ApiEndpoints for a particular apiID and versionID.
* `getApiEndpoint` - Get an ApiEndpoint.
* `upsertApiEndpoint` - Upsert an ApiEndpoint.

### apis

* `deleteApi` - Delete an Api.
* `generateOpenApiSpec` - Generate an OpenAPI specification for a particular Api.
* `generatePostmanCollection` - Generate a Postman collection for a particular Api.
* `getAllApiVersions` - Get all Api versions for a particular ApiEndpoint.
* `getApis` - Get a list of Apis for a given workspace
* `upsertApi` - Upsert an Api

### embeds

* `getEmbedAccessToken` - Get an embed access token for the current workspace.
* `getValidEmbedAccessTokens` - Get all valid embed access tokens for the current workspace.
* `revokeEmbedAccessToken` - Revoke an embed access EmbedToken.

### metadata

* `deleteVersionMetadata` - Delete metadata for a particular apiID and versionID.
* `getVersionMetadata` - Get all metadata for a particular apiID and versionID.
* `insertVersionMetadata` - Insert metadata for a particular apiID and versionID.

### plugins

* `getPlugins` - Get all plugins for the current workspace.
* `runPlugin` - Run a plugin
* `upsertPlugin` - Upsert a plugin

### requests

* `generateRequestPostmanCollection` - Generate a Postman collection for a particular request.
* `getRequestFromEventLog` - Get information about a particular request.
* `queryEventLog` - Query the event log to retrieve a list of requests.

### schemas

* `deleteSchema` - Delete a particular schema revision for an Api.
* `downloadSchema` - Download the latest schema for a particular apiID.
* `downloadSchemaRevision` - Download a particular schema revision for an Api.
* `getSchema` - Get information about the latest schema.
* `getSchemaDiff` - Get a diff of two schema revisions for an Api.
* `getSchemaRevision` - Get information about a particular schema revision for an Api.
* `getSchemas` - Get information about all schemas associated with a particular apiID.
* `registerSchema` - Register a schema.
<!-- End SDK Available Operations -->

### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
