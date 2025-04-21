

# RefundResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payinrefundId** | **String** | The universally unique identifier (UUID) of the refund |  [optional] |
|**payinrefundTag** | **String** |  |  [optional] |
|**payinrefundStatus** | [**PayinrefundStatusEnum**](#PayinrefundStatusEnum) | Status of the refund.  |  [optional] |
|**walletId** | **String** | Identifier of the wallet to be debited |  [optional] |
|**payinId** | **String** | The universally unique identifier (UUID) of the payin |  [optional] |
|**amount** | **Float** | The amount to be refunded |  [optional] |
|**currency** | **String** | Base currency for the refund.  This three-character currency code must comply with ISO-4217  |  [optional] |
|**createdDate** | **String** | The creation date of the refund |  [optional] |
|**modifiedDate** | **String** | The last updated date of the refund |  [optional] |
|**payinrefundDate** | **String** | The date of the refund |  [optional] |
|**profile** | **String** | Your HiPay Merchant ID. |  [optional] |



## Enum: PayinrefundStatusEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;CANCELED&quot; |
| PENDING | &quot;PENDING&quot; |
| VALIDATED | &quot;VALIDATED&quot; |



