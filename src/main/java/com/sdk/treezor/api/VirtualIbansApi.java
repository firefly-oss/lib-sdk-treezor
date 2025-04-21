package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import com.sdk.treezor.model.PostVirtualIbanRequest;
import com.sdk.treezor.model.PutVirtualIbanRequest;
import com.sdk.treezor.model.VirtualIbanObject;

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
public class VirtualIbansApi {
    private ApiClient apiClient;

    public VirtualIbansApi() {
        this(new ApiClient());
    }

    @Autowired
    public VirtualIbansApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Get Virtual IBAN
     * Retrieve a Virtual IBAN based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param virtualIbanId The unique identifier of the Virtual IBAN.
     * @return VirtualIbanObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getvirtualibanRequestCreation(Integer virtualIbanId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'virtualIbanId' is set
        if (virtualIbanId == null) {
            throw new WebClientResponseException("Missing the required parameter 'virtualIbanId' when calling getvirtualiban", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("virtualIbanId", virtualIbanId);

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

        ParameterizedTypeReference<VirtualIbanObject> localVarReturnType = new ParameterizedTypeReference<VirtualIbanObject>() {};
        return apiClient.invokeAPI("/v1/virtualibans/{virtualIbanId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Virtual IBAN
     * Retrieve a Virtual IBAN based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param virtualIbanId The unique identifier of the Virtual IBAN.
     * @return VirtualIbanObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<VirtualIbanObject> getvirtualiban(Integer virtualIbanId) throws WebClientResponseException {
        ParameterizedTypeReference<VirtualIbanObject> localVarReturnType = new ParameterizedTypeReference<VirtualIbanObject>() {};
        return getvirtualibanRequestCreation(virtualIbanId).bodyToMono(localVarReturnType);
    }

    /**
     * Get Virtual IBAN
     * Retrieve a Virtual IBAN based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param virtualIbanId The unique identifier of the Virtual IBAN.
     * @return ResponseEntity&lt;VirtualIbanObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<VirtualIbanObject>> getvirtualibanWithHttpInfo(Integer virtualIbanId) throws WebClientResponseException {
        ParameterizedTypeReference<VirtualIbanObject> localVarReturnType = new ParameterizedTypeReference<VirtualIbanObject>() {};
        return getvirtualibanRequestCreation(virtualIbanId).toEntity(localVarReturnType);
    }

    /**
     * Get Virtual IBAN
     * Retrieve a Virtual IBAN based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param virtualIbanId The unique identifier of the Virtual IBAN.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getvirtualibanWithResponseSpec(Integer virtualIbanId) throws WebClientResponseException {
        return getvirtualibanRequestCreation(virtualIbanId);
    }

    /**
     * Search Virtual IBANs
     * Retrieve virtual IBANs that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param virtualIbanId The unique identifier of the Virtual IBAN.
     * @param walletId The unique identifier of the Wallet to which the Virtual IBAN is associated.
     * @param typeId The type of the Virtual IBAN.
     * @param tag Custom attribute that you can use as you see fit.  Learn more in the [Object tags](/guide/api-basics/objects-tags.html) article. 
     * @param reference The client&#39;s internal reference of the Virtual IBAN.
     * @param validFrom The date from which the Virtual IBAN validity starts. Defaults to today&#39;s date and must be set in the future.  Format: &#x60;YYYY-MM-DD&#x60; 
     * @param validTo The date from which the Virtual IBAN validity ends. Must be set after the &#x60;validFrom&#x60; date.  Format: &#x60;YYYY-MM-DD&#x60; 
     * @param maxUsage The maximum number of transactions allowed.
     * @param maxAmount The maximum cumulated amount allowed.
     * @param numberOfTransactions The current number of transactions for the Virtual IBAN.
     * @param cumulatedAmount The cumulated amount of transactions for the Virtual IBAN.
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @return VirtualIbanObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getvirtualibansRequestCreation(String accessTag, Integer virtualIbanId, Integer walletId, Integer typeId, Integer tag, String reference, LocalDate validFrom, LocalDate validTo, Integer maxUsage, Float maxAmount, Integer numberOfTransactions, Float cumulatedAmount, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "virtualIbanId", virtualIbanId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "walletId", walletId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "typeId", typeId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tag", tag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "reference", reference));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "validFrom", validFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "validTo", validTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxUsage", maxUsage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxAmount", maxAmount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "numberOfTransactions", numberOfTransactions));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cumulatedAmount", cumulatedAmount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdDateFrom", createdDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdDateTo", createdDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "updatedDateFrom", updatedDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "updatedDateTo", updatedDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageCount", pageCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortBy", sortBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortOrder", sortOrder));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<VirtualIbanObject> localVarReturnType = new ParameterizedTypeReference<VirtualIbanObject>() {};
        return apiClient.invokeAPI("/v1/virtualibans", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search Virtual IBANs
     * Retrieve virtual IBANs that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param virtualIbanId The unique identifier of the Virtual IBAN.
     * @param walletId The unique identifier of the Wallet to which the Virtual IBAN is associated.
     * @param typeId The type of the Virtual IBAN.
     * @param tag Custom attribute that you can use as you see fit.  Learn more in the [Object tags](/guide/api-basics/objects-tags.html) article. 
     * @param reference The client&#39;s internal reference of the Virtual IBAN.
     * @param validFrom The date from which the Virtual IBAN validity starts. Defaults to today&#39;s date and must be set in the future.  Format: &#x60;YYYY-MM-DD&#x60; 
     * @param validTo The date from which the Virtual IBAN validity ends. Must be set after the &#x60;validFrom&#x60; date.  Format: &#x60;YYYY-MM-DD&#x60; 
     * @param maxUsage The maximum number of transactions allowed.
     * @param maxAmount The maximum cumulated amount allowed.
     * @param numberOfTransactions The current number of transactions for the Virtual IBAN.
     * @param cumulatedAmount The cumulated amount of transactions for the Virtual IBAN.
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @return VirtualIbanObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<VirtualIbanObject> getvirtualibans(String accessTag, Integer virtualIbanId, Integer walletId, Integer typeId, Integer tag, String reference, LocalDate validFrom, LocalDate validTo, Integer maxUsage, Float maxAmount, Integer numberOfTransactions, Float cumulatedAmount, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
        ParameterizedTypeReference<VirtualIbanObject> localVarReturnType = new ParameterizedTypeReference<VirtualIbanObject>() {};
        return getvirtualibansRequestCreation(accessTag, virtualIbanId, walletId, typeId, tag, reference, validFrom, validTo, maxUsage, maxAmount, numberOfTransactions, cumulatedAmount, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, pageNumber, pageCount, sortBy, sortOrder).bodyToMono(localVarReturnType);
    }

    /**
     * Search Virtual IBANs
     * Retrieve virtual IBANs that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param virtualIbanId The unique identifier of the Virtual IBAN.
     * @param walletId The unique identifier of the Wallet to which the Virtual IBAN is associated.
     * @param typeId The type of the Virtual IBAN.
     * @param tag Custom attribute that you can use as you see fit.  Learn more in the [Object tags](/guide/api-basics/objects-tags.html) article. 
     * @param reference The client&#39;s internal reference of the Virtual IBAN.
     * @param validFrom The date from which the Virtual IBAN validity starts. Defaults to today&#39;s date and must be set in the future.  Format: &#x60;YYYY-MM-DD&#x60; 
     * @param validTo The date from which the Virtual IBAN validity ends. Must be set after the &#x60;validFrom&#x60; date.  Format: &#x60;YYYY-MM-DD&#x60; 
     * @param maxUsage The maximum number of transactions allowed.
     * @param maxAmount The maximum cumulated amount allowed.
     * @param numberOfTransactions The current number of transactions for the Virtual IBAN.
     * @param cumulatedAmount The cumulated amount of transactions for the Virtual IBAN.
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @return ResponseEntity&lt;VirtualIbanObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<VirtualIbanObject>> getvirtualibansWithHttpInfo(String accessTag, Integer virtualIbanId, Integer walletId, Integer typeId, Integer tag, String reference, LocalDate validFrom, LocalDate validTo, Integer maxUsage, Float maxAmount, Integer numberOfTransactions, Float cumulatedAmount, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
        ParameterizedTypeReference<VirtualIbanObject> localVarReturnType = new ParameterizedTypeReference<VirtualIbanObject>() {};
        return getvirtualibansRequestCreation(accessTag, virtualIbanId, walletId, typeId, tag, reference, validFrom, validTo, maxUsage, maxAmount, numberOfTransactions, cumulatedAmount, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, pageNumber, pageCount, sortBy, sortOrder).toEntity(localVarReturnType);
    }

    /**
     * Search Virtual IBANs
     * Retrieve virtual IBANs that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param virtualIbanId The unique identifier of the Virtual IBAN.
     * @param walletId The unique identifier of the Wallet to which the Virtual IBAN is associated.
     * @param typeId The type of the Virtual IBAN.
     * @param tag Custom attribute that you can use as you see fit.  Learn more in the [Object tags](/guide/api-basics/objects-tags.html) article. 
     * @param reference The client&#39;s internal reference of the Virtual IBAN.
     * @param validFrom The date from which the Virtual IBAN validity starts. Defaults to today&#39;s date and must be set in the future.  Format: &#x60;YYYY-MM-DD&#x60; 
     * @param validTo The date from which the Virtual IBAN validity ends. Must be set after the &#x60;validFrom&#x60; date.  Format: &#x60;YYYY-MM-DD&#x60; 
     * @param maxUsage The maximum number of transactions allowed.
     * @param maxAmount The maximum cumulated amount allowed.
     * @param numberOfTransactions The current number of transactions for the Virtual IBAN.
     * @param cumulatedAmount The cumulated amount of transactions for the Virtual IBAN.
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getvirtualibansWithResponseSpec(String accessTag, Integer virtualIbanId, Integer walletId, Integer typeId, Integer tag, String reference, LocalDate validFrom, LocalDate validTo, Integer maxUsage, Float maxAmount, Integer numberOfTransactions, Float cumulatedAmount, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
        return getvirtualibansRequestCreation(accessTag, virtualIbanId, walletId, typeId, tag, reference, validFrom, validTo, maxUsage, maxAmount, numberOfTransactions, cumulatedAmount, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, pageNumber, pageCount, sortBy, sortOrder);
    }

    /**
     * Create Virtual IBAN
     * Create a new virtual IBAN associated with a given Wallet.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postVirtualIbanRequest The postVirtualIbanRequest parameter
     * @return VirtualIbanObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postVirtualIbanRequestCreation(PostVirtualIbanRequest postVirtualIbanRequest) throws WebClientResponseException {
        Object postBody = postVirtualIbanRequest;
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

        ParameterizedTypeReference<VirtualIbanObject> localVarReturnType = new ParameterizedTypeReference<VirtualIbanObject>() {};
        return apiClient.invokeAPI("/v1/virtualibans", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Virtual IBAN
     * Create a new virtual IBAN associated with a given Wallet.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postVirtualIbanRequest The postVirtualIbanRequest parameter
     * @return VirtualIbanObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<VirtualIbanObject> postVirtualIban(PostVirtualIbanRequest postVirtualIbanRequest) throws WebClientResponseException {
        ParameterizedTypeReference<VirtualIbanObject> localVarReturnType = new ParameterizedTypeReference<VirtualIbanObject>() {};
        return postVirtualIbanRequestCreation(postVirtualIbanRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Virtual IBAN
     * Create a new virtual IBAN associated with a given Wallet.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postVirtualIbanRequest The postVirtualIbanRequest parameter
     * @return ResponseEntity&lt;VirtualIbanObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<VirtualIbanObject>> postVirtualIbanWithHttpInfo(PostVirtualIbanRequest postVirtualIbanRequest) throws WebClientResponseException {
        ParameterizedTypeReference<VirtualIbanObject> localVarReturnType = new ParameterizedTypeReference<VirtualIbanObject>() {};
        return postVirtualIbanRequestCreation(postVirtualIbanRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Virtual IBAN
     * Create a new virtual IBAN associated with a given Wallet.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postVirtualIbanRequest The postVirtualIbanRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postVirtualIbanWithResponseSpec(PostVirtualIbanRequest postVirtualIbanRequest) throws WebClientResponseException {
        return postVirtualIbanRequestCreation(postVirtualIbanRequest);
    }

    /**
     * Update Virtual IBAN
     * Update a Virtual IBAN&#39;s information.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param virtualIbanId The unique identifier of the Virtual IBAN.
     * @param putVirtualIbanRequest The putVirtualIbanRequest parameter
     * @return VirtualIbanObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putVirtualIbanRequestCreation(Integer virtualIbanId, PutVirtualIbanRequest putVirtualIbanRequest) throws WebClientResponseException {
        Object postBody = putVirtualIbanRequest;
        // verify the required parameter 'virtualIbanId' is set
        if (virtualIbanId == null) {
            throw new WebClientResponseException("Missing the required parameter 'virtualIbanId' when calling putVirtualIban", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("virtualIbanId", virtualIbanId);

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

        ParameterizedTypeReference<VirtualIbanObject> localVarReturnType = new ParameterizedTypeReference<VirtualIbanObject>() {};
        return apiClient.invokeAPI("/v1/virtualibans/{virtualIbanId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update Virtual IBAN
     * Update a Virtual IBAN&#39;s information.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param virtualIbanId The unique identifier of the Virtual IBAN.
     * @param putVirtualIbanRequest The putVirtualIbanRequest parameter
     * @return VirtualIbanObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<VirtualIbanObject> putVirtualIban(Integer virtualIbanId, PutVirtualIbanRequest putVirtualIbanRequest) throws WebClientResponseException {
        ParameterizedTypeReference<VirtualIbanObject> localVarReturnType = new ParameterizedTypeReference<VirtualIbanObject>() {};
        return putVirtualIbanRequestCreation(virtualIbanId, putVirtualIbanRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update Virtual IBAN
     * Update a Virtual IBAN&#39;s information.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param virtualIbanId The unique identifier of the Virtual IBAN.
     * @param putVirtualIbanRequest The putVirtualIbanRequest parameter
     * @return ResponseEntity&lt;VirtualIbanObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<VirtualIbanObject>> putVirtualIbanWithHttpInfo(Integer virtualIbanId, PutVirtualIbanRequest putVirtualIbanRequest) throws WebClientResponseException {
        ParameterizedTypeReference<VirtualIbanObject> localVarReturnType = new ParameterizedTypeReference<VirtualIbanObject>() {};
        return putVirtualIbanRequestCreation(virtualIbanId, putVirtualIbanRequest).toEntity(localVarReturnType);
    }

    /**
     * Update Virtual IBAN
     * Update a Virtual IBAN&#39;s information.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param virtualIbanId The unique identifier of the Virtual IBAN.
     * @param putVirtualIbanRequest The putVirtualIbanRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putVirtualIbanWithResponseSpec(Integer virtualIbanId, PutVirtualIbanRequest putVirtualIbanRequest) throws WebClientResponseException {
        return putVirtualIbanRequestCreation(virtualIbanId, putVirtualIbanRequest);
    }
}
