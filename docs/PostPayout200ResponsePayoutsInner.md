

# PostPayout200ResponsePayoutsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payoutId** | **Integer** |  |  [optional] |
|**payoutTag** | **String** |  |  [optional] |
|**payoutStatus** | [**PayoutStatusEnum**](#PayoutStatusEnum) |  |  [optional] |
|**payoutTypeId** | [**PayoutTypeIdEnum**](#PayoutTypeIdEnum) |  |  [optional] |
|**payoutType** | [**PayoutTypeEnum**](#PayoutTypeEnum) |  |  [optional] |
|**walletId** | **Integer** |  |  [optional] |
|**payoutDate** | **String** | Date YYYY-MM-DD |  [optional] |
|**walletEventName** | **String** |  |  [optional] |
|**walletAlias** | **String** |  |  [optional] |
|**userFirstname** | **String** |  |  [optional] |
|**userLastname** | **String** |  |  [optional] |
|**userId** | **Integer** |  |  [optional] |
|**beneficiaryId** | **Integer** |  |  [optional] |
|**uniqueMandateReference** | **String** | The unique reference that unambiguiously identify a mandate signed between the user and the beneficiary.   See the [Unique Mandate Reference (UMR)](/guide/overview/glossary.html#unique-mandate-reference-umr) article for more information.  |  [optional] |
|**bankaccountIBAN** | **String** |  |  [optional] |
|**virtualIbanId** | **Integer** |  |  [optional] |
|**virtualIbanReference** | **String** |  |  [optional] |
|**label** | **String** |  |  [optional] |
|**endToEndId** | **String** |  |  [optional] |
|**reasonCode** | **String** |  |  [optional] |
|**reasonDescription** | **String** |  |  [optional] |
|**codeStatus** | **String** |  |  [optional] |
|**informationStatus** | **String** |  |  [optional] |
|**supportingFileLink** | **String** |  |  [optional] |
|**amount** | **Float** |  |  [optional] |
|**currency** | **String** |  |  [optional] |
|**partnerFee** | **String** |  |  [optional] |
|**createdDate** | **OffsetDateTime** | Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**modifiedDate** | **OffsetDateTime** | Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**totalRows** | **Integer** | The total numbers of objects matching your search, for pagination purposes. Only valued in the first object of the returned page, &#x60;null&#x60; otherwise.  |  [optional] |
|**metadata** | **Object** |  |  [optional] |



## Enum: PayoutStatusEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;CANCELED&quot; |
| PENDING | &quot;PENDING&quot; |
| VALIDATED | &quot;VALIDATED&quot; |



## Enum: PayoutTypeIdEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



## Enum: PayoutTypeEnum

| Name | Value |
|---- | -----|
| CREDIT_TRANSFER | &quot;Credit Transfer&quot; |
| DIRECT_DEBIT | &quot;Direct Debit&quot; |
| INSTANT_SEPA_CREDIT_TRANSFER | &quot;Instant Sepa Credit Transfer&quot; |



