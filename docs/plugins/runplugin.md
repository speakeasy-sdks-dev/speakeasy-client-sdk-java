# runPlugin
Available in: `plugins`

Run a plugin

## Example Usage
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.RunPluginRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.RunPluginResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Filter;
import dev.speakeasyapi.javaclientsdk.models.shared.Filters;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("reiciendis") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            RunPluginRequest req = new RunPluginRequest("voluptatibus") {{
                filters = new Filters(                new dev.speakeasyapi.javaclientsdk.models.shared.Filter[]{{
                                    add(new Filter("ipsa", "omnis", "voluptate") {{
                                        key = "nihil";
                                        operator = "praesentium";
                                        value = "voluptatibus";
                                    }}),
                                    add(new Filter("reprehenderit", "ut", "maiores") {{
                                        key = "cum";
                                        operator = "perferendis";
                                        value = "doloremque";
                                    }}),
                                    add(new Filter("iusto", "dicta", "harum") {{
                                        key = "dicta";
                                        operator = "corporis";
                                        value = "dolore";
                                    }}),
                                    add(new Filter("repudiandae", "quae", "ipsum") {{
                                        key = "enim";
                                        operator = "accusamus";
                                        value = "commodi";
                                    }}),
                                }}, 692472L, 565189L, "excepturi");;
            }};            

            RunPluginResponse res = sdk.plugins.runPlugin(req);

            if (res.boundedRequests != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```