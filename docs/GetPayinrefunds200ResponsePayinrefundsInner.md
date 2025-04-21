

# GetPayinrefunds200ResponsePayinrefundsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payinrefundId** | **Integer** |  |  [optional] |
|**payinrefundTag** | **String** |  |  [optional] |
|**payinrefundStatus** | [**PayinrefundStatusEnum**](#PayinrefundStatusEnum) |  |  [optional] |
|**walletId** | **Integer** |  |  [optional] |
|**payinId** | **Integer** |  |  [optional] |
|**payinrefundDate** | **Integer** |  |  [optional] |
|**amount** | **String** |  |  [optional] |
|**currency** | **String** |  |  [optional] |
|**createdDate** | **OffsetDateTime** | Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**modifiedDate** | **OffsetDateTime** | Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**totalRows** | **Integer** | The total numbers of objects matching your search, for pagination purposes. Only valued in the first object of the returned page, &#x60;null&#x60; otherwise.  |  [optional] |



## Enum: PayinrefundStatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| CANCELED | &quot;CANCELED&quot; |
| VALIDATED | &quot;VALIDATED&quot; |



