# Auth
(*auth()*)

## Overview

REST APIs for managing Authentication

### Available Operations

* [getAccessToken](#getaccesstoken) - Get or refresh an access token for the current workspace.
* [getWorkspaceAccess](#getworkspaceaccess) - Get access allowances for a particular workspace
* [validateApiKey](#validateapikey) - Validate the current api key.

## getAccessToken

Get or refresh an access token for the current workspace.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAccessTokenRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAccessTokenResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
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
                .workspaceID("<value>")
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
| `request`                                                                                                                                  | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAccessTokenRequest](../../models/operations/GetAccessTokenRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAccessTokenResponse>](../../models/operations/GetAccessTokenResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getWorkspaceAccess

Checks if generation is permitted for a particular run of the CLI

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceAccessRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceAccessResponse;
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

            GetWorkspaceAccessRequest req = GetWorkspaceAccessRequest.builder()
                .genLockId("<value>")
                .passive(false)
                .targetType("<value>")
                .build();

            GetWorkspaceAccessResponse res = sdk.auth().getWorkspaceAccess()
                .request(req)
                .call();

            if (res.accessDetails().isPresent()) {
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
| `request`                                                                                                                                          | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceAccessRequest](../../models/operations/GetWorkspaceAccessRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceAccessResponse>](../../models/operations/GetWorkspaceAccessResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## validateApiKey

Validate the current api key.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ValidateApiKeyResponse;
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

            ValidateApiKeyResponse res = sdk.auth().validateApiKey()
                .call();

            if (res.apiKeyDetails().isPresent()) {
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


### Response

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ValidateApiKeyResponse>](../../models/operations/ValidateApiKeyResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
