# requests

## Overview

REST APIs for retrieving request information

### Available Operations

* [generateRequestPostmanCollection](#generaterequestpostmancollection) - Generate a Postman collection for a particular request.
* [getRequestFromEventLog](#getrequestfromeventlog) - Get information about a particular request.
* [queryEventLog](#queryeventlog) - Query the event log to retrieve a list of requests.

## generateRequestPostmanCollection

Generates a Postman collection for a particular request. 
Allowing it to be replayed with the same inputs that were captured by the SDK.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("incidunt") {{
                    apiKey = "";
                }})
                .build();

            GenerateRequestPostmanCollectionRequest req = new GenerateRequestPostmanCollectionRequest("enim");            

            GenerateRequestPostmanCollectionResponse res = sdk.requests.generateRequestPostmanCollection(req);

            if (res.postmanCollection != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getRequestFromEventLog

Get information about a particular request.

### Example Usage

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
                    apiKey = "";
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

## queryEventLog

Supports retrieving a list of request captured by the SDK for this workspace.
Allows the filtering of requests on a number of criteria such as ApiID, VersionID, Path, Method, etc.

### Example Usage

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
                    apiKey = "";
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
