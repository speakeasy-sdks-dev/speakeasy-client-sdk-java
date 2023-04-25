# getAllApiVersions
Available in: `apis`

Get all Api versions for a particular ApiEndpoint.
Supports filtering the versions based on metadata attributes.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsOp;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("esse") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetAllApiVersionsRequest req = new GetAllApiVersionsRequest("ipsum") {{
                metadata = new java.util.HashMap<String, String[]>() {{
                    put("aspernatur", new String[]{{
                        add("ad"),
                    }});
                    put("natus", new String[]{{
                        add("iste"),
                    }});
                    put("dolor", new String[]{{
                        add("laboriosam"),
                        add("hic"),
                        add("saepe"),
                    }});
                }};
                op = new GetAllApiVersionsOp(false);;
            }};            

            GetAllApiVersionsResponse res = sdk.apis.getAllApiVersions(req);

            if (res.apis != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```