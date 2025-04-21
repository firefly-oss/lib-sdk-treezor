# CardsApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateCard**](CardsApi.md#activateCard) | **PUT** /v1/cards/{cardId}/Activate | Activate Card |
| [**activateCardToken**](CardsApi.md#activateCardToken) | **PUT** /v1/cards/{cardToken}/public-token-activation | Activate Card Public Token |
| [**assignCardWallet**](CardsApi.md#assignCardWallet) | **PUT** /v1/cards/{cardId}/AssignWallet | Assign Wallet |
| [**cardOptions**](CardsApi.md#cardOptions) | **PUT** /v1/cards/{cardId}/Options | Update Card Options |
| [**changePin**](CardsApi.md#changePin) | **PUT** /v1/cards/{cardId}/ChangePIN | Change Card PIN |
| [**convertVirtual**](CardsApi.md#convertVirtual) | **PUT** /v1/cards/{cardId}/ConvertVirtual | Convert virtual card to physical |
| [**getCard**](CardsApi.md#getCard) | **GET** /v1/cards/{cardId} | Get Card |
| [**getCardImage**](CardsApi.md#getCardImage) | **GET** /v1/cardimages | Get Card Image |
| [**getCards**](CardsApi.md#getCards) | **GET** /v1/cards | Search Cards |
| [**getRenewalDetails**](CardsApi.md#getRenewalDetails) | **GET** /v1/cards/{cardId}/renewalDetails | Get Renewal Details |
| [**post3ds**](CardsApi.md#post3ds) | **POST** /v1/cards/Register3DS | Register 3D secure |
| [**postCardPhysical**](CardsApi.md#postCardPhysical) | **POST** /v1/cards/RequestPhysical | Create Physical Card |
| [**postCardVirtual**](CardsApi.md#postCardVirtual) | **POST** /v1/cards/CreateVirtual | Create Virtual Card |
| [**putCard**](CardsApi.md#putCard) | **PUT** /v1/cards/{cardId} | Update Card |
| [**putLimits**](CardsApi.md#putLimits) | **PUT** /v1/cards/{cardId}/Limits | Update Card Limits |
| [**putRenew**](CardsApi.md#putRenew) | **PUT** /v1/cards/{cardId}/renew | Renew Card |
| [**reassignCard**](CardsApi.md#reassignCard) | **PUT** /v1/cards/{cardId}/Assign | Reassign Card |
| [**regenerateCard**](CardsApi.md#regenerateCard) | **PUT** /v1/cards/{cardId}/Regenerate | Regenerate Card |
| [**setPin**](CardsApi.md#setPin) | **PUT** /v1/cards/{cardId}/setPIN | Set Card PIN |
| [**unblockCvc**](CardsApi.md#unblockCvc) | **PUT** /v1/cards/{cardId}/unblockcvc2 | Unblock Card CVC2 |
| [**unblockPin**](CardsApi.md#unblockPin) | **PUT** /v1/cards/{cardId}/UnblockPIN | Unblock Card PIN |
| [**updateBlockStatus**](CardsApi.md#updateBlockStatus) | **PUT** /v1/cards/{cardId}/LockUnlock | Update Card Lock Status |
| [**updateRenewalDetails**](CardsApi.md#updateRenewalDetails) | **PUT** /v1/cards/{cardId}/renewalDetails | Update Renewal Details |



## activateCard

> CardObject activateCard(cardId, activateCardRequest)

Activate Card

Activate the Card (updating the &#x60;isLive&#x60; attribute to &#x60;1&#x60;). A Card must be activated to be used.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        Integer cardId = 12345; // Integer | The unique identifier of the Card.
        ActivateCardRequest activateCardRequest = new ActivateCardRequest(); // ActivateCardRequest | 
        try {
            CardObject result = apiInstance.activateCard(cardId, activateCardRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#activateCard");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |
| **activateCardRequest** | [**ActivateCardRequest**](ActivateCardRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

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
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## activateCardToken

> CardObject activateCardToken(cardToken)

Activate Card Public Token

Activate the Card (updating the &#x60;isLive&#x60; attribute to &#x60;1&#x60;). Ideal for end user oriented action. A Card must be activated to be used.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        String cardToken = "12345"; // String | The `publicToken` of the Card.
        try {
            CardObject result = apiInstance.activateCardToken(cardToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#activateCardToken");
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
| **cardToken** | **String**| The &#x60;publicToken&#x60; of the Card. | |

### Return type

[**CardObject**](CardObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## assignCardWallet

> CardObject assignCardWallet(cardId, assignCardWalletRequest)

Assign Wallet

Assign the Card to another Wallet. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        Integer cardId = 12345; // Integer | The unique identifier of the Card to reassign.
        AssignCardWalletRequest assignCardWalletRequest = new AssignCardWalletRequest(); // AssignCardWalletRequest | 
        try {
            CardObject result = apiInstance.assignCardWallet(cardId, assignCardWalletRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#assignCardWallet");
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
| **cardId** | **Integer**| The unique identifier of the Card to reassign. | |
| **assignCardWalletRequest** | [**AssignCardWalletRequest**](AssignCardWalletRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

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
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## cardOptions

> CardObject cardOptions(cardId, cardOptionsRequest)

Update Card Options

Modify the Card permissions group.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        Integer cardId = 12345; // Integer | The unique identifier of the Card.
        CardOptionsRequest cardOptionsRequest = new CardOptionsRequest(); // CardOptionsRequest | 
        try {
            CardObject result = apiInstance.cardOptions(cardId, cardOptionsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#cardOptions");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |
| **cardOptionsRequest** | [**CardOptionsRequest**](CardOptionsRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

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
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## changePin

> CardObject changePin(cardId, changePinRequest)

Change Card PIN

Change the Card PIN code knowing the current one.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        Integer cardId = 12345; // Integer | The unique identifier of the Card.
        ChangePinRequest changePinRequest = new ChangePinRequest(); // ChangePinRequest | 
        try {
            CardObject result = apiInstance.changePin(cardId, changePinRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#changePin");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |
| **changePinRequest** | [**ChangePinRequest**](ChangePinRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

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
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## convertVirtual

> CardObject convertVirtual(cardId, convertVirtualRequest)

Convert virtual card to physical

Convert a virtual Card into a physical one. The converted card will be both virtual and physical. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        Integer cardId = 12345; // Integer | The unique identifier of the Card to convert.
        ConvertVirtualRequest convertVirtualRequest = new ConvertVirtualRequest(); // ConvertVirtualRequest | 
        try {
            CardObject result = apiInstance.convertVirtual(cardId, convertVirtualRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#convertVirtual");
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
| **cardId** | **Integer**| The unique identifier of the Card to convert. | |
| **convertVirtualRequest** | [**ConvertVirtualRequest**](ConvertVirtualRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

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
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## getCard

> CardObject getCard(cardId)

Get Card

Retrieve a Card based on its &#x60;id&#x60;.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        Long cardId = 12345L; // Long | The unique identifier of the Card.
        try {
            CardObject result = apiInstance.getCard(cardId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#getCard");
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
| **cardId** | **Long**| The unique identifier of the Card. | |

### Return type

[**CardObject**](CardObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |


## getCardImage

> GetCardImage200Response getCardImage(cardId, accessTag)

Get Card Image

Retrieve a virtual card image.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        Integer cardId = 56; // Integer | The unique identifier of the virtual card.
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        try {
            GetCardImage200Response result = apiInstance.getCardImage(cardId, accessTag);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#getCardImage");
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
| **cardId** | **Integer**| The unique identifier of the virtual card. | |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  | [optional] |

### Return type

[**GetCardImage200Response**](GetCardImage200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## getCards

> CardObject getCards(accessTag, cardId, userId, embossedName, publicToken, permsGroup, isPhysical, isConverted, lockStatus, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo)

Search Cards

Retrieve Cards based on search criteria.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        Integer cardId = 12345; // Integer | The unique identifier of the Card.
        Integer userId = 12345; // Integer | The unique identifier of the cardholder
        String embossedName = "embossedName_example"; // String | Embossed name of the card
        String publicToken = "publicToken_example"; // String | Public token of the card
        String permsGroup = "TRZ-CU-001"; // String | Permissions group of the card.   See [available values on the documentation](/guide/cards/restrictions-limits.html#permission-groups-permsgroup) 
        Integer isPhysical = 0; // Integer | Whether or not the card is a Physical Card. Values can be:   * `1` – Physical card   * `0` – Virtual card 
        Integer isConverted = 0; // Integer | Whether or not the card is a Virtual Card that has been converted into a Physical Card. Values can be:   * `1` – Physical card converted from a virtual card   * `0` – Not converted, virtual card only 
        Integer lockStatus = 0; // Integer | The Status of the card, indicating whether it is locked, lost, or destroyed for instance.  While this field is an integer, it returns a plaintext value. See the full list of `lockStatus`in the [Block a Card](/guide/cards/modification.html#status) article. 
        Integer mccRestrictionGroupId = 12345; // Integer | mccRestrictionGroupId of the card
        Integer merchantRestrictionGroupId = 12345; // Integer | merchantRestrictionGroupId of the card
        Integer countryRestrictionGroupId = 12345; // Integer | countryRestrictionGroupId of the card
        Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
        Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints   
        String sortBy = "id"; // String | The reference value for sorting the list. 
        String sortOrder = "ASC"; // String | The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
        OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result.  Format: `YYYY-MM-DD HH:mm:ss`.  
        OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result.  Format: `YYYY-MM-DD HH:mm:ss`.  
        OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result.   Format: `YYYY-MM-DD HH:mm:ss`.  
        OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result.  Format: `YYYY-MM-DD HH:mm:ss`.  
        try {
            CardObject result = apiInstance.getCards(accessTag, cardId, userId, embossedName, publicToken, permsGroup, isPhysical, isConverted, lockStatus, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#getCards");
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
| **cardId** | **Integer**| The unique identifier of the Card. | [optional] |
| **userId** | **Integer**| The unique identifier of the cardholder | [optional] |
| **embossedName** | **String**| Embossed name of the card | [optional] |
| **publicToken** | **String**| Public token of the card | [optional] |
| **permsGroup** | **String**| Permissions group of the card.   See [available values on the documentation](/guide/cards/restrictions-limits.html#permission-groups-permsgroup)  | [optional] [enum: TRZ-CU-001, TRZ-CU-002, TRZ-CU-003, TRZ-CU-004, TRZ-CU-005, TRZ-CU-006, TRZ-CU-007, TRZ-CU-008, TRZ-CU-009, TRZ-CU-010, TRZ-CU-011, TRZ-CU-012, TRZ-CU-013, TRZ-CU-014, TRZ-CU-015, TRZ-CU-016] |
| **isPhysical** | **Integer**| Whether or not the card is a Physical Card. Values can be:   * &#x60;1&#x60; – Physical card   * &#x60;0&#x60; – Virtual card  | [optional] [enum: 0, 1] |
| **isConverted** | **Integer**| Whether or not the card is a Virtual Card that has been converted into a Physical Card. Values can be:   * &#x60;1&#x60; – Physical card converted from a virtual card   * &#x60;0&#x60; – Not converted, virtual card only  | [optional] [enum: 0, 1] |
| **lockStatus** | **Integer**| The Status of the card, indicating whether it is locked, lost, or destroyed for instance.  While this field is an integer, it returns a plaintext value. See the full list of &#x60;lockStatus&#x60;in the [Block a Card](/guide/cards/modification.html#status) article.  | [optional] [enum: 0, 1, 2, 3, 4, 5, 6] |
| **mccRestrictionGroupId** | **Integer**| mccRestrictionGroupId of the card | [optional] |
| **merchantRestrictionGroupId** | **Integer**| merchantRestrictionGroupId of the card | [optional] |
| **countryRestrictionGroupId** | **Integer**| countryRestrictionGroupId of the card | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints    | [optional] |
| **sortBy** | **String**| The reference value for sorting the list.  | [optional] [default to id] [enum: id, createdDate] |
| **sortOrder** | **String**| The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending.  | [optional] [default to DESC] [enum: ASC, DESC] |
| **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.   | [optional] |
| **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.   | [optional] |
| **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.   | [optional] |
| **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.   | [optional] |

### Return type

[**CardObject**](CardObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |


## getRenewalDetails

> GetRenewalDetails200Response getRenewalDetails(cardId)

Get Renewal Details

Retrieve the Card &#x60;renewalType&#x60;. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        Integer cardId = 12345; // Integer | The unique identifier of the Card.
        try {
            GetRenewalDetails200Response result = apiInstance.getRenewalDetails(cardId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#getRenewalDetails");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |

### Return type

[**GetRenewalDetails200Response**](GetRenewalDetails200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## post3ds

> CardObject post3ds(post3dsRequest)

Register 3D secure

Register a card to 3D secure service. The user&#39;s mobile number must begin with &#x60;+&#x60;, or &#x60;00&#x60;, and the country dialing code. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        Post3dsRequest post3dsRequest = new Post3dsRequest(); // Post3dsRequest | 
        try {
            CardObject result = apiInstance.post3ds(post3dsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#post3ds");
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
| **post3dsRequest** | [**Post3dsRequest**](Post3dsRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

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
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## postCardPhysical

> CardObject postCardPhysical(postCardPhysicalRequest)

Create Physical Card

Create a new physical card. To use a card, it must be activated (&#x60;/cards/{id}/Activate&#x60;).  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        PostCardPhysicalRequest postCardPhysicalRequest = new PostCardPhysicalRequest(); // PostCardPhysicalRequest | 
        try {
            CardObject result = apiInstance.postCardPhysical(postCardPhysicalRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#postCardPhysical");
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
| **postCardPhysicalRequest** | [**PostCardPhysicalRequest**](PostCardPhysicalRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

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
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## postCardVirtual

> CardObject postCardVirtual(postCardVirtualRequest)

Create Virtual Card

Create a new virtual card. To use a card, it must be activated (&#x60;/v1/cards/{cardId}/Activate&#x60;).  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        PostCardVirtualRequest postCardVirtualRequest = new PostCardVirtualRequest(); // PostCardVirtualRequest | 
        try {
            CardObject result = apiInstance.postCardVirtual(postCardVirtualRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#postCardVirtual");
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
| **postCardVirtualRequest** | [**PostCardVirtualRequest**](PostCardVirtualRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

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
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## putCard

> CardObject putCard(cardId, putCardRequest)

Update Card

Update the restriction groups of the card, as well as the &#x60;cardTag&#x60;. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        Integer cardId = 12345; // Integer | The unique identifier of the Card.
        PutCardRequest putCardRequest = new PutCardRequest(); // PutCardRequest | 
        try {
            CardObject result = apiInstance.putCard(cardId, putCardRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#putCard");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |
| **putCardRequest** | [**PutCardRequest**](PutCardRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

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
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## putLimits

> CardObject putLimits(cardId, putLimitsRequest)

Update Card Limits

Modify the Card limits.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        Integer cardId = 12345; // Integer | The unique identifier of the Card.
        PutLimitsRequest putLimitsRequest = new PutLimitsRequest(); // PutLimitsRequest | 
        try {
            CardObject result = apiInstance.putLimits(cardId, putLimitsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#putLimits");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |
| **putLimitsRequest** | [**PutLimitsRequest**](PutLimitsRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

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
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## putRenew

> CardObject putRenew(cardId)

Renew Card

Renew a Card manually. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        Integer cardId = 12345; // Integer | The unique identifier of the Card.
        try {
            CardObject result = apiInstance.putRenew(cardId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#putRenew");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |

### Return type

[**CardObject**](CardObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## reassignCard

> CardObject reassignCard(cardId, reassignCardRequest)

Reassign Card

Assign the Card to another User or Wallet. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        Integer cardId = 12345; // Integer | The unique identifier of the Card to reassign.
        ReassignCardRequest reassignCardRequest = new ReassignCardRequest(); // ReassignCardRequest | 
        try {
            CardObject result = apiInstance.reassignCard(cardId, reassignCardRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#reassignCard");
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
| **cardId** | **Integer**| The unique identifier of the Card to reassign. | |
| **reassignCardRequest** | [**ReassignCardRequest**](ReassignCardRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

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
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## regenerateCard

> CardObject regenerateCard(cardId, convertVirtualRequest)

Regenerate Card

Recreate the card image if the card is unlocked.   Useful when changing card design, company name, or when retrieving the image results in a 404. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        Integer cardId = 12345; // Integer | The unique identifier of the Card.
        ConvertVirtualRequest convertVirtualRequest = new ConvertVirtualRequest(); // ConvertVirtualRequest | 
        try {
            CardObject result = apiInstance.regenerateCard(cardId, convertVirtualRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#regenerateCard");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |
| **convertVirtualRequest** | [**ConvertVirtualRequest**](ConvertVirtualRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

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
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## setPin

> CardObject setPin(cardId, setPinRequest)

Set Card PIN

Overwrite the Card PIN code.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        Integer cardId = 12345; // Integer | The unique identifier of the Card.
        SetPinRequest setPinRequest = new SetPinRequest(); // SetPinRequest | 
        try {
            CardObject result = apiInstance.setPin(cardId, setPinRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#setPin");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |
| **setPinRequest** | [**SetPinRequest**](SetPinRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

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
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## unblockCvc

> unblockCvc(cardId)

Unblock Card CVC2

Unblock a Card whose CVC2 is locked.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        Integer cardId = 12345; // Integer | The unique identifier of the Card.
        try {
            apiInstance.unblockCvc(cardId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#unblockCvc");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successfully unblocked. |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## unblockPin

> CardObject unblockPin(cardId, convertVirtualRequest)

Unblock Card PIN

Unblock the Card PIN code.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        Integer cardId = 12345; // Integer | The unique identifier of the Card.
        ConvertVirtualRequest convertVirtualRequest = new ConvertVirtualRequest(); // ConvertVirtualRequest | 
        try {
            CardObject result = apiInstance.unblockPin(cardId, convertVirtualRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#unblockPin");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |
| **convertVirtualRequest** | [**ConvertVirtualRequest**](ConvertVirtualRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

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
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## updateBlockStatus

> CardObject updateBlockStatus(cardId, updateBlockStatusRequest)

Update Card Lock Status

Block or unblock a card.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        Integer cardId = 12345; // Integer | The unique identifier of the Card.
        UpdateBlockStatusRequest updateBlockStatusRequest = new UpdateBlockStatusRequest(); // UpdateBlockStatusRequest | 
        try {
            CardObject result = apiInstance.updateBlockStatus(cardId, updateBlockStatusRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#updateBlockStatus");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |
| **updateBlockStatusRequest** | [**UpdateBlockStatusRequest**](UpdateBlockStatusRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

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
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |


## updateRenewalDetails

> GetRenewalDetails200Response updateRenewalDetails(cardId, updateRenewalDetailsRequest)

Update Renewal Details

Update the Card &#x60;renewalType&#x60;. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardsApi apiInstance = new CardsApi(defaultClient);
        Integer cardId = 12345; // Integer | The unique identifier of the Card.
        UpdateRenewalDetailsRequest updateRenewalDetailsRequest = new UpdateRenewalDetailsRequest(); // UpdateRenewalDetailsRequest | 
        try {
            GetRenewalDetails200Response result = apiInstance.updateRenewalDetails(cardId, updateRenewalDetailsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardsApi#updateRenewalDetails");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |
| **updateRenewalDetailsRequest** | [**UpdateRenewalDetailsRequest**](UpdateRenewalDetailsRequest.md)|  | [optional] |

### Return type

[**GetRenewalDetails200Response**](GetRenewalDetails200Response.md)

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
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

