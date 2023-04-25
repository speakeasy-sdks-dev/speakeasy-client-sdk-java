# generatePostmanCollection
Available in: `apis`

Generates a postman collection containing all endpoints for a particular API. Includes variables produced for any path/query/header parameters included in the OpenAPI document.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("qui") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GeneratePostmanCollectionRequest req = new GeneratePostmanCollectionRequest("impedit", "cum");            

            GeneratePostmanCollectionResponse res = sdk.apis.generatePostmanCollection(req);

            if (res.postmanCollection != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```