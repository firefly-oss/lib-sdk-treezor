

# PostPayoutRefund200ResponsePayoutRefundsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier of the payout refund. |  [optional] |
|**payoutRefundTag** | **String** | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  |  [optional] |
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
|**modifiedDate** | **OffsetDateTime** | Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |



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



