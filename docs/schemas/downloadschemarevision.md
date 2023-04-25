# downloadSchemaRevision
Available in: `schemas`

Download a particular schema revision for an Api.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("excepturi") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            DownloadSchemaRevisionRequest req = new DownloadSchemaRevisionRequest("tempora", "facilis", "tempore");            

            DownloadSchemaRevisionResponse res = sdk.schemas.downloadSchemaRevision(req);

            if (res.schema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```