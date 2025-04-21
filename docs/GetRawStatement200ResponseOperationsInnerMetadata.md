

# GetRawStatement200ResponseOperationsInnerMetadata

Additional information regarding the operation. Content depends on the `type`. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentId** | **String** | The unique identifier of the card payment (or attempted payment), allowing you to follow the card transaction life cycle.  |  [optional] |
|**maskedPan** | **String** | Partially hidden card number.  |  [optional] |
|**merchantName** | **String** | The name of the merchant. |  [optional] |
|**localAmount** | [**StatementCardPaymentLocalAmount**](StatementCardPaymentLocalAmount.md) |  |  [optional] |
|**payinId** | **String** |  |  [optional] |
|**payinRefundId** | **String** |  |  [optional] |
|**transactionReference** | **String** |  |  [optional] |
|**payinTag** | **String** |  |  [optional] |
|**additionalData** | **List&lt;String&gt;** |  |  [optional] |
|**chargebackReason** | **String** |  |  [optional] |
|**label** | **String** |  |  [optional] |
|**ibanFullname** | **String** |  |  [optional] |
|**ibanBic** | **String** |  |  [optional] |
|**dbtrIBAN** | **String** |  |  [optional] |
|**ibanTxEndToEndId** | **String** |  |  [optional] |
|**mandateId** | **String** |  |  [optional] |
|**debtorName** | **String** |  |  [optional] |
|**uniqueMandateReference** | **String** | The unique reference that unambiguiously identify a mandate signed between the user and the beneficiary. See the [Unique Mandate Reference (UMR)](/guide/overview/glossary.html#unique-mandate-reference-umr) article for more information. |  [optional] |
|**payoutId** | **String** |  |  [optional] |
|**payoutTag** | **String** |  |  [optional] |
|**beneficiaryId** | **String** |  |  [optional] |
|**beneficiaryName** | **String** |  |  [optional] |
|**endToEndId** | **String** |  |  [optional] |
|**reasonCode** | **String** |  |  [optional] |
|**reasonDescription** | **String** |  |  [optional] |
|**payoutRefundId** | **String** |  |  [optional] |
|**transferId** | **String** |  |  [optional] |
|**transferTag** | **String** |  |  [optional] |
|**creditorFirstName** | **String** |  |  [optional] |
|**creditorLastName** | **String** |  |  [optional] |
|**creditorLegalName** | **String** |  |  [optional] |
|**debtorWalletId** | **String** |  |  [optional] |
|**debtorFirstName** | **String** |  |  [optional] |
|**debtorLastName** | **String** |  |  [optional] |
|**debtorLegalName** | **String** |  |  [optional] |



