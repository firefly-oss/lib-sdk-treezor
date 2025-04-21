

# SetPasscodeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **String** | The unique identifier of the user. |  [optional] |
|**newPasscode** | **String** | The new passcode. Must be base64 encoded and encrypted. Initial passcode must at least 6 characters. |  [optional] |
|**confirmPasscode** | **String** | Confirmation of the new passcode. |  [optional] |
|**sca** | **String** | The valid proof that authenticated the user. Required if no &#x60;authMethod&#x60; is provided. |  [optional] |
|**authMethod** | [**List&lt;AuthMethodEnum&gt;**](#List&lt;AuthMethodEnum&gt;) | The chosen methods for the 2-factor authentication. Required if no &#x60;sca&#x60; is provided.  |  [optional] |



## Enum: List&lt;AuthMethodEnum&gt;

| Name | Value |
|---- | -----|
| ID | &quot;ID&quot; |
| OTHER | &quot;OTHER&quot; |
| OTP_SMS | &quot;OTP SMS&quot; |
| OTP_EMAIL | &quot;OTP EMAIL&quot; |



