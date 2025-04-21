

# NotificationSimulationAuthorizations


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Float** | Authorization amount |  |
|**cardPaymentMethod** | [**NotificationSimulationAuthorizationsCardPaymentMethod**](NotificationSimulationAuthorizationsCardPaymentMethod.md) |  |  [optional] |
|**currency** | **String** | Base currency for this authorization  This three-character currency code must comply with ISO-4217 |  |
|**status** | **Integer** | The status code of the simulated notification |  [optional] |
|**transactionReference** | **String** | The reference of the transaction |  [optional] |
|**userId** | **String** | Identifier of the user on behalf of which the simulated authorization should be executed  |  [optional] |
|**walletId** | **String** | Identifier of the wallet to be credited |  |
|**profile** | **String** | HiPay merchant identifier (mid) to be used for the operation. Required if the client has multiple merchant identifiers associated. If only one mid is associated, then that one is used for the operation.  |  [optional] |



