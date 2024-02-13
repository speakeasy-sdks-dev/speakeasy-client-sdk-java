# Apis
(*apis()*)

## Overview

REST APIs for managing Api entities

### Available Operations

* [deleteApi](#deleteapi) - Delete an Api.
* [generateOpenApiSpec](#generateopenapispec) - Generate an OpenAPI specification for a particular Api.
* [generatePostmanCollection](#generatepostmancollection) - Generate a Postman collection for a particular Api.
* [getAllApiVersions](#getallapiversions) - Get all Api versions for a particular ApiEndpoint.
* [getApis](#getapis) - Get a list of Apis for a given workspace
* [upsertApi](#upsertapi) - Upsert an Api

## deleteApi

Delete a particular version of an Api. The will also delete all associated ApiEndpoints, Metadata, Schemas & Request Logs (if using a Postgres datastore).

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("string")
                .build();

            DeleteApiRequest req = DeleteApiRequest.builder()
                .apiID("string")
                .versionID("string")
                .build();

            DeleteApiResponse res = sdk.apis().deleteApi()
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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiRequest](../../models/operations/DeleteApiRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiResponse>](../../models/operations/DeleteApiResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## generateOpenApiSpec

This endpoint will generate any missing operations in any registered OpenAPI document if the operation does not already exist in the document.
Returns the original document and the newly generated document allowing a diff to be performed to see what has changed.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("string")
                .build();

            GenerateOpenApiSpecRequest req = GenerateOpenApiSpecRequest.builder()
                .apiID("string")
                .versionID("string")
                .build();

            GenerateOpenApiSpecResponse res = sdk.apis().generateOpenApiSpec()
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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecRequest](../../models/operations/GenerateOpenApiSpecRequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


### Response

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecResponse>](../../models/operations/GenerateOpenApiSpecResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## generatePostmanCollection

Generates a postman collection containing all endpoints for a particular API. Includes variables produced for any path/query/header parameters included in the OpenAPI document.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("string")
                .build();

            GeneratePostmanCollectionRequest req = GeneratePostmanCollectionRequest.builder()
                .apiID("string")
                .versionID("string")
                .build();

            GeneratePostmanCollectionResponse res = sdk.apis().generatePostmanCollection()
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

| Parameter                                                                                                                                                        | Type                                                                                                                                                             | Required                                                                                                                                                         | Description                                                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                        | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionRequest](../../models/operations/GeneratePostmanCollectionRequest.md) | :heavy_check_mark:                                                                                                                                               | The request object to use for the request.                                                                                                                       |


### Response

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionResponse>](../../models/operations/GeneratePostmanCollectionResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getAllApiVersions

Get all Api versions for a particular ApiEndpoint.
Supports filtering the versions based on metadata attributes.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiVersionsRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiVersionsResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.Op;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("string")
                .build();

            GetAllApiVersionsRequest req = GetAllApiVersionsRequest.builder()
                .apiID("string")
                .metadata(java.util.Map.ofEntries(
                    entry("key", java.util.List.of(
                        "string"))))
                .op(Op.builder()
                    .and(false)
                    .build())
                .build();

            GetAllApiVersionsResponse res = sdk.apis().getAllApiVersions()
                .request(req)
                .call();

            if (res.apis().isPresent()) {
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
| `request`                                                                                                                                        | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiVersionsRequest](../../models/operations/GetAllApiVersionsRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiVersionsResponse>](../../models/operations/GetAllApiVersionsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getApis

Get a list of all Apis and their versions for a given workspace.
Supports filtering the APIs based on metadata attributes.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApisRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApisResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.QueryParamOp;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("string")
                .build();

            GetApisRequest req = GetApisRequest.builder()
                .metadata(java.util.Map.ofEntries(
                    entry("key", java.util.List.of(
                        "string"))))
                .op(QueryParamOp.builder()
                    .and(false)
                    .build())
                .build();

            GetApisResponse res = sdk.apis().getApis()
                .request(req)
                .call();

            if (res.apis().isPresent()) {
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApisRequest](../../models/operations/GetApisRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApisResponse>](../../models/operations/GetApisResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## upsertApi

Upsert an Api. If the Api does not exist, it will be created.
If the Api exists, it will be updated.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiInput;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("string")
                .build();

            UpsertApiRequest req = UpsertApiRequest.builder()
                .api(ApiInput.builder()
                        .apiId("string")
                        .description("string")
                        .versionId("string")
                        .metaData(java.util.Map.ofEntries(
                            entry("key", java.util.List.of(
                                "string"))))
                        .build())
                .apiID("string")
                .build();

            UpsertApiResponse res = sdk.apis().upsertApi()
                .request(req)
                .call();

            if (res.api().isPresent()) {
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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiRequest](../../models/operations/UpsertApiRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiResponse>](../../models/operations/UpsertApiResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
