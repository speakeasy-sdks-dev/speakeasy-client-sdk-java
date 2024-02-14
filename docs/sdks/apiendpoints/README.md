# ApiEndpoints
(*apiEndpoints*)

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

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiEndpointRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiEndpointResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .setWorkspaceID("<value>")
                .build();

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiEndpointRequest req = new DeleteApiEndpointRequest(
                "<value>",
                "<value>",
                "<value>");

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiEndpointResponse res = sdk.apiEndpoints.deleteApiEndpoint(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiEndpointRequest](../../models/operations/DeleteApiEndpointRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiEndpointResponse](../../models/operations/DeleteApiEndpointResponse.md)**


## findApiEndpoint

Find an ApiEndpoint via its displayName (set by operationId from a registered OpenAPI schema).
This is useful for finding the ID of an ApiEndpoint to use in the /v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID} endpoints.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FindApiEndpointRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FindApiEndpointResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .setWorkspaceID("<value>")
                .build();

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FindApiEndpointRequest req = new FindApiEndpointRequest(
                "<value>",
                "<value>",
                "<value>");

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FindApiEndpointResponse res = sdk.apiEndpoints.findApiEndpoint(req);

            if (res.apiEndpoint != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FindApiEndpointRequest](../../models/operations/FindApiEndpointRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FindApiEndpointResponse](../../models/operations/FindApiEndpointResponse.md)**


## generateOpenApiSpecForApiEndpoint

This endpoint will generate a new operation in any registered OpenAPI document if the operation does not already exist in the document.
Returns the original document and the newly generated document allowing a diff to be performed to see what has changed.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .setWorkspaceID("<value>")
                .build();

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointRequest req = new GenerateOpenApiSpecForApiEndpointRequest(
                "<value>",
                "<value>",
                "<value>");

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse res = sdk.apiEndpoints.generateOpenApiSpecForApiEndpoint(req);

            if (res.generateOpenApiSpecDiff != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                        | Type                                                                                                                                                                             | Required                                                                                                                                                                         | Description                                                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                        | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointRequest](../../models/operations/GenerateOpenApiSpecForApiEndpointRequest.md) | :heavy_check_mark:                                                                                                                                                               | The request object to use for the request.                                                                                                                                       |


### Response

**[io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse](../../models/operations/GenerateOpenApiSpecForApiEndpointResponse.md)**


## generatePostmanCollectionForApiEndpoint

Generates a postman collection that allows the endpoint to be called from postman variables produced for any path/query/header parameters included in the OpenAPI document.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .setWorkspaceID("<value>")
                .build();

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointRequest req = new GeneratePostmanCollectionForApiEndpointRequest(
                "<value>",
                "<value>",
                "<value>");

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse res = sdk.apiEndpoints.generatePostmanCollectionForApiEndpoint(req);

            if (res.postmanCollection != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                    | Type                                                                                                                                                                                         | Required                                                                                                                                                                                     | Description                                                                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                                    | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointRequest](../../models/operations/GeneratePostmanCollectionForApiEndpointRequest.md) | :heavy_check_mark:                                                                                                                                                                           | The request object to use for the request.                                                                                                                                                   |


### Response

**[io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse](../../models/operations/GeneratePostmanCollectionForApiEndpointResponse.md)**


## getAllApiEndpoints

Get all Api endpoints for a particular apiID.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiEndpointsRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiEndpointsResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .setWorkspaceID("<value>")
                .build();

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiEndpointsRequest req = new GetAllApiEndpointsRequest(
                "<value>");

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiEndpointsResponse res = sdk.apiEndpoints.getAllApiEndpoints(req);

            if (res.apiEndpoints != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiEndpointsRequest](../../models/operations/GetAllApiEndpointsRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiEndpointsResponse](../../models/operations/GetAllApiEndpointsResponse.md)**


## getAllForVersionApiEndpoints

Get all ApiEndpoints for a particular apiID and versionID.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllForVersionApiEndpointsRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .setWorkspaceID("<value>")
                .build();

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllForVersionApiEndpointsRequest req = new GetAllForVersionApiEndpointsRequest(
                "<value>",
                "<value>");

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse res = sdk.apiEndpoints.getAllForVersionApiEndpoints(req);

            if (res.apiEndpoints != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                              | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                              | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllForVersionApiEndpointsRequest](../../models/operations/GetAllForVersionApiEndpointsRequest.md) | :heavy_check_mark:                                                                                                                                                     | The request object to use for the request.                                                                                                                             |


### Response

**[io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse](../../models/operations/GetAllForVersionApiEndpointsResponse.md)**


## getApiEndpoint

Get an ApiEndpoint.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApiEndpointRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApiEndpointResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .setWorkspaceID("<value>")
                .build();

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApiEndpointRequest req = new GetApiEndpointRequest(
                "<value>",
                "<value>",
                "<value>");

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApiEndpointResponse res = sdk.apiEndpoints.getApiEndpoint(req);

            if (res.apiEndpoint != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApiEndpointRequest](../../models/operations/GetApiEndpointRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApiEndpointResponse](../../models/operations/GetApiEndpointResponse.md)**


## upsertApiEndpoint

Upsert an ApiEndpoint. If the ApiEndpoint does not exist it will be created, otherwise it will be updated.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiEndpointRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiEndpointResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpointInput;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .setWorkspaceID("<value>")
                .build();

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiEndpointRequest req = new UpsertApiEndpointRequest(
                new ApiEndpointInput(
                    "<value>",
                    "<value>",
                    "<value>",
                    "<value>",
                    "<value>",
                    "<value>"),
                "<value>",
                "<value>",
                "<value>");

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiEndpointResponse res = sdk.apiEndpoints.upsertApiEndpoint(req);

            if (res.apiEndpoint != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiEndpointRequest](../../models/operations/UpsertApiEndpointRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiEndpointResponse](../../models/operations/UpsertApiEndpointResponse.md)**

