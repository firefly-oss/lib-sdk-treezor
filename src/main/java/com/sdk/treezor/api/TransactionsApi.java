package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import com.sdk.treezor.model.TransactionObject;

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
import java.util.UUID;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-14T09:49:28.273669400+02:00[Europe/Paris]", comments = "Generator version: 7.12.0")
public class TransactionsApi {
    private ApiClient apiClient;

    public TransactionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public TransactionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Get Transaction
     * Retrieve a transaction.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param transactionId The unique identifier of the Transaction.
     * @return TransactionObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTransactionRequestCreation(UUID transactionId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new WebClientResponseException("Missing the required parameter 'transactionId' when calling getTransaction", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("transactionId", transactionId);

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

        ParameterizedTypeReference<TransactionObject> localVarReturnType = new ParameterizedTypeReference<TransactionObject>() {};
        return apiClient.invokeAPI("/v1/transactions/{transactionId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Transaction
     * Retrieve a transaction.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param transactionId The unique identifier of the Transaction.
     * @return TransactionObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TransactionObject> getTransaction(UUID transactionId) throws WebClientResponseException {
        ParameterizedTypeReference<TransactionObject> localVarReturnType = new ParameterizedTypeReference<TransactionObject>() {};
        return getTransactionRequestCreation(transactionId).bodyToMono(localVarReturnType);
    }

    /**
     * Get Transaction
     * Retrieve a transaction.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param transactionId The unique identifier of the Transaction.
     * @return ResponseEntity&lt;TransactionObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TransactionObject>> getTransactionWithHttpInfo(UUID transactionId) throws WebClientResponseException {
        ParameterizedTypeReference<TransactionObject> localVarReturnType = new ParameterizedTypeReference<TransactionObject>() {};
        return getTransactionRequestCreation(transactionId).toEntity(localVarReturnType);
    }

    /**
     * Get Transaction
     * Retrieve a transaction.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param transactionId The unique identifier of the Transaction.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTransactionWithResponseSpec(UUID transactionId) throws WebClientResponseException {
        return getTransactionRequestCreation(transactionId);
    }

    /**
     * Search Transactions
     * Retrieve Transactions that match search criteria. The request must contain at least one of the following inputs: &#x60;walletId&#x60;, &#x60;transactionId&#x60;, &#x60;executionDate&#x60;, &#x60;valueDate&#x60; 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param transactionId The unique identifier of the transaction.
     * @param transactionType Names of the transaction types. Please refer to the [Transactions](/guide/wallets/transactions.html#transaction-types-transactiontype) article for the list of possible values. 
     * @param transactionTypeId The Id of the transaction types. Please refer to the [Transactions](/guide/wallets/transactions.html#transaction-types-transactiontype) article for the list of possible values. 
     * @param walletId Unique identifier of the transactions Wallet.
     * @param userId Unique identifier of the transactions User.
     * @param name The name of the transaction.
     * @param description The description of the transaction.
     * @param amount The amount of the transaction.
     * @param currency The currency of the transaction amount currency. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies). 
     * @param valueDate The value date of the transaction (date applied for the payment).  Format: &#x60;YYYY-MM-DD&#x60; 
     * @param executionDate Date of the execution of the transaction.  Format: &#x60;YYYY-MM-DD&#x60; 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @return TransactionObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTransactionsRequestCreation(String accessTag, Integer transactionId, String transactionType, Integer transactionTypeId, Integer walletId, Integer userId, String name, String description, String amount, String currency, LocalDate valueDate, LocalDate executionDate, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "transactionId", transactionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "transactionType", transactionType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "transactionTypeId", transactionTypeId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "walletId", walletId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "description", description));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "amount", amount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "currency", currency));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "valueDate", valueDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "executionDate", executionDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageCount", pageCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortBy", sortBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortOrder", sortOrder));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdDateFrom", createdDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdDateTo", createdDateTo));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<TransactionObject> localVarReturnType = new ParameterizedTypeReference<TransactionObject>() {};
        return apiClient.invokeAPI("/v1/transactions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search Transactions
     * Retrieve Transactions that match search criteria. The request must contain at least one of the following inputs: &#x60;walletId&#x60;, &#x60;transactionId&#x60;, &#x60;executionDate&#x60;, &#x60;valueDate&#x60; 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param transactionId The unique identifier of the transaction.
     * @param transactionType Names of the transaction types. Please refer to the [Transactions](/guide/wallets/transactions.html#transaction-types-transactiontype) article for the list of possible values. 
     * @param transactionTypeId The Id of the transaction types. Please refer to the [Transactions](/guide/wallets/transactions.html#transaction-types-transactiontype) article for the list of possible values. 
     * @param walletId Unique identifier of the transactions Wallet.
     * @param userId Unique identifier of the transactions User.
     * @param name The name of the transaction.
     * @param description The description of the transaction.
     * @param amount The amount of the transaction.
     * @param currency The currency of the transaction amount currency. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies). 
     * @param valueDate The value date of the transaction (date applied for the payment).  Format: &#x60;YYYY-MM-DD&#x60; 
     * @param executionDate Date of the execution of the transaction.  Format: &#x60;YYYY-MM-DD&#x60; 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @return TransactionObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TransactionObject> getTransactions(String accessTag, Integer transactionId, String transactionType, Integer transactionTypeId, Integer walletId, Integer userId, String name, String description, String amount, String currency, LocalDate valueDate, LocalDate executionDate, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo) throws WebClientResponseException {
        ParameterizedTypeReference<TransactionObject> localVarReturnType = new ParameterizedTypeReference<TransactionObject>() {};
        return getTransactionsRequestCreation(accessTag, transactionId, transactionType, transactionTypeId, walletId, userId, name, description, amount, currency, valueDate, executionDate, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo).bodyToMono(localVarReturnType);
    }

    /**
     * Search Transactions
     * Retrieve Transactions that match search criteria. The request must contain at least one of the following inputs: &#x60;walletId&#x60;, &#x60;transactionId&#x60;, &#x60;executionDate&#x60;, &#x60;valueDate&#x60; 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param transactionId The unique identifier of the transaction.
     * @param transactionType Names of the transaction types. Please refer to the [Transactions](/guide/wallets/transactions.html#transaction-types-transactiontype) article for the list of possible values. 
     * @param transactionTypeId The Id of the transaction types. Please refer to the [Transactions](/guide/wallets/transactions.html#transaction-types-transactiontype) article for the list of possible values. 
     * @param walletId Unique identifier of the transactions Wallet.
     * @param userId Unique identifier of the transactions User.
     * @param name The name of the transaction.
     * @param description The description of the transaction.
     * @param amount The amount of the transaction.
     * @param currency The currency of the transaction amount currency. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies). 
     * @param valueDate The value date of the transaction (date applied for the payment).  Format: &#x60;YYYY-MM-DD&#x60; 
     * @param executionDate Date of the execution of the transaction.  Format: &#x60;YYYY-MM-DD&#x60; 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @return ResponseEntity&lt;TransactionObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TransactionObject>> getTransactionsWithHttpInfo(String accessTag, Integer transactionId, String transactionType, Integer transactionTypeId, Integer walletId, Integer userId, String name, String description, String amount, String currency, LocalDate valueDate, LocalDate executionDate, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo) throws WebClientResponseException {
        ParameterizedTypeReference<TransactionObject> localVarReturnType = new ParameterizedTypeReference<TransactionObject>() {};
        return getTransactionsRequestCreation(accessTag, transactionId, transactionType, transactionTypeId, walletId, userId, name, description, amount, currency, valueDate, executionDate, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo).toEntity(localVarReturnType);
    }

    /**
     * Search Transactions
     * Retrieve Transactions that match search criteria. The request must contain at least one of the following inputs: &#x60;walletId&#x60;, &#x60;transactionId&#x60;, &#x60;executionDate&#x60;, &#x60;valueDate&#x60; 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param transactionId The unique identifier of the transaction.
     * @param transactionType Names of the transaction types. Please refer to the [Transactions](/guide/wallets/transactions.html#transaction-types-transactiontype) article for the list of possible values. 
     * @param transactionTypeId The Id of the transaction types. Please refer to the [Transactions](/guide/wallets/transactions.html#transaction-types-transactiontype) article for the list of possible values. 
     * @param walletId Unique identifier of the transactions Wallet.
     * @param userId Unique identifier of the transactions User.
     * @param name The name of the transaction.
     * @param description The description of the transaction.
     * @param amount The amount of the transaction.
     * @param currency The currency of the transaction amount currency. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies). 
     * @param valueDate The value date of the transaction (date applied for the payment).  Format: &#x60;YYYY-MM-DD&#x60; 
     * @param executionDate Date of the execution of the transaction.  Format: &#x60;YYYY-MM-DD&#x60; 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTransactionsWithResponseSpec(String accessTag, Integer transactionId, String transactionType, Integer transactionTypeId, Integer walletId, Integer userId, String name, String description, String amount, String currency, LocalDate valueDate, LocalDate executionDate, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo) throws WebClientResponseException {
        return getTransactionsRequestCreation(accessTag, transactionId, transactionType, transactionTypeId, walletId, userId, name, description, amount, currency, valueDate, executionDate, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo);
    }
}
