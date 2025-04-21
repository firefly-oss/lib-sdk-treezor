

# PutVirtualIbanRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessTag** | **String** | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  |  [optional] |
|**validFrom** | **String** | The date from which the Virtual IBAN validity starts. Defaults to today&#39;s date and must be set in the future.  Format: &#x60;YYYY-MM-DD&#x60;  |  [optional] |
|**validTo** | **String** | The date from which the Virtual IBAN validity ends. Must be set after the &#x60;validFrom&#x60; date.  Format: &#x60;YYYY-MM-DD&#x60;  |  [optional] |
|**maxUsage** | **Integer** | The maximum number of transactions allowed (&#x60;0&#x60; &#x3D; unlimited).   |  [optional] |
|**maxAmount** | **BigDecimal** | The maximum cumulated amount of all transactions (&#x60;\&quot;0.00\&quot;&#x60; &#x3D; unlimited).  |  [optional] |
|**reference** | **String** | Custom field for your internal reference of the Virtual IBAN.  Max. length: 255 characters.  |  [optional] |



