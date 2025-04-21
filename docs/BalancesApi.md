# BalancesApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBalances**](BalancesApi.md#getBalances) | **GET** /v1/balances | Search Balances |
| [**getWalletBalanceHistory**](BalancesApi.md#getWalletBalanceHistory) | **GET** /core-connect/balances/{walletId} | Get Wallet Balance history |



## getBalances

> GetBalances200Response getBalances(accessTag, walletId, userId)

Search Balances

Retrieve Balances for a given &#x60;walletId&#x60; or &#x60;userId&#x60;.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.BalancesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        BalancesApi apiInstance = new BalancesApi(defaultClient);
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        Integer walletId = 12345; // Integer | The unique identifier of the Wallet whose Balance is to be retrieved.
        Integer userId = 12345; // Integer | The unique identifier of the User whose Wallet Balances are to be retrieved.
        try {
            GetBalances200Response result = apiInstance.getBalances(accessTag, walletId, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalancesApi#getBalances");
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
| **walletId** | **Integer**| The unique identifier of the Wallet whose Balance is to be retrieved. | [optional] |
| **userId** | **Integer**| The unique identifier of the User whose Wallet Balances are to be retrieved. | [optional] |

### Return type

[**GetBalances200Response**](GetBalances200Response.md)

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


## getWalletBalanceHistory

> Map&lt;String, GetWalletBalanceHistory200ResponseValue&gt; getWalletBalanceHistory(walletId, dateFrom, dateTo)

Get Wallet Balance history

Retrieve the Balance History of a Wallet.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.BalancesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        BalancesApi apiInstance = new BalancesApi(defaultClient);
        Integer walletId = 12345; // Integer | The unique identifier of the Wallet.
        String dateFrom = "2024-12-01"; // String | Start date in RFC 3339 full-date format.
        String dateTo = "2025-02-10"; // String | End date in RFC 3339 full-date format.
        try {
            Map<String, GetWalletBalanceHistory200ResponseValue> result = apiInstance.getWalletBalanceHistory(walletId, dateFrom, dateTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalancesApi#getWalletBalanceHistory");
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
| **walletId** | **Integer**| The unique identifier of the Wallet. | |
| **dateFrom** | **String**| Start date in RFC 3339 full-date format. | [optional] |
| **dateTo** | **String**| End date in RFC 3339 full-date format. | [optional] |

### Return type

[**Map&lt;String, GetWalletBalanceHistory200ResponseValue&gt;**](GetWalletBalanceHistory200ResponseValue.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **0** | Unexpected error |  -  |

