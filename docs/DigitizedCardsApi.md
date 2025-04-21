# DigitizedCardsApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteDigitalized**](DigitizedCardsApi.md#deleteDigitalized) | **DELETE** /v1/digitalizedCard/{id} | Deactivate Payment Token |
| [**getDigitalized**](DigitizedCardsApi.md#getDigitalized) | **GET** /v1/{cardId}/digitalizedCards | Get Digitized Cards |
| [**getPaymentToken**](DigitizedCardsApi.md#getPaymentToken) | **GET** /v1/digitalizedCard/{id} | Get Payment Token |
| [**putDigitalized**](DigitizedCardsApi.md#putDigitalized) | **PUT** /v1/digitalizedCard/{id} | Update Payment Token Status |
| [**tavRequestPOST**](DigitizedCardsApi.md#tavRequestPOST) | **POST** /v1/issuerInitiatedDigitizationDatas | Request issuerInitiatedDigitizationData |



## deleteDigitalized

> DigitalizedCardsDeactivateDigitalizedCardResponse deleteDigitalized(id, reasonCode)

Deactivate Payment Token

Deactivate a payment Token. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.DigitizedCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        DigitizedCardsApi apiInstance = new DigitizedCardsApi(defaultClient);
        String id = "12345"; // String | The unique identifier of a digitized card. 
        String reasonCode = "C"; // String | The reason code is required only if the card is on Mastercard System. Possible values are:  | Reason code | Description | | :----: | ----------- | | C | Account closed | | D | Issuer consumer deleted | | F | Cardholder reported token device found or not stolen | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other | 
        try {
            DigitalizedCardsDeactivateDigitalizedCardResponse result = apiInstance.deleteDigitalized(id, reasonCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DigitizedCardsApi#deleteDigitalized");
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
| **id** | **String**| The unique identifier of a digitized card.  | |
| **reasonCode** | **String**| The reason code is required only if the card is on Mastercard System. Possible values are:  | Reason code | Description | | :----: | ----------- | | C | Account closed | | D | Issuer consumer deleted | | F | Cardholder reported token device found or not stolen | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other |  | [enum: C, D, F, L, S, T, Z] |

### Return type

[**DigitalizedCardsDeactivateDigitalizedCardResponse**](DigitalizedCardsDeactivateDigitalizedCardResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid or missing input (or invalid card status) |  -  |
| **401** | User not authorized to make this request |  -  |
| **404** | Digitized Card does not exist |  -  |
| **500** | Internal error. |  -  |


## getDigitalized

> List&lt;DigitalizedCardsGetDigitalizedCardResponse&gt; getDigitalized(cardId)

Get Digitized Cards

Retrieve the list of Digitized Cards for a given &#x60;cardId&#x60;. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.DigitizedCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        DigitizedCardsApi apiInstance = new DigitizedCardsApi(defaultClient);
        String cardId = "12345"; // String | The unique identifier of the virtual or physical card.
        try {
            List<DigitalizedCardsGetDigitalizedCardResponse> result = apiInstance.getDigitalized(cardId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DigitizedCardsApi#getDigitalized");
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
| **cardId** | **String**| The unique identifier of the virtual or physical card. | |

### Return type

[**List&lt;DigitalizedCardsGetDigitalizedCardResponse&gt;**](DigitalizedCardsGetDigitalizedCardResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List successfully retrieved |  -  |
| **400** | Invalid or missing input (or invalid card status) |  -  |
| **401** | User not authorized to make this request |  -  |
| **404** | Digitized Card does not exist |  -  |
| **500** | Internal error. |  -  |


## getPaymentToken

> DigitalizedCardsGetDigitalizedCardResponse getPaymentToken(id)

Get Payment Token

Retrieve a payment token.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.DigitizedCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        DigitizedCardsApi apiInstance = new DigitizedCardsApi(defaultClient);
        String id = "12345"; // String | The unique identifier of a digitized card. 
        try {
            DigitalizedCardsGetDigitalizedCardResponse result = apiInstance.getPaymentToken(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DigitizedCardsApi#getPaymentToken");
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
| **id** | **String**| The unique identifier of a digitized card.  | |

### Return type

[**DigitalizedCardsGetDigitalizedCardResponse**](DigitalizedCardsGetDigitalizedCardResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid or missing input (or invalid card status) |  -  |
| **401** | User not authorized to make this request |  -  |
| **404** | Digitized Card does not exist |  -  |
| **500** | Internal error. |  -  |


## putDigitalized

> DigitalizedCardsPutDigitalizedCardResponse putDigitalized(id, putDigitalizedRequest)

Update Payment Token Status

Update the status of a payment Token. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.DigitizedCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        DigitizedCardsApi apiInstance = new DigitizedCardsApi(defaultClient);
        String id = "12345"; // String | The unique identifier of a digitalized card. 
        PutDigitalizedRequest putDigitalizedRequest = new PutDigitalizedRequest(); // PutDigitalizedRequest | 
        try {
            DigitalizedCardsPutDigitalizedCardResponse result = apiInstance.putDigitalized(id, putDigitalizedRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DigitizedCardsApi#putDigitalized");
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
| **id** | **String**| The unique identifier of a digitalized card.  | |
| **putDigitalizedRequest** | [**PutDigitalizedRequest**](PutDigitalizedRequest.md)|  | [optional] |

### Return type

[**DigitalizedCardsPutDigitalizedCardResponse**](DigitalizedCardsPutDigitalizedCardResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid or missing input (or invalid card status) |  -  |
| **401** | User not authorized to make this request |  -  |
| **404** | Digitized Card does not exist |  -  |
| **500** | Internal error. |  -  |


## tavRequestPOST

> TavRequestPOST200Response tavRequestPOST(tavRequestPOSTRequest)

Request issuerInitiatedDigitizationData

Create a new issuerInitiatedDigitizationData request  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.DigitizedCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        DigitizedCardsApi apiInstance = new DigitizedCardsApi(defaultClient);
        TavRequestPOSTRequest tavRequestPOSTRequest = new TavRequestPOSTRequest(); // TavRequestPOSTRequest | 
        try {
            TavRequestPOST200Response result = apiInstance.tavRequestPOST(tavRequestPOSTRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DigitizedCardsApi#tavRequestPOST");
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
| **tavRequestPOSTRequest** | [**TavRequestPOSTRequest**](TavRequestPOSTRequest.md)|  | [optional] |

### Return type

[**TavRequestPOST200Response**](TavRequestPOST200Response.md)

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
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **0** | Unexpected error |  -  |

