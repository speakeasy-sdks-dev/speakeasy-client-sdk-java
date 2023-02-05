<!-- Start SDK Example Usage -->
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK.Builder builder = SDK.builder();

            builder.setSecurity(
                new Security() {{
                    apiKey = new SchemeAPIKey() {{
                        apiKey = "YOUR_API_KEY_HERE";
                    }};
                }}
            );

            SDK sdk = builder.build();

            GetApisRequest req = new GetApisRequest() {{
                queryParams = new GetApisQueryParams() {{
                    metadata = new java.util.HashMap<String, String[]>() {{
                        put("deserunt", new String[]() {{
                            add("nulla"),
                            add("id"),
                            add("vero"),
                        }});
                        put("perspiciatis", new String[]() {{
                            add("nihil"),
                            add("fuga"),
                            add("facilis"),
                            add("eum"),
                        }});
                        put("iusto", new String[]() {{
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