# getRequestFromEventLog
Available in: `requests`

Get information about a particular request.

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("consequatur") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetRequestFromEventLogRequest req = new GetRequestFromEventLogRequest("est");            

            GetRequestFromEventLogResponse res = sdk.requests.getRequestFromEventLog(req);

            if (res.unboundedRequest != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```