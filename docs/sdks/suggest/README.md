# Suggest
(*suggest()*)

## Overview

REST APIs for managing LLM OAS suggestions

### Available Operations

* [applyOperationIDs](#applyoperationids) - Apply operation ID suggestions and download result.
* [suggestOpenAPI](#suggestopenapi) - Generate suggestions for improving an OpenAPI document.
* [suggestOpenAPIRegistry](#suggestopenapiregistry) - Generate suggestions for improving an OpenAPI document stored in the registry.

## applyOperationIDs

Apply operation ID suggestions and download result.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.SDKError;
import dev.speakeasyapi.javaclientsdk.models.operations.ApplyOperationIDsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.ApplyOperationIDsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            ApplyOperationIDsRequest req = ApplyOperationIDsRequest.builder()
                .xSessionId("<value>")
                .build();

            ApplyOperationIDsResponse res = sdk.suggest().applyOperationIDs()
                .request(req)
                .call();

            if (res.twoHundredApplicationJsonSchema().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ApplyOperationIDsRequest](../../models/operations/ApplyOperationIDsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ApplyOperationIDsResponse](../../models/operations/ApplyOperationIDsResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## suggestOpenAPI

Get suggestions from an LLM model for improving an OpenAPI document.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.SDKError;
import dev.speakeasyapi.javaclientsdk.models.operations.Schema;
import dev.speakeasyapi.javaclientsdk.models.operations.SuggestOpenAPIRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.SuggestOpenAPIRequestBody;
import dev.speakeasyapi.javaclientsdk.models.operations.SuggestOpenAPIResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            SuggestOpenAPIRequest req = SuggestOpenAPIRequest.builder()
                .requestBody(SuggestOpenAPIRequestBody.builder()
                        .schema(Schema.builder()
                                .content("0x0FbfeAEcc8".getBytes())
                                .fileName("<value>")
                                .build())
                        .build())
                .xSessionId("<value>")
                .build();

            SuggestOpenAPIResponse res = sdk.suggest().suggestOpenAPI()
                .request(req)
                .call();

            if (res.schema().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [SuggestOpenAPIRequest](../../models/operations/SuggestOpenAPIRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[SuggestOpenAPIResponse](../../models/operations/SuggestOpenAPIResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## suggestOpenAPIRegistry

Get suggestions from an LLM model for improving an OpenAPI document stored in the registry.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.SDKError;
import dev.speakeasyapi.javaclientsdk.models.operations.SuggestOpenAPIRegistryRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.SuggestOpenAPIRegistryResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            SuggestOpenAPIRegistryRequest req = SuggestOpenAPIRegistryRequest.builder()
                .namespaceName("<value>")
                .revisionReference("<value>")
                .xSessionId("<value>")
                .build();

            SuggestOpenAPIRegistryResponse res = sdk.suggest().suggestOpenAPIRegistry()
                .request(req)
                .call();

            if (res.schema().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [SuggestOpenAPIRegistryRequest](../../models/operations/SuggestOpenAPIRegistryRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[SuggestOpenAPIRegistryResponse](../../models/operations/SuggestOpenAPIRegistryResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
