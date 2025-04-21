

# CardOptionsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**foreign** | [**ForeignEnum**](#ForeignEnum) | Whether the card is usable abroad. See [Options &amp; Permission groups](/guide/cards/restrictions-limits.html#options-permission-groups) for more information.  |  |
|**online** | [**OnlineEnum**](#OnlineEnum) | Whether the card is usable online. See [Options &amp; Permission groups](/guide/cards/restrictions-limits.html#options-permission-groups) for more information.  |  |
|**atm** | [**AtmEnum**](#AtmEnum) | Whether the card is usable on ATMs (withdrawal). See [Options &amp; Permission groups](/guide/cards/restrictions-limits.html#options-permission-groups) for more information.  |  |
|**nfc** | [**NfcEnum**](#NfcEnum) | Whether the card can be used for contactless payments. See [Options &amp; Permission groups](/guide/cards/restrictions-limits.html#options-permission-groups) for more information.  |  |
|**accessTag** | **String** | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  |  [optional] |



## Enum: ForeignEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: OnlineEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: AtmEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: NfcEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



