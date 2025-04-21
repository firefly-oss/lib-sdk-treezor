

# SearchBusiness200ResponseInnerBusinessinformationsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**legalName** | **String** | Business commercial name. |  [optional] |
|**phone** | **String** | Business phone number. |  [optional] |
|**legalTvaNumber** | **String** | Business VAT number. |  [optional] |
|**legalRegistrationNumber** | **String** | Business registration number. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | | Code | Description | | ---- | ----------- | |  D   | Deleted     | |  N   | Company non diffusible (Insee) | |  I   | Inactive (Insee) | |  A   | Economically active | |  C   | Closed | |  T   | Transfered | |  S   | Economically stopped (Insee) | |  L   | Liquidation | |  O   | Dormant company |  |  [optional] |
|**officeType** | [**OfficeTypeEnum**](#OfficeTypeEnum) | Can be one of the following: * &#x60;0&#x60; – Secondary establishment * &#x60;1&#x60; – Headquarter  |  [optional] |
|**safeNumber** | **String** | Business SAFE number. |  [optional] |
|**activityType** | **String** | Business sector. Code NAF in France. |  [optional] |
|**externalId** | **String** | Business external id. |  [optional] |
|**address1** | **String** | The address of the business. |  [optional] |
|**postcode** | **String** | The postal code of the business&#39; address. |  [optional] |
|**city** | **String** | The city of the business&#39; address. |  [optional] |
|**state** | **String** | Business&#39; province. |  [optional] |
|**country** | **String** | The country of the business&#39; address.  |  [optional] |
|**tradename** | **String** | The trade name of the legal entity. |  [optional] |



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



## Enum: OfficeTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



