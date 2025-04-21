# PayinsApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deletePayin**](PayinsApi.md#deletePayin) | **DELETE** /v1/payins/{payinId} | Delete Payin |
| [**getPayin**](PayinsApi.md#getPayin) | **GET** /v1/payins/{payinId} | Get Payin |
| [**getPayins**](PayinsApi.md#getPayins) | **GET** /v1/payins | Search Payins |
| [**postPayin**](PayinsApi.md#postPayin) | **POST** /v1/payins | Create Payin |
| [**simulateSctInstReception**](PayinsApi.md#simulateSctInstReception) | **POST** /simulation/sct-inst/payin | Simulate SCTR Inst |
| [**simulateSctReception**](PayinsApi.md#simulateSctReception) | **POST** /simulation/payin-sct | Simulate SCTR |



## deletePayin

> PayinObject deletePayin(payinId)

Delete Payin

Cancels a Payin. This endpoint is only available for: * [Check cashing](/guide/cheques/introduction.html), before the treatment center receives the check. * [SEPA Direct Debit emission](/guide/transfers/direct-debit.html#emitted-direct-debits-sdde), before Treezor processes it. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.PayinsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        PayinsApi apiInstance = new PayinsApi(defaultClient);
        String payinId = "12345"; // String | The unique identifier of the payin.
        try {
            PayinObject result = apiInstance.deletePayin(payinId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PayinsApi#deletePayin");
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
| **payinId** | **String**| The unique identifier of the payin. | |

### Return type

[**PayinObject**](PayinObject.md)

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


## getPayin

> PayinObject getPayin(payinId)

Get Payin

Retrieve a payin by its id.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.PayinsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        PayinsApi apiInstance = new PayinsApi(defaultClient);
        String payinId = "12345"; // String | The unique identifier of the payin.
        try {
            PayinObject result = apiInstance.getPayin(payinId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PayinsApi#getPayin");
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
| **payinId** | **String**| The unique identifier of the payin. | |

### Return type

[**PayinObject**](PayinObject.md)

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


## getPayins

> PayinObject getPayins(accessTag, payinId, walletId, payinTag, payinStatus, userId, userName, userEmail, beneficiaryUserId, eventAlias, walletTypeId, paymentMethodId, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, sortOrder, cursor)

Search Payins

Get payins that match search criteria.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.PayinsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        PayinsApi apiInstance = new PayinsApi(defaultClient);
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        Integer payinId = 12345; // Integer | The unique identifier of the payin.
        Integer walletId = 12345; // Integer | The unique identifier of the Wallet of the payin.
        String payinTag = "payinTag_example"; // String | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Max length: 250 characters.  Format: hc characters and `/` `!` `-` `_` `.` `*` `'` `(` `)` 
        String payinStatus = "CANCELED"; // String | The status of the payin.
        String userId = "12345"; // String | The unique identifier of the User who performed the operation (debited).
        String userName = "ALEX OAK"; // String | The name of the User who performed the operation (debited).
        String userEmail = "a.oak@example.com"; // String | The email of the User who performed the operation (debited).
        Integer beneficiaryUserId = 12345; // Integer | The unique identifier of the User who received the operation (credited).
        String eventAlias = "eventAlias_example"; // String | The name of the credited Wallet.
        Integer walletTypeId = 9; // Integer | The Wallet Type of the Wallet of the payin.
        String paymentMethodId = "20"; // String | Payin's payment method id.
        OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result.   Format: `YYYY-MM-DD HH:mm:ss` 
        OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result.   Format: `YYYY-MM-DD HH:mm:ss` 
        OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result.   Format: `YYYY-MM-DD HH:mm:ss` 
        OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result.   Format: `YYYY-MM-DD HH:mm:ss` 
        String sortOrder = "ASC"; // String | The order in which you want to sort the list based on the payin's date. * **DESC** for descending. * **ASC** for ascending. 
        String cursor = "da4b9237bacccdf19c0760cab7aec4a8359010b0"; // String | Pagination cursor, if you don't pass a cursor, result will start at the first page.
        try {
            PayinObject result = apiInstance.getPayins(accessTag, payinId, walletId, payinTag, payinStatus, userId, userName, userEmail, beneficiaryUserId, eventAlias, walletTypeId, paymentMethodId, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, sortOrder, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PayinsApi#getPayins");
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
| **walletId** | **Integer**| The unique identifier of the Wallet of the payin. | [optional] |
| **payinTag** | **String**| Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Max length: 250 characters.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  | [optional] |
| **payinStatus** | **String**| The status of the payin. | [optional] [enum: CANCELED, PENDING, VALIDATED] |
| **userId** | **String**| The unique identifier of the User who performed the operation (debited). | [optional] |
| **userName** | **String**| The name of the User who performed the operation (debited). | [optional] |
| **userEmail** | **String**| The email of the User who performed the operation (debited). | [optional] |
| **beneficiaryUserId** | **Integer**| The unique identifier of the User who received the operation (credited). | [optional] |
| **eventAlias** | **String**| The name of the credited Wallet. | [optional] |
| **walletTypeId** | **Integer**| The Wallet Type of the Wallet of the payin. | [optional] [enum: 9, 10, 15] |
| **paymentMethodId** | **String**| Payin&#39;s payment method id. | [optional] [enum: 20, 21, 23, 24, 25, 26, 27] |
| **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  | [optional] |
| **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  | [optional] |
| **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  | [optional] |
| **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  | [optional] |
| **sortOrder** | **String**| The order in which you want to sort the list based on the payin&#39;s date. * **DESC** for descending. * **ASC** for ascending.  | [optional] [default to DESC] [enum: ASC, DESC] |
| **cursor** | **String**| Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page. | [optional] |

### Return type

[**PayinObject**](PayinObject.md)

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


## postPayin

> PayinObject postPayin(postPayinRequest)

Create Payin

Create a new payin.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.PayinsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        PayinsApi apiInstance = new PayinsApi(defaultClient);
        PostPayinRequest postPayinRequest = new PostPayinRequest(); // PostPayinRequest | 
        try {
            PayinObject result = apiInstance.postPayin(postPayinRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PayinsApi#postPayin");
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
| **postPayinRequest** | [**PostPayinRequest**](PostPayinRequest.md)|  | [optional] |

### Return type

[**PayinObject**](PayinObject.md)

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


## simulateSctInstReception

> SimulateSctInstReception201Response simulateSctInstReception(simulateSctInstReceptionRequest)

Simulate SCTR Inst

Simulate the reception of an instantaneous SEPA Credit Transfer into one of your Wallet in Sandbox.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.PayinsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        PayinsApi apiInstance = new PayinsApi(defaultClient);
        SimulateSctInstReceptionRequest simulateSctInstReceptionRequest = new SimulateSctInstReceptionRequest(); // SimulateSctInstReceptionRequest | 
        try {
            SimulateSctInstReception201Response result = apiInstance.simulateSctInstReception(simulateSctInstReceptionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PayinsApi#simulateSctInstReception");
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
| **simulateSctInstReceptionRequest** | [**SimulateSctInstReceptionRequest**](SimulateSctInstReceptionRequest.md)|  | [optional] |

### Return type

[**SimulateSctInstReception201Response**](SimulateSctInstReception201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |


## simulateSctReception

> SimulateSctReception200Response simulateSctReception(simulateSctReceptionRequest)

Simulate SCTR

Simulate the reception of a SEPA Credit Transfer into one of your Wallet in Sandbox.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.PayinsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        PayinsApi apiInstance = new PayinsApi(defaultClient);
        SimulateSctReceptionRequest simulateSctReceptionRequest = new SimulateSctReceptionRequest(); // SimulateSctReceptionRequest | 
        try {
            SimulateSctReception200Response result = apiInstance.simulateSctReception(simulateSctReceptionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PayinsApi#simulateSctReception");
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
| **simulateSctReceptionRequest** | [**SimulateSctReceptionRequest**](SimulateSctReceptionRequest.md)|  | [optional] |

### Return type

[**SimulateSctReception200Response**](SimulateSctReception200Response.md)

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

