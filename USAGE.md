<!-- Start SDK Example Usage -->
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
                .setSecurity(new Security("corrupti") {{
                    apiKey = "";
                }})
                .build();

            GetApisRequest req = new GetApisRequest() {{
                metadata = new java.util.HashMap<String, String[]>() {{
                    put("distinctio", new String[]{{
                        add("unde"),
                        add("nulla"),
                        add("corrupti"),
                        add("illum"),
                    }});
                    put("vel", new String[]{{
                        add("deserunt"),
                        add("suscipit"),
                        add("iure"),
                    }});
                    put("magnam", new String[]{{
                        add("ipsa"),
                        add("delectus"),
                        add("tempora"),
                        add("suscipit"),
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
<!-- End SDK Example Usage -->