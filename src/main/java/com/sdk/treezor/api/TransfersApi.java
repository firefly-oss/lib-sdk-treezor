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
import com.sdk.treezor.model.PostTransfersRequest;
import com.sdk.treezor.model.TransferObject;

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
public class TransfersApi {
    private ApiClient apiClient;

    public TransfersApi() {
        this(new ApiClient());
    }

    @Autowired
    public TransfersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Cancel Transfer
     * Change status of the Transfer to &#x60;CANCELED&#x60;.   Only transfers whose stauts is &#x60;PENDING&#x60; can be canceled. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param transferId The unique identifier of the Transfer.
     * @return TransferObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteTransferRequestCreation(UUID transferId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'transferId' is set
        if (transferId == null) {
            throw new WebClientResponseException("Missing the required parameter 'transferId' when calling deleteTransfer", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("transferId", transferId);

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

        ParameterizedTypeReference<TransferObject> localVarReturnType = new ParameterizedTypeReference<TransferObject>() {};
        return apiClient.invokeAPI("/v1/transfers/{transferId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Cancel Transfer
     * Change status of the Transfer to &#x60;CANCELED&#x60;.   Only transfers whose stauts is &#x60;PENDING&#x60; can be canceled. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param transferId The unique identifier of the Transfer.
     * @return TransferObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TransferObject> deleteTransfer(UUID transferId) throws WebClientResponseException {
        ParameterizedTypeReference<TransferObject> localVarReturnType = new ParameterizedTypeReference<TransferObject>() {};
        return deleteTransferRequestCreation(transferId).bodyToMono(localVarReturnType);
    }

    /**
     * Cancel Transfer
     * Change status of the Transfer to &#x60;CANCELED&#x60;.   Only transfers whose stauts is &#x60;PENDING&#x60; can be canceled. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param transferId The unique identifier of the Transfer.
     * @return ResponseEntity&lt;TransferObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TransferObject>> deleteTransferWithHttpInfo(UUID transferId) throws WebClientResponseException {
        ParameterizedTypeReference<TransferObject> localVarReturnType = new ParameterizedTypeReference<TransferObject>() {};
        return deleteTransferRequestCreation(transferId).toEntity(localVarReturnType);
    }

    /**
     * Cancel Transfer
     * Change status of the Transfer to &#x60;CANCELED&#x60;.   Only transfers whose stauts is &#x60;PENDING&#x60; can be canceled. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param transferId The unique identifier of the Transfer.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteTransferWithResponseSpec(UUID transferId) throws WebClientResponseException {
        return deleteTransferRequestCreation(transferId);
    }

    /**
     * Get Transfer
     * Retrieve a transfer using its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param transferId The unique identifier of the Transfer.
     * @return TransferObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTransferRequestCreation(UUID transferId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'transferId' is set
        if (transferId == null) {
            throw new WebClientResponseException("Missing the required parameter 'transferId' when calling getTransfer", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("transferId", transferId);

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

        ParameterizedTypeReference<TransferObject> localVarReturnType = new ParameterizedTypeReference<TransferObject>() {};
        return apiClient.invokeAPI("/v1/transfers/{transferId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Transfer
     * Retrieve a transfer using its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param transferId The unique identifier of the Transfer.
     * @return TransferObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TransferObject> getTransfer(UUID transferId) throws WebClientResponseException {
        ParameterizedTypeReference<TransferObject> localVarReturnType = new ParameterizedTypeReference<TransferObject>() {};
        return getTransferRequestCreation(transferId).bodyToMono(localVarReturnType);
    }

    /**
     * Get Transfer
     * Retrieve a transfer using its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param transferId The unique identifier of the Transfer.
     * @return ResponseEntity&lt;TransferObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TransferObject>> getTransferWithHttpInfo(UUID transferId) throws WebClientResponseException {
        ParameterizedTypeReference<TransferObject> localVarReturnType = new ParameterizedTypeReference<TransferObject>() {};
        return getTransferRequestCreation(transferId).toEntity(localVarReturnType);
    }

    /**
     * Get Transfer
     * Retrieve a transfer using its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param transferId The unique identifier of the Transfer.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTransferWithResponseSpec(UUID transferId) throws WebClientResponseException {
        return getTransferRequestCreation(transferId);
    }

    /**
     * Search Transfers
     * Retrieve the list of transfers for at least one of those inputs: &#x60;walletId&#x60;, &#x60;beneficiaryWalletId&#x60;, &#x60;userId&#x60;, &#x60;beneficiaryUserId&#x60;, &#x60;transferId&#x60;, &#x60;transferTag&#x60; 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param transferId The unique identifier of the Transfer.
     * @param transferTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Max length: 250 characters.   Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param transferStatus The status of the Transfer. 
     * @param walletId The unique identifier of the debited Wallet.
     * @param beneficiaryWalletId The unique identifier of the credited Wallet.
     * @param userId The unique identifier of the owner of the debited Wallet.
     * @param beneficiaryUserId The unique identifier of the owner of the credited Wallet.
     * @param amount The amount of the Transfer.
     * @param currency The currency of the Transfer amount. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies). 
     * @param transferTypeId The type of the Transfer: * &#x60;1&#x60; – Wallet to wallet  * &#x60;2&#x60; – Card transaction * &#x60;3&#x60; – Client fees * &#x60;4&#x60; – Credit note 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @return TransferObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTransfersRequestCreation(String accessTag, Integer transferId, String transferTag, String transferStatus, Integer walletId, Integer beneficiaryWalletId, Integer userId, Integer beneficiaryUserId, String amount, String currency, Integer transferTypeId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "transferId", transferId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "transferTag", transferTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "transferStatus", transferStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "walletId", walletId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "beneficiaryWalletId", beneficiaryWalletId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "beneficiaryUserId", beneficiaryUserId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "amount", amount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "currency", currency));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "transferTypeId", transferTypeId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageCount", pageCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortBy", sortBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortOrder", sortOrder));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdDateFrom", createdDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdDateTo", createdDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "updatedDateFrom", updatedDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "updatedDateTo", updatedDateTo));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<TransferObject> localVarReturnType = new ParameterizedTypeReference<TransferObject>() {};
        return apiClient.invokeAPI("/v1/transfers", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search Transfers
     * Retrieve the list of transfers for at least one of those inputs: &#x60;walletId&#x60;, &#x60;beneficiaryWalletId&#x60;, &#x60;userId&#x60;, &#x60;beneficiaryUserId&#x60;, &#x60;transferId&#x60;, &#x60;transferTag&#x60; 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param transferId The unique identifier of the Transfer.
     * @param transferTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Max length: 250 characters.   Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param transferStatus The status of the Transfer. 
     * @param walletId The unique identifier of the debited Wallet.
     * @param beneficiaryWalletId The unique identifier of the credited Wallet.
     * @param userId The unique identifier of the owner of the debited Wallet.
     * @param beneficiaryUserId The unique identifier of the owner of the credited Wallet.
     * @param amount The amount of the Transfer.
     * @param currency The currency of the Transfer amount. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies). 
     * @param transferTypeId The type of the Transfer: * &#x60;1&#x60; – Wallet to wallet  * &#x60;2&#x60; – Card transaction * &#x60;3&#x60; – Client fees * &#x60;4&#x60; – Credit note 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @return TransferObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TransferObject> getTransfers(String accessTag, Integer transferId, String transferTag, String transferStatus, Integer walletId, Integer beneficiaryWalletId, Integer userId, Integer beneficiaryUserId, String amount, String currency, Integer transferTypeId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        ParameterizedTypeReference<TransferObject> localVarReturnType = new ParameterizedTypeReference<TransferObject>() {};
        return getTransfersRequestCreation(accessTag, transferId, transferTag, transferStatus, walletId, beneficiaryWalletId, userId, beneficiaryUserId, amount, currency, transferTypeId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo).bodyToMono(localVarReturnType);
    }

    /**
     * Search Transfers
     * Retrieve the list of transfers for at least one of those inputs: &#x60;walletId&#x60;, &#x60;beneficiaryWalletId&#x60;, &#x60;userId&#x60;, &#x60;beneficiaryUserId&#x60;, &#x60;transferId&#x60;, &#x60;transferTag&#x60; 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param transferId The unique identifier of the Transfer.
     * @param transferTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Max length: 250 characters.   Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param transferStatus The status of the Transfer. 
     * @param walletId The unique identifier of the debited Wallet.
     * @param beneficiaryWalletId The unique identifier of the credited Wallet.
     * @param userId The unique identifier of the owner of the debited Wallet.
     * @param beneficiaryUserId The unique identifier of the owner of the credited Wallet.
     * @param amount The amount of the Transfer.
     * @param currency The currency of the Transfer amount. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies). 
     * @param transferTypeId The type of the Transfer: * &#x60;1&#x60; – Wallet to wallet  * &#x60;2&#x60; – Card transaction * &#x60;3&#x60; – Client fees * &#x60;4&#x60; – Credit note 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @return ResponseEntity&lt;TransferObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TransferObject>> getTransfersWithHttpInfo(String accessTag, Integer transferId, String transferTag, String transferStatus, Integer walletId, Integer beneficiaryWalletId, Integer userId, Integer beneficiaryUserId, String amount, String currency, Integer transferTypeId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        ParameterizedTypeReference<TransferObject> localVarReturnType = new ParameterizedTypeReference<TransferObject>() {};
        return getTransfersRequestCreation(accessTag, transferId, transferTag, transferStatus, walletId, beneficiaryWalletId, userId, beneficiaryUserId, amount, currency, transferTypeId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo).toEntity(localVarReturnType);
    }

    /**
     * Search Transfers
     * Retrieve the list of transfers for at least one of those inputs: &#x60;walletId&#x60;, &#x60;beneficiaryWalletId&#x60;, &#x60;userId&#x60;, &#x60;beneficiaryUserId&#x60;, &#x60;transferId&#x60;, &#x60;transferTag&#x60; 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param transferId The unique identifier of the Transfer.
     * @param transferTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Max length: 250 characters.   Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param transferStatus The status of the Transfer. 
     * @param walletId The unique identifier of the debited Wallet.
     * @param beneficiaryWalletId The unique identifier of the credited Wallet.
     * @param userId The unique identifier of the owner of the debited Wallet.
     * @param beneficiaryUserId The unique identifier of the owner of the credited Wallet.
     * @param amount The amount of the Transfer.
     * @param currency The currency of the Transfer amount. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies). 
     * @param transferTypeId The type of the Transfer: * &#x60;1&#x60; – Wallet to wallet  * &#x60;2&#x60; – Card transaction * &#x60;3&#x60; – Client fees * &#x60;4&#x60; – Credit note 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTransfersWithResponseSpec(String accessTag, Integer transferId, String transferTag, String transferStatus, Integer walletId, Integer beneficiaryWalletId, Integer userId, Integer beneficiaryUserId, String amount, String currency, Integer transferTypeId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        return getTransfersRequestCreation(accessTag, transferId, transferTag, transferStatus, walletId, beneficiaryWalletId, userId, beneficiaryUserId, amount, currency, transferTypeId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
    }

    /**
     * Create Transfer
     * Create a new Wallet-to-Wallet transfer.  This endpoint requires per-session or per-operation [SCA](/guide/strong-customer-authentication/introduction.html) on if the &#x60;beneficiaryWalletId&#x60; belongs to the current User or not. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postTransfersRequest The postTransfersRequest parameter
     * @return TransferObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postTransfersRequestCreation(PostTransfersRequest postTransfersRequest) throws WebClientResponseException {
        Object postBody = postTransfersRequest;
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

        ParameterizedTypeReference<TransferObject> localVarReturnType = new ParameterizedTypeReference<TransferObject>() {};
        return apiClient.invokeAPI("/v1/transfers", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Transfer
     * Create a new Wallet-to-Wallet transfer.  This endpoint requires per-session or per-operation [SCA](/guide/strong-customer-authentication/introduction.html) on if the &#x60;beneficiaryWalletId&#x60; belongs to the current User or not. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postTransfersRequest The postTransfersRequest parameter
     * @return TransferObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TransferObject> postTransfers(PostTransfersRequest postTransfersRequest) throws WebClientResponseException {
        ParameterizedTypeReference<TransferObject> localVarReturnType = new ParameterizedTypeReference<TransferObject>() {};
        return postTransfersRequestCreation(postTransfersRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Transfer
     * Create a new Wallet-to-Wallet transfer.  This endpoint requires per-session or per-operation [SCA](/guide/strong-customer-authentication/introduction.html) on if the &#x60;beneficiaryWalletId&#x60; belongs to the current User or not. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postTransfersRequest The postTransfersRequest parameter
     * @return ResponseEntity&lt;TransferObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TransferObject>> postTransfersWithHttpInfo(PostTransfersRequest postTransfersRequest) throws WebClientResponseException {
        ParameterizedTypeReference<TransferObject> localVarReturnType = new ParameterizedTypeReference<TransferObject>() {};
        return postTransfersRequestCreation(postTransfersRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Transfer
     * Create a new Wallet-to-Wallet transfer.  This endpoint requires per-session or per-operation [SCA](/guide/strong-customer-authentication/introduction.html) on if the &#x60;beneficiaryWalletId&#x60; belongs to the current User or not. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postTransfersRequest The postTransfersRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postTransfersWithResponseSpec(PostTransfersRequest postTransfersRequest) throws WebClientResponseException {
        return postTransfersRequestCreation(postTransfersRequest);
    }
}
