

# DeleteWalletRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessTag** | **String** | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  |  [optional] |
|**origin** | [**OriginEnum**](#OriginEnum) | The origin of the request for cancelling the Wallet, which can be one of the following: &lt;ul&gt;&lt;li&gt;&#x60;OPERATOR&#x60; – When **you** are at the origin of the deactivation.&lt;/li&gt;&lt;li&gt;&#x60;USER&#x60; – When the **end user** is at the origin of the deactivation.&lt;/li&gt;&lt;/ul&gt;  |  |
|**originId** | **String** | The unique identifier of the Wallet. Learn more in the [Wallet Types](/guide/wallets/introduction.html) documentation.  |  [optional] |



## Enum: OriginEnum

| Name | Value |
|---- | -----|
| OPERATOR | &quot;OPERATOR&quot; |
| USER | &quot;USER&quot; |



