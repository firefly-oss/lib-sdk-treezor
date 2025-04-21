

# RefundRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payinId** | **String** | The payin universally unique identifier (UUID) |  [optional] |
|**amount** | **Float** | Refund amount |  [optional] |
|**currency** | **String** | Base currency for this refund  This three-character currency code must comply with ISO-4217 |  [optional] |
|**profile** | **String** | HiPay merchant identifier (mid) to be used for the operation. Required if the client has multiple merchant identifiers associated. If only one mid is associated, then that one is used for the operation. Mandatory for legacy payins refunds  |  [optional] |



