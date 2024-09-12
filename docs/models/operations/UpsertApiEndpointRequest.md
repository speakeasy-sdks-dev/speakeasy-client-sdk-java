# UpsertApiEndpointRequest


## Fields

| Field                                                       | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `apiEndpoint`                                               | [ApiEndpointInput](../../models/shared/ApiEndpointInput.md) | :heavy_check_mark:                                          | A JSON representation of the ApiEndpoint to upsert.         |
| `apiEndpointID`                                             | *String*                                                    | :heavy_check_mark:                                          | The ID of the ApiEndpoint to upsert.                        |
| `apiID`                                                     | *String*                                                    | :heavy_check_mark:                                          | The ID of the Api the ApiEndpoint belongs to.               |
| `versionID`                                                 | *String*                                                    | :heavy_check_mark:                                          | The version ID of the Api the ApiEndpoint belongs to.       |