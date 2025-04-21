

# GetOperations200ResponseDataInnerMetadata


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
|**payinId** | **String** |  |  [optional] |
|**payinRefundId** | **String** |  |  [optional] |
|**transactionReference** | **String** |  |  [optional] |
|**payinTag** | **String** |  |  [optional] |
|**additionalData** | **List&lt;String&gt;** |  |  [optional] |
|**chargebackReason** | **String** |  |  [optional] |
|**messageToUser** | **String** |  |  [optional] |
|**codeStatus** | **String** |  |  [optional] |
|**informationStatus** | **String** |  |  [optional] |
|**paymentMethodId** | **Integer** |  |  [optional] |
|**ibanFullname** | **String** |  |  [optional] |
|**ibanBic** | **String** |  |  [optional] |
|**dbtrIBAN** | **String** |  |  [optional] |
|**mandateId** | **String** |  |  [optional] |
|**ibanTxEndToEndId** | **String** |  |  [optional] |
|**debtorName** | **String** |  |  [optional] |
|**uniqueMandateReference** | **String** | The unique reference that unambiguiously identify a mandate signed between the user and the beneficiary. See the [Unique Mandate Reference (UMR)](/guide/overview/glossary.html#unique-mandate-reference-umr) article for more information. |  [optional] |
|**reasonTms** | **String** |  |  [optional] |
|**ibanFullName** | **String** |  |  [optional] |
|**payoutTag** | **String** |  |  [optional] |
|**beneficiaryId** | **String** |  |  [optional] |
|**label** | **String** |  |  [optional] |
|**payoutTypeId** | [**PayoutTypeIdEnum**](#PayoutTypeIdEnum) |  |  [optional] |
|**supportingFileLink** | **String** |  |  [optional] |
|**endToEndId** | **String** |  |  [optional] |
|**reasonCode** | **String** |  |  [optional] |
|**reasonDescription** | **String** |  |  [optional] |
|**beneficiaryName** | **String** |  |  [optional] |
|**payoutRefundTag** | **String** |  |  [optional] |
|**requestComment** | **String** |  |  [optional] |
|**refundDate** | **String** |  |  [optional] |
|**refundComment** | **String** |  |  [optional] |
|**payoutId** | **String** |  |  [optional] |
|**tag** | **String** |  |  [optional] |
|**creditorWalletId** | **String** |  |  [optional] |
|**creditorFirstName** | **String** |  |  [optional] |
|**creditorLastName** | **String** |  |  [optional] |
|**creditorLegalName** | **String** |  |  [optional] |
|**creditorWalletEventName** | **String** |  |  [optional] |
|**debtorWalletId** | **String** |  |  [optional] |
|**debtorFirstName** | **String** |  |  [optional] |
|**debtorLastName** | **String** |  |  [optional] |
|**debtorLegalName** | **String** |  |  [optional] |
|**debtorWalletEventName** | **String** |  |  [optional] |



## Enum: PayoutTypeIdEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



