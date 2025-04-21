

# GetRecallRs200ResponseRecallrsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**recallRSepaMessageId** | **Integer** |  |  [optional] |
|**cxlId** | **Integer** |  |  [optional] |
|**statusId** | [**StatusIdEnum**](#StatusIdEnum) | The status of the recall. See [Status](/guide/transfers/sepa-recalls.html#status-statusid) for more information.  |  [optional] |
|**statusLabel** | [**StatusLabelEnum**](#StatusLabelEnum) | The status of the recall. See [Status](/guide/transfers/sepa-recalls.html#status-statusid) for more information.  |  [optional] |
|**reasonCode** | [**ReasonCodeEnum**](#ReasonCodeEnum) | The type of recall. See [Types](/guide/transfers/sepa-recalls.html#types-of-recalls-reasoncode) for more information.  |  [optional] |
|**additionalInformation** | **String** |  |  [optional] |
|**clientId** | **Integer** |  |  [optional] |
|**userId** | **Integer** |  |  [optional] |
|**userTypeId** | **Integer** |  |  [optional] |
|**userName** | **String** |  |  [optional] |
|**userStatusId** | **Integer** |  |  [optional] |
|**walletId** | **Integer** |  |  [optional] |
|**walletStatusId** | **Integer** |  |  [optional] |
|**walletActivationDate** | **String** |  |  [optional] |
|**walletDesactivationDate** | **String** |  |  [optional] |
|**sctrAmount** | **String** |  |  [optional] |
|**sctrSettelmentDate** | **String** |  |  [optional] |
|**sctrDbtrIBAN** | **String** |  |  [optional] |
|**sctrDbtrBIC** | **String** |  |  [optional] |
|**sctrDbtrName** | **String** |  |  [optional] |
|**responseSepaMessageId** | **Integer** |  |  [optional] |
|**receivedDate** | **String** |  |  [optional] |
|**payinId** | **Integer** |  |  [optional] |
|**payinRefundId** | **Integer** |  |  [optional] |
|**responseType** | **Integer** |  |  [optional] |
|**negativeResponseReasonCode** | [**NegativeResponseReasonCodeEnum**](#NegativeResponseReasonCodeEnum) |  |  [optional] |
|**negativeResponseAdditionalInformation** | **String** |  |  [optional] |
|**responseComment** | **String** |  |  [optional] |
|**boResponse** | **Boolean** |  |  [optional] |
|**frozenWalletFollowingRecallr** | **Boolean** |  |  [optional] |
|**automaticResponse** | **String** |  |  [optional] |
|**comment** | **String** |  |  [optional] |
|**fraudConfirmed** | **Boolean** |  |  [optional] |
|**partialRefund** | **Boolean** |  |  [optional] |
|**inError** | **Boolean** |  |  [optional] |
|**createdDate** | **String** |  |  [optional] |
|**updatedDate** | **String** |  |  [optional] |



## Enum: StatusIdEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |



## Enum: StatusLabelEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| PENDING_PAYIN_REFUND_CREATED | &quot;PENDING_PAYIN_REFUND_CREATED&quot; |
| PENDING_ANSWER_REQUESTED | &quot;PENDING_ANSWER_REQUESTED&quot; |
| ACCEPTED | &quot;ACCEPTED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| CANCELED | &quot;CANCELED&quot; |
| IN_ERROR | &quot;IN_ERROR&quot; |



## Enum: ReasonCodeEnum

| Name | Value |
|---- | -----|
| DUPL | &quot;DUPL&quot; |
| TECH | &quot;TECH&quot; |
| FRAD | &quot;FRAD&quot; |
| CUST | &quot;CUST&quot; |
| AM09 | &quot;AM09&quot; |
| AC03 | &quot;AC03&quot; |



## Enum: NegativeResponseReasonCodeEnum

| Name | Value |
|---- | -----|
| CUST | &quot;CUST&quot; |
| LEGL | &quot;LEGL&quot; |
| AC04 | &quot;AC04&quot; |
| NOOR | &quot;NOOR&quot; |
| AM04 | &quot;AM04&quot; |
| NOAS | &quot;NOAS&quot; |
| ARDT | &quot;ARDT&quot; |



