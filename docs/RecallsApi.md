# RecallsApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRecallR**](RecallsApi.md#getRecallR) | **GET** /v1/recallRs/{recallId} | Get Recall or RRO |
| [**getRecallRs**](RecallsApi.md#getRecallRs) | **GET** /v1/recallRs | Get Recalls or RRO |
| [**getRecallSctInst**](RecallsApi.md#getRecallSctInst) | **GET** /v1/recall-sct-inst/{sctInstId}/{recallId} | Get SCT Inst Recall |
| [**putRecallR**](RecallsApi.md#putRecallR) | **PUT** /v1/recallRs/{recallId}/response | Respond to Recall or RRO |
| [**putRecallSctInst**](RecallsApi.md#putRecallSctInst) | **PUT** /v1/recall-sct-inst/{sctInstId}/{recallId}/response | Respond to SCT Inst Recall |
| [**simulateSctInstRecall**](RecallsApi.md#simulateSctInstRecall) | **POST** /simulation/sct-inst/recall | Simulate SCT Inst recall |



## getRecallR

> GetRecallRs200Response getRecallR(recallId, accessTag, pageCount, pageNumber)

Get Recall or RRO

Retrieve a given recall or RRO.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.RecallsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        RecallsApi apiInstance = new RecallsApi(defaultClient);
        String recallId = "12345"; // String | The unique identifier of the recall. 
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints 
        Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints 
        try {
            GetRecallRs200Response result = apiInstance.getRecallR(recallId, accessTag, pageCount, pageNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecallsApi#getRecallR");
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
| **recallId** | **String**| The unique identifier of the recall.  | |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints  | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints  | [optional] |

### Return type

[**GetRecallRs200Response**](GetRecallRs200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized credentials |  -  |
| **403** | Forbidden action |  -  |
| **405** | Method Not Allowed |  -  |
| **500** | Internal error |  -  |
| **0** | Unexpected error |  -  |


## getRecallRs

> GetRecallRs200Response getRecallRs(accessTag, pageCount, pageNumber, filter)

Get Recalls or RRO

Retrieve recalls or RROs

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.RecallsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        RecallsApi apiInstance = new RecallsApi(defaultClient);
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints 
        Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints 
        String filter = "filter_example"; // String | List of available filters: - id - recallRSepaMessageId - cxlId - statusId - reasonCode - clientId - userId - walletId - sctrId - receivedDate - frozenWalletFollowingRecallr - createdDate - inError 
        try {
            GetRecallRs200Response result = apiInstance.getRecallRs(accessTag, pageCount, pageNumber, filter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecallsApi#getRecallRs");
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
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints  | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints  | [optional] |
| **filter** | **String**| List of available filters: - id - recallRSepaMessageId - cxlId - statusId - reasonCode - clientId - userId - walletId - sctrId - receivedDate - frozenWalletFollowingRecallr - createdDate - inError  | [optional] |

### Return type

[**GetRecallRs200Response**](GetRecallRs200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized credentials |  -  |
| **403** | Forbidden action |  -  |
| **405** | Method Not Allowed |  -  |
| **500** | Internal error |  -  |
| **0** | Unexpected error |  -  |


## getRecallSctInst

> GetRecallSctInst200Response getRecallSctInst(sctInstId, recallId)

Get SCT Inst Recall

Retrieve an SCT Inst Recall.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.RecallsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        RecallsApi apiInstance = new RecallsApi(defaultClient);
        String sctInstId = "12345"; // String | The unique identifier of the initial SCT Inst.
        String recallId = "12345"; // String | The unique identifier of the recall.
        try {
            GetRecallSctInst200Response result = apiInstance.getRecallSctInst(sctInstId, recallId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecallsApi#getRecallSctInst");
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
| **sctInstId** | **String**| The unique identifier of the initial SCT Inst. | |
| **recallId** | **String**| The unique identifier of the recall. | |

### Return type

[**GetRecallSctInst200Response**](GetRecallSctInst200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **405** | Method Not Allowed |  -  |
| **500** | Internal error |  -  |
| **0** | Unexpected error |  -  |


## putRecallR

> GetRecallRs200Response putRecallR(recallId, putRecallRRequest)

Respond to Recall or RRO

Respond to a Recall or a RRO.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.RecallsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        RecallsApi apiInstance = new RecallsApi(defaultClient);
        Long recallId = 12345L; // Long | The unique identifier of the recall.
        PutRecallRRequest putRecallRRequest = new PutRecallRRequest(); // PutRecallRRequest | 
        try {
            GetRecallRs200Response result = apiInstance.putRecallR(recallId, putRecallRRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecallsApi#putRecallR");
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
| **recallId** | **Long**| The unique identifier of the recall. | |
| **putRecallRRequest** | [**PutRecallRRequest**](PutRecallRRequest.md)|  | [optional] |

### Return type

[**GetRecallRs200Response**](GetRecallRs200Response.md)

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


## putRecallSctInst

> PutRecallSctInst201Response putRecallSctInst(sctInstId, recallId, putRecallSctInstRequest)

Respond to SCT Inst Recall

Provide your decision following an SCT Inst Recall.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.RecallsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        RecallsApi apiInstance = new RecallsApi(defaultClient);
        String sctInstId = "12345"; // String | The unique identifier of the initial SCT Inst.
        String recallId = "12345"; // String | The unique identifier of the recall.
        PutRecallSctInstRequest putRecallSctInstRequest = new PutRecallSctInstRequest(); // PutRecallSctInstRequest | 
        try {
            PutRecallSctInst201Response result = apiInstance.putRecallSctInst(sctInstId, recallId, putRecallSctInstRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecallsApi#putRecallSctInst");
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
| **sctInstId** | **String**| The unique identifier of the initial SCT Inst. | |
| **recallId** | **String**| The unique identifier of the recall. | |
| **putRecallSctInstRequest** | [**PutRecallSctInstRequest**](PutRecallSctInstRequest.md)|  | [optional] |

### Return type

[**PutRecallSctInst201Response**](PutRecallSctInst201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **405** | Method Not Allowed |  -  |
| **409** | Conflict |  -  |
| **0** | Unexpected error |  -  |


## simulateSctInstRecall

> SimulateSctInstRecall201Response simulateSctInstRecall(simulateSctInstRecallRequest)

Simulate SCT Inst recall

Simulate a recall for an instantaneous SEPA Credit Transfer.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.RecallsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        RecallsApi apiInstance = new RecallsApi(defaultClient);
        SimulateSctInstRecallRequest simulateSctInstRecallRequest = new SimulateSctInstRecallRequest(); // SimulateSctInstRecallRequest | 
        try {
            SimulateSctInstRecall201Response result = apiInstance.simulateSctInstRecall(simulateSctInstRecallRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecallsApi#simulateSctInstRecall");
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
| **simulateSctInstRecallRequest** | [**SimulateSctInstRecallRequest**](SimulateSctInstRecallRequest.md)|  | [optional] |

### Return type

[**SimulateSctInstRecall201Response**](SimulateSctInstRecall201Response.md)

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
| **0** | Unexpected error |  -  |

