package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.GetPayinrefund200Response;
import com.sdk.treezor.model.GetPayinrefunds200Response;
import java.time.OffsetDateTime;

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
public class PayinRefundsApi {
    private ApiClient apiClient;

    public PayinRefundsApi() {
        this(new ApiClient());
    }

    @Autowired
    public PayinRefundsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Get Payin Refund
     * Get a payin refund.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the payin refund.
     * @return GetPayinrefund200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPayinrefundRequestCreation(Long id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getPayinrefund", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

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

        ParameterizedTypeReference<GetPayinrefund200Response> localVarReturnType = new ParameterizedTypeReference<GetPayinrefund200Response>() {};
        return apiClient.invokeAPI("/v1/payinrefunds/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Payin Refund
     * Get a payin refund.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the payin refund.
     * @return GetPayinrefund200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetPayinrefund200Response> getPayinrefund(Long id) throws WebClientResponseException {
        ParameterizedTypeReference<GetPayinrefund200Response> localVarReturnType = new ParameterizedTypeReference<GetPayinrefund200Response>() {};
        return getPayinrefundRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Get Payin Refund
     * Get a payin refund.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the payin refund.
     * @return ResponseEntity&lt;GetPayinrefund200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetPayinrefund200Response>> getPayinrefundWithHttpInfo(Long id) throws WebClientResponseException {
        ParameterizedTypeReference<GetPayinrefund200Response> localVarReturnType = new ParameterizedTypeReference<GetPayinrefund200Response>() {};
        return getPayinrefundRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Get Payin Refund
     * Get a payin refund.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the payin refund.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPayinrefundWithResponseSpec(Long id) throws WebClientResponseException {
        return getPayinrefundRequestCreation(id);
    }

    /**
     * Search Payin Refunds
     * Search for payin refunds. These can relate to [Acquiring](/guide/acquiring/legacy-v1.html#refunds) or [SEPA recalls](/guide/transfers/sepa-recalls.html). 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param payinId The unique identifier of the payin.
     * @param payinrefundId The unique identifier of the payin refund.
     * @param payinrefundTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param payinrefundStatus The status of the payin refund.
     * @param walletId The unique identifier of the Wallet to refund.
     * @param payinrefundDate The date of the payin refund.   Format: &#x60;YYYY-MM-DD&#x60; 
     * @param userId The unique identifier of the User who made the refund.
     * @param amount The amount of the refund.
     * @param currency The currency of the amount. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies). 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page. 
     * @param pageCount The number of items per page, only available on /v1/ endpoints. 
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order in which you want to sort the list based on the payin refund&#39;s date. * **DESC** for descending. * **ASC** for ascending. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @return GetPayinrefunds200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPayinrefundsRequestCreation(String accessTag, Integer payinId, Integer payinrefundId, String payinrefundTag, String payinrefundStatus, Integer walletId, String payinrefundDate, Integer userId, String amount, String currency, Integer pageNumber, String cursor, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "payinId", payinId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "payinrefundId", payinrefundId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "payinrefundTag", payinrefundTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "payinrefundStatus", payinrefundStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "walletId", walletId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "payinrefundDate", payinrefundDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "amount", amount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "currency", currency));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
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

        ParameterizedTypeReference<GetPayinrefunds200Response> localVarReturnType = new ParameterizedTypeReference<GetPayinrefunds200Response>() {};
        return apiClient.invokeAPI("/v1/payinrefunds", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search Payin Refunds
     * Search for payin refunds. These can relate to [Acquiring](/guide/acquiring/legacy-v1.html#refunds) or [SEPA recalls](/guide/transfers/sepa-recalls.html). 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param payinId The unique identifier of the payin.
     * @param payinrefundId The unique identifier of the payin refund.
     * @param payinrefundTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param payinrefundStatus The status of the payin refund.
     * @param walletId The unique identifier of the Wallet to refund.
     * @param payinrefundDate The date of the payin refund.   Format: &#x60;YYYY-MM-DD&#x60; 
     * @param userId The unique identifier of the User who made the refund.
     * @param amount The amount of the refund.
     * @param currency The currency of the amount. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies). 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page. 
     * @param pageCount The number of items per page, only available on /v1/ endpoints. 
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order in which you want to sort the list based on the payin refund&#39;s date. * **DESC** for descending. * **ASC** for ascending. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @return GetPayinrefunds200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetPayinrefunds200Response> getPayinrefunds(String accessTag, Integer payinId, Integer payinrefundId, String payinrefundTag, String payinrefundStatus, Integer walletId, String payinrefundDate, Integer userId, String amount, String currency, Integer pageNumber, String cursor, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        ParameterizedTypeReference<GetPayinrefunds200Response> localVarReturnType = new ParameterizedTypeReference<GetPayinrefunds200Response>() {};
        return getPayinrefundsRequestCreation(accessTag, payinId, payinrefundId, payinrefundTag, payinrefundStatus, walletId, payinrefundDate, userId, amount, currency, pageNumber, cursor, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo).bodyToMono(localVarReturnType);
    }

    /**
     * Search Payin Refunds
     * Search for payin refunds. These can relate to [Acquiring](/guide/acquiring/legacy-v1.html#refunds) or [SEPA recalls](/guide/transfers/sepa-recalls.html). 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param payinId The unique identifier of the payin.
     * @param payinrefundId The unique identifier of the payin refund.
     * @param payinrefundTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param payinrefundStatus The status of the payin refund.
     * @param walletId The unique identifier of the Wallet to refund.
     * @param payinrefundDate The date of the payin refund.   Format: &#x60;YYYY-MM-DD&#x60; 
     * @param userId The unique identifier of the User who made the refund.
     * @param amount The amount of the refund.
     * @param currency The currency of the amount. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies). 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page. 
     * @param pageCount The number of items per page, only available on /v1/ endpoints. 
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order in which you want to sort the list based on the payin refund&#39;s date. * **DESC** for descending. * **ASC** for ascending. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @return ResponseEntity&lt;GetPayinrefunds200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetPayinrefunds200Response>> getPayinrefundsWithHttpInfo(String accessTag, Integer payinId, Integer payinrefundId, String payinrefundTag, String payinrefundStatus, Integer walletId, String payinrefundDate, Integer userId, String amount, String currency, Integer pageNumber, String cursor, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        ParameterizedTypeReference<GetPayinrefunds200Response> localVarReturnType = new ParameterizedTypeReference<GetPayinrefunds200Response>() {};
        return getPayinrefundsRequestCreation(accessTag, payinId, payinrefundId, payinrefundTag, payinrefundStatus, walletId, payinrefundDate, userId, amount, currency, pageNumber, cursor, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo).toEntity(localVarReturnType);
    }

    /**
     * Search Payin Refunds
     * Search for payin refunds. These can relate to [Acquiring](/guide/acquiring/legacy-v1.html#refunds) or [SEPA recalls](/guide/transfers/sepa-recalls.html). 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param payinId The unique identifier of the payin.
     * @param payinrefundId The unique identifier of the payin refund.
     * @param payinrefundTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param payinrefundStatus The status of the payin refund.
     * @param walletId The unique identifier of the Wallet to refund.
     * @param payinrefundDate The date of the payin refund.   Format: &#x60;YYYY-MM-DD&#x60; 
     * @param userId The unique identifier of the User who made the refund.
     * @param amount The amount of the refund.
     * @param currency The currency of the amount. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies). 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page. 
     * @param pageCount The number of items per page, only available on /v1/ endpoints. 
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order in which you want to sort the list based on the payin refund&#39;s date. * **DESC** for descending. * **ASC** for ascending. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPayinrefundsWithResponseSpec(String accessTag, Integer payinId, Integer payinrefundId, String payinrefundTag, String payinrefundStatus, Integer walletId, String payinrefundDate, Integer userId, String amount, String currency, Integer pageNumber, String cursor, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        return getPayinrefundsRequestCreation(accessTag, payinId, payinrefundId, payinrefundTag, payinrefundStatus, walletId, payinrefundDate, userId, amount, currency, pageNumber, cursor, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
    }
}
