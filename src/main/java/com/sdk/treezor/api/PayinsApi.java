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
import java.time.OffsetDateTime;
import com.sdk.treezor.model.PayinObject;
import com.sdk.treezor.model.PostPayinRequest;
import com.sdk.treezor.model.SimulateSctInstReception201Response;
import com.sdk.treezor.model.SimulateSctInstReception400Response;
import com.sdk.treezor.model.SimulateSctInstReceptionRequest;
import com.sdk.treezor.model.SimulateSctReception200Response;
import com.sdk.treezor.model.SimulateSctReception400Response;
import com.sdk.treezor.model.SimulateSctReceptionRequest;

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
public class PayinsApi {
    private ApiClient apiClient;

    public PayinsApi() {
        this(new ApiClient());
    }

    @Autowired
    public PayinsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Delete Payin
     * Cancels a Payin. This endpoint is only available for: * [Check cashing](/guide/cheques/introduction.html), before the treatment center receives the check. * [SEPA Direct Debit emission](/guide/transfers/direct-debit.html#emitted-direct-debits-sdde), before Treezor processes it. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param payinId The unique identifier of the payin.
     * @return PayinObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deletePayinRequestCreation(String payinId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'payinId' is set
        if (payinId == null) {
            throw new WebClientResponseException("Missing the required parameter 'payinId' when calling deletePayin", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("payinId", payinId);

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

        ParameterizedTypeReference<PayinObject> localVarReturnType = new ParameterizedTypeReference<PayinObject>() {};
        return apiClient.invokeAPI("/v1/payins/{payinId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete Payin
     * Cancels a Payin. This endpoint is only available for: * [Check cashing](/guide/cheques/introduction.html), before the treatment center receives the check. * [SEPA Direct Debit emission](/guide/transfers/direct-debit.html#emitted-direct-debits-sdde), before Treezor processes it. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param payinId The unique identifier of the payin.
     * @return PayinObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PayinObject> deletePayin(String payinId) throws WebClientResponseException {
        ParameterizedTypeReference<PayinObject> localVarReturnType = new ParameterizedTypeReference<PayinObject>() {};
        return deletePayinRequestCreation(payinId).bodyToMono(localVarReturnType);
    }

    /**
     * Delete Payin
     * Cancels a Payin. This endpoint is only available for: * [Check cashing](/guide/cheques/introduction.html), before the treatment center receives the check. * [SEPA Direct Debit emission](/guide/transfers/direct-debit.html#emitted-direct-debits-sdde), before Treezor processes it. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param payinId The unique identifier of the payin.
     * @return ResponseEntity&lt;PayinObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PayinObject>> deletePayinWithHttpInfo(String payinId) throws WebClientResponseException {
        ParameterizedTypeReference<PayinObject> localVarReturnType = new ParameterizedTypeReference<PayinObject>() {};
        return deletePayinRequestCreation(payinId).toEntity(localVarReturnType);
    }

    /**
     * Delete Payin
     * Cancels a Payin. This endpoint is only available for: * [Check cashing](/guide/cheques/introduction.html), before the treatment center receives the check. * [SEPA Direct Debit emission](/guide/transfers/direct-debit.html#emitted-direct-debits-sdde), before Treezor processes it. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param payinId The unique identifier of the payin.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deletePayinWithResponseSpec(String payinId) throws WebClientResponseException {
        return deletePayinRequestCreation(payinId);
    }

    /**
     * Get Payin
     * Retrieve a payin by its id.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param payinId The unique identifier of the payin.
     * @return PayinObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPayinRequestCreation(String payinId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'payinId' is set
        if (payinId == null) {
            throw new WebClientResponseException("Missing the required parameter 'payinId' when calling getPayin", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("payinId", payinId);

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

        ParameterizedTypeReference<PayinObject> localVarReturnType = new ParameterizedTypeReference<PayinObject>() {};
        return apiClient.invokeAPI("/v1/payins/{payinId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Payin
     * Retrieve a payin by its id.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param payinId The unique identifier of the payin.
     * @return PayinObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PayinObject> getPayin(String payinId) throws WebClientResponseException {
        ParameterizedTypeReference<PayinObject> localVarReturnType = new ParameterizedTypeReference<PayinObject>() {};
        return getPayinRequestCreation(payinId).bodyToMono(localVarReturnType);
    }

    /**
     * Get Payin
     * Retrieve a payin by its id.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param payinId The unique identifier of the payin.
     * @return ResponseEntity&lt;PayinObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PayinObject>> getPayinWithHttpInfo(String payinId) throws WebClientResponseException {
        ParameterizedTypeReference<PayinObject> localVarReturnType = new ParameterizedTypeReference<PayinObject>() {};
        return getPayinRequestCreation(payinId).toEntity(localVarReturnType);
    }

    /**
     * Get Payin
     * Retrieve a payin by its id.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param payinId The unique identifier of the payin.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPayinWithResponseSpec(String payinId) throws WebClientResponseException {
        return getPayinRequestCreation(payinId);
    }

    /**
     * Search Payins
     * Get payins that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param payinId The unique identifier of the payin.
     * @param walletId The unique identifier of the Wallet of the payin.
     * @param payinTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Max length: 250 characters.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param payinStatus The status of the payin.
     * @param userId The unique identifier of the User who performed the operation (debited).
     * @param userName The name of the User who performed the operation (debited).
     * @param userEmail The email of the User who performed the operation (debited).
     * @param beneficiaryUserId The unique identifier of the User who received the operation (credited).
     * @param eventAlias The name of the credited Wallet.
     * @param walletTypeId The Wallet Type of the Wallet of the payin.
     * @param paymentMethodId Payin&#39;s payment method id.
     * @param createdDateFrom The creation date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param createdDateTo The creation date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param sortOrder The order in which you want to sort the list based on the payin&#39;s date. * **DESC** for descending. * **ASC** for ascending. 
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @return PayinObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPayinsRequestCreation(String accessTag, Integer payinId, Integer walletId, String payinTag, String payinStatus, String userId, String userName, String userEmail, Integer beneficiaryUserId, String eventAlias, Integer walletTypeId, String paymentMethodId, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, String sortOrder, String cursor) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "payinId", payinId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "walletId", walletId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "payinTag", payinTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "payinStatus", payinStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userName", userName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userEmail", userEmail));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "beneficiaryUserId", beneficiaryUserId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "eventAlias", eventAlias));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "walletTypeId", walletTypeId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paymentMethodId", paymentMethodId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdDateFrom", createdDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdDateTo", createdDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "updatedDateFrom", updatedDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "updatedDateTo", updatedDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortOrder", sortOrder));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<PayinObject> localVarReturnType = new ParameterizedTypeReference<PayinObject>() {};
        return apiClient.invokeAPI("/v1/payins", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search Payins
     * Get payins that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param payinId The unique identifier of the payin.
     * @param walletId The unique identifier of the Wallet of the payin.
     * @param payinTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Max length: 250 characters.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param payinStatus The status of the payin.
     * @param userId The unique identifier of the User who performed the operation (debited).
     * @param userName The name of the User who performed the operation (debited).
     * @param userEmail The email of the User who performed the operation (debited).
     * @param beneficiaryUserId The unique identifier of the User who received the operation (credited).
     * @param eventAlias The name of the credited Wallet.
     * @param walletTypeId The Wallet Type of the Wallet of the payin.
     * @param paymentMethodId Payin&#39;s payment method id.
     * @param createdDateFrom The creation date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param createdDateTo The creation date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param sortOrder The order in which you want to sort the list based on the payin&#39;s date. * **DESC** for descending. * **ASC** for ascending. 
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @return PayinObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PayinObject> getPayins(String accessTag, Integer payinId, Integer walletId, String payinTag, String payinStatus, String userId, String userName, String userEmail, Integer beneficiaryUserId, String eventAlias, Integer walletTypeId, String paymentMethodId, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, String sortOrder, String cursor) throws WebClientResponseException {
        ParameterizedTypeReference<PayinObject> localVarReturnType = new ParameterizedTypeReference<PayinObject>() {};
        return getPayinsRequestCreation(accessTag, payinId, walletId, payinTag, payinStatus, userId, userName, userEmail, beneficiaryUserId, eventAlias, walletTypeId, paymentMethodId, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, sortOrder, cursor).bodyToMono(localVarReturnType);
    }

    /**
     * Search Payins
     * Get payins that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param payinId The unique identifier of the payin.
     * @param walletId The unique identifier of the Wallet of the payin.
     * @param payinTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Max length: 250 characters.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param payinStatus The status of the payin.
     * @param userId The unique identifier of the User who performed the operation (debited).
     * @param userName The name of the User who performed the operation (debited).
     * @param userEmail The email of the User who performed the operation (debited).
     * @param beneficiaryUserId The unique identifier of the User who received the operation (credited).
     * @param eventAlias The name of the credited Wallet.
     * @param walletTypeId The Wallet Type of the Wallet of the payin.
     * @param paymentMethodId Payin&#39;s payment method id.
     * @param createdDateFrom The creation date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param createdDateTo The creation date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param sortOrder The order in which you want to sort the list based on the payin&#39;s date. * **DESC** for descending. * **ASC** for ascending. 
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @return ResponseEntity&lt;PayinObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PayinObject>> getPayinsWithHttpInfo(String accessTag, Integer payinId, Integer walletId, String payinTag, String payinStatus, String userId, String userName, String userEmail, Integer beneficiaryUserId, String eventAlias, Integer walletTypeId, String paymentMethodId, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, String sortOrder, String cursor) throws WebClientResponseException {
        ParameterizedTypeReference<PayinObject> localVarReturnType = new ParameterizedTypeReference<PayinObject>() {};
        return getPayinsRequestCreation(accessTag, payinId, walletId, payinTag, payinStatus, userId, userName, userEmail, beneficiaryUserId, eventAlias, walletTypeId, paymentMethodId, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, sortOrder, cursor).toEntity(localVarReturnType);
    }

    /**
     * Search Payins
     * Get payins that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param payinId The unique identifier of the payin.
     * @param walletId The unique identifier of the Wallet of the payin.
     * @param payinTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Max length: 250 characters.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param payinStatus The status of the payin.
     * @param userId The unique identifier of the User who performed the operation (debited).
     * @param userName The name of the User who performed the operation (debited).
     * @param userEmail The email of the User who performed the operation (debited).
     * @param beneficiaryUserId The unique identifier of the User who received the operation (credited).
     * @param eventAlias The name of the credited Wallet.
     * @param walletTypeId The Wallet Type of the Wallet of the payin.
     * @param paymentMethodId Payin&#39;s payment method id.
     * @param createdDateFrom The creation date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param createdDateTo The creation date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param sortOrder The order in which you want to sort the list based on the payin&#39;s date. * **DESC** for descending. * **ASC** for ascending. 
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPayinsWithResponseSpec(String accessTag, Integer payinId, Integer walletId, String payinTag, String payinStatus, String userId, String userName, String userEmail, Integer beneficiaryUserId, String eventAlias, Integer walletTypeId, String paymentMethodId, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, String sortOrder, String cursor) throws WebClientResponseException {
        return getPayinsRequestCreation(accessTag, payinId, walletId, payinTag, payinStatus, userId, userName, userEmail, beneficiaryUserId, eventAlias, walletTypeId, paymentMethodId, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, sortOrder, cursor);
    }

    /**
     * Create Payin
     * Create a new payin.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postPayinRequest The postPayinRequest parameter
     * @return PayinObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postPayinRequestCreation(PostPayinRequest postPayinRequest) throws WebClientResponseException {
        Object postBody = postPayinRequest;
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

        ParameterizedTypeReference<PayinObject> localVarReturnType = new ParameterizedTypeReference<PayinObject>() {};
        return apiClient.invokeAPI("/v1/payins", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Payin
     * Create a new payin.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postPayinRequest The postPayinRequest parameter
     * @return PayinObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PayinObject> postPayin(PostPayinRequest postPayinRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PayinObject> localVarReturnType = new ParameterizedTypeReference<PayinObject>() {};
        return postPayinRequestCreation(postPayinRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Payin
     * Create a new payin.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postPayinRequest The postPayinRequest parameter
     * @return ResponseEntity&lt;PayinObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PayinObject>> postPayinWithHttpInfo(PostPayinRequest postPayinRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PayinObject> localVarReturnType = new ParameterizedTypeReference<PayinObject>() {};
        return postPayinRequestCreation(postPayinRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Payin
     * Create a new payin.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postPayinRequest The postPayinRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postPayinWithResponseSpec(PostPayinRequest postPayinRequest) throws WebClientResponseException {
        return postPayinRequestCreation(postPayinRequest);
    }

    /**
     * Simulate SCTR Inst
     * Simulate the reception of an instantaneous SEPA Credit Transfer into one of your Wallet in Sandbox.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param simulateSctInstReceptionRequest The simulateSctInstReceptionRequest parameter
     * @return SimulateSctInstReception201Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec simulateSctInstReceptionRequestCreation(SimulateSctInstReceptionRequest simulateSctInstReceptionRequest) throws WebClientResponseException {
        Object postBody = simulateSctInstReceptionRequest;
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

        ParameterizedTypeReference<SimulateSctInstReception201Response> localVarReturnType = new ParameterizedTypeReference<SimulateSctInstReception201Response>() {};
        return apiClient.invokeAPI("/simulation/sct-inst/payin", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Simulate SCTR Inst
     * Simulate the reception of an instantaneous SEPA Credit Transfer into one of your Wallet in Sandbox.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param simulateSctInstReceptionRequest The simulateSctInstReceptionRequest parameter
     * @return SimulateSctInstReception201Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SimulateSctInstReception201Response> simulateSctInstReception(SimulateSctInstReceptionRequest simulateSctInstReceptionRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SimulateSctInstReception201Response> localVarReturnType = new ParameterizedTypeReference<SimulateSctInstReception201Response>() {};
        return simulateSctInstReceptionRequestCreation(simulateSctInstReceptionRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Simulate SCTR Inst
     * Simulate the reception of an instantaneous SEPA Credit Transfer into one of your Wallet in Sandbox.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param simulateSctInstReceptionRequest The simulateSctInstReceptionRequest parameter
     * @return ResponseEntity&lt;SimulateSctInstReception201Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SimulateSctInstReception201Response>> simulateSctInstReceptionWithHttpInfo(SimulateSctInstReceptionRequest simulateSctInstReceptionRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SimulateSctInstReception201Response> localVarReturnType = new ParameterizedTypeReference<SimulateSctInstReception201Response>() {};
        return simulateSctInstReceptionRequestCreation(simulateSctInstReceptionRequest).toEntity(localVarReturnType);
    }

    /**
     * Simulate SCTR Inst
     * Simulate the reception of an instantaneous SEPA Credit Transfer into one of your Wallet in Sandbox.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param simulateSctInstReceptionRequest The simulateSctInstReceptionRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec simulateSctInstReceptionWithResponseSpec(SimulateSctInstReceptionRequest simulateSctInstReceptionRequest) throws WebClientResponseException {
        return simulateSctInstReceptionRequestCreation(simulateSctInstReceptionRequest);
    }

    /**
     * Simulate SCTR
     * Simulate the reception of a SEPA Credit Transfer into one of your Wallet in Sandbox.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param simulateSctReceptionRequest The simulateSctReceptionRequest parameter
     * @return SimulateSctReception200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec simulateSctReceptionRequestCreation(SimulateSctReceptionRequest simulateSctReceptionRequest) throws WebClientResponseException {
        Object postBody = simulateSctReceptionRequest;
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

        ParameterizedTypeReference<SimulateSctReception200Response> localVarReturnType = new ParameterizedTypeReference<SimulateSctReception200Response>() {};
        return apiClient.invokeAPI("/simulation/payin-sct", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Simulate SCTR
     * Simulate the reception of a SEPA Credit Transfer into one of your Wallet in Sandbox.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param simulateSctReceptionRequest The simulateSctReceptionRequest parameter
     * @return SimulateSctReception200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SimulateSctReception200Response> simulateSctReception(SimulateSctReceptionRequest simulateSctReceptionRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SimulateSctReception200Response> localVarReturnType = new ParameterizedTypeReference<SimulateSctReception200Response>() {};
        return simulateSctReceptionRequestCreation(simulateSctReceptionRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Simulate SCTR
     * Simulate the reception of a SEPA Credit Transfer into one of your Wallet in Sandbox.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param simulateSctReceptionRequest The simulateSctReceptionRequest parameter
     * @return ResponseEntity&lt;SimulateSctReception200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SimulateSctReception200Response>> simulateSctReceptionWithHttpInfo(SimulateSctReceptionRequest simulateSctReceptionRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SimulateSctReception200Response> localVarReturnType = new ParameterizedTypeReference<SimulateSctReception200Response>() {};
        return simulateSctReceptionRequestCreation(simulateSctReceptionRequest).toEntity(localVarReturnType);
    }

    /**
     * Simulate SCTR
     * Simulate the reception of a SEPA Credit Transfer into one of your Wallet in Sandbox.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param simulateSctReceptionRequest The simulateSctReceptionRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec simulateSctReceptionWithResponseSpec(SimulateSctReceptionRequest simulateSctReceptionRequest) throws WebClientResponseException {
        return simulateSctReceptionRequestCreation(simulateSctReceptionRequest);
    }
}
