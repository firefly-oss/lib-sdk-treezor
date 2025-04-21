

# AcquiringPayin


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payinId** | **String** | The universally unique identifier (UUID) of the payin |  [optional] |
|**userId** | **String** | The unique identifier of the User requesting the payin |  [optional] |
|**walletId** | **String** | The unique identifier of the wallet to be credited |  [optional] |
|**userFirstName** | **String** | The firstname of the user |  [optional] |
|**walletEventName** | **String** | The name of the wallet |  [optional] |
|**walletAlias** | **String** | Short URL wallet name |  [optional] |
|**userLastName** | **String** | The lastname of the user |  [optional] |
|**messageToUser** | **String** | Message to send to user owning the wallet |  [optional] |
|**payinStatus** | [**PayinStatusEnum**](#PayinStatusEnum) | The status of the payin.   |  [optional] |
|**paymentMethodId** | **String** | Treezor internal payment method identifier |  [optional] |
|**amount** | **Float** | The amount of the payin. |  [optional] |
|**currency** | **String** | Base currency for the payin.  This 3-character currency code must comply with ISO-4217  |  [optional] |
|**createdDate** | **String** | The ceation date of the payin |  [optional] |
|**codeStatus** | **String** | Treezor status code mixed with HiPay notification status code: 150000 + (status code).   Example: For a successful payin, the HiPay notification status code will be 118. The codeStatus will be 150118  |  [optional] |
|**informationStatus** | **String** | Informational message related to the HiPay status code. This message is destined to the user  |  [optional] |
|**refundAmount** | **Float** | Refunded amount |  [optional] |
|**createdIp** | **String** | The IP address of the end user making a top-up |  [optional] |
|**profile** | **String** | Your HiPay Merchant ID. |  [optional] |
|**payinTag** | **String** | This field is not used, always empty |  [optional] |
|**payinDate** | **String** | This field is not used, always 0000-00-00 |  [optional] |
|**cartId** | **BigDecimal** |  |  [optional] |
|**subtotalItems** | **String** |  |  [optional] |
|**subtotalServices** | **String** |  |  [optional] |
|**subtotalTax** | **String** |  |  [optional] |
|**distributorFee** | **String** |  |  [optional] |
|**paymentHtml** | **String** | This field is not used, always null |  [optional] |
|**paymentLanguage** | **String** | This field is not used, always null |  [optional] |
|**paymentPostUrl** | **String** | This field is not used, always null |  [optional] |
|**paymentPostDataUrl** | **String** | This field is not used, always null |  [optional] |
|**paymentAcceptedUrl** | **String** | This field is not used, always null |  [optional] |
|**paymentWaitingUrl** | **String** | This field is not used, always null |  [optional] |
|**paymentCanceledUrl** | **String** | This field is not used, always null |  [optional] |
|**paymentRefusedUrl** | **String** | This field is not used, always null |  [optional] |
|**paymentExceptionUrl** | **String** | This field is not used, always null |  [optional] |
|**ibanFullname** | **String** | This field is not used, always null |  [optional] |
|**ibanId** | **String** | This field is not used, always null |  [optional] |
|**ibanBic** | **String** | This field is not used, always null |  [optional] |
|**ibanTxEndToEndId** | **String** | This field is not used, always null |  [optional] |
|**ibanTxId** | **String** | This field is not used, always null |  [optional] |
|**forwardUrl** | **String** | For some payment methods, the end user must be redirected to this URL in order for him to enter additional payment information.  |  [optional] |
|**mandateId** | **BigDecimal** | This field is not used, always 0 |  [optional] |
|**creditorName** | **String** | This field is not used, always null |  [optional] |
|**creditorAddressLine** | **String** | This field is not used, always null |  [optional] |
|**creditorCountry** | **String** | This field is not used, always null |  [optional] |
|**creditorIban** | **String** | This field is not used, always null |  [optional] |
|**creditorBIC** | **String** | This field is not used, always null |  [optional] |
|**virtualIbanId** | **BigDecimal** | This field is not used, always null |  [optional] |
|**virtualIbanReference** | **String** | This field is not used, always null |  [optional] |
|**additionalData** | **String** | This field is not used, always empty |  [optional] |



## Enum: PayinStatusEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;CANCELED&quot; |
| PENDING | &quot;PENDING&quot; |
| VALIDATED | &quot;VALIDATED&quot; |



