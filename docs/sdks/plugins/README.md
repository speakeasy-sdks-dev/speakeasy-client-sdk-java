# Plugins

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
import dev.speakeasyapi.javaclientsdk.models.operations.GetPluginsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("corporis") {{
                    apiKey = "";
                }})
                .build();

            GetPluginsResponse res = sdk.plugins.getPlugins();

            if (res.plugins != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.GetPluginsResponse](../../models/operations/GetPluginsResponse.md)**


## runPlugin

Run a plugin

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.RunPluginRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.RunPluginResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Filter;
import dev.speakeasyapi.javaclientsdk.models.shared.Filters;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("explicabo") {{
                    apiKey = "";
                }})
                .build();

            RunPluginRequest req = new RunPluginRequest("nobis") {{
                filters = new Filters(                new dev.speakeasyapi.javaclientsdk.models.shared.Filter[]{{
                                    add(new Filter("minima", "excepturi", "accusantium") {{
                                        key = "enim";
                                        operator = "omnis";
                                        value = "nemo";
                                    }}),
                                }}, 438601L, 634274L, "doloribus");;
            }};            

            RunPluginResponse res = sdk.plugins.runPlugin(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [dev.speakeasyapi.javaclientsdk.models.operations.RunPluginRequest](../../models/operations/RunPluginRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.RunPluginResponse](../../models/operations/RunPluginResponse.md)**


## upsertPlugin

Upsert a plugin

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.UpsertPluginResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Plugin;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("sapiente") {{
                    apiKey = "";
                }})
                .build();

            dev.speakeasyapi.javaclientsdk.models.shared.Plugin req = new Plugin("architecto", "mollitia", "dolorem", "culpa") {{
                createdAt = OffsetDateTime.parse("2022-01-02T17:10:32.894Z");
                evalHash = "mollitia";
                updatedAt = OffsetDateTime.parse("2022-06-30T02:19:51.375Z");
            }};            

            UpsertPluginResponse res = sdk.plugins.upsertPlugin(req);

            if (res.plugin != null) {
                // handle response
            }
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

**[dev.speakeasyapi.javaclientsdk.models.operations.UpsertPluginResponse](../../models/operations/UpsertPluginResponse.md)**

