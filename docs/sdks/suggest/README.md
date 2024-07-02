# Suggest
(*suggest()*)

## Overview

REST APIs for managing LLM OAS suggestions

### Available Operations

* [applyOperationIDs](#applyoperationids) - Apply operation ID suggestions and download result.
* [suggestOperationIDs](#suggestoperationids) - Generate operation ID suggestions.
* [suggestOperationIDsRegistry](#suggestoperationidsregistry) - Generate operation ID suggestions.

## applyOperationIDs

Apply operation ID suggestions and download result.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

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
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError e) {
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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ApplyOperationIDsRequest](../../models/operations/ApplyOperationIDsRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ApplyOperationIDsResponse](../../models/operations/ApplyOperationIDsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## suggestOperationIDs

Get suggestions from an LLM model for improving the operationIDs in the provided schema.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            SuggestOperationIDsRequest req = SuggestOperationIDsRequest.builder()
                .requestBody(SuggestOperationIDsRequestBody.builder()
                        .schema(Schema.builder()
                                .content("0xb2de88c98a".getBytes())
                                .fileName("<value>")
                                .build())
                        .build())
                .xSessionId("<value>")
                .build();

            SuggestOperationIDsResponse res = sdk.suggest().suggestOperationIDs()
                .request(req)
                .call();

            if (res.suggestedOperationIDs().isPresent()) {
                // handle response
            }
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError e) {
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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsRequest](../../models/operations/SuggestOperationIDsRequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


### Response

**[io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsResponse](../../models/operations/SuggestOperationIDsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## suggestOperationIDsRegistry

Get suggestions from an LLM model for improving the operationIDs in the provided schema.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            SuggestOperationIDsRegistryRequest req = SuggestOperationIDsRegistryRequest.builder()
                .namespaceName("<value>")
                .revisionReference("<value>")
                .xSessionId("<value>")
                .build();

            SuggestOperationIDsRegistryResponse res = sdk.suggest().suggestOperationIDsRegistry()
                .request(req)
                .call();

            if (res.suggestedOperationIDs().isPresent()) {
                // handle response
            }
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError e) {
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

| Parameter                                                                                                                                                            | Type                                                                                                                                                                 | Required                                                                                                                                                             | Description                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                            | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsRegistryRequest](../../models/operations/SuggestOperationIDsRegistryRequest.md) | :heavy_check_mark:                                                                                                                                                   | The request object to use for the request.                                                                                                                           |


### Response

**[io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsRegistryResponse](../../models/operations/SuggestOperationIDsRegistryResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
