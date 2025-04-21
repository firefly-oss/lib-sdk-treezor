

# SimulateCardTransactionsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**publicToken** | **String** | The public token of the Card. |  [optional] |
|**date** | **String** | The date and time of the CardTransaction, as seen in the &#x60;authorizationIssuerTime&#x60; attribute. |  [optional] |
|**amount** | **Float** | The amount of the CardTransaction, as seen it the &#x60;paymentAmount&#x60; and &#x60;paymentLocalAmount&#x60; attributes. |  [optional] |
|**mcc** | **String** | The Merchant Category Code for the CardTransaction, allowing you to check [Card MCC restrictions](/guide/cards/restrictions-limits.html#mcc-restrictions).  |  [optional] |
|**merchantId** | **String** | The Merchant&#39;s ID for the CardTransaction, allowing you to check [Card MID restrictions](/guide/cards/restrictions-limits.html#mid-restrictions).  |  |
|**merchantName** | **String** | The name of the merchant. |  |
|**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) | The type of CardTransaction. In the specific case of simulation, allowed values are: * &#x60;A&#x60; – Authorization accepted * &#x60;S&#x60; – Settled  See the full list of values in the [Statuses](/guide/cards/transactions.html#statuses-paymentstatus) article.  |  [optional] |
|**transLink** | **String** | A unique reference used to associate the Card Transaction with a &#x60;paymentId&#x60;. Must be &#x60;100000000000000&#x60; or higher.  To emulate a complete flow, set a &#x60;paymentStatus &#x3D; A&#x60; followed by a &#x60;S&#x60; while specifying the same &#x60;transLink&#x60; for both requests.  |  |
|**paymentCode** | **String** | Deprecated. Use the &#x60;transLink&#x60; parameter instead. |  [optional] |



## Enum: PaymentStatusEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| S | &quot;S&quot; |



