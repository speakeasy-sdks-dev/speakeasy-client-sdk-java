# deleteApiEndpoint
Available in: `apiEndpoints`

Delete an ApiEndpoint. This will also delete all associated Request Logs (if using a Postgres datastore).

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiEndpointResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("minus") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            DeleteApiEndpointRequest req = new DeleteApiEndpointRequest("placeat", "voluptatum", "iusto");            

            DeleteApiEndpointResponse res = sdk.apiEndpoints.deleteApiEndpoint(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```