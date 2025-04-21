

# PostExtOperation200ResponseExternalOperation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**externalOperationId** | **UUID** | The unique identifier (uiid) of the ExternalOperation. |  [optional] |
|**actionName** | **String** | The end user action that was secured by an SCA. |  [optional] |
|**scaProof** | **String** | The valid proof that authenticated the end user&#39;s action. |  [optional] |
|**actionDate** | **String** | The date on which the declared action took place. |  [optional] |
|**resourceIds** | **List&lt;String&gt;** | The list of unique identifiers (strings) of the objects in case of a payout or transfer. |  [optional] |
|**createdAt** | **OffsetDateTime** | The date and time at which the External Operation was created. (Format: RFC 3339)  |  [optional] |
|**scaDate** | **OffsetDateTime** | The &#x60;iat&#x60; timestamp of the &#x60;scaProof&#x60; for per-operation SCA.  |  [optional] |
|**amr** | [**AmrEnum**](#AmrEnum) | The type of SCA for per-operation SCA |  [optional] |
|**externalOperationNote** | **OffsetDateTime** | Comment left by Treezor after scoring, indicating a potential issue. See [List of notes](/guide/strong-customer-authentication/securing-endpoints.html#notes-externaloperationnote)  |  [optional] |
|**externalOperationResponseCode** | **Integer** | For Treezor purposes only. |  [optional] |



## Enum: AmrEnum

| Name | Value |
|---- | -----|
| CLOUD_PIN | &quot;CLOUD_PIN&quot; |
| DEVICE_BIOMETRIC | &quot;DEVICE_BIOMETRIC&quot; |
| HYBRID_PIN | &quot;HYBRID_PIN&quot; |



