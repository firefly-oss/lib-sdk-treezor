

# DigitalizedCardsPutDigitalizedCardResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier of the digitized card. |  [optional] |
|**cardId** | **String** | The unique identifier of the card. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | * &#x60;A&#x60; **A**ctive * &#x60;D&#x60; (or &#x60;X&#x60;) **D**eleted * &#x60;S&#x60; **S**uspended * &#x60;U&#x60; **U**nmapped  |  [optional] |
|**createdDate** | **OffsetDateTime** | The date and time at which the digitalized card was created.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**modifiedDate** | **OffsetDateTime** | The date and time at which the digitalized card was last updated.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| D | &quot;D&quot; |
| S | &quot;S&quot; |
| U | &quot;U&quot; |
| X | &quot;X&quot; |



