

# PutCountryRestrictionGroups200ResponseCountryRestrictionGroupsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The unique identifier of the Country Restriction Group. |  [optional] |
|**name** | **String** | The name of the Country Restriction Group. |  [optional] |
|**isWhitelist** | **Boolean** | Indicates the kind of restriction:   * &#x60;true&#x60; (default) – Allows only a specified list of countries (whitelist)  * &#x60;false&#x60; – Allows all countries except the specified list (blacklist)  |  [optional] |
|**countries** | **List&lt;String&gt;** | The list of countries. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the Country Restriction Group. |  [optional] |
|**startDate** | **OffsetDateTime** | The date and time at which the restriction starts.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**createdDate** | **OffsetDateTime** | The date and time at which the restriction group was created.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**modifiedDate** | **OffsetDateTime** | The date and time at which the restriction group was created.   Format: &#x60;YYY-MM-DD HH:mm:ss&#x60;  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;CANCELED&quot; |
| PENDING | &quot;PENDING&quot; |
| VALIDATED | &quot;VALIDATED&quot; |



