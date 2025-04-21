

# SimulateOperationsRequestOperations


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payin** | **Integer** | The number of payin operations to generate. |  [optional] |
|**payinrefund** | **Integer** | The number of payin refunds to generate. Must be lower than or equal to the number of payins. |  [optional] |
|**payout** | **Integer** | The number of payout operations to generate. |  [optional] |
|**payoutrefund** | **Integer** | The number of payout refunds to generate. Must be lower than or equal to the number of payouts. |  [optional] |
|**transfer** | **Integer** | The number of wallet-to-wallet transfers to generate. |  [optional] |
|**transferrefund** | **Integer** | Deprecated. Don&#39;t use. |  [optional] |
|**cardtransaction** | **Integer** | The number of card transaction operations to generate. |  [optional] |
|**transferfees** | **Integer** | The number of wallet-to-wallet transfers to generate with a &#x60;transferTypeId&#x60; of &#x60;3&#x60;. |  [optional] |
|**transfercreditnote** | **Integer** | The number of wallet-to-wallet transfers to generate with a &#x60;transferTypeId&#x60; of &#x60;4&#x60;. |  [optional] |



