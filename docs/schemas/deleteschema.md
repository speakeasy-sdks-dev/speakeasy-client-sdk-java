# deleteSchema
Available in: `schemas`

Delete a particular schema revision for an Api.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("perferendis") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            DeleteSchemaRequest req = new DeleteSchemaRequest("magni", "assumenda", "ipsam");            

            DeleteSchemaResponse res = sdk.schemas.deleteSchema(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```