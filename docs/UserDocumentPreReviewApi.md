# UserDocumentPreReviewApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteKYCDocumentcument**](UserDocumentPreReviewApi.md#deleteKYCDocumentcument) | **DELETE** /core-connect/kyc/documents/{documentId} | Delete Pre-review Document |
| [**getKYCDocuments**](UserDocumentPreReviewApi.md#getKYCDocuments) | **GET** /core-connect/users/{userId}/kyc/document | Search Pre-review Documents |
| [**getKYCDocumentsToReview**](UserDocumentPreReviewApi.md#getKYCDocumentsToReview) | **GET** /core-connect/kyc/documents/need-review | Search Documents to pre-review |
| [**getPreSignedKycForm**](UserDocumentPreReviewApi.md#getPreSignedKycForm) | **POST** /core-connect/users/{userId}/kyc/document | Create Upload Document Form |
| [**getPresignedUrlDocument**](UserDocumentPreReviewApi.md#getPresignedUrlDocument) | **GET** /core-connect/kyc/documents/{documentId}/preview | Get Download URL |
| [**updateDocument**](UserDocumentPreReviewApi.md#updateDocument) | **PUT** /core-connect/kyc/documents/{documentId}/status | Pre-review Document |



## deleteKYCDocumentcument

> UpdateDocument200Response deleteKYCDocumentcument(documentId)

Delete Pre-review Document

Delete a pre-review document.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.UserDocumentPreReviewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UserDocumentPreReviewApi apiInstance = new UserDocumentPreReviewApi(defaultClient);
        UUID documentId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479"); // UUID | The unique identifier of the Document (UUID).
        try {
            UpdateDocument200Response result = apiInstance.deleteKYCDocumentcument(documentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserDocumentPreReviewApi#deleteKYCDocumentcument");
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
| **documentId** | **UUID**| The unique identifier of the Document (UUID). | |

### Return type

[**UpdateDocument200Response**](UpdateDocument200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## getKYCDocuments

> List&lt;GetKYCDocuments200ResponseInner&gt; getKYCDocuments(userId)

Search Pre-review Documents

Retrieve all pre-review documents for given user

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.UserDocumentPreReviewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UserDocumentPreReviewApi apiInstance = new UserDocumentPreReviewApi(defaultClient);
        Integer userId = 12345; // Integer | The unique identifier of the User.
        try {
            List<GetKYCDocuments200ResponseInner> result = apiInstance.getKYCDocuments(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserDocumentPreReviewApi#getKYCDocuments");
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

### Return type

[**List&lt;GetKYCDocuments200ResponseInner&gt;**](GetKYCDocuments200ResponseInner.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## getKYCDocumentsToReview

> List&lt;UpdateDocument200Response&gt; getKYCDocumentsToReview()

Search Documents to pre-review

Retrieve all pre-review documents to review. This endpoint is for [Onboarded Users](/api-reference/api-endpoints.html#tag/User%20Onboarding) only. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.UserDocumentPreReviewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UserDocumentPreReviewApi apiInstance = new UserDocumentPreReviewApi(defaultClient);
        try {
            List<UpdateDocument200Response> result = apiInstance.getKYCDocumentsToReview();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserDocumentPreReviewApi#getKYCDocumentsToReview");
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

[**List&lt;UpdateDocument200Response&gt;**](UpdateDocument200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## getPreSignedKycForm

> GetPreSignedKycForm200Response getPreSignedKycForm(userId, getPreSignedKycFormRequest)

Create Upload Document Form

Generate a pre-signed form to upload documents for pre-review. Expires after 5 minutes.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.UserDocumentPreReviewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UserDocumentPreReviewApi apiInstance = new UserDocumentPreReviewApi(defaultClient);
        String userId = "12345"; // String | The unique identifier of the User.
        GetPreSignedKycFormRequest getPreSignedKycFormRequest = new GetPreSignedKycFormRequest(); // GetPreSignedKycFormRequest | 
        try {
            GetPreSignedKycForm200Response result = apiInstance.getPreSignedKycForm(userId, getPreSignedKycFormRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserDocumentPreReviewApi#getPreSignedKycForm");
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
| **userId** | **String**| The unique identifier of the User. | |
| **getPreSignedKycFormRequest** | [**GetPreSignedKycFormRequest**](GetPreSignedKycFormRequest.md)|  | [optional] |

### Return type

[**GetPreSignedKycForm200Response**](GetPreSignedKycForm200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |


## getPresignedUrlDocument

> GetPresignedUrlDocument200Response getPresignedUrlDocument(documentId)

Get Download URL

Retrieve the pre-signed URL to download the pre-review document.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.UserDocumentPreReviewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UserDocumentPreReviewApi apiInstance = new UserDocumentPreReviewApi(defaultClient);
        UUID documentId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479"); // UUID | The unique identifier of the Document (UUID).
        try {
            GetPresignedUrlDocument200Response result = apiInstance.getPresignedUrlDocument(documentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserDocumentPreReviewApi#getPresignedUrlDocument");
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
| **documentId** | **UUID**| The unique identifier of the Document (UUID). | |

### Return type

[**GetPresignedUrlDocument200Response**](GetPresignedUrlDocument200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## updateDocument

> UpdateDocument200Response updateDocument(documentId, updateDocumentRequest)

Pre-review Document

Update the pre-review status and comment of the document.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.UserDocumentPreReviewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UserDocumentPreReviewApi apiInstance = new UserDocumentPreReviewApi(defaultClient);
        UUID documentId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479"); // UUID | The unique identifier of the Document (UUID).
        UpdateDocumentRequest updateDocumentRequest = new UpdateDocumentRequest(); // UpdateDocumentRequest | 
        try {
            UpdateDocument200Response result = apiInstance.updateDocument(documentId, updateDocumentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserDocumentPreReviewApi#updateDocument");
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
| **documentId** | **UUID**| The unique identifier of the Document (UUID). | |
| **updateDocumentRequest** | [**UpdateDocumentRequest**](UpdateDocumentRequest.md)|  | [optional] |

### Return type

[**UpdateDocument200Response**](UpdateDocument200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

