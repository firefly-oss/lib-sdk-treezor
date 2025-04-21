# ApiTemplatesApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTemplate**](ApiTemplatesApi.md#deleteTemplate) | **DELETE** /customization/templates/{templateName} | Delete Template |
| [**getTemplate**](ApiTemplatesApi.md#getTemplate) | **GET** /customization/templates/{templateName}/template | Get Template |
| [**getTemplateExample**](ApiTemplatesApi.md#getTemplateExample) | **GET** /customization/templates/{templateName}/example | Build Template Example |
| [**getTemplateVariables**](ApiTemplatesApi.md#getTemplateVariables) | **GET** /customization/templates/{templateName} | Get Template Variables |
| [**getTemplates**](ApiTemplatesApi.md#getTemplates) | **GET** /customization/templates | Get Available Templates |
| [**putTemplateUpload**](ApiTemplatesApi.md#putTemplateUpload) | **PUT** /customization/templates/{templateName}/template | Upload Template |



## deleteTemplate

> deleteTemplate(templateName)

Delete Template

Delete a Template.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.ApiTemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ApiTemplatesApi apiInstance = new ApiTemplatesApi(defaultClient);
        String templateName = "wallet.address_details"; // String | The name of the Template.
        try {
            apiInstance.deleteTemplate(templateName);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiTemplatesApi#deleteTemplate");
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
| **templateName** | **String**| The name of the Template. | [enum: wallet.address_details, payout.proof_of_payout, wallet.statement, email.user.onboarding_confirmation_html, email.user.onboarding_confirmation_text, email.user.password_forgot_html, email.user.password_forgot_text] |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getTemplate

> GetTemplate200Response getTemplate(templateName)

Get Template

Retrieve the currently configured template.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.ApiTemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ApiTemplatesApi apiInstance = new ApiTemplatesApi(defaultClient);
        String templateName = "wallet.address_details"; // String | The name of the Template.
        try {
            GetTemplate200Response result = apiInstance.getTemplate(templateName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiTemplatesApi#getTemplate");
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
| **templateName** | **String**| The name of the Template. | [enum: wallet.address_details, payout.proof_of_payout, wallet.statement, email.user.onboarding_confirmation_html, email.user.onboarding_confirmation_text, email.user.password_forgot_html, email.user.password_forgot_text] |

### Return type

[**GetTemplate200Response**](GetTemplate200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getTemplateExample

> GetTemplateExample200Response getTemplateExample(templateName)

Build Template Example

Test your template by building one with dummy values.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.ApiTemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ApiTemplatesApi apiInstance = new ApiTemplatesApi(defaultClient);
        String templateName = "wallet.address_details"; // String | The name of the Template.
        try {
            GetTemplateExample200Response result = apiInstance.getTemplateExample(templateName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiTemplatesApi#getTemplateExample");
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
| **templateName** | **String**| The name of the Template. | [enum: wallet.address_details, payout.proof_of_payout, wallet.statement, email.user.onboarding_confirmation_html, email.user.onboarding_confirmation_text, email.user.password_forgot_html, email.user.password_forgot_text] |

### Return type

[**GetTemplateExample200Response**](GetTemplateExample200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getTemplateVariables

> GetTemplateVariables200Response getTemplateVariables(templateName)

Get Template Variables

Retrieve the list of variables for the given template

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.ApiTemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ApiTemplatesApi apiInstance = new ApiTemplatesApi(defaultClient);
        String templateName = "wallet.address_details"; // String | The name of the Template.
        try {
            GetTemplateVariables200Response result = apiInstance.getTemplateVariables(templateName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiTemplatesApi#getTemplateVariables");
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
| **templateName** | **String**| The name of the Template. | [enum: wallet.address_details, payout.proof_of_payout, wallet.statement, email.user.onboarding_confirmation_html, email.user.onboarding_confirmation_text, email.user.password_forgot_html, email.user.password_forgot_text] |

### Return type

[**GetTemplateVariables200Response**](GetTemplateVariables200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getTemplates

> GetTemplates200Response getTemplates()

Get Available Templates

Retrieve the list of templates.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.ApiTemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ApiTemplatesApi apiInstance = new ApiTemplatesApi(defaultClient);
        try {
            GetTemplates200Response result = apiInstance.getTemplates();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiTemplatesApi#getTemplates");
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

[**GetTemplates200Response**](GetTemplates200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## putTemplateUpload

> putTemplateUpload(templateName, putTemplateUploadRequest)

Upload Template

Upload a replacement for an existing Template.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.ApiTemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ApiTemplatesApi apiInstance = new ApiTemplatesApi(defaultClient);
        String templateName = "wallet.statement"; // String | The name of the Template.
        PutTemplateUploadRequest putTemplateUploadRequest = new PutTemplateUploadRequest(); // PutTemplateUploadRequest | 
        try {
            apiInstance.putTemplateUpload(templateName, putTemplateUploadRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiTemplatesApi#putTemplateUpload");
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
| **templateName** | **String**| The name of the Template. | |
| **putTemplateUploadRequest** | [**PutTemplateUploadRequest**](PutTemplateUploadRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |

