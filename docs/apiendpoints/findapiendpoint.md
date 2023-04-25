# findApiEndpoint
Available in: `apiEndpoints`

Find an ApiEndpoint via its displayName (set by operationId from a registered OpenAPI schema).
This is useful for finding the ID of an ApiEndpoint to use in the /v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID} endpoints.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.FindApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.FindApiEndpointResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("excepturi") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            FindApiEndpointRequest req = new FindApiEndpointRequest("nisi", "recusandae", "temporibus");            

            FindApiEndpointResponse res = sdk.apiEndpoints.findApiEndpoint(req);

            if (res.apiEndpoint != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```