

# MandateObjectMandatesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mandateId** | **Integer** | The unique identifier of the Mandate. |  [optional] |
|**title** | [**TitleEnum**](#TitleEnum) | The title inherited from the User object. Can be one of the following: * &#x60;M&#x60; – Stands for mister (Mr.) * &#x60;MME&#x60; – Stands for misses (Mrs.) * &#x60;MLLE&#x60; – Stands for miss  |  [optional] |
|**legalInformations** | **String** |  |  [optional] |
|**uniqueMandateReference** | **String** | The unique reference that unambiguiously identify a mandate signed between the user and the beneficiary.           See the [Unique Mandate Reference (UMR)](/guide/overview/glossary.html#unique-mandate-reference-umr) article for more information.  |  [optional] |
|**mandateStatus** | [**MandateStatusEnum**](#MandateStatusEnum) | The status of the mandate. |  [optional] |
|**userId** | **Integer** | The unique identifier of the User. |  [optional] |
|**debtorName** | **String** | Full name of the debited end user (person or entity).  Format: alphanumeric with at least 3 alphabetic characters.  |  [optional] |
|**debtorAddress** | **String** | The address of the debited end user. |  [optional] |
|**debtorCity** | **String** | City in which the debited end user is domiciled. |  [optional] |
|**debtorZipCode** | **String** | Postcode of the city in which the debited end user is domiciled. |  [optional] |
|**debtorCountry** | **String** | Country in which the debited end user is domiciled. |  [optional] |
|**debtorIban** | **String** | IBAN of the debited user. |  [optional] |
|**debtorBic** | **String** | The BIC (or SWIFT) of the debited user. |  [optional] |
|**sequenceType** | [**SequenceTypeEnum**](#SequenceTypeEnum) | Defines whether or not the debtor will be debited multiple times. Can be one of the following: * &#x60;one-off&#x60; – For a one-time payment. * &#x60;recurrent&#x60; – For recurring payments.  |  [optional] |
|**creditorName** | **String** | The full name of the creditor. |  [optional] |
|**sepaCreditorIdentifier** | **String** | The [SEPA Creditor Identifier](/guide/overview/glossary.html#sepa-creditor-identifier-sci). |  [optional] |
|**creditorAddress** | **String** | The address of the creditor. |  [optional] |
|**creditorCity** | **String** | The city in which the creditor is domiciled. |  [optional] |
|**creditorZipCode** | **String** | The postcode of the city in which the creditor is domiciled. |  [optional] |
|**creditorCountry** | **String** | Country in which the creditor is domiciled. |  [optional] |
|**signatureDate** | **LocalDate** | Date on which the Mandate was signed by the end user.  Format: &#x60;YYYY-MM-DD&#x60;  |  [optional] |
|**debtorSignatureIp** | **String** |  |  [optional] |
|**signed** | **Integer** | Whether or not the mandate is signed. |  [optional] |
|**debtorIdentificationCode** | **String** |  |  [optional] |
|**debtorReferencePartyName** | **String** |  |  [optional] |
|**debtorReferenceIdentificationCode** | **String** |  |  [optional] |
|**creditorReferencePartyName** | **String** |  |  [optional] |
|**creditorReferenceIdentificationCode** | **String** |  |  [optional] |
|**contractIdentificationNumber** | **String** |  |  [optional] |
|**contractDescription** | **String** |  |  [optional] |
|**isPaper** | **Boolean** | Whether the Mandate is a paper-based document, or electronically signed. As of today, should only be set to &#x60;true&#x60;.  |  [optional] |
|**sddType** | [**SddTypeEnum**](#SddTypeEnum) | The type of Mandate, which can be: * &#x60;core&#x60; – To debit individuals (physical persons). * &#x60;b2b&#x60; – To debit legal entities.  |  [optional] |
|**revocationSignatureDate** | **OffsetDateTime** | Date and time at which the mandate was revoked (set to &#x60;CANCELED&#x60;)  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**createdIp** | **String** |  |  [optional] |
|**createdDate** | **OffsetDateTime** | Date and time at which the mandate was created.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**modifiedDate** | **OffsetDateTime** | Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**codeStatus** | **String** |  |  [optional] |
|**informationStatus** | **String** | Additional information regarding the &#x60;codeStatus&#x60;, if any.  |  [optional] |
|**userIdUltimateCreditor** | **Integer** |  |  [optional] |



## Enum: TitleEnum

| Name | Value |
|---- | -----|
| M | &quot;M&quot; |
| MME | &quot;MME&quot; |
| MLLE | &quot;MLLE&quot; |



## Enum: MandateStatusEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;CANCELED&quot; |
| PENDING | &quot;PENDING&quot; |
| VALIDATED | &quot;VALIDATED&quot; |



## Enum: SequenceTypeEnum

| Name | Value |
|---- | -----|
| ONE_OFF | &quot;one-off&quot; |
| RECURRENT | &quot;recurrent&quot; |



## Enum: SddTypeEnum

| Name | Value |
|---- | -----|
| B2B | &quot;b2b&quot; |
| CORE | &quot;core&quot; |



