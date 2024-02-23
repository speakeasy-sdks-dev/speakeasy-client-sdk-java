# GetWorkspaceAccessRequest


## Fields

| Field                                        | Type                                         | Required                                     | Description                                  |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| `genLockId`                                  | *Optional<? extends String>*                 | :heavy_minus_sign:                           | Unique identifier of the generation target.  |
| `passive`                                    | *Optional<? extends Boolean>*                | :heavy_minus_sign:                           | Skip side-effects like incrementing metrics. |
| `targetType`                                 | *Optional<? extends String>*                 | :heavy_minus_sign:                           | The type of the generated target.            |