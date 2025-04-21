

# TopupCardsTopupCardsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**topupCardId** | **String** | The tokenized card universally unique identifier (UUID) |  [optional] |
|**token** | **String** | HiPay token of the card |  [optional] |
|**userId** | **String** | Treezor user unique identifier |  [optional] |
|**brand** | **String** | Brand of the payment method |  [optional] |
|**maskedPan** | **String** | Masked card number |  [optional] |
|**cardHolder** | **String** | Cardholder name |  [optional] |
|**cardExpiryMonth** | **String** | Expiry month of the card |  [optional] |
|**cardExpiryYear** | **String** | Expiry year of the card |  [optional] |
|**issuer** | **String** | Issuer bank name |  [optional] |
|**country** | **String** | Country code of the bank where the card was issued. This two-letter country code complies with ISO 3166-1 (alpha 2).  |  [optional] |
|**domesticNetwork** | **String** | Card domestic network |  [optional] |
|**cardType** | **String** | Type of the card.  Possible values:  - *DEBIT*  - *CREDIT*  |  [optional] |
|**createdDate** | **String** | Creation date of the TopupCard |  [optional] |
|**updatedDate** | **String** | Updated date of the TopupCard |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the TopupCard.  |  [optional] |
|**providerName** | **String** | Token provider name (eg HiPay) |  [optional] |
|**profile** | **String** | Acquisition profile used for operations on this card |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;CANCELED&quot; |
| VALIDATED | &quot;VALIDATED&quot; |



