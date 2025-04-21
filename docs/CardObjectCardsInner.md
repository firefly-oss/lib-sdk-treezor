

# CardObjectCardsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cardId** | **Integer** | The unique identifier of the card. |  [optional] |
|**userId** | **Integer** | The unique identifier of the cardholder. |  [optional] |
|**walletId** | **Integer** | The unique identifier of the Wallet the card is attached to. |  [optional] |
|**walletCardtransactionId** | **Integer** | The card technical wallet, for Treezor usage only. See [Card Transaction Wallet](/guide/wallets/introduction.html#card-transaction-wallet-type-14-18) for more information.  |  [optional] |
|**mccRestrictionGroupId** | **Integer** | The merchant category restriction group (&#x60;mccRestrictionGroup&#x60;) applied to the card.  |  [optional] |
|**merchantRestrictionGroupId** | **Integer** | The merchant Id restriction group (&#x60;merchantRestrictionGroupId&#x60;) applied to the card.  |  [optional] |
|**countryRestrictionGroupId** | **Integer** | The country restriction group (&#x60;countryRestrictionGroupId&#x60;) applied to the card.  |  [optional] |
|**publicToken** | **String** | The 9-character long string printed on the Card. It can be used to [activate](/guide/cards/creation.html#activation) the card.  |  [optional] |
|**cardTag** | **String** | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.    Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  |  [optional] |
|**statusCode** | [**StatusCodeEnum**](#StatusCodeEnum) | The plaintext value of the [Card status](/guide/cards/modification.html#card-status).  |  [optional] |
|**isLive** | [**IsLiveEnum**](#IsLiveEnum) | Whether the card is active. Set to &#x60;1&#x60; once activated. See [Activation](/guide/cards/creation.html#activation) for more information.  |  [optional] |
|**pinTryExceeds** | [**PinTryExceedsEnum**](#PinTryExceedsEnum) | Whether the Card is locked because the cardholder entered 3 erroneous PIN codes in a row. Set to &#x60;1&#x60; when the card is PIN-locked.   See [PIN Unlock](/guide/cards/modification.html#pin-unlock) for more information.  |  [optional] |
|**maskedPan** | **String** | The [Primary Account Number (PAN)](/guide/overview/glossary.html#primary-account-number-pan) of the card, with the middle numbers redacted for safety.  |  [optional] |
|**embossedName** | **String** | The embossed name of the card.  |  [optional] |
|**expiryDate** | **String** | The date on which the card expires.  The [&#x60;card.expiryAlert&#x60;](/guide/cards/events.html#structure-of-a-card-expiryalert) webhook is sent a month before the &#x60;expiryDate&#x60; for you to anticipate [Renewal](/guide/cards/renewal.html).  Format: &#x60;YYYY-MM-DD&#x60;  |  [optional] |
|**CVV** | **String** | The verification code of the card. This field is to be deprecated and hence may return a value of &#x60;000&#x60;.   You may retrieve the card CVV by using the [&#x60;/v1/cardimages&#x60;](/api-reference/api-endpoints.html#tag/Cards/getCardImage) request or by migrating to the [PCI DSS-compliant services](/guide/cards/pci-dss.html).  |  [optional] |
|**startDate** | **String** |  |  [optional] |
|**endDate** | **String** |  |  [optional] |
|**countryCode** | **String** | Inherited from the cardholder&#39;s country. |  [optional] |
|**currencyCode** | **String** | The currency of the card, in the [ISO 4217](/guide/api-basics/data-format.html#currencies) format. |  [optional] |
|**lang** | **String** | Inherited from the cardholder&#39;s &#x60;language&#x60;. |  [optional] |
|**deliveryTitle** | **String** |  |  [optional] |
|**deliveryLastname** | **String** |  |  [optional] |
|**deliveryFirstname** | **String** |  |  [optional] |
|**deliveryAddress1** | **String** |  |  [optional] |
|**deliveryAddress2** | **String** |  |  [optional] |
|**deliveryAddress3** | **String** |  |  [optional] |
|**deliveryCity** | **String** |  |  [optional] |
|**deliveryPostcode** | **String** |  |  [optional] |
|**deliveryCountry** | **String** |  |  [optional] |
|**mobileSent** | **String** | Inherited from the cardholder&#39;s &#x60;phone&#x60;. |  [optional] |
|**limitsGroup** | **String** |  |  [optional] |
|**permsGroup** | [**PermsGroupEnum**](#PermsGroupEnum) | A code for a [preset of permissions](/guide/cards/restrictions-limits.html#options-permission-groups). It indicates whether the card main options (contactless, online payments, withdrawals, and international payments) are activated or not.  |  [optional] |
|**cardDesign** | **String** | The &#x60;cardPrint&#x60; identifier, which defines the options and design of the card as part of your [Card Program](introduction.html#card-program).  |  [optional] |
|**virtualConverted** | [**VirtualConvertedEnum**](#VirtualConvertedEnum) | Whether or not the card is a Virtual Card that has been converted into a Physical Card. Values can be: * &#x60;1&#x60; – Physical card converted from a virtual card * &#x60;0&#x60; – Not converted, virtual card only  |  [optional] |
|**physical** | **Integer** |  |  [optional] |
|**optionAtm** | [**OptionAtmEnum**](#OptionAtmEnum) | Whether the card is usable on ATMs (withdrawal). See [Options &amp; Permission groups](/guide/cards/restrictions-limits.html#options-permission-groups) for more information.  |  [optional] |
|**optionForeign** | [**OptionForeignEnum**](#OptionForeignEnum) | Whether the card is usable abroad. See [Options &amp; Permission groups](/guide/cards/restrictions-limits.html#options-permission-groups) for more information.  |  [optional] |
|**optionOnline** | [**OptionOnlineEnum**](#OptionOnlineEnum) | Whether the card is usable online. See [Options &amp; Permission groups](/guide/cards/restrictions-limits.html#options-permission-groups) for more information.  |  [optional] |
|**optionNfc** | [**OptionNfcEnum**](#OptionNfcEnum) | Whether the card can be used for contactless payments. See [Options &amp; Permission groups](/guide/cards/restrictions-limits.html#options-permission-groups) for more information.  |  [optional] |
|**limitAtmYear** | **Integer** | The ATM operations limit of the corresponding card for a sliding year.  See [Payment &amp; Withdrawl limits](/guide/cards/restrictions-limits.html#payment-withdrawal-limits) for more information.  |  [optional] |
|**limitAtmMonth** | **Integer** | ATM operations limit of the corresponding card for a sliding month.  See [Payment &amp; Withdrawl limits](/guide/cards/restrictions-limits.html#payment-withdrawal-limits) for more information.  |  [optional] |
|**limitAtmWeek** | **Integer** | ATM operations limit of the corresponding card for a sliding week.  See [Payment &amp; Withdrawl limits](/guide/cards/restrictions-limits.html#payment-withdrawal-limits) for more information.  |  [optional] |
|**limitAtmDay** | **Integer** | ATM operations limit of the corresponding card for a single day.  See [Payment &amp; Withdrawl limits](/guide/cards/restrictions-limits.html#payment-withdrawal-limits) for more information.  |  [optional] |
|**limitAtmAll** | **Integer** | ATM operations limit of the corresponding card from beginning.  See [Payment &amp; Withdrawl limits](/guide/cards/restrictions-limits.html#payment-withdrawal-limits) for more information.  |  [optional] |
|**limitPaymentYear** | **Integer** | POS operations limit of the corresponding card for a sliding year.  See [Payment &amp; Withdrawl limits](/guide/cards/restrictions-limits.html#payment-withdrawal-limits) for more information.  |  [optional] |
|**limitPaymentMonth** | **Integer** | POS operations limit of the corresponding card for a sliding month.  See [Payment &amp; Withdrawl limits](/guide/cards/restrictions-limits.html#payment-withdrawal-limits) for more information.  |  [optional] |
|**limitPaymentWeek** | **Integer** | POS operations limit of the corresponding card for a sliding week.  See [Payment &amp; Withdrawl limits](/guide/cards/restrictions-limits.html#payment-withdrawal-limits) for more information.  |  [optional] |
|**limitPaymentDay** | **Integer** | POS operations limit of the corresponding card for a single day.  See [Payment &amp; Withdrawl limits](/guide/cards/restrictions-limits.html#payment-withdrawal-limits) for more information.  |  [optional] |
|**limitPaymentAll** | **Integer** | POS operations limit of the corresponding card for a single day.  See [Payment &amp; Withdrawl limits](/guide/cards/restrictions-limits.html#payment-withdrawal-limits) for more information.  |  [optional] |
|**paymentDailyLimit** | **Float** | POS operations limit for a single day including cents. The decimal delimiter must be \&quot;.\&quot;. No default value.  For food vouchers use cases only.  |  [optional] |
|**totalAtmYear** | **Integer** | The card yearly withdrawal amount. |  [optional] |
|**totalAtmMonth** | **Integer** | The card monthly withdrawal amount. |  [optional] |
|**totalAtmWeek** | **Integer** | The card weekly withdrawal amount. |  [optional] |
|**totalAtmDay** | **Integer** | The card daily withdrawal amount. |  [optional] |
|**totalAtmAll** | **Integer** | The card total withdrawal amount. |  [optional] |
|**totalPaymentYear** | **Integer** | The card yearly spent amount. |  [optional] |
|**totalPaymentMonth** | **Integer** | The card monthly spent amount. |  [optional] |
|**totalPaymentWeek** | **Integer** | The card weekly spent amount. |  [optional] |
|**totalPaymentDay** | **Integer** | The card daily spent amount. |  [optional] |
|**totalPaymentAll** | **Integer** | The card total spent amount. |  [optional] |
|**createdBy** | **Integer** |  |  [optional] |
|**createdDate** | **OffsetDateTime** | Date &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**modifiedBy** | **Integer** |  |  [optional] |
|**modifiedDate** | **OffsetDateTime** | Date &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**totalRows** | **Integer** | The total numbers of objects matching your search, for pagination purposes. Only valued in the first object of the returned page, &#x60;null&#x60; otherwise.  |  [optional] |
|**designCode** | **String** |  |  [optional] |
|**cardLanguages** | **String** | The language preferences for the card.  Must be alphabetic and max. 8 characters. Format: [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes).  |  [optional] |
|**eventName** | **String** | Name of the Wallet, inherited from the wallet the card is attached to. |  [optional] |
|**eventAlias** | **String** | Description of the Wallet, inherited from the wallet the card is attached to. |  [optional] |
|**restrictionGroupLimits** | [**List&lt;CardObjectCardsInnerRestrictionGroupLimitsInner&gt;**](CardObjectCardsInnerRestrictionGroupLimitsInner.md) |  |  [optional] |
|**cancellationNumber** | **String** | Number generated when the card &#x60;statusCode&#x60; is set to &#x60;STOLEN&#x60; or &#x60;LOST&#x60;.  |  [optional] |
|**metadata** | **String** |  |  [optional] |
|**renewalDate** | **String** | Date on which the card was renewed (field populated for the original card only). YYYY-MM-DD. |  [optional] |
|**renewalType** | [**RenewalTypeEnum**](#RenewalTypeEnum) | Indicates how the Card is to be renewed. &#x60;A&#x60; for automatic renewal, &#x60;N&#x60; for non-automatic renewal.  |  [optional] |
|**originalCardId** | **Integer** | The unique identifier of the original Card (field populated for renewed cards only). |  [optional] |
|**logoId** | **String** | The file name of the logo for the card. Learn more in the [Logo](/guide/cards/creation.html#logo-logoid) article.  |  [optional] |
|**logoBackId** | **String** | The file name of the logo for the back of the card. Learn more in the [Back Logo](/guide/cards/creation.html#back-logo-logobackid) article.  |  [optional] |
|**packageId** | **String** | Packaging reference for card shipping. Max. 8 characters. |  [optional] |
|**customizedInfo** | **String** | Customized text to be displayed on the card. |  [optional] |
|**letterCustomizedInfo** | **String** | Customized text for the letter that is joined to the card. |  [optional] |
|**freeCustomizedInfo** | **String** | More customized text to be displayed on the card. |  [optional] |
|**deliveryMethod** | **Integer** | The method the manufacturer uses to send the cards (e.g., delivery with or without tracking).  Learn more in the [Card Delivery Method](/guide/cards/creation.html#card-delivery-method-deliverymethod) article.  |  [optional] |
|**pinMailer** | [**PinMailerEnum**](#PinMailerEnum) | Whether the card manufacturer to send the card PIN code by letter. |  [optional] |
|**batchDeliveryId** | **Integer** | Batch delivery identifier. |  [optional] |
|**sendToParent** | [**SendToParentEnum**](#SendToParentEnum) | Whether the card should be sent to the cardholder&#39;s Parent User. |  [optional] |



## Enum: StatusCodeEnum

| Name | Value |
|---- | -----|
| DESTROYED | &quot;DESTROYED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| LOCK_INTERNAL | &quot;LOCK_INTERNAL&quot; |
| LOCK | &quot;LOCK&quot; |
| LOST | &quot;LOST&quot; |
| STOLEN | &quot;STOLEN&quot; |
| UNLOCK | &quot;UNLOCK&quot; |



## Enum: IsLiveEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: PinTryExceedsEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



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



## Enum: VirtualConvertedEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: OptionAtmEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: OptionForeignEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: OptionOnlineEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: OptionNfcEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: RenewalTypeEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| N | &quot;N&quot; |



## Enum: PinMailerEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: SendToParentEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



