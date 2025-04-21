# CardsBulkCreationApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBulkCard**](CardsBulkCreationApi.md#getBulkCard) | **GET** /core-connect/card/bulk | Get Bulk Card Order |
| [**getCardBulkReport**](CardsBulkCreationApi.md#getCardBulkReport) | **GET** /core-connect/card/bulk/{id}/report | Get Report |
| [**postBulkCard**](CardsBulkCreationApi.md#postBulkCard) | **POST** /core-connect/card/bulk | Create Bulk Card Order |



## getBulkCard

> GetBulkCard200Response getBulkCard()

Get Bulk Card Order

Search bulk card orders.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsBulkCreationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsBulkCreationApi apiInstance = new CardsBulkCreationApi(defaultClient);
        try {
            GetBulkCard200Response result = apiInstance.getBulkCard();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsBulkCreationApi#getBulkCard");
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

[**GetBulkCard200Response**](GetBulkCard200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |


## getCardBulkReport

> GetCardBulkReport200Response getCardBulkReport(id)

Get Report

Get a link to download the bulk card creation report.  The link expires after 5 minutes. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsBulkCreationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsBulkCreationApi apiInstance = new CardsBulkCreationApi(defaultClient);
        UUID id = UUID.fromString("4b76d52b-72a5-4a18-a134-8e8e78d1284a"); // UUID | The unique identifier of the card bulk creation.
        try {
            GetCardBulkReport200Response result = apiInstance.getCardBulkReport(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsBulkCreationApi#getCardBulkReport");
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
| **id** | **UUID**| The unique identifier of the card bulk creation. | |

### Return type

[**GetCardBulkReport200Response**](GetCardBulkReport200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |


## postBulkCard

> PostBulkCard201Response postBulkCard(postBulkCardRequest)

Create Bulk Card Order

Create a Bulk Card order to create multiple cards at once.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsBulkCreationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsBulkCreationApi apiInstance = new CardsBulkCreationApi(defaultClient);
        PostBulkCardRequest postBulkCardRequest = new PostBulkCardRequest(); // PostBulkCardRequest | 
        try {
            PostBulkCard201Response result = apiInstance.postBulkCard(postBulkCardRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsBulkCreationApi#postBulkCard");
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
| **postBulkCardRequest** | [**PostBulkCardRequest**](PostBulkCardRequest.md)|  | [optional] |

### Return type

[**PostBulkCard201Response**](PostBulkCard201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **0** | Unexpected error |  -  |

