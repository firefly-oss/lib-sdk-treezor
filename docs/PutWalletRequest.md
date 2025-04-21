

# PutWalletRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessTag** | **String** | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  |  [optional] |
|**tariffId** | **Integer** | The fees applied to the Wallet, as defined by your contract with Treezor. |  [optional] |
|**walletTypeId** | [**WalletTypeIdEnum**](#WalletTypeIdEnum) | The type of Wallet. Can only be updated if no transaction occurred with the Wallet yet.  The following values are allowed: * &#x60;9&#x60; – Electronic Money Wallet * &#x60;10&#x60; – Payment Account Wallet  Other types are available but can only be set by Treezor. Learn more in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation.  |  [optional] |
|**bic** | [**BicEnum**](#BicEnum) | The [BIC](/guide/overview/glossary.html#bank-identifier-code-bic) of the Wallet, indicating in which country the wallet is domiciled.   This value may be required depending on your configuration. Learn more in the [Local IBAN](/guide/wallets/iban.html#local-iban) article.  |  [optional] |
|**walletTag** | **String** | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  |  [optional] |
|**eventName** | **String** | The name of the Wallet. |  [optional] |
|**eventMessage** | **String** | Can be used to describe the Wallet. |  [optional] |



## Enum: WalletTypeIdEnum

| Name | Value |
|---- | -----|
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |



## Enum: BicEnum

| Name | Value |
|---- | -----|
| TRZOFR21_XXX | &quot;TRZOFR21XXX&quot; |
| TRZODEB2_XXX | &quot;TRZODEB2XXX&quot; |
| TRZOITM2_XXX | &quot;TRZOITM2XXX&quot; |
| TRZOESM2_XXX | &quot;TRZOESM2XXX&quot; |



