# getEmbedAccessToken
Available in: `embeds`

Returns an embed access token for the current workspace. This can be used to authenticate access to externally embedded content.
Filters can be applied allowing views to be filtered to things like particular customerIds.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetEmbedAccessTokenRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetEmbedAccessTokenResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Filter;
import dev.speakeasyapi.javaclientsdk.models.shared.Filters;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("omnis") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetEmbedAccessTokenRequest req = new GetEmbedAccessTokenRequest() {{
                description = "nemo";
                duration = 325047L;
                filters = new Filters(                new dev.speakeasyapi.javaclientsdk.models.shared.Filter[]{{
                                    add(new Filter("doloribus", "sapiente", "architecto") {{
                                        key = "accusantium";
                                        operator = "iure";
                                        value = "culpa";
                                    }}),
                                    add(new Filter("consequuntur", "repellat", "mollitia") {{
                                        key = "mollitia";
                                        operator = "dolorem";
                                        value = "culpa";
                                    }}),
                                    add(new Filter("quam", "molestiae", "velit") {{
                                        key = "occaecati";
                                        operator = "numquam";
                                        value = "commodi";
                                    }}),
                                }}, 623510L, 158969L, "quis");;
            }};            

            GetEmbedAccessTokenResponse res = sdk.embeds.getEmbedAccessToken(req);

            if (res.embedAccessTokenResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```