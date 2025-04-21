

# TavRequestPOSTRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cardId** | **Integer** | The id of the card on which to create an issuerInitiatedDigitizationData request  |  |
|**accessTag** | **String** | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  |  [optional] |
|**tokenRequestor** | [**TokenRequestorEnum**](#TokenRequestorEnum) | The Token Requestor also named wallet provider. |  |
|**additionnalData** | [**TavRequestPOSTRequestAdditionnalData**](TavRequestPOSTRequestAdditionnalData.md) |  |  [optional] |



## Enum: TokenRequestorEnum

| Name | Value |
|---- | -----|
| APPLE | &quot;APPLE&quot; |
| GOOGLE | &quot;GOOGLE&quot; |
| SAMSUNG | &quot;SAMSUNG&quot; |



