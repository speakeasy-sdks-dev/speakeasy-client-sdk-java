# Plugins
(*plugins()*)

## Overview

REST APIs for managing and running plugins

### Available Operations

* [getPlugins](#getplugins) - Get all plugins for the current workspace.
* [runPlugin](#runplugin) - Run a plugin
* [upsertPlugin](#upsertplugin) - Upsert a plugin

## getPlugins

Get all plugins for the current workspace.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.*;
import dev.speakeasyapi.javaclientsdk.models.operations.GetPluginsResponse;
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
                .build();

            GetPluginsResponse res = sdk.plugins().getPlugins()
                .call();

            if (res.classes().isPresent()) {
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


### Response

**[Optional<? extends dev.speakeasyapi.javaclientsdk.models.operations.GetPluginsResponse>](../../models/operations/GetPluginsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## runPlugin

Run a plugin

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.*;
import dev.speakeasyapi.javaclientsdk.models.operations.RunPluginRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.RunPluginResponse;
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
                .build();

            RunPluginRequest req = RunPluginRequest.builder()
                .pluginID("string")
                .filters(Filters.builder()
                    .filters(java.util.List.of(
                            Filter.builder()
                                .key("string")
                                .operator("string")
                                .value("string")
                                .build()))
                    .limit(669298L)
                    .offset(94585L)
                    .operator("string")
                    .build())
                .build();

            RunPluginResponse res = sdk.plugins().runPlugin()
                .request(req)
                .call();

            if (res.classes().isPresent()) {
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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [dev.speakeasyapi.javaclientsdk.models.operations.RunPluginRequest](../../models/operations/RunPluginRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[Optional<? extends dev.speakeasyapi.javaclientsdk.models.operations.RunPluginResponse>](../../models/operations/RunPluginResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## upsertPlugin

Upsert a plugin

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.*;
import dev.speakeasyapi.javaclientsdk.models.operations.UpsertPluginResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.*;
import dev.speakeasyapi.javaclientsdk.models.shared.Plugin;
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
                .build();

            Plugin req = Plugin.builder()
                .code("string")
                .pluginId("string")
                .title("string")
                .workspaceId("string")
                .createdAt(OffsetDateTime.parse("2022-12-30T06:44:39.575Z"))
                .evalHash("string")
                .updatedAt(OffsetDateTime.parse("2024-08-18T02:22:14.384Z"))
                .build();

            UpsertPluginResponse res = sdk.plugins().upsertPlugin()
                .request(req)
                .call();

            if (res.plugin().isPresent()) {
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

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `request`                                                                            | [dev.speakeasyapi.javaclientsdk.models.shared.Plugin](../../models/shared/Plugin.md) | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |


### Response

**[Optional<? extends dev.speakeasyapi.javaclientsdk.models.operations.UpsertPluginResponse>](../../models/operations/UpsertPluginResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
