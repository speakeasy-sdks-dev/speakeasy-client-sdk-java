# Events
(*events()*)

## Overview

REST APIs for capturing event data

### Available Operations

* [getWorkspaceEventsByTarget](#getworkspaceeventsbytarget) - Load recent events for a particular workspace
* [getWorkspaceTargets](#getworkspacetargets) - Load targets for a particular workspace
* [postWorkspaceEvents](#postworkspaceevents) - Post events for a specific workspace
* [searchWorkspaceEvents](#searchworkspaceevents) - Search events for a particular workspace by any field

## getWorkspaceEventsByTarget

Load recent events for a particular workspace

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceEventsByTargetRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceEventsByTargetResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetWorkspaceEventsByTargetRequest req = GetWorkspaceEventsByTargetRequest.builder()
                .targetID("<value>")
                .build();

        GetWorkspaceEventsByTargetResponse res = sdk.events().getWorkspaceEventsByTarget()
                .request(req)
                .call();

        if (res.cliEventBatch().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetWorkspaceEventsByTargetRequest](../../models/operations/GetWorkspaceEventsByTargetRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetWorkspaceEventsByTargetResponse](../../models/operations/GetWorkspaceEventsByTargetResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 5XX                    | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getWorkspaceTargets

Load targets for a particular workspace

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceTargetsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceTargetsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetWorkspaceTargetsRequest req = GetWorkspaceTargetsRequest.builder()
                .build();

        GetWorkspaceTargetsResponse res = sdk.events().getWorkspaceTargets()
                .request(req)
                .call();

        if (res.targetSDKList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetWorkspaceTargetsRequest](../../models/operations/GetWorkspaceTargetsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetWorkspaceTargetsResponse](../../models/operations/GetWorkspaceTargetsResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 5XX                    | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## postWorkspaceEvents

Sends an array of events to be stored for a particular workspace.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.PostWorkspaceEventsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.PostWorkspaceEventsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.CliEvent;
import dev.speakeasyapi.javaclientsdk.models.shared.InteractionType;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PostWorkspaceEventsRequest req = PostWorkspaceEventsRequest.builder()
                .requestBody(List.of(
                    CliEvent.builder()
                        .createdAt(OffsetDateTime.parse("2024-11-21T06:58:41.592Z"))
                        .executionId("<value>")
                        .id("<id>")
                        .interactionType(InteractionType.RUN)
                        .localStartedAt(OffsetDateTime.parse("2023-02-23T15:36:59.809Z"))
                        .speakeasyApiKeyName("<value>")
                        .speakeasyVersion("<value>")
                        .success(false)
                        .workspaceId("<value>")
                        .build()))
                .build();

        PostWorkspaceEventsResponse res = sdk.events().postWorkspaceEvents()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PostWorkspaceEventsRequest](../../models/operations/PostWorkspaceEventsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PostWorkspaceEventsResponse](../../models/operations/PostWorkspaceEventsResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 5XX                    | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## searchWorkspaceEvents

Search events for a particular workspace by any field

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.SearchWorkspaceEventsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.SearchWorkspaceEventsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        SearchWorkspaceEventsRequest req = SearchWorkspaceEventsRequest.builder()
                .build();

        SearchWorkspaceEventsResponse res = sdk.events().searchWorkspaceEvents()
                .request(req)
                .call();

        if (res.cliEventBatch().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [SearchWorkspaceEventsRequest](../../models/operations/SearchWorkspaceEventsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[SearchWorkspaceEventsResponse](../../models/operations/SearchWorkspaceEventsResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 5XX                    | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
