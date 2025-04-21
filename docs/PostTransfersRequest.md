

# PostTransfersRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transferTag** | **String** | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  |  [optional] |
|**accessTag** | **String** | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  |  [optional] |
|**walletId** | **Integer** | The debited Wallet unique identifier. |  |
|**beneficiaryWalletId** | **Integer** | The credited Wallet unique identifier. |  |
|**amount** | **Float** | The amount of the Transfer. |  |
|**currency** | **String** | The currency of the Transfer in [ISO 4217](/guide/api-basics/data-format.html#currencies) format. Debited wallet and credited wallet must share same currency.  |  |
|**label** | **String** | The label of the transfer, to display on the receiver&#39;s statement for instance.  |  [optional] |
|**transferTypeId** | [**TransferTypeIdEnum**](#TransferTypeIdEnum) | The type of the Transfer: * &#x60;1&#x60; – Wallet to wallet  * &#x60;3&#x60; – Client fees * &#x60;4&#x60; – Credit note  |  [optional] |



## Enum: TransferTypeIdEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |



