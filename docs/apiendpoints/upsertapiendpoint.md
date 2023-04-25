# upsertApiEndpoint
Available in: `apiEndpoints`

Upsert an ApiEndpoint. If the ApiEndpoint does not exist it will be created, otherwise it will be updated.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiEndpointResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpointInput;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("totam") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            UpsertApiEndpointRequest req = new UpsertApiEndpointRequest(                new ApiEndpointInput("porro", "dolorum", "dicta", "nam", "officia", "occaecati");, "fugit", "deleniti", "hic");            

            UpsertApiEndpointResponse res = sdk.apiEndpoints.upsertApiEndpoint(req);

            if (res.apiEndpoint != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```