

# PostMandatesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sddType** | [**SddTypeEnum**](#SddTypeEnum) | The type of Mandate, which can be: * &#x60;core&#x60; – To debit individuals (physical persons). * &#x60;b2b&#x60; – To debit legal entities.  |  |
|**accessTag** | **String** | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  |  [optional] |
|**isPaper** | **Boolean** | Whether the Mandate is a paper-based document, or electronically signed. As of today, should only be set to &#x60;true&#x60;.  |  |
|**userId** | **Integer** | The unique identifier of the end user requesting the SEPA Direct Debit (i.e., the creditor initiating the Mandate request). |  |
|**debtorName** | **String** | The full name of the debited entity or individual. Format: alphanumeric with at least 3 alphabetic characters.  |  |
|**debtorAddress** | **String** | The address of the debited end user. |  |
|**debtorCity** | **String** | The city in which the debited end user is domiciled. |  |
|**debtorZipcode** | **String** | The postcode of the city in which the debited end user is domiciled. |  |
|**debtorCountry** | **String** | Country in which the debited end user is domiciled. |  |
|**debtorIban** | **String** | IBAN of the debited user. |  |
|**debtorBic** | **String** | The BIC (or SWIFT) of the debited user |  [optional] |
|**sequenceType** | [**SequenceTypeEnum**](#SequenceTypeEnum) | Defines whether or not the debtor will be debited multiple times. Can be one of the following: * &#x60;one-off&#x60; – For a one-time payment. * &#x60;recurrent&#x60; – For recurring payments.  |  |
|**createdIp** | **String** | IP address of the end user requesting the SDD. |  [optional] |
|**signatureDate** | **LocalDate** | Date on which the Mandate was signed by the end user.  Format: &#x60;YYYY-MM-DD&#x60;  |  |



## Enum: SddTypeEnum

| Name | Value |
|---- | -----|
| CORE | &quot;core&quot; |
| B2B | &quot;b2b&quot; |



## Enum: SequenceTypeEnum

| Name | Value |
|---- | -----|
| ONE_OFF | &quot;one-off&quot; |
| RECURRENT | &quot;recurrent&quot; |



