

# PutRecallSctInstRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**responseType** | [**ResponseTypeEnum**](#ResponseTypeEnum) | Indicates whether to accept (&#x60;1&#x60;) or decline (&#x60;0&#x60;) the recall.  |  |
|**negativeResponseAdditionalInformation** | **String** | Additional information for rejecting a Recall. May be mandatory in some situations, learn more in the [Reject a Recall](/guide/transfers/sepa-recalls.html#reject-a-recall-2) article.  |  [optional] |
|**negativeResponseReasonCode** | [**NegativeResponseReasonCodeEnum**](#NegativeResponseReasonCodeEnum) | The [type of Recall Rejection](/guide/transfers/sepa-recalls.html#types-of-recalls-reasoncode). This field is mandatory if the &#x60;responseType&#x60; is &#x60;0&#x60;. |  [optional] |



## Enum: ResponseTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: NegativeResponseReasonCodeEnum

| Name | Value |
|---- | -----|
| NOOR | &quot;NOOR&quot; |
| ARDT | &quot;ARDT&quot; |
| AC04 | &quot;AC04&quot; |
| NOAS | &quot;NOAS&quot; |
| CUST | &quot;CUST&quot; |
| AM04 | &quot;AM04&quot; |
| LEGL | &quot;LEGL&quot; |



