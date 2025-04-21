# PayinRefundsApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPayinrefund**](PayinRefundsApi.md#getPayinrefund) | **GET** /v1/payinrefunds/{id} | Get Payin Refund |
| [**getPayinrefunds**](PayinRefundsApi.md#getPayinrefunds) | **GET** /v1/payinrefunds | Search Payin Refunds |



## getPayinrefund

> GetPayinrefund200Response getPayinrefund(id)

Get Payin Refund

Get a payin refund.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.PayinRefundsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        PayinRefundsApi apiInstance = new PayinRefundsApi(defaultClient);
        Long id = 12345L; // Long | The unique identifier of the payin refund.
        try {
            GetPayinrefund200Response result = apiInstance.getPayinrefund(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PayinRefundsApi#getPayinrefund");
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
| **id** | **Long**| The unique identifier of the payin refund. | |

### Return type

[**GetPayinrefund200Response**](GetPayinrefund200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **405** | Method Not Allowed |  -  |
| **0** | Unexpected error |  -  |


## getPayinrefunds

> GetPayinrefunds200Response getPayinrefunds(accessTag, payinId, payinrefundId, payinrefundTag, payinrefundStatus, walletId, payinrefundDate, userId, amount, currency, pageNumber, cursor, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo)

Search Payin Refunds

Search for payin refunds. These can relate to [Acquiring](/guide/acquiring/legacy-v1.html#refunds) or [SEPA recalls](/guide/transfers/sepa-recalls.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.PayinRefundsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        PayinRefundsApi apiInstance = new PayinRefundsApi(defaultClient);
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        Integer payinId = 12345; // Integer | The unique identifier of the payin.
        Integer payinrefundId = 12345; // Integer | The unique identifier of the payin refund.
        String payinrefundTag = "payinrefundTag_example"; // String | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and `/` `!` `-` `_` `.` `*` `'` `(` `)` 
        String payinrefundStatus = "PENDING"; // String | The status of the payin refund.
        Integer walletId = 12345; // Integer | The unique identifier of the Wallet to refund.
        String payinrefundDate = "2025-01-05"; // String | The date of the payin refund.   Format: `YYYY-MM-DD` 
        Integer userId = 12345; // Integer | The unique identifier of the User who made the refund.
        String amount = "amount_example"; // String | The amount of the refund.
        String currency = "EUR"; // String | The currency of the amount. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies). 
        Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
        String cursor = "da4b9237bacccdf19c0760cab7aec4a8359010b0"; // String | Pagination cursor, if you don't pass a cursor, result will start at the first page. 
        Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints. 
        String sortBy = "createdDate"; // String | The transaction element you want to sort the list with. 
        String sortOrder = "ASC"; // String | The order in which you want to sort the list based on the payin refund's date. * **DESC** for descending. * **ASC** for ascending. 
        OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result.  Format: `YYYY-MM-DD HH:mm:ss`.  
        OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result.  Format: `YYYY-MM-DD HH:mm:ss`.  
        OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result.   Format: `YYYY-MM-DD HH:mm:ss` 
        OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result.   Format: `YYYY-MM-DD HH:mm:ss` 
        try {
            GetPayinrefunds200Response result = apiInstance.getPayinrefunds(accessTag, payinId, payinrefundId, payinrefundTag, payinrefundStatus, walletId, payinrefundDate, userId, amount, currency, pageNumber, cursor, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PayinRefundsApi#getPayinrefunds");
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
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  | [optional] |
| **payinId** | **Integer**| The unique identifier of the payin. | [optional] |
| **payinrefundId** | **Integer**| The unique identifier of the payin refund. | [optional] |
| **payinrefundTag** | **String**| Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  | [optional] |
| **payinrefundStatus** | **String**| The status of the payin refund. | [optional] [enum: PENDING, CANCELED, VALIDATED] |
| **walletId** | **Integer**| The unique identifier of the Wallet to refund. | [optional] |
| **payinrefundDate** | **String**| The date of the payin refund.   Format: &#x60;YYYY-MM-DD&#x60;  | [optional] |
| **userId** | **Integer**| The unique identifier of the User who made the refund. | [optional] |
| **amount** | **String**| The amount of the refund. | [optional] |
| **currency** | **String**| The currency of the amount. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies).  | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **cursor** | **String**| Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.  | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints.  | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with.  | [optional] [default to createdDate] |
| **sortOrder** | **String**| The order in which you want to sort the list based on the payin refund&#39;s date. * **DESC** for descending. * **ASC** for ascending.  | [optional] [default to DESC] [enum: ASC, DESC] |
| **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.   | [optional] |
| **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.   | [optional] |
| **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  | [optional] |
| **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  | [optional] |

### Return type

[**GetPayinrefunds200Response**](GetPayinrefunds200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **405** | Method Not Allowed |  -  |
| **0** | Unexpected error |  -  |

