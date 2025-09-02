package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.DeletePayout200Response;
import com.sdk.treezor.model.GetPayout200Response;
import com.sdk.treezor.model.GetPayouts200Response;
import com.sdk.treezor.model.GetProofPayout200Response;
import com.sdk.treezor.model.PostPayout200Response;
import com.sdk.treezor.model.PostPayoutRequest;
import com.sdk.treezor.model.SimulateSDDR400Response;
import com.sdk.treezor.model.SimulateSDDRRequest;

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
public class PayoutsApi {
    private ApiClient apiClient;

    public PayoutsApi() {
        this(new ApiClient());
    }

    @Autowired
    public PayoutsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Cancel Payout
     * Change payout status to &#x60;CANCELED&#x60;. A &#x60;VALIDATED&#x60; payout can&#39;t be canceled. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param payoutId The unique identifier of the Payout.
     * @return DeletePayout200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deletePayoutRequestCreation(UUID payoutId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'payoutId' is set
        if (payoutId == null) {
            throw new WebClientResponseException("Missing the required parameter 'payoutId' when calling deletePayout", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("payoutId", payoutId);

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

        ParameterizedTypeReference<DeletePayout200Response> localVarReturnType = new ParameterizedTypeReference<DeletePayout200Response>() {};
        return apiClient.invokeAPI("/v1/payouts/{payoutId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Cancel Payout
     * Change payout status to &#x60;CANCELED&#x60;. A &#x60;VALIDATED&#x60; payout can&#39;t be canceled. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param payoutId The unique identifier of the Payout.
     * @return DeletePayout200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DeletePayout200Response> deletePayout(UUID payoutId) throws WebClientResponseException {
        ParameterizedTypeReference<DeletePayout200Response> localVarReturnType = new ParameterizedTypeReference<DeletePayout200Response>() {};
        return deletePayoutRequestCreation(payoutId).bodyToMono(localVarReturnType);
    }

    /**
     * Cancel Payout
     * Change payout status to &#x60;CANCELED&#x60;. A &#x60;VALIDATED&#x60; payout can&#39;t be canceled. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param payoutId The unique identifier of the Payout.
     * @return ResponseEntity&lt;DeletePayout200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DeletePayout200Response>> deletePayoutWithHttpInfo(UUID payoutId) throws WebClientResponseException {
        ParameterizedTypeReference<DeletePayout200Response> localVarReturnType = new ParameterizedTypeReference<DeletePayout200Response>() {};
        return deletePayoutRequestCreation(payoutId).toEntity(localVarReturnType);
    }

    /**
     * Cancel Payout
     * Change payout status to &#x60;CANCELED&#x60;. A &#x60;VALIDATED&#x60; payout can&#39;t be canceled. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param payoutId The unique identifier of the Payout.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deletePayoutWithResponseSpec(UUID payoutId) throws WebClientResponseException {
        return deletePayoutRequestCreation(payoutId);
    }

    /**
     * Get Payout
     * Retrieve a given Payout.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param payoutId The unique identifier of the Payout.
     * @return GetPayout200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPayoutRequestCreation(UUID payoutId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'payoutId' is set
        if (payoutId == null) {
            throw new WebClientResponseException("Missing the required parameter 'payoutId' when calling getPayout", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("payoutId", payoutId);

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

        ParameterizedTypeReference<GetPayout200Response> localVarReturnType = new ParameterizedTypeReference<GetPayout200Response>() {};
        return apiClient.invokeAPI("/v1/payouts/{payoutId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Payout
     * Retrieve a given Payout.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param payoutId The unique identifier of the Payout.
     * @return GetPayout200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetPayout200Response> getPayout(UUID payoutId) throws WebClientResponseException {
        ParameterizedTypeReference<GetPayout200Response> localVarReturnType = new ParameterizedTypeReference<GetPayout200Response>() {};
        return getPayoutRequestCreation(payoutId).bodyToMono(localVarReturnType);
    }

    /**
     * Get Payout
     * Retrieve a given Payout.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param payoutId The unique identifier of the Payout.
     * @return ResponseEntity&lt;GetPayout200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetPayout200Response>> getPayoutWithHttpInfo(UUID payoutId) throws WebClientResponseException {
        ParameterizedTypeReference<GetPayout200Response> localVarReturnType = new ParameterizedTypeReference<GetPayout200Response>() {};
        return getPayoutRequestCreation(payoutId).toEntity(localVarReturnType);
    }

    /**
     * Get Payout
     * Retrieve a given Payout.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param payoutId The unique identifier of the Payout.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPayoutWithResponseSpec(UUID payoutId) throws WebClientResponseException {
        return getPayoutRequestCreation(payoutId);
    }

    /**
     * Search Payouts
     * Retrieve Payouts that match search criteria. The request must contain at least one of the following inputs: &#x60;userId&#x60;, &#x60;walletId&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param payoutTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param walletId The unique identifier of the payout Wallet.
     * @param userId The unique identifier of the payout User.
     * @param sortOrder The order in which you want to sort the list based on the payout&#39;s date. * **DESC** for descending. * **ASC** for ascending. 
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @return GetPayouts200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPayoutsRequestCreation(String payoutTag, Integer walletId, Integer userId, String sortOrder, String cursor) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "payoutTag", payoutTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "walletId", walletId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortOrder", sortOrder));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<GetPayouts200Response> localVarReturnType = new ParameterizedTypeReference<GetPayouts200Response>() {};
        return apiClient.invokeAPI("/v1/payouts", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search Payouts
     * Retrieve Payouts that match search criteria. The request must contain at least one of the following inputs: &#x60;userId&#x60;, &#x60;walletId&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param payoutTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param walletId The unique identifier of the payout Wallet.
     * @param userId The unique identifier of the payout User.
     * @param sortOrder The order in which you want to sort the list based on the payout&#39;s date. * **DESC** for descending. * **ASC** for ascending. 
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @return GetPayouts200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetPayouts200Response> getPayouts(String payoutTag, Integer walletId, Integer userId, String sortOrder, String cursor) throws WebClientResponseException {
        ParameterizedTypeReference<GetPayouts200Response> localVarReturnType = new ParameterizedTypeReference<GetPayouts200Response>() {};
        return getPayoutsRequestCreation(payoutTag, walletId, userId, sortOrder, cursor).bodyToMono(localVarReturnType);
    }

    /**
     * Search Payouts
     * Retrieve Payouts that match search criteria. The request must contain at least one of the following inputs: &#x60;userId&#x60;, &#x60;walletId&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param payoutTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param walletId The unique identifier of the payout Wallet.
     * @param userId The unique identifier of the payout User.
     * @param sortOrder The order in which you want to sort the list based on the payout&#39;s date. * **DESC** for descending. * **ASC** for ascending. 
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @return ResponseEntity&lt;GetPayouts200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetPayouts200Response>> getPayoutsWithHttpInfo(String payoutTag, Integer walletId, Integer userId, String sortOrder, String cursor) throws WebClientResponseException {
        ParameterizedTypeReference<GetPayouts200Response> localVarReturnType = new ParameterizedTypeReference<GetPayouts200Response>() {};
        return getPayoutsRequestCreation(payoutTag, walletId, userId, sortOrder, cursor).toEntity(localVarReturnType);
    }

    /**
     * Search Payouts
     * Retrieve Payouts that match search criteria. The request must contain at least one of the following inputs: &#x60;userId&#x60;, &#x60;walletId&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param payoutTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param walletId The unique identifier of the payout Wallet.
     * @param userId The unique identifier of the payout User.
     * @param sortOrder The order in which you want to sort the list based on the payout&#39;s date. * **DESC** for descending. * **ASC** for ascending. 
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPayoutsWithResponseSpec(String payoutTag, Integer walletId, Integer userId, String sortOrder, String cursor) throws WebClientResponseException {
        return getPayoutsRequestCreation(payoutTag, walletId, userId, sortOrder, cursor);
    }

    /**
     * Create Payout Proof
     * Generate and download a proof of payout in .PDF format. See [Proof of Payout](/guide/transfers/proof-of-payout.html) for more information. 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param payoutId The unique identifier of the Payout.
     * @return GetProofPayout200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getProofPayoutRequestCreation(String payoutId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'payoutId' is set
        if (payoutId == null) {
            throw new WebClientResponseException("Missing the required parameter 'payoutId' when calling getProofPayout", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("payoutId", payoutId);

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

        ParameterizedTypeReference<GetProofPayout200Response> localVarReturnType = new ParameterizedTypeReference<GetProofPayout200Response>() {};
        return apiClient.invokeAPI("/core-connect/payouts/{payoutId}/proof", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Payout Proof
     * Generate and download a proof of payout in .PDF format. See [Proof of Payout](/guide/transfers/proof-of-payout.html) for more information. 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param payoutId The unique identifier of the Payout.
     * @return GetProofPayout200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetProofPayout200Response> getProofPayout(String payoutId) throws WebClientResponseException {
        ParameterizedTypeReference<GetProofPayout200Response> localVarReturnType = new ParameterizedTypeReference<GetProofPayout200Response>() {};
        return getProofPayoutRequestCreation(payoutId).bodyToMono(localVarReturnType);
    }

    /**
     * Create Payout Proof
     * Generate and download a proof of payout in .PDF format. See [Proof of Payout](/guide/transfers/proof-of-payout.html) for more information. 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param payoutId The unique identifier of the Payout.
     * @return ResponseEntity&lt;GetProofPayout200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetProofPayout200Response>> getProofPayoutWithHttpInfo(String payoutId) throws WebClientResponseException {
        ParameterizedTypeReference<GetProofPayout200Response> localVarReturnType = new ParameterizedTypeReference<GetProofPayout200Response>() {};
        return getProofPayoutRequestCreation(payoutId).toEntity(localVarReturnType);
    }

    /**
     * Create Payout Proof
     * Generate and download a proof of payout in .PDF format. See [Proof of Payout](/guide/transfers/proof-of-payout.html) for more information. 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param payoutId The unique identifier of the Payout.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getProofPayoutWithResponseSpec(String payoutId) throws WebClientResponseException {
        return getProofPayoutRequestCreation(payoutId);
    }

    /**
     * Create Payout
     * Create a new payout.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postPayoutRequest The postPayoutRequest parameter
     * @return PostPayout200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postPayoutRequestCreation(PostPayoutRequest postPayoutRequest) throws WebClientResponseException {
        Object postBody = postPayoutRequest;
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

        ParameterizedTypeReference<PostPayout200Response> localVarReturnType = new ParameterizedTypeReference<PostPayout200Response>() {};
        return apiClient.invokeAPI("/v1/payouts", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Payout
     * Create a new payout.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postPayoutRequest The postPayoutRequest parameter
     * @return PostPayout200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PostPayout200Response> postPayout(PostPayoutRequest postPayoutRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PostPayout200Response> localVarReturnType = new ParameterizedTypeReference<PostPayout200Response>() {};
        return postPayoutRequestCreation(postPayoutRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Payout
     * Create a new payout.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postPayoutRequest The postPayoutRequest parameter
     * @return ResponseEntity&lt;PostPayout200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PostPayout200Response>> postPayoutWithHttpInfo(PostPayoutRequest postPayoutRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PostPayout200Response> localVarReturnType = new ParameterizedTypeReference<PostPayout200Response>() {};
        return postPayoutRequestCreation(postPayoutRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Payout
     * Create a new payout.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postPayoutRequest The postPayoutRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postPayoutWithResponseSpec(PostPayoutRequest postPayoutRequest) throws WebClientResponseException {
        return postPayoutRequestCreation(postPayoutRequest);
    }

    /**
     * Simulate SDDR Core
     * Simulate a received SEPA Direct Debit into one of your Wallet in Sandbox.
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * @param simulateSDDRRequest The simulateSDDRRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec simulateSDDRRequestCreation(SimulateSDDRRequest simulateSDDRRequest) throws WebClientResponseException {
        Object postBody = simulateSDDRRequest;
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
        return apiClient.invokeAPI("/simulation/payout-sddr", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Simulate SDDR Core
     * Simulate a received SEPA Direct Debit into one of your Wallet in Sandbox.
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * @param simulateSDDRRequest The simulateSDDRRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> simulateSDDR(SimulateSDDRRequest simulateSDDRRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return simulateSDDRRequestCreation(simulateSDDRRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Simulate SDDR Core
     * Simulate a received SEPA Direct Debit into one of your Wallet in Sandbox.
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * @param simulateSDDRRequest The simulateSDDRRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> simulateSDDRWithHttpInfo(SimulateSDDRRequest simulateSDDRRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return simulateSDDRRequestCreation(simulateSDDRRequest).toEntity(localVarReturnType);
    }

    /**
     * Simulate SDDR Core
     * Simulate a received SEPA Direct Debit into one of your Wallet in Sandbox.
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * @param simulateSDDRRequest The simulateSDDRRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec simulateSDDRWithResponseSpec(SimulateSDDRRequest simulateSDDRRequest) throws WebClientResponseException {
        return simulateSDDRRequestCreation(simulateSDDRRequest);
    }
}
