

# PutScaWalletRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lockReason** | [**LockReasonEnum**](#LockReasonEnum) | The reason for locking the Wallet. |  |
|**lockMessage** | **String** |  |  [optional] |



## Enum: LockReasonEnum

| Name | Value |
|---- | -----|
| FRAUDULENT_USE_SUSPECTED_BY_CLIENT | &quot;FRAUDULENT_USE_SUSPECTED_BY_CLIENT&quot; |
| FRAUDULENT_USE_SUSPECTED_BY_ISSUER | &quot;FRAUDULENT_USE_SUSPECTED_BY_ISSUER&quot; |
| INCIDENT | &quot;INCIDENT&quot; |
| ISSUER | &quot;ISSUER&quot; |
| LOST_DEVICE | &quot;LOST_DEVICE&quot; |
| STOLEN_DEVICE | &quot;STOLEN_DEVICE&quot; |
| TERMINATE_SERVICE | &quot;TERMINATE_SERVICE&quot; |



