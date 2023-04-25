# getApis
Available in: `apis`

Get a list of all Apis and their versions for a given workspace.
Supports filtering the APIs based on metadata attributes.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisOp;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("fuga") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetApisRequest req = new GetApisRequest() {{
                metadata = new java.util.HashMap<String, String[]>() {{
                    put("corporis", new String[]{{
                        add("iure"),
                        add("saepe"),
                        add("quidem"),
                    }});
                    put("architecto", new String[]{{
                        add("reiciendis"),
                    }});
                }};
                op = new GetApisOp(false);;
            }};            

            GetApisResponse res = sdk.apis.getApis(req);

            if (res.apis != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```