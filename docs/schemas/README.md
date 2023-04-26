# schemas

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
                .setSecurity(new Security("perferendis") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            DeleteSchemaRequest req = new DeleteSchemaRequest("magni", "assumenda", "ipsam");            

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
                .setSecurity(new Security("alias") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            DownloadSchemaRequest req = new DownloadSchemaRequest("fugit", "dolorum");            

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
                .setSecurity(new Security("excepturi") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            DownloadSchemaRevisionRequest req = new DownloadSchemaRevisionRequest("tempora", "facilis", "tempore");            

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
                .setSecurity(new Security("labore") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetSchemaRequest req = new GetSchemaRequest("delectus", "eum");            

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
                .setSecurity(new Security("non") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetSchemaDiffRequest req = new GetSchemaDiffRequest("eligendi", "sint", "aliquid", "provident");            

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
                .setSecurity(new Security("necessitatibus") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetSchemaRevisionRequest req = new GetSchemaRevisionRequest("sint", "officia", "dolor");            

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
                .setSecurity(new Security("debitis") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetSchemasRequest req = new GetSchemasRequest("a", "dolorum");            

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
                .setSecurity(new Security("in") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            RegisterSchemaRequest req = new RegisterSchemaRequest(                new RegisterSchemaRequestBody(                new RegisterSchemaRequestBodyFile("in".getBytes(), "illum"););, "maiores", "rerum");            

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
