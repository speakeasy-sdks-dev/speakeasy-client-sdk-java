# Embeds
(*embeds()*)

## Overview

REST APIs for managing embeds

### Available Operations

* [getEmbedAccessToken](#getembedaccesstoken) - Get an embed access token for the current workspace.
* [getValidEmbedAccessTokens](#getvalidembedaccesstokens) - Get all valid embed access tokens for the current workspace.
* [revokeEmbedAccessToken](#revokeembedaccesstoken) - Revoke an embed access EmbedToken.

## getEmbedAccessToken

Returns an embed access token for the current workspace. This can be used to authenticate access to externally embedded content.
Filters can be applied allowing views to be filtered to things like particular customerIds.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetEmbedAccessTokenRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetEmbedAccessTokenResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Filter;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Filters;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
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

            GetEmbedAccessTokenRequest req = GetEmbedAccessTokenRequest.builder()
                .description("Versatile asynchronous leverage")
                .duration(554373L)
                .filters(Filters.builder()
                    .filters(java.util.List.of(
                            Filter.builder()
                                .key("<value>")
                                .operator("<value>")
                                .value("<value>")
                                .build()))
                    .limit(263313L)
                    .offset(411277L)
                    .operator("<value>")
                    .build())
                .build();

            GetEmbedAccessTokenResponse res = sdk.embeds().getEmbedAccessToken()
                .request(req)
                .call();

            if (res.embedAccessTokenResponse().isPresent()) {
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
| `request`                                                                                                                                            | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetEmbedAccessTokenRequest](../../models/operations/GetEmbedAccessTokenRequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


### Response

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetEmbedAccessTokenResponse>](../../models/operations/GetEmbedAccessTokenResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getValidEmbedAccessTokens

Get all valid embed access tokens for the current workspace.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetValidEmbedAccessTokensResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
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

            GetValidEmbedAccessTokensResponse res = sdk.embeds().getValidEmbedAccessTokens()
                .call();

            if (res.embedTokens().isPresent()) {
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

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetValidEmbedAccessTokensResponse>](../../models/operations/GetValidEmbedAccessTokensResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## revokeEmbedAccessToken

Revoke an embed access EmbedToken.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RevokeEmbedAccessTokenRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RevokeEmbedAccessTokenResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
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

            RevokeEmbedAccessTokenRequest req = RevokeEmbedAccessTokenRequest.builder()
                .tokenID("<value>")
                .build();

            RevokeEmbedAccessTokenResponse res = sdk.embeds().revokeEmbedAccessToken()
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

| Parameter                                                                                                                                                  | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                  | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RevokeEmbedAccessTokenRequest](../../models/operations/RevokeEmbedAccessTokenRequest.md) | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |


### Response

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RevokeEmbedAccessTokenResponse>](../../models/operations/RevokeEmbedAccessTokenResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
