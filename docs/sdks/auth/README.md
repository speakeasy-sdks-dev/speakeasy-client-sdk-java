# Auth
(*auth*)

## Overview

REST APIs for managing Authentication

### Available Operations

* [getWorkspaceAccess](#getworkspaceaccess) - Get access allowances for a particular workspace
* [validateApiKey](#validateapikey) - Validate the current api key.

## getWorkspaceAccess

Checks if generation is permitted for a particular run of the CLI

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceAccessRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceAccessResponse;
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

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceAccessRequest req = new GetWorkspaceAccessRequest(
){{
                genLockId = "<value>";

            }};

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceAccessResponse res = sdk.auth.getWorkspaceAccess(req);

            if (res.accessDetails != null) {
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
| `request`                                                                                                                                          | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceAccessRequest](../../models/operations/GetWorkspaceAccessRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceAccessResponse](../../models/operations/GetWorkspaceAccessResponse.md)**


## validateApiKey

Validate the current api key.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ValidateApiKeyResponse;
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

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ValidateApiKeyResponse res = sdk.auth.validateApiKey();

            if (res.apiKeyDetails != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ValidateApiKeyResponse](../../models/operations/ValidateApiKeyResponse.md)**

