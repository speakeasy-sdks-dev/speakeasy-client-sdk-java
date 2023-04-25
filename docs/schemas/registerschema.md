# registerSchema
Available in: `schemas`

Allows uploading a schema for a particular API version.
This will be used to populate ApiEndpoints and used as a base for any schema generation if present.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaRequestBody;
import dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaRequestBodyFile;
import dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("in") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            RegisterSchemaRequest req = new RegisterSchemaRequest(                new RegisterSchemaRequestBody(                new RegisterSchemaRequestBodyFile("in".getBytes(), "illum"););, "maiores", "rerum");            

            RegisterSchemaResponse res = sdk.schemas.registerSchema(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```