

# GetBalances200ResponseBalancesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**walletId** | **Integer** | The unique identifier of the Wallet. |  [optional] |
|**currentBalance** | **Float** | The amount of money currently available on the wallet without considering pending operations.   See [Balance](/guide/overview/glossary.html#balance) article for more information.  |  [optional] |
|**authorizations** | **Float** | The pending operations amount.  See [Balance](/guide/overview/glossary.html#balance) article for more information.  |  [optional] |
|**authorizedBalance** | **Float** | The simulated balance, which amount takes into account pending operations (i.e., authorizations amount is deducted from the balance)  See [Balance](/guide/overview/glossary.html#balance) article for more information.  |  [optional] |
|**currency** | **String** | The currency of the Wallet in [ISO 4217](/guide/api-basics/data-format.html#currencies) format.  |  [optional] |
|**calculationDate** | **OffsetDateTime** | The date and time at which the balance was last calculated. Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |



