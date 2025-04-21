package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.GetCoCardTransactions200Response;
import com.sdk.treezor.model.ReadCardTransaction200Response;
import com.sdk.treezor.model.SimulateCardTransactions201ResponseInner;
import com.sdk.treezor.model.SimulateCardTransactionsRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-14T09:49:28.273669400+02:00[Europe/Paris]", comments = "Generator version: 7.12.0")
public class CardTransactionsApi {
    private ApiClient apiClient;

    public CardTransactionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public CardTransactionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Get Card Transaction
     * Retrieve a Card Transaction based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param cardtransactionId The unique identifier of the Card Transaction.
     * @return ReadCardTransaction200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCardtransactionRequestCreation(Long cardtransactionId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cardtransactionId' is set
        if (cardtransactionId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardtransactionId' when calling getCardtransaction", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("cardtransactionId", cardtransactionId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<ReadCardTransaction200Response> localVarReturnType = new ParameterizedTypeReference<ReadCardTransaction200Response>() {};
        return apiClient.invokeAPI("/v1/cardtransactions/{cardtransactionId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Card Transaction
     * Retrieve a Card Transaction based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param cardtransactionId The unique identifier of the Card Transaction.
     * @return ReadCardTransaction200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ReadCardTransaction200Response> getCardtransaction(Long cardtransactionId) throws WebClientResponseException {
        ParameterizedTypeReference<ReadCardTransaction200Response> localVarReturnType = new ParameterizedTypeReference<ReadCardTransaction200Response>() {};
        return getCardtransactionRequestCreation(cardtransactionId).bodyToMono(localVarReturnType);
    }

    /**
     * Get Card Transaction
     * Retrieve a Card Transaction based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param cardtransactionId The unique identifier of the Card Transaction.
     * @return ResponseEntity&lt;ReadCardTransaction200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ReadCardTransaction200Response>> getCardtransactionWithHttpInfo(Long cardtransactionId) throws WebClientResponseException {
        ParameterizedTypeReference<ReadCardTransaction200Response> localVarReturnType = new ParameterizedTypeReference<ReadCardTransaction200Response>() {};
        return getCardtransactionRequestCreation(cardtransactionId).toEntity(localVarReturnType);
    }

    /**
     * Get Card Transaction
     * Retrieve a Card Transaction based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param cardtransactionId The unique identifier of the Card Transaction.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCardtransactionWithResponseSpec(Long cardtransactionId) throws WebClientResponseException {
        return getCardtransactionRequestCreation(cardtransactionId);
    }

    /**
     * Get Card Transactions
     * Retrieve the Card Transactions for a specific card. This request is preferred for a dashboard-oriented usage. You shouldn&#39;t expose this endpoint to your end users.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the card.
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @param createdDateFrom The date and time from which the transactions are taken into account in RFC 339 date-time format (HTML encoded).
     * @param createdDateTo The date and time up to which the transactions are taken into account in RFC 339 date-time format (HTML encoded).
     * @param amountFrom The minimum amount of the transactions to be taken into account.
     * @param amountTo The maximum amount of the transactions to be taken into account.
     * @param paymentStatus The paymentStatus parameter
     * @param paymentType The paymentType parameter
     * @param merchantId The unique identifier of the merchant. See [Merchant Identification Number (MID)](/guide/overview/glossary.html#merchant-identification-number-mid). 
     * @return GetCoCardTransactions200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCoCardTransactionRequestCreation(String cardId, String cursor, String createdDateFrom, String createdDateTo, Float amountFrom, Float amountTo, List<String> paymentStatus, List<String> paymentType, String merchantId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling getCoCardTransaction", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("cardId", cardId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdDateFrom", createdDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdDateTo", createdDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "amountFrom", amountFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "amountTo", amountTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "paymentStatus", paymentStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "paymentType", paymentType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "merchantId", merchantId));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<GetCoCardTransactions200Response> localVarReturnType = new ParameterizedTypeReference<GetCoCardTransactions200Response>() {};
        return apiClient.invokeAPI("/core-connect/cardtransactions/{cardId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Card Transactions
     * Retrieve the Card Transactions for a specific card. This request is preferred for a dashboard-oriented usage. You shouldn&#39;t expose this endpoint to your end users.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the card.
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @param createdDateFrom The date and time from which the transactions are taken into account in RFC 339 date-time format (HTML encoded).
     * @param createdDateTo The date and time up to which the transactions are taken into account in RFC 339 date-time format (HTML encoded).
     * @param amountFrom The minimum amount of the transactions to be taken into account.
     * @param amountTo The maximum amount of the transactions to be taken into account.
     * @param paymentStatus The paymentStatus parameter
     * @param paymentType The paymentType parameter
     * @param merchantId The unique identifier of the merchant. See [Merchant Identification Number (MID)](/guide/overview/glossary.html#merchant-identification-number-mid). 
     * @return GetCoCardTransactions200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetCoCardTransactions200Response> getCoCardTransaction(String cardId, String cursor, String createdDateFrom, String createdDateTo, Float amountFrom, Float amountTo, List<String> paymentStatus, List<String> paymentType, String merchantId) throws WebClientResponseException {
        ParameterizedTypeReference<GetCoCardTransactions200Response> localVarReturnType = new ParameterizedTypeReference<GetCoCardTransactions200Response>() {};
        return getCoCardTransactionRequestCreation(cardId, cursor, createdDateFrom, createdDateTo, amountFrom, amountTo, paymentStatus, paymentType, merchantId).bodyToMono(localVarReturnType);
    }

    /**
     * Get Card Transactions
     * Retrieve the Card Transactions for a specific card. This request is preferred for a dashboard-oriented usage. You shouldn&#39;t expose this endpoint to your end users.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the card.
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @param createdDateFrom The date and time from which the transactions are taken into account in RFC 339 date-time format (HTML encoded).
     * @param createdDateTo The date and time up to which the transactions are taken into account in RFC 339 date-time format (HTML encoded).
     * @param amountFrom The minimum amount of the transactions to be taken into account.
     * @param amountTo The maximum amount of the transactions to be taken into account.
     * @param paymentStatus The paymentStatus parameter
     * @param paymentType The paymentType parameter
     * @param merchantId The unique identifier of the merchant. See [Merchant Identification Number (MID)](/guide/overview/glossary.html#merchant-identification-number-mid). 
     * @return ResponseEntity&lt;GetCoCardTransactions200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetCoCardTransactions200Response>> getCoCardTransactionWithHttpInfo(String cardId, String cursor, String createdDateFrom, String createdDateTo, Float amountFrom, Float amountTo, List<String> paymentStatus, List<String> paymentType, String merchantId) throws WebClientResponseException {
        ParameterizedTypeReference<GetCoCardTransactions200Response> localVarReturnType = new ParameterizedTypeReference<GetCoCardTransactions200Response>() {};
        return getCoCardTransactionRequestCreation(cardId, cursor, createdDateFrom, createdDateTo, amountFrom, amountTo, paymentStatus, paymentType, merchantId).toEntity(localVarReturnType);
    }

    /**
     * Get Card Transactions
     * Retrieve the Card Transactions for a specific card. This request is preferred for a dashboard-oriented usage. You shouldn&#39;t expose this endpoint to your end users.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the card.
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @param createdDateFrom The date and time from which the transactions are taken into account in RFC 339 date-time format (HTML encoded).
     * @param createdDateTo The date and time up to which the transactions are taken into account in RFC 339 date-time format (HTML encoded).
     * @param amountFrom The minimum amount of the transactions to be taken into account.
     * @param amountTo The maximum amount of the transactions to be taken into account.
     * @param paymentStatus The paymentStatus parameter
     * @param paymentType The paymentType parameter
     * @param merchantId The unique identifier of the merchant. See [Merchant Identification Number (MID)](/guide/overview/glossary.html#merchant-identification-number-mid). 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCoCardTransactionWithResponseSpec(String cardId, String cursor, String createdDateFrom, String createdDateTo, Float amountFrom, Float amountTo, List<String> paymentStatus, List<String> paymentType, String merchantId) throws WebClientResponseException {
        return getCoCardTransactionRequestCreation(cardId, cursor, createdDateFrom, createdDateTo, amountFrom, amountTo, paymentStatus, paymentType, merchantId);
    }

    /**
     * Get all Card Transactions
     * Retrieve all the Card Transactions. This is the preferred request for a dashboard-oriented approach. You shouldn&#39;t expose this endpoint to your end users.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @param createdDateFrom The date and time from which the transactions are taken into account in RFC 339 date-time format (HTML encoded). 
     * @param createdDateTo The date and time up to which the transactions are taken into account in RFC 339 date-time format (HTML encoded). 
     * @return GetCoCardTransactions200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCoCardTransactionsRequestCreation(String cursor, String createdDateFrom, String createdDateTo) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdDateFrom", createdDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdDateTo", createdDateTo));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<GetCoCardTransactions200Response> localVarReturnType = new ParameterizedTypeReference<GetCoCardTransactions200Response>() {};
        return apiClient.invokeAPI("/core-connect/cardtransactions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all Card Transactions
     * Retrieve all the Card Transactions. This is the preferred request for a dashboard-oriented approach. You shouldn&#39;t expose this endpoint to your end users.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @param createdDateFrom The date and time from which the transactions are taken into account in RFC 339 date-time format (HTML encoded). 
     * @param createdDateTo The date and time up to which the transactions are taken into account in RFC 339 date-time format (HTML encoded). 
     * @return GetCoCardTransactions200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetCoCardTransactions200Response> getCoCardTransactions(String cursor, String createdDateFrom, String createdDateTo) throws WebClientResponseException {
        ParameterizedTypeReference<GetCoCardTransactions200Response> localVarReturnType = new ParameterizedTypeReference<GetCoCardTransactions200Response>() {};
        return getCoCardTransactionsRequestCreation(cursor, createdDateFrom, createdDateTo).bodyToMono(localVarReturnType);
    }

    /**
     * Get all Card Transactions
     * Retrieve all the Card Transactions. This is the preferred request for a dashboard-oriented approach. You shouldn&#39;t expose this endpoint to your end users.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @param createdDateFrom The date and time from which the transactions are taken into account in RFC 339 date-time format (HTML encoded). 
     * @param createdDateTo The date and time up to which the transactions are taken into account in RFC 339 date-time format (HTML encoded). 
     * @return ResponseEntity&lt;GetCoCardTransactions200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetCoCardTransactions200Response>> getCoCardTransactionsWithHttpInfo(String cursor, String createdDateFrom, String createdDateTo) throws WebClientResponseException {
        ParameterizedTypeReference<GetCoCardTransactions200Response> localVarReturnType = new ParameterizedTypeReference<GetCoCardTransactions200Response>() {};
        return getCoCardTransactionsRequestCreation(cursor, createdDateFrom, createdDateTo).toEntity(localVarReturnType);
    }

    /**
     * Get all Card Transactions
     * Retrieve all the Card Transactions. This is the preferred request for a dashboard-oriented approach. You shouldn&#39;t expose this endpoint to your end users.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @param createdDateFrom The date and time from which the transactions are taken into account in RFC 339 date-time format (HTML encoded). 
     * @param createdDateTo The date and time up to which the transactions are taken into account in RFC 339 date-time format (HTML encoded). 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCoCardTransactionsWithResponseSpec(String cursor, String createdDateFrom, String createdDateTo) throws WebClientResponseException {
        return getCoCardTransactionsRequestCreation(cursor, createdDateFrom, createdDateTo);
    }

    /**
     * Search Card Transactions
     * Retrieve Card Transactions based at least on one of the following intputs: &#x60;cardId&#x60;, &#x60;paymentId&#x60;, &#x60;publicToken&#x60;, &#x60;walletId&#x60;. This is the preferred request for end user-oriented usage. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param cardtransactionId The unique identifier of the Card Transaction.
     * @param cardId The unique identifier of the Card.
     * @param walletId The unique identifier of the Wallet the card is attached to.
     * @param merchantId The Merchant&#39;s Id.
     * @param publicToken The public token of the Card.
     * @param paymentId The unique identifier of the card payment (or attempted payment), allowing you to follow the card transaction life cycle.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @return ReadCardTransaction200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readCardTransactionRequestCreation(String accessTag, Integer cardtransactionId, Integer cardId, Integer walletId, String merchantId, String publicToken, Integer paymentId, Integer pageNumber, Integer pageCount, String sortBy) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cardtransactionId", cardtransactionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cardId", cardId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "walletId", walletId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "merchantId", merchantId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "publicToken", publicToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paymentId", paymentId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageCount", pageCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortBy", sortBy));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<ReadCardTransaction200Response> localVarReturnType = new ParameterizedTypeReference<ReadCardTransaction200Response>() {};
        return apiClient.invokeAPI("/v1/cardtransactions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search Card Transactions
     * Retrieve Card Transactions based at least on one of the following intputs: &#x60;cardId&#x60;, &#x60;paymentId&#x60;, &#x60;publicToken&#x60;, &#x60;walletId&#x60;. This is the preferred request for end user-oriented usage. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param cardtransactionId The unique identifier of the Card Transaction.
     * @param cardId The unique identifier of the Card.
     * @param walletId The unique identifier of the Wallet the card is attached to.
     * @param merchantId The Merchant&#39;s Id.
     * @param publicToken The public token of the Card.
     * @param paymentId The unique identifier of the card payment (or attempted payment), allowing you to follow the card transaction life cycle.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @return ReadCardTransaction200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ReadCardTransaction200Response> readCardTransaction(String accessTag, Integer cardtransactionId, Integer cardId, Integer walletId, String merchantId, String publicToken, Integer paymentId, Integer pageNumber, Integer pageCount, String sortBy) throws WebClientResponseException {
        ParameterizedTypeReference<ReadCardTransaction200Response> localVarReturnType = new ParameterizedTypeReference<ReadCardTransaction200Response>() {};
        return readCardTransactionRequestCreation(accessTag, cardtransactionId, cardId, walletId, merchantId, publicToken, paymentId, pageNumber, pageCount, sortBy).bodyToMono(localVarReturnType);
    }

    /**
     * Search Card Transactions
     * Retrieve Card Transactions based at least on one of the following intputs: &#x60;cardId&#x60;, &#x60;paymentId&#x60;, &#x60;publicToken&#x60;, &#x60;walletId&#x60;. This is the preferred request for end user-oriented usage. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param cardtransactionId The unique identifier of the Card Transaction.
     * @param cardId The unique identifier of the Card.
     * @param walletId The unique identifier of the Wallet the card is attached to.
     * @param merchantId The Merchant&#39;s Id.
     * @param publicToken The public token of the Card.
     * @param paymentId The unique identifier of the card payment (or attempted payment), allowing you to follow the card transaction life cycle.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @return ResponseEntity&lt;ReadCardTransaction200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ReadCardTransaction200Response>> readCardTransactionWithHttpInfo(String accessTag, Integer cardtransactionId, Integer cardId, Integer walletId, String merchantId, String publicToken, Integer paymentId, Integer pageNumber, Integer pageCount, String sortBy) throws WebClientResponseException {
        ParameterizedTypeReference<ReadCardTransaction200Response> localVarReturnType = new ParameterizedTypeReference<ReadCardTransaction200Response>() {};
        return readCardTransactionRequestCreation(accessTag, cardtransactionId, cardId, walletId, merchantId, publicToken, paymentId, pageNumber, pageCount, sortBy).toEntity(localVarReturnType);
    }

    /**
     * Search Card Transactions
     * Retrieve Card Transactions based at least on one of the following intputs: &#x60;cardId&#x60;, &#x60;paymentId&#x60;, &#x60;publicToken&#x60;, &#x60;walletId&#x60;. This is the preferred request for end user-oriented usage. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param cardtransactionId The unique identifier of the Card Transaction.
     * @param cardId The unique identifier of the Card.
     * @param walletId The unique identifier of the Wallet the card is attached to.
     * @param merchantId The Merchant&#39;s Id.
     * @param publicToken The public token of the Card.
     * @param paymentId The unique identifier of the card payment (or attempted payment), allowing you to follow the card transaction life cycle.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readCardTransactionWithResponseSpec(String accessTag, Integer cardtransactionId, Integer cardId, Integer walletId, String merchantId, String publicToken, Integer paymentId, Integer pageNumber, Integer pageCount, String sortBy) throws WebClientResponseException {
        return readCardTransactionRequestCreation(accessTag, cardtransactionId, cardId, walletId, merchantId, publicToken, paymentId, pageNumber, pageCount, sortBy);
    }

    /**
     * Simulate Card Transactions
     * Simulate Card Transactions in Sandbox environment
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param simulateCardTransactionsRequest The simulateCardTransactionsRequest parameter
     * @return List&lt;SimulateCardTransactions201ResponseInner&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec simulateCardTransactionsRequestCreation(SimulateCardTransactionsRequest simulateCardTransactionsRequest) throws WebClientResponseException {
        Object postBody = simulateCardTransactionsRequest;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<SimulateCardTransactions201ResponseInner> localVarReturnType = new ParameterizedTypeReference<SimulateCardTransactions201ResponseInner>() {};
        return apiClient.invokeAPI("/simulation/cardtransactions", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Simulate Card Transactions
     * Simulate Card Transactions in Sandbox environment
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param simulateCardTransactionsRequest The simulateCardTransactionsRequest parameter
     * @return List&lt;SimulateCardTransactions201ResponseInner&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<SimulateCardTransactions201ResponseInner> simulateCardTransactions(SimulateCardTransactionsRequest simulateCardTransactionsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SimulateCardTransactions201ResponseInner> localVarReturnType = new ParameterizedTypeReference<SimulateCardTransactions201ResponseInner>() {};
        return simulateCardTransactionsRequestCreation(simulateCardTransactionsRequest).bodyToFlux(localVarReturnType);
    }

    /**
     * Simulate Card Transactions
     * Simulate Card Transactions in Sandbox environment
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param simulateCardTransactionsRequest The simulateCardTransactionsRequest parameter
     * @return ResponseEntity&lt;List&lt;SimulateCardTransactions201ResponseInner&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<SimulateCardTransactions201ResponseInner>>> simulateCardTransactionsWithHttpInfo(SimulateCardTransactionsRequest simulateCardTransactionsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SimulateCardTransactions201ResponseInner> localVarReturnType = new ParameterizedTypeReference<SimulateCardTransactions201ResponseInner>() {};
        return simulateCardTransactionsRequestCreation(simulateCardTransactionsRequest).toEntityList(localVarReturnType);
    }

    /**
     * Simulate Card Transactions
     * Simulate Card Transactions in Sandbox environment
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param simulateCardTransactionsRequest The simulateCardTransactionsRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec simulateCardTransactionsWithResponseSpec(SimulateCardTransactionsRequest simulateCardTransactionsRequest) throws WebClientResponseException {
        return simulateCardTransactionsRequestCreation(simulateCardTransactionsRequest);
    }
}
