# upsertApi
Available in: `apis`

Upsert an Api. If the Api does not exist, it will be created.
If the Api exists, it will be updated.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.ApiInput;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("est") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            UpsertApiRequest req = new UpsertApiRequest(                new ApiInput("mollitia", "laborum", "dolores") {{
                                metaData = new java.util.HashMap<String, String[]>() {{
                                    put("corporis", new String[]{{
                                        add("nobis"),
                                    }});
                                }};
                            }};, "enim");            

            UpsertApiResponse res = sdk.apis.upsertApi(req);

            if (res.api != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```