

# TransactionObjectTransactionsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **Integer** | The unique identifier of the Transaction object. |  [optional] |
|**walletDebitId** | **Integer** | The unique identifier of the debited Wallet. |  [optional] |
|**walletCreditId** | **Integer** | The unique identifier of the credited Wallet. |  [optional] |
|**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) | The type the transaction. See the [Transactions](/guide/wallets/transactions.html#transaction-types-transactiontype) article for the list of possible values.  |  [optional] |
|**foreignId** | **Integer** | The unique identifier of the initial operation that created the Transaction (e.g., &#x60;payinId&#x60;, &#x60;payoutId&#x60;, etc.)  |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** | Additional information regarding the Transaction. |  [optional] |
|**valueDate** | **String** | The value date of the transaction (date applied for the payment).  Format: YYYY-MM-DD  |  [optional] |
|**executionDate** | **String** | The date of the execution of the transaction.  Format: &#x60;YYYY-MM-DD&#x60;  |  [optional] |
|**amount** | **Float** |  |  [optional] |
|**walletDebitBalance** | **Float** | The balance of the debited Wallet after the transaction.  |  [optional] |
|**walletCreditBalance** | **Float** | The balance of the credited Wallet after the transaction.  |  [optional] |
|**currency** | **String** | The currency in the [ISO 4217](/guide/api-basics/data-format.html#currencies) format.  |  [optional] |
|**createdDate** | **OffsetDateTime** | The date and time at which the transaction was created.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**totalRows** | **Integer** | The total numbers of objects matching your search, for pagination purposes. Only valued in the first object of the returned page, &#x60;null&#x60; otherwise.  |  [optional] |



## Enum: TransactionTypeEnum

| Name | Value |
|---- | -----|
| PAYIN | &quot;Payin&quot; |
| PAYOUT | &quot;Payout&quot; |
| TRANSFER | &quot;Transfer&quot; |
| PAYIN_REFUND | &quot;Payin Refund&quot; |
| CARD_TRANSACTION | &quot;Card Transaction&quot; |
| PAYOUT_REFUND | &quot;Payout Refund&quot; |
| PAYIN_ACQUIRING | &quot;Payin Acquiring&quot; |
| PAYIN_REFUND_ACQUIRING | &quot;Payin Refund Acquiring&quot; |
| SCTR_INST | &quot;SCTR Inst&quot; |
| PAYIN_SCT_INSTANT_RECALL | &quot;Payin SCT Instant Recall&quot; |
| PAYOUT_SCT_INSTANT_EMIT | &quot;Payout SCT Instant Emit&quot; |
| PAYIN_SCT_INSTANT_EMIT_RECALL | &quot;Payin SCT Instant Emit Recall&quot; |
| CREDIT_TRANSFER_RETURNED | &quot;Credit Transfer Returned&quot; |
| CHECK_PAYIN | &quot;Check Payin&quot; |
| SDDE | &quot;SDDE&quot; |
| SDDR | &quot;SDDR&quot; |
| SDDR_REVERSAL | &quot;SDDR Reversal&quot; |
| SCTR_RECALL | &quot;SCTR Recall&quot; |
| CHECK_REFUND | &quot;Check Refund&quot; |
| SCTR | &quot;SCTR&quot; |



