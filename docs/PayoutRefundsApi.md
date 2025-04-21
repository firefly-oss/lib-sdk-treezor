# PayoutRefundsApi

All URIs are relative to *https://baseURL.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPayoutRefund**](PayoutRefundsApi.md#getPayoutRefund) | **GET** /v1/payoutRefunds/{payoutRefundId} | Get Payout Refund |
| [**postPayoutRefund**](PayoutRefundsApi.md#postPayoutRefund) | **POST** /v1/payoutRefunds | Create Payout Refund |



## getPayoutRefund

> GetPayoutRefund200Response getPayoutRefund(payoutRefundId)

Get Payout Refund

Retrieve a given Payout Refund with its &#x60;id&#x60;. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.PayoutRefundsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        PayoutRefundsApi apiInstance = new PayoutRefundsApi(defaultClient);
        String payoutRefundId = "12345"; // String | The unique identifier of the payout refund.
        try {
            GetPayoutRefund200Response result = apiInstance.getPayoutRefund(payoutRefundId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PayoutRefundsApi#getPayoutRefund");
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
| **payoutRefundId** | **String**| The unique identifier of the payout refund. | |

### Return type

[**GetPayoutRefund200Response**](GetPayoutRefund200Response.md)

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


## postPayoutRefund

> PostPayoutRefund200Response postPayoutRefund(postPayoutRefundRequest)

Create Payout Refund

Create a Payout Refund.  As of today, this feature is only available for [emitting SCTE Inst Recalls](/guide/transfers/sepa-recalls.html#emitting-scte-inst-recalls).  For SCTE Recalls and SDDR Refunds, you need to [open a ticket](https://treezor.zendesk.com/hc/en-us/articles/4403978479634-How-to-create-a-Zendesk-ticket) to request Payout Refund. 

### Example

```java
// Import classes:
import com.sdk.treezor.ApiClient;
import com.sdk.treezor.ApiException;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.auth.*;
import com.sdk.treezor.models.*;
import com.sdk.treezor.api.PayoutRefundsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://baseURL.co");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        PayoutRefundsApi apiInstance = new PayoutRefundsApi(defaultClient);
        PostPayoutRefundRequest postPayoutRefundRequest = new PostPayoutRefundRequest(); // PostPayoutRefundRequest | 
        try {
            PostPayoutRefund200Response result = apiInstance.postPayoutRefund(postPayoutRefundRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PayoutRefundsApi#postPayoutRefund");
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
| **postPayoutRefundRequest** | [**PostPayoutRefundRequest**](PostPayoutRefundRequest.md)|  | [optional] |

### Return type

[**PostPayoutRefund200Response**](PostPayoutRefund200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |

