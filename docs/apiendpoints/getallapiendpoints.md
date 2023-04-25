# getAllApiEndpoints
Available in: `apiEndpoints`

Get all Api endpoints for a particular apiID.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiEndpointsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiEndpointsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("quo") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetAllApiEndpointsRequest req = new GetAllApiEndpointsRequest("odit");            

            GetAllApiEndpointsResponse res = sdk.apiEndpoints.getAllApiEndpoints(req);

            if (res.apiEndpoints != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```