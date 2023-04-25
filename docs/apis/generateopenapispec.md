# generateOpenApiSpec
Available in: `apis`

This endpoint will generate any missing operations in any registered OpenAPI document if the operation does not already exist in the document.
Returns the original document and the newly generated document allowing a diff to be performed to see what has changed.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("commodi") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GenerateOpenApiSpecRequest req = new GenerateOpenApiSpecRequest("molestiae", "modi");            

            GenerateOpenApiSpecResponse res = sdk.apis.generateOpenApiSpec(req);

            if (res.generateOpenApiSpecDiff != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```