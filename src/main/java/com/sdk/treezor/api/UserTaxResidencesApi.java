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
import com.sdk.treezor.model.GetTaxresidencesDefaultResponse;
import com.sdk.treezor.model.PostTaxresidenceRequest;
import com.sdk.treezor.model.PutTaxresidenceRequest;
import com.sdk.treezor.model.TaxResidenceObject;

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
public class UserTaxResidencesApi {
    private ApiClient apiClient;

    public UserTaxResidencesApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserTaxResidencesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Delete a residence
     * Delete a residence that match id
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param taxResidenceId The unique identifier of the Tax Residence
     * @return TaxResidenceObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteTaxresidenceRequestCreation(Integer taxResidenceId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'taxResidenceId' is set
        if (taxResidenceId == null) {
            throw new WebClientResponseException("Missing the required parameter 'taxResidenceId' when calling deleteTaxresidence", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("taxResidenceId", taxResidenceId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<TaxResidenceObject> localVarReturnType = new ParameterizedTypeReference<TaxResidenceObject>() {};
        return apiClient.invokeAPI("/v1/taxResidences/{taxResidenceId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a residence
     * Delete a residence that match id
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param taxResidenceId The unique identifier of the Tax Residence
     * @return TaxResidenceObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TaxResidenceObject> deleteTaxresidence(Integer taxResidenceId) throws WebClientResponseException {
        ParameterizedTypeReference<TaxResidenceObject> localVarReturnType = new ParameterizedTypeReference<TaxResidenceObject>() {};
        return deleteTaxresidenceRequestCreation(taxResidenceId).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a residence
     * Delete a residence that match id
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param taxResidenceId The unique identifier of the Tax Residence
     * @return ResponseEntity&lt;TaxResidenceObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TaxResidenceObject>> deleteTaxresidenceWithHttpInfo(Integer taxResidenceId) throws WebClientResponseException {
        ParameterizedTypeReference<TaxResidenceObject> localVarReturnType = new ParameterizedTypeReference<TaxResidenceObject>() {};
        return deleteTaxresidenceRequestCreation(taxResidenceId).toEntity(localVarReturnType);
    }

    /**
     * Delete a residence
     * Delete a residence that match id
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param taxResidenceId The unique identifier of the Tax Residence
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteTaxresidenceWithResponseSpec(Integer taxResidenceId) throws WebClientResponseException {
        return deleteTaxresidenceRequestCreation(taxResidenceId);
    }

    /**
     * Get Tax Residence
     * Retrieve a Tax Residence based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param taxResidenceId The unique identifier of the TaxResidence.
     * @return TaxResidenceObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTaxresidenceRequestCreation(Integer taxResidenceId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'taxResidenceId' is set
        if (taxResidenceId == null) {
            throw new WebClientResponseException("Missing the required parameter 'taxResidenceId' when calling getTaxresidence", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("taxResidenceId", taxResidenceId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<TaxResidenceObject> localVarReturnType = new ParameterizedTypeReference<TaxResidenceObject>() {};
        return apiClient.invokeAPI("/v1/taxResidences/{taxResidenceId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Tax Residence
     * Retrieve a Tax Residence based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param taxResidenceId The unique identifier of the TaxResidence.
     * @return TaxResidenceObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TaxResidenceObject> getTaxresidence(Integer taxResidenceId) throws WebClientResponseException {
        ParameterizedTypeReference<TaxResidenceObject> localVarReturnType = new ParameterizedTypeReference<TaxResidenceObject>() {};
        return getTaxresidenceRequestCreation(taxResidenceId).bodyToMono(localVarReturnType);
    }

    /**
     * Get Tax Residence
     * Retrieve a Tax Residence based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param taxResidenceId The unique identifier of the TaxResidence.
     * @return ResponseEntity&lt;TaxResidenceObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TaxResidenceObject>> getTaxresidenceWithHttpInfo(Integer taxResidenceId) throws WebClientResponseException {
        ParameterizedTypeReference<TaxResidenceObject> localVarReturnType = new ParameterizedTypeReference<TaxResidenceObject>() {};
        return getTaxresidenceRequestCreation(taxResidenceId).toEntity(localVarReturnType);
    }

    /**
     * Get Tax Residence
     * Retrieve a Tax Residence based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param taxResidenceId The unique identifier of the TaxResidence.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTaxresidenceWithResponseSpec(Integer taxResidenceId) throws WebClientResponseException {
        return getTaxresidenceRequestCreation(taxResidenceId);
    }

    /**
     * Search Tax Residences
     * Retrieve Tax Residences that match your search conditions.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param taxResidenceId The unique identifier of the Tax Residence.
     * @param userId The unique identifier of the User.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @return TaxResidenceObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTaxresidencesRequestCreation(Integer taxResidenceId, Integer userId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "taxResidenceId", taxResidenceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageCount", pageCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortBy", sortBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortOrder", sortOrder));
        
        final String[] localVarAccepts = { 
            "application/json", "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<TaxResidenceObject> localVarReturnType = new ParameterizedTypeReference<TaxResidenceObject>() {};
        return apiClient.invokeAPI("/v1/taxResidences", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search Tax Residences
     * Retrieve Tax Residences that match your search conditions.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param taxResidenceId The unique identifier of the Tax Residence.
     * @param userId The unique identifier of the User.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @return TaxResidenceObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TaxResidenceObject> getTaxresidences(Integer taxResidenceId, Integer userId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
        ParameterizedTypeReference<TaxResidenceObject> localVarReturnType = new ParameterizedTypeReference<TaxResidenceObject>() {};
        return getTaxresidencesRequestCreation(taxResidenceId, userId, pageNumber, pageCount, sortBy, sortOrder).bodyToMono(localVarReturnType);
    }

    /**
     * Search Tax Residences
     * Retrieve Tax Residences that match your search conditions.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param taxResidenceId The unique identifier of the Tax Residence.
     * @param userId The unique identifier of the User.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @return ResponseEntity&lt;TaxResidenceObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TaxResidenceObject>> getTaxresidencesWithHttpInfo(Integer taxResidenceId, Integer userId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
        ParameterizedTypeReference<TaxResidenceObject> localVarReturnType = new ParameterizedTypeReference<TaxResidenceObject>() {};
        return getTaxresidencesRequestCreation(taxResidenceId, userId, pageNumber, pageCount, sortBy, sortOrder).toEntity(localVarReturnType);
    }

    /**
     * Search Tax Residences
     * Retrieve Tax Residences that match your search conditions.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param taxResidenceId The unique identifier of the Tax Residence.
     * @param userId The unique identifier of the User.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTaxresidencesWithResponseSpec(Integer taxResidenceId, Integer userId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
        return getTaxresidencesRequestCreation(taxResidenceId, userId, pageNumber, pageCount, sortBy, sortOrder);
    }

    /**
     * Create Tax Residence
     * Create a new Tax Residence.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param postTaxresidenceRequest The postTaxresidenceRequest parameter
     * @return TaxResidenceObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postTaxresidenceRequestCreation(PostTaxresidenceRequest postTaxresidenceRequest) throws WebClientResponseException {
        Object postBody = postTaxresidenceRequest;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<TaxResidenceObject> localVarReturnType = new ParameterizedTypeReference<TaxResidenceObject>() {};
        return apiClient.invokeAPI("/v1/taxResidences", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Tax Residence
     * Create a new Tax Residence.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param postTaxresidenceRequest The postTaxresidenceRequest parameter
     * @return TaxResidenceObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TaxResidenceObject> postTaxresidence(PostTaxresidenceRequest postTaxresidenceRequest) throws WebClientResponseException {
        ParameterizedTypeReference<TaxResidenceObject> localVarReturnType = new ParameterizedTypeReference<TaxResidenceObject>() {};
        return postTaxresidenceRequestCreation(postTaxresidenceRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Tax Residence
     * Create a new Tax Residence.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param postTaxresidenceRequest The postTaxresidenceRequest parameter
     * @return ResponseEntity&lt;TaxResidenceObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TaxResidenceObject>> postTaxresidenceWithHttpInfo(PostTaxresidenceRequest postTaxresidenceRequest) throws WebClientResponseException {
        ParameterizedTypeReference<TaxResidenceObject> localVarReturnType = new ParameterizedTypeReference<TaxResidenceObject>() {};
        return postTaxresidenceRequestCreation(postTaxresidenceRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Tax Residence
     * Create a new Tax Residence.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param postTaxresidenceRequest The postTaxresidenceRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postTaxresidenceWithResponseSpec(PostTaxresidenceRequest postTaxresidenceRequest) throws WebClientResponseException {
        return postTaxresidenceRequestCreation(postTaxresidenceRequest);
    }

    /**
     * Update Tax Residence
     * Modify an existing Tax Residence.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param taxResidenceId The unique identifier of the TaxResidence
     * @param putTaxresidenceRequest The putTaxresidenceRequest parameter
     * @return TaxResidenceObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putTaxresidenceRequestCreation(Integer taxResidenceId, PutTaxresidenceRequest putTaxresidenceRequest) throws WebClientResponseException {
        Object postBody = putTaxresidenceRequest;
        // verify the required parameter 'taxResidenceId' is set
        if (taxResidenceId == null) {
            throw new WebClientResponseException("Missing the required parameter 'taxResidenceId' when calling putTaxresidence", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("taxResidenceId", taxResidenceId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<TaxResidenceObject> localVarReturnType = new ParameterizedTypeReference<TaxResidenceObject>() {};
        return apiClient.invokeAPI("/v1/taxResidences/{taxResidenceId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update Tax Residence
     * Modify an existing Tax Residence.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param taxResidenceId The unique identifier of the TaxResidence
     * @param putTaxresidenceRequest The putTaxresidenceRequest parameter
     * @return TaxResidenceObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TaxResidenceObject> putTaxresidence(Integer taxResidenceId, PutTaxresidenceRequest putTaxresidenceRequest) throws WebClientResponseException {
        ParameterizedTypeReference<TaxResidenceObject> localVarReturnType = new ParameterizedTypeReference<TaxResidenceObject>() {};
        return putTaxresidenceRequestCreation(taxResidenceId, putTaxresidenceRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update Tax Residence
     * Modify an existing Tax Residence.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param taxResidenceId The unique identifier of the TaxResidence
     * @param putTaxresidenceRequest The putTaxresidenceRequest parameter
     * @return ResponseEntity&lt;TaxResidenceObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TaxResidenceObject>> putTaxresidenceWithHttpInfo(Integer taxResidenceId, PutTaxresidenceRequest putTaxresidenceRequest) throws WebClientResponseException {
        ParameterizedTypeReference<TaxResidenceObject> localVarReturnType = new ParameterizedTypeReference<TaxResidenceObject>() {};
        return putTaxresidenceRequestCreation(taxResidenceId, putTaxresidenceRequest).toEntity(localVarReturnType);
    }

    /**
     * Update Tax Residence
     * Modify an existing Tax Residence.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param taxResidenceId The unique identifier of the TaxResidence
     * @param putTaxresidenceRequest The putTaxresidenceRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putTaxresidenceWithResponseSpec(Integer taxResidenceId, PutTaxresidenceRequest putTaxresidenceRequest) throws WebClientResponseException {
        return putTaxresidenceRequestCreation(taxResidenceId, putTaxresidenceRequest);
    }
}
