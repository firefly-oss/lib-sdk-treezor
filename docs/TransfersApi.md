# TransfersApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTransfer**](TransfersApi.md#deleteTransfer) | **DELETE** /v1/transfers/{transferId} | Cancel Transfer |
| [**getTransfer**](TransfersApi.md#getTransfer) | **GET** /v1/transfers/{transferId} | Get Transfer |
| [**getTransfers**](TransfersApi.md#getTransfers) | **GET** /v1/transfers | Search Transfers |
| [**postTransfers**](TransfersApi.md#postTransfers) | **POST** /v1/transfers | Create Transfer |



## deleteTransfer

> TransferObject deleteTransfer(transferId)

Cancel Transfer

Change status of the Transfer to &#x60;CANCELED&#x60;.   Only transfers whose stauts is &#x60;PENDING&#x60; can be canceled. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.TransfersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        TransfersApi apiInstance = new TransfersApi(defaultClient);
        Long transferId = 12345L; // Long | The unique identifier of the Transfer.
        try {
            TransferObject result = apiInstance.deleteTransfer(transferId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransfersApi#deleteTransfer");
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
| **transferId** | **Long**| The unique identifier of the Transfer. | |

### Return type

[**TransferObject**](TransferObject.md)

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


## getTransfer

> TransferObject getTransfer(transferId)

Get Transfer

Retrieve a transfer using its &#x60;id&#x60;.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.TransfersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        TransfersApi apiInstance = new TransfersApi(defaultClient);
        Long transferId = 12345L; // Long | The unique identifier of the Transfer.
        try {
            TransferObject result = apiInstance.getTransfer(transferId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransfersApi#getTransfer");
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
| **transferId** | **Long**| The unique identifier of the Transfer. | |

### Return type

[**TransferObject**](TransferObject.md)

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


## getTransfers

> TransferObject getTransfers(accessTag, transferId, transferTag, transferStatus, walletId, beneficiaryWalletId, userId, beneficiaryUserId, amount, currency, transferTypeId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo)

Search Transfers

Retrieve the list of transfers for at least one of those inputs: &#x60;walletId&#x60;, &#x60;beneficiaryWalletId&#x60;, &#x60;userId&#x60;, &#x60;beneficiaryUserId&#x60;, &#x60;transferId&#x60;, &#x60;transferTag&#x60; 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.TransfersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        TransfersApi apiInstance = new TransfersApi(defaultClient);
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        Integer transferId = 12345; // Integer | The unique identifier of the Transfer.
        String transferTag = "transferTag_example"; // String | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Max length: 250 characters.   Format: hc characters and `/` `!` `-` `_` `.` `*` `'` `(` `)` 
        String transferStatus = "CANCELED"; // String | The status of the Transfer. 
        Integer walletId = 12345; // Integer | The unique identifier of the debited Wallet.
        Integer beneficiaryWalletId = 12345; // Integer | The unique identifier of the credited Wallet.
        Integer userId = 12345; // Integer | The unique identifier of the owner of the debited Wallet.
        Integer beneficiaryUserId = 12345; // Integer | The unique identifier of the owner of the credited Wallet.
        String amount = "amount_example"; // String | The amount of the Transfer.
        String currency = "EUR"; // String | The currency of the Transfer amount. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies). 
        Integer transferTypeId = 1; // Integer | The type of the Transfer: * `1` – Wallet to wallet  * `2` – Card transaction * `3` – Client fees * `4` – Credit note 
        Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
        Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints   
        String sortBy = "createdDate"; // String | The transaction element you want to sort the list with. 
        String sortOrder = "ASC"; // String | The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
        OffsetDateTime createdDateFrom = OffsetDateTime.parse("2024-12-04 12:44:54"); // OffsetDateTime | The creation date from which you want to filter the request result.  Format: `YYYY-MM-DD HH:mm:ss`.  
        OffsetDateTime createdDateTo = OffsetDateTime.parse("2024-12-04 12:44:54"); // OffsetDateTime | The creation date up to which you want to filter the request result.  Format: `YYYY-MM-DD HH:mm:ss`.  
        OffsetDateTime updatedDateFrom = OffsetDateTime.parse("2024-12-04 12:44:54"); // OffsetDateTime | The modification date from which you want to filter the request result.   Format: `YYYY-MM-DD HH:mm:ss`.  
        OffsetDateTime updatedDateTo = OffsetDateTime.parse("2024-12-04 12:44:54"); // OffsetDateTime | The modification date up to which you want to filter the request result.   Format: `YYYY-MM-DD HH:mm:ss`.  
        try {
            TransferObject result = apiInstance.getTransfers(accessTag, transferId, transferTag, transferStatus, walletId, beneficiaryWalletId, userId, beneficiaryUserId, amount, currency, transferTypeId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransfersApi#getTransfers");
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
| **transferId** | **Integer**| The unique identifier of the Transfer. | [optional] |
| **transferTag** | **String**| Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Max length: 250 characters.   Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  | [optional] |
| **transferStatus** | **String**| The status of the Transfer.  | [optional] [enum: CANCELED, PENDING, VALIDATED] |
| **walletId** | **Integer**| The unique identifier of the debited Wallet. | [optional] |
| **beneficiaryWalletId** | **Integer**| The unique identifier of the credited Wallet. | [optional] |
| **userId** | **Integer**| The unique identifier of the owner of the debited Wallet. | [optional] |
| **beneficiaryUserId** | **Integer**| The unique identifier of the owner of the credited Wallet. | [optional] |
| **amount** | **String**| The amount of the Transfer. | [optional] |
| **currency** | **String**| The currency of the Transfer amount. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies).  | [optional] |
| **transferTypeId** | **Integer**| The type of the Transfer: * &#x60;1&#x60; – Wallet to wallet  * &#x60;2&#x60; – Card transaction * &#x60;3&#x60; – Client fees * &#x60;4&#x60; – Credit note  | [optional] [enum: 1, 2, 3, 4] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints    | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with.  | [optional] [default to createdDate] |
| **sortOrder** | **String**| The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending.  | [optional] [default to DESC] [enum: ASC, DESC] |
| **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.   | [optional] |
| **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.   | [optional] |
| **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.   | [optional] |
| **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.   | [optional] |

### Return type

[**TransferObject**](TransferObject.md)

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


## postTransfers

> TransferObject postTransfers(postTransfersRequest)

Create Transfer

Create a new Wallet-to-Wallet transfer.  This endpoint requires per-session or per-operation [SCA](/guide/strong-customer-authentication/introduction.html) on if the &#x60;beneficiaryWalletId&#x60; belongs to the current User or not. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.TransfersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        TransfersApi apiInstance = new TransfersApi(defaultClient);
        PostTransfersRequest postTransfersRequest = new PostTransfersRequest(); // PostTransfersRequest | 
        try {
            TransferObject result = apiInstance.postTransfers(postTransfersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransfersApi#postTransfers");
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
| **postTransfersRequest** | [**PostTransfersRequest**](PostTransfersRequest.md)|  | [optional] |

### Return type

[**TransferObject**](TransferObject.md)

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

