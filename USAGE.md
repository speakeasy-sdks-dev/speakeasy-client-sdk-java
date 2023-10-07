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
                .setSecurity(new Security("South"){{
                    apiKey = "";
                }})
                .build();

            GetApisRequest req = new GetApisRequest(){{
                metadata = new java.util.HashMap<String, String[]>(){{
                    put("Southwest", new String[]{{
                        add("Orleans"),
                    }});
                }};
                op = new GetApisOp(false);
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