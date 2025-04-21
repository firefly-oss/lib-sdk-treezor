# MccRestrictionGroupsApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteMccRestrictionGroups**](MccRestrictionGroupsApi.md#deleteMccRestrictionGroups) | **DELETE** /v1/mccRestrictionGroups/{id} | Cancel MCC Restriction Group |
| [**getMccRestrictionGroups**](MccRestrictionGroupsApi.md#getMccRestrictionGroups) | **GET** /v1/mccRestrictionGroups | Search MCC Restriction Groups |
| [**getMccRestrictionGroupsId**](MccRestrictionGroupsApi.md#getMccRestrictionGroupsId) | **GET** /v1/mccRestrictionGroups/{id} | Get MCC Restriction Group |
| [**postMccRestrictionGroup**](MccRestrictionGroupsApi.md#postMccRestrictionGroup) | **POST** /v1/mccRestrictionGroups | Create MCC Restriction Group |
| [**putMccRestrictionGroups**](MccRestrictionGroupsApi.md#putMccRestrictionGroups) | **PUT** /v1/mccRestrictionGroups/{id} | Update MCC Restriction Group |



## deleteMccRestrictionGroups

> DeleteMccRestrictionGroups200Response deleteMccRestrictionGroups(id, fields)

Cancel MCC Restriction Group

Cancel a MCC restriction group.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MccRestrictionGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        MccRestrictionGroupsApi apiInstance = new MccRestrictionGroupsApi(defaultClient);
        Long id = 12345L; // Long | The unique identifier of the MCC restriction Group.
        List<String> fields = Arrays.asList(); // List<String> | List of the object properties to be returned, allowing you to filter the response payload.
        try {
            DeleteMccRestrictionGroups200Response result = apiInstance.deleteMccRestrictionGroups(id, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MccRestrictionGroupsApi#deleteMccRestrictionGroups");
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
| **id** | **Long**| The unique identifier of the MCC restriction Group. | |
| **fields** | [**List&lt;String&gt;**](String.md)| List of the object properties to be returned, allowing you to filter the response payload. | [optional] |

### Return type

[**DeleteMccRestrictionGroups200Response**](DeleteMccRestrictionGroups200Response.md)

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


## getMccRestrictionGroups

> GetMccRestrictionGroups200Response getMccRestrictionGroups(accessTag, fields, filter, pageNumber, pageCount, sortBy, sortOrder)

Search MCC Restriction Groups

Retrieve MCC Restriction Groups that match search criteria. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MccRestrictionGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        MccRestrictionGroupsApi apiInstance = new MccRestrictionGroupsApi(defaultClient);
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        List<String> fields = Arrays.asList(); // List<String> | List of the object properties to be returned, allowing you to filter the response payload.
        String filter = "filter_example"; // String | You can filter the API response by using filter(s). Filterable fields are:   - id   - name   - isWhitelist   - status   - startDate   - createdDate  Filters should be separated by a \";\". Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax: \"fieldName criterion expression\", where: * fieldName: the name of a filterable field of this object. * expression: the values to be included or excluded (see table below) * criterion: a filter criterion.  Here are the possible values for criterion:    | Criteria |         Description    |                   Type                   | Expression Example |   |----------|------------------------|------------------------------------------|--------------------|   |     >    |      greater than      |            alphanumeric string           |         100        |   |    >=    | greater or equal than  |            alphanumeric string           |         100        |   |     <    |        less than       |            alphanumeric string           |         100        |   |    <=    |   less or equal than   |            alphanumeric string           |         100        |   |    !=    |      not equal to      |            alphanumeric string           |         100        |   |   like   |          like          |            alphanumeric string           |         100        |   |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |   |    ==    |         equals         |            alphanumeric string           |         100        | 
        Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
        Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints   
        String sortBy = "createdDate"; // String | The transaction element you want to sort the list with. 
        String sortOrder = "DESC"; // String | The order you want to sort the list. 
        try {
            GetMccRestrictionGroups200Response result = apiInstance.getMccRestrictionGroups(accessTag, fields, filter, pageNumber, pageCount, sortBy, sortOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MccRestrictionGroupsApi#getMccRestrictionGroups");
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
| **filter** | **String**| You can filter the API response by using filter(s). Filterable fields are:   - id   - name   - isWhitelist   - status   - startDate   - createdDate  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax: \&quot;fieldName criterion expression\&quot;, where: * fieldName: the name of a filterable field of this object. * expression: the values to be included or excluded (see table below) * criterion: a filter criterion.  Here are the possible values for criterion:    | Criteria |         Description    |                   Type                   | Expression Example |   |----------|------------------------|------------------------------------------|--------------------|   |     &gt;    |      greater than      |            alphanumeric string           |         100        |   |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |   |     &lt;    |        less than       |            alphanumeric string           |         100        |   |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |   |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |   |   like   |          like          |            alphanumeric string           |         100        |   |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |   |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        |  | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints    | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with.  | [optional] [default to createdDate] |
| **sortOrder** | **String**| The order you want to sort the list.  | [optional] [default to DESC] [enum: DESC, ASC] |

### Return type

[**GetMccRestrictionGroups200Response**](GetMccRestrictionGroups200Response.md)

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


## getMccRestrictionGroupsId

> GetMccRestrictionGroupsId200Response getMccRestrictionGroupsId(id, fields)

Get MCC Restriction Group

Retrieve a MCC Group based on its &#x60;id&#x60;.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MccRestrictionGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        MccRestrictionGroupsApi apiInstance = new MccRestrictionGroupsApi(defaultClient);
        Long id = 12345L; // Long | The unique identifier of the MCC Restriction Group.
        List<String> fields = Arrays.asList(); // List<String> | List of the object properties to be returned, allowing you to filter the response payload.
        try {
            GetMccRestrictionGroupsId200Response result = apiInstance.getMccRestrictionGroupsId(id, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MccRestrictionGroupsApi#getMccRestrictionGroupsId");
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
| **id** | **Long**| The unique identifier of the MCC Restriction Group. | |
| **fields** | [**List&lt;String&gt;**](String.md)| List of the object properties to be returned, allowing you to filter the response payload. | [optional] |

### Return type

[**GetMccRestrictionGroupsId200Response**](GetMccRestrictionGroupsId200Response.md)

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


## postMccRestrictionGroup

> PostMccRestrictionGroup200Response postMccRestrictionGroup(fields, postMccRestrictionGroupRequest)

Create MCC Restriction Group

Create a new Merchant Category Code (MCC) restriction group.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MccRestrictionGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        MccRestrictionGroupsApi apiInstance = new MccRestrictionGroupsApi(defaultClient);
        List<String> fields = Arrays.asList(); // List<String> | List of the object properties to be returned, allowing you to filter the response payload.
        PostMccRestrictionGroupRequest postMccRestrictionGroupRequest = new PostMccRestrictionGroupRequest(); // PostMccRestrictionGroupRequest | 
        try {
            PostMccRestrictionGroup200Response result = apiInstance.postMccRestrictionGroup(fields, postMccRestrictionGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MccRestrictionGroupsApi#postMccRestrictionGroup");
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
| **fields** | [**List&lt;String&gt;**](String.md)| List of the object properties to be returned, allowing you to filter the response payload. | [optional] |
| **postMccRestrictionGroupRequest** | [**PostMccRestrictionGroupRequest**](PostMccRestrictionGroupRequest.md)|  | [optional] |

### Return type

[**PostMccRestrictionGroup200Response**](PostMccRestrictionGroup200Response.md)

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


## putMccRestrictionGroups

> PutMccRestrictionGroups200Response putMccRestrictionGroups(id, putMccRestrictionGroupsRequest)

Update MCC Restriction Group

Edit a MCC Restriction group.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MccRestrictionGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        MccRestrictionGroupsApi apiInstance = new MccRestrictionGroupsApi(defaultClient);
        Integer id = 12345; // Integer | The unique identifier of the MCC Restriction Group.
        PutMccRestrictionGroupsRequest putMccRestrictionGroupsRequest = new PutMccRestrictionGroupsRequest(); // PutMccRestrictionGroupsRequest | 
        try {
            PutMccRestrictionGroups200Response result = apiInstance.putMccRestrictionGroups(id, putMccRestrictionGroupsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MccRestrictionGroupsApi#putMccRestrictionGroups");
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
| **id** | **Integer**| The unique identifier of the MCC Restriction Group. | |
| **putMccRestrictionGroupsRequest** | [**PutMccRestrictionGroupsRequest**](PutMccRestrictionGroupsRequest.md)|  | [optional] |

### Return type

[**PutMccRestrictionGroups200Response**](PutMccRestrictionGroups200Response.md)

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

