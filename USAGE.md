<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.*;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse;
import dev.speakeasyapi.javaclientsdk.models.operations.QueryParamOp;
import dev.speakeasyapi.javaclientsdk.models.shared.*;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            GetApisRequest req = GetApisRequest.builder()
                .metadata(java.util.Map.ofEntries(
                    entry("key", java.util.List.of(
                        "string"))))
                .op(QueryParamOp.builder()
                    .and(false)
                    .build())
                .build();

            GetApisResponse res = sdk.apis().getApis()
                .request(req)
                .call();

            if (res.classes().isPresent()) {
                // handle response
            }

        } catch (dev.speakeasyapi.javaclientsdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->