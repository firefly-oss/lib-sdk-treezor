

# BeneficiaryObjectBeneficiariesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The unique identifier of the Beneficiary.  |  [optional] |
|**tag** | **String** | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  |  [optional] |
|**userId** | **Integer** | The unique identifier of the User to which the Beneficiary is attached. |  [optional] |
|**nickName** | **String** | Name choosen by end user to easily recognize the beneficiary.  |  [optional] |
|**name** | **String** | Beneficiary name, linked to bank account. |  [optional] |
|**address** | **String** | Beneficiary address, linked to bank account. |  [optional] |
|**iban** | **String** | The encrypted International Bank Account Number (IBAN) of the beneficiary. |  [optional] |
|**bic** | **String** | Beneficiary Bank Identifier Code. |  [optional] |
|**sepaCreditorIdentifier** | **String** | Beneficiary [SEPA Creditor Identifier](/guide/overview/glossary.html#sepa-creditor-identifier-sci). Mandatory to validate B2B incoming direct debit, useless otherwise. Between 8 and 35 h.  |  [optional] |
|**sddB2bWhitelist** | [**List&lt;BeneficiaryObjectBeneficiariesInnerSddB2bWhitelistInner&gt;**](BeneficiaryObjectBeneficiariesInnerSddB2bWhitelistInner.md) | Each unique mandate reference, with its frequency type, must be explicitely allowed when doing B2B Direct Debit.   Furthermore, a mandate not used during more than 36 months will be automatically rejected even if in the whitelist.  |  [optional] |
|**sddCoreBlacklist** | **List&lt;String&gt;** | Core Direct Debit are accepted by default. If a Core mandate is to be refused on reception, it has to be added to this list. If wild char * (star) is used instead of a UMR, all Direct Debit from this beneficiary will be refused. Note that the mandate ref entered is case sensitive.  |  [optional] |
|**usableForSct** | **Boolean** | Indicated if the beneficiary can be used for SEPA Credit Transfer. This field is a conveniant way to filter all beneficiaries for a user that would like to do a Credit Transfer. Indeed, beneficaries are created automatically when receiving a Core Direct Debit and therefor by looking at the list you won&#39;t be able to idnetify which beneficary to use on SCT.  |  [optional] |
|**sddCoreKnownUniqueMandateReference** | **List&lt;String&gt;** |  |  [optional] |
|**isActive** | **Boolean** | Whether or not the Beneficiary is active. |  [optional] |
|**createdDate** | **OffsetDateTime** | The date and time at which the beneficiary was created.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**modifiedDate** | **OffsetDateTime** | The date and time at which the beneficiary was last updated.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |



