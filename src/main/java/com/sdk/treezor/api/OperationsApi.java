package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.GetOperations200Response;
import com.sdk.treezor.model.GetOperationsReport200Response;
import com.sdk.treezor.model.PostOperationsReportRequest;
import com.sdk.treezor.model.SimulateOperationsRequest;

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
public class OperationsApi {
    private ApiClient apiClient;

    public OperationsApi() {
        this(new ApiClient());
    }

    @Autowired
    public OperationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Search Operations
     * Retrieve Operations that match your search conditions. The request must specify at least: &#x60;walletId&#x60;, &#x60;dateTo&#x60;, &#x60;dateFrom&#x60;.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html) for operations that are more than 90 days old. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the card.
     * @param walletId The unique identifier of the Wallet.
     * @param dateFrom The start of the period to take into account operations in RFC 339 date-time format (HTML encoded). The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;) 
     * @param dateTo The end of the period to take into account operations in RFC 339 date-time format (HTML encoded). The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;) 
     * @param pageSize Number of results per page
     * @param operationType The type of operation. Can&#39;t be cumulated with other query parameters.   By default, Treezor returns all operation types when this field isn&#39;t defined. 
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page. 
     * @param initialFlow Technical context about the initial operation. Can&#39;t be cumulated with other query parameters.
     * @param direction Direction of the operation.
     * @param amountFrom The minimum amount of the operations to take into account.
     * @param amountTo The maximum amount of the operations to take into account.
     * @param status The status of the operation.
     * @return GetOperations200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getOperationsRequestCreation(UUID cardId, UUID walletId, String dateFrom, String dateTo, Long pageSize, String operationType, String cursor, List<String> initialFlow, String direction, Integer amountFrom, String amountTo, List<String> status) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling getOperations", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new WebClientResponseException("Missing the required parameter 'walletId' when calling getOperations", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dateFrom' is set
        if (dateFrom == null) {
            throw new WebClientResponseException("Missing the required parameter 'dateFrom' when calling getOperations", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dateTo' is set
        if (dateTo == null) {
            throw new WebClientResponseException("Missing the required parameter 'dateTo' when calling getOperations", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cardId", cardId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "walletId", walletId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dateFrom", dateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dateTo", dateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "operationType", operationType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "initialFlow", initialFlow));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "direction", direction));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "amountFrom", amountFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "amountTo", amountTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<GetOperations200Response> localVarReturnType = new ParameterizedTypeReference<GetOperations200Response>() {};
        return apiClient.invokeAPI("/core-connect/operations", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search Operations
     * Retrieve Operations that match your search conditions. The request must specify at least: &#x60;walletId&#x60;, &#x60;dateTo&#x60;, &#x60;dateFrom&#x60;.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html) for operations that are more than 90 days old. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the card.
     * @param walletId The unique identifier of the Wallet.
     * @param dateFrom The start of the period to take into account operations in RFC 339 date-time format (HTML encoded). The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;) 
     * @param dateTo The end of the period to take into account operations in RFC 339 date-time format (HTML encoded). The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;) 
     * @param pageSize Number of results per page
     * @param operationType The type of operation. Can&#39;t be cumulated with other query parameters.   By default, Treezor returns all operation types when this field isn&#39;t defined. 
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page. 
     * @param initialFlow Technical context about the initial operation. Can&#39;t be cumulated with other query parameters.
     * @param direction Direction of the operation.
     * @param amountFrom The minimum amount of the operations to take into account.
     * @param amountTo The maximum amount of the operations to take into account.
     * @param status The status of the operation.
     * @return GetOperations200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetOperations200Response> getOperations(UUID cardId, UUID walletId, String dateFrom, String dateTo, Long pageSize, String operationType, String cursor, List<String> initialFlow, String direction, Integer amountFrom, String amountTo, List<String> status) throws WebClientResponseException {
        ParameterizedTypeReference<GetOperations200Response> localVarReturnType = new ParameterizedTypeReference<GetOperations200Response>() {};
        return getOperationsRequestCreation(cardId, walletId, dateFrom, dateTo, pageSize, operationType, cursor, initialFlow, direction, amountFrom, amountTo, status).bodyToMono(localVarReturnType);
    }

    /**
     * Search Operations
     * Retrieve Operations that match your search conditions. The request must specify at least: &#x60;walletId&#x60;, &#x60;dateTo&#x60;, &#x60;dateFrom&#x60;.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html) for operations that are more than 90 days old. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the card.
     * @param walletId The unique identifier of the Wallet.
     * @param dateFrom The start of the period to take into account operations in RFC 339 date-time format (HTML encoded). The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;) 
     * @param dateTo The end of the period to take into account operations in RFC 339 date-time format (HTML encoded). The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;) 
     * @param pageSize Number of results per page
     * @param operationType The type of operation. Can&#39;t be cumulated with other query parameters.   By default, Treezor returns all operation types when this field isn&#39;t defined. 
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page. 
     * @param initialFlow Technical context about the initial operation. Can&#39;t be cumulated with other query parameters.
     * @param direction Direction of the operation.
     * @param amountFrom The minimum amount of the operations to take into account.
     * @param amountTo The maximum amount of the operations to take into account.
     * @param status The status of the operation.
     * @return ResponseEntity&lt;GetOperations200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetOperations200Response>> getOperationsWithHttpInfo(UUID cardId, UUID walletId, String dateFrom, String dateTo, Long pageSize, String operationType, String cursor, List<String> initialFlow, String direction, Integer amountFrom, String amountTo, List<String> status) throws WebClientResponseException {
        ParameterizedTypeReference<GetOperations200Response> localVarReturnType = new ParameterizedTypeReference<GetOperations200Response>() {};
        return getOperationsRequestCreation(cardId, walletId, dateFrom, dateTo, pageSize, operationType, cursor, initialFlow, direction, amountFrom, amountTo, status).toEntity(localVarReturnType);
    }

    /**
     * Search Operations
     * Retrieve Operations that match your search conditions. The request must specify at least: &#x60;walletId&#x60;, &#x60;dateTo&#x60;, &#x60;dateFrom&#x60;.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html) for operations that are more than 90 days old. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the card.
     * @param walletId The unique identifier of the Wallet.
     * @param dateFrom The start of the period to take into account operations in RFC 339 date-time format (HTML encoded). The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;) 
     * @param dateTo The end of the period to take into account operations in RFC 339 date-time format (HTML encoded). The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;) 
     * @param pageSize Number of results per page
     * @param operationType The type of operation. Can&#39;t be cumulated with other query parameters.   By default, Treezor returns all operation types when this field isn&#39;t defined. 
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page. 
     * @param initialFlow Technical context about the initial operation. Can&#39;t be cumulated with other query parameters.
     * @param direction Direction of the operation.
     * @param amountFrom The minimum amount of the operations to take into account.
     * @param amountTo The maximum amount of the operations to take into account.
     * @param status The status of the operation.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getOperationsWithResponseSpec(UUID cardId, UUID walletId, String dateFrom, String dateTo, Long pageSize, String operationType, String cursor, List<String> initialFlow, String direction, Integer amountFrom, String amountTo, List<String> status) throws WebClientResponseException {
        return getOperationsRequestCreation(cardId, walletId, dateFrom, dateTo, pageSize, operationType, cursor, initialFlow, direction, amountFrom, amountTo, status);
    }

    /**
     * Get Operations Report
     * Retrieve an Operations Report based on the corresponding Wallet &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param dateFrom The date and time from which the operations are taken into account for the report. The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;) 
     * @param dateTo The date and time up to which the operations are taken into account for the report. The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;) 
     * @return GetOperationsReport200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getOperationsReportRequestCreation(Integer walletId, String dateFrom, String dateTo) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new WebClientResponseException("Missing the required parameter 'walletId' when calling getOperationsReport", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dateFrom' is set
        if (dateFrom == null) {
            throw new WebClientResponseException("Missing the required parameter 'dateFrom' when calling getOperationsReport", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dateTo' is set
        if (dateTo == null) {
            throw new WebClientResponseException("Missing the required parameter 'dateTo' when calling getOperationsReport", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("walletId", walletId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dateFrom", dateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dateTo", dateTo));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<GetOperationsReport200Response> localVarReturnType = new ParameterizedTypeReference<GetOperationsReport200Response>() {};
        return apiClient.invokeAPI("/core-connect/operations/{walletId}/report", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Operations Report
     * Retrieve an Operations Report based on the corresponding Wallet &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param dateFrom The date and time from which the operations are taken into account for the report. The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;) 
     * @param dateTo The date and time up to which the operations are taken into account for the report. The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;) 
     * @return GetOperationsReport200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetOperationsReport200Response> getOperationsReport(Integer walletId, String dateFrom, String dateTo) throws WebClientResponseException {
        ParameterizedTypeReference<GetOperationsReport200Response> localVarReturnType = new ParameterizedTypeReference<GetOperationsReport200Response>() {};
        return getOperationsReportRequestCreation(walletId, dateFrom, dateTo).bodyToMono(localVarReturnType);
    }

    /**
     * Get Operations Report
     * Retrieve an Operations Report based on the corresponding Wallet &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param dateFrom The date and time from which the operations are taken into account for the report. The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;) 
     * @param dateTo The date and time up to which the operations are taken into account for the report. The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;) 
     * @return ResponseEntity&lt;GetOperationsReport200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetOperationsReport200Response>> getOperationsReportWithHttpInfo(Integer walletId, String dateFrom, String dateTo) throws WebClientResponseException {
        ParameterizedTypeReference<GetOperationsReport200Response> localVarReturnType = new ParameterizedTypeReference<GetOperationsReport200Response>() {};
        return getOperationsReportRequestCreation(walletId, dateFrom, dateTo).toEntity(localVarReturnType);
    }

    /**
     * Get Operations Report
     * Retrieve an Operations Report based on the corresponding Wallet &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param dateFrom The date and time from which the operations are taken into account for the report. The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;) 
     * @param dateTo The date and time up to which the operations are taken into account for the report. The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;) 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getOperationsReportWithResponseSpec(Integer walletId, String dateFrom, String dateTo) throws WebClientResponseException {
        return getOperationsReportRequestCreation(walletId, dateFrom, dateTo);
    }

    /**
     * Create Operations Report
     * Create a CSV export that includes all operations for a given Wallet on a given period.
     * <p><b>201</b> - Created
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param postOperationsReportRequest The postOperationsReportRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postOperationsReportRequestCreation(Integer walletId, PostOperationsReportRequest postOperationsReportRequest) throws WebClientResponseException {
        Object postBody = postOperationsReportRequest;
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new WebClientResponseException("Missing the required parameter 'walletId' when calling postOperationsReport", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("walletId", walletId);

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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/core-connect/operations/{walletId}/report", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Operations Report
     * Create a CSV export that includes all operations for a given Wallet on a given period.
     * <p><b>201</b> - Created
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param postOperationsReportRequest The postOperationsReportRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> postOperationsReport(Integer walletId, PostOperationsReportRequest postOperationsReportRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return postOperationsReportRequestCreation(walletId, postOperationsReportRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Operations Report
     * Create a CSV export that includes all operations for a given Wallet on a given period.
     * <p><b>201</b> - Created
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param postOperationsReportRequest The postOperationsReportRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> postOperationsReportWithHttpInfo(Integer walletId, PostOperationsReportRequest postOperationsReportRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return postOperationsReportRequestCreation(walletId, postOperationsReportRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Operations Report
     * Create a CSV export that includes all operations for a given Wallet on a given period.
     * <p><b>201</b> - Created
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param postOperationsReportRequest The postOperationsReportRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postOperationsReportWithResponseSpec(Integer walletId, PostOperationsReportRequest postOperationsReportRequest) throws WebClientResponseException {
        return postOperationsReportRequestCreation(walletId, postOperationsReportRequest);
    }

    /**
     * Simulate Operations
     * Create fake operations for a given Wallet. This may prove useful to test [Account Statements](/guide/wallets/account-statements.html) for instance. 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param simulateOperationsRequest The simulateOperationsRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec simulateOperationsRequestCreation(SimulateOperationsRequest simulateOperationsRequest) throws WebClientResponseException {
        Object postBody = simulateOperationsRequest;
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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/simulation/operations", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Simulate Operations
     * Create fake operations for a given Wallet. This may prove useful to test [Account Statements](/guide/wallets/account-statements.html) for instance. 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param simulateOperationsRequest The simulateOperationsRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> simulateOperations(SimulateOperationsRequest simulateOperationsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return simulateOperationsRequestCreation(simulateOperationsRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Simulate Operations
     * Create fake operations for a given Wallet. This may prove useful to test [Account Statements](/guide/wallets/account-statements.html) for instance. 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param simulateOperationsRequest The simulateOperationsRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> simulateOperationsWithHttpInfo(SimulateOperationsRequest simulateOperationsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return simulateOperationsRequestCreation(simulateOperationsRequest).toEntity(localVarReturnType);
    }

    /**
     * Simulate Operations
     * Create fake operations for a given Wallet. This may prove useful to test [Account Statements](/guide/wallets/account-statements.html) for instance. 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param simulateOperationsRequest The simulateOperationsRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec simulateOperationsWithResponseSpec(SimulateOperationsRequest simulateOperationsRequest) throws WebClientResponseException {
        return simulateOperationsRequestCreation(simulateOperationsRequest);
    }
}
