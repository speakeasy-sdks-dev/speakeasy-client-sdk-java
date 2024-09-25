# Organizations
(*organizations()*)

## Overview

### Available Operations

* [createFreeTrial](#createfreetrial) - Create a free trial for an organization
* [getOrganization](#getorganization) - Get organization
* [getOrganizationUsage](#getorganizationusage) - Get billing usage summary for a particular organization
* [getOrganizations](#getorganizations) - Get organizations for a user

## createFreeTrial

Creates a free trial for an organization

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.CreateFreeTrialResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateFreeTrialResponse res = sdk.organizations().createFreeTrial()
                .call();

        // handle response
    }
}
```

### Response

**[CreateFreeTrialResponse](../../models/operations/CreateFreeTrialResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getOrganization

Get information about a particular organization.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetOrganizationRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetOrganizationResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetOrganizationRequest req = GetOrganizationRequest.builder()
                .organizationID("<id>")
                .build();

        GetOrganizationResponse res = sdk.organizations().getOrganization()
                .request(req)
                .call();

        if (res.organization().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetOrganizationRequest](../../models/operations/GetOrganizationRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetOrganizationResponse](../../models/operations/GetOrganizationResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getOrganizationUsage

Returns a billing usage summary by target languages for a particular organization

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetOrganizationUsageResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetOrganizationUsageResponse res = sdk.organizations().getOrganizationUsage()
                .call();

        if (res.organizationUsageResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetOrganizationUsageResponse](../../models/operations/GetOrganizationUsageResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getOrganizations

Returns a list of organizations a user has access too

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetOrganizationsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetOrganizationsResponse res = sdk.organizations().getOrganizations()
                .call();

        if (res.organizations().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetOrganizationsResponse](../../models/operations/GetOrganizationsResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
