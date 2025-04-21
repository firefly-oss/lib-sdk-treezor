

# PostBeneficiaryRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessTag** | **String** | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  |  [optional] |
|**tag** | **String** | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  |  [optional] |
|**userId** | **Integer** | The unique identifier of the User to which the Beneficiary is attached. |  |
|**nickName** | **String** | Name choosen by end user to easily recognize the beneficiary.  |  [optional] |
|**name** | **String** | Beneficiary name, linked to bank account. Allowed characters are: * &#x60;a&#x60; to &#x60;z&#x60; * &#x60;A&#x60; to &#x60;Z&#x60;  * &#x60;0&#x60; to &#x60;9&#x60;  * &#x60;/&#x60; &#x60;-&#x60; &#x60;?&#x60; &#x60;:&#x60; &#x60;(&#x60; &#x60;)&#x60; &#x60;.&#x60; &#x60;,&#x60; &#x60;&#39;&#x60; &#x60;+&#x60; &#x60;Space&#x60;  |  |
|**address** | **String** | Beneficiary address, linked to bank account. |  [optional] |
|**iban** | **String** | Beneficiary International Bank Account Number. Mandatory if &#x60;usableForSct&#x60; is &#x60;true&#x60;.  |  [optional] |
|**bic** | **String** | Beneficiary Bank Identifier Code. Mandatory if &#x60;usableForSct&#x60; is &#x60;true&#x60;.  |  [optional] |
|**sepaCreditorIdentifier** | **String** | Beneficiary SEPA Creditor Identifier. Mandatory to validate incoming direct debit, useless other wise. Between 8 and 35 h.   If sddB2bWhitelist or sddCoreBlacklist is provided then sepaCreditorIdentifier is mandatory.  |  [optional] |
|**sddB2bWhitelist** | [**List&lt;PostBeneficiaryRequestSddB2bWhitelistInner&gt;**](PostBeneficiaryRequestSddB2bWhitelistInner.md) | Each unique mandate reference, with its frequency type, must be explicitely allowed when doing B2B Direct Debit. Furthermore, a mandate not used during more than 36 months will be automatically rejected even if in the white list. If provided, sepaCreditorIdentifier is mandatory.  |  [optional] |
|**sddCoreBlacklist** | **List&lt;String&gt;** | Core Direct Debit are accepted by default. If a Core mandate is to be refused on reception, it has to be added to this list. If wild char * (star) is used instead of a UMR, all Direct Debit from this beneficiary will be refused. If provided, sepaCreditorIdentifier is mandatory.  |  [optional] |
|**usableForSct** | **Boolean** | Indicated if the beneficiary can be used for SEPA Credit Transfer. This field is a conveniant way to filter all beneficiaries for a user that would like to do a Credit Transfer. Indeed, beneficaries are created automatically when receiving a Core Direct Debit and therefor by looking at the list you won&#39;t be able to idnetify which beneficary to use on SCT.  |  [optional] |



