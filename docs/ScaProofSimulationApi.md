# ScaProofSimulationApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postScaProof**](ScaProofSimulationApi.md#postScaProof) | **POST** /simulation/scaProof | Simulate SCA Proof |



## postScaProof

> PostScaProof200Response postScaProof(postScaProofRequest)

Simulate SCA Proof

Create an &#x60;scaProof&#x60; for testing SCA authentication flows without a dedicated frontend. Use the &#x60;scaProof&#x60; to secure end user flow with a &#x60;delegated_end_user&#x60; JWT in &#x60;sandbox&#x60;.   See the [Simulate SCA Proof](/guide/strong-customer-authentication/faking-operations.html#simulate-sca-proof) article for more information. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.ScaProofSimulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ScaProofSimulationApi apiInstance = new ScaProofSimulationApi(defaultClient);
        PostScaProofRequest postScaProofRequest = new PostScaProofRequest(); // PostScaProofRequest | 
        try {
            PostScaProof200Response result = apiInstance.postScaProof(postScaProofRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScaProofSimulationApi#postScaProof");
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
| **postScaProofRequest** | [**PostScaProofRequest**](PostScaProofRequest.md)|  | [optional] |

### Return type

[**PostScaProof200Response**](PostScaProof200Response.md)

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

