

# BeneficiaryObjectBeneficiariesInnerSddB2bWhitelistInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uniqueMandateReference** | **String** | The unique reference that unambiguiously identify a mandate signed between the user and the beneficiary.     See the [Unique Mandate Reference (UMR)](/guide/overview/glossary.html#unique-mandate-reference-umr) article for more information.  |  |
|**isRecurrent** | **Boolean** | If mandate is a recuring payment, this field must be true.  |  |
|**walletId** | **BigDecimal** | If present, the Direct Debit will be accepted only if the targeted wallet is the wallet with the given walletId. Without this value, the SDD can target any wallets of the user. With the value specified, only the explicitely authorized wallet can be targeted by SDD.  |  [optional] |



