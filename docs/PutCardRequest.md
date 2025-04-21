

# PutCardRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mccRestrictionGroupId** | **Integer** | The merchant category restriction group (&#x60;mccRestrictionGroup&#x60;) to apply to the card.  |  [optional] |
|**merchantRestrictionGroupId** | **Integer** | The merchant Id restriction group (&#x60;merchantRestrictionGroupId&#x60;) to apply to the card.  |  [optional] |
|**countryRestrictionGroupId** | **Integer** | The country restriction group (&#x60;countryRestrictionGroupId&#x60;) to apply to the card.  |  [optional] |
|**accessTag** | **String** | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  |  [optional] |
|**cardTag** | **String** | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  |  [optional] |



