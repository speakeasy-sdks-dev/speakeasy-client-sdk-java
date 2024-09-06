# OrganizationUsageResponse

A billing summary of organization usage


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `allowedLanguages`                                                                        | List<*String*>                                                                            | :heavy_check_mark:                                                                        | List of allowed languages                                                                 |
| `freeTrialExpiry`                                                                         | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | Expiry date of the free trial, will be null if no trial                                   |
| `totalAllowedLanguages`                                                                   | *long*                                                                                    | :heavy_check_mark:                                                                        | Total number of allowed languages, -1 if unlimited                                        |
| `usage`                                                                                   | List<[OrganizationUsage](../../models/shared/OrganizationUsage.md)>                       | :heavy_check_mark:                                                                        | N/A                                                                                       |