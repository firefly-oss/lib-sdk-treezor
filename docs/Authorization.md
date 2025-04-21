

# Authorization


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authorizationId** | **String** | The universally unique identifier (UUID) of the authorization. |  [optional] |
|**userId** | **String** | The unique identifier of the User requesting the authorization. |  [optional] |
|**walletId** | **String** | The unique identifier of the wallet to be credited |  [optional] |
|**userFirstname** | **String** | The firstname of the user |  [optional] |
|**userLastname** | **String** | The lastname of the user |  [optional] |
|**walletEventName** | **String** | The name of the Wallet |  [optional] |
|**walletAlias** | **String** |  |  [optional] |
|**messageToUser** | **String** | Message to send to wallet user |  [optional] |
|**authorizationStatus** | [**AuthorizationStatusEnum**](#AuthorizationStatusEnum) | Status of the authorization.  |  [optional] |
|**paymentMethodId** | **String** | Treezor internal payment method identifier |  [optional] |
|**amount** | **BigDecimal** | Authorization amount |  [optional] |
|**currency** | **String** | Base currency for this authorization  This three-character currency code must comply with ISO-4217 |  [optional] |
|**createdDate** | **String** | Creation date of the authorization |  [optional] |
|**codeStatus** | **String** | Treezor status code mixed with HiPay notification status code: 150000 + (status code).   Example: For a successful payin, the Hipay notification status code will be 118. The codeStatus will be 150118  |  [optional] |
|**informationStatus** | **String** | Informational message towards the user related to the Hipay status code. |  [optional] |
|**refundAmount** | **BigDecimal** | Refunded amount |  [optional] |
|**profile** | **String** | Your HiPay Merchant ID. Required if you have multiple MIDs, otherwise empty. |  [optional] |
|**dbtrIBAN** | **String** | This field is not used, always null |  [optional] |
|**createdIp** | **String** | IP address of the customer making the top-up |  [optional] |
|**authorizationTag** | **String** | This field is not used, always empty |  [optional] |
|**authorizationDate** | **String** | This field is not used, always 0000-00-00 |  [optional] |
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
|**forwardUrl** | **String** | For some payment methods, the end user must be redirected to this URL in order for him to enter additional payment information. |  [optional] |
|**mandateId** | **BigDecimal** | This field is not used, always 0 |  [optional] |
|**creditorName** | **String** | This field is not used, always null |  [optional] |
|**creditorAddressLine** | **String** | This field is not used, always null |  [optional] |
|**creditorCountry** | **String** | This field is not used, always null |  [optional] |
|**creditorIban** | **String** | This field is not used, always null |  [optional] |
|**creditorBIC** | **String** | This field is not used, always null |  [optional] |
|**virtualIbanId** | **BigDecimal** | This field is not used, always null |  [optional] |
|**virtualIbanReference** | **String** | This field is not used, always null |  [optional] |
|**additionalData** | **String** | This field can be empty or contain information about an external provider.   |  [optional] |



## Enum: AuthorizationStatusEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;CANCELED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |



