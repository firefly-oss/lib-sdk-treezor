# CardsDigitalizationApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cardDigitalizationsId**](CardsDigitalizationApi.md#cardDigitalizationsId) | **GET** /v1/cardDigitalizations/{id} | Get Card Digitalization |
| [**deletecardDigitalizationsId**](CardsDigitalizationApi.md#deletecardDigitalizationsId) | **DELETE** /v1/cardDigitalizations/{id} | Delete Payment Token |
| [**putcardDigitalizationsId**](CardsDigitalizationApi.md#putcardDigitalizationsId) | **PUT** /v1/cardDigitalizations/{id} | Update Payment Token Status |
| [**readcardDigitalizations**](CardsDigitalizationApi.md#readcardDigitalizations) | **GET** /v1/cardDigitalizations | Search Card Digitalizations |



## cardDigitalizationsId

> CardDigitalizationsId200Response cardDigitalizationsId(id)

Get Card Digitalization

Retrieve a Card Digitalization based on its &#x60;id&#x60;.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsDigitalizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsDigitalizationApi apiInstance = new CardsDigitalizationApi(defaultClient);
        Long id = 12345L; // Long | Card digitalization internal id.
        try {
            CardDigitalizationsId200Response result = apiInstance.cardDigitalizationsId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsDigitalizationApi#cardDigitalizationsId");
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
| **id** | **Long**| Card digitalization internal id. | |

### Return type

[**CardDigitalizationsId200Response**](CardDigitalizationsId200Response.md)

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


## deletecardDigitalizationsId

> ReadcardDigitalizations200Response deletecardDigitalizationsId(id, reasonCode)

Delete Payment Token

Delete a payment Token

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsDigitalizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsDigitalizationApi apiInstance = new CardsDigitalizationApi(defaultClient);
        Long id = 12345L; // Long | The unique identifier of the Card Digitalization (internal).
        String reasonCode = "C"; // String | The reason code for the action. Possible values are:  | Reason code | Description | | ---- | ----------- | | C | Account closed | | F | Issuer or cardholder confirmed fraudulent token transactions (Deprecated) | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other | 
        try {
            ReadcardDigitalizations200Response result = apiInstance.deletecardDigitalizationsId(id, reasonCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsDigitalizationApi#deletecardDigitalizationsId");
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
| **id** | **Long**| The unique identifier of the Card Digitalization (internal). | |
| **reasonCode** | **String**| The reason code for the action. Possible values are:  | Reason code | Description | | ---- | ----------- | | C | Account closed | | F | Issuer or cardholder confirmed fraudulent token transactions (Deprecated) | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other |  | [enum: C, F, L, S, T, Z] |

### Return type

[**ReadcardDigitalizations200Response**](ReadcardDigitalizations200Response.md)

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


## putcardDigitalizationsId

> CardDigitalizationsId200Response putcardDigitalizationsId(id, status, reasonCode)

Update Payment Token Status

Update the status of a payment Token  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsDigitalizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsDigitalizationApi apiInstance = new CardsDigitalizationApi(defaultClient);
        Long id = 12345L; // Long | Card digitalization internal id.
        String status = "unsuspend"; // String | The new status for the payment Token. Possible values are:  | Status | Description | | ---- | ----------- | | unsuspend | Unsuspend | | suspend | Suspend | 
        String reasonCode = "F"; // String | The reason code for the action. Possible values are:  For a suspension:  | Reason code | Description | | ---- | ----------- | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other |  For an unsuspension:  | Reason code | Description | | ---- | ----------- | | F | Cardholder reported token device found or not stolen | | T | Issuer or cardholder confirmed no fraudulent token transactions | | Z | Other | 
        try {
            CardDigitalizationsId200Response result = apiInstance.putcardDigitalizationsId(id, status, reasonCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsDigitalizationApi#putcardDigitalizationsId");
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
| **id** | **Long**| Card digitalization internal id. | |
| **status** | **String**| The new status for the payment Token. Possible values are:  | Status | Description | | ---- | ----------- | | unsuspend | Unsuspend | | suspend | Suspend |  | [enum: unsuspend, suspend] |
| **reasonCode** | **String**| The reason code for the action. Possible values are:  For a suspension:  | Reason code | Description | | ---- | ----------- | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other |  For an unsuspension:  | Reason code | Description | | ---- | ----------- | | F | Cardholder reported token device found or not stolen | | T | Issuer or cardholder confirmed no fraudulent token transactions | | Z | Other |  | [enum: F, L, S, T, Z] |

### Return type

[**CardDigitalizationsId200Response**](CardDigitalizationsId200Response.md)

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


## readcardDigitalizations

> ReadcardDigitalizations200Response readcardDigitalizations(accessTag, filter)

Search Card Digitalizations

Search for card digitalizations.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsDigitalizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsDigitalizationApi apiInstance = new CardsDigitalizationApi(defaultClient);
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        String filter = "filter_example"; // String | Filterable fields are:  - `cardId` - `createdDate` - `detailsFromGPS` - `externalId` - `id` - `modifiedDate` - `status` 
        try {
            ReadcardDigitalizations200Response result = apiInstance.readcardDigitalizations(accessTag, filter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsDigitalizationApi#readcardDigitalizations");
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
| **filter** | **String**| Filterable fields are:  - &#x60;cardId&#x60; - &#x60;createdDate&#x60; - &#x60;detailsFromGPS&#x60; - &#x60;externalId&#x60; - &#x60;id&#x60; - &#x60;modifiedDate&#x60; - &#x60;status&#x60;  | [optional] |

### Return type

[**ReadcardDigitalizations200Response**](ReadcardDigitalizations200Response.md)

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

