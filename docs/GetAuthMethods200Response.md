

# GetAuthMethods200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**publicToken** | **String** | The public token of the Card |  [optional] |
|**id** | **UUID** | The unique identifier of the authentication method. |  [optional] |
|**method** | [**MethodEnum**](#MethodEnum) | The method used, either &#x60;OOB&#x60; or &#x60;OTPSMS&#x60; |  [optional] |
|**system** | [**SystemEnum**](#SystemEnum) | The ACS (Access Control Server) provider. |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| OOB | &quot;OOB&quot; |
| OTPSMS | &quot;OTPSMS&quot; |



## Enum: SystemEnum

| Name | Value |
|---- | -----|
| GPS | &quot;GPS&quot; |



