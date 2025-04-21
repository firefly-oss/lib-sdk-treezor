# BusinessesApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBusinessInfo**](BusinessesApi.md#getBusinessInfo) | **GET** /v1/businessinformations | Get Business Information |
| [**searchBusiness**](BusinessesApi.md#searchBusiness) | **GET** /v1/businesssearchs | Search Businesses |



## getBusinessInfo

> GetBusinessInfo200Response getBusinessInfo(country, accessTag, externalId, registrationNumber, vatNumber)

Get Business Information

The get business information endpoint returns all already known business information. End user will have then to verify/correct it. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.BusinessesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        BusinessesApi apiInstance = new BusinessesApi(defaultClient);
        String country = "FR"; // String | In which country to search. Format [ISO 3166-1 alpha-2](/guide/api-basics/data-format.html#countries) 
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        String externalId = "externalId_example"; // String | Unique business external id, as given in businesssearch reponse.
        String registrationNumber = "registrationNumber_example"; // String | Unique business registration number.
        String vatNumber = "vatNumber_example"; // String | Unique business VAT number.
        try {
            GetBusinessInfo200Response result = apiInstance.getBusinessInfo(country, accessTag, externalId, registrationNumber, vatNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessesApi#getBusinessInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **country** | **String**| In which country to search. Format [ISO 3166-1 alpha-2](/guide/api-basics/data-format.html#countries)  | |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  | [optional] |
| **externalId** | **String**| Unique business external id, as given in businesssearch reponse. | [optional] |
| **registrationNumber** | **String**| Unique business registration number. | [optional] |
| **vatNumber** | **String**| Unique business VAT number. | [optional] |

### Return type

[**GetBusinessInfo200Response**](GetBusinessInfo200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A business information response |  -  |
| **0** | Unexpected error |  -  |


## searchBusiness

> List&lt;SearchBusiness200ResponseInner&gt; searchBusiness(country, accessTag, nameExact, nameMatchBeginning, nameClosestKeywords, registrationNumber, vatNumber, phoneNumber, addressStreet, addressCity, addressPostalCode)

Search Businesses

Check information regarding a legal entity. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.BusinessesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        BusinessesApi apiInstance = new BusinessesApi(defaultClient);
        String country = "FR"; // String | In which country to search. Format: [ISO 3166-1 alpha-2](/guide/api-basics/data-format.html#countries) 
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        String nameExact = "nameExact_example"; // String | Business exact name. Exclusive with `nameMatchBeginning` and `nameClosestKeywords`. 
        String nameMatchBeginning = "nameMatchBeginning_example"; // String | Business names begin with. Exclusive with `nameExact` and `nameClosestKeywords`. 
        String nameClosestKeywords = "nameClosestKeywords_example"; // String | Business names closed to keywords. Exclusive with `nameExact` and `nameMatchBeginning`. 
        String registrationNumber = "registrationNumber_example"; // String | Business registration number. Required if the `vatNumber` isn't provided. 
        String vatNumber = "vatNumber_example"; // String | Business VAT number. Required if the `registrationNumber` isn't provided. 
        String phoneNumber = "phoneNumber_example"; // String | Business phone number.
        String addressStreet = "addressStreet_example"; // String | Business' street address.
        String addressCity = "addressCity_example"; // String | Business' city address.
        String addressPostalCode = "addressPostalCode_example"; // String | Business' postal code address.
        try {
            List<SearchBusiness200ResponseInner> result = apiInstance.searchBusiness(country, accessTag, nameExact, nameMatchBeginning, nameClosestKeywords, registrationNumber, vatNumber, phoneNumber, addressStreet, addressCity, addressPostalCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessesApi#searchBusiness");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **country** | **String**| In which country to search. Format: [ISO 3166-1 alpha-2](/guide/api-basics/data-format.html#countries)  | |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  | [optional] |
| **nameExact** | **String**| Business exact name. Exclusive with &#x60;nameMatchBeginning&#x60; and &#x60;nameClosestKeywords&#x60;.  | [optional] |
| **nameMatchBeginning** | **String**| Business names begin with. Exclusive with &#x60;nameExact&#x60; and &#x60;nameClosestKeywords&#x60;.  | [optional] |
| **nameClosestKeywords** | **String**| Business names closed to keywords. Exclusive with &#x60;nameExact&#x60; and &#x60;nameMatchBeginning&#x60;.  | [optional] |
| **registrationNumber** | **String**| Business registration number. Required if the &#x60;vatNumber&#x60; isn&#39;t provided.  | [optional] |
| **vatNumber** | **String**| Business VAT number. Required if the &#x60;registrationNumber&#x60; isn&#39;t provided.  | [optional] |
| **phoneNumber** | **String**| Business phone number. | [optional] |
| **addressStreet** | **String**| Business&#39; street address. | [optional] |
| **addressCity** | **String**| Business&#39; city address. | [optional] |
| **addressPostalCode** | **String**| Business&#39; postal code address. | [optional] |

### Return type

[**List&lt;SearchBusiness200ResponseInner&gt;**](SearchBusiness200ResponseInner.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |

