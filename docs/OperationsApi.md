# OperationsApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOperations**](OperationsApi.md#getOperations) | **GET** /core-connect/operations | Search Operations |
| [**getOperationsReport**](OperationsApi.md#getOperationsReport) | **GET** /core-connect/operations/{walletId}/report | Get Operations Report |
| [**postOperationsReport**](OperationsApi.md#postOperationsReport) | **POST** /core-connect/operations/{walletId}/report | Create Operations Report |
| [**simulateOperations**](OperationsApi.md#simulateOperations) | **POST** /simulation/operations | Simulate Operations |



## getOperations

> GetOperations200Response getOperations(cardId, walletId, dateFrom, dateTo, pageSize, operationType, cursor, initialFlow, direction, amountFrom, amountTo, status)

Search Operations

Retrieve Operations that match your search conditions. The request must specify at least: &#x60;walletId&#x60;, &#x60;dateTo&#x60;, &#x60;dateFrom&#x60;.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html) for operations that are more than 90 days old. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        Long cardId = 12345L; // Long | The unique identifier of the card.
        Long walletId = 12345L; // Long | The unique identifier of the Wallet.
        String dateFrom = "2025-04-18T11:00:00%2B01:00"; // String | The start of the period to take into account operations in RFC 339 date-time format (HTML encoded). The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes `2024-01-11T11:25:36%2B01:00`) 
        String dateTo = "2025-04-18T11:00:00%2B01:00"; // String | The end of the period to take into account operations in RFC 339 date-time format (HTML encoded). The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes `2024-01-11T11:25:36%2B01:00`) 
        Long pageSize = 15L; // Long | Number of results per page
        String operationType = "bankDirectDebit"; // String | The type of operation. Can't be cumulated with other query parameters.   By default, Treezor returns all operation types when this field isn't defined. 
        String cursor = "da4b9237bacccdf19c0760cab7aec4a8359010b0"; // String | Pagination cursor, if you don't pass a cursor, result will start at the first page. 
        List<String> initialFlow = Arrays.asList(); // List<String> | Technical context about the initial operation. Can't be cumulated with other query parameters.
        String direction = "CREDIT"; // String | Direction of the operation.
        Integer amountFrom = 56; // Integer | The minimum amount of the operations to take into account.
        String amountTo = "amountTo_example"; // String | The maximum amount of the operations to take into account.
        List<String> status = Arrays.asList(); // List<String> | The status of the operation.
        try {
            GetOperations200Response result = apiInstance.getOperations(cardId, walletId, dateFrom, dateTo, pageSize, operationType, cursor, initialFlow, direction, amountFrom, amountTo, status);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#getOperations");
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
| **cardId** | **Long**| The unique identifier of the card. | |
| **walletId** | **Long**| The unique identifier of the Wallet. | |
| **dateFrom** | **String**| The start of the period to take into account operations in RFC 339 date-time format (HTML encoded). The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;)  | |
| **dateTo** | **String**| The end of the period to take into account operations in RFC 339 date-time format (HTML encoded). The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;)  | |
| **pageSize** | **Long**| Number of results per page | [optional] [default to 15] |
| **operationType** | **String**| The type of operation. Can&#39;t be cumulated with other query parameters.   By default, Treezor returns all operation types when this field isn&#39;t defined.  | [optional] [enum: bankDirectDebit, bankTransfer, cardTopup, cardTransaction, check, creditNote, fees, intBankTransfer, instantBankTransfer, other, payinRefund, payoutRefund, transferRefund, walletTransfer] |
| **cursor** | **String**| Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.  | [optional] |
| **initialFlow** | [**List&lt;String&gt;**](String.md)| Technical context about the initial operation. Can&#39;t be cumulated with other query parameters. | [optional] [enum: cardTransaction, chargeback, payin, payinRefund, payout, payoutRefund, transfer] |
| **direction** | **String**| Direction of the operation. | [optional] [enum: CREDIT, DEBIT] |
| **amountFrom** | **Integer**| The minimum amount of the operations to take into account. | [optional] |
| **amountTo** | **String**| The maximum amount of the operations to take into account. | [optional] |
| **status** | [**List&lt;String&gt;**](String.md)| The status of the operation. | [optional] [enum: AUTHORIZED, CANCELED, DECLINED, SETTLED] |

### Return type

[**GetOperations200Response**](GetOperations200Response.md)

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
| **0** | Unexpected error |  -  |


## getOperationsReport

> GetOperationsReport200Response getOperationsReport(walletId, dateFrom, dateTo)

Get Operations Report

Retrieve an Operations Report based on the corresponding Wallet &#x60;id&#x60;.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        Integer walletId = 12345; // Integer | The unique identifier of the Wallet.
        String dateFrom = "2024-06-05T00:00:00%2B02:00"; // String | The date and time from which the operations are taken into account for the report. The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes `2024-01-11T11:25:36%2B01:00`) 
        String dateTo = "2024-07-05T00:00:00%2B02:00"; // String | The date and time up to which the operations are taken into account for the report. The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes `2024-01-11T11:25:36%2B01:00`) 
        try {
            GetOperationsReport200Response result = apiInstance.getOperationsReport(walletId, dateFrom, dateTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#getOperationsReport");
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
| **walletId** | **Integer**| The unique identifier of the Wallet. | |
| **dateFrom** | **String**| The date and time from which the operations are taken into account for the report. The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;)  | |
| **dateTo** | **String**| The date and time up to which the operations are taken into account for the report. The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;)  | |

### Return type

[**GetOperationsReport200Response**](GetOperationsReport200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |


## postOperationsReport

> postOperationsReport(walletId, postOperationsReportRequest)

Create Operations Report

Create a CSV export that includes all operations for a given Wallet on a given period.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        Integer walletId = 12345; // Integer | The unique identifier of the Wallet.
        PostOperationsReportRequest postOperationsReportRequest = new PostOperationsReportRequest(); // PostOperationsReportRequest | 
        try {
            apiInstance.postOperationsReport(walletId, postOperationsReportRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#postOperationsReport");
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
| **walletId** | **Integer**| The unique identifier of the Wallet. | |
| **postOperationsReportRequest** | [**PostOperationsReportRequest**](PostOperationsReportRequest.md)|  | [optional] |

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
| **0** | Unexpected error |  -  |


## simulateOperations

> simulateOperations(simulateOperationsRequest)

Simulate Operations

Create fake operations for a given Wallet. This may prove useful to test [Account Statements](/guide/wallets/account-statements.html) for instance. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        SimulateOperationsRequest simulateOperationsRequest = new SimulateOperationsRequest(); // SimulateOperationsRequest | 
        try {
            apiInstance.simulateOperations(simulateOperationsRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#simulateOperations");
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
| **simulateOperationsRequest** | [**SimulateOperationsRequest**](SimulateOperationsRequest.md)|  | [optional] |

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
| **0** | Unexpected error |  -  |

