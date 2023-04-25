# getSchemaDiff
Available in: `schemas`

Get a diff of two schema revisions for an Api.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("non") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetSchemaDiffRequest req = new GetSchemaDiffRequest("eligendi", "sint", "aliquid", "provident");            

            GetSchemaDiffResponse res = sdk.schemas.getSchemaDiff(req);

            if (res.schemaDiff != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```