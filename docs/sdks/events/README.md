# Events
(*events()*)

## Overview

REST APIs for capturing event data

### Available Operations

* [postWorkspaceEvents](#postworkspaceevents) - Post events for a specific workspace

## postWorkspaceEvents

Sends an array of events to be stored for a particular workspace.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.*;
import dev.speakeasyapi.javaclientsdk.models.operations.PostWorkspaceEventsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.PostWorkspaceEventsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.*;
import dev.speakeasyapi.javaclientsdk.models.shared.CliEvent;
import dev.speakeasyapi.javaclientsdk.models.shared.GenerateBumpType;
import dev.speakeasyapi.javaclientsdk.models.shared.InteractionType;
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

            PostWorkspaceEventsRequest req = PostWorkspaceEventsRequest.builder()
                .requestBody(java.util.List.of(
                        CliEvent.builder()
                            .createdAt(OffsetDateTime.parse("2023-10-28T06:47:51.791Z"))
                            .executionId("string")
                            .id("string")
                            .interactionType(InteractionType.CLI_EXEC)
                            .localStartedAt(OffsetDateTime.parse("2024-02-25T22:57:22.933Z"))
                            .speakeasyApiKeyName("string")
                            .speakeasyVersion("string")
                            .success(false)
                            .workspaceId("string")
                            .build()))
                .build();

            PostWorkspaceEventsResponse res = sdk.events().postWorkspaceEvents()
                .request(req)
                .call();

            // handle response

        } catch (dev.speakeasyapi.javaclientsdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [dev.speakeasyapi.javaclientsdk.models.operations.PostWorkspaceEventsRequest](../../models/operations/PostWorkspaceEventsRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[Optional<? extends dev.speakeasyapi.javaclientsdk.models.operations.PostWorkspaceEventsResponse>](../../models/operations/PostWorkspaceEventsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
