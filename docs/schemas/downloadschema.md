# downloadSchema
Available in: `schemas`

Download the latest schema for a particular apiID.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("alias") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            DownloadSchemaRequest req = new DownloadSchemaRequest("fugit", "dolorum");            

            DownloadSchemaResponse res = sdk.schemas.downloadSchema(req);

            if (res.schema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```