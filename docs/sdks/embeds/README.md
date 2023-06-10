# embeds

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

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetEmbedAccessTokenRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetEmbedAccessTokenResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Filter;
import dev.speakeasyapi.javaclientsdk.models.shared.Filters;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("omnis") {{
                    apiKey = "";
                }})
                .build();

            GetEmbedAccessTokenRequest req = new GetEmbedAccessTokenRequest() {{
                description = "nemo";
                duration = 325047L;
                filters = new Filters(                new dev.speakeasyapi.javaclientsdk.models.shared.Filter[]{{
                                    add(new Filter("doloribus", "sapiente", "architecto") {{
                                        key = "accusantium";
                                        operator = "iure";
                                        value = "culpa";
                                    }}),
                                    add(new Filter("consequuntur", "repellat", "mollitia") {{
                                        key = "mollitia";
                                        operator = "dolorem";
                                        value = "culpa";
                                    }}),
                                    add(new Filter("quam", "molestiae", "velit") {{
                                        key = "occaecati";
                                        operator = "numquam";
                                        value = "commodi";
                                    }}),
                                }}, 623510L, 158969L, "quis");;
            }};            

            GetEmbedAccessTokenResponse res = sdk.embeds.getEmbedAccessToken(req);

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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [dev.speakeasyapi.javaclientsdk.models.operations.GetEmbedAccessTokenRequest](../../models/operations/GetEmbedAccessTokenRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.GetEmbedAccessTokenResponse](../../models/operations/GetEmbedAccessTokenResponse.md)**


## getValidEmbedAccessTokens

Get all valid embed access tokens for the current workspace.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetValidEmbedAccessTokensResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("vitae") {{
                    apiKey = "";
                }})
                .build();

            GetValidEmbedAccessTokensResponse res = sdk.embeds.getValidEmbedAccessTokens();

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

**[dev.speakeasyapi.javaclientsdk.models.operations.GetValidEmbedAccessTokensResponse](../../models/operations/GetValidEmbedAccessTokensResponse.md)**


## revokeEmbedAccessToken

Revoke an embed access EmbedToken.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.RevokeEmbedAccessTokenRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.RevokeEmbedAccessTokenResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("laborum") {{
                    apiKey = "";
                }})
                .build();

            RevokeEmbedAccessTokenRequest req = new RevokeEmbedAccessTokenRequest("animi");            

            RevokeEmbedAccessTokenResponse res = sdk.embeds.revokeEmbedAccessToken(req);

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [dev.speakeasyapi.javaclientsdk.models.operations.RevokeEmbedAccessTokenRequest](../../models/operations/RevokeEmbedAccessTokenRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.RevokeEmbedAccessTokenResponse](../../models/operations/RevokeEmbedAccessTokenResponse.md)**

