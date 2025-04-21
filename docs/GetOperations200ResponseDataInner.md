

# GetOperations200ResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operationType** | [**OperationTypeEnum**](#OperationTypeEnum) | Type of operation.  |  [optional] |
|**amount** | [**GetOperations200ResponseDataInnerAmount**](GetOperations200ResponseDataInnerAmount.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | operation status |  [optional] |
|**walletId** | **Long** | ID of the wallet impacted |  [optional] |
|**direction** | [**DirectionEnum**](#DirectionEnum) | Direction of operation credit or debit |  [optional] |
|**objectId** | **Long** | The unique identifier of the Treezor object that contains the initial operation  |  [optional] |
|**label** | **String** | The tag attached to the operation |  [optional] |
|**metadata** | [**GetOperations200ResponseDataInnerMetadata**](GetOperations200ResponseDataInnerMetadata.md) |  |  [optional] |
|**date** | [**GetOperations200ResponseDataInnerDate**](GetOperations200ResponseDataInnerDate.md) |  |  [optional] |
|**initialFlow** | [**InitialFlowEnum**](#InitialFlowEnum) | Context about the technical conext of the initial operation. |  [optional] |



## Enum: OperationTypeEnum

| Name | Value |
|---- | -----|
| BANK_DIRECT_DEBIT | &quot;bankDirectDebit&quot; |
| BANK_TRANSFER | &quot;bankTransfer&quot; |
| CARD_TOPUP | &quot;cardTopup&quot; |
| CARD_TRANSACTION | &quot;cardTransaction&quot; |
| CHECK | &quot;check&quot; |
| CREDIT_NOTE | &quot;creditNote&quot; |
| FEES | &quot;fees&quot; |
| INT_BANK_TRANSFER | &quot;intBankTransfer&quot; |
| INSTANT_BANK_TRANSFER | &quot;instantBankTransfer&quot; |
| OTHER | &quot;other&quot; |
| PAYIN_REFUND | &quot;payinRefund&quot; |
| PAYOUT_REFUND | &quot;payoutRefund&quot; |
| TRANSFER_REFUND | &quot;transferRefund&quot; |
| WALLET_TRANSFER | &quot;walletTransfer&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| AUTHORIZED | &quot;AUTHORIZED&quot; |
| CANCELED | &quot;CANCELED&quot; |
| DECLINED | &quot;DECLINED&quot; |
| SETTLED | &quot;SETTLED&quot; |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| CREDIT | &quot;CREDIT&quot; |
| DEBIT | &quot;DEBIT&quot; |



## Enum: InitialFlowEnum

| Name | Value |
|---- | -----|
| CARD_TRANSACTION | &quot;cardTransaction&quot; |
| CHARGEBACK | &quot;chargeback&quot; |
| PAYIN | &quot;payin&quot; |
| PAYIN_REFUND | &quot;payinRefund&quot; |
| PAYOUT | &quot;payout&quot; |
| PAYOUT_REFUND | &quot;payoutRefund&quot; |
| TRANSFER | &quot;transfer&quot; |



