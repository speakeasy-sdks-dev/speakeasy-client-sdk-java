<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApisRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApisResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.QueryParamOp;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("<value>")
                .build();

            GetApisRequest req = GetApisRequest.builder()
                .metadata(java.util.Map.ofEntries(
                    entry("key", java.util.List.of(
                        "<value>"))))
                .op(QueryParamOp.builder()
                    .and(false)
                    .build())
                .build();

            GetApisResponse res = sdk.apis().getApis()
                .request(req)
                .call();

            if (res.apis().isPresent()) {
                // handle response
            }
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->