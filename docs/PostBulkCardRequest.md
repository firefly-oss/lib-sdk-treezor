

# PostBulkCardRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**walletIdAttach** | **Integer** | The unique identifier of the Wallet the cards are going to be attached to. Required if &#x60;createWalletForEach&#x60; is set to &#x60;false&#x60;.  |  [optional] |
|**createWalletForEach** | **Boolean** | Whether to create one Wallet per card.  |  [optional] |
|**walletTypeId** | [**WalletTypeIdEnum**](#WalletTypeIdEnum) | The type of Wallet the card are going to be attached to. Learn more in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation.  |  [optional] |
|**userIdOwner** | **Integer** | The unique identifier of the user owning the cards. Required if &#x60;createUserForEach&#x60; is set to &#x60;false&#x60; or undefined.  |  [optional] |
|**createUserForEach** | **Boolean** | Whether to automatically create users for each created card.  |  [optional] |
|**number** | **Integer** | The number of cards to be created. There may be limitations to the maximum number of cards you can create at once.  |  |
|**defaultMccRestrictionGroupId** | **Integer** | The unique identifier of the MCC Restriction Group to associate with the cards.  |  [optional] |
|**defaultMerchantRestrictionGroupId** | **Integer** | The unique identifier of the MID Restriction Group to associate with the cards.  |  [optional] |
|**defaultCountryRestrictionGroupId** | **Integer** | The unique identifier of the Country Restriction Group to associate with the cards.  |  [optional] |
|**defaultPermsGroup** | [**DefaultPermsGroupEnum**](#DefaultPermsGroupEnum) | A code for a [preset of permissions](/guide/cards/restrictions-limits.html#options-permission-groups). It indicates whether the card main options (contactless, online payments, withdrawals, and international payments) are activated or not.  |  [optional] |
|**packageId** | **String** | Packaging reference for card shipping. |  [optional] |
|**logoId** | **String** | The file name of the logo for the card. Learn more in the [Logo](/guide/cards/creation.html#logo-logoid) article.  |  [optional] |
|**logoBackId** | **String** | The file name of the logo for the back of the card. Learn more in the [Back Logo](/guide/cards/creation.html#back-logo-logobackid) article.  |  [optional] |
|**customizedInfo** | **String** | Customized text to be displayed on the card.  If populated, it must:  * Be alphanumeric * Contain at most 27 characters * Not contain &#x60;!\&quot;#%&#39;(),:;&lt;&gt;?@[]^&#x60; or the backtick symbol.  |  [optional] |
|**freeCustomizedInfo** | **String** | More customized text to be displayed on the card.  If populated, it must:  * Be alphanumeric * Contain at most 50 characters * Not contain &#x60;!\&quot;#%&#39;(),:;&lt;&gt;?@[]^&#x60; or the backtick symbol.  |  [optional] |
|**letterCustomizedInfo** | **String** | Customized text for the letter that is joined to the card.  If populated, it must: * Be alphanumeric * Contain at most 50 characters * Not contain &#x60;!\&quot;#%&#39;(),:;&lt;&gt;?@[]^&#x60; or the backtick symbol.  |  [optional] |
|**anonymous** | [**AnonymousEnum**](#AnonymousEnum) | Whether the cards are to belong to [Anonymous Users](/guide/users/physical.html#anonymous-users). If so set the value to &#x60;1&#x60;, otherwise &#x60;0&#x60;. When set to &#x60;1&#x60;, there is no embossed name on the card.  |  [optional] |
|**cardPrint** | **String** | The [Card Program](/guide/cards/introduction.html#card-program) to associate to the Card and the options provided with it. This information is shared with you by Treezor.  |  [optional] |
|**paymentDailyLimit** | **Integer** | POS operations limit for a single day including cents. The decimal delimiter must be \&quot;.\&quot;. No default value.  For food vouchers use cases only.  |  [optional] |
|**limitPaymentAll** | **Integer** | POS operations limit from beginning. No default value. |  [optional] |
|**limitPaymentDay** | **Integer** | POS operations limit for a single day. |  [optional] |
|**limitPaymentWeek** | **Integer** | POS operations limit for a sliding week. |  [optional] |
|**limitPaymentMonth** | **Integer** | POS operations limit for a sliding month. No default value. |  [optional] |
|**limitPaymentYear** | **Integer** | POS operations limit for a sliding year. No default value. |  [optional] |
|**limitAtmAll** | **Integer** | ATM operations limit from beginning. No default value. |  [optional] |
|**limitAtmDay** | **Integer** | ATM operations limit for a single day. |  [optional] |
|**limitAtmWeek** | **Integer** | ATM operations limit for a sliding week. |  [optional] |
|**limitAtmMonth** | **Integer** | ATM operations limit for a sliding month. No default value. |  [optional] |
|**limitAtmYear** | **Integer** | ATM operations limit for a sliding year. No default value. |  [optional] |
|**medium** | [**MediumEnum**](#MediumEnum) | The type of cards to create depending on your Card Program. Can be:   * &#x60;1&#x60; – Physical   * &#x60;2&#x60; – Virtual   * &#x60;3&#x60; – Virtual to Physical  |  |
|**cardDeliveryAddress1** | **String** | See [address formats](/guide/api-basics/data-format.html#addresses) for limitations.  |  [optional] |
|**cardDeliveryAddress2** | **String** | See [address formats](/guide/api-basics/data-format.html#addresses) for limitations.  |  [optional] |
|**cardDeliveryAddress3** | **String** | See [address formats](/guide/api-basics/data-format.html#addresses) for limitations.  |  [optional] |
|**cardDeliveryPostCode** | **String** | The postcode of the address. |  [optional] |
|**cardDeliveryCity** | **String** | The city of the address. |  [optional] |
|**cardDeliveryState** | **String** | The state of the address. |  [optional] |
|**cardDeliveryCountry** | **String** | The country of the address. |  [optional] |



## Enum: WalletTypeIdEnum

| Name | Value |
|---- | -----|
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |
| NUMBER_15 | 15 |



## Enum: DefaultPermsGroupEnum

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



## Enum: AnonymousEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: MediumEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



