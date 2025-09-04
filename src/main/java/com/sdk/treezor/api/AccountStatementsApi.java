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
import com.sdk.treezor.model.GetPdfAccountStatement200Response;
import com.sdk.treezor.model.GetRawStatement200Response;

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
public class AccountStatementsApi {
    private ApiClient apiClient;

    public AccountStatementsApi() {
        this(new ApiClient());
    }

    @Autowired
    public AccountStatementsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Get PDF Account Statement
     * Retrieve a Wallet account statement in pdf format.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param month The month of the statement (2 digits leading with &#x60;0&#x60;)
     * @param year The year of the statement (4 digits, e.g., &#x60;2022&#x60;)
     * @return GetPdfAccountStatement200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPdfAccountStatementRequestCreation(String walletId, Integer month, Integer year) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new WebClientResponseException("Missing the required parameter 'walletId' when calling getPdfAccountStatement", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'month' is set
        if (month == null) {
            throw new WebClientResponseException("Missing the required parameter 'month' when calling getPdfAccountStatement", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new WebClientResponseException("Missing the required parameter 'year' when calling getPdfAccountStatement", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("walletId", walletId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "month", month));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year", year));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<GetPdfAccountStatement200Response> localVarReturnType = new ParameterizedTypeReference<GetPdfAccountStatement200Response>() {};
        return apiClient.invokeAPI("/core-connect/statements/{walletId}/computed", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get PDF Account Statement
     * Retrieve a Wallet account statement in pdf format.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param month The month of the statement (2 digits leading with &#x60;0&#x60;)
     * @param year The year of the statement (4 digits, e.g., &#x60;2022&#x60;)
     * @return GetPdfAccountStatement200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetPdfAccountStatement200Response> getPdfAccountStatement(String walletId, Integer month, Integer year) throws WebClientResponseException {
        ParameterizedTypeReference<GetPdfAccountStatement200Response> localVarReturnType = new ParameterizedTypeReference<GetPdfAccountStatement200Response>() {};
        return getPdfAccountStatementRequestCreation(walletId, month, year).bodyToMono(localVarReturnType);
    }

    /**
     * Get PDF Account Statement
     * Retrieve a Wallet account statement in pdf format.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param month The month of the statement (2 digits leading with &#x60;0&#x60;)
     * @param year The year of the statement (4 digits, e.g., &#x60;2022&#x60;)
     * @return ResponseEntity&lt;GetPdfAccountStatement200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetPdfAccountStatement200Response>> getPdfAccountStatementWithHttpInfo(String walletId, Integer month, Integer year) throws WebClientResponseException {
        ParameterizedTypeReference<GetPdfAccountStatement200Response> localVarReturnType = new ParameterizedTypeReference<GetPdfAccountStatement200Response>() {};
        return getPdfAccountStatementRequestCreation(walletId, month, year).toEntity(localVarReturnType);
    }

    /**
     * Get PDF Account Statement
     * Retrieve a Wallet account statement in pdf format.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param month The month of the statement (2 digits leading with &#x60;0&#x60;)
     * @param year The year of the statement (4 digits, e.g., &#x60;2022&#x60;)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPdfAccountStatementWithResponseSpec(String walletId, Integer month, Integer year) throws WebClientResponseException {
        return getPdfAccountStatementRequestCreation(walletId, month, year);
    }

    /**
     * Get JSON Account Statement
     * Retrieve the raw data (json) to build a Wallet account statement.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param month The month of the statement (2 digits, e.g., &#x60;02&#x60;)
     * @param year The year of the statement (4 digits, e.g., &#x60;2025&#x60;)
     * @return GetRawStatement200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRawStatementRequestCreation(String walletId, Integer month, Integer year) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new WebClientResponseException("Missing the required parameter 'walletId' when calling getRawStatement", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'month' is set
        if (month == null) {
            throw new WebClientResponseException("Missing the required parameter 'month' when calling getRawStatement", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new WebClientResponseException("Missing the required parameter 'year' when calling getRawStatement", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("walletId", walletId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "month", month));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year", year));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<GetRawStatement200Response> localVarReturnType = new ParameterizedTypeReference<GetRawStatement200Response>() {};
        return apiClient.invokeAPI("/core-connect/statements/{walletId}/raw", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get JSON Account Statement
     * Retrieve the raw data (json) to build a Wallet account statement.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param month The month of the statement (2 digits, e.g., &#x60;02&#x60;)
     * @param year The year of the statement (4 digits, e.g., &#x60;2025&#x60;)
     * @return GetRawStatement200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetRawStatement200Response> getRawStatement(String walletId, Integer month, Integer year) throws WebClientResponseException {
        ParameterizedTypeReference<GetRawStatement200Response> localVarReturnType = new ParameterizedTypeReference<GetRawStatement200Response>() {};
        return getRawStatementRequestCreation(walletId, month, year).bodyToMono(localVarReturnType);
    }

    /**
     * Get JSON Account Statement
     * Retrieve the raw data (json) to build a Wallet account statement.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param month The month of the statement (2 digits, e.g., &#x60;02&#x60;)
     * @param year The year of the statement (4 digits, e.g., &#x60;2025&#x60;)
     * @return ResponseEntity&lt;GetRawStatement200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetRawStatement200Response>> getRawStatementWithHttpInfo(String walletId, Integer month, Integer year) throws WebClientResponseException {
        ParameterizedTypeReference<GetRawStatement200Response> localVarReturnType = new ParameterizedTypeReference<GetRawStatement200Response>() {};
        return getRawStatementRequestCreation(walletId, month, year).toEntity(localVarReturnType);
    }

    /**
     * Get JSON Account Statement
     * Retrieve the raw data (json) to build a Wallet account statement.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param month The month of the statement (2 digits, e.g., &#x60;02&#x60;)
     * @param year The year of the statement (4 digits, e.g., &#x60;2025&#x60;)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRawStatementWithResponseSpec(String walletId, Integer month, Integer year) throws WebClientResponseException {
        return getRawStatementRequestCreation(walletId, month, year);
    }
}
