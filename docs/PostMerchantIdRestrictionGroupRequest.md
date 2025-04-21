

# PostMerchantIdRestrictionGroupRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the Merchant ID restriction group. |  |
|**accessTag** | **String** | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the Merchant ID restriction group. |  [optional] |
|**isWhitelist** | **Boolean** | Indicates the kind of restriction:  * &#x60;true&#x60; (default) – Allows only a specified list of merchant ids (whitelist) * &#x60;false&#x60; – Allows all merchant ids except the specified list (blacklist)  |  [optional] |
|**merchants** | **List&lt;String&gt;** | List of Merchant Ids (each item is a string). |  |
|**startDate** | **OffsetDateTime** | The date and time at which the restriction starts.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| VALIDATED | &quot;VALIDATED&quot; |
| PENDING | &quot;PENDING&quot; |
| CANCELED | &quot;CANCELED&quot; |



