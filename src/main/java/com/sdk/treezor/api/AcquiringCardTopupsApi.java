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

import com.sdk.treezor.model.AcquiringPayin;
import com.sdk.treezor.model.Authorization;
import com.sdk.treezor.model.AuthorizationDeleteResponse;
import com.sdk.treezor.model.AuthorizationRequest;
import com.sdk.treezor.model.CaptureResponse;
import com.sdk.treezor.model.ChargebacksResponse;
import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.PostAcqAuthPayinRequest;
import com.sdk.treezor.model.RefundRequest;
import com.sdk.treezor.model.RefundsResponse;
import com.sdk.treezor.model.TopupCardRequest;
import com.sdk.treezor.model.TopupCards;
import java.util.UUID;

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
public class AcquiringCardTopupsApi {
    private ApiClient apiClient;

    public AcquiringCardTopupsApi() {
        this(new ApiClient());
    }

    @Autowired
    public AcquiringCardTopupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Get Chargeback
     * Retrieve a card acquiring a chargeback from the system.
     * <p><b>200</b> - Chargeback returned
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param chargebackUuid Universally unique identifier (UUID) of the chargeback
     * @return ChargebacksResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec acquiringv2TopupCardsChargebacksGetRequestCreation(UUID chargebackUuid) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'chargebackUuid' is set
        if (chargebackUuid == null) {
            throw new WebClientResponseException("Missing the required parameter 'chargebackUuid' when calling acquiringv2TopupCardsChargebacksGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("chargebackUuid", chargebackUuid);

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

        ParameterizedTypeReference<ChargebacksResponse> localVarReturnType = new ParameterizedTypeReference<ChargebacksResponse>() {};
        return apiClient.invokeAPI("/v1/topups/cards/chargebacks/{chargebackUuid}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Chargeback
     * Retrieve a card acquiring a chargeback from the system.
     * <p><b>200</b> - Chargeback returned
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param chargebackUuid Universally unique identifier (UUID) of the chargeback
     * @return ChargebacksResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ChargebacksResponse> acquiringv2TopupCardsChargebacksGet(UUID chargebackUuid) throws WebClientResponseException {
        ParameterizedTypeReference<ChargebacksResponse> localVarReturnType = new ParameterizedTypeReference<ChargebacksResponse>() {};
        return acquiringv2TopupCardsChargebacksGetRequestCreation(chargebackUuid).bodyToMono(localVarReturnType);
    }

    /**
     * Get Chargeback
     * Retrieve a card acquiring a chargeback from the system.
     * <p><b>200</b> - Chargeback returned
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param chargebackUuid Universally unique identifier (UUID) of the chargeback
     * @return ResponseEntity&lt;ChargebacksResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ChargebacksResponse>> acquiringv2TopupCardsChargebacksGetWithHttpInfo(UUID chargebackUuid) throws WebClientResponseException {
        ParameterizedTypeReference<ChargebacksResponse> localVarReturnType = new ParameterizedTypeReference<ChargebacksResponse>() {};
        return acquiringv2TopupCardsChargebacksGetRequestCreation(chargebackUuid).toEntity(localVarReturnType);
    }

    /**
     * Get Chargeback
     * Retrieve a card acquiring a chargeback from the system.
     * <p><b>200</b> - Chargeback returned
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param chargebackUuid Universally unique identifier (UUID) of the chargeback
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec acquiringv2TopupCardsChargebacksGetWithResponseSpec(UUID chargebackUuid) throws WebClientResponseException {
        return acquiringv2TopupCardsChargebacksGetRequestCreation(chargebackUuid);
    }

    /**
     * Get Refund
     * Retrieve a card acquring refund from the system.
     * <p><b>200</b> - Refund returned
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param refundUuid Universally unique identifier (UUID) of the refund
     * @return RefundsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec acquiringv2TopupCardsRefundsGetRequestCreation(UUID refundUuid) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'refundUuid' is set
        if (refundUuid == null) {
            throw new WebClientResponseException("Missing the required parameter 'refundUuid' when calling acquiringv2TopupCardsRefundsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("refundUuid", refundUuid);

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

        ParameterizedTypeReference<RefundsResponse> localVarReturnType = new ParameterizedTypeReference<RefundsResponse>() {};
        return apiClient.invokeAPI("/v1/topups/cards/refunds/{refundUuid}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Refund
     * Retrieve a card acquring refund from the system.
     * <p><b>200</b> - Refund returned
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param refundUuid Universally unique identifier (UUID) of the refund
     * @return RefundsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RefundsResponse> acquiringv2TopupCardsRefundsGet(UUID refundUuid) throws WebClientResponseException {
        ParameterizedTypeReference<RefundsResponse> localVarReturnType = new ParameterizedTypeReference<RefundsResponse>() {};
        return acquiringv2TopupCardsRefundsGetRequestCreation(refundUuid).bodyToMono(localVarReturnType);
    }

    /**
     * Get Refund
     * Retrieve a card acquring refund from the system.
     * <p><b>200</b> - Refund returned
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param refundUuid Universally unique identifier (UUID) of the refund
     * @return ResponseEntity&lt;RefundsResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<RefundsResponse>> acquiringv2TopupCardsRefundsGetWithHttpInfo(UUID refundUuid) throws WebClientResponseException {
        ParameterizedTypeReference<RefundsResponse> localVarReturnType = new ParameterizedTypeReference<RefundsResponse>() {};
        return acquiringv2TopupCardsRefundsGetRequestCreation(refundUuid).toEntity(localVarReturnType);
    }

    /**
     * Get Refund
     * Retrieve a card acquring refund from the system.
     * <p><b>200</b> - Refund returned
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param refundUuid Universally unique identifier (UUID) of the refund
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec acquiringv2TopupCardsRefundsGetWithResponseSpec(UUID refundUuid) throws WebClientResponseException {
        return acquiringv2TopupCardsRefundsGetRequestCreation(refundUuid);
    }

    /**
     * Create Refund
     * Create a new card topup refund.
     * <p><b>200</b> - Payin successfully refunded. A list of refunds is returned.
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param refundRequest The refundRequest parameter
     * @return RefundsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec acquiringv2TopupCardsRefundsPostRequestCreation(RefundRequest refundRequest) throws WebClientResponseException {
        Object postBody = refundRequest;
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

        ParameterizedTypeReference<RefundsResponse> localVarReturnType = new ParameterizedTypeReference<RefundsResponse>() {};
        return apiClient.invokeAPI("/v1/topups/cards/refunds", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Refund
     * Create a new card topup refund.
     * <p><b>200</b> - Payin successfully refunded. A list of refunds is returned.
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param refundRequest The refundRequest parameter
     * @return RefundsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RefundsResponse> acquiringv2TopupCardsRefundsPost(RefundRequest refundRequest) throws WebClientResponseException {
        ParameterizedTypeReference<RefundsResponse> localVarReturnType = new ParameterizedTypeReference<RefundsResponse>() {};
        return acquiringv2TopupCardsRefundsPostRequestCreation(refundRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Refund
     * Create a new card topup refund.
     * <p><b>200</b> - Payin successfully refunded. A list of refunds is returned.
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param refundRequest The refundRequest parameter
     * @return ResponseEntity&lt;RefundsResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<RefundsResponse>> acquiringv2TopupCardsRefundsPostWithHttpInfo(RefundRequest refundRequest) throws WebClientResponseException {
        ParameterizedTypeReference<RefundsResponse> localVarReturnType = new ParameterizedTypeReference<RefundsResponse>() {};
        return acquiringv2TopupCardsRefundsPostRequestCreation(refundRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Refund
     * Create a new card topup refund.
     * <p><b>200</b> - Payin successfully refunded. A list of refunds is returned.
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param refundRequest The refundRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec acquiringv2TopupCardsRefundsPostWithResponseSpec(RefundRequest refundRequest) throws WebClientResponseException {
        return acquiringv2TopupCardsRefundsPostRequestCreation(refundRequest);
    }

    /**
     * Delete Authorization
     * Delete an authorization from the system
     * <p><b>200</b> - Authorization returned
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param authorizationUuid Universally unique identifier (UUID) of the authorization
     * @return AuthorizationDeleteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteAcqAuthRequestCreation(UUID authorizationUuid) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'authorizationUuid' is set
        if (authorizationUuid == null) {
            throw new WebClientResponseException("Missing the required parameter 'authorizationUuid' when calling deleteAcqAuth", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("authorizationUuid", authorizationUuid);

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

        ParameterizedTypeReference<AuthorizationDeleteResponse> localVarReturnType = new ParameterizedTypeReference<AuthorizationDeleteResponse>() {};
        return apiClient.invokeAPI("/v1/topups/cards/authorizations/{authorizationUuid}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete Authorization
     * Delete an authorization from the system
     * <p><b>200</b> - Authorization returned
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param authorizationUuid Universally unique identifier (UUID) of the authorization
     * @return AuthorizationDeleteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AuthorizationDeleteResponse> deleteAcqAuth(UUID authorizationUuid) throws WebClientResponseException {
        ParameterizedTypeReference<AuthorizationDeleteResponse> localVarReturnType = new ParameterizedTypeReference<AuthorizationDeleteResponse>() {};
        return deleteAcqAuthRequestCreation(authorizationUuid).bodyToMono(localVarReturnType);
    }

    /**
     * Delete Authorization
     * Delete an authorization from the system
     * <p><b>200</b> - Authorization returned
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param authorizationUuid Universally unique identifier (UUID) of the authorization
     * @return ResponseEntity&lt;AuthorizationDeleteResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<AuthorizationDeleteResponse>> deleteAcqAuthWithHttpInfo(UUID authorizationUuid) throws WebClientResponseException {
        ParameterizedTypeReference<AuthorizationDeleteResponse> localVarReturnType = new ParameterizedTypeReference<AuthorizationDeleteResponse>() {};
        return deleteAcqAuthRequestCreation(authorizationUuid).toEntity(localVarReturnType);
    }

    /**
     * Delete Authorization
     * Delete an authorization from the system
     * <p><b>200</b> - Authorization returned
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param authorizationUuid Universally unique identifier (UUID) of the authorization
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteAcqAuthWithResponseSpec(UUID authorizationUuid) throws WebClientResponseException {
        return deleteAcqAuthRequestCreation(authorizationUuid);
    }

    /**
     * Cancel Topup Card
     * Change topup card status to CANCELED.
     * <p><b>200</b> - Topup card was canceled
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param userId The owning user identifier
     * @param topupCardId The identifier of the topup card to be canceled
     * @return TopupCards
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteTopupCardRequestCreation(String userId, String topupCardId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new WebClientResponseException("Missing the required parameter 'userId' when calling deleteTopupCard", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'topupCardId' is set
        if (topupCardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'topupCardId' when calling deleteTopupCard", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("userId", userId);
        pathParams.put("topupCardId", topupCardId);

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

        ParameterizedTypeReference<TopupCards> localVarReturnType = new ParameterizedTypeReference<TopupCards>() {};
        return apiClient.invokeAPI("/v1/topups/cards/users/{userId}/topupCards/{topupCardId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Cancel Topup Card
     * Change topup card status to CANCELED.
     * <p><b>200</b> - Topup card was canceled
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param userId The owning user identifier
     * @param topupCardId The identifier of the topup card to be canceled
     * @return TopupCards
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TopupCards> deleteTopupCard(String userId, String topupCardId) throws WebClientResponseException {
        ParameterizedTypeReference<TopupCards> localVarReturnType = new ParameterizedTypeReference<TopupCards>() {};
        return deleteTopupCardRequestCreation(userId, topupCardId).bodyToMono(localVarReturnType);
    }

    /**
     * Cancel Topup Card
     * Change topup card status to CANCELED.
     * <p><b>200</b> - Topup card was canceled
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param userId The owning user identifier
     * @param topupCardId The identifier of the topup card to be canceled
     * @return ResponseEntity&lt;TopupCards&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TopupCards>> deleteTopupCardWithHttpInfo(String userId, String topupCardId) throws WebClientResponseException {
        ParameterizedTypeReference<TopupCards> localVarReturnType = new ParameterizedTypeReference<TopupCards>() {};
        return deleteTopupCardRequestCreation(userId, topupCardId).toEntity(localVarReturnType);
    }

    /**
     * Cancel Topup Card
     * Change topup card status to CANCELED.
     * <p><b>200</b> - Topup card was canceled
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param userId The owning user identifier
     * @param topupCardId The identifier of the topup card to be canceled
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteTopupCardWithResponseSpec(String userId, String topupCardId) throws WebClientResponseException {
        return deleteTopupCardRequestCreation(userId, topupCardId);
    }

    /**
     * Get Authorization
     * Retrieve an authorization from the system.
     * <p><b>200</b> - Authorization returned
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param authorizationUuid Universally unique identifier (UUID) of the authorization
     * @return Authorization
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getAcqAuthRequestCreation(UUID authorizationUuid) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'authorizationUuid' is set
        if (authorizationUuid == null) {
            throw new WebClientResponseException("Missing the required parameter 'authorizationUuid' when calling getAcqAuth", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("authorizationUuid", authorizationUuid);

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

        ParameterizedTypeReference<Authorization> localVarReturnType = new ParameterizedTypeReference<Authorization>() {};
        return apiClient.invokeAPI("/v1/topups/cards/authorizations/{authorizationUuid}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Authorization
     * Retrieve an authorization from the system.
     * <p><b>200</b> - Authorization returned
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param authorizationUuid Universally unique identifier (UUID) of the authorization
     * @return Authorization
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Authorization> getAcqAuth(UUID authorizationUuid) throws WebClientResponseException {
        ParameterizedTypeReference<Authorization> localVarReturnType = new ParameterizedTypeReference<Authorization>() {};
        return getAcqAuthRequestCreation(authorizationUuid).bodyToMono(localVarReturnType);
    }

    /**
     * Get Authorization
     * Retrieve an authorization from the system.
     * <p><b>200</b> - Authorization returned
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param authorizationUuid Universally unique identifier (UUID) of the authorization
     * @return ResponseEntity&lt;Authorization&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Authorization>> getAcqAuthWithHttpInfo(UUID authorizationUuid) throws WebClientResponseException {
        ParameterizedTypeReference<Authorization> localVarReturnType = new ParameterizedTypeReference<Authorization>() {};
        return getAcqAuthRequestCreation(authorizationUuid).toEntity(localVarReturnType);
    }

    /**
     * Get Authorization
     * Retrieve an authorization from the system.
     * <p><b>200</b> - Authorization returned
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param authorizationUuid Universally unique identifier (UUID) of the authorization
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getAcqAuthWithResponseSpec(UUID authorizationUuid) throws WebClientResponseException {
        return getAcqAuthRequestCreation(authorizationUuid);
    }

    /**
     * Get Authorization Payins
     * List payins created from a given authorization.
     * <p><b>200</b> - List of Payins is returned
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param authorizationUuid Universally unique identifier (UUID) of the authorization
     * @param exclusiveStartKey The exclusive start key returned by a previous call
     * @return List&lt;AcquiringPayin&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getAcqAuthPayinsRequestCreation(String authorizationUuid, String exclusiveStartKey) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'authorizationUuid' is set
        if (authorizationUuid == null) {
            throw new WebClientResponseException("Missing the required parameter 'authorizationUuid' when calling getAcqAuthPayins", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("authorizationUuid", authorizationUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "exclusiveStartKey", exclusiveStartKey));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<AcquiringPayin> localVarReturnType = new ParameterizedTypeReference<AcquiringPayin>() {};
        return apiClient.invokeAPI("/v1/topups/cards/authorizations/{authorizationUuid}/payins", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Authorization Payins
     * List payins created from a given authorization.
     * <p><b>200</b> - List of Payins is returned
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param authorizationUuid Universally unique identifier (UUID) of the authorization
     * @param exclusiveStartKey The exclusive start key returned by a previous call
     * @return List&lt;AcquiringPayin&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<AcquiringPayin> getAcqAuthPayins(String authorizationUuid, String exclusiveStartKey) throws WebClientResponseException {
        ParameterizedTypeReference<AcquiringPayin> localVarReturnType = new ParameterizedTypeReference<AcquiringPayin>() {};
        return getAcqAuthPayinsRequestCreation(authorizationUuid, exclusiveStartKey).bodyToFlux(localVarReturnType);
    }

    /**
     * Get Authorization Payins
     * List payins created from a given authorization.
     * <p><b>200</b> - List of Payins is returned
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param authorizationUuid Universally unique identifier (UUID) of the authorization
     * @param exclusiveStartKey The exclusive start key returned by a previous call
     * @return ResponseEntity&lt;List&lt;AcquiringPayin&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<AcquiringPayin>>> getAcqAuthPayinsWithHttpInfo(String authorizationUuid, String exclusiveStartKey) throws WebClientResponseException {
        ParameterizedTypeReference<AcquiringPayin> localVarReturnType = new ParameterizedTypeReference<AcquiringPayin>() {};
        return getAcqAuthPayinsRequestCreation(authorizationUuid, exclusiveStartKey).toEntityList(localVarReturnType);
    }

    /**
     * Get Authorization Payins
     * List payins created from a given authorization.
     * <p><b>200</b> - List of Payins is returned
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param authorizationUuid Universally unique identifier (UUID) of the authorization
     * @param exclusiveStartKey The exclusive start key returned by a previous call
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getAcqAuthPayinsWithResponseSpec(String authorizationUuid, String exclusiveStartKey) throws WebClientResponseException {
        return getAcqAuthPayinsRequestCreation(authorizationUuid, exclusiveStartKey);
    }

    /**
     * Get Topup Card
     * Retrieve the details of a Topup Card.
     * <p><b>200</b> - A topup card details search response
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param userId The owning user identifier
     * @param topupCardId The identifier of the topup card to be retrieved
     * @return TopupCards
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTopupCardRequestCreation(String userId, String topupCardId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new WebClientResponseException("Missing the required parameter 'userId' when calling getTopupCard", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'topupCardId' is set
        if (topupCardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'topupCardId' when calling getTopupCard", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("userId", userId);
        pathParams.put("topupCardId", topupCardId);

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

        ParameterizedTypeReference<TopupCards> localVarReturnType = new ParameterizedTypeReference<TopupCards>() {};
        return apiClient.invokeAPI("/v1/topups/cards/users/{userId}/topupCards/{topupCardId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Topup Card
     * Retrieve the details of a Topup Card.
     * <p><b>200</b> - A topup card details search response
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param userId The owning user identifier
     * @param topupCardId The identifier of the topup card to be retrieved
     * @return TopupCards
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TopupCards> getTopupCard(String userId, String topupCardId) throws WebClientResponseException {
        ParameterizedTypeReference<TopupCards> localVarReturnType = new ParameterizedTypeReference<TopupCards>() {};
        return getTopupCardRequestCreation(userId, topupCardId).bodyToMono(localVarReturnType);
    }

    /**
     * Get Topup Card
     * Retrieve the details of a Topup Card.
     * <p><b>200</b> - A topup card details search response
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param userId The owning user identifier
     * @param topupCardId The identifier of the topup card to be retrieved
     * @return ResponseEntity&lt;TopupCards&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TopupCards>> getTopupCardWithHttpInfo(String userId, String topupCardId) throws WebClientResponseException {
        ParameterizedTypeReference<TopupCards> localVarReturnType = new ParameterizedTypeReference<TopupCards>() {};
        return getTopupCardRequestCreation(userId, topupCardId).toEntity(localVarReturnType);
    }

    /**
     * Get Topup Card
     * Retrieve the details of a Topup Card.
     * <p><b>200</b> - A topup card details search response
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param userId The owning user identifier
     * @param topupCardId The identifier of the topup card to be retrieved
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTopupCardWithResponseSpec(String userId, String topupCardId) throws WebClientResponseException {
        return getTopupCardRequestCreation(userId, topupCardId);
    }

    /**
     * Search Topup Cards
     * Get topup cards.
     * <p><b>200</b> - A topup cards details search response
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param userId The owning user identifier
     * @return TopupCards
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTopupCardsRequestCreation(String userId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new WebClientResponseException("Missing the required parameter 'userId' when calling getTopupCards", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("userId", userId);

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

        ParameterizedTypeReference<TopupCards> localVarReturnType = new ParameterizedTypeReference<TopupCards>() {};
        return apiClient.invokeAPI("/v1/topups/cards/users/{userId}/topupCards", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search Topup Cards
     * Get topup cards.
     * <p><b>200</b> - A topup cards details search response
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param userId The owning user identifier
     * @return TopupCards
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TopupCards> getTopupCards(String userId) throws WebClientResponseException {
        ParameterizedTypeReference<TopupCards> localVarReturnType = new ParameterizedTypeReference<TopupCards>() {};
        return getTopupCardsRequestCreation(userId).bodyToMono(localVarReturnType);
    }

    /**
     * Search Topup Cards
     * Get topup cards.
     * <p><b>200</b> - A topup cards details search response
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param userId The owning user identifier
     * @return ResponseEntity&lt;TopupCards&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TopupCards>> getTopupCardsWithHttpInfo(String userId) throws WebClientResponseException {
        ParameterizedTypeReference<TopupCards> localVarReturnType = new ParameterizedTypeReference<TopupCards>() {};
        return getTopupCardsRequestCreation(userId).toEntity(localVarReturnType);
    }

    /**
     * Search Topup Cards
     * Get topup cards.
     * <p><b>200</b> - A topup cards details search response
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param userId The owning user identifier
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTopupCardsWithResponseSpec(String userId) throws WebClientResponseException {
        return getTopupCardsRequestCreation(userId);
    }

    /**
     * Create Authorization
     * Create an authorization to make a card topup payin within 7 days. The card must be [tokenized](/guide/acquiring/card-tokenization.html) first. 
     * <p><b>200</b> - An authorization has been created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param authorizationRequest The authorizationRequest parameter
     * @return Authorization
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postAcqAuthRequestCreation(AuthorizationRequest authorizationRequest) throws WebClientResponseException {
        Object postBody = authorizationRequest;
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

        ParameterizedTypeReference<Authorization> localVarReturnType = new ParameterizedTypeReference<Authorization>() {};
        return apiClient.invokeAPI("/v1/topups/cards/authorizations", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Authorization
     * Create an authorization to make a card topup payin within 7 days. The card must be [tokenized](/guide/acquiring/card-tokenization.html) first. 
     * <p><b>200</b> - An authorization has been created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param authorizationRequest The authorizationRequest parameter
     * @return Authorization
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Authorization> postAcqAuth(AuthorizationRequest authorizationRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Authorization> localVarReturnType = new ParameterizedTypeReference<Authorization>() {};
        return postAcqAuthRequestCreation(authorizationRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Authorization
     * Create an authorization to make a card topup payin within 7 days. The card must be [tokenized](/guide/acquiring/card-tokenization.html) first. 
     * <p><b>200</b> - An authorization has been created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param authorizationRequest The authorizationRequest parameter
     * @return ResponseEntity&lt;Authorization&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Authorization>> postAcqAuthWithHttpInfo(AuthorizationRequest authorizationRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Authorization> localVarReturnType = new ParameterizedTypeReference<Authorization>() {};
        return postAcqAuthRequestCreation(authorizationRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Authorization
     * Create an authorization to make a card topup payin within 7 days. The card must be [tokenized](/guide/acquiring/card-tokenization.html) first. 
     * <p><b>200</b> - An authorization has been created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param authorizationRequest The authorizationRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postAcqAuthWithResponseSpec(AuthorizationRequest authorizationRequest) throws WebClientResponseException {
        return postAcqAuthRequestCreation(authorizationRequest);
    }

    /**
     * Create Payin from Authorization
     * Create a payin from an authorization. The amount must be ≤ to the authorization amount. [Learn more](/guide/acquiring/preauthorized.html#advanced-capture).
     * <p><b>200</b> - Payin returned
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param authorizationUuid Universally unique identifier (UUID) of the authorization
     * @param postAcqAuthPayinRequest The postAcqAuthPayinRequest parameter
     * @return CaptureResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postAcqAuthPayinRequestCreation(UUID authorizationUuid, PostAcqAuthPayinRequest postAcqAuthPayinRequest) throws WebClientResponseException {
        Object postBody = postAcqAuthPayinRequest;
        // verify the required parameter 'authorizationUuid' is set
        if (authorizationUuid == null) {
            throw new WebClientResponseException("Missing the required parameter 'authorizationUuid' when calling postAcqAuthPayin", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("authorizationUuid", authorizationUuid);

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

        ParameterizedTypeReference<CaptureResponse> localVarReturnType = new ParameterizedTypeReference<CaptureResponse>() {};
        return apiClient.invokeAPI("/v1/topups/cards/authorizations/{authorizationUuid}/payins", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Payin from Authorization
     * Create a payin from an authorization. The amount must be ≤ to the authorization amount. [Learn more](/guide/acquiring/preauthorized.html#advanced-capture).
     * <p><b>200</b> - Payin returned
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param authorizationUuid Universally unique identifier (UUID) of the authorization
     * @param postAcqAuthPayinRequest The postAcqAuthPayinRequest parameter
     * @return CaptureResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CaptureResponse> postAcqAuthPayin(UUID authorizationUuid, PostAcqAuthPayinRequest postAcqAuthPayinRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CaptureResponse> localVarReturnType = new ParameterizedTypeReference<CaptureResponse>() {};
        return postAcqAuthPayinRequestCreation(authorizationUuid, postAcqAuthPayinRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Payin from Authorization
     * Create a payin from an authorization. The amount must be ≤ to the authorization amount. [Learn more](/guide/acquiring/preauthorized.html#advanced-capture).
     * <p><b>200</b> - Payin returned
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param authorizationUuid Universally unique identifier (UUID) of the authorization
     * @param postAcqAuthPayinRequest The postAcqAuthPayinRequest parameter
     * @return ResponseEntity&lt;CaptureResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CaptureResponse>> postAcqAuthPayinWithHttpInfo(UUID authorizationUuid, PostAcqAuthPayinRequest postAcqAuthPayinRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CaptureResponse> localVarReturnType = new ParameterizedTypeReference<CaptureResponse>() {};
        return postAcqAuthPayinRequestCreation(authorizationUuid, postAcqAuthPayinRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Payin from Authorization
     * Create a payin from an authorization. The amount must be ≤ to the authorization amount. [Learn more](/guide/acquiring/preauthorized.html#advanced-capture).
     * <p><b>200</b> - Payin returned
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param authorizationUuid Universally unique identifier (UUID) of the authorization
     * @param postAcqAuthPayinRequest The postAcqAuthPayinRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postAcqAuthPayinWithResponseSpec(UUID authorizationUuid, PostAcqAuthPayinRequest postAcqAuthPayinRequest) throws WebClientResponseException {
        return postAcqAuthPayinRequestCreation(authorizationUuid, postAcqAuthPayinRequest);
    }

    /**
     * Create Topup Card
     * Create a new topup card. The card must have been previously tokenized. 
     * <p><b>200</b> - Topup card was created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param userId The owning user identifier
     * @param topupCardRequest The topupCardRequest parameter
     * @return TopupCards
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postTopupCardRequestCreation(String userId, TopupCardRequest topupCardRequest) throws WebClientResponseException {
        Object postBody = topupCardRequest;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new WebClientResponseException("Missing the required parameter 'userId' when calling postTopupCard", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("userId", userId);

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

        ParameterizedTypeReference<TopupCards> localVarReturnType = new ParameterizedTypeReference<TopupCards>() {};
        return apiClient.invokeAPI("/v1/topups/cards/users/{userId}/topupCards", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Topup Card
     * Create a new topup card. The card must have been previously tokenized. 
     * <p><b>200</b> - Topup card was created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param userId The owning user identifier
     * @param topupCardRequest The topupCardRequest parameter
     * @return TopupCards
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TopupCards> postTopupCard(String userId, TopupCardRequest topupCardRequest) throws WebClientResponseException {
        ParameterizedTypeReference<TopupCards> localVarReturnType = new ParameterizedTypeReference<TopupCards>() {};
        return postTopupCardRequestCreation(userId, topupCardRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Topup Card
     * Create a new topup card. The card must have been previously tokenized. 
     * <p><b>200</b> - Topup card was created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param userId The owning user identifier
     * @param topupCardRequest The topupCardRequest parameter
     * @return ResponseEntity&lt;TopupCards&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TopupCards>> postTopupCardWithHttpInfo(String userId, TopupCardRequest topupCardRequest) throws WebClientResponseException {
        ParameterizedTypeReference<TopupCards> localVarReturnType = new ParameterizedTypeReference<TopupCards>() {};
        return postTopupCardRequestCreation(userId, topupCardRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Topup Card
     * Create a new topup card. The card must have been previously tokenized. 
     * <p><b>200</b> - Topup card was created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param userId The owning user identifier
     * @param topupCardRequest The topupCardRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postTopupCardWithResponseSpec(String userId, TopupCardRequest topupCardRequest) throws WebClientResponseException {
        return postTopupCardRequestCreation(userId, topupCardRequest);
    }
}
