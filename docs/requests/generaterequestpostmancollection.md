# generateRequestPostmanCollection
Available in: `requests`

Generates a Postman collection for a particular request. 
Allowing it to be replayed with the same inputs that were captured by the SDK.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("incidunt") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GenerateRequestPostmanCollectionRequest req = new GenerateRequestPostmanCollectionRequest("enim");            

            GenerateRequestPostmanCollectionResponse res = sdk.requests.generateRequestPostmanCollection(req);

            if (res.postmanCollection != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```