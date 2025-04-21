

# PostScaWalletRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **String** | The unique identifier of the User. |  |
|**scaWalletTag** | **String** |  |  [optional] |
|**authMethod** | [**List&lt;AuthMethodEnum&gt;**](#List&lt;AuthMethodEnum&gt;) | The chosen methods for the 2-factor authentication. |  [optional] |



## Enum: List&lt;AuthMethodEnum&gt;

| Name | Value |
|---- | -----|
| ID | &quot;ID&quot; |
| OTHER | &quot;OTHER&quot; |
| OTP_EMAIL | &quot;OTP EMAIL&quot; |
| OTP_SMS | &quot;OTP SMS&quot; |



