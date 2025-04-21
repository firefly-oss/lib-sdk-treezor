

# PayinObjectPayinsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payinId** | **String** | The unique identifier of the payin. In the specific case of the SCTR Inst payin, this value is a uuid.  |  [optional] |
|**payinTag** | **String** | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  |  [optional] |
|**payinStatus** | [**PayinStatusEnum**](#PayinStatusEnum) | The status of the payin. See [Payin statuses](/guide/transfers/introduction.html#payin-statuses-codestatus) for more information.  |  [optional] |
|**codeStatus** | [**CodeStatusEnum**](#CodeStatusEnum) | The code for the status of the payin. See [Payin statuses](/guide/transfers/introduction.html#payin-statuses-codestatus) for more information.  |  [optional] |
|**informationStatus** | **String** | Additional information regarding the status (if any). |  [optional] |
|**walletId** | **String** | The unique identifier of the wallet. |  [optional] |
|**userId** | **String** | The unique identifier of the user. |  [optional] |
|**cartId** | **Integer** |  |  [optional] |
|**walletEventName** | **String** | The name of the Wallet. |  [optional] |
|**walletAlias** | **String** |  |  [optional] |
|**userFirstname** | **String** | The first name of the user owning the Wallet. |  [optional] |
|**userLastname** | **String** | The last name of the user owning the Wallet. |  [optional] |
|**messageToUser** | **String** | Message to send to Wallet of the user. For SEPA Direct Debit Core payment method, this parameter reconciles information transmitted to the Debtor (i.e., Invoice number). In this case, it can&#39;t exceed 140 characters. |  [optional] |
|**paymentMethodId** | [**PaymentMethodIdEnum**](#PaymentMethodIdEnum) | The type of payin.  | Id | Payment by |   | ---| --- |   | &#x60;20&#x60; | [Received SEPA Credit Transfer (SCTR)](/guide/transfers/credit-transfer.html#received-credit-transfers-sctr). You can only create such payins in Sandbox, otherwise created automatically upon receiving a transfer. |   | &#x60;21&#x60; | [Emitted SEPA Direct Debit (SDDE)](/guide/transfers/direct-debit.html#emitted-direct-debits-sdde). |   | &#x60;23&#x60; | Full Hosted HTML Payment Form. If you use this &#x60;paymentMethodId&#x60;, the &#x60;paymentAcceptedUrl&#x60;, &#x60;paymentRefusedUrl&#x60;, &#x60;paymentWaitingUrl&#x60;, &#x60;paymentCanceledUrl&#x60; and &#x60;paymentExceptionUrl&#x60; fields are mandatory. CSS of the payment page can be customized. |   | &#x60;24&#x60; | IFrame Payment Form. Please note that if you use this &#x60;paymentMethodId&#x60;, the &#x60;paymentAcceptedUrl&#x60;, &#x60;paymentRefusedUrl&#x60;, &#x60;paymentWaitingUrl&#x60;, &#x60;paymentCanceledUrl&#x60; and &#x60;paymentExceptionUrl&#x60; fields are mandatory. CSS of the payment page can be customized. |   | &#x60;25&#x60; | [Card topups](/guide/acquiring/introduction.html). You cannot create a payin directly with this method id. The payin will be automatically created by Treezor. |   | &#x60;26&#x60; | [Check cashing](/guide/cheques/introduction.html) |   | &#x60;27&#x60; | [Received SEPA Instant Credit Transfer](/guide/transfers/credit-transfer-inst.html#received-instant-credit-transfers-sctr-inst). You cannot create a payin directly with this method id. The payin will be automatically created by Treezor. |  |  [optional] |
|**subtotalItems** | **String** |  |  [optional] |
|**subtotalServices** | **String** |  |  [optional] |
|**subtotalTax** | **String** |  |  [optional] |
|**amount** | **String** | The amount of the payin. Decimal number. |  [optional] |
|**currency** | **String** | The currency of the payin in [ISO 4217](/guide/api-basics/data-format.html#currencies) format. Must be the same as the Wallet currency.  |  [optional] |
|**distributorFee** | **String** |  |  [optional] |
|**createdDate** | **OffsetDateTime** | The date and time at which the payin was created.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**createdIp** | **String** | The IP address of the User. |  [optional] |
|**paymentHtml** | **String** |  |  [optional] |
|**paymentLanguage** | **String** |  |  [optional] |
|**paymentPostUrl** | **String** |  |  [optional] |
|**paymentPostDataUrl** | **String** |  |  [optional] |
|**paymentAcceptedUrl** | **String** |  |  [optional] |
|**paymentWaitingUrl** | **String** |  |  [optional] |
|**paymentRefusedUrl** | **String** |  |  [optional] |
|**paymentCanceledUrl** | **String** |  |  [optional] |
|**paymentExceptionUrl** | **String** |  |  [optional] |
|**ibanFullname** | **String** |  |  [optional] |
|**dbtrIBAN** | **String** |  |  [optional] |
|**ibanId** | **String** |  |  [optional] |
|**ibanBic** | **String** |  |  [optional] |
|**ibanTxEndToEndId** | **String** |  |  [optional] |
|**ibanTxId** | **String** |  |  [optional] |
|**refundAmount** | **String** |  |  [optional] |
|**totalRows** | **Integer** | The total numbers of objects matching your search, for pagination purposes. Only valued in the first object of the returned page, &#x60;null&#x60; otherwise.  |  [optional] |
|**forwardUrl** | **String** |  |  [optional] |
|**payinDate** | **String** | The date at which the SDD should be presented.   In the case of SDD Core, this parameter defaults to the third working day following the payin creation if left empty.   Format: &#x60;YYYY-MM-DD&#x60;, a [SEPA Open Banking Day](/guide/overview/glossary.html#sepa-open-banking-days) is expected, based on the rules described in the [dedicated article](/guide/transfers/direct-debit.html#parameters).  |  [optional] |
|**mandateId** | **Integer** | The unique identifier of the Mandate. This parameter is mandatory when performing a payin with method SDD Core. |  [optional] |
|**creditorName** | **String** |  |  [optional] |
|**creditorAddressLine** | **String** |  |  [optional] |
|**creditorCountry** | **String** |  |  [optional] |
|**creditorIban** | **String** |  |  [optional] |
|**creditorBIC** | **String** |  |  [optional] |
|**virtualIbanId** | **Integer** |  |  [optional] |
|**virtualIbanReference** | **String** |  |  [optional] |



## Enum: PayinStatusEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;CANCELED&quot; |
| PENDING | &quot;PENDING&quot; |
| VALIDATED | &quot;VALIDATED&quot; |



## Enum: CodeStatusEnum

| Name | Value |
|---- | -----|
| _140001 | &quot;140001&quot; |
| _140004 | &quot;140004&quot; |
| _140005 | &quot;140005&quot; |
| _140006 | &quot;140006&quot; |
| _140007 | &quot;140007&quot; |
| _140010 | &quot;140010&quot; |



## Enum: PaymentMethodIdEnum

| Name | Value |
|---- | -----|
| _20 | &quot;20&quot; |
| _21 | &quot;21&quot; |
| _23 | &quot;23&quot; |
| _24 | &quot;24&quot; |
| _25 | &quot;25&quot; |
| _26 | &quot;26&quot; |
| _27 | &quot;27&quot; |



