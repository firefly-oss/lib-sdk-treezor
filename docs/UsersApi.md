# UsersApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /v1/users/{userId} | Disable User |
| [**getUser**](UsersApi.md#getUser) | **GET** /v1/users/{userId} | Get User |
| [**getUsers**](UsersApi.md#getUsers) | **GET** /v1/users | Search Users |
| [**postUsers**](UsersApi.md#postUsers) | **POST** /v1/users | Create User |
| [**putUser**](UsersApi.md#putUser) | **PUT** /v1/users/{userId} | Update User |



## deleteUser

> UserObject deleteUser(userId, origin, accessTag)

Disable User

Update the user Status to &#x60;CANCELED&#x60;. See the [Deletion](/guide/users/modifications.html#deletion) article for more information. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        Integer userId = 12345; // Integer | The unique identifier of the User.
        String origin = "origin_example"; // String | The origin of the request for cancelling the User, which can be one of the following:  * `OPERATOR` – When you are at the origin of the deactivation. * `USER` – When the end user is at the origin of the deactivation. 
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        try {
            UserObject result = apiInstance.deleteUser(userId, origin, accessTag);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#deleteUser");
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
| **userId** | **Integer**| The unique identifier of the User. | |
| **origin** | **String**| The origin of the request for cancelling the User, which can be one of the following:  * &#x60;OPERATOR&#x60; – When you are at the origin of the deactivation. * &#x60;USER&#x60; – When the end user is at the origin of the deactivation.  | |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  | [optional] |

### Return type

[**UserObject**](UserObject.md)

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
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## getUser

> UserObject getUser(userId, accessTag)

Get User

Retrieve user&#39;s information for given user&#39;s &#x60;id&#x60;.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        Integer userId = 12345; // Integer | The unique identifier of the User.
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        try {
            UserObject result = apiInstance.getUser(userId, accessTag);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUser");
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
| **userId** | **Integer**| The unique identifier of the User. | |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  | [optional] |

### Return type

[**UserObject**](UserObject.md)

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


## getUsers

> UserObject getUsers(accessTag, userId, userTypeId, userStatus, userTag, specifiedUSPerson, controllingPersonType, employeeType, email, name, legalName, parentUserId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo)

Search Users

Retrieve Users matching your search criteria.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        Integer userId = 12345; // Integer | The unique identifier of the User.
        Integer userTypeId = 1; // Integer | The type of the user.
        String userStatus = "CANCELED"; // String | The status of the user.
        String userTag = "userTag_example"; // String | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Max length: 250 characters.  Format: hc characters and `/` `!` `-` `_` `.` `*` `'` `(` `)` 
        Integer specifiedUSPerson = 56; // Integer | You may read more about who is considered a US Person in the [dedicated article](/guide/user-verification/tax-residence.html#the-specific-case-of-us-taxpayers). 
        Integer controllingPersonType = 56; // Integer | Type of relationship
        Integer employeeType = 56; // Integer | Type of user's role
        String email = "email_example"; // String | User's email address (must be valid).
        String name = "name_example"; // String | Name of the user.
        String legalName = "legalName_example"; // String | Business name
        String parentUserId = "parentUserId_example"; // String | Unique identifier of the parent of the user.
        Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
        Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints   
        String sortBy = "createdDate"; // String | The transaction element you want to sort the list with. 
        String sortOrder = "ASC"; // String | The order you want to sort the list. 
        OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result.  Format: `YYYY-MM-DD HH:mm:ss` 
        OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result.  Format: `YYYY-MM-DD HH:mm:ss` 
        OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result.   Format: `YYYY-MM-DD HH:mm:ss`.  
        OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result.   Format: `YYYY-MM-DD HH:mm:ss`.  
        try {
            UserObject result = apiInstance.getUsers(accessTag, userId, userTypeId, userStatus, userTag, specifiedUSPerson, controllingPersonType, employeeType, email, name, legalName, parentUserId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUsers");
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
| **userId** | **Integer**| The unique identifier of the User. | [optional] |
| **userTypeId** | **Integer**| The type of the user. | [optional] [enum: 1, 2, 3, 4] |
| **userStatus** | **String**| The status of the user. | [optional] [enum: CANCELED, PENDING, VALIDATED] |
| **userTag** | **String**| Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Max length: 250 characters.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  | [optional] |
| **specifiedUSPerson** | **Integer**| You may read more about who is considered a US Person in the [dedicated article](/guide/user-verification/tax-residence.html#the-specific-case-of-us-taxpayers).  | [optional] |
| **controllingPersonType** | **Integer**| Type of relationship | [optional] |
| **employeeType** | **Integer**| Type of user&#39;s role | [optional] |
| **email** | **String**| User&#39;s email address (must be valid). | [optional] |
| **name** | **String**| Name of the user. | [optional] |
| **legalName** | **String**| Business name | [optional] |
| **parentUserId** | **String**| Unique identifier of the parent of the user. | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints    | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with.  | [optional] [default to createdDate] |
| **sortOrder** | **String**| The order you want to sort the list.  | [optional] [default to DESC] [enum: ASC, DESC] |
| **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  | [optional] |
| **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  | [optional] |
| **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.   | [optional] |
| **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.   | [optional] |

### Return type

[**UserObject**](UserObject.md)

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
| **405** | Method Not Allowed |  -  |
| **0** | Unexpected error |  -  |


## postUsers

> UserObject postUsers(postUsersRequest)

Create User

You may read [the dedicated documentation for this feature](/guide/users/introduction.html#creation) 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        PostUsersRequest postUsersRequest = new PostUsersRequest(); // PostUsersRequest | 
        try {
            UserObject result = apiInstance.postUsers(postUsersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#postUsers");
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
| **postUsersRequest** | [**PostUsersRequest**](PostUsersRequest.md)|  | [optional] |

### Return type

[**UserObject**](UserObject.md)

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


## putUser

> UserObject putUser(userId, putUserRequest)

Update User

Update information regarding the User.  This endpoint may require per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        Integer userId = 12345; // Integer | The unique identifier of the User.
        PutUserRequest putUserRequest = new PutUserRequest(); // PutUserRequest | 
        try {
            UserObject result = apiInstance.putUser(userId, putUserRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#putUser");
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
| **userId** | **Integer**| The unique identifier of the User. | |
| **putUserRequest** | [**PutUserRequest**](PutUserRequest.md)|  | [optional] |

### Return type

[**UserObject**](UserObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: applicationcjson, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **405** | Method Not Allowed |  -  |
| **0** | Unexpected error |  -  |

