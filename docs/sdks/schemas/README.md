# Schemas

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
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("odit") {{
                    apiKey = "";
                }})
                .build();

            DeleteSchemaRequest req = new DeleteSchemaRequest("quo", "sequi", "tenetur");            

            DeleteSchemaResponse res = sdk.schemas.deleteSchema(req);

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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaRequest](../../models/operations/DeleteSchemaRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaResponse](../../models/operations/DeleteSchemaResponse.md)**


## downloadSchema

Download the latest schema for a particular apiID.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("ipsam") {{
                    apiKey = "";
                }})
                .build();

            DownloadSchemaRequest req = new DownloadSchemaRequest("id", "possimus");            

            DownloadSchemaResponse res = sdk.schemas.downloadSchema(req);

            if (res.schema != null) {
                // handle response
            }
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

**[dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaResponse](../../models/operations/DownloadSchemaResponse.md)**


## downloadSchemaRevision

Download a particular schema revision for an Api.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("aut") {{
                    apiKey = "";
                }})
                .build();

            DownloadSchemaRevisionRequest req = new DownloadSchemaRevisionRequest("quasi", "error", "temporibus");            

            DownloadSchemaRevisionResponse res = sdk.schemas.downloadSchemaRevision(req);

            if (res.schema != null) {
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
| `request`                                                                                                                                  | [dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionRequest](../../models/operations/DownloadSchemaRevisionRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionResponse](../../models/operations/DownloadSchemaRevisionResponse.md)**


## getSchema

Returns information about the last uploaded schema for a particular API version. 
This won't include the schema itself, that can be retrieved via the downloadSchema operation.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("laborum") {{
                    apiKey = "";
                }})
                .build();

            GetSchemaRequest req = new GetSchemaRequest("quasi", "reiciendis");            

            GetSchemaResponse res = sdk.schemas.getSchema(req);

            if (res.schema != null) {
                // handle response
            }
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

**[dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaResponse](../../models/operations/GetSchemaResponse.md)**


## getSchemaDiff

Get a diff of two schema revisions for an Api.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("voluptatibus") {{
                    apiKey = "";
                }})
                .build();

            GetSchemaDiffRequest req = new GetSchemaDiffRequest("vero", "nihil", "praesentium", "voluptatibus");            

            GetSchemaDiffResponse res = sdk.schemas.getSchemaDiff(req);

            if (res.schemaDiff != null) {
                // handle response
            }
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

**[dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffResponse](../../models/operations/GetSchemaDiffResponse.md)**


## getSchemaRevision

Returns information about the last uploaded schema for a particular schema revision. 
This won't include the schema itself, that can be retrieved via the downloadSchema operation.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("ipsa") {{
                    apiKey = "";
                }})
                .build();

            GetSchemaRevisionRequest req = new GetSchemaRevisionRequest("omnis", "voluptate", "cum");            

            GetSchemaRevisionResponse res = sdk.schemas.getSchemaRevision(req);

            if (res.schema != null) {
                // handle response
            }
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

**[dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionResponse](../../models/operations/GetSchemaRevisionResponse.md)**


## getSchemas

Returns information the schemas associated with a particular apiID. 
This won't include the schemas themselves, they can be retrieved via the downloadSchema operation.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("perferendis") {{
                    apiKey = "";
                }})
                .build();

            GetSchemasRequest req = new GetSchemasRequest("doloremque", "reprehenderit");            

            GetSchemasResponse res = sdk.schemas.getSchemas(req);

            if (res.schemata != null) {
                // handle response
            }
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

**[dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasResponse](../../models/operations/GetSchemasResponse.md)**


## registerSchema

Allows uploading a schema for a particular API version.
This will be used to populate ApiEndpoints and used as a base for any schema generation if present.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaRequestBody;
import dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaRequestBodyFile;
import dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("ut") {{
                    apiKey = "";
                }})
                .build();

            RegisterSchemaRequest req = new RegisterSchemaRequest(                new RegisterSchemaRequestBody(                new RegisterSchemaRequestBodyFile("maiores".getBytes(), "dicta"););, "corporis", "dolore");            

            RegisterSchemaResponse res = sdk.schemas.registerSchema(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaRequest](../../models/operations/RegisterSchemaRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaResponse](../../models/operations/RegisterSchemaResponse.md)**

