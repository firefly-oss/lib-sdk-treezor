# AccountDetailsApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getComputedWalletAccountDetail**](AccountDetailsApi.md#getComputedWalletAccountDetail) | **GET** /core-connect/account-details/{walletId}/computed | Get PDF Account Details |
| [**getRawWalletAccountDetail**](AccountDetailsApi.md#getRawWalletAccountDetail) | **GET** /core-connect/account-details/{walletId}/raw | Get JSON Account Details |



## getComputedWalletAccountDetail

> GetComputedWalletAccountDetail200Response getComputedWalletAccountDetail(walletId)

Get PDF Account Details

Retrieve a Wallet RIB and IBAN in PDF format.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.AccountDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AccountDetailsApi apiInstance = new AccountDetailsApi(defaultClient);
        String walletId = "12345"; // String | The unique identifier of the Wallet.
        try {
            GetComputedWalletAccountDetail200Response result = apiInstance.getComputedWalletAccountDetail(walletId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountDetailsApi#getComputedWalletAccountDetail");
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
| **walletId** | **String**| The unique identifier of the Wallet. | |

### Return type

[**GetComputedWalletAccountDetail200Response**](GetComputedWalletAccountDetail200Response.md)

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


## getRawWalletAccountDetail

> GetRawWalletAccountDetail200Response getRawWalletAccountDetail(walletId)

Get JSON Account Details

Retrieve the necessary data (JSON) to generate the Account Details of a given Wallet.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.AccountDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AccountDetailsApi apiInstance = new AccountDetailsApi(defaultClient);
        String walletId = "12345"; // String | The unique identifier of the Wallet.
        try {
            GetRawWalletAccountDetail200Response result = apiInstance.getRawWalletAccountDetail(walletId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountDetailsApi#getRawWalletAccountDetail");
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
| **walletId** | **String**| The unique identifier of the Wallet. | |

### Return type

[**GetRawWalletAccountDetail200Response**](GetRawWalletAccountDetail200Response.md)

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

