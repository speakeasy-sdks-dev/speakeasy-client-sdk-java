# getApiEndpoint
Available in: `apiEndpoints`

Get an ApiEndpoint.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApiEndpointResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("molestiae") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetApiEndpointRequest req = new GetApiEndpointRequest("quod", "quod", "esse");            

            GetApiEndpointResponse res = sdk.apiEndpoints.getApiEndpoint(req);

            if (res.apiEndpoint != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```