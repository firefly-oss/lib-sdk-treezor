# AcquiringSimulationApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acquiringv2TopupCardsSimulationNotificationAutorization**](AcquiringSimulationApi.md#acquiringv2TopupCardsSimulationNotificationAutorization) | **POST** /simulation/topups/cards/notification/authorizations | Simulate HiPay authorization notification |
| [**acquiringv2TopupCardsSimulationNotificationChargebacks**](AcquiringSimulationApi.md#acquiringv2TopupCardsSimulationNotificationChargebacks) | **POST** /simulation/topups/cards/notification/chargebacks | Simulate HiPay chargeback notification |
| [**acquiringv2TopupCardsSimulationNotificationPayins**](AcquiringSimulationApi.md#acquiringv2TopupCardsSimulationNotificationPayins) | **POST** /simulation/topups/cards/notification/payins | Simulate HiPay payin notification |
| [**acquiringv2TopupCardsSimulationNotificationRefunds**](AcquiringSimulationApi.md#acquiringv2TopupCardsSimulationNotificationRefunds) | **POST** /simulation/topups/cards/notification/refunds | Simulate HiPay refund notification |
| [**simulateAcquiringPayin**](AcquiringSimulationApi.md#simulateAcquiringPayin) | **POST** /simulation/acquiring/payin | Simulate Acquiring Payin |



## acquiringv2TopupCardsSimulationNotificationAutorization

> NotificationSimulationAuthorizationResponse acquiringv2TopupCardsSimulationNotificationAutorization(notificationSimulationAuthorizations)

Simulate HiPay authorization notification

Mocks an HiPay authorization notification provided the minimal set of parameters to generate a refund notification. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.AcquiringSimulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AcquiringSimulationApi apiInstance = new AcquiringSimulationApi(defaultClient);
        NotificationSimulationAuthorizations notificationSimulationAuthorizations = new NotificationSimulationAuthorizations(); // NotificationSimulationAuthorizations | 
        try {
            NotificationSimulationAuthorizationResponse result = apiInstance.acquiringv2TopupCardsSimulationNotificationAutorization(notificationSimulationAuthorizations);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AcquiringSimulationApi#acquiringv2TopupCardsSimulationNotificationAutorization");
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
| **notificationSimulationAuthorizations** | [**NotificationSimulationAuthorizations**](NotificationSimulationAuthorizations.md)|  | [optional] |

### Return type

[**NotificationSimulationAuthorizationResponse**](NotificationSimulationAuthorizationResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Authorization notification successfully created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## acquiringv2TopupCardsSimulationNotificationChargebacks

> NotificationSimulationChargebackResponse acquiringv2TopupCardsSimulationNotificationChargebacks(notificationSimulationChargebacks)

Simulate HiPay chargeback notification

Mocks an HiPay chargeback notification providing the minimal set of parameters to generate a chargeback notification. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.AcquiringSimulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AcquiringSimulationApi apiInstance = new AcquiringSimulationApi(defaultClient);
        NotificationSimulationChargebacks notificationSimulationChargebacks = new NotificationSimulationChargebacks(); // NotificationSimulationChargebacks | 
        try {
            NotificationSimulationChargebackResponse result = apiInstance.acquiringv2TopupCardsSimulationNotificationChargebacks(notificationSimulationChargebacks);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AcquiringSimulationApi#acquiringv2TopupCardsSimulationNotificationChargebacks");
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
| **notificationSimulationChargebacks** | [**NotificationSimulationChargebacks**](NotificationSimulationChargebacks.md)|  | [optional] |

### Return type

[**NotificationSimulationChargebackResponse**](NotificationSimulationChargebackResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Chargeback notification successfully created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## acquiringv2TopupCardsSimulationNotificationPayins

> NotificationSimulationPayinResponse acquiringv2TopupCardsSimulationNotificationPayins(walletId, amount, currency, userId, status, transactionReference, cardPaymentMethod, profile)

Simulate HiPay payin notification

Mocks an HiPay payin notification providing the minimal set of parameters to generate a payin notification. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.AcquiringSimulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AcquiringSimulationApi apiInstance = new AcquiringSimulationApi(defaultClient);
        String walletId = "walletId_example"; // String | Identifier of the wallet to be credited
        Float amount = 3.4F; // Float | Payin amount
        String currency = "currency_example"; // String | Base currency for this payin  This three-character currency code must comply with ISO-4217
        String userId = "userId_example"; // String | Identifier of the user on behalf of which the simulated payin should be executed 
        Integer status = 56; // Integer | The status code of the simulated notification
        String transactionReference = "transactionReference_example"; // String | The reference of the transaction
        NotificationSimulationPayinsCardPaymentMethod cardPaymentMethod = new NotificationSimulationPayinsCardPaymentMethod(); // NotificationSimulationPayinsCardPaymentMethod | 
        String profile = "profile_example"; // String | HiPay merchant identifier (mid) to be used for the operation. Required if the client has multiple merchant identifiers associated. If only one mid is associated, then that one is used for the operation. 
        try {
            NotificationSimulationPayinResponse result = apiInstance.acquiringv2TopupCardsSimulationNotificationPayins(walletId, amount, currency, userId, status, transactionReference, cardPaymentMethod, profile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AcquiringSimulationApi#acquiringv2TopupCardsSimulationNotificationPayins");
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
| **walletId** | **String**| Identifier of the wallet to be credited | |
| **amount** | **Float**| Payin amount | |
| **currency** | **String**| Base currency for this payin  This three-character currency code must comply with ISO-4217 | |
| **userId** | **String**| Identifier of the user on behalf of which the simulated payin should be executed  | [optional] |
| **status** | **Integer**| The status code of the simulated notification | [optional] |
| **transactionReference** | **String**| The reference of the transaction | [optional] |
| **cardPaymentMethod** | [**NotificationSimulationPayinsCardPaymentMethod**](NotificationSimulationPayinsCardPaymentMethod.md)|  | [optional] |
| **profile** | **String**| HiPay merchant identifier (mid) to be used for the operation. Required if the client has multiple merchant identifiers associated. If only one mid is associated, then that one is used for the operation.  | [optional] |

### Return type

[**NotificationSimulationPayinResponse**](NotificationSimulationPayinResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded, application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payin notification successfully created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## acquiringv2TopupCardsSimulationNotificationRefunds

> NotificationSimulationRefundResponse acquiringv2TopupCardsSimulationNotificationRefunds(notificationSimulationRefunds)

Simulate HiPay refund notification

Mocks an HiPay refund notification providing the minimal set of parameters to generate a refund notification. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.AcquiringSimulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AcquiringSimulationApi apiInstance = new AcquiringSimulationApi(defaultClient);
        NotificationSimulationRefunds notificationSimulationRefunds = new NotificationSimulationRefunds(); // NotificationSimulationRefunds | 
        try {
            NotificationSimulationRefundResponse result = apiInstance.acquiringv2TopupCardsSimulationNotificationRefunds(notificationSimulationRefunds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AcquiringSimulationApi#acquiringv2TopupCardsSimulationNotificationRefunds");
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
| **notificationSimulationRefunds** | [**NotificationSimulationRefunds**](NotificationSimulationRefunds.md)|  | [optional] |

### Return type

[**NotificationSimulationRefundResponse**](NotificationSimulationRefundResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Refund notification successfully created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## simulateAcquiringPayin

> simulateAcquiringPayin(simulateAcquiringPayinRequest)

Simulate Acquiring Payin

Simulate operations resulting from the card acquisition feature.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.AcquiringSimulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AcquiringSimulationApi apiInstance = new AcquiringSimulationApi(defaultClient);
        SimulateAcquiringPayinRequest simulateAcquiringPayinRequest = new SimulateAcquiringPayinRequest(); // SimulateAcquiringPayinRequest | 
        try {
            apiInstance.simulateAcquiringPayin(simulateAcquiringPayinRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AcquiringSimulationApi#simulateAcquiringPayin");
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
| **simulateAcquiringPayinRequest** | [**SimulateAcquiringPayinRequest**](SimulateAcquiringPayinRequest.md)|  | [optional] |

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
| **204** | OK |  -  |
| **400** | Bad Request |  -  |
| **0** | Unexpected error |  -  |

