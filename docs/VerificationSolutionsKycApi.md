# VerificationSolutionsKycApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postKycVconf**](VerificationSolutionsKycApi.md#postKycVconf) | **POST** /v1/users/{userId}/videoconference | Initiate Video Conference Verification |
| [**postKycliveness**](VerificationSolutionsKycApi.md#postKycliveness) | **POST** /v1/users/{userId}/kycliveness | Initiate Live Verification |
| [**postKycqes**](VerificationSolutionsKycApi.md#postKycqes) | **POST** /v1/users/{userId}/qes | Initiate QES Verification |
| [**putKycLiveness**](VerificationSolutionsKycApi.md#putKycLiveness) | **PUT** /v1/users/{userId}/kycliveness | Retrieve and Upload Live Verification Result |



## postKycVconf

> PostKycqes201Response postKycVconf(userId, postKycqesRequest)

Initiate Video Conference Verification

Start the [Video conference verification](/guide/user-verification/videoconf.html) process. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.VerificationSolutionsKycApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        VerificationSolutionsKycApi apiInstance = new VerificationSolutionsKycApi(defaultClient);
        Integer userId = 12345; // Integer | The unique identifier of the user.
        PostKycqesRequest postKycqesRequest = new PostKycqesRequest(); // PostKycqesRequest | 
        try {
            PostKycqes201Response result = apiInstance.postKycVconf(userId, postKycqesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerificationSolutionsKycApi#postKycVconf");
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
| **userId** | **Integer**| The unique identifier of the user. | |
| **postKycqesRequest** | [**PostKycqesRequest**](PostKycqesRequest.md)|  | [optional] |

### Return type

[**PostKycqes201Response**](PostKycqes201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **403** | Forbidden |  -  |
| **428** | Precondition Required. |  -  |
| **500** | Internal server error |  -  |
| **0** | Unexpected error |  -  |


## postKycliveness

> PostKycliveness201Response postKycliveness(userId, postKyclivenessRequest)

Initiate Live Verification

Start the Live Verficiation process, whether it is KYC Liveness or Certified Video. You may read [the dedicated documentation for this feature](/guide/user-verification/live-verification.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.VerificationSolutionsKycApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        VerificationSolutionsKycApi apiInstance = new VerificationSolutionsKycApi(defaultClient);
        Integer userId = 12345; // Integer | The unique identifier of the user.
        PostKyclivenessRequest postKyclivenessRequest = new PostKyclivenessRequest(); // PostKyclivenessRequest | 
        try {
            PostKycliveness201Response result = apiInstance.postKycliveness(userId, postKyclivenessRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerificationSolutionsKycApi#postKycliveness");
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
| **userId** | **Integer**| The unique identifier of the user. | |
| **postKyclivenessRequest** | [**PostKyclivenessRequest**](PostKyclivenessRequest.md)|  | [optional] |

### Return type

[**PostKycliveness201Response**](PostKycliveness201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Request is invalid i.e., missing userId  |  -  |
| **401** | The Authorization header is missing |  -  |
| **403** | Your agent is not found in our services  |  -  |
| **428** | Specified userId is not found in our services  |  -  |
| **500** | Internal error |  -  |
| **504** | Internal server error: the request did not respond on time  |  -  |
| **0** | Unexpected error |  -  |


## postKycqes

> PostKycqes201Response postKycqes(userId, postKycqesRequest)

Initiate QES Verification

Start the qualified electronic signature (QES) verification.  

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.VerificationSolutionsKycApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        VerificationSolutionsKycApi apiInstance = new VerificationSolutionsKycApi(defaultClient);
        Integer userId = 12345; // Integer | The unique identifier of the user.
        PostKycqesRequest postKycqesRequest = new PostKycqesRequest(); // PostKycqesRequest | 
        try {
            PostKycqes201Response result = apiInstance.postKycqes(userId, postKycqesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerificationSolutionsKycApi#postKycqes");
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
| **userId** | **Integer**| The unique identifier of the user. | |
| **postKycqesRequest** | [**PostKycqesRequest**](PostKycqesRequest.md)|  | [optional] |

### Return type

[**PostKycqes201Response**](PostKycqes201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |
| **410** | Gone |  -  |
| **500** | Internal server error |  -  |
| **0** | Unexpected error |  -  |


## putKycLiveness

> Object putKycLiveness(userId)

Retrieve and Upload Live Verification Result

Retrieve the live verification results, and make them available to Treezor. You may read [the dedicated documentation for this feature](/guide/user-verification/live-verification.html) 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.VerificationSolutionsKycApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        VerificationSolutionsKycApi apiInstance = new VerificationSolutionsKycApi(defaultClient);
        Integer userId = 12345; // Integer | The unique identifier of the user.
        try {
            Object result = apiInstance.putKycLiveness(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerificationSolutionsKycApi#putKycLiveness");
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
| **userId** | **Integer**| The unique identifier of the user. | |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 response |  -  |
| **400** | The request is incorrect e.g., missing userId  |  -  |
| **401** | The Authorization header is missing |  -  |
| **403** | Your agent is not found in our services  |  -  |
| **404** | The identification is not found in our services  |  -  |
| **405** | The documents can not be stored in our services  |  -  |
| **406** | The last initiated identification for userId is not in processed state.  |  -  |
| **410** | The identification no longer exists |  -  |
| **504** | Internal server error: the request did not respond on time  |  -  |
| **0** | Unexpected error |  -  |

