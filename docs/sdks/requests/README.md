# Requests
(*requests()*)

## Overview

REST APIs for retrieving request information

### Available Operations

* [generateRequestPostmanCollection](#generaterequestpostmancollection) - Generate a Postman collection for a particular request.
* [getRequestFromEventLog](#getrequestfromeventlog) - Get information about a particular request.
* [queryEventLog](#queryeventlog) - Query the event log to retrieve a list of requests.

## generateRequestPostmanCollection

Generates a Postman collection for a particular request. 
Allowing it to be replayed with the same inputs that were captured by the SDK.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.*;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.*;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("string")
                .build();

            GenerateRequestPostmanCollectionRequest req = GenerateRequestPostmanCollectionRequest.builder()
                .requestID("string")
                .build();

            GenerateRequestPostmanCollectionResponse res = sdk.requests().generateRequestPostmanCollection()
                .request(req)
                .call();

            if (res.postmanCollection().isPresent()) {
                // handle response
            }

        } catch (dev.speakeasyapi.javaclientsdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                      | [dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionRequest](../../models/operations/GenerateRequestPostmanCollectionRequest.md) | :heavy_check_mark:                                                                                                                                             | The request object to use for the request.                                                                                                                     |


### Response

**[Optional<? extends dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionResponse>](../../models/operations/GenerateRequestPostmanCollectionResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getRequestFromEventLog

Get information about a particular request.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.*;
import dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.*;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("string")
                .build();

            GetRequestFromEventLogRequest req = GetRequestFromEventLogRequest.builder()
                .requestID("string")
                .build();

            GetRequestFromEventLogResponse res = sdk.requests().getRequestFromEventLog()
                .request(req)
                .call();

            if (res.unboundedRequest().isPresent()) {
                // handle response
            }

        } catch (dev.speakeasyapi.javaclientsdk.models.errors.SDKError e) {
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
| `request`                                                                                                                                  | [dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogRequest](../../models/operations/GetRequestFromEventLogRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[Optional<? extends dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogResponse>](../../models/operations/GetRequestFromEventLogResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## queryEventLog

Supports retrieving a list of request captured by the SDK for this workspace.
Allows the filtering of requests on a number of criteria such as ApiID, VersionID, Path, Method, etc.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.*;
import dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.*;
import dev.speakeasyapi.javaclientsdk.models.shared.Filter;
import dev.speakeasyapi.javaclientsdk.models.shared.Filters;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("string")
                .build();

            QueryEventLogRequest req = QueryEventLogRequest.builder()
                .filters(Filters.builder()
                    .filters(java.util.List.of(
                            Filter.builder()
                                .key("string")
                                .operator("string")
                                .value("string")
                                .build()))
                    .limit(241978L)
                    .offset(451388L)
                    .operator("string")
                    .build())
                .build();

            QueryEventLogResponse res = sdk.requests().queryEventLog()
                .request(req)
                .call();

            if (res.boundedRequests().isPresent()) {
                // handle response
            }

        } catch (dev.speakeasyapi.javaclientsdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogRequest](../../models/operations/QueryEventLogRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[Optional<? extends dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogResponse>](../../models/operations/QueryEventLogResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
