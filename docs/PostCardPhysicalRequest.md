

# PostCardPhysicalRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **Integer** | The unique identifier of the cardholder. |  |
|**accessTag** | **String** | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  |  [optional] |
|**walletId** | **Integer** | The unique identifier of the Wallet the card is attached to. |  |
|**permsGroup** | [**PermsGroupEnum**](#PermsGroupEnum) | Permissions defining which features are enabled for the Card. See the [Permissions Groups](/guide/cards/restrictions-limits.html#permission-groups-permsgroup) article for more information.  |  |
|**cardTag** | **String** | This attribute is a string which can store a maximum of 250 characters that you are free to populate to suit your needs  You can [read more about tags](/guide/api-basics/objects-tags.html)  |  [optional] |
|**batchDeliveryId** | **Integer** | Batch delivery identifier, which value must be between &#x60;1&#x60; and &#x60;238327&#x60;.  This feature is not enabled by default, see [Customization](/guide/cards/creation.html#batch-delivery-batchdeliveryid) for more information.  |  [optional] |
|**limitAtmYear** | **Integer** | ATM operations limit for a sliding year. No default value. |  [optional] |
|**limitAtmMonth** | **Integer** | ATM operations limit for a sliding month. No default value. |  [optional] |
|**limitAtmWeek** | **Integer** | ATM operations limit for a sliding week. Default value €2000. |  [optional] |
|**limitAtmDay** | **Integer** | ATM operations limit for a single day. Default value €1000. |  [optional] |
|**limitAtmAll** | **Integer** | ATM operations limit from beginning. No default value. |  [optional] |
|**limitPaymentYear** | **Integer** | POS operations limit for a sliding year. No default value. |  [optional] |
|**limitPaymentMonth** | **Integer** | POS operations limit for a sliding month. No default value. |  [optional] |
|**limitPaymentWeek** | **Integer** | POS operations limit for a sliding week. Default value €3000. |  [optional] |
|**limitPaymentDay** | **Integer** | POS operations limit for a single day. Default value €2000. |  [optional] |
|**limitPaymentAll** | **Integer** | POS operations limit from beginning. No default value. |  [optional] |
|**paymentDailyLimit** | **Float** | POS operations limit for a single day including cents. The decimal delimiter must be \&quot;.\&quot;. No default value.  For food vouchers use cases only.  |  [optional] |
|**pin** | **String** | The PIN code value of the card. |  [optional] |
|**cardPrint** | **String** | The [Card Program](introduction.html#card-program) to associate to the Card and the options provided with it. This information is shared with you by Treezor.  |  |
|**anonymous** | **Integer** | Whether the cards are to belong to [Anonymous Users](/guide/users/physical.html#anonymous-users). If so set the value to &#x60;1&#x60;, otherwise &#x60;0&#x60;. When set to &#x60;1&#x60;, there is no embossed name on the card.  |  [optional] |
|**sendToParent** | [**SendToParentEnum**](#SendToParentEnum) | Whether the card should be sent to the cardholder&#39;s Parent User.   When set to &#x60;1&#x60;, the delivery address fields will be automatically filled in with the parent user&#39;s address.  |  [optional] |
|**mccRestrictionGroupId** | **Integer** | The merchant category restriction group (&#x60;mccRestrictionGroup&#x60;) to apply to the card.  |  [optional] |
|**merchantRestrictionGroupId** | **Integer** | The merchant Id restriction group (&#x60;merchantRestrictionGroupId&#x60;) to apply to the card.  |  [optional] |
|**countryRestrictionGroupId** | **Integer** | The country restriction group (&#x60;countryRestrictionGroupId&#x60;) to apply to the card.  |  [optional] |
|**embossLegalName** | **Boolean** | Set to &#x60;true&#x60; to emboss the cardholder&#39;s legal name on the card. |  [optional] |
|**logoId** | **String** | The file name of the logo for the card. Learn more in the [Logo](/guide/cards/creation.html#logo-logoid) article.  |  [optional] |
|**logoBackId** | **String** | The file name of the logo for the back of the card. Learn more in the [Back Logo](/guide/cards/creation.html#back-logo-logobackid) article.  |  [optional] |
|**designCode** | **String** | The design code of the card. Max. 2 characters. Learn more in the [Designs](/guide/cards/creation.html#designs-designcode) article.  |  [optional] |
|**packageId** | **String** | Packaging reference for card shipping. Max. 8 characters. |  [optional] |
|**deliveryMethod** | **Integer** | The method the manufacturer uses to send the cards (e.g., delivery with or without tracking).  Learn more in the [Card Delivery Method](/guide/cards/creation.html#card-delivery-method-deliverymethod) article.  |  [optional] |
|**pinMailer** | [**PinMailerEnum**](#PinMailerEnum) | You can request the card manufacturer to send the card PIN code by letter. Learn more in the [Pin Mailer](/guide/cards/creation.html#pin-mailer-pinmailer) article.  |  [optional] |
|**customizedInfo** | **String** | Customized text to be displayed on the card.  If populated, it must:  * Be alphanumeric * Contain at most 27 characters * Not contain &#x60;!\&quot;#%&#39;(),:;&lt;&gt;?@[]^&#x60; or the backtick symbol.  |  [optional] |
|**freeCustomizedInfo** | **String** | More customized text to be displayed on the card.  If populated, it must:  * Be alphanumeric * Contain at most 50 characters * Not contain &#x60;!\&quot;#%&#39;(),:;&lt;&gt;?@[]^&#x60; or the backtick symbol.  |  [optional] |
|**letterCustomizedInfo** | **String** | Customized text for the letter that is joined to the card.  If populated, it must: * Be alphanumeric * Contain at most 50 characters * Not contain &#x60;!\&quot;#%&#39;(),:;&lt;&gt;?@[]^&#x60; or the backtick symbol.  |  [optional] |
|**cardLanguages** | **String** | The language preferences for the card.  Must be alphabetic and max. 8 characters. Format: [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes).  |  [optional] |



## Enum: PermsGroupEnum

| Name | Value |
|---- | -----|
| TRZ_CU_001 | &quot;TRZ-CU-001&quot; |
| TRZ_CU_002 | &quot;TRZ-CU-002&quot; |
| TRZ_CU_003 | &quot;TRZ-CU-003&quot; |
| TRZ_CU_004 | &quot;TRZ-CU-004&quot; |
| TRZ_CU_005 | &quot;TRZ-CU-005&quot; |
| TRZ_CU_006 | &quot;TRZ-CU-006&quot; |
| TRZ_CU_007 | &quot;TRZ-CU-007&quot; |
| TRZ_CU_008 | &quot;TRZ-CU-008&quot; |
| TRZ_CU_009 | &quot;TRZ-CU-009&quot; |
| TRZ_CU_010 | &quot;TRZ-CU-010&quot; |
| TRZ_CU_011 | &quot;TRZ-CU-011&quot; |
| TRZ_CU_012 | &quot;TRZ-CU-012&quot; |
| TRZ_CU_013 | &quot;TRZ-CU-013&quot; |
| TRZ_CU_014 | &quot;TRZ-CU-014&quot; |
| TRZ_CU_015 | &quot;TRZ-CU-015&quot; |
| TRZ_CU_016 | &quot;TRZ-CU-016&quot; |



## Enum: SendToParentEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: PinMailerEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



