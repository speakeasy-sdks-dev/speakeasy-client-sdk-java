# getPlugins
Available in: `plugins`

Get all plugins for the current workspace.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetPluginsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("quasi") {{
                    apiKey = "YOUR_API_KEY_HERE";
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