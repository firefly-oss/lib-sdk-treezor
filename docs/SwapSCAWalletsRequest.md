

# SwapSCAWalletsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**removeScaWalletId** | **String** | The unique identifier of the SCA Wallet to be deleted. |  |
|**swapReason** | [**SwapReasonEnum**](#SwapReasonEnum) | The reason for swapping SCA Wallet. |  |
|**authMethod** | [**List&lt;AuthMethodEnum&gt;**](#List&lt;AuthMethodEnum&gt;) | The chosen methods for the 2-factor authentication. Required if no &#x60;scaProof&#x60; is provided.  |  [optional] |
|**sca** | **String** | The valid proof that authenticated the swap. Required if no &#x60;authMethod&#x60; is provided. |  [optional] |
|**scaWalletTag** | **String** | Custom value for the SCA Wallet. Can be used to name the device for which the new SCA Wallet is created.   |  [optional] |



## Enum: SwapReasonEnum

| Name | Value |
|---- | -----|
| LOST | &quot;LOST&quot; |
| OTHER | &quot;OTHER&quot; |
| STOLEN | &quot;STOLEN&quot; |



## Enum: List&lt;AuthMethodEnum&gt;

| Name | Value |
|---- | -----|
| ID | &quot;ID&quot; |
| OTHER | &quot;OTHER&quot; |
| OTP_SMS | &quot;OTP SMS&quot; |
| OTP_EMAIL | &quot;OTP EMAIL&quot; |



