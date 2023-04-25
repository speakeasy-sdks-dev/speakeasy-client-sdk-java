# <no value>

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'dev.speakeasyapi.javaclientsdk:speakeasy-client-sdk-java:1.19.0'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisOp;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("corrupti") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetApisRequest req = new GetApisRequest() {{
                metadata = new java.util.HashMap<String, String[]>() {{
                    put("distinctio", new String[]{{
                        add("unde"),
                        add("nulla"),
                        add("corrupti"),
                        add("illum"),
                    }});
                    put("vel", new String[]{{
                        add("deserunt"),
                        add("suscipit"),
                        add("iure"),
                    }});
                    put("magnam", new String[]{{
                        add("ipsa"),
                        add("delectus"),
                        add("tempora"),
                        add("suscipit"),
                    }});
                }};
                op = new GetApisOp(false);;
            }};            

            GetApisResponse res = sdk.apis.getApis(req);

            if (res.apis != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations

### [SDK](docs/sdk/README.md)

* [validateApiKey](docs/sdk/validateapikey.md) - Validate the current api key.

### [apiEndpoints](docs/apiendpoints/README.md)

* [deleteApiEndpoint](docs/apiendpoints/deleteapiendpoint.md) - Delete an ApiEndpoint.
* [findApiEndpoint](docs/apiendpoints/findapiendpoint.md) - Find an ApiEndpoint via its displayName.
* [generateOpenApiSpecForApiEndpoint](docs/apiendpoints/generateopenapispecforapiendpoint.md) - Generate an OpenAPI specification for a particular ApiEndpoint.
* [generatePostmanCollectionForApiEndpoint](docs/apiendpoints/generatepostmancollectionforapiendpoint.md) - Generate a Postman collection for a particular ApiEndpoint.
* [getAllApiEndpoints](docs/apiendpoints/getallapiendpoints.md) - Get all Api endpoints for a particular apiID.
* [getAllForVersionApiEndpoints](docs/apiendpoints/getallforversionapiendpoints.md) - Get all ApiEndpoints for a particular apiID and versionID.
* [getApiEndpoint](docs/apiendpoints/getapiendpoint.md) - Get an ApiEndpoint.
* [upsertApiEndpoint](docs/apiendpoints/upsertapiendpoint.md) - Upsert an ApiEndpoint.

### [apis](docs/apis/README.md)

* [deleteApi](docs/apis/deleteapi.md) - Delete an Api.
* [generateOpenApiSpec](docs/apis/generateopenapispec.md) - Generate an OpenAPI specification for a particular Api.
* [generatePostmanCollection](docs/apis/generatepostmancollection.md) - Generate a Postman collection for a particular Api.
* [getAllApiVersions](docs/apis/getallapiversions.md) - Get all Api versions for a particular ApiEndpoint.
* [getApis](docs/apis/getapis.md) - Get a list of Apis for a given workspace
* [upsertApi](docs/apis/upsertapi.md) - Upsert an Api

### [embeds](docs/embeds/README.md)

* [getEmbedAccessToken](docs/embeds/getembedaccesstoken.md) - Get an embed access token for the current workspace.
* [getValidEmbedAccessTokens](docs/embeds/getvalidembedaccesstokens.md) - Get all valid embed access tokens for the current workspace.
* [revokeEmbedAccessToken](docs/embeds/revokeembedaccesstoken.md) - Revoke an embed access EmbedToken.

### [metadata](docs/metadata/README.md)

* [deleteVersionMetadata](docs/metadata/deleteversionmetadata.md) - Delete metadata for a particular apiID and versionID.
* [getVersionMetadata](docs/metadata/getversionmetadata.md) - Get all metadata for a particular apiID and versionID.
* [insertVersionMetadata](docs/metadata/insertversionmetadata.md) - Insert metadata for a particular apiID and versionID.

### [plugins](docs/plugins/README.md)

* [getPlugins](docs/plugins/getplugins.md) - Get all plugins for the current workspace.
* [runPlugin](docs/plugins/runplugin.md) - Run a plugin
* [upsertPlugin](docs/plugins/upsertplugin.md) - Upsert a plugin

### [requests](docs/requests/README.md)

* [generateRequestPostmanCollection](docs/requests/generaterequestpostmancollection.md) - Generate a Postman collection for a particular request.
* [getRequestFromEventLog](docs/requests/getrequestfromeventlog.md) - Get information about a particular request.
* [queryEventLog](docs/requests/queryeventlog.md) - Query the event log to retrieve a list of requests.

### [schemas](docs/schemas/README.md)

* [deleteSchema](docs/schemas/deleteschema.md) - Delete a particular schema revision for an Api.
* [downloadSchema](docs/schemas/downloadschema.md) - Download the latest schema for a particular apiID.
* [downloadSchemaRevision](docs/schemas/downloadschemarevision.md) - Download a particular schema revision for an Api.
* [getSchema](docs/schemas/getschema.md) - Get information about the latest schema.
* [getSchemaDiff](docs/schemas/getschemadiff.md) - Get a diff of two schema revisions for an Api.
* [getSchemaRevision](docs/schemas/getschemarevision.md) - Get information about a particular schema revision for an Api.
* [getSchemas](docs/schemas/getschemas.md) - Get information about all schemas associated with a particular apiID.
* [registerSchema](docs/schemas/registerschema.md) - Register a schema.
<!-- End SDK Available Operations -->

### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
