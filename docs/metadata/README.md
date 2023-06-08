# metadata

## Overview

REST APIs for managing Version Metadata entities

### Available Operations

* [deleteVersionMetadata](#deleteversionmetadata) - Delete metadata for a particular apiID and versionID.
* [getVersionMetadata](#getversionmetadata) - Get all metadata for a particular apiID and versionID.
* [insertVersionMetadata](#insertversionmetadata) - Insert metadata for a particular apiID and versionID.

## deleteVersionMetadata

Delete metadata for a particular apiID and versionID.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("enim") {{
                    apiKey = "";
                }})
                .build();

            DeleteVersionMetadataRequest req = new DeleteVersionMetadataRequest("odit", "quo", "sequi", "tenetur");            

            DeleteVersionMetadataResponse res = sdk.metadata.deleteVersionMetadata(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getVersionMetadata

Get all metadata for a particular apiID and versionID.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("ipsam") {{
                    apiKey = "";
                }})
                .build();

            GetVersionMetadataRequest req = new GetVersionMetadataRequest("id", "possimus");            

            GetVersionMetadataResponse res = sdk.metadata.getVersionMetadata(req);

            if (res.versionMetadata != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## insertVersionMetadata

Insert metadata for a particular apiID and versionID.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.InsertVersionMetadataRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.InsertVersionMetadataResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import dev.speakeasyapi.javaclientsdk.models.shared.VersionMetadataInput;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("aut") {{
                    apiKey = "";
                }})
                .build();

            InsertVersionMetadataRequest req = new InsertVersionMetadataRequest(                new VersionMetadataInput("quasi", "error");, "temporibus", "laborum");            

            InsertVersionMetadataResponse res = sdk.metadata.insertVersionMetadata(req);

            if (res.versionMetadata != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
