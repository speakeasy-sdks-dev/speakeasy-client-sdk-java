# upsertPlugin
Available in: `plugins`

Upsert a plugin

## Example Usage
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
                .setSecurity(new Security("pariatur") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            dev.speakeasyapi.javaclientsdk.models.shared.Plugin req = new Plugin("modi", "praesentium", "rem", "voluptates") {{
                createdAt = OffsetDateTime.parse("2022-01-29T18:39:33.469Z");
                evalHash = "sint";
                updatedAt = OffsetDateTime.parse("2022-01-26T19:21:55.034Z");
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