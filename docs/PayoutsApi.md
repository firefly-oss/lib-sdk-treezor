# PayoutsApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deletePayout**](PayoutsApi.md#deletePayout) | **DELETE** /v1/payouts/{payoutId} | Cancel Payout |
| [**getPayout**](PayoutsApi.md#getPayout) | **GET** /v1/payouts/{payoutId} | Get Payout |
| [**getPayouts**](PayoutsApi.md#getPayouts) | **GET** /v1/payouts | Search Payouts |
| [**getProofPayout**](PayoutsApi.md#getProofPayout) | **GET** /core-connect/payouts/{payoutId}/proof | Create Payout Proof |
| [**postPayout**](PayoutsApi.md#postPayout) | **POST** /v1/payouts | Create Payout |
| [**simulateSDDR**](PayoutsApi.md#simulateSDDR) | **POST** /simulation/payout-sddr | Simulate SDDR Core |



## deletePayout

> DeletePayout200Response deletePayout(payoutId)

Cancel Payout

Change payout status to &#x60;CANCELED&#x60;. A &#x60;VALIDATED&#x60; payout can&#39;t be canceled. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.PayoutsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        PayoutsApi apiInstance = new PayoutsApi(defaultClient);
        Long payoutId = 12345L; // Long | The unique identifier of the Payout.
        try {
            DeletePayout200Response result = apiInstance.deletePayout(payoutId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PayoutsApi#deletePayout");
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
| **payoutId** | **Long**| The unique identifier of the Payout. | |

### Return type

[**DeletePayout200Response**](DeletePayout200Response.md)

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


## getPayout

> GetPayout200Response getPayout(payoutId)

Get Payout

Retrieve a given Payout.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.PayoutsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        PayoutsApi apiInstance = new PayoutsApi(defaultClient);
        Long payoutId = 12345L; // Long | The unique identifier of the Payout.
        try {
            GetPayout200Response result = apiInstance.getPayout(payoutId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PayoutsApi#getPayout");
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
| **payoutId** | **Long**| The unique identifier of the Payout. | |

### Return type

[**GetPayout200Response**](GetPayout200Response.md)

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


## getPayouts

> GetPayouts200Response getPayouts(payoutTag, walletId, userId, sortOrder, cursor)

Search Payouts

Retrieve Payouts that match search criteria. The request must contain at least one of the following inputs: &#x60;userId&#x60;, &#x60;walletId&#x60;. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.PayoutsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        PayoutsApi apiInstance = new PayoutsApi(defaultClient);
        String payoutTag = "payoutTag_example"; // String | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and `/` `!` `-` `_` `.` `*` `'` `(` `)` 
        Integer walletId = 12345; // Integer | The unique identifier of the payout Wallet.
        Integer userId = 12345; // Integer | The unique identifier of the payout User.
        String sortOrder = "ASC"; // String | The order in which you want to sort the list based on the payout's date. * **DESC** for descending. * **ASC** for ascending. 
        String cursor = "da4b9237bacccdf19c0760cab7aec4a8359010b0"; // String | Pagination cursor, if you don't pass a cursor, result will start at the first page.
        try {
            GetPayouts200Response result = apiInstance.getPayouts(payoutTag, walletId, userId, sortOrder, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PayoutsApi#getPayouts");
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
| **payoutTag** | **String**| Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  | [optional] |
| **walletId** | **Integer**| The unique identifier of the payout Wallet. | [optional] |
| **userId** | **Integer**| The unique identifier of the payout User. | [optional] |
| **sortOrder** | **String**| The order in which you want to sort the list based on the payout&#39;s date. * **DESC** for descending. * **ASC** for ascending.  | [optional] [default to DESC] [enum: ASC, DESC] |
| **cursor** | **String**| Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page. | [optional] |

### Return type

[**GetPayouts200Response**](GetPayouts200Response.md)

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


## getProofPayout

> GetProofPayout200Response getProofPayout(payoutId)

Create Payout Proof

Generate and download a proof of payout in .PDF format. See [Proof of Payout](/guide/transfers/proof-of-payout.html) for more information. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.PayoutsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        PayoutsApi apiInstance = new PayoutsApi(defaultClient);
        String payoutId = "12345"; // String | The unique identifier of the Payout.
        try {
            GetProofPayout200Response result = apiInstance.getProofPayout(payoutId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PayoutsApi#getProofPayout");
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
| **payoutId** | **String**| The unique identifier of the Payout. | |

### Return type

[**GetProofPayout200Response**](GetProofPayout200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## postPayout

> PostPayout200Response postPayout(postPayoutRequest)

Create Payout

Create a new payout.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.PayoutsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        PayoutsApi apiInstance = new PayoutsApi(defaultClient);
        PostPayoutRequest postPayoutRequest = new PostPayoutRequest(); // PostPayoutRequest | 
        try {
            PostPayout200Response result = apiInstance.postPayout(postPayoutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PayoutsApi#postPayout");
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
| **postPayoutRequest** | [**PostPayoutRequest**](PostPayoutRequest.md)|  | [optional] |

### Return type

[**PostPayout200Response**](PostPayout200Response.md)

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


## simulateSDDR

> simulateSDDR(simulateSDDRRequest)

Simulate SDDR Core

Simulate a received SEPA Direct Debit into one of your Wallet in Sandbox.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.PayoutsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        PayoutsApi apiInstance = new PayoutsApi(defaultClient);
        SimulateSDDRRequest simulateSDDRRequest = new SimulateSDDRRequest(); // SimulateSDDRRequest | 
        try {
            apiInstance.simulateSDDR(simulateSDDRRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling PayoutsApi#simulateSDDR");
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
| **simulateSDDRRequest** | [**SimulateSDDRRequest**](SimulateSDDRRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **400** | Bad Request |  -  |

