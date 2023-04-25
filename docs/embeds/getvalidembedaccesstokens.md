# getValidEmbedAccessTokens
Available in: `embeds`

Get all valid embed access tokens for the current workspace.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetValidEmbedAccessTokensResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("vitae") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetValidEmbedAccessTokensResponse res = sdk.embeds.getValidEmbedAccessTokens();

            if (res.embedTokens != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```