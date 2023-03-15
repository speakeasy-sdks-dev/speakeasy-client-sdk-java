<!-- Start SDK Example Usage -->
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisOp;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisQueryParams;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKey = new SchemeAPIKey() {{
                        apiKey = "YOUR_API_KEY_HERE";
                    }};
                }})
                .build();

            GetApisRequest req = new GetApisRequest() {{
                queryParams = new GetApisQueryParams() {{
                    metadata = new java.util.HashMap<String, String[]>() {{
                        put("deserunt", new String[]{{
                            add("nulla"),
                            add("id"),
                            add("vero"),
                        }});
                        put("perspiciatis", new String[]{{
                            add("nihil"),
                            add("fuga"),
                            add("facilis"),
                            add("eum"),
                        }});
                        put("iusto", new String[]{{
                            add("saepe"),
                            add("inventore"),
                        }});
                    }};
                    op = new GetApisOp() {{
                        and = false;
                    }};
                }};
            }};            

            GetApisResponse res = sdk.apis.getApis(req);

            if (res.apis.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->