

# WalletObjectWalletsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**walletId** | **Integer** | The unique identifier of the Wallet. |  [optional] |
|**walletTypeId** | [**WalletTypeIdEnum**](#WalletTypeIdEnum) | The type of Wallet. Learn more in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation.  |  [optional] |
|**walletStatus** | [**WalletStatusEnum**](#WalletStatusEnum) | The status of the Wallet. |  [optional] |
|**codeStatus** | [**CodeStatusEnum**](#CodeStatusEnum) | See [Wallet status](/guide/wallets/introduction.html#wallet-status).  |  [optional] |
|**informationStatus** | **String** | Additional information regarding the &#x60;codeStatus&#x60;, if any.  |  [optional] |
|**walletTag** | **String** | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.    Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  |  [optional] |
|**userId** | **Integer** | The unique identifier of the User owning the Wallet. |  [optional] |
|**userLastname** | **String** | The last name of the User owning the Wallet. |  [optional] |
|**userFirstname** | **String** | The first name of the User owning the Wallet. |  [optional] |
|**jointUserId** | **Integer** |  |  [optional] |
|**tariffId** | **Integer** | The fees applied to the Wallet, as defined by your contract with Treezor. Usually required, but may have a default value set by Treezor. |  [optional] |
|**eventName** | **String** | The name of the Wallet. |  [optional] |
|**eventAlias** | **String** |  |  [optional] |
|**eventDate** | **String** |  |  [optional] |
|**eventMessage** | **String** | Can be used to describe the Wallet. |  [optional] |
|**eventPayinStartDate** | **String** |  |  [optional] |
|**eventPayinEndDate** | **String** |  |  [optional] |
|**contractSigned** | **Integer** |  |  [optional] |
|**bic** | [**BicEnum**](#BicEnum) | The [BIC](/guide/overview/glossary.html#bank-identifier-code-bic) of the Wallet, indicating in which country the wallet is domiciled.   This value may be required depending on your configuration. Learn more in the [Local IBAN](/guide/wallets/iban.html#local-iban) article.  |  [optional] |
|**iban** | **String** | The [IBAN](/guide/wallets/iban.html#virtual-iban) of the Wallet.  |  [optional] |
|**urlImage** | **String** |  |  [optional] |
|**currency** | **String** | The currency of the Wallet. |  [optional] |
|**createdDate** | **String** | The date and time at which the Wallet was created. |  [optional] |
|**modifiedDate** | **String** | The date and time at which the Wallet was modified. |  [optional] |
|**payinCount** | **Integer** |  |  [optional] |
|**payoutCount** | **Integer** |  |  [optional] |
|**transferCount** | **Integer** |  |  [optional] |
|**solde** | **Float** |  |  [optional] |
|**authorizedBalance** | **Float** |  |  [optional] |
|**totalRows** | **Integer** | The total numbers of objects matching your search, for pagination purposes. Only valued in the first object of the returned page, &#x60;null&#x60; otherwise.  |  [optional] |
|**country** | **String** | The country of the Wallet owner, inherited from the User object address.  |  [optional] |



## Enum: WalletTypeIdEnum

| Name | Value |
|---- | -----|
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |
| NUMBER_15 | 15 |



## Enum: WalletStatusEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;CANCELED&quot; |
| PENDING | &quot;PENDING&quot; |
| VALIDATED | &quot;VALIDATED&quot; |



## Enum: CodeStatusEnum

| Name | Value |
|---- | -----|
| NUMBER_120001 | 120001 |
| NUMBER_120002 | 120002 |
| NUMBER_120003 | 120003 |
| NUMBER_120004 | 120004 |
| NUMBER_120005 | 120005 |



## Enum: BicEnum

| Name | Value |
|---- | -----|
| TRZOFR21_XXX | &quot;TRZOFR21XXX&quot; |
| TRZODEB2_XXX | &quot;TRZODEB2XXX&quot; |
| TRZOITM2_XXX | &quot;TRZOITM2XXX&quot; |
| TRZOESM2_XXX | &quot;TRZOESM2XXX&quot; |



