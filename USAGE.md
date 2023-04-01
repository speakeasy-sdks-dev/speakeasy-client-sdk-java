<!-- Start SDK Example Usage -->
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisOp;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetApisRequest req = new GetApisRequest() {{
                metadata = new java.util.HashMap<String, String[]>() {{
                    put("provident", new String[]{{
                        add("quibusdam"),
                        add("unde"),
                        add("nulla"),
                    }});
                    put("corrupti", new String[]{{
                        add("vel"),
                        add("error"),
                        add("deserunt"),
                        add("suscipit"),
                    }});
                    put("iure", new String[]{{
                        add("debitis"),
                        add("ipsa"),
                    }});
                }};
                op = new GetApisOp() {{
                    and = false;
                }};
            }}            

            GetApisResponse res = sdk.apis.getApis(req);

            if (res.apis.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->