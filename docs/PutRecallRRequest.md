

# PutRecallRRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessTag** | **String** | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  |  [optional] |
|**responseType** | [**ResponseTypeEnum**](#ResponseTypeEnum) | Response to the received recall request. The recall request can be: * &#x60;1&#x60; – Accepted and generates a positive response to the originating bank. * &#x60;0&#x60; – Refused and generates a negative response to the originating bank.  |  |
|**negativeResponseReasonCode** | [**NegativeResponseReasonCodeEnum**](#NegativeResponseReasonCodeEnum) | Reason of negative response type. Required if &#x60;responseType&#x60; is false. This field is non case sensitive.  |  [optional] |
|**negativeResponseAdditionalInformation** | **String** | Free field to add more informations of a negative response type.  |  [optional] |
|**responseComment** | **String** | Free field to add more informations regardless the response type.  |  [optional] |



## Enum: ResponseTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: NegativeResponseReasonCodeEnum

| Name | Value |
|---- | -----|
| CUST | &quot;CUST&quot; |
| LEGL | &quot;LEGL&quot; |
| AC04 | &quot;AC04&quot; |
| NOOR | &quot;NOOR&quot; |
| AM04 | &quot;AM04&quot; |
| NOAS | &quot;NOAS&quot; |
| ARDT | &quot;ARDT&quot; |



