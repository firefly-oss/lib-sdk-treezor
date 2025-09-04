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

import java.math.BigDecimal;
import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.GetScheduledPaymentOperations200Response;
import com.sdk.treezor.model.PostScheduledPaymentRequest;
import com.sdk.treezor.model.ScheduledPayment;
import com.sdk.treezor.model.ScheduledPayment1;
import com.sdk.treezor.model.ScheduledPayment2;

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
public class ScheduledPaymentsApi {
    private ApiClient apiClient;

    public ScheduledPaymentsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ScheduledPaymentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Delete Scheduled Payment
     * Cancel a Scheduled Payment order
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param scheduledPaymentId The unique identifier of the Scheduled Payment order.
     * @return ScheduledPayment2
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteScheduledPaymentRequestCreation(String scheduledPaymentId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'scheduledPaymentId' is set
        if (scheduledPaymentId == null) {
            throw new WebClientResponseException("Missing the required parameter 'scheduledPaymentId' when calling deleteScheduledPayment", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("scheduledPaymentId", scheduledPaymentId);

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

        ParameterizedTypeReference<ScheduledPayment2> localVarReturnType = new ParameterizedTypeReference<ScheduledPayment2>() {};
        return apiClient.invokeAPI("/core-connect/scheduledPayment/{scheduledPaymentId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete Scheduled Payment
     * Cancel a Scheduled Payment order
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param scheduledPaymentId The unique identifier of the Scheduled Payment order.
     * @return ScheduledPayment2
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ScheduledPayment2> deleteScheduledPayment(String scheduledPaymentId) throws WebClientResponseException {
        ParameterizedTypeReference<ScheduledPayment2> localVarReturnType = new ParameterizedTypeReference<ScheduledPayment2>() {};
        return deleteScheduledPaymentRequestCreation(scheduledPaymentId).bodyToMono(localVarReturnType);
    }

    /**
     * Delete Scheduled Payment
     * Cancel a Scheduled Payment order
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param scheduledPaymentId The unique identifier of the Scheduled Payment order.
     * @return ResponseEntity&lt;ScheduledPayment2&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ScheduledPayment2>> deleteScheduledPaymentWithHttpInfo(String scheduledPaymentId) throws WebClientResponseException {
        ParameterizedTypeReference<ScheduledPayment2> localVarReturnType = new ParameterizedTypeReference<ScheduledPayment2>() {};
        return deleteScheduledPaymentRequestCreation(scheduledPaymentId).toEntity(localVarReturnType);
    }

    /**
     * Delete Scheduled Payment
     * Cancel a Scheduled Payment order
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param scheduledPaymentId The unique identifier of the Scheduled Payment order.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteScheduledPaymentWithResponseSpec(String scheduledPaymentId) throws WebClientResponseException {
        return deleteScheduledPaymentRequestCreation(scheduledPaymentId);
    }

    /**
     * Get Scheduled Payment
     * Retrieve Scheduled Payment orders based on the corresponding &#x60;userId&#x60; and/or &#x60;walletId&#x60;
     * <p><b>200</b> - OK – Scheduled payment created
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the Wallet to be debited.
     * @param walletId The unique identifier of the User owning the Wallet to debit.
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @param pageSize Number of results per page.
     * @return ScheduledPayment
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getScheduledPaymentRequestCreation(Integer userId, Integer walletId, String cursor, BigDecimal pageSize) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "walletId", walletId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<ScheduledPayment> localVarReturnType = new ParameterizedTypeReference<ScheduledPayment>() {};
        return apiClient.invokeAPI("/core-connect/scheduledPayment", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Scheduled Payment
     * Retrieve Scheduled Payment orders based on the corresponding &#x60;userId&#x60; and/or &#x60;walletId&#x60;
     * <p><b>200</b> - OK – Scheduled payment created
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the Wallet to be debited.
     * @param walletId The unique identifier of the User owning the Wallet to debit.
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @param pageSize Number of results per page.
     * @return ScheduledPayment
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ScheduledPayment> getScheduledPayment(Integer userId, Integer walletId, String cursor, BigDecimal pageSize) throws WebClientResponseException {
        ParameterizedTypeReference<ScheduledPayment> localVarReturnType = new ParameterizedTypeReference<ScheduledPayment>() {};
        return getScheduledPaymentRequestCreation(userId, walletId, cursor, pageSize).bodyToMono(localVarReturnType);
    }

    /**
     * Get Scheduled Payment
     * Retrieve Scheduled Payment orders based on the corresponding &#x60;userId&#x60; and/or &#x60;walletId&#x60;
     * <p><b>200</b> - OK – Scheduled payment created
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the Wallet to be debited.
     * @param walletId The unique identifier of the User owning the Wallet to debit.
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @param pageSize Number of results per page.
     * @return ResponseEntity&lt;ScheduledPayment&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ScheduledPayment>> getScheduledPaymentWithHttpInfo(Integer userId, Integer walletId, String cursor, BigDecimal pageSize) throws WebClientResponseException {
        ParameterizedTypeReference<ScheduledPayment> localVarReturnType = new ParameterizedTypeReference<ScheduledPayment>() {};
        return getScheduledPaymentRequestCreation(userId, walletId, cursor, pageSize).toEntity(localVarReturnType);
    }

    /**
     * Get Scheduled Payment
     * Retrieve Scheduled Payment orders based on the corresponding &#x60;userId&#x60; and/or &#x60;walletId&#x60;
     * <p><b>200</b> - OK – Scheduled payment created
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the Wallet to be debited.
     * @param walletId The unique identifier of the User owning the Wallet to debit.
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @param pageSize Number of results per page.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getScheduledPaymentWithResponseSpec(Integer userId, Integer walletId, String cursor, BigDecimal pageSize) throws WebClientResponseException {
        return getScheduledPaymentRequestCreation(userId, walletId, cursor, pageSize);
    }

    /**
     * Get Scheduled Payment Operations
     * Retrieve the list of executed payments for a given Scheduled Payment order
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param scheduledPaymentId The unique identifier of the Scheduled Payment order.
     * @return GetScheduledPaymentOperations200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getScheduledPaymentOperationsRequestCreation(String scheduledPaymentId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'scheduledPaymentId' is set
        if (scheduledPaymentId == null) {
            throw new WebClientResponseException("Missing the required parameter 'scheduledPaymentId' when calling getScheduledPaymentOperations", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("scheduledPaymentId", scheduledPaymentId);

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

        ParameterizedTypeReference<GetScheduledPaymentOperations200Response> localVarReturnType = new ParameterizedTypeReference<GetScheduledPaymentOperations200Response>() {};
        return apiClient.invokeAPI("/core-connect/scheduledPayment/{scheduledPaymentId}/payments", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Scheduled Payment Operations
     * Retrieve the list of executed payments for a given Scheduled Payment order
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param scheduledPaymentId The unique identifier of the Scheduled Payment order.
     * @return GetScheduledPaymentOperations200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetScheduledPaymentOperations200Response> getScheduledPaymentOperations(String scheduledPaymentId) throws WebClientResponseException {
        ParameterizedTypeReference<GetScheduledPaymentOperations200Response> localVarReturnType = new ParameterizedTypeReference<GetScheduledPaymentOperations200Response>() {};
        return getScheduledPaymentOperationsRequestCreation(scheduledPaymentId).bodyToMono(localVarReturnType);
    }

    /**
     * Get Scheduled Payment Operations
     * Retrieve the list of executed payments for a given Scheduled Payment order
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param scheduledPaymentId The unique identifier of the Scheduled Payment order.
     * @return ResponseEntity&lt;GetScheduledPaymentOperations200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetScheduledPaymentOperations200Response>> getScheduledPaymentOperationsWithHttpInfo(String scheduledPaymentId) throws WebClientResponseException {
        ParameterizedTypeReference<GetScheduledPaymentOperations200Response> localVarReturnType = new ParameterizedTypeReference<GetScheduledPaymentOperations200Response>() {};
        return getScheduledPaymentOperationsRequestCreation(scheduledPaymentId).toEntity(localVarReturnType);
    }

    /**
     * Get Scheduled Payment Operations
     * Retrieve the list of executed payments for a given Scheduled Payment order
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param scheduledPaymentId The unique identifier of the Scheduled Payment order.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getScheduledPaymentOperationsWithResponseSpec(String scheduledPaymentId) throws WebClientResponseException {
        return getScheduledPaymentOperationsRequestCreation(scheduledPaymentId);
    }

    /**
     * Create Scheduled Payment
     * Schedule a Payout or a Wallet-to-Wallet transfer for a future date.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK – Scheduled payment created
     * <p><b>0</b> - Unexpected error
     * @param postScheduledPaymentRequest The postScheduledPaymentRequest parameter
     * @return ScheduledPayment1
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postScheduledPaymentRequestCreation(PostScheduledPaymentRequest postScheduledPaymentRequest) throws WebClientResponseException {
        Object postBody = postScheduledPaymentRequest;
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

        ParameterizedTypeReference<ScheduledPayment1> localVarReturnType = new ParameterizedTypeReference<ScheduledPayment1>() {};
        return apiClient.invokeAPI("/core-connect/scheduledPayment", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Scheduled Payment
     * Schedule a Payout or a Wallet-to-Wallet transfer for a future date.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK – Scheduled payment created
     * <p><b>0</b> - Unexpected error
     * @param postScheduledPaymentRequest The postScheduledPaymentRequest parameter
     * @return ScheduledPayment1
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ScheduledPayment1> postScheduledPayment(PostScheduledPaymentRequest postScheduledPaymentRequest) throws WebClientResponseException {
        ParameterizedTypeReference<ScheduledPayment1> localVarReturnType = new ParameterizedTypeReference<ScheduledPayment1>() {};
        return postScheduledPaymentRequestCreation(postScheduledPaymentRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Scheduled Payment
     * Schedule a Payout or a Wallet-to-Wallet transfer for a future date.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK – Scheduled payment created
     * <p><b>0</b> - Unexpected error
     * @param postScheduledPaymentRequest The postScheduledPaymentRequest parameter
     * @return ResponseEntity&lt;ScheduledPayment1&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ScheduledPayment1>> postScheduledPaymentWithHttpInfo(PostScheduledPaymentRequest postScheduledPaymentRequest) throws WebClientResponseException {
        ParameterizedTypeReference<ScheduledPayment1> localVarReturnType = new ParameterizedTypeReference<ScheduledPayment1>() {};
        return postScheduledPaymentRequestCreation(postScheduledPaymentRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Scheduled Payment
     * Schedule a Payout or a Wallet-to-Wallet transfer for a future date.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK – Scheduled payment created
     * <p><b>0</b> - Unexpected error
     * @param postScheduledPaymentRequest The postScheduledPaymentRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postScheduledPaymentWithResponseSpec(PostScheduledPaymentRequest postScheduledPaymentRequest) throws WebClientResponseException {
        return postScheduledPaymentRequestCreation(postScheduledPaymentRequest);
    }
}
