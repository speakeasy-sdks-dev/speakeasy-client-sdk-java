# revokeEmbedAccessToken
Available in: `embeds`

Revoke an embed access EmbedToken.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.RevokeEmbedAccessTokenRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.RevokeEmbedAccessTokenResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("laborum") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            RevokeEmbedAccessTokenRequest req = new RevokeEmbedAccessTokenRequest("animi");            

            RevokeEmbedAccessTokenResponse res = sdk.embeds.revokeEmbedAccessToken(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```