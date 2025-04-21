

# PutMccRestrictionGroupsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the MCC restriction group |  [optional] |
|**accessTag** | **String** | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the MCC restriction group |  [optional] |
|**isWhitelist** | **Boolean** | determines whether it will be a black or a white list |  [optional] |
|**mcc** | **List&lt;Integer&gt;** | Array of MCC |  [optional] |
|**startDate** | **OffsetDateTime** | The date at which the MCC restriction group will be take into account.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**fields** | **List&lt;String&gt;** | List of the object properties to be returned, allowing you to filter the response payload. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| VALIDATED | &quot;VALIDATED&quot; |
| PENDING | &quot;PENDING&quot; |
| CANCELED | &quot;CANCELED&quot; |



