

# CaptureResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operation** | **String** | This value will always be &#39;capture&#39;. |  [optional] |
|**profile** | **String** | HiPay merchant identifier (mid), also known as profile |  [optional] |
|**authorizationCode** | **String** | HiPay authorization code linked to the payin |  [optional] |
|**transactionReference** | **String** | The reference of the transaction |  [optional] |
|**dateCreated** | **String** | The creation date of the payin |  [optional] |
|**dateUpdated** | **String** | The last update date of the payin |  [optional] |
|**dateAuthorized** | **String** | The authorized date of the payin |  [optional] |
|**status** | **String** | Transaction status returned by HiPay |  [optional] |
|**message** | **String** | Message returned by HiPay |  [optional] |
|**authorizedAmount** | **String** | Authorized amount |  [optional] |
|**capturedAmount** | **String** | Captured amount |  [optional] |
|**refundedAmount** | **String** | Refunded amount |  [optional] |
|**decimals** | **String** | The number of digits after the decimal point of the transaction amount  |  [optional] |
|**currency** | **String** | Base currency for this payin  This three-character currency code must comply with ISO-4217 |  [optional] |



