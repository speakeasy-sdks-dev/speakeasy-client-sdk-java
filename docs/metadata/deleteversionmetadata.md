# deleteVersionMetadata
Available in: `metadata`

Delete metadata for a particular apiID and versionID.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("enim") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            DeleteVersionMetadataRequest req = new DeleteVersionMetadataRequest("odit", "quo", "sequi", "tenetur");            

            DeleteVersionMetadataResponse res = sdk.metadata.deleteVersionMetadata(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```