

# PostPayoutRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payoutTag** | **Integer** | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  |  [optional] |
|**accessTag** | **String** | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  |  [optional] |
|**walletId** | **Integer** | The unique identifier of the debited Wallet. |  |
|**payoutTypeId** | [**PayoutTypeIdEnum**](#PayoutTypeIdEnum) | Type of payout among the following: * &#x60;1&#x60; for SEPA Credit Transfer (default) * &#x60;2&#x60; for SEPA Direct Debit * &#x60;3&#x60; for SEPA Instant Credit Transfer  |  [optional] |
|**bankAccountId** | **Integer** | DEPRECATED - Use &#x60;beneficiaryId&#x60; instead. |  [optional] |
|**beneficiaryId** | **Integer** | The unique identifier of the payout Beneficiary. |  |
|**label** | **String** | The payout label that will be displayed on the receiver&#39;s bank account.  Allowed characters: &#x60;a b c d e f g h i j k l m n o p q r s t u v w x y z A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 0 1 2 3 4 5 6 7 8 9 / - ? : ( ) . , &#39; + Space“.&#x60;  * Accentuated characters will be replaced by the same characters without accent  * &#x60;/n&#x60; character are removed * Must not start or end with &#x60;/&#x60; * Must not contain &#x60;//&#x60;  |  [optional] |
|**endToEndId** | **String** | Unique identification assigned by the final client to unumbiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain.  Allowed characters: &#x60;a b c d e f g h i j k l m n o p q r s t u v w x y z A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 0 1 2 3 4 5 6 7 8 9 / - ? : ( ) . , &#39; + Space“.&#x60;  * Accentuated characters will be replaced by the same characters without accent  * &#x60;/n&#x60; character are removed * Must not start or end with &#x60;/&#x60; * Must not contain &#x60;//&#x60;  |  [optional] |
|**amount** | **Float** | The amount of the payout. * Must be greater than &#x60;0&#x60;.  * Must be specified as a number with 2 decimals.   For example &#x60;180.99&#x60; for 180,99 euros and &#x60;120.00&#x60; for 120 euros.   |  |
|**currency** | **String** | The currency of the transfer amount.   Format: [ISO 4217](/guide/api-basics/data-format.html#currencies).  |  |
|**supportFileLink** | **String** | The link of the support file. |  [optional] |



## Enum: PayoutTypeIdEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



