

# PutLimitsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **Integer** | The unique identifier of the cardholder. |  [optional] |
|**accessTag** | **String** | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  |  [optional] |
|**limitAtmYear** | **Integer** | ATM operations limit for a sliding year. No default value. |  [optional] |
|**limitAtmMonth** | **Integer** | ATM operations limit for a sliding month. No default value. |  [optional] |
|**limitAtmWeek** | **Integer** | ATM operations limit for a sliding week. Default value €2000. |  [optional] |
|**limitAtmDay** | **Integer** | ATM operations limit for a single day. Default value €1000. |  [optional] |
|**limitAtmAll** | **Integer** | ATM operations limit from beginning. No default value. |  [optional] |
|**limitPaymentYear** | **Integer** | POS operations limit for a sliding year. No default value. |  [optional] |
|**limitPaymentMonth** | **Integer** | POS operations limit for a sliding month. No default value. |  [optional] |
|**limitPaymentWeek** | **Integer** | POS operations limit for a sliding week. Default value €3000. |  [optional] |
|**limitPaymentDay** | **Integer** | POS operations limit for a single day. Default value €2000. |  [optional] |
|**limitPaymentAll** | **Integer** | POS operations limit from beginning. No default value. |  [optional] |
|**paymentDailyLimit** | **Float** | POS operations limit for a single day including cents. The decimal delimiter must be \&quot;.\&quot;. No default value. |  [optional] |
|**restrictionGroupLimits** | [**PutLimitsRequestRestrictionGroupLimits**](PutLimitsRequestRestrictionGroupLimits.md) |  |  [optional] |



