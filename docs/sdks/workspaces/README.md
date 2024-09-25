# Workspaces
(*workspaces()*)

## Overview

### Available Operations

* [getWorkspace](#getworkspace) - Get workspace
* [getWorkspaceFeatureFlags](#getworkspacefeatureflags) - Get workspace feature flags

## getWorkspace

Get information about a particular workspace.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetWorkspaceRequest req = GetWorkspaceRequest.builder()
                .build();

        GetWorkspaceResponse res = sdk.workspaces().getWorkspace()
                .request(req)
                .call();

        if (res.workspace().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetWorkspaceRequest](../../models/operations/GetWorkspaceRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetWorkspaceResponse](../../models/operations/GetWorkspaceResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getWorkspaceFeatureFlags

Get workspace feature flags

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceFeatureFlagsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceFeatureFlagsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetWorkspaceFeatureFlagsRequest req = GetWorkspaceFeatureFlagsRequest.builder()
                .build();

        GetWorkspaceFeatureFlagsResponse res = sdk.workspaces().getWorkspaceFeatureFlags()
                .request(req)
                .call();

        if (res.workspaceFeatureFlagResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetWorkspaceFeatureFlagsRequest](../../models/operations/GetWorkspaceFeatureFlagsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetWorkspaceFeatureFlagsResponse](../../models/operations/GetWorkspaceFeatureFlagsResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 5XX                    | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
