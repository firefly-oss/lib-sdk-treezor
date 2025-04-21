# TransactionsApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTransaction**](TransactionsApi.md#getTransaction) | **GET** /v1/transactions/{transactionId} | Get Transaction |
| [**getTransactions**](TransactionsApi.md#getTransactions) | **GET** /v1/transactions | Search Transactions |



## getTransaction

> TransactionObject getTransaction(transactionId)

Get Transaction

Retrieve a transaction.

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.TransactionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        TransactionsApi apiInstance = new TransactionsApi(defaultClient);
        Long transactionId = 12345L; // Long | The unique identifier of the Transaction.
        try {
            TransactionObject result = apiInstance.getTransaction(transactionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#getTransaction");
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
| **transactionId** | **Long**| The unique identifier of the Transaction. | |

### Return type

[**TransactionObject**](TransactionObject.md)

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


## getTransactions

> TransactionObject getTransactions(accessTag, transactionId, transactionType, transactionTypeId, walletId, userId, name, description, amount, currency, valueDate, executionDate, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo)

Search Transactions

Retrieve Transactions that match search criteria. The request must contain at least one of the following inputs: &#x60;walletId&#x60;, &#x60;transactionId&#x60;, &#x60;executionDate&#x60;, &#x60;valueDate&#x60; 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.TransactionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        TransactionsApi apiInstance = new TransactionsApi(defaultClient);
        String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
        Integer transactionId = 12345; // Integer | The unique identifier of the transaction.
        String transactionType = "Payin"; // String | Names of the transaction types. Please refer to the [Transactions](/guide/wallets/transactions.html#transaction-types-transactiontype) article for the list of possible values. 
        Integer transactionTypeId = 1; // Integer | The Id of the transaction types. Please refer to the [Transactions](/guide/wallets/transactions.html#transaction-types-transactiontype) article for the list of possible values. 
        Integer walletId = 12345; // Integer | Unique identifier of the transactions Wallet.
        Integer userId = 12345; // Integer | Unique identifier of the transactions User.
        String name = "name_example"; // String | The name of the transaction.
        String description = "description_example"; // String | The description of the transaction.
        String amount = "amount_example"; // String | The amount of the transaction.
        String currency = "EUR"; // String | The currency of the transaction amount currency. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies). 
        LocalDate valueDate = LocalDate.parse("Wed Jan 01 01:00:00 CET 2025"); // LocalDate | The value date of the transaction (date applied for the payment).  Format: `YYYY-MM-DD` 
        LocalDate executionDate = LocalDate.parse("Wed Jan 01 01:00:00 CET 2025"); // LocalDate | Date of the execution of the transaction.  Format: `YYYY-MM-DD` 
        Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
        Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints   
        String sortBy = "createdDate"; // String | The transaction element you want to sort the list with. 
        String sortOrder = "ASC"; // String | The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
        OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result.  Format: `YYYY-MM-DD HH:mm:ss` 
        OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result.  Format: `YYYY-MM-DD HH:mm:ss` 
        try {
            TransactionObject result = apiInstance.getTransactions(accessTag, transactionId, transactionType, transactionTypeId, walletId, userId, name, description, amount, currency, valueDate, executionDate, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#getTransactions");
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
| **transactionId** | **Integer**| The unique identifier of the transaction. | [optional] |
| **transactionType** | **String**| Names of the transaction types. Please refer to the [Transactions](/guide/wallets/transactions.html#transaction-types-transactiontype) article for the list of possible values.  | [optional] [enum: Payin, Payout, Transfer, Payin Refund, Card Transaction, Payout Refund, Payin Acquiring, Payin Refund Acquiring, SCTR Inst, Payin SCT Instant Recall, Payout SCT Instant Emit, Payin SCT Instant Emit Recall, Credit Transfer Returned, Check Payin, SDDE, SDDR, SDDR Reversal, SCTR Recall, Check Refund, SCTR] |
| **transactionTypeId** | **Integer**| The Id of the transaction types. Please refer to the [Transactions](/guide/wallets/transactions.html#transaction-types-transactiontype) article for the list of possible values.  | [optional] [enum: 1, 2, 3, 5, 10, 11, 13, 14, 15, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27] |
| **walletId** | **Integer**| Unique identifier of the transactions Wallet. | [optional] |
| **userId** | **Integer**| Unique identifier of the transactions User. | [optional] |
| **name** | **String**| The name of the transaction. | [optional] |
| **description** | **String**| The description of the transaction. | [optional] |
| **amount** | **String**| The amount of the transaction. | [optional] |
| **currency** | **String**| The currency of the transaction amount currency. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies).  | [optional] |
| **valueDate** | **LocalDate**| The value date of the transaction (date applied for the payment).  Format: &#x60;YYYY-MM-DD&#x60;  | [optional] |
| **executionDate** | **LocalDate**| Date of the execution of the transaction.  Format: &#x60;YYYY-MM-DD&#x60;  | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints    | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with.  | [optional] [default to createdDate] |
| **sortOrder** | **String**| The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending.  | [optional] [default to DESC] [enum: ASC, DESC] |
| **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  | [optional] |
| **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  | [optional] |

### Return type

[**TransactionObject**](TransactionObject.md)

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

