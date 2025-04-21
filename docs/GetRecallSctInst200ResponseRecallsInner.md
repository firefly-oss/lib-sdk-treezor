

# GetRecallSctInst200ResponseRecallsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recallId** | **String** |  |  [optional] |
|**creationDateTIme** | **String** |  |  [optional] |
|**statusLabel** | [**StatusLabelEnum**](#StatusLabelEnum) | The status of the recall. See [Status](/guide/transfers/sepa-recalls.html#status-statuslabel) for more information.  |  [optional] |
|**cxlId** | **String** |  |  [optional] |
|**reasonCode** | [**ReasonCodeEnum**](#ReasonCodeEnum) | The type of recall. See [Types](/guide/transfers/sepa-recalls.html#types-of-recalls-reasoncode) for more information.  |  [optional] |
|**additionalInformation** | **String** |  |  [optional] |
|**sctrDbtrIBAN** | **String** |  |  [optional] |
|**sctrDbtrBIC** | **String** |  |  [optional] |
|**sctrDbtrName** | **String** |  |  [optional] |
|**sctrDbtrAddress** | **String** |  |  [optional] |
|**sctrDbtrCountry** | **String** |  |  [optional] |
|**sctrCdtrIBAN** | **String** |  |  [optional] |
|**sctrCdtrBIC** | **String** |  |  [optional] |
|**sctrCdtrName** | **String** |  |  [optional] |
|**sctrCdtrAddress** | **String** |  |  [optional] |
|**sctrCdtrCountry** | **String** |  |  [optional] |
|**sctrMsgId** | **String** |  |  [optional] |
|**sctrInstrId** | **String** |  |  [optional] |
|**sctrTxId** | **String** | The unique identifier of the transaction. |  [optional] |
|**sctrE2EID** | **String** |  |  [optional] |
|**sctrAmount** | **String** |  |  [optional] |
|**sctrSettlementDate** | **String** |  |  [optional] |
|**sctrRemittanceInformation** | **String** |  |  [optional] |
|**sctrTrzId** | **String** |  |  [optional] |
|**sctrExternalId** | **String** |  |  [optional] |
|**clientId** | **Integer** |  |  [optional] |
|**userId** | **Integer** |  |  [optional] |
|**walletId** | **Integer** |  |  [optional] |
|**receivedDate** | **String** |  |  [optional] |
|**payinRefundId** | **Integer** |  |  [optional] |
|**payinRefundUuid** | **String** |  |  [optional] |
|**responseType** | **Integer** |  |  [optional] |
|**negativeResponseReasonCode** | [**NegativeResponseReasonCodeEnum**](#NegativeResponseReasonCodeEnum) | The [type of Recall Rejection](/guide/transfers/sepa-recalls.html#types-of-recalls-reasoncode). |  [optional] |
|**negativeResponseAdditionalInformation** | **String** |  |  [optional] |
|**responseComment** | **String** |  |  [optional] |
|**automaticResponse** | **String** |  |  [optional] |
|**createdDate** | **String** |  |  [optional] |
|**updatedDate** | **String** |  |  [optional] |



## Enum: StatusLabelEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| PENDING_REJECTED_WAITING_ACK | &quot;PENDING_REJECTED_WAITING_ACK&quot; |
| PENDING_ACCEPTED_WAITING_ACK | &quot;PENDING_ACCEPTED_WAITING_ACK&quot; |
| ACCEPTED | &quot;ACCEPTED&quot; |
| REJECTED | &quot;REJECTED&quot; |



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
| NOOR | &quot;NOOR&quot; |
| ARDT | &quot;ARDT&quot; |
| AC04 | &quot;AC04&quot; |
| NOAS | &quot;NOAS&quot; |
| CUST | &quot;CUST&quot; |
| AM04 | &quot;AM04&quot; |
| LEGL | &quot;LEGL&quot; |



