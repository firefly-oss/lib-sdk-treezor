

# PutMerchandidrestrictiongroupsDeltaupdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessTag** | **String** | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  |  [optional] |
|**merchants** | **List&lt;String&gt;** | The list of Merchant Ids (each item is a string) |  [optional] |
|**merchantsOperation** | [**MerchantsOperationEnum**](#MerchantsOperationEnum) | Whether to &#x60;add&#x60; or &#x60;removed&#x60; the Merchant Ids. |  [optional] |



## Enum: MerchantsOperationEnum

| Name | Value |
|---- | -----|
| ADD | &quot;add&quot; |
| REMOVE | &quot;remove&quot; |



