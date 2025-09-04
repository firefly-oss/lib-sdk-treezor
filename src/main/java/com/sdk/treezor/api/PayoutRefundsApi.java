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
import com.sdk.treezor.model.GetPayoutRefund200Response;
import com.sdk.treezor.model.PostPayoutRefund200Response;
import com.sdk.treezor.model.PostPayoutRefundRequest;

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
public class PayoutRefundsApi {
    private ApiClient apiClient;

    public PayoutRefundsApi() {
        this(new ApiClient());
    }

    @Autowired
    public PayoutRefundsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Get Payout Refund
     * Retrieve a given Payout Refund with its &#x60;id&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param payoutRefundId The unique identifier of the payout refund.
     * @return GetPayoutRefund200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPayoutRefundRequestCreation(String payoutRefundId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'payoutRefundId' is set
        if (payoutRefundId == null) {
            throw new WebClientResponseException("Missing the required parameter 'payoutRefundId' when calling getPayoutRefund", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("payoutRefundId", payoutRefundId);

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

        ParameterizedTypeReference<GetPayoutRefund200Response> localVarReturnType = new ParameterizedTypeReference<GetPayoutRefund200Response>() {};
        return apiClient.invokeAPI("/v1/payoutRefunds/{payoutRefundId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Payout Refund
     * Retrieve a given Payout Refund with its &#x60;id&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param payoutRefundId The unique identifier of the payout refund.
     * @return GetPayoutRefund200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetPayoutRefund200Response> getPayoutRefund(String payoutRefundId) throws WebClientResponseException {
        ParameterizedTypeReference<GetPayoutRefund200Response> localVarReturnType = new ParameterizedTypeReference<GetPayoutRefund200Response>() {};
        return getPayoutRefundRequestCreation(payoutRefundId).bodyToMono(localVarReturnType);
    }

    /**
     * Get Payout Refund
     * Retrieve a given Payout Refund with its &#x60;id&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param payoutRefundId The unique identifier of the payout refund.
     * @return ResponseEntity&lt;GetPayoutRefund200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetPayoutRefund200Response>> getPayoutRefundWithHttpInfo(String payoutRefundId) throws WebClientResponseException {
        ParameterizedTypeReference<GetPayoutRefund200Response> localVarReturnType = new ParameterizedTypeReference<GetPayoutRefund200Response>() {};
        return getPayoutRefundRequestCreation(payoutRefundId).toEntity(localVarReturnType);
    }

    /**
     * Get Payout Refund
     * Retrieve a given Payout Refund with its &#x60;id&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param payoutRefundId The unique identifier of the payout refund.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPayoutRefundWithResponseSpec(String payoutRefundId) throws WebClientResponseException {
        return getPayoutRefundRequestCreation(payoutRefundId);
    }

    /**
     * Create Payout Refund
     * Create a Payout Refund.  As of today, this feature is only available for [emitting SCTE Inst Recalls](/guide/transfers/sepa-recalls.html#emitting-scte-inst-recalls).  For SCTE Recalls and SDDR Refunds, you need to [open a ticket](https://treezor.zendesk.com/hc/en-us/articles/4403978479634-How-to-create-a-Zendesk-ticket) to request Payout Refund. 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param postPayoutRefundRequest The postPayoutRefundRequest parameter
     * @return PostPayoutRefund200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postPayoutRefundRequestCreation(PostPayoutRefundRequest postPayoutRefundRequest) throws WebClientResponseException {
        Object postBody = postPayoutRefundRequest;
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

        ParameterizedTypeReference<PostPayoutRefund200Response> localVarReturnType = new ParameterizedTypeReference<PostPayoutRefund200Response>() {};
        return apiClient.invokeAPI("/v1/payoutRefunds", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Payout Refund
     * Create a Payout Refund.  As of today, this feature is only available for [emitting SCTE Inst Recalls](/guide/transfers/sepa-recalls.html#emitting-scte-inst-recalls).  For SCTE Recalls and SDDR Refunds, you need to [open a ticket](https://treezor.zendesk.com/hc/en-us/articles/4403978479634-How-to-create-a-Zendesk-ticket) to request Payout Refund. 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param postPayoutRefundRequest The postPayoutRefundRequest parameter
     * @return PostPayoutRefund200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PostPayoutRefund200Response> postPayoutRefund(PostPayoutRefundRequest postPayoutRefundRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PostPayoutRefund200Response> localVarReturnType = new ParameterizedTypeReference<PostPayoutRefund200Response>() {};
        return postPayoutRefundRequestCreation(postPayoutRefundRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Payout Refund
     * Create a Payout Refund.  As of today, this feature is only available for [emitting SCTE Inst Recalls](/guide/transfers/sepa-recalls.html#emitting-scte-inst-recalls).  For SCTE Recalls and SDDR Refunds, you need to [open a ticket](https://treezor.zendesk.com/hc/en-us/articles/4403978479634-How-to-create-a-Zendesk-ticket) to request Payout Refund. 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param postPayoutRefundRequest The postPayoutRefundRequest parameter
     * @return ResponseEntity&lt;PostPayoutRefund200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PostPayoutRefund200Response>> postPayoutRefundWithHttpInfo(PostPayoutRefundRequest postPayoutRefundRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PostPayoutRefund200Response> localVarReturnType = new ParameterizedTypeReference<PostPayoutRefund200Response>() {};
        return postPayoutRefundRequestCreation(postPayoutRefundRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Payout Refund
     * Create a Payout Refund.  As of today, this feature is only available for [emitting SCTE Inst Recalls](/guide/transfers/sepa-recalls.html#emitting-scte-inst-recalls).  For SCTE Recalls and SDDR Refunds, you need to [open a ticket](https://treezor.zendesk.com/hc/en-us/articles/4403978479634-How-to-create-a-Zendesk-ticket) to request Payout Refund. 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param postPayoutRefundRequest The postPayoutRefundRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postPayoutRefundWithResponseSpec(PostPayoutRefundRequest postPayoutRefundRequest) throws WebClientResponseException {
        return postPayoutRefundRequestCreation(postPayoutRefundRequest);
    }
}
