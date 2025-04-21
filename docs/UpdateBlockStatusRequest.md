

# UpdateBlockStatusRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lockStatus** | [**LockStatusEnum**](#LockStatusEnum) | The Status of the card, indicating whether it is locked, lost, or destroyed.  While this field is an integer, it returns a plaintext value. See the full list of &#x60;lockStatus&#x60; in the [Block a Card](/guide/cards/modification.html#status) article.  |  |
|**accessTag** | **String** | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  |  [optional] |



## Enum: LockStatusEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |



