

# SimulateSDDRRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**debitorIban** | **String** | IBAN or Virtual IBAN of the debited Wallet. |  [optional] |
|**amount** | **String** |  |  [optional] |
|**typeSDD** | [**TypeSDDEnum**](#TypeSDDEnum) |  |  [optional] |
|**typeReject** | [**TypeRejectEnum**](#TypeRejectEnum) | The type of error returned if the SDDR fails. Defaults to &#x60;rejected&#x60;.  |  [optional] |
|**sci** | **String** | The SEPA Credit Identifier of the user. In the case of simulation, this defaults to a random string. |  [optional] |
|**nbTxs** | **Integer** | The number of transactions for the SDD.  |  [optional] |
|**mandateId** | **String** | The unique identifier of the Mandate |  [optional] |
|**executeAfterParse** | [**ExecuteAfterParseEnum**](#ExecuteAfterParseEnum) |  |  [optional] |



## Enum: TypeSDDEnum

| Name | Value |
|---- | -----|
| CORE | &quot;CORE&quot; |
| B2_B | &quot;B2B&quot; |



## Enum: TypeRejectEnum

| Name | Value |
|---- | -----|
| REJECTED | &quot;rejected&quot; |
| RETURNED | &quot;returned&quot; |
| REFUNDED | &quot;refunded&quot; |
| TODAY | &quot;today&quot; |



## Enum: ExecuteAfterParseEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



