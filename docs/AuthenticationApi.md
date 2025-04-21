# AuthenticationApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postAuth**](AuthenticationApi.md#postAuth) | **POST** /oauth/token | Obtain Access Token |



## postAuth

> PostAuth200Response postAuth(grantType, clientId, clientSecret, scope, username, password, refreshToken)

Obtain Access Token

Exchange authorization codes or refresh tokens for access tokens. The response will include the access token and optionally a refresh token, along with their expiration details. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        String grantType = "refresh_token"; // String | MUST BE \\\"refresh_token\\\" value for refresh token flow
        String clientId = "clientId_example"; // String | 
        String clientSecret = "clientSecret_example"; // String | 
        String scope = "scope_example"; // String | space separated
        String username = "username_example"; // String | 
        String password = "password_example"; // String | User password
        String refreshToken = "refreshToken_example"; // String | 
        try {
            PostAuth200Response result = apiInstance.postAuth(grantType, clientId, clientSecret, scope, username, password, refreshToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#postAuth");
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
| **grantType** | **String**| MUST BE \\\&quot;refresh_token\\\&quot; value for refresh token flow | [optional] [default to refresh_token] |
| **clientId** | **String**|  | [optional] |
| **clientSecret** | **String**|  | [optional] |
| **scope** | **String**| space separated | [optional] |
| **username** | **String**|  | [optional] |
| **password** | **String**| User password | [optional] |
| **refreshToken** | **String**|  | [optional] |

### Return type

[**PostAuth200Response**](PostAuth200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **0** | Unexpected error |  -  |

