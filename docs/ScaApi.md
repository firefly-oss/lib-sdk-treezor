# ScaApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteScaWallet**](ScaApi.md#deleteScaWallet) | **DELETE** /core-connect/sca/scawallets/{scaWalletId} | Delete SCA Wallet |
| [**getSCAWallets**](ScaApi.md#getSCAWallets) | **GET** /core-connect/sca/scawallets | Search SCA Wallets |
| [**getScaWallet**](ScaApi.md#getScaWallet) | **GET** /core-connect/sca/scawallets/{scaWalletId} | Get SCA Wallet |
| [**postScaWallet**](ScaApi.md#postScaWallet) | **POST** /core-connect/sca/scawallets | Create SCA Wallet |
| [**putScaWallet**](ScaApi.md#putScaWallet) | **PUT** /core-connect/sca/scawallets/{scaWalletId}/lock | Lock SCA Wallet |
| [**resetScaWalletPin**](ScaApi.md#resetScaWalletPin) | **PUT** /core-connect/sca/scawallets/{scaWalletId}/resetPin | Reset PIN |
| [**setPasscode**](ScaApi.md#setPasscode) | **PUT** /core-connect/sca/setPasscode | Change Passcode |
| [**swapSCAWallets**](ScaApi.md#swapSCAWallets) | **POST** /core-connect/sca/scawallets/swap | Swap SCA Wallets |
| [**unlockScaWallet**](ScaApi.md#unlockScaWallet) | **PUT** /core-connect/sca/scawallets/{scaWalletId}/unlock | Unlock SCA Wallet |



## deleteScaWallet

> ScaWalletObject deleteScaWallet(scaWalletId)

Delete SCA Wallet

Permanently delete an SCA Wallet.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.ScaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ScaApi apiInstance = new ScaApi(defaultClient);
        String scaWalletId = "12345"; // String | The unique identifier of the SCA Wallet.
        try {
            ScaWalletObject result = apiInstance.deleteScaWallet(scaWalletId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScaApi#deleteScaWallet");
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
| **scaWalletId** | **String**| The unique identifier of the SCA Wallet. | |

### Return type

[**ScaWalletObject**](ScaWalletObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The wallet was successfully deleted. |  -  |
| **0** | Unexpected error |  -  |


## getSCAWallets

> ScaWalletObject getSCAWallets(userId, cursor)

Search SCA Wallets

Retrieve the list of [SCA Wallets](/guide/strong-customer-authentication/introduction.html#sca-wallet-object) for a given user.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.ScaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ScaApi apiInstance = new ScaApi(defaultClient);
        String userId = "123456"; // String | The unique identifier of the user.
        String cursor = "da4b9237bacccdf19c0760cab7aec4a8359010b0"; // String | Pagination cursor, if you don't pass a cursor, result will start at the first page.
        try {
            ScaWalletObject result = apiInstance.getSCAWallets(userId, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScaApi#getSCAWallets");
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
| **userId** | **String**| The unique identifier of the user. | |
| **cursor** | **String**| Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page. | [optional] |

### Return type

[**ScaWalletObject**](ScaWalletObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of wallet was successfully retrieved. |  -  |
| **0** | Unexpected error |  -  |


## getScaWallet

> ScaWalletObject getScaWallet(scaWalletId)

Get SCA Wallet

Retrieve an SCA Wallet by providing its &#x60;id&#x60;.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.ScaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ScaApi apiInstance = new ScaApi(defaultClient);
        String scaWalletId = "12345"; // String | The unique identifier of the SCA Wallet.
        try {
            ScaWalletObject result = apiInstance.getScaWallet(scaWalletId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScaApi#getScaWallet");
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
| **scaWalletId** | **String**| The unique identifier of the SCA Wallet. | |

### Return type

[**ScaWalletObject**](ScaWalletObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The wallet was successfully retrieved. |  -  |
| **404** | The wallet was not found. |  -  |
| **0** | Unexpected error |  -  |


## postScaWallet

> ScaWalletObject postScaWallet(postScaWalletRequest)

Create SCA Wallet

Create a new [SCA Wallet](/guide/strong-customer-authentication/introduction.html#sca-wallet-object) manually.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.ScaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ScaApi apiInstance = new ScaApi(defaultClient);
        PostScaWalletRequest postScaWalletRequest = new PostScaWalletRequest(); // PostScaWalletRequest | 
        try {
            ScaWalletObject result = apiInstance.postScaWallet(postScaWalletRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScaApi#postScaWallet");
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
| **postScaWalletRequest** | [**PostScaWalletRequest**](PostScaWalletRequest.md)|  | [optional] |

### Return type

[**ScaWalletObject**](ScaWalletObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The wallet was successfully created. |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## putScaWallet

> ScaWalletObject putScaWallet(scaWalletId, putScaWalletRequest)

Lock SCA Wallet

Locks an SCA Wallet so that none of the services it offers can be unlocked until it is unlocked. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.ScaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ScaApi apiInstance = new ScaApi(defaultClient);
        String scaWalletId = "12345"; // String | The unique identifier of the SCA Wallet.
        PutScaWalletRequest putScaWalletRequest = new PutScaWalletRequest(); // PutScaWalletRequest | 
        try {
            ScaWalletObject result = apiInstance.putScaWallet(scaWalletId, putScaWalletRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScaApi#putScaWallet");
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
| **scaWalletId** | **String**| The unique identifier of the SCA Wallet. | |
| **putScaWalletRequest** | [**PutScaWalletRequest**](PutScaWalletRequest.md)|  | [optional] |

### Return type

[**ScaWalletObject**](ScaWalletObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The wallet is locked. |  -  |
| **400** | The lock reason field is required. |  -  |
| **0** | Unexpected error |  -  |


## resetScaWalletPin

> ScaWalletObject resetScaWalletPin(scaWalletId)

Reset PIN

Reset the PIN code of an SCA Wallet if the user has locked their Wallet after too many consecutive wrong PIN attempts. See [Reset PIN (Mobile)](/guide/strong-customer-authentication/sca-wallet-lifecycle.html#reset-pin-mobile) for more information.  Once the PIN reset, the Customer can set a new PIN via the mobile application. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.ScaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ScaApi apiInstance = new ScaApi(defaultClient);
        String scaWalletId = "12345"; // String | The unique identifier of the SCA Wallet.
        try {
            ScaWalletObject result = apiInstance.resetScaWalletPin(scaWalletId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScaApi#resetScaWalletPin");
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
| **scaWalletId** | **String**| The unique identifier of the SCA Wallet. | |

### Return type

[**ScaWalletObject**](ScaWalletObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | PIN has been reset. |  -  |
| **0** | Unexpected error |  -  |


## setPasscode

> setPasscode(setPasscodeRequest)

Change Passcode

Change the passcode ([Web Native SCA](/guide/strong-customer-authentication/introduction.html#web-native)). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.ScaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ScaApi apiInstance = new ScaApi(defaultClient);
        SetPasscodeRequest setPasscodeRequest = new SetPasscodeRequest(); // SetPasscodeRequest | 
        try {
            apiInstance.setPasscode(setPasscodeRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScaApi#setPasscode");
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
| **setPasscodeRequest** | [**SetPasscodeRequest**](SetPasscodeRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Accepted |  -  |


## swapSCAWallets

> ScaWalletObject swapSCAWallets(swapSCAWalletsRequest)

Swap SCA Wallets

Create an SCA Wallet while deleting the previous one as users should have only one device enrolled.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.ScaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ScaApi apiInstance = new ScaApi(defaultClient);
        SwapSCAWalletsRequest swapSCAWalletsRequest = new SwapSCAWalletsRequest(); // SwapSCAWalletsRequest | 
        try {
            ScaWalletObject result = apiInstance.swapSCAWallets(swapSCAWalletsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScaApi#swapSCAWallets");
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
| **swapSCAWalletsRequest** | [**SwapSCAWalletsRequest**](SwapSCAWalletsRequest.md)|  | [optional] |

### Return type

[**ScaWalletObject**](ScaWalletObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of wallet was successfully retrieved. |  -  |
| **0** | Unexpected error |  -  |


## unlockScaWallet

> ScaWalletObject unlockScaWallet(scaWalletId)

Unlock SCA Wallet

Unlock an SCA Wallet.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.ScaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ScaApi apiInstance = new ScaApi(defaultClient);
        String scaWalletId = "12345"; // String | The unique identifier of the SCA Wallet.
        try {
            ScaWalletObject result = apiInstance.unlockScaWallet(scaWalletId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScaApi#unlockScaWallet");
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
| **scaWalletId** | **String**| The unique identifier of the SCA Wallet. | |

### Return type

[**ScaWalletObject**](ScaWalletObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The wallet is unlocked. |  -  |
| **0** | Unexpected error |  -  |

