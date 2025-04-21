# AccountStatementsApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPdfAccountStatement**](AccountStatementsApi.md#getPdfAccountStatement) | **GET** /core-connect/statements/{walletId}/computed | Get PDF Account Statement |
| [**getRawStatement**](AccountStatementsApi.md#getRawStatement) | **GET** /core-connect/statements/{walletId}/raw | Get JSON Account Statement |



## getPdfAccountStatement

> GetPdfAccountStatement200Response getPdfAccountStatement(walletId, month, year)

Get PDF Account Statement

Retrieve a Wallet account statement in pdf format.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.AccountStatementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AccountStatementsApi apiInstance = new AccountStatementsApi(defaultClient);
        String walletId = "12345"; // String | The unique identifier of the Wallet.
        Integer month = 56; // Integer | The month of the statement (2 digits leading with `0`)
        Integer year = 56; // Integer | The year of the statement (4 digits, e.g., `2022`)
        try {
            GetPdfAccountStatement200Response result = apiInstance.getPdfAccountStatement(walletId, month, year);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountStatementsApi#getPdfAccountStatement");
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
| **month** | **Integer**| The month of the statement (2 digits leading with &#x60;0&#x60;) | |
| **year** | **Integer**| The year of the statement (4 digits, e.g., &#x60;2022&#x60;) | |

### Return type

[**GetPdfAccountStatement200Response**](GetPdfAccountStatement200Response.md)

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


## getRawStatement

> GetRawStatement200Response getRawStatement(walletId, month, year)

Get JSON Account Statement

Retrieve the raw data (json) to build a Wallet account statement.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.AccountStatementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AccountStatementsApi apiInstance = new AccountStatementsApi(defaultClient);
        String walletId = "12345"; // String | The unique identifier of the Wallet.
        Integer month = 2; // Integer | The month of the statement (2 digits, e.g., `02`)
        Integer year = 2025; // Integer | The year of the statement (4 digits, e.g., `2025`)
        try {
            GetRawStatement200Response result = apiInstance.getRawStatement(walletId, month, year);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountStatementsApi#getRawStatement");
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
| **month** | **Integer**| The month of the statement (2 digits, e.g., &#x60;02&#x60;) | |
| **year** | **Integer**| The year of the statement (4 digits, e.g., &#x60;2025&#x60;) | |

### Return type

[**GetRawStatement200Response**](GetRawStatement200Response.md)

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

