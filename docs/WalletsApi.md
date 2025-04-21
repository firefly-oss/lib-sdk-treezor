# WalletsApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteWallet**](WalletsApi.md#deleteWallet) | **DELETE** /v1/wallets/{walletId} | Delete Wallet |
| [**getWallet**](WalletsApi.md#getWallet) | **GET** /v1/wallets/{walletId} | Get Wallet |
| [**getWallets**](WalletsApi.md#getWallets) | **GET** /v1/wallets | Search Wallets |
| [**postWallets**](WalletsApi.md#postWallets) | **POST** /v1/wallets | Create Wallet |
| [**putWallet**](WalletsApi.md#putWallet) | **PUT** /v1/wallets/{walletId} | Update Wallet |



## deleteWallet

> WalletObject deleteWallet(walletId, deleteWalletRequest)

Delete Wallet

Change the status of the Wallet to &#x60;CANCELED&#x60;. This action is irreversible.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.WalletsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        WalletsApi apiInstance = new WalletsApi(defaultClient);
        Integer walletId = 12345; // Integer | The unique identifier of the Wallet.
        DeleteWalletRequest deleteWalletRequest = new DeleteWalletRequest(); // DeleteWalletRequest | 
        try {
            WalletObject result = apiInstance.deleteWallet(walletId, deleteWalletRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletsApi#deleteWallet");
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
| **deleteWalletRequest** | [**DeleteWalletRequest**](DeleteWalletRequest.md)|  | [optional] |

### Return type

[**WalletObject**](WalletObject.md)

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


## getWallet

> WalletObject getWallet(walletId, accessTag)

Get Wallet

Retrieve a Wallet based on its &#x60;id&#x60;.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.WalletsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        WalletsApi apiInstance = new WalletsApi(defaultClient);
        Long walletId = 12345L; // Long | The unique identifier of the Wallet.
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        try {
            WalletObject result = apiInstance.getWallet(walletId, accessTag);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletsApi#getWallet");
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
| **walletId** | **Long**| The unique identifier of the Wallet. | |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  | [optional] |

### Return type

[**WalletObject**](WalletObject.md)

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


## getWallets

> WalletObject getWallets(accessTag, walletId, walletStatus, userId, parentUserId, walletTag, walletTypeId, walletTypeIdList, tariffId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo)

Search Wallets

Retrieve Wallets that match your search conditions. The request must specify at least one of those fields: &#x60;walletId&#x60;, &#x60;userId&#x60;, or &#x60;walletTypeId&#x60;. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.WalletsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        WalletsApi apiInstance = new WalletsApi(defaultClient);
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        Integer walletId = 12345; // Integer | The unique identifier of the Wallet.
        String walletStatus = "CANCELED"; // String | The status of the Wallet, which can be one of the following: * `CANCELED` – The Wallet is deactivated. * `PENDING` – The Wallet has just been created. * `VALIDATED` – The Wallet is active. 
        Integer userId = 12345; // Integer | The unique identifier of the User owning the Wallet.
        Integer parentUserId = 12345; // Integer | The unique identifier of the Parent User of the Wallet owner.
        String walletTag = "walletTag_example"; // String | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and `/` `!` `-` `_` `.` `*` `'` `(` `)` 
        Integer walletTypeId = 9; // Integer | The type of Wallet. The following values are allowed: * `9` – Electronic Money Wallet * `10` – Payment Account Wallet  Other types are available but can only be set by Treezor. Learn more in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation. 
        List<Integer> walletTypeIdList = Arrays.asList(); // List<Integer> | The list of `walletTypeId` to take into account.   Must be associated with the `userId` query parameter and is ignored if the `walletTypeId` parameter is provided.  Learn more about wallet types in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation. 
        Integer tariffId = 123; // Integer | The fees applied to the Wallet, as defined by your contract with Treezor. Usually required, but may have a default value set by Treezor.
        Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
        Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints   
        String sortBy = "createdDate"; // String | The transaction element you want to sort the list with. 
        String sortOrder = "ASC"; // String | The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
        OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result.  Format: `YYYY-MM-DD HH:mm:ss`. 
        OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result.  Format: `YYYY-MM-DD HH:mm:ss`. 
        OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result.   Format: `YYYY-MM-DD HH:mm:ss`.  
        OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result.   Format: `YYYY-MM-DD HH:mm:ss`. 
        try {
            WalletObject result = apiInstance.getWallets(accessTag, walletId, walletStatus, userId, parentUserId, walletTag, walletTypeId, walletTypeIdList, tariffId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletsApi#getWallets");
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
| **walletId** | **Integer**| The unique identifier of the Wallet. | [optional] |
| **walletStatus** | **String**| The status of the Wallet, which can be one of the following: * &#x60;CANCELED&#x60; – The Wallet is deactivated. * &#x60;PENDING&#x60; – The Wallet has just been created. * &#x60;VALIDATED&#x60; – The Wallet is active.  | [optional] [enum: CANCELED, PENDING, VALIDATED] |
| **userId** | **Integer**| The unique identifier of the User owning the Wallet. | [optional] |
| **parentUserId** | **Integer**| The unique identifier of the Parent User of the Wallet owner. | [optional] |
| **walletTag** | **String**| Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  | [optional] |
| **walletTypeId** | **Integer**| The type of Wallet. The following values are allowed: * &#x60;9&#x60; – Electronic Money Wallet * &#x60;10&#x60; – Payment Account Wallet  Other types are available but can only be set by Treezor. Learn more in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation.  | [optional] [enum: 9, 10, 15] |
| **walletTypeIdList** | [**List&lt;Integer&gt;**](Integer.md)| The list of &#x60;walletTypeId&#x60; to take into account.   Must be associated with the &#x60;userId&#x60; query parameter and is ignored if the &#x60;walletTypeId&#x60; parameter is provided.  Learn more about wallet types in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation.  | [optional] [enum: 9, 10, 15] |
| **tariffId** | **Integer**| The fees applied to the Wallet, as defined by your contract with Treezor. Usually required, but may have a default value set by Treezor. | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints    | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with.  | [optional] [default to createdDate] |
| **sortOrder** | **String**| The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending.  | [optional] [default to DESC] [enum: ASC, DESC] |
| **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  | [optional] |
| **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  | [optional] |
| **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.   | [optional] |
| **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  | [optional] |

### Return type

[**WalletObject**](WalletObject.md)

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


## postWallets

> WalletObject postWallets(postWalletsRequest)

Create Wallet

Create a new Wallet. This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.WalletsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        WalletsApi apiInstance = new WalletsApi(defaultClient);
        PostWalletsRequest postWalletsRequest = new PostWalletsRequest(); // PostWalletsRequest | 
        try {
            WalletObject result = apiInstance.postWallets(postWalletsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletsApi#postWallets");
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
| **postWalletsRequest** | [**PostWalletsRequest**](PostWalletsRequest.md)|  | [optional] |

### Return type

[**WalletObject**](WalletObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **0** | Unexpected error |  -  |


## putWallet

> WalletObject putWallet(walletId, putWalletRequest)

Update Wallet

Modifiy a Wallet information

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.WalletsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        WalletsApi apiInstance = new WalletsApi(defaultClient);
        Long walletId = 12345L; // Long | The unique identifier of the Wallet.
        PutWalletRequest putWalletRequest = new PutWalletRequest(); // PutWalletRequest | 
        try {
            WalletObject result = apiInstance.putWallet(walletId, putWalletRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletsApi#putWallet");
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
| **walletId** | **Long**| The unique identifier of the Wallet. | |
| **putWalletRequest** | [**PutWalletRequest**](PutWalletRequest.md)|  | [optional] |

### Return type

[**WalletObject**](WalletObject.md)

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

