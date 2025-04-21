# VirtualIbansApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getvirtualiban**](VirtualIbansApi.md#getvirtualiban) | **GET** /v1/virtualibans/{virtualIbanId} | Get Virtual IBAN |
| [**getvirtualibans**](VirtualIbansApi.md#getvirtualibans) | **GET** /v1/virtualibans | Search Virtual IBANs |
| [**postVirtualIban**](VirtualIbansApi.md#postVirtualIban) | **POST** /v1/virtualibans | Create Virtual IBAN |
| [**putVirtualIban**](VirtualIbansApi.md#putVirtualIban) | **PUT** /v1/virtualibans/{virtualIbanId} | Update Virtual IBAN |



## getvirtualiban

> VirtualIbanObject getvirtualiban(virtualIbanId)

Get Virtual IBAN

Retrieve a Virtual IBAN based on its &#x60;id&#x60;.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.VirtualIbansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        VirtualIbansApi apiInstance = new VirtualIbansApi(defaultClient);
        Integer virtualIbanId = 12345; // Integer | The unique identifier of the Virtual IBAN.
        try {
            VirtualIbanObject result = apiInstance.getvirtualiban(virtualIbanId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualIbansApi#getvirtualiban");
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
| **virtualIbanId** | **Integer**| The unique identifier of the Virtual IBAN. | |

### Return type

[**VirtualIbanObject**](VirtualIbanObject.md)

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


## getvirtualibans

> VirtualIbanObject getvirtualibans(accessTag, virtualIbanId, walletId, typeId, tag, reference, validFrom, validTo, maxUsage, maxAmount, numberOfTransactions, cumulatedAmount, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, pageNumber, pageCount, sortBy, sortOrder)

Search Virtual IBANs

Retrieve virtual IBANs that match search criteria.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.VirtualIbansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        VirtualIbansApi apiInstance = new VirtualIbansApi(defaultClient);
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        Integer virtualIbanId = 12345; // Integer | The unique identifier of the Virtual IBAN.
        Integer walletId = 12345; // Integer | The unique identifier of the Wallet to which the Virtual IBAN is associated.
        Integer typeId = 1; // Integer | The type of the Virtual IBAN.
        Integer tag = 56; // Integer | Custom attribute that you can use as you see fit.  Learn more in the [Object tags](/guide/api-basics/objects-tags.html) article. 
        String reference = "reference_example"; // String | The client's internal reference of the Virtual IBAN.
        LocalDate validFrom = LocalDate.parse("Wed Jan 01 01:00:00 CET 2025"); // LocalDate | The date from which the Virtual IBAN validity starts. Defaults to today's date and must be set in the future.  Format: `YYYY-MM-DD` 
        LocalDate validTo = LocalDate.parse("Wed Jan 01 01:00:00 CET 2025"); // LocalDate | The date from which the Virtual IBAN validity ends. Must be set after the `validFrom` date.  Format: `YYYY-MM-DD` 
        Integer maxUsage = 5; // Integer | The maximum number of transactions allowed.
        Float maxAmount = 23.99F; // Float | The maximum cumulated amount allowed.
        Integer numberOfTransactions = 3; // Integer | The current number of transactions for the Virtual IBAN.
        Float cumulatedAmount = 1000.00F; // Float | The cumulated amount of transactions for the Virtual IBAN.
        OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result.  Format: `YYYY-MM-DD HH:mm:ss` 
        OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result.  Format: `YYYY-MM-DD HH:mm:ss` 
        OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result.   Format: `YYYY-MM-DD HH:mm:ss` 
        OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result.   Format: `YYYY-MM-DD HH:mm:ss`  
        Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
        Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints   
        String sortBy = "createdDate"; // String | The transaction element you want to sort the list with. 
        String sortOrder = "ASC"; // String | The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
        try {
            VirtualIbanObject result = apiInstance.getvirtualibans(accessTag, virtualIbanId, walletId, typeId, tag, reference, validFrom, validTo, maxUsage, maxAmount, numberOfTransactions, cumulatedAmount, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, pageNumber, pageCount, sortBy, sortOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualIbansApi#getvirtualibans");
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
| **virtualIbanId** | **Integer**| The unique identifier of the Virtual IBAN. | [optional] |
| **walletId** | **Integer**| The unique identifier of the Wallet to which the Virtual IBAN is associated. | [optional] |
| **typeId** | **Integer**| The type of the Virtual IBAN. | [optional] [enum: 1, 2] |
| **tag** | **Integer**| Custom attribute that you can use as you see fit.  Learn more in the [Object tags](/guide/api-basics/objects-tags.html) article.  | [optional] |
| **reference** | **String**| The client&#39;s internal reference of the Virtual IBAN. | [optional] |
| **validFrom** | **LocalDate**| The date from which the Virtual IBAN validity starts. Defaults to today&#39;s date and must be set in the future.  Format: &#x60;YYYY-MM-DD&#x60;  | [optional] |
| **validTo** | **LocalDate**| The date from which the Virtual IBAN validity ends. Must be set after the &#x60;validFrom&#x60; date.  Format: &#x60;YYYY-MM-DD&#x60;  | [optional] |
| **maxUsage** | **Integer**| The maximum number of transactions allowed. | [optional] |
| **maxAmount** | **Float**| The maximum cumulated amount allowed. | [optional] |
| **numberOfTransactions** | **Integer**| The current number of transactions for the Virtual IBAN. | [optional] |
| **cumulatedAmount** | **Float**| The cumulated amount of transactions for the Virtual IBAN. | [optional] |
| **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  | [optional] |
| **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  | [optional] |
| **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  | [optional] |
| **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;   | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints    | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with.  | [optional] [default to createdDate] |
| **sortOrder** | **String**| The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending.  | [optional] [default to DESC] [enum: ASC, DESC] |

### Return type

[**VirtualIbanObject**](VirtualIbanObject.md)

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


## postVirtualIban

> VirtualIbanObject postVirtualIban(postVirtualIbanRequest)

Create Virtual IBAN

Create a new virtual IBAN associated with a given Wallet.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.VirtualIbansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        VirtualIbansApi apiInstance = new VirtualIbansApi(defaultClient);
        PostVirtualIbanRequest postVirtualIbanRequest = new PostVirtualIbanRequest(); // PostVirtualIbanRequest | 
        try {
            VirtualIbanObject result = apiInstance.postVirtualIban(postVirtualIbanRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualIbansApi#postVirtualIban");
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
| **postVirtualIbanRequest** | [**PostVirtualIbanRequest**](PostVirtualIbanRequest.md)|  | [optional] |

### Return type

[**VirtualIbanObject**](VirtualIbanObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **405** | Method Not Allowed |  -  |
| **0** | Unexpected error |  -  |


## putVirtualIban

> VirtualIbanObject putVirtualIban(virtualIbanId, putVirtualIbanRequest)

Update Virtual IBAN

Update a Virtual IBAN&#39;s information.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.VirtualIbansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        VirtualIbansApi apiInstance = new VirtualIbansApi(defaultClient);
        Integer virtualIbanId = 12345; // Integer | The unique identifier of the Virtual IBAN.
        PutVirtualIbanRequest putVirtualIbanRequest = new PutVirtualIbanRequest(); // PutVirtualIbanRequest | 
        try {
            VirtualIbanObject result = apiInstance.putVirtualIban(virtualIbanId, putVirtualIbanRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualIbansApi#putVirtualIban");
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
| **virtualIbanId** | **Integer**| The unique identifier of the Virtual IBAN. | |
| **putVirtualIbanRequest** | [**PutVirtualIbanRequest**](PutVirtualIbanRequest.md)|  | [optional] |

### Return type

[**VirtualIbanObject**](VirtualIbanObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **405** | Method Not Allowed |  -  |
| **0** | Unexpected error |  -  |

