# getSchemas
Available in: `schemas`

Returns information the schemas associated with a particular apiID. 
This won't include the schemas themselves, they can be retrieved via the downloadSchema operation.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("debitis") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetSchemasRequest req = new GetSchemasRequest("a", "dolorum");            

            GetSchemasResponse res = sdk.schemas.getSchemas(req);

            if (res.schemata != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```