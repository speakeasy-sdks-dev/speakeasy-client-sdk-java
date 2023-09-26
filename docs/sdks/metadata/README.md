# Metadata

## Overview

REST APIs for managing Version Metadata entities

### Available Operations

* [deleteVersionMetadata](#deleteversionmetadata) - Delete metadata for a particular apiID and versionID.
* [getVersionMetadata](#getversionmetadata) - Get all metadata for a particular apiID and versionID.
* [insertVersionMetadata](#insertversionmetadata) - Insert metadata for a particular apiID and versionID.

## deleteVersionMetadata

Delete metadata for a particular apiID and versionID.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("corporis") {{
                    apiKey = "";
                }})
                .build();

            DeleteVersionMetadataRequest req = new DeleteVersionMetadataRequest("iste", "iure", "saepe", "quidem");            

            DeleteVersionMetadataResponse res = sdk.metadata.deleteVersionMetadata(req);

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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataRequest](../../models/operations/DeleteVersionMetadataRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataResponse](../../models/operations/DeleteVersionMetadataResponse.md)**


## getVersionMetadata

Get all metadata for a particular apiID and versionID.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("architecto") {{
                    apiKey = "";
                }})
                .build();

            GetVersionMetadataRequest req = new GetVersionMetadataRequest("ipsa", "reiciendis");            

            GetVersionMetadataResponse res = sdk.metadata.getVersionMetadata(req);

            if (res.versionMetadata != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataRequest](../../models/operations/GetVersionMetadataRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataResponse](../../models/operations/GetVersionMetadataResponse.md)**


## insertVersionMetadata

Insert metadata for a particular apiID and versionID.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.InsertVersionMetadataRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.InsertVersionMetadataResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import dev.speakeasyapi.javaclientsdk.models.shared.VersionMetadataInput;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("est") {{
                    apiKey = "";
                }})
                .build();

            InsertVersionMetadataRequest req = new InsertVersionMetadataRequest(                new VersionMetadataInput("mollitia", "laborum");, "dolores", "dolorem");            

            InsertVersionMetadataResponse res = sdk.metadata.insertVersionMetadata(req);

            if (res.versionMetadata != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [dev.speakeasyapi.javaclientsdk.models.operations.InsertVersionMetadataRequest](../../models/operations/InsertVersionMetadataRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.InsertVersionMetadataResponse](../../models/operations/InsertVersionMetadataResponse.md)**

