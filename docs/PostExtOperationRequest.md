

# PostExtOperationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionName** | [**ActionNameEnum**](#ActionNameEnum) | The end user action that was secured by an SCA. See [list of actions](/guide/strong-customer-authentication/securing-endpoints.html#action-names-actionname) for more information.  |  [optional] |
|**scaProof** | **String** | The valid proof that authenticated the end user&#39;s action. Required if &#x60;actionName&#x60; is covered by a per-operation SCA.  |  [optional] |
|**actionDate** | **OffsetDateTime** | The date on which the declared action took place. (Format: RFC3339).  |  [optional] |
|**resourceIds** | **List&lt;String&gt;** | The list of unique identifiers (strings) of the objects, conditionned by the type of action. Must be:  * **walletId** for &#x60;externalGetStatement&#x60;, &#x60;externalGetBalance&#x60;, &#x60;externalOperationView&#x60;, &#x60;externalOperationView90Days&#x60;, and &#x60;externalDisplayAccountDetails&#x60; * **payoutId** for **transferId** in case of a payout or transfer * **cardId** for &#x60;externalUpdateLimitsCard&#x60;  |  [optional] |



## Enum: ActionNameEnum

| Name | Value |
|---- | -----|
| EXTERNAL_DISPLAY_ACCOUNT_DETAILS | &quot;externalDisplayAccountDetails&quot; |
| EXTERNAL_GET_BALANCE | &quot;externalGetBalance&quot; |
| EXTERNAL_GET_STATEMENT | &quot;externalGetStatement&quot; |
| EXTERNAL_MASS_PAYOUT_ORDER_CREATION | &quot;externalMassPayoutOrderCreation&quot; |
| EXTERNAL_MASS_TRANSFER_ORDER_CREATION | &quot;externalMassTransferOrderCreation&quot; |
| EXTERNAL_OPERATION_VIEW | &quot;externalOperationView&quot; |
| EXTERNAL_OPERATION_VIEW90_DAYS | &quot;externalOperationView90Days&quot; |
| EXTERNAL_SCHEDULED_PAYOUT_ORDER | &quot;externalScheduledPayoutOrder&quot; |
| EXTERNAL_SCHEDULED_TRANSFER_ORDER | &quot;externalScheduledTransferOrder&quot; |
| EXTERNAL_UPDATE_LIMITS_CARD | &quot;externalUpdateLimitsCard&quot; |
| INTERNAL_CHECK | &quot;internalCheck&quot; |



