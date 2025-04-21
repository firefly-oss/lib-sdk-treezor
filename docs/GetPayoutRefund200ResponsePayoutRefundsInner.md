

# GetPayoutRefund200ResponsePayoutRefundsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**payoutRefundTag** | **String** |  |  [optional] |
|**codeStatus** | **String** |  |  [optional] |
|**informationStatus** | [**InformationStatusEnum**](#InformationStatusEnum) |  |  [optional] |
|**payoutId** | **String** |  |  [optional] |
|**requestAmount** | **Float** |  |  [optional] |
|**requestCurrency** | [**RequestCurrencyEnum**](#RequestCurrencyEnum) |  |  [optional] |
|**requestComment** | **String** |  |  [optional] |
|**reasonCode** | [**ReasonCodeEnum**](#ReasonCodeEnum) |  |  [optional] |
|**refundAmount** | **Float** |  |  [optional] |
|**refundCurrency** | [**RefundCurrencyEnum**](#RefundCurrencyEnum) |  |  [optional] |
|**refundDate** | **String** |  |  [optional] |
|**refundComment** | **String** |  |  [optional] |
|**negativeResponseReasonCode** | **String** |  |  [optional] |
|**createdDate** | **OffsetDateTime** | Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**modifiedDate** | **OffsetDateTime** | Format: &#x60;YYYY-MM-DD HH:MM:SS&#x60;  |  [optional] |



## Enum: InformationStatusEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;CANCELED&quot; |
| PENDING | &quot;PENDING&quot; |
| VALIDATED | &quot;VALIDATED&quot; |



## Enum: RequestCurrencyEnum

| Name | Value |
|---- | -----|
| EUR | &quot;EUR&quot; |



## Enum: ReasonCodeEnum

| Name | Value |
|---- | -----|
| DUPL | &quot;DUPL&quot; |
| TECH | &quot;TECH&quot; |
| FRAD | &quot;FRAD&quot; |
| CUST | &quot;CUST&quot; |
| AM09 | &quot;AM09&quot; |
| AC03 | &quot;AC03&quot; |



## Enum: RefundCurrencyEnum

| Name | Value |
|---- | -----|
| EUR | &quot;EUR&quot; |



