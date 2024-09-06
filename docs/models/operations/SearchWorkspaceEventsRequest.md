# SearchWorkspaceEventsRequest


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `generateGenLockId`                                                 | *Optional<String>*                                                  | :heavy_minus_sign:                                                  | A specific gen lock ID for the events.                              |
| `interactionType`                                                   | [Optional<InteractionType>](../../models/shared/InteractionType.md) | :heavy_minus_sign:                                                  | Specified interaction type for events.                              |
| `lintReportDigest`                                                  | *Optional<String>*                                                  | :heavy_minus_sign:                                                  | Unique identifier of the lint report digest.                        |
| `openapiDiffReportDigest`                                           | *Optional<String>*                                                  | :heavy_minus_sign:                                                  | Unique identifier of the openapi diff report digest.                |
| `sourceRevisionDigest`                                              | *Optional<String>*                                                  | :heavy_minus_sign:                                                  | Unique identifier of the source revision digest.                    |
| `workspaceID`                                                       | *Optional<String>*                                                  | :heavy_minus_sign:                                                  | Unique identifier of the workspace.                                 |