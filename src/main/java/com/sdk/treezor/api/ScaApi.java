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
import com.sdk.treezor.model.GetSCAWalletsDefaultResponseInner;
import com.sdk.treezor.model.PostScaWalletRequest;
import com.sdk.treezor.model.PutScaWalletRequest;
import com.sdk.treezor.model.ScaWalletObject;
import com.sdk.treezor.model.SetPasscodeRequest;
import com.sdk.treezor.model.SwapSCAWalletsRequest;

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
public class ScaApi {
    private ApiClient apiClient;

    public ScaApi() {
        this(new ApiClient());
    }

    @Autowired
    public ScaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Delete SCA Wallet
     * Permanently delete an SCA Wallet.
     * <p><b>200</b> - The wallet was successfully deleted.
     * <p><b>0</b> - Unexpected error
     * @param scaWalletId The unique identifier of the SCA Wallet.
     * @return ScaWalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteScaWalletRequestCreation(String scaWalletId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'scaWalletId' is set
        if (scaWalletId == null) {
            throw new WebClientResponseException("Missing the required parameter 'scaWalletId' when calling deleteScaWallet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("scaWalletId", scaWalletId);

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

        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return apiClient.invokeAPI("/core-connect/sca/scawallets/{scaWalletId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete SCA Wallet
     * Permanently delete an SCA Wallet.
     * <p><b>200</b> - The wallet was successfully deleted.
     * <p><b>0</b> - Unexpected error
     * @param scaWalletId The unique identifier of the SCA Wallet.
     * @return ScaWalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ScaWalletObject> deleteScaWallet(String scaWalletId) throws WebClientResponseException {
        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return deleteScaWalletRequestCreation(scaWalletId).bodyToMono(localVarReturnType);
    }

    /**
     * Delete SCA Wallet
     * Permanently delete an SCA Wallet.
     * <p><b>200</b> - The wallet was successfully deleted.
     * <p><b>0</b> - Unexpected error
     * @param scaWalletId The unique identifier of the SCA Wallet.
     * @return ResponseEntity&lt;ScaWalletObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ScaWalletObject>> deleteScaWalletWithHttpInfo(String scaWalletId) throws WebClientResponseException {
        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return deleteScaWalletRequestCreation(scaWalletId).toEntity(localVarReturnType);
    }

    /**
     * Delete SCA Wallet
     * Permanently delete an SCA Wallet.
     * <p><b>200</b> - The wallet was successfully deleted.
     * <p><b>0</b> - Unexpected error
     * @param scaWalletId The unique identifier of the SCA Wallet.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteScaWalletWithResponseSpec(String scaWalletId) throws WebClientResponseException {
        return deleteScaWalletRequestCreation(scaWalletId);
    }

    /**
     * Search SCA Wallets
     * Retrieve the list of [SCA Wallets](/guide/strong-customer-authentication/introduction.html#sca-wallet-object) for a given user.
     * <p><b>200</b> - The list of wallet was successfully retrieved.
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the user.
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @return ScaWalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSCAWalletsRequestCreation(String userId, String cursor) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new WebClientResponseException("Missing the required parameter 'userId' when calling getSCAWallets", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return apiClient.invokeAPI("/core-connect/sca/scawallets", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search SCA Wallets
     * Retrieve the list of [SCA Wallets](/guide/strong-customer-authentication/introduction.html#sca-wallet-object) for a given user.
     * <p><b>200</b> - The list of wallet was successfully retrieved.
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the user.
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @return ScaWalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ScaWalletObject> getSCAWallets(String userId, String cursor) throws WebClientResponseException {
        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return getSCAWalletsRequestCreation(userId, cursor).bodyToMono(localVarReturnType);
    }

    /**
     * Search SCA Wallets
     * Retrieve the list of [SCA Wallets](/guide/strong-customer-authentication/introduction.html#sca-wallet-object) for a given user.
     * <p><b>200</b> - The list of wallet was successfully retrieved.
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the user.
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @return ResponseEntity&lt;ScaWalletObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ScaWalletObject>> getSCAWalletsWithHttpInfo(String userId, String cursor) throws WebClientResponseException {
        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return getSCAWalletsRequestCreation(userId, cursor).toEntity(localVarReturnType);
    }

    /**
     * Search SCA Wallets
     * Retrieve the list of [SCA Wallets](/guide/strong-customer-authentication/introduction.html#sca-wallet-object) for a given user.
     * <p><b>200</b> - The list of wallet was successfully retrieved.
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the user.
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSCAWalletsWithResponseSpec(String userId, String cursor) throws WebClientResponseException {
        return getSCAWalletsRequestCreation(userId, cursor);
    }

    /**
     * Get SCA Wallet
     * Retrieve an SCA Wallet by providing its &#x60;id&#x60;.
     * <p><b>200</b> - The wallet was successfully retrieved.
     * <p><b>404</b> - The wallet was not found.
     * <p><b>0</b> - Unexpected error
     * @param scaWalletId The unique identifier of the SCA Wallet.
     * @return ScaWalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getScaWalletRequestCreation(String scaWalletId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'scaWalletId' is set
        if (scaWalletId == null) {
            throw new WebClientResponseException("Missing the required parameter 'scaWalletId' when calling getScaWallet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("scaWalletId", scaWalletId);

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

        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return apiClient.invokeAPI("/core-connect/sca/scawallets/{scaWalletId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get SCA Wallet
     * Retrieve an SCA Wallet by providing its &#x60;id&#x60;.
     * <p><b>200</b> - The wallet was successfully retrieved.
     * <p><b>404</b> - The wallet was not found.
     * <p><b>0</b> - Unexpected error
     * @param scaWalletId The unique identifier of the SCA Wallet.
     * @return ScaWalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ScaWalletObject> getScaWallet(String scaWalletId) throws WebClientResponseException {
        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return getScaWalletRequestCreation(scaWalletId).bodyToMono(localVarReturnType);
    }

    /**
     * Get SCA Wallet
     * Retrieve an SCA Wallet by providing its &#x60;id&#x60;.
     * <p><b>200</b> - The wallet was successfully retrieved.
     * <p><b>404</b> - The wallet was not found.
     * <p><b>0</b> - Unexpected error
     * @param scaWalletId The unique identifier of the SCA Wallet.
     * @return ResponseEntity&lt;ScaWalletObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ScaWalletObject>> getScaWalletWithHttpInfo(String scaWalletId) throws WebClientResponseException {
        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return getScaWalletRequestCreation(scaWalletId).toEntity(localVarReturnType);
    }

    /**
     * Get SCA Wallet
     * Retrieve an SCA Wallet by providing its &#x60;id&#x60;.
     * <p><b>200</b> - The wallet was successfully retrieved.
     * <p><b>404</b> - The wallet was not found.
     * <p><b>0</b> - Unexpected error
     * @param scaWalletId The unique identifier of the SCA Wallet.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getScaWalletWithResponseSpec(String scaWalletId) throws WebClientResponseException {
        return getScaWalletRequestCreation(scaWalletId);
    }

    /**
     * Create SCA Wallet
     * Create a new [SCA Wallet](/guide/strong-customer-authentication/introduction.html#sca-wallet-object) manually.
     * <p><b>200</b> - The wallet was successfully created.
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param postScaWalletRequest The postScaWalletRequest parameter
     * @return ScaWalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postScaWalletRequestCreation(PostScaWalletRequest postScaWalletRequest) throws WebClientResponseException {
        Object postBody = postScaWalletRequest;
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

        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return apiClient.invokeAPI("/core-connect/sca/scawallets", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create SCA Wallet
     * Create a new [SCA Wallet](/guide/strong-customer-authentication/introduction.html#sca-wallet-object) manually.
     * <p><b>200</b> - The wallet was successfully created.
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param postScaWalletRequest The postScaWalletRequest parameter
     * @return ScaWalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ScaWalletObject> postScaWallet(PostScaWalletRequest postScaWalletRequest) throws WebClientResponseException {
        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return postScaWalletRequestCreation(postScaWalletRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create SCA Wallet
     * Create a new [SCA Wallet](/guide/strong-customer-authentication/introduction.html#sca-wallet-object) manually.
     * <p><b>200</b> - The wallet was successfully created.
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param postScaWalletRequest The postScaWalletRequest parameter
     * @return ResponseEntity&lt;ScaWalletObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ScaWalletObject>> postScaWalletWithHttpInfo(PostScaWalletRequest postScaWalletRequest) throws WebClientResponseException {
        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return postScaWalletRequestCreation(postScaWalletRequest).toEntity(localVarReturnType);
    }

    /**
     * Create SCA Wallet
     * Create a new [SCA Wallet](/guide/strong-customer-authentication/introduction.html#sca-wallet-object) manually.
     * <p><b>200</b> - The wallet was successfully created.
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param postScaWalletRequest The postScaWalletRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postScaWalletWithResponseSpec(PostScaWalletRequest postScaWalletRequest) throws WebClientResponseException {
        return postScaWalletRequestCreation(postScaWalletRequest);
    }

    /**
     * Lock SCA Wallet
     * Locks an SCA Wallet so that none of the services it offers can be unlocked until it is unlocked. 
     * <p><b>200</b> - The wallet is locked.
     * <p><b>400</b> - The lock reason field is required.
     * <p><b>0</b> - Unexpected error
     * @param scaWalletId The unique identifier of the SCA Wallet.
     * @param putScaWalletRequest The putScaWalletRequest parameter
     * @return ScaWalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putScaWalletRequestCreation(String scaWalletId, PutScaWalletRequest putScaWalletRequest) throws WebClientResponseException {
        Object postBody = putScaWalletRequest;
        // verify the required parameter 'scaWalletId' is set
        if (scaWalletId == null) {
            throw new WebClientResponseException("Missing the required parameter 'scaWalletId' when calling putScaWallet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("scaWalletId", scaWalletId);

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

        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return apiClient.invokeAPI("/core-connect/sca/scawallets/{scaWalletId}/lock", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Lock SCA Wallet
     * Locks an SCA Wallet so that none of the services it offers can be unlocked until it is unlocked. 
     * <p><b>200</b> - The wallet is locked.
     * <p><b>400</b> - The lock reason field is required.
     * <p><b>0</b> - Unexpected error
     * @param scaWalletId The unique identifier of the SCA Wallet.
     * @param putScaWalletRequest The putScaWalletRequest parameter
     * @return ScaWalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ScaWalletObject> putScaWallet(String scaWalletId, PutScaWalletRequest putScaWalletRequest) throws WebClientResponseException {
        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return putScaWalletRequestCreation(scaWalletId, putScaWalletRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Lock SCA Wallet
     * Locks an SCA Wallet so that none of the services it offers can be unlocked until it is unlocked. 
     * <p><b>200</b> - The wallet is locked.
     * <p><b>400</b> - The lock reason field is required.
     * <p><b>0</b> - Unexpected error
     * @param scaWalletId The unique identifier of the SCA Wallet.
     * @param putScaWalletRequest The putScaWalletRequest parameter
     * @return ResponseEntity&lt;ScaWalletObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ScaWalletObject>> putScaWalletWithHttpInfo(String scaWalletId, PutScaWalletRequest putScaWalletRequest) throws WebClientResponseException {
        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return putScaWalletRequestCreation(scaWalletId, putScaWalletRequest).toEntity(localVarReturnType);
    }

    /**
     * Lock SCA Wallet
     * Locks an SCA Wallet so that none of the services it offers can be unlocked until it is unlocked. 
     * <p><b>200</b> - The wallet is locked.
     * <p><b>400</b> - The lock reason field is required.
     * <p><b>0</b> - Unexpected error
     * @param scaWalletId The unique identifier of the SCA Wallet.
     * @param putScaWalletRequest The putScaWalletRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putScaWalletWithResponseSpec(String scaWalletId, PutScaWalletRequest putScaWalletRequest) throws WebClientResponseException {
        return putScaWalletRequestCreation(scaWalletId, putScaWalletRequest);
    }

    /**
     * Reset PIN
     * Reset the PIN code of an SCA Wallet if the user has locked their Wallet after too many consecutive wrong PIN attempts. See [Reset PIN (Mobile)](/guide/strong-customer-authentication/sca-wallet-lifecycle.html#reset-pin-mobile) for more information.  Once the PIN reset, the Customer can set a new PIN via the mobile application. 
     * <p><b>200</b> - PIN has been reset.
     * <p><b>0</b> - Unexpected error
     * @param scaWalletId The unique identifier of the SCA Wallet.
     * @return ScaWalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec resetScaWalletPinRequestCreation(String scaWalletId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'scaWalletId' is set
        if (scaWalletId == null) {
            throw new WebClientResponseException("Missing the required parameter 'scaWalletId' when calling resetScaWalletPin", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("scaWalletId", scaWalletId);

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

        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return apiClient.invokeAPI("/core-connect/sca/scawallets/{scaWalletId}/resetPin", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Reset PIN
     * Reset the PIN code of an SCA Wallet if the user has locked their Wallet after too many consecutive wrong PIN attempts. See [Reset PIN (Mobile)](/guide/strong-customer-authentication/sca-wallet-lifecycle.html#reset-pin-mobile) for more information.  Once the PIN reset, the Customer can set a new PIN via the mobile application. 
     * <p><b>200</b> - PIN has been reset.
     * <p><b>0</b> - Unexpected error
     * @param scaWalletId The unique identifier of the SCA Wallet.
     * @return ScaWalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ScaWalletObject> resetScaWalletPin(String scaWalletId) throws WebClientResponseException {
        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return resetScaWalletPinRequestCreation(scaWalletId).bodyToMono(localVarReturnType);
    }

    /**
     * Reset PIN
     * Reset the PIN code of an SCA Wallet if the user has locked their Wallet after too many consecutive wrong PIN attempts. See [Reset PIN (Mobile)](/guide/strong-customer-authentication/sca-wallet-lifecycle.html#reset-pin-mobile) for more information.  Once the PIN reset, the Customer can set a new PIN via the mobile application. 
     * <p><b>200</b> - PIN has been reset.
     * <p><b>0</b> - Unexpected error
     * @param scaWalletId The unique identifier of the SCA Wallet.
     * @return ResponseEntity&lt;ScaWalletObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ScaWalletObject>> resetScaWalletPinWithHttpInfo(String scaWalletId) throws WebClientResponseException {
        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return resetScaWalletPinRequestCreation(scaWalletId).toEntity(localVarReturnType);
    }

    /**
     * Reset PIN
     * Reset the PIN code of an SCA Wallet if the user has locked their Wallet after too many consecutive wrong PIN attempts. See [Reset PIN (Mobile)](/guide/strong-customer-authentication/sca-wallet-lifecycle.html#reset-pin-mobile) for more information.  Once the PIN reset, the Customer can set a new PIN via the mobile application. 
     * <p><b>200</b> - PIN has been reset.
     * <p><b>0</b> - Unexpected error
     * @param scaWalletId The unique identifier of the SCA Wallet.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec resetScaWalletPinWithResponseSpec(String scaWalletId) throws WebClientResponseException {
        return resetScaWalletPinRequestCreation(scaWalletId);
    }

    /**
     * Change Passcode
     * Change the passcode ([Web Native SCA](/guide/strong-customer-authentication/introduction.html#web-native)). 
     * <p><b>204</b> - Accepted
     * @param setPasscodeRequest The setPasscodeRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec setPasscodeRequestCreation(SetPasscodeRequest setPasscodeRequest) throws WebClientResponseException {
        Object postBody = setPasscodeRequest;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/core-connect/sca/setPasscode", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Change Passcode
     * Change the passcode ([Web Native SCA](/guide/strong-customer-authentication/introduction.html#web-native)). 
     * <p><b>204</b> - Accepted
     * @param setPasscodeRequest The setPasscodeRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> setPasscode(SetPasscodeRequest setPasscodeRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return setPasscodeRequestCreation(setPasscodeRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Change Passcode
     * Change the passcode ([Web Native SCA](/guide/strong-customer-authentication/introduction.html#web-native)). 
     * <p><b>204</b> - Accepted
     * @param setPasscodeRequest The setPasscodeRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> setPasscodeWithHttpInfo(SetPasscodeRequest setPasscodeRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return setPasscodeRequestCreation(setPasscodeRequest).toEntity(localVarReturnType);
    }

    /**
     * Change Passcode
     * Change the passcode ([Web Native SCA](/guide/strong-customer-authentication/introduction.html#web-native)). 
     * <p><b>204</b> - Accepted
     * @param setPasscodeRequest The setPasscodeRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec setPasscodeWithResponseSpec(SetPasscodeRequest setPasscodeRequest) throws WebClientResponseException {
        return setPasscodeRequestCreation(setPasscodeRequest);
    }

    /**
     * Swap SCA Wallets
     * Create an SCA Wallet while deleting the previous one as users should have only one device enrolled.
     * <p><b>200</b> - The list of wallet was successfully retrieved.
     * <p><b>0</b> - Unexpected error
     * @param swapSCAWalletsRequest The swapSCAWalletsRequest parameter
     * @return ScaWalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec swapSCAWalletsRequestCreation(SwapSCAWalletsRequest swapSCAWalletsRequest) throws WebClientResponseException {
        Object postBody = swapSCAWalletsRequest;
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

        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return apiClient.invokeAPI("/core-connect/sca/scawallets/swap", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Swap SCA Wallets
     * Create an SCA Wallet while deleting the previous one as users should have only one device enrolled.
     * <p><b>200</b> - The list of wallet was successfully retrieved.
     * <p><b>0</b> - Unexpected error
     * @param swapSCAWalletsRequest The swapSCAWalletsRequest parameter
     * @return ScaWalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ScaWalletObject> swapSCAWallets(SwapSCAWalletsRequest swapSCAWalletsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return swapSCAWalletsRequestCreation(swapSCAWalletsRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Swap SCA Wallets
     * Create an SCA Wallet while deleting the previous one as users should have only one device enrolled.
     * <p><b>200</b> - The list of wallet was successfully retrieved.
     * <p><b>0</b> - Unexpected error
     * @param swapSCAWalletsRequest The swapSCAWalletsRequest parameter
     * @return ResponseEntity&lt;ScaWalletObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ScaWalletObject>> swapSCAWalletsWithHttpInfo(SwapSCAWalletsRequest swapSCAWalletsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return swapSCAWalletsRequestCreation(swapSCAWalletsRequest).toEntity(localVarReturnType);
    }

    /**
     * Swap SCA Wallets
     * Create an SCA Wallet while deleting the previous one as users should have only one device enrolled.
     * <p><b>200</b> - The list of wallet was successfully retrieved.
     * <p><b>0</b> - Unexpected error
     * @param swapSCAWalletsRequest The swapSCAWalletsRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec swapSCAWalletsWithResponseSpec(SwapSCAWalletsRequest swapSCAWalletsRequest) throws WebClientResponseException {
        return swapSCAWalletsRequestCreation(swapSCAWalletsRequest);
    }

    /**
     * Unlock SCA Wallet
     * Unlock an SCA Wallet.
     * <p><b>200</b> - The wallet is unlocked.
     * <p><b>0</b> - Unexpected error
     * @param scaWalletId The unique identifier of the SCA Wallet.
     * @return ScaWalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec unlockScaWalletRequestCreation(String scaWalletId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'scaWalletId' is set
        if (scaWalletId == null) {
            throw new WebClientResponseException("Missing the required parameter 'scaWalletId' when calling unlockScaWallet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("scaWalletId", scaWalletId);

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

        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return apiClient.invokeAPI("/core-connect/sca/scawallets/{scaWalletId}/unlock", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Unlock SCA Wallet
     * Unlock an SCA Wallet.
     * <p><b>200</b> - The wallet is unlocked.
     * <p><b>0</b> - Unexpected error
     * @param scaWalletId The unique identifier of the SCA Wallet.
     * @return ScaWalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ScaWalletObject> unlockScaWallet(String scaWalletId) throws WebClientResponseException {
        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return unlockScaWalletRequestCreation(scaWalletId).bodyToMono(localVarReturnType);
    }

    /**
     * Unlock SCA Wallet
     * Unlock an SCA Wallet.
     * <p><b>200</b> - The wallet is unlocked.
     * <p><b>0</b> - Unexpected error
     * @param scaWalletId The unique identifier of the SCA Wallet.
     * @return ResponseEntity&lt;ScaWalletObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ScaWalletObject>> unlockScaWalletWithHttpInfo(String scaWalletId) throws WebClientResponseException {
        ParameterizedTypeReference<ScaWalletObject> localVarReturnType = new ParameterizedTypeReference<ScaWalletObject>() {};
        return unlockScaWalletRequestCreation(scaWalletId).toEntity(localVarReturnType);
    }

    /**
     * Unlock SCA Wallet
     * Unlock an SCA Wallet.
     * <p><b>200</b> - The wallet is unlocked.
     * <p><b>0</b> - Unexpected error
     * @param scaWalletId The unique identifier of the SCA Wallet.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec unlockScaWalletWithResponseSpec(String scaWalletId) throws WebClientResponseException {
        return unlockScaWalletRequestCreation(scaWalletId);
    }
}
