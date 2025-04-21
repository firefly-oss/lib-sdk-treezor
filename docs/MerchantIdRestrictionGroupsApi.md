# MerchantIdRestrictionGroupsApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteMerchantIdRestrictionGroups**](MerchantIdRestrictionGroupsApi.md#deleteMerchantIdRestrictionGroups) | **DELETE** /v1/merchantIdRestrictionGroup/{id} | Cancel MID Restriction Group |
| [**getMerchantIdRestrictionGroup**](MerchantIdRestrictionGroupsApi.md#getMerchantIdRestrictionGroup) | **GET** /v1/merchantIdRestrictionGroups | Search MID Restriction Groups |
| [**postMerchantIdRestrictionGroup**](MerchantIdRestrictionGroupsApi.md#postMerchantIdRestrictionGroup) | **POST** /v1/merchantIdRestrictionGroups | Create MID Restriction Group |
| [**putMerchandidrestrictiongroupsDeltaupdate**](MerchantIdRestrictionGroupsApi.md#putMerchandidrestrictiongroupsDeltaupdate) | **PUT** /v1/merchantIdRestrictionGroups/{id}/DeltaUpdate | Update MID Restriction Group |
| [**putMerchantIdRestrictionGroups**](MerchantIdRestrictionGroupsApi.md#putMerchantIdRestrictionGroups) | **PUT** /v1/merchantIdRestrictionGroup/{id} | (DEPRECATED) Update MID Restriction Group |
| [**putMidrestrictiongroups**](MerchantIdRestrictionGroupsApi.md#putMidrestrictiongroups) | **PUT** /v1/merchantIdRestrictionGroups/{id}/PresenceCheck | Check the presence of merchants IDs list for a restriction group |



## deleteMerchantIdRestrictionGroups

> MerchantIdGroupObject deleteMerchantIdRestrictionGroups(id, fields)

Cancel MID Restriction Group

Cancel a merchant id restriction group.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MerchantIdRestrictionGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        MerchantIdRestrictionGroupsApi apiInstance = new MerchantIdRestrictionGroupsApi(defaultClient);
        Long id = 12345L; // Long | The unique identifier of the Merchant ID restriction group.
        List<String> fields = Arrays.asList(); // List<String> | List of the object properties to be returned, allowing you to filter the response payload.
        try {
            MerchantIdGroupObject result = apiInstance.deleteMerchantIdRestrictionGroups(id, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantIdRestrictionGroupsApi#deleteMerchantIdRestrictionGroups");
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
| **id** | **Long**| The unique identifier of the Merchant ID restriction group. | |
| **fields** | [**List&lt;String&gt;**](String.md)| List of the object properties to be returned, allowing you to filter the response payload. | [optional] |

### Return type

[**MerchantIdGroupObject**](MerchantIdGroupObject.md)

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


## getMerchantIdRestrictionGroup

> MerchantIdGroupObject getMerchantIdRestrictionGroup(accessTag, fields, filter, pageNumber, pageCount, sortBy, sortOrder)

Search MID Restriction Groups

Retrieve Merchant ID Restriction Groups that match search criteria.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MerchantIdRestrictionGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        MerchantIdRestrictionGroupsApi apiInstance = new MerchantIdRestrictionGroupsApi(defaultClient);
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        List<String> fields = Arrays.asList(); // List<String> | List of the object properties to be returned, allowing you to filter the response payload.
        String filter = "filter_example"; // String | You can filter the API response by using filter(s). Filterable fields are:   - id   - name   - isWhitelist   - status   - startDate   - createdDate  Filters should be separated by a \";\". Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax: \"fieldName criterion expression\", where: - fieldName: the name of a filterable field of this object. - expression: the values to be included or excluded (see the table below for more information) - criterion: a filter criterion.  Here are the possible values for criterion:    | Criteria |         Description    |                   Type                   | Expression Example |   |----------|------------------------|------------------------------------------|--------------------|   |     >    |      greater than      |            alphanumeric string           |         100        |   |    >=    | greater or equal than  |            alphanumeric string           |         100        |   |     <    |        less than       |            alphanumeric string           |         100        |   |    <=    |   less or equal than   |            alphanumeric string           |         100        |   |    !=    |      not equal to      |            alphanumeric string           |         100        |   |   like   |          like          |            alphanumeric string           |         100        |   |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |   |    ==    |         equals         |            alphanumeric string           |         100        | 
        Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
        Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints   
        String sortBy = "creationDate"; // String | The transaction element you want to sort the list with. 
        String sortOrder = "DESC"; // String | The order you want to sort the list. 
        try {
            MerchantIdGroupObject result = apiInstance.getMerchantIdRestrictionGroup(accessTag, fields, filter, pageNumber, pageCount, sortBy, sortOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantIdRestrictionGroupsApi#getMerchantIdRestrictionGroup");
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
| **fields** | [**List&lt;String&gt;**](String.md)| List of the object properties to be returned, allowing you to filter the response payload. | [optional] |
| **filter** | **String**| You can filter the API response by using filter(s). Filterable fields are:   - id   - name   - isWhitelist   - status   - startDate   - createdDate  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax: \&quot;fieldName criterion expression\&quot;, where: - fieldName: the name of a filterable field of this object. - expression: the values to be included or excluded (see the table below for more information) - criterion: a filter criterion.  Here are the possible values for criterion:    | Criteria |         Description    |                   Type                   | Expression Example |   |----------|------------------------|------------------------------------------|--------------------|   |     &gt;    |      greater than      |            alphanumeric string           |         100        |   |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |   |     &lt;    |        less than       |            alphanumeric string           |         100        |   |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |   |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |   |   like   |          like          |            alphanumeric string           |         100        |   |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |   |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        |  | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints    | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with.  | [optional] [default to creationDate] |
| **sortOrder** | **String**| The order you want to sort the list.  | [optional] [default to DESC] [enum: DESC, ASC] |

### Return type

[**MerchantIdGroupObject**](MerchantIdGroupObject.md)

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


## postMerchantIdRestrictionGroup

> MerchantIdGroupObject postMerchantIdRestrictionGroup(postMerchantIdRestrictionGroupRequest)

Create MID Restriction Group

Create a new Merchant ID restriction group.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MerchantIdRestrictionGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        MerchantIdRestrictionGroupsApi apiInstance = new MerchantIdRestrictionGroupsApi(defaultClient);
        PostMerchantIdRestrictionGroupRequest postMerchantIdRestrictionGroupRequest = new PostMerchantIdRestrictionGroupRequest(); // PostMerchantIdRestrictionGroupRequest | 
        try {
            MerchantIdGroupObject result = apiInstance.postMerchantIdRestrictionGroup(postMerchantIdRestrictionGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantIdRestrictionGroupsApi#postMerchantIdRestrictionGroup");
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
| **postMerchantIdRestrictionGroupRequest** | [**PostMerchantIdRestrictionGroupRequest**](PostMerchantIdRestrictionGroupRequest.md)|  | [optional] |

### Return type

[**MerchantIdGroupObject**](MerchantIdGroupObject.md)

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


## putMerchandidrestrictiongroupsDeltaupdate

> MerchantIdGroupObject putMerchandidrestrictiongroupsDeltaupdate(id, putMerchandidrestrictiongroupsDeltaupdateRequest)

Update MID Restriction Group

Update the list of Merchant Ids for a MID Restriction Group.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MerchantIdRestrictionGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        MerchantIdRestrictionGroupsApi apiInstance = new MerchantIdRestrictionGroupsApi(defaultClient);
        Integer id = 12345; // Integer | The unique identifier of the Merchant ID restriction group.
        PutMerchandidrestrictiongroupsDeltaupdateRequest putMerchandidrestrictiongroupsDeltaupdateRequest = new PutMerchandidrestrictiongroupsDeltaupdateRequest(); // PutMerchandidrestrictiongroupsDeltaupdateRequest | 
        try {
            MerchantIdGroupObject result = apiInstance.putMerchandidrestrictiongroupsDeltaupdate(id, putMerchandidrestrictiongroupsDeltaupdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantIdRestrictionGroupsApi#putMerchandidrestrictiongroupsDeltaupdate");
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
| **id** | **Integer**| The unique identifier of the Merchant ID restriction group. | |
| **putMerchandidrestrictiongroupsDeltaupdateRequest** | [**PutMerchandidrestrictiongroupsDeltaupdateRequest**](PutMerchandidrestrictiongroupsDeltaupdateRequest.md)|  | [optional] |

### Return type

[**MerchantIdGroupObject**](MerchantIdGroupObject.md)

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


## putMerchantIdRestrictionGroups

> MerchantIdGroupObject putMerchantIdRestrictionGroups(id, putMerchantIdRestrictionGroupsRequest)

(DEPRECATED) Update MID Restriction Group

Deprecated

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MerchantIdRestrictionGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        MerchantIdRestrictionGroupsApi apiInstance = new MerchantIdRestrictionGroupsApi(defaultClient);
        Integer id = 12345; // Integer | The unique identifier of the Merchant Id restriction group.
        PutMerchantIdRestrictionGroupsRequest putMerchantIdRestrictionGroupsRequest = new PutMerchantIdRestrictionGroupsRequest(); // PutMerchantIdRestrictionGroupsRequest | 
        try {
            MerchantIdGroupObject result = apiInstance.putMerchantIdRestrictionGroups(id, putMerchantIdRestrictionGroupsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantIdRestrictionGroupsApi#putMerchantIdRestrictionGroups");
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
| **id** | **Integer**| The unique identifier of the Merchant Id restriction group. | |
| **putMerchantIdRestrictionGroupsRequest** | [**PutMerchantIdRestrictionGroupsRequest**](PutMerchantIdRestrictionGroupsRequest.md)|  | [optional] |

### Return type

[**MerchantIdGroupObject**](MerchantIdGroupObject.md)

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


## putMidrestrictiongroups

> MerchantIdGroupObject putMidrestrictiongroups(id, putMidrestrictiongroupsRequest)

Check the presence of merchants IDs list for a restriction group

Check if Merchant IDs list for a restriction group.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MerchantIdRestrictionGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        MerchantIdRestrictionGroupsApi apiInstance = new MerchantIdRestrictionGroupsApi(defaultClient);
        Integer id = 12345; // Integer | The unique identifier of the Merchant ID restriction group.
        PutMidrestrictiongroupsRequest putMidrestrictiongroupsRequest = new PutMidrestrictiongroupsRequest(); // PutMidrestrictiongroupsRequest | 
        try {
            MerchantIdGroupObject result = apiInstance.putMidrestrictiongroups(id, putMidrestrictiongroupsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantIdRestrictionGroupsApi#putMidrestrictiongroups");
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
| **id** | **Integer**| The unique identifier of the Merchant ID restriction group. | |
| **putMidrestrictiongroupsRequest** | [**PutMidrestrictiongroupsRequest**](PutMidrestrictiongroupsRequest.md)|  | [optional] |

### Return type

[**MerchantIdGroupObject**](MerchantIdGroupObject.md)

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

