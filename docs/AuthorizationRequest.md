

# AuthorizationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **BigDecimal** | The amount of the operation. |  |
|**currency** | **String** | The currency of the operation. Format: ISO-4217.  |  |
|**walletId** | **String** | The unique identifier of the wallet to be credited. |  |
|**userId** | **String** | The unique identifier of the user requesting the operation. |  |
|**topupCardId** | **String** | The unique identifier for the user&#39;s Topup Card. |  [optional] |
|**acceptUrl** | **String** | The URL to return the end user to once the payment process is completed successfully.  |  |
|**declineUrl** | **String** | The URL to return the end user to after the acquirer declines the payment.  |  |
|**pendingUrl** | **String** | The URL to return your end user to when the payment request was submitted to the acquirer but response is not yet available.  |  |
|**exceptionUrl** | **String** | The URL to return your end user to after a system failure |  |
|**cancelUrl** | **String** | The URL to return your end user to after a system failure |  |
|**eci** | **String** | The ECI indicates the security level at which the payment information is processed between the cardholder and Treezor customer  |  |
|**authenticationIndicator** | **String** | If the payment product is a credit or debit card, this parameter indicates if the 3-D Secure authentication should be performed for this transaction  |  |
|**orderId** | **String** | The unique identifier of the order, guaranteeing the uniqueness of the transaction.   Must be unique and abide by the following rules: * Length: min. 32 characters * Structure: &#x60;&lt;yourCompanyName&gt;_order_&lt;uniqueIdentifier&gt;&#x60;  |  |
|**description** | **String** | The order short description. |  |
|**paymentProduct** | **String** | The payment method used for the top-up.  Depending on the payment product, parameters specific to the payment method are required.  |  |
|**issuerBankId** | **String** | This parameter is specific to the iDEAL payment product.  This is the Business Identifier Code (BIC) of the end user issuer bank  |  [optional] |
|**ipaddr** | **String** | The IP address of the end user making a top-up |  [optional] |
|**deviceChannel** | **Integer** | This parameter is specific to the PSD2  Channel through which the transaction is being processed |  |
|**browserInfo** | [**AuthorizationRequestBrowserInfo**](AuthorizationRequestBrowserInfo.md) |  |  |
|**profile** | **String** | Your HiPay Merchant ID. Required if you have multiple MIDs, otherwise empty.  |  [optional] |
|**firstname** | **String** | The first name of the user. |  |
|**lastname** | **String** | The last name of the user. |  |
|**email** | **String** | The email of the user. |  |
|**phone** | **String** | The phone number of the user. |  |
|**streetAddress** | **String** | The residence street name and number of the user. |  |
|**city** | **String** | The residence city of the user. |  |
|**zipCode** | **String** | The residence city zipcode of the user. |  |
|**country** | **String** | The residence country of the user.  |  |
|**cardHolder** | **String** | The name associated to the card. |  |



