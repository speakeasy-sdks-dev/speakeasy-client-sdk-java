# getAllForVersionApiEndpoints
Available in: `apiEndpoints`

Get all ApiEndpoints for a particular apiID and versionID.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllForVersionApiEndpointsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("at") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetAllForVersionApiEndpointsRequest req = new GetAllForVersionApiEndpointsRequest("at", "maiores");            

            GetAllForVersionApiEndpointsResponse res = sdk.apiEndpoints.getAllForVersionApiEndpoints(req);

            if (res.apiEndpoints != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```