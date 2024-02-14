# Requests
(*requests*)

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

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateRequestPostmanCollectionRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateRequestPostmanCollectionResponse;
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

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateRequestPostmanCollectionRequest req = new GenerateRequestPostmanCollectionRequest(
                "<value>");

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateRequestPostmanCollectionResponse res = sdk.requests.generateRequestPostmanCollection(req);

            if (res.postmanCollection != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateRequestPostmanCollectionRequest](../../models/operations/GenerateRequestPostmanCollectionRequest.md) | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |


### Response

**[io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateRequestPostmanCollectionResponse](../../models/operations/GenerateRequestPostmanCollectionResponse.md)**


## getRequestFromEventLog

Get information about a particular request.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetRequestFromEventLogRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetRequestFromEventLogResponse;
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

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetRequestFromEventLogRequest req = new GetRequestFromEventLogRequest(
                "<value>");

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetRequestFromEventLogResponse res = sdk.requests.getRequestFromEventLog(req);

            if (res.unboundedRequest != null) {
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
| `request`                                                                                                                                                  | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetRequestFromEventLogRequest](../../models/operations/GetRequestFromEventLogRequest.md) | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |


### Response

**[io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetRequestFromEventLogResponse](../../models/operations/GetRequestFromEventLogResponse.md)**


## queryEventLog

Supports retrieving a list of request captured by the SDK for this workspace.
Allows the filtering of requests on a number of criteria such as ApiID, VersionID, Path, Method, etc.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.QueryEventLogRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.QueryEventLogResponse;
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

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.QueryEventLogRequest req = new QueryEventLogRequest(
){{
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
                    241978L,
                    451388L,
                    "<value>");

            }};

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.QueryEventLogResponse res = sdk.requests.queryEventLog(req);

            if (res.boundedRequests != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.QueryEventLogRequest](../../models/operations/QueryEventLogRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.QueryEventLogResponse](../../models/operations/QueryEventLogResponse.md)**

