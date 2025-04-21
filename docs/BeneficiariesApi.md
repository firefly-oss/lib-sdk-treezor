# BeneficiariesApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBeneficiaries**](BeneficiariesApi.md#getBeneficiaries) | **GET** /v1/beneficiaries | Search Beneficiaries |
| [**getBeneficiary**](BeneficiariesApi.md#getBeneficiary) | **GET** /v1/beneficiaries/{beneficiaryId} | Get Beneficiary |
| [**postBeneficiary**](BeneficiariesApi.md#postBeneficiary) | **POST** /v1/beneficiaries | Create Beneficiary |
| [**putBeneficiary**](BeneficiariesApi.md#putBeneficiary) | **PUT** /v1/beneficiaries/{beneficiaryId} | Update Beneficiary |



## getBeneficiaries

> BeneficiaryObject getBeneficiaries(accessTag, fields, filter, id, pageNumber, pageCount, sortBy, sortOrder)

Search Beneficiaries

Retrieve Beneficiary bank accounts that match search criteria.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.BeneficiariesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        BeneficiariesApi apiInstance = new BeneficiariesApi(defaultClient);
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        List<String> fields = Arrays.asList(); // List<String> | List of the object properties to be returned, allowing you to filter the response payload.
        String filter = "filter_example"; // String | You can filter the API response by using filter(s).  Filterable fields are:  - id  - tag  - userId  - isActive (1 for yes, 0 for no)  - nickName  - address  - iban (encrypted IBAN)  - IbanInClear  - bic  - sepaCreditorIdentifier  - usableForSct  - createdDate  - modifiedDate  Filters should be separated by a \";\". Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax : \"fieldName criterion expression\".  Where:  - fieldName: the name of a filterable field of this object.  - expression: the values to be included or excluded (see the table below for more information)  - criterion: a filter criterion.  Here are the possible values for criterion:   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     >    |      greater than      |            alphanumeric string           |         100        |  |    >=    | greater or equal than  |            alphanumeric string           |         100        |  |     <    |        less than       |            alphanumeric string           |         100        |  |    <=    |   less or equal than   |            alphanumeric string           |         100        |  |    !=    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    ==    |         equals         |            alphanumeric string           |         100        | 
        Integer id = 12345; // Integer | The unique identifier of the Beneficiary.
        Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
        Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints   
        String sortBy = "creationDate"; // String | The transaction element you want to sort the list with. 
        String sortOrder = "ASC"; // String | The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
        try {
            BeneficiaryObject result = apiInstance.getBeneficiaries(accessTag, fields, filter, id, pageNumber, pageCount, sortBy, sortOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BeneficiariesApi#getBeneficiaries");
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
| **filter** | **String**| You can filter the API response by using filter(s).  Filterable fields are:  - id  - tag  - userId  - isActive (1 for yes, 0 for no)  - nickName  - address  - iban (encrypted IBAN)  - IbanInClear  - bic  - sepaCreditorIdentifier  - usableForSct  - createdDate  - modifiedDate  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax : \&quot;fieldName criterion expression\&quot;.  Where:  - fieldName: the name of a filterable field of this object.  - expression: the values to be included or excluded (see the table below for more information)  - criterion: a filter criterion.  Here are the possible values for criterion:   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     &gt;    |      greater than      |            alphanumeric string           |         100        |  |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |  |     &lt;    |        less than       |            alphanumeric string           |         100        |  |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |  |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        |  | [optional] |
| **id** | **Integer**| The unique identifier of the Beneficiary. | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints    | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with.  | [optional] [default to creationDate] |
| **sortOrder** | **String**| The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending.  | [optional] [default to DESC] [enum: ASC, DESC] |

### Return type

[**BeneficiaryObject**](BeneficiaryObject.md)

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


## getBeneficiary

> BeneficiaryObject getBeneficiary(beneficiaryId, fields)

Get Beneficiary

Retrieve a Beneficiary bank account based on its &#x60;id&#x60;.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.BeneficiariesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        BeneficiariesApi apiInstance = new BeneficiariesApi(defaultClient);
        Long beneficiaryId = 12345L; // Long | The unique identifier of the Beneficiary.
        List<String> fields = Arrays.asList(); // List<String> | List of the object properties to be returned, allowing you to filter the response payload.
        try {
            BeneficiaryObject result = apiInstance.getBeneficiary(beneficiaryId, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BeneficiariesApi#getBeneficiary");
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
| **beneficiaryId** | **Long**| The unique identifier of the Beneficiary. | |
| **fields** | [**List&lt;String&gt;**](String.md)| List of the object properties to be returned, allowing you to filter the response payload. | [optional] |

### Return type

[**BeneficiaryObject**](BeneficiaryObject.md)

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


## postBeneficiary

> BeneficiaryObject postBeneficiary(postBeneficiaryRequest)

Create Beneficiary

Create a new benefeciary bank account. This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.BeneficiariesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        BeneficiariesApi apiInstance = new BeneficiariesApi(defaultClient);
        PostBeneficiaryRequest postBeneficiaryRequest = new PostBeneficiaryRequest(); // PostBeneficiaryRequest | 
        try {
            BeneficiaryObject result = apiInstance.postBeneficiary(postBeneficiaryRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BeneficiariesApi#postBeneficiary");
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
| **postBeneficiaryRequest** | [**PostBeneficiaryRequest**](PostBeneficiaryRequest.md)|  | [optional] |

### Return type

[**BeneficiaryObject**](BeneficiaryObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **0** | Unexpected error |  -  |


## putBeneficiary

> BeneficiaryObject putBeneficiary(beneficiaryId, putBeneficiaryRequest)

Update Beneficiary

Modify a benefeciary bank account information.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.BeneficiariesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        BeneficiariesApi apiInstance = new BeneficiariesApi(defaultClient);
        Integer beneficiaryId = 12345; // Integer | The unique identifier of the Beneficiary.
        PutBeneficiaryRequest putBeneficiaryRequest = new PutBeneficiaryRequest(); // PutBeneficiaryRequest | 
        try {
            BeneficiaryObject result = apiInstance.putBeneficiary(beneficiaryId, putBeneficiaryRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BeneficiariesApi#putBeneficiary");
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
| **beneficiaryId** | **Integer**| The unique identifier of the Beneficiary. | |
| **putBeneficiaryRequest** | [**PutBeneficiaryRequest**](PutBeneficiaryRequest.md)|  | [optional] |

### Return type

[**BeneficiaryObject**](BeneficiaryObject.md)

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

