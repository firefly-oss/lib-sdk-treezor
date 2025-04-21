# ScheduledPaymentsApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteScheduledPayment**](ScheduledPaymentsApi.md#deleteScheduledPayment) | **DELETE** /core-connect/scheduledPayment/{scheduledPaymentId} | Delete Scheduled Payment |
| [**getScheduledPayment**](ScheduledPaymentsApi.md#getScheduledPayment) | **GET** /core-connect/scheduledPayment | Get Scheduled Payment |
| [**getScheduledPaymentOperations**](ScheduledPaymentsApi.md#getScheduledPaymentOperations) | **GET** /core-connect/scheduledPayment/{scheduledPaymentId}/payments | Get Scheduled Payment Operations |
| [**postScheduledPayment**](ScheduledPaymentsApi.md#postScheduledPayment) | **POST** /core-connect/scheduledPayment | Create Scheduled Payment |



## deleteScheduledPayment

> ScheduledPayment2 deleteScheduledPayment(scheduledPaymentId)

Delete Scheduled Payment

Cancel a Scheduled Payment order

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.ScheduledPaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ScheduledPaymentsApi apiInstance = new ScheduledPaymentsApi(defaultClient);
        String scheduledPaymentId = "12345"; // String | The unique identifier of the Scheduled Payment order.
        try {
            ScheduledPayment2 result = apiInstance.deleteScheduledPayment(scheduledPaymentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduledPaymentsApi#deleteScheduledPayment");
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
| **scheduledPaymentId** | **String**| The unique identifier of the Scheduled Payment order. | |

### Return type

[**ScheduledPayment2**](ScheduledPayment2.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |


## getScheduledPayment

> ScheduledPayment getScheduledPayment(userId, walletId, cursor, pageSize)

Get Scheduled Payment

Retrieve Scheduled Payment orders based on the corresponding &#x60;userId&#x60; and/or &#x60;walletId&#x60;

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.ScheduledPaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ScheduledPaymentsApi apiInstance = new ScheduledPaymentsApi(defaultClient);
        Integer userId = 12345; // Integer | The unique identifier of the Wallet to be debited.
        Integer walletId = 12345; // Integer | The unique identifier of the User owning the Wallet to debit.
        String cursor = "da4b9237bacccdf19c0760cab7aec4a8359010b0"; // String | Pagination cursor, if you don't pass a cursor, result will start at the first page.
        BigDecimal pageSize = new BigDecimal(78); // BigDecimal | Number of results per page.
        try {
            ScheduledPayment result = apiInstance.getScheduledPayment(userId, walletId, cursor, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduledPaymentsApi#getScheduledPayment");
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
| **userId** | **Integer**| The unique identifier of the Wallet to be debited. | [optional] |
| **walletId** | **Integer**| The unique identifier of the User owning the Wallet to debit. | [optional] |
| **cursor** | **String**| Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page. | [optional] |
| **pageSize** | **BigDecimal**| Number of results per page. | [optional] |

### Return type

[**ScheduledPayment**](ScheduledPayment.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK – Scheduled payment created |  -  |
| **0** | Unexpected error |  -  |


## getScheduledPaymentOperations

> GetScheduledPaymentOperations200Response getScheduledPaymentOperations(scheduledPaymentId)

Get Scheduled Payment Operations

Retrieve the list of executed payments for a given Scheduled Payment order

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.ScheduledPaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ScheduledPaymentsApi apiInstance = new ScheduledPaymentsApi(defaultClient);
        String scheduledPaymentId = "12345"; // String | The unique identifier of the Scheduled Payment order.
        try {
            GetScheduledPaymentOperations200Response result = apiInstance.getScheduledPaymentOperations(scheduledPaymentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduledPaymentsApi#getScheduledPaymentOperations");
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
| **scheduledPaymentId** | **String**| The unique identifier of the Scheduled Payment order. | |

### Return type

[**GetScheduledPaymentOperations200Response**](GetScheduledPaymentOperations200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |


## postScheduledPayment

> ScheduledPayment1 postScheduledPayment(postScheduledPaymentRequest)

Create Scheduled Payment

Schedule a Payout or a Wallet-to-Wallet transfer for a future date.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.ScheduledPaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ScheduledPaymentsApi apiInstance = new ScheduledPaymentsApi(defaultClient);
        PostScheduledPaymentRequest postScheduledPaymentRequest = new PostScheduledPaymentRequest(); // PostScheduledPaymentRequest | 
        try {
            ScheduledPayment1 result = apiInstance.postScheduledPayment(postScheduledPaymentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduledPaymentsApi#postScheduledPayment");
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
| **postScheduledPaymentRequest** | [**PostScheduledPaymentRequest**](PostScheduledPaymentRequest.md)|  | [optional] |

### Return type

[**ScheduledPayment1**](ScheduledPayment1.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK – Scheduled payment created |  -  |
| **0** | Unexpected error |  -  |

