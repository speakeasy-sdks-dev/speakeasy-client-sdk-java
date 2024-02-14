<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApisRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApisResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.QueryParamOp;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .setWorkspaceID("<value>")
                .build();

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApisRequest req = new GetApisRequest(
){{
                metadata = new java.util.HashMap<String, String[]>(
                ){{
                    put("key", new String[]{{
                        add("<value>"),
                    }});
                }};
                op = new QueryParamOp(
                    false);

            }};

            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApisResponse res = sdk.apis.getApis(req);

            if (res.apis != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->