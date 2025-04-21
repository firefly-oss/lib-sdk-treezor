

# GetBusinessInfo200ResponseBusinessinformationsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**legalName** | **String** | Business commercial name. |  [optional] |
|**legalRegistrationNumber** | **String** | Business registration number. |  [optional] |
|**legalRegistrationDate** | **String** | Business registration date. |  [optional] |
|**legalForm** | **String** | The legal form/category of the company. See the [Legal Forms](/guide/users/legal-entity.html#legal-forms-legalform) section for more information.  |  [optional] |
|**legalShareCapital** | **BigDecimal** | Business share capital. |  [optional] |
|**legalSector** | **String** | The Business Sector of the company (NAF or NACE code in France). The expected format depends on &#x60;legalSectorType&#x60;  You may check out [the authoritative list](https://www.insee.fr/fr/information/2120875)  |  [optional] |
|**legalAnnualTurnOver** | [**LegalAnnualTurnOverEnum**](#LegalAnnualTurnOverEnum) | Business annual turnover range in k€.  |  [optional] |
|**legalNetIncomeRange** | [**LegalNetIncomeRangeEnum**](#LegalNetIncomeRangeEnum) | Business annual netincome in k€.  |  [optional] |
|**legalNumberOfEmployeeRange** | [**LegalNumberOfEmployeeRangeEnum**](#LegalNumberOfEmployeeRangeEnum) | Business workforce.  |  [optional] |
|**phone** | **String** | Business phone number. |  [optional] |
|**email** | **String** | Business generic email. |  [optional] |
|**address1** | **String** | Business&#39; street |  [optional] |
|**postcode** | **String** | Business&#39; postal code |  [optional] |
|**city** | **String** | Business&#39; city |  [optional] |
|**state** | **String** | Business&#39; province |  [optional] |
|**country** | **String** | Business&#39; country |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | | Code | Description | | ---- | ----------- | |  D   | Deleted     | |  N   | Company non diffusible (Insee) | |  I   | Inactive (Insee) | |  A   | Economically active | |  C   | Closed | |  T   | Transfered | |  S   | Economically stopped (Insee) | |  L   | Liquidation | |  O   | Dormant company |  |  [optional] |
|**tradename** | **String** | Business trade name |  [optional] |
|**users** | [**List&lt;GetBusinessInfo200ResponseBusinessinformationsInnerUsersInner&gt;**](GetBusinessInfo200ResponseBusinessinformationsInnerUsersInner.md) |  |  [optional] |



## Enum: LegalAnnualTurnOverEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;&quot; |
| _0_39 | &quot;0-39&quot; |
| _40_99 | &quot;40-99&quot; |
| _100_249 | &quot;100-249&quot; |
| _250_999 | &quot;250-999&quot; |
| _1000_2999 | &quot;1000-2999&quot; |
| _3000_9999 | &quot;3000-9999&quot; |
| _10000_99999 | &quot;10000-99999&quot; |
| _100000_ | &quot;100000-*&quot; |



## Enum: LegalNetIncomeRangeEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;&quot; |
| _0_4 | &quot;0-4&quot; |
| _5_9 | &quot;5-9&quot; |
| _10_49 | &quot;10-49&quot; |
| _50_149 | &quot;50-149&quot; |
| _150_499 | &quot;150-499&quot; |
| _500_ | &quot;500-*&quot; |



## Enum: LegalNumberOfEmployeeRangeEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;&quot; |
| _0 | &quot;0&quot; |
| _1_9 | &quot;1-9&quot; |
| _10_99 | &quot;10-99&quot; |
| _100_249 | &quot;100-249&quot; |
| _250_ | &quot;250-*&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| C | &quot;C&quot; |
| D | &quot;D&quot; |
| I | &quot;I&quot; |
| L | &quot;L&quot; |
| N | &quot;N&quot; |
| O | &quot;O&quot; |
| S | &quot;S&quot; |
| T | &quot;T&quot; |



