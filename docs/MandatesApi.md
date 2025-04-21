# MandatesApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteMandate**](MandatesApi.md#deleteMandate) | **DELETE** /v1/mandates/{mandateId} | Revoke Mandate |
| [**getMandate**](MandatesApi.md#getMandate) | **GET** /v1/mandates/{mandateId} | Get Mandate |
| [**getMandates**](MandatesApi.md#getMandates) | **GET** /v1/mandates | Search Mandates |
| [**postMandates**](MandatesApi.md#postMandates) | **POST** /v1/mandates | Create Mandate |



## deleteMandate

> MandateObject deleteMandate(mandateId, origin)

Revoke Mandate

Change the Mandate status to &#x60;CANCELED&#x60;.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MandatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        MandatesApi apiInstance = new MandatesApi(defaultClient);
        Integer mandateId = 12345; // Integer | The unique identifier of the Mandate.
        String origin = "CREDITOR"; // String | The origin of the request for revoking the Mandate. 
        try {
            MandateObject result = apiInstance.deleteMandate(mandateId, origin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MandatesApi#deleteMandate");
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
| **mandateId** | **Integer**| The unique identifier of the Mandate. | |
| **origin** | **String**| The origin of the request for revoking the Mandate.  | [enum: CREDITOR, DEBITOR] |

### Return type

[**MandateObject**](MandateObject.md)

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


## getMandate

> MandateObject getMandate(mandateId)

Get Mandate

Retrieve a Mandate based on its &#x60;id&#x60;.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MandatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        MandatesApi apiInstance = new MandatesApi(defaultClient);
        Long mandateId = 12345L; // Long | The unique identifier of the Mandate.
        try {
            MandateObject result = apiInstance.getMandate(mandateId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MandatesApi#getMandate");
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
| **mandateId** | **Long**| The unique identifier of the Mandate. | |

### Return type

[**MandateObject**](MandateObject.md)

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


## getMandates

> MandateObject getMandates(accessTag, mandateId, userId, uniqueMandateReference, mandateStatus, filter)

Search Mandates

Retrieve Mandates that match search criteria.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MandatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        MandatesApi apiInstance = new MandatesApi(defaultClient);
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        Integer mandateId = 12345; // Integer | The unique identifier of the Mandate.
        Integer userId = 12345; // Integer | The unique identifier of the User who initiates the Mandate request.
        String uniqueMandateReference = "uniqueMandateReference_example"; // String | The unique reference that unambiguiously identify a mandate signed between the user and the beneficiary.                 See the [Unique Mandate Reference (UMR)](/guide/overview/glossary.html#unique-mandate-reference-umr) article for more information. 
        String mandateStatus = "CANCELED"; // String | The status of the Mandate. 
        String filter = "filter_example"; // String | You can filter the API response by using filter(s).  Filters should be separated by a \";\". Example for 3 filters: `FILTER1;FILTER2;FILTER3`  A single filter has the following syntax : \"fieldName criterionexpression\".  Where: * fieldName – the name of a filterable field of this object. * expression – the values to be included or excluded (see the table below for more information) * criterion – a filter criterion.  Here are the possible values for criterion:   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     >    |      greater than      |            alphanumeric string           |         100        |  |    >=    | greater or equal than  |            alphanumeric string           |         100        |  |     <    |        less than       |            alphanumeric string           |         100        |  |    <=    |   less or equal than   |            alphanumeric string           |         100        |  |    !=    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    ==    |         equals         |            alphanumeric string           |         100        | 
        try {
            MandateObject result = apiInstance.getMandates(accessTag, mandateId, userId, uniqueMandateReference, mandateStatus, filter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MandatesApi#getMandates");
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
| **mandateId** | **Integer**| The unique identifier of the Mandate. | [optional] |
| **userId** | **Integer**| The unique identifier of the User who initiates the Mandate request. | [optional] |
| **uniqueMandateReference** | **String**| The unique reference that unambiguiously identify a mandate signed between the user and the beneficiary.                 See the [Unique Mandate Reference (UMR)](/guide/overview/glossary.html#unique-mandate-reference-umr) article for more information.  | [optional] |
| **mandateStatus** | **String**| The status of the Mandate.  | [optional] [enum: CANCELED, PENDING, VALIDATED] |
| **filter** | **String**| You can filter the API response by using filter(s).  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: &#x60;FILTER1;FILTER2;FILTER3&#x60;  A single filter has the following syntax : \&quot;fieldName criterionexpression\&quot;.  Where: * fieldName – the name of a filterable field of this object. * expression – the values to be included or excluded (see the table below for more information) * criterion – a filter criterion.  Here are the possible values for criterion:   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     &gt;    |      greater than      |            alphanumeric string           |         100        |  |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |  |     &lt;    |        less than       |            alphanumeric string           |         100        |  |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |  |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        |  | [optional] |

### Return type

[**MandateObject**](MandateObject.md)

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


## postMandates

> MandateObject postMandates(postMandatesRequest)

Create Mandate

Create a new mandate. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.MandatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        MandatesApi apiInstance = new MandatesApi(defaultClient);
        PostMandatesRequest postMandatesRequest = new PostMandatesRequest(); // PostMandatesRequest | 
        try {
            MandateObject result = apiInstance.postMandates(postMandatesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MandatesApi#postMandates");
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
| **postMandatesRequest** | [**PostMandatesRequest**](PostMandatesRequest.md)|  | [optional] |

### Return type

[**MandateObject**](MandateObject.md)

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

