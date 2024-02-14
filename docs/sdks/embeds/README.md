# Embeds
(*embeds*)

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
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetEmbedAccessTokenRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetEmbedAccessTokenResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Filter;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Filters;
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

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetEmbedAccessTokenRequest req = new GetEmbedAccessTokenRequest(
){{
                description = "Versatile asynchronous leverage";
                duration = 554373L;
                filters = new Filters(
                    new io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Filter[]{{
                        add(new Filter(
                        "<value>",
                        "<value>",
                        "<value>"){{
                            key = "<key>";
                            operator = "<value>";
                            value = "<value>";
                        }}),
                    }},
                    263313L,
                    411277L,
                    "<value>");

            }};

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetEmbedAccessTokenResponse res = sdk.embeds.getEmbedAccessToken(req);

            if (res.embedAccessTokenResponse != null) {
                // handle response
            }
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

**[io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetEmbedAccessTokenResponse](../../models/operations/GetEmbedAccessTokenResponse.md)**


## getValidEmbedAccessTokens

Get all valid embed access tokens for the current workspace.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetValidEmbedAccessTokensResponse;
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

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetValidEmbedAccessTokensResponse res = sdk.embeds.getValidEmbedAccessTokens();

            if (res.embedTokens != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetValidEmbedAccessTokensResponse](../../models/operations/GetValidEmbedAccessTokensResponse.md)**


## revokeEmbedAccessToken

Revoke an embed access EmbedToken.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RevokeEmbedAccessTokenRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RevokeEmbedAccessTokenResponse;
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

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RevokeEmbedAccessTokenRequest req = new RevokeEmbedAccessTokenRequest(
                "<value>");

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RevokeEmbedAccessTokenResponse res = sdk.embeds.revokeEmbedAccessToken(req);

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

| Parameter                                                                                                                                                  | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                  | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RevokeEmbedAccessTokenRequest](../../models/operations/RevokeEmbedAccessTokenRequest.md) | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |


### Response

**[io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RevokeEmbedAccessTokenResponse](../../models/operations/RevokeEmbedAccessTokenResponse.md)**

