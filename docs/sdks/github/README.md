# Github
(*github()*)

## Overview

### Available Operations

* [checkAccess](#checkaccess)
* [configureCodeSamples](#configurecodesamples)
* [configureMintlifyRepo](#configuremintlifyrepo)
* [configureTarget](#configuretarget)
* [fetchPublishingPRs](#fetchpublishingprs)
* [getAction](#getaction)
* [githubCheckPublishingSecrets](#githubcheckpublishingsecrets)
* [githubStorePublishingSecrets](#githubstorepublishingsecrets)
* [triggerAction](#triggeraction)

## checkAccess

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.SDKError;
import dev.speakeasyapi.javaclientsdk.models.operations.CheckAccessRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.CheckAccessResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            CheckAccessRequest req = CheckAccessRequest.builder()
                .org("<value>")
                .repo("<value>")
                .build();

            CheckAccessResponse res = sdk.github().checkAccess()
                .request(req)
                .call();

            // handle response
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [CheckAccessRequest](../../models/operations/CheckAccessRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[CheckAccessResponse](../../models/operations/CheckAccessResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## configureCodeSamples

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.SDKError;
import dev.speakeasyapi.javaclientsdk.models.operations.ConfigureCodeSamplesResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.GithubConfigureCodeSamplesRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            GithubConfigureCodeSamplesRequest req = GithubConfigureCodeSamplesRequest.builder()
                .org("<value>")
                .repo("<value>")
                .targetName("<value>")
                .build();

            ConfigureCodeSamplesResponse res = sdk.github().configureCodeSamples()
                .request(req)
                .call();

            if (res.githubConfigureCodeSamplesResponse().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GithubConfigureCodeSamplesRequest](../../models/shared/GithubConfigureCodeSamplesRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ConfigureCodeSamplesResponse](../../models/operations/ConfigureCodeSamplesResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## configureMintlifyRepo

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.SDKError;
import dev.speakeasyapi.javaclientsdk.models.operations.ConfigureMintlifyRepoResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.GithubConfigureMintlifyRepoRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            GithubConfigureMintlifyRepoRequest req = GithubConfigureMintlifyRepoRequest.builder()
                .input("<value>")
                .org("<value>")
                .overlays(List.of(
                    "<value>"))
                .repo("<value>")
                .build();

            ConfigureMintlifyRepoResponse res = sdk.github().configureMintlifyRepo()
                .request(req)
                .call();

            // handle response
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GithubConfigureMintlifyRepoRequest](../../models/shared/GithubConfigureMintlifyRepoRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ConfigureMintlifyRepoResponse](../../models/operations/ConfigureMintlifyRepoResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## configureTarget

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.SDKError;
import dev.speakeasyapi.javaclientsdk.models.operations.ConfigureTargetResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.GithubConfigureTargetRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            GithubConfigureTargetRequest req = GithubConfigureTargetRequest.builder()
                .org("<value>")
                .repoName("<value>")
                .build();

            ConfigureTargetResponse res = sdk.github().configureTarget()
                .request(req)
                .call();

            // handle response
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GithubConfigureTargetRequest](../../models/shared/GithubConfigureTargetRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ConfigureTargetResponse](../../models/operations/ConfigureTargetResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## fetchPublishingPRs

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.SDKError;
import dev.speakeasyapi.javaclientsdk.models.operations.FetchPublishingPRsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.FetchPublishingPRsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            FetchPublishingPRsRequest req = FetchPublishingPRsRequest.builder()
                .generateGenLockId("<value>")
                .org("<value>")
                .repo("<value>")
                .build();

            FetchPublishingPRsResponse res = sdk.github().fetchPublishingPRs()
                .request(req)
                .call();

            if (res.githubPublishingPRResponse().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [FetchPublishingPRsRequest](../../models/operations/FetchPublishingPRsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[FetchPublishingPRsResponse](../../models/operations/FetchPublishingPRsResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getAction

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.SDKError;
import dev.speakeasyapi.javaclientsdk.models.operations.GetActionRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetActionResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            GetActionRequest req = GetActionRequest.builder()
                .org("<value>")
                .repo("<value>")
                .build();

            GetActionResponse res = sdk.github().getAction()
                .request(req)
                .call();

            if (res.githubGetActionResponse().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetActionRequest](../../models/operations/GetActionRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetActionResponse](../../models/operations/GetActionResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## githubCheckPublishingSecrets

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.SDKError;
import dev.speakeasyapi.javaclientsdk.models.operations.GithubCheckPublishingSecretsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GithubCheckPublishingSecretsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            GithubCheckPublishingSecretsRequest req = GithubCheckPublishingSecretsRequest.builder()
                .generateGenLockId("<value>")
                .build();

            GithubCheckPublishingSecretsResponse res = sdk.github().githubCheckPublishingSecrets()
                .request(req)
                .call();

            if (res.githubMissingPublishingSecretsResponse().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [GithubCheckPublishingSecretsRequest](../../models/operations/GithubCheckPublishingSecretsRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[GithubCheckPublishingSecretsResponse](../../models/operations/GithubCheckPublishingSecretsResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## githubStorePublishingSecrets

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.SDKError;
import dev.speakeasyapi.javaclientsdk.models.operations.GithubStorePublishingSecretsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.GithubStorePublishingSecretsRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            GithubStorePublishingSecretsRequest req = GithubStorePublishingSecretsRequest.builder()
                .generateGenLockId("<value>")
                .build();

            GithubStorePublishingSecretsResponse res = sdk.github().githubStorePublishingSecrets()
                .request(req)
                .call();

            // handle response
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GithubStorePublishingSecretsRequest](../../models/shared/GithubStorePublishingSecretsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GithubStorePublishingSecretsResponse](../../models/operations/GithubStorePublishingSecretsResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## triggerAction

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.SDKError;
import dev.speakeasyapi.javaclientsdk.models.operations.TriggerActionResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.GithubTriggerActionRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            GithubTriggerActionRequest req = GithubTriggerActionRequest.builder()
                .genLockId("<value>")
                .org("<value>")
                .repoName("<value>")
                .build();

            TriggerActionResponse res = sdk.github().triggerAction()
                .request(req)
                .call();

            // handle response
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GithubTriggerActionRequest](../../models/shared/GithubTriggerActionRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[TriggerActionResponse](../../models/operations/TriggerActionResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
