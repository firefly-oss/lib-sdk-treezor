# AcquiringCardTopupsApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acquiringv2TopupCardsChargebacksGet**](AcquiringCardTopupsApi.md#acquiringv2TopupCardsChargebacksGet) | **GET** /v1/topups/cards/chargebacks/{chargebackUuid} | Get Chargeback |
| [**acquiringv2TopupCardsRefundsGet**](AcquiringCardTopupsApi.md#acquiringv2TopupCardsRefundsGet) | **GET** /v1/topups/cards/refunds/{refundUuid} | Get Refund |
| [**acquiringv2TopupCardsRefundsPost**](AcquiringCardTopupsApi.md#acquiringv2TopupCardsRefundsPost) | **POST** /v1/topups/cards/refunds | Create Refund |
| [**deleteAcqAuth**](AcquiringCardTopupsApi.md#deleteAcqAuth) | **DELETE** /v1/topups/cards/authorizations/{authorizationUuid} | Delete Authorization |
| [**deleteTopupCard**](AcquiringCardTopupsApi.md#deleteTopupCard) | **DELETE** /v1/topups/cards/users/{userId}/topupCards/{topupCardId} | Cancel Topup Card |
| [**getAcqAuth**](AcquiringCardTopupsApi.md#getAcqAuth) | **GET** /v1/topups/cards/authorizations/{authorizationUuid} | Get Authorization |
| [**getAcqAuthPayins**](AcquiringCardTopupsApi.md#getAcqAuthPayins) | **GET** /v1/topups/cards/authorizations/{authorizationUuid}/payins | Get Authorization Payins |
| [**getTopupCard**](AcquiringCardTopupsApi.md#getTopupCard) | **GET** /v1/topups/cards/users/{userId}/topupCards/{topupCardId} | Get Topup Card |
| [**getTopupCards**](AcquiringCardTopupsApi.md#getTopupCards) | **GET** /v1/topups/cards/users/{userId}/topupCards | Search Topup Cards |
| [**postAcqAuth**](AcquiringCardTopupsApi.md#postAcqAuth) | **POST** /v1/topups/cards/authorizations | Create Authorization |
| [**postAcqAuthPayin**](AcquiringCardTopupsApi.md#postAcqAuthPayin) | **POST** /v1/topups/cards/authorizations/{authorizationUuid}/payins | Create Payin from Authorization |
| [**postTopupCard**](AcquiringCardTopupsApi.md#postTopupCard) | **POST** /v1/topups/cards/users/{userId}/topupCards | Create Topup Card |



## acquiringv2TopupCardsChargebacksGet

> ChargebacksResponse acquiringv2TopupCardsChargebacksGet(chargebackUuid)

Get Chargeback

Retrieve a card acquiring a chargeback from the system.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.AcquiringCardTopupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
        UUID chargebackUuid = UUID.fromString("9ea4c7f6-50a2-4679-8634-dfe42f03cbdc"); // UUID | Universally unique identifier (UUID) of the chargeback
        try {
            ChargebacksResponse result = apiInstance.acquiringv2TopupCardsChargebacksGet(chargebackUuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AcquiringCardTopupsApi#acquiringv2TopupCardsChargebacksGet");
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
| **chargebackUuid** | **UUID**| Universally unique identifier (UUID) of the chargeback | |

### Return type

[**ChargebacksResponse**](ChargebacksResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Chargeback returned |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## acquiringv2TopupCardsRefundsGet

> RefundsResponse acquiringv2TopupCardsRefundsGet(refundUuid)

Get Refund

Retrieve a card acquring refund from the system.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.AcquiringCardTopupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
        UUID refundUuid = UUID.fromString("9ea4c7f6-50a2-4679-8634-dfe42f03cbdc"); // UUID | Universally unique identifier (UUID) of the refund
        try {
            RefundsResponse result = apiInstance.acquiringv2TopupCardsRefundsGet(refundUuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AcquiringCardTopupsApi#acquiringv2TopupCardsRefundsGet");
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
| **refundUuid** | **UUID**| Universally unique identifier (UUID) of the refund | |

### Return type

[**RefundsResponse**](RefundsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Refund returned |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## acquiringv2TopupCardsRefundsPost

> RefundsResponse acquiringv2TopupCardsRefundsPost(refundRequest)

Create Refund

Create a new card topup refund.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.AcquiringCardTopupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
        RefundRequest refundRequest = new RefundRequest(); // RefundRequest | 
        try {
            RefundsResponse result = apiInstance.acquiringv2TopupCardsRefundsPost(refundRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AcquiringCardTopupsApi#acquiringv2TopupCardsRefundsPost");
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
| **refundRequest** | [**RefundRequest**](RefundRequest.md)|  | [optional] |

### Return type

[**RefundsResponse**](RefundsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payin successfully refunded. A list of refunds is returned. |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## deleteAcqAuth

> AuthorizationDeleteResponse deleteAcqAuth(authorizationUuid)

Delete Authorization

Delete an authorization from the system

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.AcquiringCardTopupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
        UUID authorizationUuid = UUID.fromString("9ea4c7f6-50a2-4679-8634-dfe42f03cbdc"); // UUID | Universally unique identifier (UUID) of the authorization
        try {
            AuthorizationDeleteResponse result = apiInstance.deleteAcqAuth(authorizationUuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AcquiringCardTopupsApi#deleteAcqAuth");
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
| **authorizationUuid** | **UUID**| Universally unique identifier (UUID) of the authorization | |

### Return type

[**AuthorizationDeleteResponse**](AuthorizationDeleteResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Authorization returned |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## deleteTopupCard

> TopupCards deleteTopupCard(userId, topupCardId)

Cancel Topup Card

Change topup card status to CANCELED.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.AcquiringCardTopupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
        String userId = "12345"; // String | The owning user identifier
        String topupCardId = "12345"; // String | The identifier of the topup card to be canceled
        try {
            TopupCards result = apiInstance.deleteTopupCard(userId, topupCardId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AcquiringCardTopupsApi#deleteTopupCard");
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
| **userId** | **String**| The owning user identifier | |
| **topupCardId** | **String**| The identifier of the topup card to be canceled | |

### Return type

[**TopupCards**](TopupCards.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Topup card was canceled |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## getAcqAuth

> Authorization getAcqAuth(authorizationUuid)

Get Authorization

Retrieve an authorization from the system.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.AcquiringCardTopupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
        UUID authorizationUuid = UUID.fromString("9ea4c7f6-50a2-4679-8634-dfe42f03cbdc"); // UUID | Universally unique identifier (UUID) of the authorization
        try {
            Authorization result = apiInstance.getAcqAuth(authorizationUuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AcquiringCardTopupsApi#getAcqAuth");
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
| **authorizationUuid** | **UUID**| Universally unique identifier (UUID) of the authorization | |

### Return type

[**Authorization**](Authorization.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Authorization returned |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## getAcqAuthPayins

> List&lt;AcquiringPayin&gt; getAcqAuthPayins(authorizationUuid, exclusiveStartKey)

Get Authorization Payins

List payins created from a given authorization.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.AcquiringCardTopupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
        String authorizationUuid = "9ea4c7f6-50a2-4679-8634-dfe42f03cbdc"; // String | Universally unique identifier (UUID) of the authorization
        String exclusiveStartKey = "exclusiveStartKey_example"; // String | The exclusive start key returned by a previous call
        try {
            List<AcquiringPayin> result = apiInstance.getAcqAuthPayins(authorizationUuid, exclusiveStartKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AcquiringCardTopupsApi#getAcqAuthPayins");
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
| **authorizationUuid** | **String**| Universally unique identifier (UUID) of the authorization | |
| **exclusiveStartKey** | **String**| The exclusive start key returned by a previous call | [optional] |

### Return type

[**List&lt;AcquiringPayin&gt;**](AcquiringPayin.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Payins is returned |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## getTopupCard

> TopupCards getTopupCard(userId, topupCardId)

Get Topup Card

Retrieve the details of a Topup Card.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.AcquiringCardTopupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
        String userId = "12345"; // String | The owning user identifier
        String topupCardId = "12345"; // String | The identifier of the topup card to be retrieved
        try {
            TopupCards result = apiInstance.getTopupCard(userId, topupCardId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AcquiringCardTopupsApi#getTopupCard");
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
| **userId** | **String**| The owning user identifier | |
| **topupCardId** | **String**| The identifier of the topup card to be retrieved | |

### Return type

[**TopupCards**](TopupCards.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A topup card details search response |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## getTopupCards

> TopupCards getTopupCards(userId)

Search Topup Cards

Get topup cards.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.AcquiringCardTopupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
        String userId = "12345"; // String | The owning user identifier
        try {
            TopupCards result = apiInstance.getTopupCards(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AcquiringCardTopupsApi#getTopupCards");
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
| **userId** | **String**| The owning user identifier | |

### Return type

[**TopupCards**](TopupCards.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A topup cards details search response |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## postAcqAuth

> Authorization postAcqAuth(authorizationRequest)

Create Authorization

Create an authorization to make a card topup payin within 7 days. The card must be [tokenized](/guide/acquiring/card-tokenization.html) first. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.AcquiringCardTopupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
        AuthorizationRequest authorizationRequest = new AuthorizationRequest(); // AuthorizationRequest | 
        try {
            Authorization result = apiInstance.postAcqAuth(authorizationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AcquiringCardTopupsApi#postAcqAuth");
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
| **authorizationRequest** | [**AuthorizationRequest**](AuthorizationRequest.md)|  | [optional] |

### Return type

[**Authorization**](Authorization.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An authorization has been created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## postAcqAuthPayin

> CaptureResponse postAcqAuthPayin(authorizationUuid, postAcqAuthPayinRequest)

Create Payin from Authorization

Create a payin from an authorization. The amount must be ≤ to the authorization amount. [Learn more](/guide/acquiring/preauthorized.html#advanced-capture).

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.AcquiringCardTopupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
        UUID authorizationUuid = UUID.fromString("9ea4c7f6-50a2-4679-8634-dfe42f03cbdc"); // UUID | Universally unique identifier (UUID) of the authorization
        PostAcqAuthPayinRequest postAcqAuthPayinRequest = new PostAcqAuthPayinRequest(); // PostAcqAuthPayinRequest | 
        try {
            CaptureResponse result = apiInstance.postAcqAuthPayin(authorizationUuid, postAcqAuthPayinRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AcquiringCardTopupsApi#postAcqAuthPayin");
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
| **authorizationUuid** | **UUID**| Universally unique identifier (UUID) of the authorization | |
| **postAcqAuthPayinRequest** | [**PostAcqAuthPayinRequest**](PostAcqAuthPayinRequest.md)|  | [optional] |

### Return type

[**CaptureResponse**](CaptureResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payin returned |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## postTopupCard

> TopupCards postTopupCard(userId, topupCardRequest)

Create Topup Card

Create a new topup card. The card must have been previously tokenized. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.AcquiringCardTopupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
        String userId = "12345"; // String | The owning user identifier
        TopupCardRequest topupCardRequest = new TopupCardRequest(); // TopupCardRequest | 
        try {
            TopupCards result = apiInstance.postTopupCard(userId, topupCardRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AcquiringCardTopupsApi#postTopupCard");
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
| **userId** | **String**| The owning user identifier | |
| **topupCardRequest** | [**TopupCardRequest**](TopupCardRequest.md)|  | [optional] |

### Return type

[**TopupCards**](TopupCards.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Topup card was created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

