

# CardTransactionObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cardtransactionId** | **String** | The unique identifier of the Card Transaction. |  [optional] |
|**cardId** | **String** | The unique identifier of the card used for the transaction. |  [optional] |
|**walletId** | **String** | The unique identifier of the Wallet the card is attached to. |  [optional] |
|**acquirerId** | **String** | The identifier of the merchant&#39;s bank (acquirer) in the form of 5 to 6 digits. |  [optional] |
|**walletCurrency** | **String** | The currency of the Wallet the card is attached to. |  [optional] |
|**merchantId** | **String** | The [Merchant Identifier Number (MID)](/guide/overview/glossary#merchant-identifier-number-mid).  |  [optional] |
|**merchantName** | **String** | The name of the merchant. |  [optional] |
|**merchantCity** | **String** | The address city of the merchant. |  [optional] |
|**merchantCountry** | **String** | The address country of the merchant. ISO 3166 3-letter code (except of the US which is a two-letter code)  |  [optional] |
|**mccCode** | **String** | The [Merchant Category Code (MCC)](/guide/overview/glossary#merchant-category-code-mcc). A MCC valued to &#x60;6011&#x60; indicates a withdrawal.  Some MCC are prohibited for [anonymous electronic money](/guide/wallets/introduction#electronic-money-wallet-type-9), such as: money transfer, money order, foreign currency, liquid and cryptocurrency assets, lotteries, on-line gambling, betting, etc.  |  [optional] |
|**paymentLocalTime** | **String** | The local time at which the transaction occurred.  Format: &#x60;HHmmss&#x60; (24-hour format, e.g., &#x60;235959&#x60; for 23:59:59).  |  [optional] |
|**publicToken** | **String** | The token of the card. This is a way to identify a card without knowing or communicating its [PAN](/guide/overview/glossary#primary-account-number-pan).  |  [optional] |
|**paymentAmount** | **Float** | The amount of the transaction, always expressed in Euros. See the &#x60;paymentLocalAmount&#x60; for the value in the payment local currency.  |  [optional] |
|**paymentCurrency** | **String** | The currency of the payment. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies) 3-digit code.  |  [optional] |
|**fees** | **String** | ATM usage or foreign payments fees as defined by Treezor, always set to &#x60;0&#x60;. |  [optional] |
|**paymentCountry** | **String** | Country in which the transaction occurred, ISO 3166 3-letter code. |  [optional] |
|**paymentId** | **String** | The unique identifier of the card payment (or attempted payment), allowing you to follow the card transaction life cycle.  |  [optional] |
|**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) | The status of the payment. See the [Statuses](/guide/cards/transactions.html#statuses-paymentstatus) article for more information.  |  [optional] |
|**paymentLocalAmount** | **Float** | The amount of the transaction in the local currency. |  [optional] |
|**posCardholderPresence** | [**PosCardholderPresenceEnum**](#PosCardholderPresenceEnum) | Indicates whether the cardholder was physically present, and if not, how they ordered the card transaction.  See [Cardholder Presence](/guide/cards/transactions.html#cardholder-presence-poscardholderpresence) for more information.  |  [optional] |
|**posPostcode** | **String** | Postcode of the point of sale where the transaction occurred. |  [optional] |
|**posCountry** | **String** | Country of the point of sale where the transaction occurred, in ISO 3166 3-digit code format. |  [optional] |
|**posTerminalId** | **String** | The identifier of the terminal used for the transaction. |  [optional] |
|**posCardPresence** | [**PosCardPresenceEnum**](#PosCardPresenceEnum) | Indicates whether the card was physically present during the transaction:  * &#x60;0&#x60; – The card was present * &#x60;1&#x60; – The card was absent * &#x60;9&#x60; – The card presence **cannot be determined  |  [optional] |
|**panEntryMethod** | [**PanEntryMethodEnum**](#PanEntryMethodEnum) | Indicates how the merchant captured the [PAN](/guide/overview/glossary.html#primary-account-number-pan). See [PAN Entry Method](/guide/cards/transactions.html#pan-entry-method-panentrymethod) for more information.  |  [optional] |
|**authorizationNote** | **String** | Information regarding the cause of a payment incident and/or status.   See [Authorization Notes](/guide/cards/transactions.html#authorization-note-authorizationnote) for more information and a list of common examples.  |  [optional] |
|**authorizationResponseCode** | **String** | Response code for a given card transaction, providing additional information regarding as to why a transaction was accepted or refused.  See [Authorization Codes](/guide/cards/transactions.html#codes-authorizationresponsecode) for more information.  |  [optional] |
|**authorizationIssuerId** | **String** | The transaction identifier as generated by the payment processor. |  [optional] |
|**authorizationIssuerTime** | **OffsetDateTime** | The date and time at which the payment processor authorized the transaction. This value is based on the processor&#39;s timezone (UK).  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**authorizationMti** | **String** | Authorization Message Type Identifier. Please rely on the &#x60;paymentStatus&#x60; value.  |  [optional] |
|**authorizedBalance** | **Float** | The [Authorized Balance](/guide/overview/glossary.html#balance) of the wallet after the transaction.  |  [optional] |
|**limitAtmYear** | **String** | The ATM operations limit of the corresponding card for a sliding year.  See [Payment &amp; Withdrawl limits](/guide/cards/restrictions-limits.html#payment-withdrawal-limits) for more information.  |  [optional] |
|**limitAtmMonth** | **String** | ATM operations limit of the corresponding card for a sliding month.  See [Payment &amp; Withdrawl limits](/guide/cards/restrictions-limits.html#payment-withdrawal-limits) for more information.  |  [optional] |
|**limitAtmWeek** | **String** | ATM operations limit of the corresponding card for a sliding week.  See [Payment &amp; Withdrawl limits](/guide/cards/restrictions-limits.html#payment-withdrawal-limits) for more information.  |  [optional] |
|**limitAtmDay** | **String** | ATM operations limit of the corresponding card for a single day.  See [Payment &amp; Withdrawl limits](/guide/cards/restrictions-limits.html#payment-withdrawal-limits) for more information.  |  [optional] |
|**limitAtmAll** | **String** | ATM operations limit of the corresponding card from beginning.  See [Payment &amp; Withdrawl limits](/guide/cards/restrictions-limits.html#payment-withdrawal-limits) for more information.  |  [optional] |
|**limitPaymentYear** | **String** | POS operations limit of the corresponding card for a sliding year.  See [Payment &amp; Withdrawl limits](/guide/cards/restrictions-limits.html#payment-withdrawal-limits) for more information.  |  [optional] |
|**limitPaymentMonth** | **String** | POS operations limit of the corresponding card for a sliding month.  See [Payment &amp; Withdrawl limits](/guide/cards/restrictions-limits.html#payment-withdrawal-limits) for more information.  |  [optional] |
|**limitPaymentWeek** | **String** | POS operations limit of the corresponding card for a sliding week.  See [Payment &amp; Withdrawl limits](/guide/cards/restrictions-limits.html#payment-withdrawal-limits) for more information.  |  [optional] |
|**limitPaymentDay** | **String** | POS operations limit of the corresponding card for a single day.  See [Payment &amp; Withdrawl limits](/guide/cards/restrictions-limits.html#payment-withdrawal-limits) for more information.  |  [optional] |
|**limitPaymentAll** | **String** | POS operations limit of the corresponding card from beginning.  See [Payment &amp; Withdrawl limits](/guide/cards/restrictions-limits.html#payment-withdrawal-limits) for more information.  |  [optional] |
|**totalLimitAtmYear** | **Float** | The card yearly withdrawal amount. |  [optional] |
|**totalLimitAtmMonth** | **Float** | The card monthly withdrawal amount. |  [optional] |
|**totalLimitAtmWeek** | **Float** | The card weekly withdrawal amount. |  [optional] |
|**totalLimitAtmDay** | **Float** | The card daily withdrawal amount. |  [optional] |
|**totalLimitAtmAll** | **Float** | The card total withdrawal amount. |  [optional] |
|**totalLimitPaymentYear** | **Float** | The card yearly spent amount. |  [optional] |
|**totalLimitPaymentMonth** | **Float** | The card monthly spent amount. |  [optional] |
|**totalLimitPaymentWeek** | **Float** | The card weekly spent amount. |  [optional] |
|**totalLimitPaymentDay** | **Float** | The card daily spent amount. |  [optional] |
|**totalLimitPaymentAll** | **Float** | The card total spent amount. |  [optional] |
|**cardDigitalizationExternalId** | **String** | The digital payment token identifier (only present if payment was made with a digital token such as Apple Pay or Google Pay for example).  |  [optional] |
|**is3DS** | [**Is3DSEnum**](#Is3DSEnum) | Indicates whether [3DSecure](/guide/overview/glossary#_3ds-3d-secure) was used for authentication: * &#x60;0&#x60; – 3DS was not used * &#x60;1&#x60; – 3DS was used  |  [optional] |
|**merchantAddress** | **String** | The address of the merchant. |  [optional] |
|**paymentLocalDate** | **String** | The local date on which the transaction occurred.  Format: &#x60;YYYYMMDD&#x60; (e.g., &#x60;20251228&#x60; for December 28, 2025)  |  [optional] |
|**totalRows** | **Integer** | The total numbers of objects matching your search, for pagination purposes. Only valued in the first object of the returned page, &#x60;null&#x60; otherwise.  |  [optional] |
|**optimizedMerchantName** | **String** | The name of the merchant, optimized for display and understanding.  |  [optional] |
|**merchantLogo** | **URI** | The URL&#39;s of the merchant&#39;s logo. |  [optional] |
|**merchantCategory** | **String** | The category of the merchant. |  [optional] |
|**transactionSubtype** | [**TransactionSubtypeEnum**](#TransactionSubtypeEnum) | Additional information regarding the type of card transaction. Values can be:   * &#x60;OFT&#x60; – Offline transaction   * &#x60;PRE&#x60; – Preauthorization   * &#x60;SEP&#x60; – Second presentment  |  [optional] |
|**_3dsExemptionType** | **String** | Indicates why the transaction was exempted for 3DS authentication. See [3DS Exemption Type](/guide/cards/transactions.html#_3ds-exemption-type-3dsexemptiontype) for the value list.  |  [optional] |
|**receiverData** | **String** | For MoneySend transactions, information regarding the receiver. It usually includes details such as the receiver&#39;s name, masked pan, and address, separated by digits.  |  [optional] |
|**senderData** | **String** | For MoneySend transactions, information regarding the sender. It usually includes details such as the sender&#39;s name, masked pan, and address, separated by digits.  |  [optional] |
|**transactionTypeIdentifier** | [**TransactionTypeIdentifierEnum**](#TransactionTypeIdentifierEnum) | For MoneySend transactions, code indicating the type of transaction and the source of funds. Can be:   * &#x60;C07&#x60; – Person-to-Person Transfer   * &#x60;C52&#x60; – General Transfer to Own Account   * &#x60;C53&#x60; – Agent Cash Out   * &#x60;C54&#x60; – Payment of Own Credit Card Bill   * &#x60;C55&#x60; – Business Disbursement   * &#x60;C56&#x60; – Government/Non-profit Disbursement   * &#x60;C57&#x60; – Rapid Merchant Settlement   * &#x60;C59&#x60; – Cash-in at Point of Sale   * &#x60;C65&#x60; – General Business-to-Business Transfer  |  [optional] |
|**localMerchantId** | **String** | Indicates the merchant&#39;s SIREN or SIRET if available. |  [optional] |



## Enum: PaymentStatusEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| C | &quot;C&quot; |
| I | &quot;I&quot; |
| M | &quot;M&quot; |
| R | &quot;R&quot; |
| S | &quot;S&quot; |
| V | &quot;V&quot; |



## Enum: PosCardholderPresenceEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |
| _5 | &quot;5&quot; |
| _6 | &quot;6&quot; |
| _9 | &quot;9&quot; |



## Enum: PosCardPresenceEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |
| _9 | &quot;9&quot; |



## Enum: PanEntryMethodEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |
| _5 | &quot;5&quot; |
| _7 | &quot;7&quot; |
| _10 | &quot;10&quot; |
| _79 | &quot;79&quot; |
| _80 | &quot;80&quot; |
| _81 | &quot;81&quot; |
| _91 | &quot;91&quot; |



## Enum: Is3DSEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: TransactionSubtypeEnum

| Name | Value |
|---- | -----|
| OFT | &quot;OFT&quot; |
| PRE | &quot;PRE&quot; |
| SEP | &quot;SEP&quot; |



## Enum: TransactionTypeIdentifierEnum

| Name | Value |
|---- | -----|
| C07 | &quot;C07&quot; |
| C52 | &quot;C52&quot; |
| C53 | &quot;C53&quot; |
| C54 | &quot;C54&quot; |
| C55 | &quot;C55&quot; |
| C56 | &quot;C56&quot; |
| C57 | &quot;C57&quot; |
| C59 | &quot;C59&quot; |
| C65 | &quot;C65&quot; |



