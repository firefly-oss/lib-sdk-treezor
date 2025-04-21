

# PutTaxresidenceRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **Integer** | The unique identifier of the user. |  [optional] |
|**country** | **String** | The country of the resident. |  [optional] |
|**taxPayerId** | **String** | The Tax Identification Number (TIN) or Tax Code of the User.  This field is mandatory if: * The country of the resident is &#x60;US&#x60; * The &#x60;distributionCountry&#x60; of the user is &#x60;IT&#x60;.   Optional otherwise.  |  [optional] |
|**liabilityWaiver** | **Boolean** | Must be set to true if the &#x60;taxPayerId&#x60; is empty or null, and set to false otherwise.  |  [optional] |



