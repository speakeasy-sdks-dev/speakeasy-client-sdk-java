# apis

## Overview

REST APIs for managing Api entities

### Available Operations

* [deleteApi](#deleteapi) - Delete an Api.
* [generateOpenApiSpec](#generateopenapispec) - Generate an OpenAPI specification for a particular Api.
* [generatePostmanCollection](#generatepostmancollection) - Generate a Postman collection for a particular Api.
* [getAllApiVersions](#getallapiversions) - Get all Api versions for a particular ApiEndpoint.
* [getApis](#getapis) - Get a list of Apis for a given workspace
* [upsertApi](#upsertapi) - Upsert an Api

## deleteApi

Delete a particular version of an Api. The will also delete all associated ApiEndpoints, Metadata, Schemas & Request Logs (if using a Postgres datastore).

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("optio") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            DeleteApiRequest req = new DeleteApiRequest("totam", "beatae");            

            DeleteApiResponse res = sdk.apis.deleteApi(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## generateOpenApiSpec

This endpoint will generate any missing operations in any registered OpenAPI document if the operation does not already exist in the document.
Returns the original document and the newly generated document allowing a diff to be performed to see what has changed.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("commodi") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GenerateOpenApiSpecRequest req = new GenerateOpenApiSpecRequest("molestiae", "modi");            

            GenerateOpenApiSpecResponse res = sdk.apis.generateOpenApiSpec(req);

            if (res.generateOpenApiSpecDiff != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## generatePostmanCollection

Generates a postman collection containing all endpoints for a particular API. Includes variables produced for any path/query/header parameters included in the OpenAPI document.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("qui") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GeneratePostmanCollectionRequest req = new GeneratePostmanCollectionRequest("impedit", "cum");            

            GeneratePostmanCollectionResponse res = sdk.apis.generatePostmanCollection(req);

            if (res.postmanCollection != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getAllApiVersions

Get all Api versions for a particular ApiEndpoint.
Supports filtering the versions based on metadata attributes.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsOp;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("esse") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetAllApiVersionsRequest req = new GetAllApiVersionsRequest("ipsum") {{
                metadata = new java.util.HashMap<String, String[]>() {{
                    put("aspernatur", new String[]{{
                        add("ad"),
                    }});
                    put("natus", new String[]{{
                        add("iste"),
                    }});
                    put("dolor", new String[]{{
                        add("laboriosam"),
                        add("hic"),
                        add("saepe"),
                    }});
                }};
                op = new GetAllApiVersionsOp(false);;
            }};            

            GetAllApiVersionsResponse res = sdk.apis.getAllApiVersions(req);

            if (res.apis != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getApis

Get a list of all Apis and their versions for a given workspace.
Supports filtering the APIs based on metadata attributes.

### Example Usage

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
                .setSecurity(new Security("fuga") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetApisRequest req = new GetApisRequest() {{
                metadata = new java.util.HashMap<String, String[]>() {{
                    put("corporis", new String[]{{
                        add("iure"),
                        add("saepe"),
                        add("quidem"),
                    }});
                    put("architecto", new String[]{{
                        add("reiciendis"),
                    }});
                }};
                op = new GetApisOp(false);;
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

## upsertApi

Upsert an Api. If the Api does not exist, it will be created.
If the Api exists, it will be updated.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.ApiInput;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("est") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            UpsertApiRequest req = new UpsertApiRequest(                new ApiInput("mollitia", "laborum", "dolores") {{
                                metaData = new java.util.HashMap<String, String[]>() {{
                                    put("corporis", new String[]{{
                                        add("nobis"),
                                    }});
                                }};
                            }};, "enim");            

            UpsertApiResponse res = sdk.apis.upsertApi(req);

            if (res.api != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
