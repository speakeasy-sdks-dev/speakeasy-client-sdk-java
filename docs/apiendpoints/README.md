# apiEndpoints

## Overview

REST APIs for managing ApiEndpoint entities

### Available Operations

* [deleteApiEndpoint](#deleteapiendpoint) - Delete an ApiEndpoint.
* [findApiEndpoint](#findapiendpoint) - Find an ApiEndpoint via its displayName.
* [generateOpenApiSpecForApiEndpoint](#generateopenapispecforapiendpoint) - Generate an OpenAPI specification for a particular ApiEndpoint.
* [generatePostmanCollectionForApiEndpoint](#generatepostmancollectionforapiendpoint) - Generate a Postman collection for a particular ApiEndpoint.
* [getAllApiEndpoints](#getallapiendpoints) - Get all Api endpoints for a particular apiID.
* [getAllForVersionApiEndpoints](#getallforversionapiendpoints) - Get all ApiEndpoints for a particular apiID and versionID.
* [getApiEndpoint](#getapiendpoint) - Get an ApiEndpoint.
* [upsertApiEndpoint](#upsertapiendpoint) - Upsert an ApiEndpoint.

## deleteApiEndpoint

Delete an ApiEndpoint. This will also delete all associated Request Logs (if using a Postgres datastore).

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiEndpointResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("minus") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            DeleteApiEndpointRequest req = new DeleteApiEndpointRequest("placeat", "voluptatum", "iusto");            

            DeleteApiEndpointResponse res = sdk.apiEndpoints.deleteApiEndpoint(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## findApiEndpoint

Find an ApiEndpoint via its displayName (set by operationId from a registered OpenAPI schema).
This is useful for finding the ID of an ApiEndpoint to use in the /v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID} endpoints.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.FindApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.FindApiEndpointResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("excepturi") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            FindApiEndpointRequest req = new FindApiEndpointRequest("nisi", "recusandae", "temporibus");            

            FindApiEndpointResponse res = sdk.apiEndpoints.findApiEndpoint(req);

            if (res.apiEndpoint != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## generateOpenApiSpecForApiEndpoint

This endpoint will generate a new operation in any registered OpenAPI document if the operation does not already exist in the document.
Returns the original document and the newly generated document allowing a diff to be performed to see what has changed.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("ab") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GenerateOpenApiSpecForApiEndpointRequest req = new GenerateOpenApiSpecForApiEndpointRequest("quis", "veritatis", "deserunt");            

            GenerateOpenApiSpecForApiEndpointResponse res = sdk.apiEndpoints.generateOpenApiSpecForApiEndpoint(req);

            if (res.generateOpenApiSpecDiff != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## generatePostmanCollectionForApiEndpoint

Generates a postman collection that allows the endpoint to be called from postman variables produced for any path/query/header parameters included in the OpenAPI document.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("perferendis") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GeneratePostmanCollectionForApiEndpointRequest req = new GeneratePostmanCollectionForApiEndpointRequest("ipsam", "repellendus", "sapiente");            

            GeneratePostmanCollectionForApiEndpointResponse res = sdk.apiEndpoints.generatePostmanCollectionForApiEndpoint(req);

            if (res.postmanCollection != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getAllApiEndpoints

Get all Api endpoints for a particular apiID.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiEndpointsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiEndpointsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("quo") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetAllApiEndpointsRequest req = new GetAllApiEndpointsRequest("odit");            

            GetAllApiEndpointsResponse res = sdk.apiEndpoints.getAllApiEndpoints(req);

            if (res.apiEndpoints != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getAllForVersionApiEndpoints

Get all ApiEndpoints for a particular apiID and versionID.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllForVersionApiEndpointsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("at") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetAllForVersionApiEndpointsRequest req = new GetAllForVersionApiEndpointsRequest("at", "maiores");            

            GetAllForVersionApiEndpointsResponse res = sdk.apiEndpoints.getAllForVersionApiEndpoints(req);

            if (res.apiEndpoints != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getApiEndpoint

Get an ApiEndpoint.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApiEndpointResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("molestiae") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetApiEndpointRequest req = new GetApiEndpointRequest("quod", "quod", "esse");            

            GetApiEndpointResponse res = sdk.apiEndpoints.getApiEndpoint(req);

            if (res.apiEndpoint != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## upsertApiEndpoint

Upsert an ApiEndpoint. If the ApiEndpoint does not exist it will be created, otherwise it will be updated.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiEndpointResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpointInput;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("totam") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            UpsertApiEndpointRequest req = new UpsertApiEndpointRequest(                new ApiEndpointInput("porro", "dolorum", "dicta", "nam", "officia", "occaecati");, "fugit", "deleniti", "hic");            

            UpsertApiEndpointResponse res = sdk.apiEndpoints.upsertApiEndpoint(req);

            if (res.apiEndpoint != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
