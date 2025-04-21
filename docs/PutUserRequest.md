

# PutUserRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userTag** | **String** | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  |  [optional] |
|**accessTag** | **String** | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  |  [optional] |
|**specifiedUSPerson** | **Integer** | You may read more about who is considered a US Person in the [dedicated article](/guide/user-verification/tax-residence.html#the-specific-case-of-us-taxpayers).  |  [optional] |
|**controllingPersonType** | [**ControllingPersonTypeEnum**](#ControllingPersonTypeEnum) | Type of relationship, among the following: * &#x60;0&#x60; – None (default) * &#x60;1&#x60; – Shareholder * &#x60;2&#x60; – Other_relationship * &#x60;3&#x60; – Director  |  [optional] |
|**employeeType** | [**EmployeeTypeEnum**](#EmployeeTypeEnum) | The type of relationship among the following: * &#x60;0&#x60; – None (default) * &#x60;1&#x60; – Leader * &#x60;2&#x60; – Employee  |  [optional] |
|**title** | **String** | The title of the user, which can be one of the following: * &#x60;M&#x60; – Stands for mister (Mr.) * &#x60;MME&#x60; – Stands for misses (Mrs.) * &#x60;MLLE&#x60; – Stands for miss  |  [optional] |
|**firstname** | **String** | The first name of the User. |  [optional] |
|**lastname** | **String** | The last name of the User. |  [optional] |
|**middleNames** | **String** | The middle names of the User, if any. |  [optional] |
|**birthday** | **String** | The birth date of the User. Format: YYYY-MM-DD  |  [optional] |
|**email** | **String** | The email address of the User. Must be valid. |  [optional] |
|**address1** | **String** | The User postal address (main).  The following characters are accepted (uppercase or lowercase): * The 26 letters of the Roman alphabet * 16 letters with diacritical marks (À Â Ä Ç É È Ê Ë Î Ï Ô Ö Ù Û Ü Ÿ) * 2 ligatures (æ, œ) * Spaces, hyphens, apostrophes, or slashes « » / * Numeric characters  |  [optional] |
|**address2** | **String** | The User postal address (complement). Cannot contain carriage return.  The following characters are accepted (uppercase or lowercase): * The 26 letters of the Roman alphabet * 16 letters with diacritical marks (À Â Ä Ç É È Ê Ë Î Ï Ô Ö Ù Û Ü Ÿ) * 2 ligatures (æ, œ) * Spaces, hyphens, apostrophes, or slashes « » / * Numeric characters  |  [optional] |
|**address3** | **String** | The User postal address (complement2). Cannot contain carriage return.  The following characters are accepted (uppercase or lowercase): * The 26 letters of the Roman alphabet * 16 letters with diacritical marks (À Â Ä Ç É È Ê Ë Î Ï Ô Ö Ù Û Ü Ÿ) * 2 ligatures (æ, œ) * Spaces, hyphens, apostrophes, or slashes « » / * Numeric characters  |  [optional] |
|**postcode** | **String** | The User address postcode. |  [optional] |
|**city** | **String** | The User address city. |  [optional] |
|**state** | **String** | The User address state. |  [optional] |
|**country** | **String** | The country of the user&#39;s address. |  [optional] |
|**distributionCountry** | [**DistributionCountryEnum**](#DistributionCountryEnum) | The country in which the end user is using your services. Available values may vary depending on your configuration, see [Distribution Country](/guide/users/introduction.html#distribution-country-distributioncountry) for more information.  This field is only required when you operate in multiple countries. Otherwise, it either defaults to your country or is set to &#x60;null&#x60;.  |  [optional] |
|**secondaryAddress1** | **String** | The User secondary postal address (main). |  [optional] |
|**secondaryAddress2** | **String** | The User secondary postal address (complement) |  [optional] |
|**secondaryAddress3** | **String** | The User secondary postal address (complement2) |  [optional] |
|**secondaryPostcode** | **String** | The User secondary address postcode. |  [optional] |
|**secondaryCity** | **String** | The User secondary address city. |  [optional] |
|**secondaryState** | **String** | The User secondary address state. |  [optional] |
|**secondaryCountry** | **String** | The User secondary address country. Format: ISO  3166-1 alpha-2  |  [optional] |
|**phone** | **String** | The User phone number in [international E.164 format](https://en.wikipedia.org/wiki/E.164).  |  [optional] |
|**mobile** | **String** | The User mobile phone number in [international E.164 format](https://en.wikipedia.org/wiki/E.164).  |  [optional] |
|**nationality** | **String** | The User nationality.  |  [optional] |
|**nationalityOther** | **String** | The User other nationality.  |  [optional] |
|**placeOfBirth** | **String** | The User place of birth.  The following characters are accepted (uppercase or lowercase): * The 26 letters of the Roman alphabet * 16 letters with diacritical marks (À Â Ä Ç É È Ê Ë Î Ï Ô Ö Ù Û Ü Ÿ) * 2 ligatures (æ, œ) * Spaces, hyphens, apostrophes, or slashes « » / * Numeric characters  |  [optional] |
|**birthCountry** | **String** | The User country of Birth.   |  [optional] |
|**occupation** | **String** | Free field to specify the occupation of the user. |  [optional] |
|**incomeRange** | [**IncomeRangeEnum**](#IncomeRangeEnum) | The User income range. |  [optional] |
|**legalName** | **String** | The name of the legal entity.   If you&#39;re issuing cards, please note this value automatically populates the &#x60;embossedLegalName&#x60; field which has a max. length of 20 characters.  |  [optional] |
|**legalRegistrationNumber** | **String** | The Business registration number. |  [optional] |
|**legalTvaNumber** | **String** | The Business VAT number. |  [optional] |
|**legalRegistrationDate** | **LocalDate** | The Business registration date. |  [optional] |
|**legalForm** | **String** | The legal form/category of the company. See the [Legal Forms](/guide/users/legal-entity.html#legal-forms-legalform) section for more information.  |  [optional] |
|**legalShareCapital** | **Integer** | The Business share capital. |  [optional] |
|**legalSector** | **String** | The Business Sector of the company (NAF or NACE code in France). The expected format depends on &#x60;legalSectorType&#x60;  You may check out [the authoritative list](https://www.insee.fr/fr/information/2120875)  |  [optional] |
|**legalAnnualTurnOver** | [**LegalAnnualTurnOverEnum**](#LegalAnnualTurnOverEnum) | The Business annual turnover (in k€). |  [optional] |
|**legalNetIncomeRange** | [**LegalNetIncomeRangeEnum**](#LegalNetIncomeRangeEnum) | The Business net income range (in k€). |  [optional] |
|**legalNumberOfEmployeeRange** | [**LegalNumberOfEmployeeRangeEnum**](#LegalNumberOfEmployeeRangeEnum) | The Business number of employees. |  [optional] |
|**effectiveBeneficiary** | **Integer** | The effective beneficiary shares of the legal entity (e.g., for a beneficiary holding 70% of a company, value must be &#x60;70&#x60;). For shareholders only. |  [optional] |
|**language** | **String** | The User preferred language. Format: ISO 639-1  |  [optional] |
|**taxNumber** | **String** | Deprecated. Your must use the &#x60;taxResidence&#x60; endpoint. |  [optional] |
|**taxResidence** | **String** | Deprecated. Your must use the &#x60;taxResidence&#x60; endpoint. |  [optional] |
|**position** | **String** | The geographic activity coverage (for NGOs only). |  [optional] |
|**personalAssets** | [**PersonalAssetsEnum**](#PersonalAssetsEnum) | Deprecated. You must use &#x60;personalAssetsRange&#x60; instead. |  [optional] |
|**activityOutsideEu** | [**ActivityOutsideEuEnum**](#ActivityOutsideEuEnum) | For Users obligated to complete a due diligence questionnaire regarding sanctions and embargoes.   Whether the entity and its business units, subsidiaries, and joint ventures have a commercial activity outside of the European Union.  Can be: * &#x60;0&#x60; – False * &#x60;1&#x60; – True. When set to this value, the next attributes become mandatory.   See the [Sanctions and embargo](/guide/users/legal-entity.html#sanctions-and-embargo) article for more information.  |  [optional] |
|**economicSanctions** | [**EconomicSanctionsEnum**](#EconomicSanctionsEnum) | For Users obligated to complete a due diligence questionnaire regarding sanctions and embargoes, and for which the &#x60;activityOutsideEu&#x60; value is set to &#x60;1&#x60;.  Whether the entity, its subsidiaries, entities, employees, directors, beneficial owners, or joint ventures are subject to Economic Sanctions.  Can be: * &#x60;0&#x60; – False * &#x60;1&#x60; – True   See the [Sanctions and embargo](/guide/users/legal-entity.html#sanctions-and-embargo) article for more information.  |  [optional] |
|**residentCountriesSanctions** | [**ResidentCountriesSanctionsEnum**](#ResidentCountriesSanctionsEnum) | For Users obligated to complete a due diligence questionnaire regarding sanctions and embargoes, and for which the &#x60;activityOutsideEu&#x60; value is set to &#x60;1&#x60;.  Whether the entity, its subsidiaries, or joint ventures, located within or operating from any countries or territories are subject to Comprehensive Sanctions.   Can be: * &#x60;0&#x60; – False * &#x60;1&#x60; – True   See the [Sanctions and embargo](/guide/users/legal-entity.html#sanctions-and-embargo) article for more information.  |  [optional] |
|**involvedSanctions** | [**InvolvedSanctionsEnum**](#InvolvedSanctionsEnum) | For Users obligated to complete a due diligence questionnaire regarding sanctions and embargoes, and for which the &#x60;activityOutsideEu&#x60; value is set to &#x60;1&#x60;.  Whether the entity, its subsidiaries, or joint ventures, are engaged in transactions, investments, business, or other dealings that directly or indirectly involve or benefit: * Any countries or territories subject to Comprehensive Sanctions (Cuba, Iran, North Korea, Syria, Crimea, Ukrainian Oblasts not controlled by the government, or Russia), or  * Any person or entity which is the target of any Sanctions (“Sanctioned Targets”).  Can be: * &#x60;0&#x60; – False * &#x60;1&#x60; – True   See the [Sanctions and embargo](/guide/users/legal-entity.html#sanctions-and-embargo) article for more information.  |  [optional] |
|**entitySanctionsQuestionnaire** | [**EntitySanctionsQuestionnaireEnum**](#EntitySanctionsQuestionnaireEnum) | For Users obligated to complete a due diligence questionnaire regarding sanctions and embargoes, and for which the &#x60;activityOutsideEu&#x60; value is set to &#x60;1&#x60;.  Defines the scope to which the &#x60;activityOutsideEu&#x60; field applies: * &#x60;0&#x60; – Not applicable * &#x60;1&#x60; – Only the legal entity * &#x60;2&#x60; – The legal entity and all its subsidiaries held at 100% * &#x60;3&#x60; – The legal entity and all its subsidiaries held at 50% or more * &#x60;4&#x60; – The legal entity and a list of subsidiaries  See the [Sanctions and embargo](/guide/users/legal-entity.html#sanctions-and-embargo) article for more information.  |  [optional] |
|**timezone** | **String** | The User timezone in the [tz database](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) format. The timezones have unique names in the form \&quot;Area/Location\&quot; (e.g. \&quot;America/New_York\&quot;, \&quot;Europe/Paris\&quot;).  It may be used to enforce a card &#x60;paymentDailyLimit&#x60; based on the cardholder&#39;s timezone.  |  [optional] |
|**occupationType** | [**OccupationTypeEnum**](#OccupationTypeEnum) | Deprecated. Use &#x60;occupationCategory&#x60; instead. |  [optional] |
|**sourceOfFunds** | [**SourceOfFundsEnum**](#SourceOfFundsEnum) | The source of funds for opening an account for a company or self-employed person. |  [optional] |
|**legalSectorType** | [**LegalSectorTypeEnum**](#LegalSectorTypeEnum) | Qualify the type of data in the &#x60;legalSector&#x60; field: * If it is set to NACE the legalSector needs to be in a NACE format (4 digits).  * If it is set to NAF (or not set at all) the legalSector needs to be in a NAF format (4 digits followed by a capital letter).  |  [optional] |
|**isOnStockExchange** | [**IsOnStockExchangeEnum**](#IsOnStockExchangeEnum) | The user is a corporation and is quoted on an organized stock exchange. * &#x60;0&#x60; – No * &#x60;1&#x60; – Yes  |  [optional] |
|**occupationCategory** | [**OccupationCategoryEnum**](#OccupationCategoryEnum) | Type of occupation of the user. See [Occupation Category](/guide/users/physical.html#occupation-category-occupationcategory) for the list of values.  |  [optional] |
|**personalAssetsRange** | [**PersonalAssetsRangeEnum**](#PersonalAssetsRangeEnum) | The personal assets range of the user. See [Personal Assets Range](/guide/users/physical.html#personal-assets-range-personalassetsrange) for the list of values.  |  [optional] |
|**monthlyIncomeRange** | [**MonthlyIncomeRangeEnum**](#MonthlyIncomeRangeEnum) | Net monthly income of the user. See [Monthly Income Range](/guide/users/physical.html#monthly-income-range-monthlyincomerange) for the list of values.  |  [optional] |



## Enum: ControllingPersonTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



## Enum: EmployeeTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |



## Enum: DistributionCountryEnum

| Name | Value |
|---- | -----|
| FR | &quot;FR&quot; |
| ES | &quot;ES&quot; |
| IT | &quot;IT&quot; |
| DE | &quot;DE&quot; |
| BE | &quot;BE&quot; |
| NL | &quot;NL&quot; |



## Enum: IncomeRangeEnum

| Name | Value |
|---- | -----|
| _0_18 | &quot;0-18&quot; |
| _19_23 | &quot;19-23&quot; |
| _24_27 | &quot;24-27&quot; |
| _28_35 | &quot;28-35&quot; |
| _36_56 | &quot;36-56&quot; |
| _57_ | &quot;57-*&quot; |



## Enum: LegalAnnualTurnOverEnum

| Name | Value |
|---- | -----|
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
| _0_4 | &quot;0-4&quot; |
| _5_9 | &quot;5-9&quot; |
| _10_49 | &quot;10-49&quot; |
| _50_149 | &quot;50-149&quot; |
| _150_499 | &quot;150-499&quot; |
| _500_ | &quot;500-*&quot; |



## Enum: LegalNumberOfEmployeeRangeEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1_9 | &quot;1-9&quot; |
| _10_99 | &quot;10-99&quot; |
| _100_249 | &quot;100-249&quot; |
| _250_ | &quot;250-*&quot; |



## Enum: PersonalAssetsEnum

| Name | Value |
|---- | -----|
| _0_2 | &quot;0-2&quot; |
| _3_22 | &quot;3-22&quot; |
| _23_128 | &quot;23-128&quot; |
| _129_319 | &quot;129-319&quot; |
| _320_464 | &quot;320-464&quot; |
| _465_ | &quot;465-&quot; |



## Enum: ActivityOutsideEuEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: EconomicSanctionsEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: ResidentCountriesSanctionsEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: InvolvedSanctionsEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: EntitySanctionsQuestionnaireEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |



## Enum: OccupationTypeEnum

| Name | Value |
|---- | -----|
| SELF_EMPLOYED | &quot;self_employed&quot; |
| PUBLIC_SECTOR_EMPLOYEES | &quot;public_sector_employees&quot; |
| PRIVATE_SECTOR_EMPLOYEES | &quot;private_sector_employees&quot; |
| RETIRED_PEOPLE_AND_STUDENTS | &quot;retired_people_and_students&quot; |
| WITHOUT_ANY_PROFESSIONAL_ACTIVITY | &quot;without_any_professional_activity&quot; |



## Enum: SourceOfFundsEnum

| Name | Value |
|---- | -----|
| DONATION | &quot;donation&quot; |
| INHERITANCE | &quot;inheritance&quot; |
| LOAN | &quot;loan&quot; |
| LOTTERY | &quot;lottery&quot; |
| PENSION | &quot;pension&quot; |
| PROCEEDS_FROM_INVESTMENT | &quot;proceeds_from_investment&quot; |
| PROCEEDS_FROM_SALE | &quot;proceeds_from_sale&quot; |
| SALARY | &quot;salary&quot; |
| SAVINGS | &quot;savings&quot; |



## Enum: LegalSectorTypeEnum

| Name | Value |
|---- | -----|
| NAF | &quot;NAF&quot; |
| NACE | &quot;NACE&quot; |



## Enum: IsOnStockExchangeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: OccupationCategoryEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |
| NUMBER_8 | 8 |
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |
| NUMBER_11 | 11 |
| NUMBER_12 | 12 |
| NUMBER_13 | 13 |
| NUMBER_14 | 14 |
| NUMBER_15 | 15 |



## Enum: PersonalAssetsRangeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |



## Enum: MonthlyIncomeRangeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |



