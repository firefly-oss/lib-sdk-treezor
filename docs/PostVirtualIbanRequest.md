

# PostVirtualIbanRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**walletId** | **Integer** | The unique identifier of the Wallet to which the Virtual IBAN is associated. Must be a &#x60;walletType&#x60; of &#x60;9&#x60; or &#x60;10&#x60;.  |  |
|**typeId** | [**TypeIdEnum**](#TypeIdEnum) | The type of IBAN, allowing for a specific transfer direction.  Can be: &lt;ul&gt;&lt;li&gt;&#x60;1&#x60; for &#x60;SDDR&#x60; [SEPA Direct Debit](/guide/transfers/direct-debit.html)&lt;/li&gt;&lt;li&gt;&#x60;2&#x60; for &#x60;SCTR&#x60; [SEPA Credit Transfer](/guide/transfers/credit-transfer.html#received-credit-transfers-sctr)&lt;/li&gt;&lt;/ul&gt;  |  |
|**tag** | **String** | Custom attribute that you can use as you see fit.  Learn more in the [Object tags](/guide/api-basics/objects-tags.html) article.  |  [optional] |
|**accessTag** | **String** | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  |  [optional] |
|**validFrom** | **String** | The date from which the Virtual IBAN validity starts. Defaults to today&#39;s date and must be set in the future.  Format: &#x60;YYYY-MM-DD&#x60;  |  [optional] |
|**validTo** | **String** | The date from which the Virtual IBAN validity ends. Must be set after the &#x60;validFrom&#x60; date.  Format: &#x60;YYYY-MM-DD&#x60;  |  [optional] |
|**maxUsage** | **Integer** | The maximum number of transactions allowed (&#x60;0&#x60; &#x3D; unlimited).   |  [optional] |
|**maxAmount** | **BigDecimal** | The maximum cumulated amount of all transactions (&#x60;\&quot;0.00\&quot;&#x60; &#x3D; unlimited).  |  [optional] |
|**reference** | **String** | Custom field for your internal reference of the Virtual IBAN.  |  [optional] |



## Enum: TypeIdEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |



