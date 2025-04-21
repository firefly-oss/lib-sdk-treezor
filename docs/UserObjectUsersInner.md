

# UserObjectUsersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **Integer** | The unique identifier of the User. |  [optional] |
|**userStatus** | [**UserStatusEnum**](#UserStatusEnum) | The status of the User. |  [optional] |
|**userTag** | **String** | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  |  [optional] |
|**parentUserId** | **Integer** | The unique identifier of the parent user (if any). |  [optional] |
|**parentType** | [**ParentTypeEnum**](#ParentTypeEnum) | The type of relationship between the parent and the current users.  You may read more about [parent-children relationships](/guide/users/parent-children.html).  |  [optional] |
|**controllingPersonType** | [**ControllingPersonTypeEnum**](#ControllingPersonTypeEnum) | Type of relationship: * &#x60;0&#x60; – None (default) * &#x60;1&#x60; – Shareholder * &#x60;2&#x60; – Other_relationship * &#x60;3&#x60; – Director  You may read more about [parent-children relationships](/guide/users/parent-children.html).  |  [optional] |
|**employeeType** | [**EmployeeTypeEnum**](#EmployeeTypeEnum) | The role of the user in [parent-children relationships](/guide/users/parent-children.html): * &#x60;0&#x60; – None (default) * &#x60;1&#x60; – Leader * &#x60;2&#x60; – Employee  |  [optional] |
|**specifiedUSPerson** | [**SpecifiedUSPersonEnum**](#SpecifiedUSPersonEnum) | When set to &#x60;1&#x60;, the user must have a US tax residence declared.  Should be set to &#x60;0&#x60; otherwise.  You may read more about who is considered a US Person in the [dedicated article](/guide/user-verification/tax-residence.html#the-specific-case-of-us-taxpayers).  |  [optional] |
|**title** | [**TitleEnum**](#TitleEnum) | The title of the user, which can be one of the following: * &#x60;M&#x60; – Stands for mister (Mr.) * &#x60;MME&#x60; – Stands for misses (Mrs.) * &#x60;MLLE&#x60; – Stands for miss  |  [optional] |
|**firstname** | **String** | The first name of the User. |  [optional] |
|**lastname** | **String** | The last name of the User. |  [optional] |
|**middleNames** | **String** | The middle names of the User, if any. |  [optional] |
|**birthday** | **String** | The birth date of the User.  Format: &#x60;YYYY-MM-DD&#x60;  |  [optional] |
|**email** | **String** | The email of the User. Must be valid and unique. |  [optional] |
|**address1** | **String** | The User postal address (main).  The following characters are accepted (uppercase or lowercase):   * The 26 letters of the Roman alphabet   * 16 letters with diacritical marks (À Â Ä Ç É È Ê Ë Î Ï Ô Ö Ù Û Ü Ÿ)   * 2 ligatures (æ, œ)   * Spaces, hyphens, apostrophes, or slashes « » /   * Numeric characters  |  [optional] |
|**address2** | **String** | The User postal address (complement).  The following characters are accepted (uppercase or lowercase):   * The 26 letters of the Roman alphabet   * 16 letters with diacritical marks (À Â Ä Ç É È Ê Ë Î Ï Ô Ö Ù Û Ü Ÿ)   * 2 ligatures (æ, œ)   * Spaces, hyphens, apostrophes, or slashes « » /   * Numeric characters  |  [optional] |
|**address3** | **String** | The User postal address (complement2).  The following characters are accepted (uppercase or lowercase):   * The 26 letters of the Roman alphabet   * 16 letters with diacritical marks (À Â Ä Ç É È Ê Ë Î Ï Ô Ö Ù Û Ü Ÿ)   * 2 ligatures (æ, œ)   * Spaces, hyphens, apostrophes, or slashes « » /   * Numeric characters  |  [optional] |
|**postcode** | **String** | The User address postcode. |  [optional] |
|**city** | **String** | The User address city. |  [optional] |
|**state** | **String** | The User address state. |  [optional] |
|**country** | **String** |  |  [optional] |
|**countryName** | **String** |  |  [optional] |
|**distributionCountry** | [**DistributionCountryEnum**](#DistributionCountryEnum) | The country in which the end user is using your services.  |  [optional] |
|**secondaryAddress1** | **String** |  |  [optional] |
|**secondaryAddress2** | **String** |  |  [optional] |
|**secondaryAddress3** | **String** |  |  [optional] |
|**secondaryPostcode** | **String** |  |  [optional] |
|**secondaryCity** | **String** |  |  [optional] |
|**secondaryState** | **String** |  |  [optional] |
|**secondaryCountry** | **String** | Format ISO 3166-1 alpha-2 |  [optional] |
|**clientId** | **String** | The clientId of the environment. |  [optional] |
|**phone** | **String** |  |  [optional] |
|**mobile** | **String** |  |  [optional] |
|**nationality** | **String** | Format ISO 3166-1 alpha-2 |  [optional] |
|**nationalityOther** | **String** | Format ISO 3166-1 alpha-2 |  [optional] |
|**placeOfBirth** | **String** | The city in which the User was born.  The following characters are accepted (uppercase or lowercase):   * The 26 letters of the Roman alphabet   * 16 letters with diacritical marks (À Â Ä Ç É È Ê Ë Î Ï Ô Ö Ù Û Ü Ÿ)   * 2 ligatures (æ, œ)   * Spaces, hyphens, apostrophes, or slashes « » /   * Numeric characters  |  [optional] |
|**birthCountry** | **String** | The country in which the User was born. |  [optional] |
|**occupation** | **String** | Free field to specify the occupation of the user. |  [optional] |
|**incomeRange** | **String** |  |  [optional] |
|**legalName** | **String** | The name of the legal entity. |  [optional] |
|**legalNameEmbossed** | **String** | Populated from the &#x60;legalName&#x60; value.  |  [optional] |
|**legalRegistrationNumber** | **String** | The registration number of the legal entity. |  [optional] |
|**legalTvaNumber** | **String** | The VAT number of the legal entity. |  [optional] |
|**legalRegistrationDate** | **String** | Date YYYY-MM-DD |  [optional] |
|**legalForm** | **String** | The legal form/category of the company. See the [Legal Forms](/guide/users/legal-entity.html#legal-forms-legalform) section for more information.  |  [optional] |
|**legalShareCapital** | **Integer** |  |  [optional] |
|**legalSector** | **String** |  |  [optional] |
|**legalAnnualTurnOver** | [**LegalAnnualTurnOverEnum**](#LegalAnnualTurnOverEnum) | The Business annual turnover (in k€). |  [optional] |
|**legalNetIncomeRange** | [**LegalNetIncomeRangeEnum**](#LegalNetIncomeRangeEnum) | The Business net income range (in k€). |  [optional] |
|**legalNumberOfEmployeeRange** | [**LegalNumberOfEmployeeRangeEnum**](#LegalNumberOfEmployeeRangeEnum) | The number of employees of the legal entity. |  [optional] |
|**effectiveBeneficiary** | **Integer** | The effective beneficiary shares of the legal entity (e.g., for a beneficiary holding 70% of a company, value must be &#x60;70&#x60;). For shareholders only. |  [optional] |
|**kycLevel** | [**KycLevelEnum**](#KycLevelEnum) | * &#x60;0&#x60; – NONE * &#x60;1&#x60; – LIGHT * &#x60;2&#x60; – REGULAR * &#x60;3&#x60; – STRONG * &#x60;4&#x60; – REFUSED * &#x60;5&#x60; – PREVALIDATED * &#x60;6&#x60; – ENHANCED  |  [optional] |
|**kycReview** | [**KycReviewEnum**](#KycReviewEnum) | * &#x60;0&#x60; – NONE * &#x60;1&#x60; – PENDING * &#x60;2&#x60; – VALIDATED * &#x60;3&#x60; – REFUSED * &#x60;4&#x60; – INVESTIGATING (deprecated) * &#x60;5&#x60; – CLOSED (deprecated) * &#x60;6&#x60; – REVIEW_OPEN * &#x60;7&#x60; – REVIEW_PENDING  |  [optional] |
|**kycReviewComment** | **String** | A comment set by Treezor upon [KYC review](/guide/user-verification/introduction.html). It concatenates information for each KYC Review update, with the date, the &#x60;kycReview&#x60; and &#x60;kycLevel&#x60; values, and the comment from Treezor.  |  [optional] |
|**isFreezed** | **Integer** | deprecated |  [optional] |
|**isFrozen** | **Integer** |  |  [optional] |
|**language** | **String** | The preferred language of the User, in the ISO 639 (alpha-2) format.  |  [optional] |
|**optInMailing** | **Integer** |  |  [optional] |
|**sepaCreditorIdentifier** | **String** | The 13-character long [SEPA Creditor Identifier](/guide/overview/glossary.html#sepa-creditor-identifier-sci) of the User.  |  [optional] [readonly] |
|**taxNumber** | **String** |  |  [optional] |
|**taxResidence** | **String** |  |  [optional] |
|**position** | **String** |  |  [optional] |
|**personalAssets** | **String** |  |  [optional] |
|**activityOutsideEu** | [**ActivityOutsideEuEnum**](#ActivityOutsideEuEnum) | Whether the entity and its business units, subsidiaries, and joint ventures have a commercial activity outside of the European Union. |  [optional] |
|**economicSanctions** | [**EconomicSanctionsEnum**](#EconomicSanctionsEnum) | Whether the entity, its subsidiaries, entities, employees, directors, beneficial owners, or joint ventures are subject to Economic Sanctions. |  [optional] |
|**residentCountriesSanctions** | [**ResidentCountriesSanctionsEnum**](#ResidentCountriesSanctionsEnum) | Whether the entity, its subsidiaries, or joint ventures, located within or operating from any countries or territories are subject to Comprehensive Sanctions. |  [optional] |
|**involvedSanctions** | [**InvolvedSanctionsEnum**](#InvolvedSanctionsEnum) | Whether the entity, its subsidiaries, or joint ventures, are engaged in transactions, investments, business, or other dealings that directly or indirectly involve or benefit: * Any countries or territories subject to Comprehensive Sanctions, or * Any person or entity which is the target of any Sanctions (“Sanctioned Targets”).  |  [optional] |
|**entitySanctionsQuestionnaire** | [**EntitySanctionsQuestionnaireEnum**](#EntitySanctionsQuestionnaireEnum) | Defines the scope to which the &#x60;activityOutsideEu&#x60; field applies: * &#x60;0&#x60; – Not applicable * &#x60;1&#x60; – Only the legal entity * &#x60;2&#x60; – The legal entity and all its subsidiaries held at 100% * &#x60;3&#x60; – The legal entity and all its subsidiaries held at 50% or more * &#x60;4&#x60; – The legal entity and a list of subsidiaries  See the [Sanctions and embargo](/guide/users/legal-entity.html#sanctions-and-embargo) article for more information.  |  [optional] |
|**sanctionsQuestionnaireDate** | **OffsetDateTime** | Date YYYY-MM-DD HH:mm:ss |  [optional] |
|**timezone** | **String** |  |  [optional] |
|**occupationType** | [**OccupationTypeEnum**](#OccupationTypeEnum) | Deprecated. Use &#x60;occupationCategory&#x60; instead. |  [optional] |
|**sourceOfFunds** | [**SourceOfFundsEnum**](#SourceOfFundsEnum) | The source of funds for opening an account for a company or self-employed person |  [optional] |
|**legalSectorType** | [**LegalSectorTypeEnum**](#LegalSectorTypeEnum) | Qualify the type of data in the &#x60;legalSector&#x60; field    * If it is set to NACE the legalSector needs to be in a NACE format (4 digits).    * If it is set to NAF (or not set at all) the legalSector needs to be in a NAF format (4 digits followed by a capital letter).  |  [optional] |
|**isOnStockExchange** | [**IsOnStockExchangeEnum**](#IsOnStockExchangeEnum) | The user is a corporation and is quoted on an organized stock exchange.   * &#x60;0&#x60; – No   * &#x60;1&#x60; – Yes  |  [optional] |
|**codeStatus** | [**CodeStatusEnum**](#CodeStatusEnum) | See [User Status](/guide/users/introduction.html#user-status-codestatus) for more information.  |  [optional] |
|**informationStatus** | **String** | Additional information regarding the &#x60;codeStatus&#x60;, if any.  |  [optional] |
|**createdDate** | **OffsetDateTime** | The date and time at which the User was created.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**modifiedDate** | **OffsetDateTime** | The date and time at which the User was last updated.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**walletCount** | **Integer** | The number of Wallets owned by the User. |  [optional] |
|**payinCount** | **Integer** | The number of payins made to this user. |  [optional] |
|**totalRows** | **Integer** | The total numbers of objects matching your search, for pagination purposes. Only valued in the first object of the returned page, &#x60;null&#x60; otherwise.  |  [optional] |
|**occupationCategory** | [**OccupationCategoryEnum**](#OccupationCategoryEnum) | Type of occupation of the user. See [Occupation Category](/guide/users/physical.html#occupation-category-occupationcategory) for the list of values.  |  [optional] |
|**personalAssetsRange** | [**PersonalAssetsRangeEnum**](#PersonalAssetsRangeEnum) | The personal assets range of the user. See [Personal Assets Range](/guide/users/physical.html#personal-assets-range-personalassetsrange) for the list of values.  |  [optional] |
|**monthlyIncomeRange** | [**MonthlyIncomeRangeEnum**](#MonthlyIncomeRangeEnum) | Net monthly income of the user. See [Monthly Income Range](/guide/users/physical.html#monthly-income-range-monthlyincomerange) for the list of values.  |  [optional] |
|**birthCityCode** | **String** | Always set to null. |  [optional] |



## Enum: UserStatusEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;CANCELED&quot; |
| PENDING | &quot;PENDING&quot; |
| VALIDATED | &quot;VALIDATED&quot; |



## Enum: ParentTypeEnum

| Name | Value |
|---- | -----|
| EMPLOYEE | &quot;employee&quot; |
| LEADER | &quot;leader&quot; |
| SHAREHOLDER | &quot;shareholder&quot; |



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



## Enum: SpecifiedUSPersonEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: TitleEnum

| Name | Value |
|---- | -----|
| M | &quot;M&quot; |
| MLLE | &quot;MLLE&quot; |
| MME | &quot;MME&quot; |



## Enum: DistributionCountryEnum

| Name | Value |
|---- | -----|
| BE | &quot;BE&quot; |
| DE | &quot;DE&quot; |
| ES | &quot;ES&quot; |
| FR | &quot;FR&quot; |
| IT | &quot;IT&quot; |
| NL | &quot;NL&quot; |



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



## Enum: KycLevelEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |



## Enum: KycReviewEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |



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
| PRIVATE_SECTOR_EMPLOYEES | &quot;private_sector_employees&quot; |
| PUBLIC_SECTOR_EMPLOYEES | &quot;public_sector_employees&quot; |
| RETIRED_PEOPLE_AND_STUDENTS | &quot;retired_people_and_students&quot; |
| SELF_EMPLOYED | &quot;self_employed&quot; |
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
| NACE | &quot;NACE&quot; |
| NAF | &quot;NAF&quot; |



## Enum: IsOnStockExchangeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: CodeStatusEnum

| Name | Value |
|---- | -----|
| _110005 | &quot;110005&quot; |
| _110006 | &quot;110006&quot; |
| _110009 | &quot;110009&quot; |
| _110012 | &quot;110012&quot; |



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



