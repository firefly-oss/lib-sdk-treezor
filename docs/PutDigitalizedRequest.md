

# PutDigitalizedRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | The new status for the payment Token.  |  |
|**reasonCode** | [**ReasonCodeEnum**](#ReasonCodeEnum) | The reason code for the action. See the [corresponding article](/guide/cards/x-pay-google-apple.html#parameters) for the definition of each value.  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUSPEND | &quot;suspend&quot; |
| UNSUSPEND | &quot;unsuspend&quot; |



## Enum: ReasonCodeEnum

| Name | Value |
|---- | -----|
| F | &quot;F&quot; |
| L | &quot;L&quot; |
| S | &quot;S&quot; |
| T | &quot;T&quot; |
| Z | &quot;Z&quot; |



