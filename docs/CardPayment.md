

# CardPayment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mcc** | [**CardPaymentMcc**](CardPaymentMcc.md) |  |  [optional] |
|**mid** | [**CardPaymentMid**](CardPaymentMid.md) |  |  [optional] |
|**localAmount** | [**CardPaymentLocalAmount**](CardPaymentLocalAmount.md) |  |  [optional] |
|**authorisationResponseCode** | [**CardPaymentAuthorisationResponseCode**](CardPaymentAuthorisationResponseCode.md) |  |  [optional] |
|**paymentLifeCycle** | [**List&lt;PaymentLifeCycle&gt;**](PaymentLifeCycle.md) |  |  [optional] |
|**paymentCountry** | **String** |  |  [optional] |
|**cardId** | **String** |  |  [optional] |
|**publicToken** | **String** |  |  [optional] |
|**maskedPan** | **String** |  |  [optional] |
|**is3DS** | **String** |  |  [optional] |
|**_3dsExemptionType** | **String** | Indicates why the transaction was exempted for 3DS authentication. See [3DS Exemption Type](/guide/cards/transactions.html#_3ds-exemption-type-3dsexemptiontype) for the value list.  |  [optional] |
|**optimizedMerchantName** | **String** |  |  [optional] |
|**merchantLogo** | **String** |  |  [optional] |
|**merchantCategory** | **String** |  |  [optional] |
|**transactionSubtype** | **String** | Additional information regarding the type of card transaction. Values can be:   * &#x60;OFT&#x60; – Offline transaction   * &#x60;PRE&#x60; – Preauthorization   * &#x60;SEP&#x60; – Second presentment  |  [optional] |
|**authorizationNote** | **String** |  |  [optional] |



