# Events
(*events*)

## Overview

REST APIs for capturing event data

### Available Operations

* [postWorkspaceEvents](#postworkspaceevents) - Post events for a specific workspace

## postWorkspaceEvents

Sends an array of events to be stored for a particular workspace.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PostWorkspaceEventsRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PostWorkspaceEventsResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.CliEvent;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GenerateBumpType;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.InteractionType;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.time.OffsetDateTime;

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

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PostWorkspaceEventsRequest req = new PostWorkspaceEventsRequest(
                new io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.CliEvent[]{{
                    add(new CliEvent(
                    OffsetDateTime.parse("2023-10-28T06:47:51.791Z"),
                    "<value>",
                    "<value>",
                    InteractionType.CLI_EXEC,
                    OffsetDateTime.parse("2024-02-25T22:57:22.933Z"),
                    "<value>",
                    "<value>",
                    false,
                    "<value>"){{
                        createdAt = OffsetDateTime.parse("2024-11-21T06:58:42.120Z");
                        executionId = "<value>";
                        id = "<id>";
                        interactionType = InteractionType.CLI_EXEC;
                        localStartedAt = OffsetDateTime.parse("2024-05-07T12:35:47.182Z");
                        speakeasyApiKeyName = "<value>";
                        speakeasyVersion = "<value>";
                        success = false;
                        workspaceId = "<value>";
                    }}),
                }});

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PostWorkspaceEventsResponse res = sdk.events.postWorkspaceEvents(req);

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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PostWorkspaceEventsRequest](../../models/operations/PostWorkspaceEventsRequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


### Response

**[io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PostWorkspaceEventsResponse](../../models/operations/PostWorkspaceEventsResponse.md)**

