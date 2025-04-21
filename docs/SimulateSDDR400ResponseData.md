

# SimulateSDDR400ResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **Integer** |  |  [optional] |
|**debitorIban** | **String** |  |  [optional] |
|**amount** | **String** |  |  [optional] |
|**mandateId** | **String** |  |  [optional] |
|**typeReject** | [**TypeRejectEnum**](#TypeRejectEnum) |  |  [optional] |
|**typeSDD** | [**TypeSDDEnum**](#TypeSDDEnum) |  |  [optional] |
|**sci** | **String** |  |  [optional] |
|**nbTxs** | **Integer** |  |  [optional] |



## Enum: TypeRejectEnum

| Name | Value |
|---- | -----|
| REJECTED | &quot;rejected&quot; |
| RETURNED | &quot;returned&quot; |
| REFUNDED | &quot;refunded&quot; |
| TODAY | &quot;today&quot; |



## Enum: TypeSDDEnum

| Name | Value |
|---- | -----|
| CORE | &quot;CORE&quot; |
| B2_B | &quot;B2B&quot; |



