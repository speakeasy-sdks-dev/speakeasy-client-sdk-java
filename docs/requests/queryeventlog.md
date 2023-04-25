# queryEventLog
Available in: `requests`

Supports retrieving a list of request captured by the SDK for this workspace.
Allows the filtering of requests on a number of criteria such as ApiID, VersionID, Path, Method, etc.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Filter;
import dev.speakeasyapi.javaclientsdk.models.shared.Filters;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("quibusdam") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            QueryEventLogRequest req = new QueryEventLogRequest() {{
                filters = new Filters(                new dev.speakeasyapi.javaclientsdk.models.shared.Filter[]{{
                                    add(new Filter("labore", "modi", "qui") {{
                                        key = "deserunt";
                                        operator = "distinctio";
                                        value = "quibusdam";
                                    }}),
                                }}, 397821L, 586513L, "quos");;
            }};            

            QueryEventLogResponse res = sdk.requests.queryEventLog(req);

            if (res.boundedRequests != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```