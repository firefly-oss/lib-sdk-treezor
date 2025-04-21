# UserTaxResidencesApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTaxresidence**](UserTaxResidencesApi.md#deleteTaxresidence) | **DELETE** /v1/taxResidences/{taxResidenceId} | Delete a residence |
| [**getTaxresidence**](UserTaxResidencesApi.md#getTaxresidence) | **GET** /v1/taxResidences/{taxResidenceId} | Get Tax Residence |
| [**getTaxresidences**](UserTaxResidencesApi.md#getTaxresidences) | **GET** /v1/taxResidences | Search Tax Residences |
| [**postTaxresidence**](UserTaxResidencesApi.md#postTaxresidence) | **POST** /v1/taxResidences | Create Tax Residence |
| [**putTaxresidence**](UserTaxResidencesApi.md#putTaxresidence) | **PUT** /v1/taxResidences/{taxResidenceId} | Update Tax Residence |



## deleteTaxresidence

> TaxResidenceObject deleteTaxresidence(taxResidenceId)

Delete a residence

Delete a residence that match id

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.UserTaxResidencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UserTaxResidencesApi apiInstance = new UserTaxResidencesApi(defaultClient);
        Integer taxResidenceId = 12345; // Integer | The unique identifier of the Tax Residence
        try {
            TaxResidenceObject result = apiInstance.deleteTaxresidence(taxResidenceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserTaxResidencesApi#deleteTaxresidence");
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
| **taxResidenceId** | **Integer**| The unique identifier of the Tax Residence | |

### Return type

[**TaxResidenceObject**](TaxResidenceObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## getTaxresidence

> TaxResidenceObject getTaxresidence(taxResidenceId)

Get Tax Residence

Retrieve a Tax Residence based on its &#x60;id&#x60;.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.UserTaxResidencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UserTaxResidencesApi apiInstance = new UserTaxResidencesApi(defaultClient);
        Integer taxResidenceId = 12345; // Integer | The unique identifier of the TaxResidence.
        try {
            TaxResidenceObject result = apiInstance.getTaxresidence(taxResidenceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserTaxResidencesApi#getTaxresidence");
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
| **taxResidenceId** | **Integer**| The unique identifier of the TaxResidence. | |

### Return type

[**TaxResidenceObject**](TaxResidenceObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## getTaxresidences

> TaxResidenceObject getTaxresidences(taxResidenceId, userId, pageNumber, pageCount, sortBy, sortOrder)

Search Tax Residences

Retrieve Tax Residences that match your search conditions.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.UserTaxResidencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UserTaxResidencesApi apiInstance = new UserTaxResidencesApi(defaultClient);
        Integer taxResidenceId = 12345; // Integer | The unique identifier of the Tax Residence.
        Integer userId = 12345; // Integer | The unique identifier of the User.
        Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
        Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints   
        String sortBy = "createdDate"; // String | The transaction element you want to sort the list with. 
        String sortOrder = "ASC"; // String | The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
        try {
            TaxResidenceObject result = apiInstance.getTaxresidences(taxResidenceId, userId, pageNumber, pageCount, sortBy, sortOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserTaxResidencesApi#getTaxresidences");
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
| **taxResidenceId** | **Integer**| The unique identifier of the Tax Residence. | [optional] |
| **userId** | **Integer**| The unique identifier of the User. | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints    | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with.  | [optional] [default to createdDate] |
| **sortOrder** | **String**| The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending.  | [optional] [default to DESC] [enum: ASC, DESC] |

### Return type

[**TaxResidenceObject**](TaxResidenceObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## postTaxresidence

> TaxResidenceObject postTaxresidence(postTaxresidenceRequest)

Create Tax Residence

Create a new Tax Residence.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.UserTaxResidencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UserTaxResidencesApi apiInstance = new UserTaxResidencesApi(defaultClient);
        PostTaxresidenceRequest postTaxresidenceRequest = new PostTaxresidenceRequest(); // PostTaxresidenceRequest | 
        try {
            TaxResidenceObject result = apiInstance.postTaxresidence(postTaxresidenceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserTaxResidencesApi#postTaxresidence");
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
| **postTaxresidenceRequest** | [**PostTaxresidenceRequest**](PostTaxresidenceRequest.md)|  | [optional] |

### Return type

[**TaxResidenceObject**](TaxResidenceObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## putTaxresidence

> TaxResidenceObject putTaxresidence(taxResidenceId, putTaxresidenceRequest)

Update Tax Residence

Modify an existing Tax Residence.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.UserTaxResidencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UserTaxResidencesApi apiInstance = new UserTaxResidencesApi(defaultClient);
        Integer taxResidenceId = 12345; // Integer | The unique identifier of the TaxResidence
        PutTaxresidenceRequest putTaxresidenceRequest = new PutTaxresidenceRequest(); // PutTaxresidenceRequest | 
        try {
            TaxResidenceObject result = apiInstance.putTaxresidence(taxResidenceId, putTaxresidenceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserTaxResidencesApi#putTaxresidence");
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
| **taxResidenceId** | **Integer**| The unique identifier of the TaxResidence | |
| **putTaxresidenceRequest** | [**PutTaxresidenceRequest**](PutTaxresidenceRequest.md)|  | [optional] |

### Return type

[**TaxResidenceObject**](TaxResidenceObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |

