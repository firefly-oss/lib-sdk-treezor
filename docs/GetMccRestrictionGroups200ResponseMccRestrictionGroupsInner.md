

# GetMccRestrictionGroups200ResponseMccRestrictionGroupsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The unique identifier of the MCC Group. |  [optional] |
|**name** | **String** | The name of the MCC Group. |  [optional] |
|**isWhitelist** | **Boolean** | Indicates the kind of restriction:  * &#x60;true&#x60; (default) – Allows only a specified list of merchant caegories (whitelist) * &#x60;false&#x60; – Allows all merchant categories except the specified list (blacklist)  |  [optional] |
|**mcc** | **List&lt;Integer&gt;** | The list of MCC (each item is an integer). |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the MCC group. |  [optional] |
|**startDate** | **OffsetDateTime** | The date and time at which the restriction starts. Defaults to the date and time of creation.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**createdDate** | **OffsetDateTime** | The date and time at which the restriction group was created.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**modifiedDate** | **OffsetDateTime** | The date and time at which the restriction group was last updated.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;CANCELED&quot; |
| PENDING | &quot;PENDING&quot; |
| VALIDATED | &quot;VALIDATED&quot; |



