# UserDocumentsApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDocuments**](UserDocumentsApi.md#createDocuments) | **POST** /v1/documents | Create Document |
| [**deleteDocument**](UserDocumentsApi.md#deleteDocument) | **DELETE** /v1/documents/{documentId} | Delete Document |
| [**getDocument**](UserDocumentsApi.md#getDocument) | **GET** /v1/documents/{documentId} | Get Document |
| [**getDocumentDownloadUrl**](UserDocumentsApi.md#getDocumentDownloadUrl) | **GET** /v1/documents/{documentId}/download | Get Document Download URL |
| [**getDocuments**](UserDocumentsApi.md#getDocuments) | **GET** /v1/documents | Search Documents |
| [**putDocument**](UserDocumentsApi.md#putDocument) | **PUT** /v1/documents/{documentId} | Update Document |



## createDocuments

> DocumentObject createDocuments(createDocumentsRequest)

Create Document

Create a Document.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.UserDocumentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UserDocumentsApi apiInstance = new UserDocumentsApi(defaultClient);
        CreateDocumentsRequest createDocumentsRequest = new CreateDocumentsRequest(); // CreateDocumentsRequest | 
        try {
            DocumentObject result = apiInstance.createDocuments(createDocumentsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserDocumentsApi#createDocuments");
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
| **createDocumentsRequest** | [**CreateDocumentsRequest**](CreateDocumentsRequest.md)|  | [optional] |

### Return type

[**DocumentObject**](DocumentObject.md)

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


## deleteDocument

> DocumentObject deleteDocument(documentId)

Delete Document

Remove a document.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.UserDocumentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UserDocumentsApi apiInstance = new UserDocumentsApi(defaultClient);
        Long documentId = 12345L; // Long | The unique identifier of the Document.
        try {
            DocumentObject result = apiInstance.deleteDocument(documentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserDocumentsApi#deleteDocument");
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
| **documentId** | **Long**| The unique identifier of the Document. | |

### Return type

[**DocumentObject**](DocumentObject.md)

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


## getDocument

> DocumentObject getDocument(documentId)

Get Document

Retrieve a Document using its &#x60;id&#x60;.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.UserDocumentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UserDocumentsApi apiInstance = new UserDocumentsApi(defaultClient);
        Long documentId = 12345L; // Long | The unique identifier of the Document.
        try {
            DocumentObject result = apiInstance.getDocument(documentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserDocumentsApi#getDocument");
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
| **documentId** | **Long**| The unique identifier of the Document. | |

### Return type

[**DocumentObject**](DocumentObject.md)

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


## getDocumentDownloadUrl

> GetDocumentDownloadUrl200Response getDocumentDownloadUrl(documentId)

Get Document Download URL

Retrieve a Document download URL. You may read [the dedicated documentation for this feature](/guide/user-verification/documents.html#download-documents). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.UserDocumentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UserDocumentsApi apiInstance = new UserDocumentsApi(defaultClient);
        Long documentId = 12345L; // Long | The unique identifier of the Document.
        try {
            GetDocumentDownloadUrl200Response result = apiInstance.getDocumentDownloadUrl(documentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserDocumentsApi#getDocumentDownloadUrl");
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
| **documentId** | **Long**| The unique identifier of the Document. | |

### Return type

[**GetDocumentDownloadUrl200Response**](GetDocumentDownloadUrl200Response.md)

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
| **0** | Unexpected error |  -  |


## getDocuments

> DocumentObject getDocuments(accessTag, documentId, documentTag, documentStatus, documentTypeId, documentType, userId, userEmail, fileName, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo)

Search Documents

Retrieve Documents based on search criteria.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.UserDocumentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UserDocumentsApi apiInstance = new UserDocumentsApi(defaultClient);
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        Integer documentId = 12345; // Integer | The unique identifier of the Document.
        String documentTag = "documentTag_example"; // String | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and `/` `!` `-` `_` `.` `*` `'` `(` `)` 
        String documentStatus = "CANCELED"; // String | The status of the document. See [Status](/guide/user-verification/documents.html#status-documentstatus) for more information. 
        Integer documentTypeId = 9; // Integer | The id of the type of Document.   See [Document types](/guide/user-verification/documents.html#types-documenttypeid) for the list of values. 
        String documentType = "ID"; // String | The type of the Document.  See [Document types](/guide/user-verification/documents.html#types-documenttypeid) for the list of values. 
        Integer userId = 12345; // Integer | The unique identifier of the user the Document belongs to.
        String userEmail = "a.oak@example.com"; // String | The email of the user the Document belongs to.
        String fileName = "1144214.jpg"; // String | The name of the Document.
        Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
        Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints   
        String sortBy = "createdDate"; // String | The transaction element you want to sort the list with. 
        String sortOrder = "ASC"; // String | The order you want to sort the list. 
        OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result.  Format: `YYYY-MM-DD HH:mm:ss`.  
        OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result.  Format: `YYYY-MM-DD HH:mm:ss`.  
        OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result.   Format: `YYYY-MM-DD HH:mm:ss`.  
        OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result.  Format: `YYYY-MM-DD HH:mm:ss`.  
        try {
            DocumentObject result = apiInstance.getDocuments(accessTag, documentId, documentTag, documentStatus, documentTypeId, documentType, userId, userEmail, fileName, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserDocumentsApi#getDocuments");
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
| **documentId** | **Integer**| The unique identifier of the Document. | [optional] |
| **documentTag** | **String**| Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  | [optional] |
| **documentStatus** | **String**| The status of the document. See [Status](/guide/user-verification/documents.html#status-documentstatus) for more information.  | [optional] [enum: CANCELED, PENDING, VALIDATED] |
| **documentTypeId** | **Integer**| The id of the type of Document.   See [Document types](/guide/user-verification/documents.html#types-documenttypeid) for the list of values.  | [optional] |
| **documentType** | **String**| The type of the Document.  See [Document types](/guide/user-verification/documents.html#types-documenttypeid) for the list of values.  | [optional] |
| **userId** | **Integer**| The unique identifier of the user the Document belongs to. | [optional] |
| **userEmail** | **String**| The email of the user the Document belongs to. | [optional] |
| **fileName** | **String**| The name of the Document. | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints    | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with.  | [optional] [default to createdDate] |
| **sortOrder** | **String**| The order you want to sort the list.  | [optional] [default to DESC] [enum: ASC, DESC] |
| **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.   | [optional] |
| **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.   | [optional] |
| **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.   | [optional] |
| **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.   | [optional] |

### Return type

[**DocumentObject**](DocumentObject.md)

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


## putDocument

> DocumentObject putDocument(documentId, putDocumentRequest)

Update Document

Change the &#x60;name&#x60; of a Document.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.UserDocumentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UserDocumentsApi apiInstance = new UserDocumentsApi(defaultClient);
        Long documentId = 12345L; // Long | The unique identifier of the Document.
        PutDocumentRequest putDocumentRequest = new PutDocumentRequest(); // PutDocumentRequest | 
        try {
            DocumentObject result = apiInstance.putDocument(documentId, putDocumentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserDocumentsApi#putDocument");
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
| **documentId** | **Long**| The unique identifier of the Document. | |
| **putDocumentRequest** | [**PutDocumentRequest**](PutDocumentRequest.md)|  | [optional] |

### Return type

[**DocumentObject**](DocumentObject.md)

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

