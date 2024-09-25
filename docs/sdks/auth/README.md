# Auth
(*auth()*)

## Overview

REST APIs for managing Authentication

### Available Operations

* [getAccessToken](#getaccesstoken) - Get or refresh an access token for the current workspace.
* [getUser](#getuser) - Get information about the current user.
* [getWorkspaceAccess](#getworkspaceaccess) - Get access allowances for a particular workspace
* [validateApiKey](#validateapikey) - Validate the current api key.

## getAccessToken

Get or refresh an access token for the current workspace.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAccessTokenRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAccessTokenResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        GetAccessTokenRequest req = GetAccessTokenRequest.builder()
                .workspaceId("<value>")
                .build();

        GetAccessTokenResponse res = sdk.auth().getAccessToken()
                .request(req)
                .call();

        if (res.accessToken().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetAccessTokenRequest](../../models/operations/GetAccessTokenRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetAccessTokenResponse](../../models/operations/GetAccessTokenResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getUser

Get information about the current user.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetUserResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetUserResponse res = sdk.auth().getUser()
                .call();

        if (res.user().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetUserResponse](../../models/operations/GetUserResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getWorkspaceAccess

Checks if generation is permitted for a particular run of the CLI

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceAccessRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceAccessResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetWorkspaceAccessRequest req = GetWorkspaceAccessRequest.builder()
                .build();

        GetWorkspaceAccessResponse res = sdk.auth().getWorkspaceAccess()
                .request(req)
                .call();

        if (res.accessDetails().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetWorkspaceAccessRequest](../../models/operations/GetWorkspaceAccessRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetWorkspaceAccessResponse](../../models/operations/GetWorkspaceAccessResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## validateApiKey

Validate the current api key.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.ValidateApiKeyResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ValidateApiKeyResponse res = sdk.auth().validateApiKey()
                .call();

        if (res.apiKeyDetails().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ValidateApiKeyResponse](../../models/operations/ValidateApiKeyResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
