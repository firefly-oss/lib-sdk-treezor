/*
 * Copyright 2025 Firefly Software Solutions Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.GetBalances200Response;
import com.sdk.treezor.model.GetWalletBalanceHistory200ResponseValue;

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
public class BalancesApi {
    private ApiClient apiClient;

    public BalancesApi() {
        this(new ApiClient());
    }

    @Autowired
    public BalancesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Search Balances
     * Retrieve Balances for a given &#x60;walletId&#x60; or &#x60;userId&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param walletId The unique identifier of the Wallet whose Balance is to be retrieved.
     * @param userId The unique identifier of the User whose Wallet Balances are to be retrieved.
     * @return GetBalances200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getBalancesRequestCreation(String accessTag, Integer walletId, Integer userId) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "walletId", walletId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<GetBalances200Response> localVarReturnType = new ParameterizedTypeReference<GetBalances200Response>() {};
        return apiClient.invokeAPI("/v1/balances", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search Balances
     * Retrieve Balances for a given &#x60;walletId&#x60; or &#x60;userId&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param walletId The unique identifier of the Wallet whose Balance is to be retrieved.
     * @param userId The unique identifier of the User whose Wallet Balances are to be retrieved.
     * @return GetBalances200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetBalances200Response> getBalances(String accessTag, Integer walletId, Integer userId) throws WebClientResponseException {
        ParameterizedTypeReference<GetBalances200Response> localVarReturnType = new ParameterizedTypeReference<GetBalances200Response>() {};
        return getBalancesRequestCreation(accessTag, walletId, userId).bodyToMono(localVarReturnType);
    }

    /**
     * Search Balances
     * Retrieve Balances for a given &#x60;walletId&#x60; or &#x60;userId&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param walletId The unique identifier of the Wallet whose Balance is to be retrieved.
     * @param userId The unique identifier of the User whose Wallet Balances are to be retrieved.
     * @return ResponseEntity&lt;GetBalances200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetBalances200Response>> getBalancesWithHttpInfo(String accessTag, Integer walletId, Integer userId) throws WebClientResponseException {
        ParameterizedTypeReference<GetBalances200Response> localVarReturnType = new ParameterizedTypeReference<GetBalances200Response>() {};
        return getBalancesRequestCreation(accessTag, walletId, userId).toEntity(localVarReturnType);
    }

    /**
     * Search Balances
     * Retrieve Balances for a given &#x60;walletId&#x60; or &#x60;userId&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param walletId The unique identifier of the Wallet whose Balance is to be retrieved.
     * @param userId The unique identifier of the User whose Wallet Balances are to be retrieved.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getBalancesWithResponseSpec(String accessTag, Integer walletId, Integer userId) throws WebClientResponseException {
        return getBalancesRequestCreation(accessTag, walletId, userId);
    }

    /**
     * Get Wallet Balance history
     * Retrieve the Balance History of a Wallet.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param dateFrom Start date in RFC 3339 full-date format.
     * @param dateTo End date in RFC 3339 full-date format.
     * @return Map&lt;String, GetWalletBalanceHistory200ResponseValue&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getWalletBalanceHistoryRequestCreation(Integer walletId, String dateFrom, String dateTo) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new WebClientResponseException("Missing the required parameter 'walletId' when calling getWalletBalanceHistory", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Map<String, GetWalletBalanceHistory200ResponseValue>> localVarReturnType = new ParameterizedTypeReference<Map<String, GetWalletBalanceHistory200ResponseValue>>() {};
        return apiClient.invokeAPI("/core-connect/balances/{walletId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Wallet Balance history
     * Retrieve the Balance History of a Wallet.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param dateFrom Start date in RFC 3339 full-date format.
     * @param dateTo End date in RFC 3339 full-date format.
     * @return Map&lt;String, GetWalletBalanceHistory200ResponseValue&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Map<String, GetWalletBalanceHistory200ResponseValue>> getWalletBalanceHistory(Integer walletId, String dateFrom, String dateTo) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, GetWalletBalanceHistory200ResponseValue>> localVarReturnType = new ParameterizedTypeReference<Map<String, GetWalletBalanceHistory200ResponseValue>>() {};
        return getWalletBalanceHistoryRequestCreation(walletId, dateFrom, dateTo).bodyToMono(localVarReturnType);
    }

    /**
     * Get Wallet Balance history
     * Retrieve the Balance History of a Wallet.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param dateFrom Start date in RFC 3339 full-date format.
     * @param dateTo End date in RFC 3339 full-date format.
     * @return ResponseEntity&lt;Map&lt;String, GetWalletBalanceHistory200ResponseValue&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Map<String, GetWalletBalanceHistory200ResponseValue>>> getWalletBalanceHistoryWithHttpInfo(Integer walletId, String dateFrom, String dateTo) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, GetWalletBalanceHistory200ResponseValue>> localVarReturnType = new ParameterizedTypeReference<Map<String, GetWalletBalanceHistory200ResponseValue>>() {};
        return getWalletBalanceHistoryRequestCreation(walletId, dateFrom, dateTo).toEntity(localVarReturnType);
    }

    /**
     * Get Wallet Balance history
     * Retrieve the Balance History of a Wallet.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param dateFrom Start date in RFC 3339 full-date format.
     * @param dateTo End date in RFC 3339 full-date format.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getWalletBalanceHistoryWithResponseSpec(Integer walletId, String dateFrom, String dateTo) throws WebClientResponseException {
        return getWalletBalanceHistoryRequestCreation(walletId, dateFrom, dateTo);
    }
}
