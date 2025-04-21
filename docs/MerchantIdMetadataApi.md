# MerchantIdMetadataApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllMidMetadata**](MerchantIdMetadataApi.md#getAllMidMetadata) | **GET** /core-connect/mid/metadata | Get all MID metadata |
| [**getAllMidMetadataBYyGroup**](MerchantIdMetadataApi.md#getAllMidMetadataBYyGroup) | **GET** /core-connect/merchantIdRestrictionGroups/{groupId}/mid/metadata | Get all MID with metadata |
| [**getMidMetadata**](MerchantIdMetadataApi.md#getMidMetadata) | **GET** /core-connect/mid/{mid}/metadata | Get MID Metadata |
| [**postMidMetadata**](MerchantIdMetadataApi.md#postMidMetadata) | **PUT** /core-connect/mid/{mid}/metadata | Store MID Metadata |
| [**putMidMetadata**](MerchantIdMetadataApi.md#putMidMetadata) | **PUT** /core-connect/mid/metadata | Put Bulk metadata |



## getAllMidMetadata

> Object getAllMidMetadata()

Get all MID metadata

Retrieve all MID metadata.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MerchantIdMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        MerchantIdMetadataApi apiInstance = new MerchantIdMetadataApi(defaultClient);
        try {
            Object result = apiInstance.getAllMidMetadata();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantIdMetadataApi#getAllMidMetadata");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**Object**

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


## getAllMidMetadataBYyGroup

> GetAllMidMetadataBYyGroup200Response getAllMidMetadataBYyGroup(groupId, cursor, pageSize)

Get all MID with metadata

Retrieve all Merchant Ids with metadata.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MerchantIdMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        MerchantIdMetadataApi apiInstance = new MerchantIdMetadataApi(defaultClient);
        Integer groupId = 12345; // Integer | group Id
        String cursor = "da4b9237bacccdf19c0760cab7aec4a8359010b0"; // String | Pagination cursor, if you don't pass a cursor, result will start at the first page.
        Integer pageSize = 56; // Integer | Number of results per page.
        try {
            GetAllMidMetadataBYyGroup200Response result = apiInstance.getAllMidMetadataBYyGroup(groupId, cursor, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantIdMetadataApi#getAllMidMetadataBYyGroup");
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
| **groupId** | **Integer**| group Id | |
| **cursor** | **String**| Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page. | [optional] |
| **pageSize** | **Integer**| Number of results per page. | [optional] |

### Return type

[**GetAllMidMetadataBYyGroup200Response**](GetAllMidMetadataBYyGroup200Response.md)

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


## getMidMetadata

> Object getMidMetadata(mid)

Get MID Metadata

Retrieve metadata for a Merchant Id.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MerchantIdMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        MerchantIdMetadataApi apiInstance = new MerchantIdMetadataApi(defaultClient);
        Integer mid = 12345; // Integer | Mid
        try {
            Object result = apiInstance.getMidMetadata(mid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantIdMetadataApi#getMidMetadata");
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
| **mid** | **Integer**| Mid | |

### Return type

**Object**

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
| **404** | Not Found |  -  |


## postMidMetadata

> PostMidMetadata201Response postMidMetadata(mid, body)

Store MID Metadata

Store metadata for a Merchant Id.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MerchantIdMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        MerchantIdMetadataApi apiInstance = new MerchantIdMetadataApi(defaultClient);
        Integer mid = 12345; // Integer | Mid
        Object body = null; // Object | 
        try {
            PostMidMetadata201Response result = apiInstance.postMidMetadata(mid, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantIdMetadataApi#postMidMetadata");
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
| **mid** | **Integer**| Mid | |
| **body** | **Object**|  | [optional] |

### Return type

[**PostMidMetadata201Response**](PostMidMetadata201Response.md)

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
| **404** | Not Found |  -  |


## putMidMetadata

> putMidMetadata(putMidMetadataRequestInner)

Put Bulk metadata

Create or update bulk metadata

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MerchantIdMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        MerchantIdMetadataApi apiInstance = new MerchantIdMetadataApi(defaultClient);
        List<PutMidMetadataRequestInner> putMidMetadataRequestInner = Arrays.asList(); // List<PutMidMetadataRequestInner> | 
        try {
            apiInstance.putMidMetadata(putMidMetadataRequestInner);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantIdMetadataApi#putMidMetadata");
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
| **putMidMetadataRequestInner** | [**List&lt;PutMidMetadataRequestInner&gt;**](PutMidMetadataRequestInner.md)|  | [optional] |

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
| **204** | The resource was updated successfully. |  -  |
| **0** | Unexpected error |  -  |

