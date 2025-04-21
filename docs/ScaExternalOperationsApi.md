# ScaExternalOperationsApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postExtOperation**](ScaExternalOperationsApi.md#postExtOperation) | **POST** /core-connect/sca/externalOperations | Create External Operation declaration |
| [**putExtOperation**](ScaExternalOperationsApi.md#putExtOperation) | **PUT** /core-connect/sca/externalOperations/{externalOperationId} | Update External Operation declaration |



## postExtOperation

> PostExtOperation200Response postExtOperation(postExtOperationRequest)

Create External Operation declaration

Declare an SCA External Operation (i.e., a sensitive action that was made outside of Treezor services).

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.ScaExternalOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ScaExternalOperationsApi apiInstance = new ScaExternalOperationsApi(defaultClient);
        PostExtOperationRequest postExtOperationRequest = new PostExtOperationRequest(); // PostExtOperationRequest | 
        try {
            PostExtOperation200Response result = apiInstance.postExtOperation(postExtOperationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScaExternalOperationsApi#postExtOperation");
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
| **postExtOperationRequest** | [**PostExtOperationRequest**](PostExtOperationRequest.md)|  | [optional] |

### Return type

[**PostExtOperation200Response**](PostExtOperation200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The External Operation was successfully created. |  -  |
| **0** | Unexpected error |  -  |


## putExtOperation

> PostExtOperation200Response putExtOperation(externalOperationId, putExtOperationRequest)

Update External Operation declaration

Modify an SCA External Operation declaration.   This feature is only available for Per Operation operations, in other words for external operations whose action name is: &#x60;externalMassPayoutOrderCreation&#x60;,  &#x60;externalMassTransferOrderCreation&#x60;, &#x60;externalScheduledPayoutOrder&#x60;, or &#x60;externalScheduledTransferOrder&#x60;. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.ScaExternalOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ScaExternalOperationsApi apiInstance = new ScaExternalOperationsApi(defaultClient);
        UUID externalOperationId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479"); // UUID | The unique identifier (uiid) of the ExternalOperation.
        PutExtOperationRequest putExtOperationRequest = new PutExtOperationRequest(); // PutExtOperationRequest | 
        try {
            PostExtOperation200Response result = apiInstance.putExtOperation(externalOperationId, putExtOperationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScaExternalOperationsApi#putExtOperation");
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
| **externalOperationId** | **UUID**| The unique identifier (uiid) of the ExternalOperation. | |
| **putExtOperationRequest** | [**PutExtOperationRequest**](PutExtOperationRequest.md)|  | [optional] |

### Return type

[**PostExtOperation200Response**](PostExtOperation200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The External Operation was successfully updated. |  -  |
| **0** | Unexpected error |  -  |

