# getVersionMetadata
Available in: `metadata`

Get all metadata for a particular apiID and versionID.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("ipsam") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetVersionMetadataRequest req = new GetVersionMetadataRequest("id", "possimus");            

            GetVersionMetadataResponse res = sdk.metadata.getVersionMetadata(req);

            if (res.versionMetadata != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```