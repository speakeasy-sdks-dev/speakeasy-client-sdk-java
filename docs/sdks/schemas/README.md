# Schemas
(*schemas()*)

## Overview

REST APIs for managing Schema entities

### Available Operations

* [deleteSchema](#deleteschema) - Delete a particular schema revision for an Api.
* [downloadSchema](#downloadschema) - Download the latest schema for a particular apiID.
* [downloadSchemaRevision](#downloadschemarevision) - Download a particular schema revision for an Api.
* [getSchema](#getschema) - Get information about the latest schema.
* [getSchemaDiff](#getschemadiff) - Get a diff of two schema revisions for an Api.
* [getSchemaRevision](#getschemarevision) - Get information about a particular schema revision for an Api.
* [getSchemas](#getschemas) - Get information about all schemas associated with a particular apiID.
* [registerSchema](#registerschema) - Register a schema.

## deleteSchema

Delete a particular schema revision for an Api.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.*;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.*;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
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

            DeleteSchemaRequest req = DeleteSchemaRequest.builder()
                .apiID("string")
                .revisionID("string")
                .versionID("string")
                .build();

            DeleteSchemaResponse res = sdk.schemas().deleteSchema()
                .request(req)
                .call();

            // handle response

        } catch (dev.speakeasyapi.javaclientsdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaRequest](../../models/operations/DeleteSchemaRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[Optional<? extends dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaResponse>](../../models/operations/DeleteSchemaResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## downloadSchema

Download the latest schema for a particular apiID.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.*;
import dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.*;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
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

            DownloadSchemaRequest req = DownloadSchemaRequest.builder()
                .apiID("string")
                .versionID("string")
                .build();

            DownloadSchemaResponse res = sdk.schemas().downloadSchema()
                .request(req)
                .call();

            if (res.twoHundredApplicationJsonSchema().isPresent()) {
                // handle response
            }

        } catch (dev.speakeasyapi.javaclientsdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRequest](../../models/operations/DownloadSchemaRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[Optional<? extends dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaResponse>](../../models/operations/DownloadSchemaResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## downloadSchemaRevision

Download a particular schema revision for an Api.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.*;
import dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.*;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
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

            DownloadSchemaRevisionRequest req = DownloadSchemaRevisionRequest.builder()
                .apiID("string")
                .revisionID("string")
                .versionID("string")
                .build();

            DownloadSchemaRevisionResponse res = sdk.schemas().downloadSchemaRevision()
                .request(req)
                .call();

            if (res.twoHundredApplicationJsonSchema().isPresent()) {
                // handle response
            }

        } catch (dev.speakeasyapi.javaclientsdk.models.errors.SDKError e) {
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
| `request`                                                                                                                                  | [dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionRequest](../../models/operations/DownloadSchemaRevisionRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[Optional<? extends dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionResponse>](../../models/operations/DownloadSchemaRevisionResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getSchema

Returns information about the last uploaded schema for a particular API version. 
This won't include the schema itself, that can be retrieved via the downloadSchema operation.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.*;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.*;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
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

            GetSchemaRequest req = GetSchemaRequest.builder()
                .apiID("string")
                .versionID("string")
                .build();

            GetSchemaResponse res = sdk.schemas().getSchema()
                .request(req)
                .call();

            if (res.schema().isPresent()) {
                // handle response
            }

        } catch (dev.speakeasyapi.javaclientsdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRequest](../../models/operations/GetSchemaRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[Optional<? extends dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaResponse>](../../models/operations/GetSchemaResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getSchemaDiff

Get a diff of two schema revisions for an Api.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.*;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.*;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
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

            GetSchemaDiffRequest req = GetSchemaDiffRequest.builder()
                .apiID("string")
                .baseRevisionID("string")
                .targetRevisionID("string")
                .versionID("string")
                .build();

            GetSchemaDiffResponse res = sdk.schemas().getSchemaDiff()
                .request(req)
                .call();

            if (res.schemaDiff().isPresent()) {
                // handle response
            }

        } catch (dev.speakeasyapi.javaclientsdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffRequest](../../models/operations/GetSchemaDiffRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[Optional<? extends dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffResponse>](../../models/operations/GetSchemaDiffResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getSchemaRevision

Returns information about the last uploaded schema for a particular schema revision. 
This won't include the schema itself, that can be retrieved via the downloadSchema operation.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.*;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.*;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
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

            GetSchemaRevisionRequest req = GetSchemaRevisionRequest.builder()
                .apiID("string")
                .revisionID("string")
                .versionID("string")
                .build();

            GetSchemaRevisionResponse res = sdk.schemas().getSchemaRevision()
                .request(req)
                .call();

            if (res.schema().isPresent()) {
                // handle response
            }

        } catch (dev.speakeasyapi.javaclientsdk.models.errors.SDKError e) {
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
| `request`                                                                                                                        | [dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionRequest](../../models/operations/GetSchemaRevisionRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[Optional<? extends dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionResponse>](../../models/operations/GetSchemaRevisionResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getSchemas

Returns information the schemas associated with a particular apiID. 
This won't include the schemas themselves, they can be retrieved via the downloadSchema operation.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.*;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.*;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
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

            GetSchemasRequest req = GetSchemasRequest.builder()
                .apiID("string")
                .versionID("string")
                .build();

            GetSchemasResponse res = sdk.schemas().getSchemas()
                .request(req)
                .call();

            if (res.classes().isPresent()) {
                // handle response
            }

        } catch (dev.speakeasyapi.javaclientsdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasRequest](../../models/operations/GetSchemasRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Optional<? extends dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasResponse>](../../models/operations/GetSchemasResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## registerSchema

Allows uploading a schema for a particular API version.
This will be used to populate ApiEndpoints and used as a base for any schema generation if present.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.*;
import dev.speakeasyapi.javaclientsdk.models.operations.File;
import dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaRequestBody;
import dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.*;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
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

            RegisterSchemaRequest req = RegisterSchemaRequest.builder()
                .requestBody(RegisterSchemaRequestBody.builder()
                        .file(File.builder()
                                .content("0xCAFCA03e0e".getBytes())
                                .fileName("string")
                                .build())
                        .build())
                .apiID("string")
                .versionID("string")
                .build();

            RegisterSchemaResponse res = sdk.schemas().registerSchema()
                .request(req)
                .call();

            // handle response

        } catch (dev.speakeasyapi.javaclientsdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaRequest](../../models/operations/RegisterSchemaRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[Optional<? extends dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaResponse>](../../models/operations/RegisterSchemaResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
