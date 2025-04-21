# MidListsMdcApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addMdcMidListCode**](MidListsMdcApi.md#addMdcMidListCode) | **PUT** /v1/mdc/midLists/{id}/merchantIds/{mid} | Add MID to MID List |
| [**checkMdcMidListCode**](MidListsMdcApi.md#checkMdcMidListCode) | **GET** /v1/mdc/midLists/{id}/merchantIds/{mid} | Check MID Presence |
| [**deleteMdcMidList**](MidListsMdcApi.md#deleteMdcMidList) | **DELETE** /v1/mdc/midLists/{id} | Delete MerchantId List |
| [**getMdcMidLists**](MidListsMdcApi.md#getMdcMidLists) | **GET** /v1/mdc/midLists | Get all MID Lists |
| [**getMidMccList**](MidListsMdcApi.md#getMidMccList) | **GET** /v1/mdc/midLists/{id} | Get MID List |
| [**importMdcMidListCodes**](MidListsMdcApi.md#importMdcMidListCodes) | **POST** /v1/mdc/midLists/{id}/merchantIds | Import MIDs |
| [**postMdcMidList**](MidListsMdcApi.md#postMdcMidList) | **POST** /v1/mdc/midLists | Create Merchant Id List |
| [**removeMdcMidListCode**](MidListsMdcApi.md#removeMdcMidListCode) | **DELETE** /v1/mdc/midLists/{id}/merchantIds/{mid} | Remove MCC from List |
| [**updateMdcMidList**](MidListsMdcApi.md#updateMdcMidList) | **PUT** /v1/mdc/midLists/{id} | Update MerchantId List |



## addMdcMidListCode

> addMdcMidListCode(id, mid)

Add MID to MID List

Add the MID in the Merchant Id list.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MidListsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");

        MidListsMdcApi apiInstance = new MidListsMdcApi(defaultClient);
        UUID id = UUID.fromString("7b447d57-414f-401f-a9a0-f2789a55f966"); // UUID | The unique identifier of the MID List.
        String mid = "173490000000001"; // String | The merchant id.
        try {
            apiInstance.addMdcMidListCode(id, mid);
        } catch (ApiException e) {
            System.err.println("Exception when calling MidListsMdcApi#addMdcMidListCode");
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
| **id** | **UUID**| The unique identifier of the MID List. | |
| **mid** | **String**| The merchant id. | |

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
| **204** | MerchantId added to list |  -  |


## checkMdcMidListCode

> checkMdcMidListCode(id, mid)

Check MID Presence

Check in the MCC is included in the MCC List.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MidListsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");

        MidListsMdcApi apiInstance = new MidListsMdcApi(defaultClient);
        UUID id = UUID.fromString("7b447d57-414f-401f-a9a0-f2789a55f966"); // UUID | The unique identifier of the MID List.
        String mid = "173490000000001"; // String | The merchant id.
        try {
            apiInstance.checkMdcMidListCode(id, mid);
        } catch (ApiException e) {
            System.err.println("Exception when calling MidListsMdcApi#checkMdcMidListCode");
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
| **id** | **UUID**| The unique identifier of the MID List. | |
| **mid** | **String**| The merchant id. | |

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
| **204** | The MerchantId is in the list |  -  |


## deleteMdcMidList

> deleteMdcMidList(id)

Delete MerchantId List

Delete a Merchant Id List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MidListsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");

        MidListsMdcApi apiInstance = new MidListsMdcApi(defaultClient);
        UUID id = UUID.fromString("7b447d57-414f-401f-a9a0-f2789a55f966"); // UUID | The unique identifier of the MID List.
        try {
            apiInstance.deleteMdcMidList(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling MidListsMdcApi#deleteMdcMidList");
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
| **id** | **UUID**| The unique identifier of the MID List. | |

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


## getMdcMidLists

> MerchantIdLists getMdcMidLists(nextPageToken)

Get all MID Lists

Retrieve all the Merchant Id Lists for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MidListsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");

        MidListsMdcApi apiInstance = new MidListsMdcApi(defaultClient);
        String nextPageToken = "nextPageToken_example"; // String | The pagination cursor to use as a query parameter to get to the next page of results.
        try {
            MerchantIdLists result = apiInstance.getMdcMidLists(nextPageToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MidListsMdcApi#getMdcMidLists");
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

[**MerchantIdLists**](MerchantIdLists.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getMidMccList

> MerchantIdList getMidMccList(id)

Get MID List

Retrieve a Merchant Id List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature based on its &#x60;id&#x60;. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MidListsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");

        MidListsMdcApi apiInstance = new MidListsMdcApi(defaultClient);
        UUID id = UUID.fromString("7b447d57-414f-401f-a9a0-f2789a55f966"); // UUID | The unique identifier of the MID List.
        try {
            MerchantIdList result = apiInstance.getMidMccList(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MidListsMdcApi#getMidMccList");
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
| **id** | **UUID**| The unique identifier of the MID List. | |

### Return type

[**MerchantIdList**](MerchantIdList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | Success |  -  |


## importMdcMidListCodes

> importMdcMidListCodes(id, importMdcMidListCodesRequest)

Import MIDs

Import MCC values asynchronously into a Merchant Category Code Lists for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MidListsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");

        MidListsMdcApi apiInstance = new MidListsMdcApi(defaultClient);
        UUID id = UUID.fromString("7b447d57-414f-401f-a9a0-f2789a55f966"); // UUID | The unique identifier of the MID List.
        ImportMdcMidListCodesRequest importMdcMidListCodesRequest = new ImportMdcMidListCodesRequest(); // ImportMdcMidListCodesRequest | 
        try {
            apiInstance.importMdcMidListCodes(id, importMdcMidListCodesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MidListsMdcApi#importMdcMidListCodes");
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
| **id** | **UUID**| The unique identifier of the MID List. | |
| **importMdcMidListCodesRequest** | [**ImportMdcMidListCodesRequest**](ImportMdcMidListCodesRequest.md)|  | |

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


## postMdcMidList

> MerchantIdList postMdcMidList(postMdcMidListRequest)

Create Merchant Id List

Create a list of Merchant Ids for the [Multi-Criteria Dynamic Card (MDC)](/guide/cards/transactions-rules-engine.html) feature. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MidListsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");

        MidListsMdcApi apiInstance = new MidListsMdcApi(defaultClient);
        PostMdcMidListRequest postMdcMidListRequest = new PostMdcMidListRequest(); // PostMdcMidListRequest | 
        try {
            MerchantIdList result = apiInstance.postMdcMidList(postMdcMidListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MidListsMdcApi#postMdcMidList");
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
| **postMdcMidListRequest** | [**PostMdcMidListRequest**](PostMdcMidListRequest.md)|  | [optional] |

### Return type

[**MerchantIdList**](MerchantIdList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | MerchantId List Created |  -  |
| **400** | Bad Request |  -  |


## removeMdcMidListCode

> removeMdcMidListCode(id, mid)

Remove MCC from List

Remove the MID from the MID List.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MidListsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");

        MidListsMdcApi apiInstance = new MidListsMdcApi(defaultClient);
        UUID id = UUID.fromString("7b447d57-414f-401f-a9a0-f2789a55f966"); // UUID | The unique identifier of the MID List.
        String mid = "173490000000001"; // String | The merchant id.
        try {
            apiInstance.removeMdcMidListCode(id, mid);
        } catch (ApiException e) {
            System.err.println("Exception when calling MidListsMdcApi#removeMdcMidListCode");
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
| **id** | **UUID**| The unique identifier of the MID List. | |
| **mid** | **String**| The merchant id. | |

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
| **204** | MerchantId removed from list |  -  |


## updateMdcMidList

> MerchantIdList updateMdcMidList(id, postMdcMidListRequest)

Update MerchantId List

Update a Merchant Id List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MidListsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");

        MidListsMdcApi apiInstance = new MidListsMdcApi(defaultClient);
        UUID id = UUID.fromString("7b447d57-414f-401f-a9a0-f2789a55f966"); // UUID | The unique identifier of the MID List.
        PostMdcMidListRequest postMdcMidListRequest = new PostMdcMidListRequest(); // PostMdcMidListRequest | 
        try {
            MerchantIdList result = apiInstance.updateMdcMidList(id, postMdcMidListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MidListsMdcApi#updateMdcMidList");
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
| **id** | **UUID**| The unique identifier of the MID List. | |
| **postMdcMidListRequest** | [**PostMdcMidListRequest**](PostMdcMidListRequest.md)|  | |

### Return type

[**MerchantIdList**](MerchantIdList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | a MerchantIdList |  -  |

