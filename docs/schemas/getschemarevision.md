# getSchemaRevision
Available in: `schemas`

Returns information about the last uploaded schema for a particular schema revision. 
This won't include the schema itself, that can be retrieved via the downloadSchema operation.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("necessitatibus") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetSchemaRevisionRequest req = new GetSchemaRevisionRequest("sint", "officia", "dolor");            

            GetSchemaRevisionResponse res = sdk.schemas.getSchemaRevision(req);

            if (res.schema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```