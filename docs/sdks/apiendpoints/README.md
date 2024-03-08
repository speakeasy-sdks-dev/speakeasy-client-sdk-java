# ApiEndpoints
(*apiEndpoints()*)

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
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiEndpointRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiEndpointResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("<value>")
                .build();

            DeleteApiEndpointRequest req = DeleteApiEndpointRequest.builder()
                .apiEndpointID("<value>")
                .apiID("<value>")
                .versionID("<value>")
                .build();

            DeleteApiEndpointResponse res = sdk.apiEndpoints().deleteApiEndpoint()
                .request(req)
                .call();

            // handle response
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiEndpointResponse>](../../models/operations/DeleteApiEndpointResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## findApiEndpoint

Find an ApiEndpoint via its displayName (set by operationId from a registered OpenAPI schema).
This is useful for finding the ID of an ApiEndpoint to use in the /v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID} endpoints.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FindApiEndpointRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FindApiEndpointResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("<value>")
                .build();

            FindApiEndpointRequest req = FindApiEndpointRequest.builder()
                .apiID("<value>")
                .displayName("<value>")
                .versionID("<value>")
                .build();

            FindApiEndpointResponse res = sdk.apiEndpoints().findApiEndpoint()
                .request(req)
                .call();

            if (res.apiEndpoint().isPresent()) {
                // handle response
            }
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FindApiEndpointResponse>](../../models/operations/FindApiEndpointResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## generateOpenApiSpecForApiEndpoint

This endpoint will generate a new operation in any registered OpenAPI document if the operation does not already exist in the document.
Returns the original document and the newly generated document allowing a diff to be performed to see what has changed.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("<value>")
                .build();

            GenerateOpenApiSpecForApiEndpointRequest req = GenerateOpenApiSpecForApiEndpointRequest.builder()
                .apiEndpointID("<value>")
                .apiID("<value>")
                .versionID("<value>")
                .build();

            GenerateOpenApiSpecForApiEndpointResponse res = sdk.apiEndpoints().generateOpenApiSpecForApiEndpoint()
                .request(req)
                .call();

            if (res.generateOpenApiSpecDiff().isPresent()) {
                // handle response
            }
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse>](../../models/operations/GenerateOpenApiSpecForApiEndpointResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## generatePostmanCollectionForApiEndpoint

Generates a postman collection that allows the endpoint to be called from postman variables produced for any path/query/header parameters included in the OpenAPI document.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("<value>")
                .build();

            GeneratePostmanCollectionForApiEndpointRequest req = GeneratePostmanCollectionForApiEndpointRequest.builder()
                .apiEndpointID("<value>")
                .apiID("<value>")
                .versionID("<value>")
                .build();

            GeneratePostmanCollectionForApiEndpointResponse res = sdk.apiEndpoints().generatePostmanCollectionForApiEndpoint()
                .request(req)
                .call();

            if (res.postmanCollection().isPresent()) {
                // handle response
            }
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse>](../../models/operations/GeneratePostmanCollectionForApiEndpointResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getAllApiEndpoints

Get all Api endpoints for a particular apiID.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiEndpointsRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiEndpointsResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("<value>")
                .build();

            GetAllApiEndpointsRequest req = GetAllApiEndpointsRequest.builder()
                .apiID("<value>")
                .build();

            GetAllApiEndpointsResponse res = sdk.apiEndpoints().getAllApiEndpoints()
                .request(req)
                .call();

            if (res.apiEndpoints().isPresent()) {
                // handle response
            }
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiEndpointsResponse>](../../models/operations/GetAllApiEndpointsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getAllForVersionApiEndpoints

Get all ApiEndpoints for a particular apiID and versionID.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllForVersionApiEndpointsRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("<value>")
                .build();

            GetAllForVersionApiEndpointsRequest req = GetAllForVersionApiEndpointsRequest.builder()
                .apiID("<value>")
                .versionID("<value>")
                .build();

            GetAllForVersionApiEndpointsResponse res = sdk.apiEndpoints().getAllForVersionApiEndpoints()
                .request(req)
                .call();

            if (res.apiEndpoints().isPresent()) {
                // handle response
            }
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse>](../../models/operations/GetAllForVersionApiEndpointsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getApiEndpoint

Get an ApiEndpoint.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApiEndpointRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApiEndpointResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("<value>")
                .build();

            GetApiEndpointRequest req = GetApiEndpointRequest.builder()
                .apiEndpointID("<value>")
                .apiID("<value>")
                .versionID("<value>")
                .build();

            GetApiEndpointResponse res = sdk.apiEndpoints().getApiEndpoint()
                .request(req)
                .call();

            if (res.apiEndpoint().isPresent()) {
                // handle response
            }
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApiEndpointResponse>](../../models/operations/GetApiEndpointResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## upsertApiEndpoint

Upsert an ApiEndpoint. If the ApiEndpoint does not exist it will be created, otherwise it will be updated.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiEndpointRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiEndpointResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpointInput;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("<value>")
                .build();

            UpsertApiEndpointRequest req = UpsertApiEndpointRequest.builder()
                .apiEndpoint(ApiEndpointInput.builder()
                        .apiEndpointId("<value>")
                        .description("<value>")
                        .displayName("<value>")
                        .method("<value>")
                        .path("<value>")
                        .versionId("<value>")
                        .build())
                .apiEndpointID("<value>")
                .apiID("<value>")
                .versionID("<value>")
                .build();

            UpsertApiEndpointResponse res = sdk.apiEndpoints().upsertApiEndpoint()
                .request(req)
                .call();

            if (res.apiEndpoint().isPresent()) {
                // handle response
            }
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiEndpointResponse>](../../models/operations/UpsertApiEndpointResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
