# insertVersionMetadata
Available in: `metadata`

Insert metadata for a particular apiID and versionID.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.InsertVersionMetadataRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.InsertVersionMetadataResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import dev.speakeasyapi.javaclientsdk.models.shared.VersionMetadataInput;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("aut") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            InsertVersionMetadataRequest req = new InsertVersionMetadataRequest(                new VersionMetadataInput("quasi", "error");, "temporibus", "laborum");            

            InsertVersionMetadataResponse res = sdk.metadata.insertVersionMetadata(req);

            if (res.versionMetadata != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```