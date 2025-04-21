# CardRulesetsMdcApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**attachRulesetToCard**](CardRulesetsMdcApi.md#attachRulesetToCard) | **POST** /v1/mdc/{cardId}/rulesets | Assign Rulesets |
| [**createRuleset**](CardRulesetsMdcApi.md#createRuleset) | **POST** /v1/mdc/rulesets | Create Ruleset |
| [**disableRuleset**](CardRulesetsMdcApi.md#disableRuleset) | **DELETE** /v1/mdc/rulesets/{rulesetId} | Disable Ruleset |
| [**getFactsBalance**](CardRulesetsMdcApi.md#getFactsBalance) | **GET** /v1/mdc/{cardId}/ruleset/{rulesetId}/factsBalance | Retrieve Ruleset virtual balance |
| [**getRuleset**](CardRulesetsMdcApi.md#getRuleset) | **GET** /v1/mdc/rulesets/{rulesetId} | Get Ruleset |
| [**getRulesetFromCard**](CardRulesetsMdcApi.md#getRulesetFromCard) | **GET** /v1/mdc/{cardId}/rulesets | Retrieve Card Rulesets |
| [**getRulesets**](CardRulesetsMdcApi.md#getRulesets) | **GET** /v1/mdc/rulesets | Get Rulesets |
| [**putRuleset**](CardRulesetsMdcApi.md#putRuleset) | **PUT** /v1/mdc/rulesets/{rulesetId} | Update Ruleset |



## attachRulesetToCard

> attachRulesetToCard(cardId, cardRuleset)

Assign Rulesets

Assign rulesets to a given card.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardRulesetsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardRulesetsMdcApi apiInstance = new CardRulesetsMdcApi(defaultClient);
        String cardId = "12345"; // String | The unique identifier of the Card.
        List<CardRuleset> cardRuleset = Arrays.asList(); // List<CardRuleset> | 
        try {
            apiInstance.attachRulesetToCard(cardId, cardRuleset);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardRulesetsMdcApi#attachRulesetToCard");
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
| **cardId** | **String**| The unique identifier of the Card. | |
| **cardRuleset** | [**List&lt;CardRuleset&gt;**](CardRuleset.md)|  | |

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
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## createRuleset

> CreateRuleset201Response createRuleset(createRulesetRequest)

Create Ruleset

Create a Ruleset.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardRulesetsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardRulesetsMdcApi apiInstance = new CardRulesetsMdcApi(defaultClient);
        CreateRulesetRequest createRulesetRequest = new CreateRulesetRequest(); // CreateRulesetRequest | 
        try {
            CreateRuleset201Response result = apiInstance.createRuleset(createRulesetRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardRulesetsMdcApi#createRuleset");
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
| **createRulesetRequest** | [**CreateRulesetRequest**](CreateRulesetRequest.md)|  | |

### Return type

[**CreateRuleset201Response**](CreateRuleset201Response.md)

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
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## disableRuleset

> disableRuleset(rulesetId)

Disable Ruleset

Disable a Ruleset.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardRulesetsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardRulesetsMdcApi apiInstance = new CardRulesetsMdcApi(defaultClient);
        UUID rulesetId = UUID.fromString("9ea4c7f6-50a2-4679-8634-dfe42f03cbdc"); // UUID | The unique identifier of the Ruleset.
        try {
            apiInstance.disableRuleset(rulesetId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardRulesetsMdcApi#disableRuleset");
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
| **rulesetId** | **UUID**| The unique identifier of the Ruleset. | |

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
| **204** | No content |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |


## getFactsBalance

> GetFactsBalance200Response getFactsBalance(cardId, rulesetId)

Retrieve Ruleset virtual balance

Retrieve a ruleset virtual balance.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardRulesetsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardRulesetsMdcApi apiInstance = new CardRulesetsMdcApi(defaultClient);
        String cardId = "12345"; // String | The unique identifier of the Card.
        UUID rulesetId = UUID.fromString("9ea4c7f6-50a2-4679-8634-dfe42f03cbdc"); // UUID | The unique identifier of the Ruleset.
        try {
            GetFactsBalance200Response result = apiInstance.getFactsBalance(cardId, rulesetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardRulesetsMdcApi#getFactsBalance");
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
| **cardId** | **String**| The unique identifier of the Card. | |
| **rulesetId** | **UUID**| The unique identifier of the Ruleset. | |

### Return type

[**GetFactsBalance200Response**](GetFactsBalance200Response.md)

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


## getRuleset

> FullRuleset getRuleset(rulesetId)

Get Ruleset

Retrieve a Ruleset with its &#x60;id&#x60;.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardRulesetsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardRulesetsMdcApi apiInstance = new CardRulesetsMdcApi(defaultClient);
        UUID rulesetId = UUID.fromString("9ea4c7f6-50a2-4679-8634-dfe42f03cbdc"); // UUID | The unique identifier of the Ruleset.
        try {
            FullRuleset result = apiInstance.getRuleset(rulesetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardRulesetsMdcApi#getRuleset");
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
| **rulesetId** | **UUID**| The unique identifier of the Ruleset. | |

### Return type

[**FullRuleset**](FullRuleset.md)

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


## getRulesetFromCard

> List&lt;GetRulesetFromCard200ResponseInner&gt; getRulesetFromCard(cardId)

Retrieve Card Rulesets

Get all rulesets assigned to a given card.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardRulesetsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardRulesetsMdcApi apiInstance = new CardRulesetsMdcApi(defaultClient);
        String cardId = "12345"; // String | The unique identifier of the Card.
        try {
            List<GetRulesetFromCard200ResponseInner> result = apiInstance.getRulesetFromCard(cardId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardRulesetsMdcApi#getRulesetFromCard");
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
| **cardId** | **String**| The unique identifier of the Card. | |

### Return type

[**List&lt;GetRulesetFromCard200ResponseInner&gt;**](GetRulesetFromCard200ResponseInner.md)

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


## getRulesets

> GetRulesets200Response getRulesets()

Get Rulesets

Retrieve all rulesets.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardRulesetsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardRulesetsMdcApi apiInstance = new CardRulesetsMdcApi(defaultClient);
        try {
            GetRulesets200Response result = apiInstance.getRulesets();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardRulesetsMdcApi#getRulesets");
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

[**GetRulesets200Response**](GetRulesets200Response.md)

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


## putRuleset

> putRuleset(rulesetId, createRulesetRequest)

Update Ruleset

Modify a Ruleset.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.CardRulesetsMdcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CardRulesetsMdcApi apiInstance = new CardRulesetsMdcApi(defaultClient);
        UUID rulesetId = UUID.fromString("9ea4c7f6-50a2-4679-8634-dfe42f03cbdc"); // UUID | The unique identifier of the Ruleset.
        CreateRulesetRequest createRulesetRequest = new CreateRulesetRequest(); // CreateRulesetRequest | 
        try {
            apiInstance.putRuleset(rulesetId, createRulesetRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardRulesetsMdcApi#putRuleset");
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
| **rulesetId** | **UUID**| The unique identifier of the Ruleset. | |
| **createRulesetRequest** | [**CreateRulesetRequest**](CreateRulesetRequest.md)|  | |

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
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

