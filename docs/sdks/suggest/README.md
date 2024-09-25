# Suggest
(*suggest()*)

## Overview

REST APIs for managing LLM OAS suggestions

### Available Operations

* [suggest](#suggest) - Generate suggestions for improving an OpenAPI document.
* [suggestOpenAPI](#suggestopenapi) - (DEPRECATED) Generate suggestions for improving an OpenAPI document.
* [suggestOpenAPIRegistry](#suggestopenapiregistry) - Generate suggestions for improving an OpenAPI document stored in the registry.

## suggest

Get suggestions from an LLM model for improving an OpenAPI document.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.SuggestRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.SuggestResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Diagnostic;
import dev.speakeasyapi.javaclientsdk.models.shared.License;
import dev.speakeasyapi.javaclientsdk.models.shared.OASInfo;
import dev.speakeasyapi.javaclientsdk.models.shared.OASOperation;
import dev.speakeasyapi.javaclientsdk.models.shared.OASSummary;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import dev.speakeasyapi.javaclientsdk.models.shared.SuggestRequestBody;
import dev.speakeasyapi.javaclientsdk.models.shared.SuggestRequestBodySuggestionType;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        SuggestRequest req = SuggestRequest.builder()
                .suggestRequestBody(SuggestRequestBody.builder()
                    .diagnostics(List.of(
                        Diagnostic.builder()
                            .message("<value>")
                            .path(List.of(
                                "/rescue"))
                            .type("<value>")
                            .build()))
                    .oasSummary(OASSummary.builder()
                        .info(OASInfo.builder()
                            .description("kielbasa psst stitcher cannon devoted blindly apropos low")
                            .license(License.builder()
                                .build())
                            .summary("<value>")
                            .title("<value>")
                            .version("<value>")
                            .build())
                        .operations(List.of(
                            OASOperation.builder()
                                .description("via apparatus gray whether opposite what")
                                .method("<value>")
                                .operationId("<id>")
                                .path("/sys")
                                .tags(List.of(
                                    "<value>"))
                                .build()))
                        .build())
                    .suggestionType(SuggestRequestBodySuggestionType.METHOD_NAMES)
                    .build())
                .xSessionId("<id>")
                .build();

        SuggestResponse res = sdk.suggest().suggest()
                .request(req)
                .call();

        if (res.schema().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [SuggestRequest](../../models/operations/SuggestRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[SuggestResponse](../../models/operations/SuggestResponse.md)**

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
import dev.speakeasyapi.javaclientsdk.models.operations.Schema;
import dev.speakeasyapi.javaclientsdk.models.operations.SuggestOpenAPIRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.SuggestOpenAPIRequestBody;
import dev.speakeasyapi.javaclientsdk.models.operations.SuggestOpenAPIResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;
import java.nio.charset.StandardCharsets;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        SuggestOpenAPIRequest req = SuggestOpenAPIRequest.builder()
                .requestBody(SuggestOpenAPIRequestBody.builder()
                    .schema(Schema.builder()
                        .content("0x0beEcB7cF6".getBytes(StandardCharsets.UTF_8))
                        .fileName("example.file")
                        .build())
                    .build())
                .xSessionId("<id>")
                .build();

        SuggestOpenAPIResponse res = sdk.suggest().suggestOpenAPI()
                .request(req)
                .call();

        if (res.schema().isPresent()) {
            // handle response
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
import dev.speakeasyapi.javaclientsdk.models.operations.SuggestOpenAPIRegistryRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.SuggestOpenAPIRegistryResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        SuggestOpenAPIRegistryRequest req = SuggestOpenAPIRegistryRequest.builder()
                .namespaceName("<value>")
                .revisionReference("<value>")
                .xSessionId("<id>")
                .build();

        SuggestOpenAPIRegistryResponse res = sdk.suggest().suggestOpenAPIRegistry()
                .request(req)
                .call();

        if (res.schema().isPresent()) {
            // handle response
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
