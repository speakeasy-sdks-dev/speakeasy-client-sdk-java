# ShortURLs
(*shortURLs()*)

## Overview

REST APIs for managing short URLs

### Available Operations

* [create](#create) - Shorten a URL.

## create

Shorten a URL.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.CreateRequestBody;
import dev.speakeasyapi.javaclientsdk.models.operations.CreateResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateRequestBody req = CreateRequestBody.builder()
                .url("https://probable-heating.com/")
                .build();

        CreateResponse res = sdk.shortURLs().create()
                .request(req)
                .call();

        if (res.shortURL().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [CreateRequestBody](../../models/operations/CreateRequestBody.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[CreateResponse](../../models/operations/CreateResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
