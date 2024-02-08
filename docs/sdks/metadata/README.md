# Metadata
(*metadata()*)

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
import dev.speakeasyapi.javaclientsdk.models.operations.*;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataResponse;
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

            DeleteVersionMetadataRequest req = DeleteVersionMetadataRequest.builder()
                .apiID("string")
                .metaKey("string")
                .metaValue("string")
                .versionID("string")
                .build();

            DeleteVersionMetadataResponse res = sdk.metadata().deleteVersionMetadata()
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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataRequest](../../models/operations/DeleteVersionMetadataRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[Optional<? extends dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataResponse>](../../models/operations/DeleteVersionMetadataResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getVersionMetadata

Get all metadata for a particular apiID and versionID.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.*;
import dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataResponse;
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

            GetVersionMetadataRequest req = GetVersionMetadataRequest.builder()
                .apiID("string")
                .versionID("string")
                .build();

            GetVersionMetadataResponse res = sdk.metadata().getVersionMetadata()
                .request(req)
                .call();

            if (res.versionMetadata().isPresent()) {
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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataRequest](../../models/operations/GetVersionMetadataRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[Optional<? extends dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataResponse>](../../models/operations/GetVersionMetadataResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## insertVersionMetadata

Insert metadata for a particular apiID and versionID.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.*;
import dev.speakeasyapi.javaclientsdk.models.operations.InsertVersionMetadataRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.InsertVersionMetadataResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.*;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import dev.speakeasyapi.javaclientsdk.models.shared.VersionMetadataInput;
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

            InsertVersionMetadataRequest req = InsertVersionMetadataRequest.builder()
                .versionMetadata(VersionMetadataInput.builder()
                        .metaKey("string")
                        .metaValue("string")
                        .build())
                .apiID("string")
                .versionID("string")
                .build();

            InsertVersionMetadataResponse res = sdk.metadata().insertVersionMetadata()
                .request(req)
                .call();

            if (res.versionMetadata().isPresent()) {
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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [dev.speakeasyapi.javaclientsdk.models.operations.InsertVersionMetadataRequest](../../models/operations/InsertVersionMetadataRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[Optional<? extends dev.speakeasyapi.javaclientsdk.models.operations.InsertVersionMetadataResponse>](../../models/operations/InsertVersionMetadataResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
