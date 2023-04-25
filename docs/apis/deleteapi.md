# deleteApi
Available in: `apis`

Delete a particular version of an Api. The will also delete all associated ApiEndpoints, Metadata, Schemas & Request Logs (if using a Postgres datastore).

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("optio") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            DeleteApiRequest req = new DeleteApiRequest("totam", "beatae");            

            DeleteApiResponse res = sdk.apis.deleteApi(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```