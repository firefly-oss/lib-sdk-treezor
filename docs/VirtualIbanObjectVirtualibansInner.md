

# VirtualIbanObjectVirtualibansInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**virtualibanId** | **Integer** | The unique identifier of the Virtual IBAN. |  [optional] |
|**walletId** | **Integer** | The unique identifier of the Wallet to which the Virtual IBAN is associated. |  [optional] |
|**typeId** | [**TypeIdEnum**](#TypeIdEnum) | The type of the Virtual IBAN. |  [optional] |
|**tag** | **String** | Custom attribute that you can use as you see fit.  Learn more in the [Object tags](/guide/api-basics/objects-tags.html) article.            |  [optional] |
|**reference** | **String** | The client&#39;s internal reference of the Virtual IBAN. |  [optional] |
|**validFrom** | **LocalDate** | The date from which the Virtual IBAN validity starts. Defaults to today&#39;s date and must be set in the future.  Format: &#x60;YYYY-MM-DD&#x60;  |  [optional] |
|**validTo** | **LocalDate** | The date from which the Virtual IBAN validity ends. Must be set after the &#x60;validFrom&#x60; date.  Format: &#x60;YYYY-MM-DD&#x60;  |  [optional] |
|**maxUsage** | **Integer** | The maximum number of transactions allowed. |  [optional] |
|**maxAmount** | **Float** | The maximum cumulated amount allowed. |  [optional] |
|**iban** | **String** | The IBAN of the virtual IBAN. |  [optional] |
|**createdDate** | **OffsetDateTime** | The date and time at which the Virtual IBAN was created.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**numberOfTransactions** | **Integer** | The current number of transactions for the Virtual IBAN. |  [optional] |
|**cumulatedAmount** | **Float** | The cumulated amount of transactions for the Virtual IBAN. |  [optional] |
|**updatedDate** | **OffsetDateTime** | The date and time at which the Virtual IBAN was last updated.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |



## Enum: TypeIdEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |



