# MccListsMdcApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addMdcMccListCode**](MccListsMdcApi.md#addMdcMccListCode) | **PUT** /v1/mdc/mccLists/{id}/codes/{mcc} | Add MCC to MCC List |
| [**checkMdcMccListCode**](MccListsMdcApi.md#checkMdcMccListCode) | **GET** /v1/mdc/mccLists/{id}/codes/{mcc} | Check MCC Presence |
| [**deleteMdcMccList**](MccListsMdcApi.md#deleteMdcMccList) | **DELETE** /v1/mdc/mccLists/{id} | Delete MCC List |
| [**getMdcMccList**](MccListsMdcApi.md#getMdcMccList) | **GET** /v1/mdc/mccLists/{id} | Get MCC List |
| [**getMdcMccLists**](MccListsMdcApi.md#getMdcMccLists) | **GET** /v1/mdc/mccLists | Get all MCC Lists |
| [**importMdcMccListCodes**](MccListsMdcApi.md#importMdcMccListCodes) | **POST** /v1/mdc/mccLists/{id}/codes | Import MCCs |
| [**postMdcMccList**](MccListsMdcApi.md#postMdcMccList) | **POST** /v1/mdc/mccLists | Create MCC List |
| [**removeMdcMccListCode**](MccListsMdcApi.md#removeMdcMccListCode) | **DELETE** /v1/mdc/mccLists/{id}/codes/{mcc} | Remove MCC from List |
| [**updateMdcMccList**](MccListsMdcApi.md#updateMdcMccList) | **PUT** /v1/mdc/mccLists/{id} | Update MCC List |



## addMdcMccListCode

> addMdcMccListCode(id, mcc)

Add MCC to MCC List

Add the MCC in the Merchant Category Code list.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MccListsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");

        MccListsMdcApi apiInstance = new MccListsMdcApi(defaultClient);
        UUID id = UUID.fromString("7b447d57-414f-401f-a9a0-f2789a55f966"); // UUID | The unique identifier of the MCC List.
        String mcc = "3009"; // String | The merchant category code.
        try {
            apiInstance.addMdcMccListCode(id, mcc);
        } catch (ApiException e) {
            System.err.println("Exception when calling MccListsMdcApi#addMdcMccListCode");
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
| **id** | **UUID**| The unique identifier of the MCC List. | |
| **mcc** | **String**| The merchant category code. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **204** | MCC added to list |  -  |


## checkMdcMccListCode

> checkMdcMccListCode(id, mcc)

Check MCC Presence

Check in the MCC is included in the MCC List. If not, the API returns an HTTP 404 error.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MccListsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");

        MccListsMdcApi apiInstance = new MccListsMdcApi(defaultClient);
        UUID id = UUID.fromString("7b447d57-414f-401f-a9a0-f2789a55f966"); // UUID | The unique identifier of the MCC List.
        String mcc = "3009"; // String | The merchant category code.
        try {
            apiInstance.checkMdcMccListCode(id, mcc);
        } catch (ApiException e) {
            System.err.println("Exception when calling MccListsMdcApi#checkMdcMccListCode");
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
| **id** | **UUID**| The unique identifier of the MCC List. | |
| **mcc** | **String**| The merchant category code. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **204** | The MCC is in the list |  -  |


## deleteMdcMccList

> deleteMdcMccList(id)

Delete MCC List

Delete a Merchant Category Code List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MccListsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");

        MccListsMdcApi apiInstance = new MccListsMdcApi(defaultClient);
        UUID id = UUID.fromString("ec4896e4-21d3-45ab-8071-68a3b6c88002"); // UUID | The unique identifier of the MCC List.
        try {
            apiInstance.deleteMdcMccList(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling MccListsMdcApi#deleteMdcMccList");
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
| **id** | **UUID**| The unique identifier of the MCC List. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **204** | List successfully removed |  -  |


## getMdcMccList

> MccList getMdcMccList(id)

Get MCC List

Retrieve a Merchant Category Code List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature based on its &#x60;id&#x60;. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MccListsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");

        MccListsMdcApi apiInstance = new MccListsMdcApi(defaultClient);
        UUID id = UUID.fromString("ec4896e4-21d3-45ab-8071-68a3b6c88002"); // UUID | The unique identifier of the MCC List.
        try {
            MccList result = apiInstance.getMdcMccList(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MccListsMdcApi#getMdcMccList");
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
| **id** | **UUID**| The unique identifier of the MCC List. | |

### Return type

[**MccList**](MccList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Not Found |  -  |
| **200** | Success |  -  |


## getMdcMccLists

> MccLists getMdcMccLists(nextPageToken)

Get all MCC Lists

Retrieve all the Merchant Category Code Lists for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MccListsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");

        MccListsMdcApi apiInstance = new MccListsMdcApi(defaultClient);
        String nextPageToken = "nextPageToken_example"; // String | The pagination cursor to use as a query parameter to get to the next page of results.
        try {
            MccLists result = apiInstance.getMdcMccLists(nextPageToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MccListsMdcApi#getMdcMccLists");
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
| **nextPageToken** | **String**| The pagination cursor to use as a query parameter to get to the next page of results. | [optional] |

### Return type

[**MccLists**](MccLists.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |


## importMdcMccListCodes

> importMdcMccListCodes(id, importMdcMccListCodesRequest)

Import MCCs

Import MCC values asynchronously into a Merchant Category Code Lists for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MccListsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");

        MccListsMdcApi apiInstance = new MccListsMdcApi(defaultClient);
        UUID id = UUID.fromString("ec4896e4-21d3-45ab-8071-68a3b6c88002"); // UUID | The unique identifier of the mccList.
        ImportMdcMccListCodesRequest importMdcMccListCodesRequest = new ImportMdcMccListCodesRequest(); // ImportMdcMccListCodesRequest | 
        try {
            apiInstance.importMdcMccListCodes(id, importMdcMccListCodesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MccListsMdcApi#importMdcMccListCodes");
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
| **id** | **UUID**| The unique identifier of the mccList. | |
| **importMdcMccListCodesRequest** | [**ImportMdcMccListCodesRequest**](ImportMdcMccListCodesRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **202** | Import in progress |  -  |


## postMdcMccList

> MccList postMdcMccList(postMdcMccListRequest)

Create MCC List

Create a list of Merchant Category Codes for the [Multi-Criteria Dynamic Card (MDC)](/guide/cards/transactions-rules-engine.html) feature. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MccListsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        MccListsMdcApi apiInstance = new MccListsMdcApi(defaultClient);
        PostMdcMccListRequest postMdcMccListRequest = new PostMdcMccListRequest(); // PostMdcMccListRequest | 
        try {
            MccList result = apiInstance.postMdcMccList(postMdcMccListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MccListsMdcApi#postMdcMccList");
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
| **postMdcMccListRequest** | [**PostMdcMccListRequest**](PostMdcMccListRequest.md)|  | [optional] |

### Return type

[**MccList**](MccList.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | MCC List Created |  -  |
| **400** | Bad Request |  -  |


## removeMdcMccListCode

> removeMdcMccListCode(id, mcc)

Remove MCC from List

Remove the MCC from the MCC List. If the code isn&#39;t in the list, the API returns an HTTP 404 error.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MccListsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");

        MccListsMdcApi apiInstance = new MccListsMdcApi(defaultClient);
        UUID id = UUID.fromString("7b447d57-414f-401f-a9a0-f2789a55f966"); // UUID | The unique identifier of the MCC List.
        String mcc = "3009"; // String | The merchant category code.
        try {
            apiInstance.removeMdcMccListCode(id, mcc);
        } catch (ApiException e) {
            System.err.println("Exception when calling MccListsMdcApi#removeMdcMccListCode");
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
| **id** | **UUID**| The unique identifier of the MCC List. | |
| **mcc** | **String**| The merchant category code. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **204** | MCC removed from list |  -  |


## updateMdcMccList

> MccList updateMdcMccList(id, postMdcMccListRequest)

Update MCC List

Update a Merchant Category Code List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MccListsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");

        MccListsMdcApi apiInstance = new MccListsMdcApi(defaultClient);
        UUID id = UUID.fromString("ec4896e4-21d3-45ab-8071-68a3b6c88002"); // UUID | The unique identifier of the MCC List.
        PostMdcMccListRequest postMdcMccListRequest = new PostMdcMccListRequest(); // PostMdcMccListRequest | 
        try {
            MccList result = apiInstance.updateMdcMccList(id, postMdcMccListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MccListsMdcApi#updateMdcMccList");
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
| **id** | **UUID**| The unique identifier of the MCC List. | |
| **postMdcMccListRequest** | [**PostMdcMccListRequest**](PostMdcMccListRequest.md)|  | |

### Return type

[**MccList**](MccList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | a MCCList |  -  |

