

# TransferObjectTransfersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transferId** | **Integer** | The unique identifier of the Transfer. |  [optional] |
|**transferStatus** | [**TransferStatusEnum**](#TransferStatusEnum) | The status of the Transfer. See [Transfer statuses](/guide/transfers/introduction.html#transfer-statuses-codestatus) for more information.  |  [optional] |
|**transferTag** | **String** | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  |  [optional] |
|**walletId** | **Integer** | The unique identifier of the debited Wallet. |  [optional] |
|**walletTypeId** | [**WalletTypeIdEnum**](#WalletTypeIdEnum) | The type of the debited Wallet:  * &#x60;9&#x60; – Electronic Money Wallet  * &#x60;10&#x60; – Payment Account Wallet  |  [optional] |
|**beneficiaryWalletId** | **Integer** | The unique identifier of the credited Wallet. |  [optional] |
|**beneficiaryWalletTypeId** | [**BeneficiaryWalletTypeIdEnum**](#BeneficiaryWalletTypeIdEnum) | The type of Wallet. Learn more in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation.  |  [optional] |
|**walletEventName** | **String** | The name of the debited Wallet. |  [optional] |
|**walletAlias** | **String** |  |  [optional] |
|**beneficiaryWalletEventName** | **String** | The name of the credited Wallet. |  [optional] |
|**beneficiaryWalletAlias** | **String** |  |  [optional] |
|**amount** | **String** | The amount of the transfer. |  [optional] |
|**currency** | **String** | The currency of the transfer. |  [optional] |
|**label** | **String** | The label of the transfer, to display on the receiver&#39;s statement for instance.  |  [optional] |
|**transferTypeId** | [**TransferTypeIdEnum**](#TransferTypeIdEnum) | The type of transfer: * &#x60;1&#x60; – Wallet to wallet  * &#x60;2&#x60; – Card transaction * &#x60;3&#x60; – Client fees * &#x60;4&#x60; – Credit note  |  [optional] |
|**createdDate** | **OffsetDateTime** | The date and time at which the transfer is created.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**modifiedDate** | **OffsetDateTime** | The date and time at which the transfer is updated.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**totalRows** | **Integer** | The total numbers of objects matching your search, for pagination purposes. Only valued in the first object of the returned page, &#x60;null&#x60; otherwise.  |  [optional] |
|**foreignId** | **String** |  |  [optional] |
|**partnerFee** | **String** |  |  [optional] |
|**codeStatus** | [**CodeStatusEnum**](#CodeStatusEnum) | The code for the status of the transfer. See [Transfer statuses](/guide/transfers/introduction.html#transfer-statuses-codestatus) for more information.  |  [optional] |
|**informationStatus** | **String** | Additional information regarding the status of the transfer (if any). |  [optional] |
|**metadata** | **String** |  |  [optional] |



## Enum: TransferStatusEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;CANCELED&quot; |
| PENDING | &quot;PENDING&quot; |
| VALIDATED | &quot;VALIDATED&quot; |



## Enum: WalletTypeIdEnum

| Name | Value |
|---- | -----|
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |
| NUMBER_15 | 15 |



## Enum: BeneficiaryWalletTypeIdEnum

| Name | Value |
|---- | -----|
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |
| NUMBER_15 | 15 |



## Enum: TransferTypeIdEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |



## Enum: CodeStatusEnum

| Name | Value |
|---- | -----|
| _150001 | &quot;150001&quot; |
| _150002 | &quot;150002&quot; |
| _150003 | &quot;150003&quot; |
| _150004 | &quot;150004&quot; |
| _150005 | &quot;150005&quot; |
| _150006 | &quot;150006&quot; |



