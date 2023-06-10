# GetAllApiVersionsRequest


## Fields

| Field                                                                 | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `apiID`                                                               | *String*                                                              | :heavy_check_mark:                                                    | The ID of the Api to retrieve.                                        |
| `metadata`                                                            | Map<String, List<*String*>>                                           | :heavy_minus_sign:                                                    | Metadata to filter Apis on                                            |
| `op`                                                                  | [GetAllApiVersionsOp](../../models/operations/GetAllApiVersionsOp.md) | :heavy_minus_sign:                                                    | Configuration for filter operations                                   |