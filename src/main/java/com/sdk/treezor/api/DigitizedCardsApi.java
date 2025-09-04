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
import com.sdk.treezor.model.DigitalizedCardsDeactivateDigitalizedCardResponse;
import com.sdk.treezor.model.DigitalizedCardsGetDigitalizedCardResponse;
import com.sdk.treezor.model.DigitalizedCardsPutDigitalizedCardResponse;
import com.sdk.treezor.model.GetDigitalized400Response;
import com.sdk.treezor.model.GetDigitalized401Response;
import com.sdk.treezor.model.GetDigitalized404Response;
import com.sdk.treezor.model.GetDigitalized500Response;
import com.sdk.treezor.model.PutDigitalizedRequest;
import com.sdk.treezor.model.TavRequestPOST200Response;
import com.sdk.treezor.model.TavRequestPOSTRequest;

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
public class DigitizedCardsApi {
    private ApiClient apiClient;

    public DigitizedCardsApi() {
        this(new ApiClient());
    }

    @Autowired
    public DigitizedCardsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Deactivate Payment Token
     * Deactivate a payment Token. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Invalid or missing input (or invalid card status)
     * <p><b>401</b> - User not authorized to make this request
     * <p><b>404</b> - Digitized Card does not exist
     * <p><b>500</b> - Internal error.
     * @param id The unique identifier of a digitized card. 
     * @param reasonCode The reason code is required only if the card is on Mastercard System. Possible values are:  | Reason code | Description | | :----: | ----------- | | C | Account closed | | D | Issuer consumer deleted | | F | Cardholder reported token device found or not stolen | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other | 
     * @return DigitalizedCardsDeactivateDigitalizedCardResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteDigitalizedRequestCreation(String id, String reasonCode) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteDigitalized", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'reasonCode' is set
        if (reasonCode == null) {
            throw new WebClientResponseException("Missing the required parameter 'reasonCode' when calling deleteDigitalized", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "reasonCode", reasonCode));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<DigitalizedCardsDeactivateDigitalizedCardResponse> localVarReturnType = new ParameterizedTypeReference<DigitalizedCardsDeactivateDigitalizedCardResponse>() {};
        return apiClient.invokeAPI("/v1/digitalizedCard/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Deactivate Payment Token
     * Deactivate a payment Token. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Invalid or missing input (or invalid card status)
     * <p><b>401</b> - User not authorized to make this request
     * <p><b>404</b> - Digitized Card does not exist
     * <p><b>500</b> - Internal error.
     * @param id The unique identifier of a digitized card. 
     * @param reasonCode The reason code is required only if the card is on Mastercard System. Possible values are:  | Reason code | Description | | :----: | ----------- | | C | Account closed | | D | Issuer consumer deleted | | F | Cardholder reported token device found or not stolen | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other | 
     * @return DigitalizedCardsDeactivateDigitalizedCardResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DigitalizedCardsDeactivateDigitalizedCardResponse> deleteDigitalized(String id, String reasonCode) throws WebClientResponseException {
        ParameterizedTypeReference<DigitalizedCardsDeactivateDigitalizedCardResponse> localVarReturnType = new ParameterizedTypeReference<DigitalizedCardsDeactivateDigitalizedCardResponse>() {};
        return deleteDigitalizedRequestCreation(id, reasonCode).bodyToMono(localVarReturnType);
    }

    /**
     * Deactivate Payment Token
     * Deactivate a payment Token. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Invalid or missing input (or invalid card status)
     * <p><b>401</b> - User not authorized to make this request
     * <p><b>404</b> - Digitized Card does not exist
     * <p><b>500</b> - Internal error.
     * @param id The unique identifier of a digitized card. 
     * @param reasonCode The reason code is required only if the card is on Mastercard System. Possible values are:  | Reason code | Description | | :----: | ----------- | | C | Account closed | | D | Issuer consumer deleted | | F | Cardholder reported token device found or not stolen | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other | 
     * @return ResponseEntity&lt;DigitalizedCardsDeactivateDigitalizedCardResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DigitalizedCardsDeactivateDigitalizedCardResponse>> deleteDigitalizedWithHttpInfo(String id, String reasonCode) throws WebClientResponseException {
        ParameterizedTypeReference<DigitalizedCardsDeactivateDigitalizedCardResponse> localVarReturnType = new ParameterizedTypeReference<DigitalizedCardsDeactivateDigitalizedCardResponse>() {};
        return deleteDigitalizedRequestCreation(id, reasonCode).toEntity(localVarReturnType);
    }

    /**
     * Deactivate Payment Token
     * Deactivate a payment Token. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Invalid or missing input (or invalid card status)
     * <p><b>401</b> - User not authorized to make this request
     * <p><b>404</b> - Digitized Card does not exist
     * <p><b>500</b> - Internal error.
     * @param id The unique identifier of a digitized card. 
     * @param reasonCode The reason code is required only if the card is on Mastercard System. Possible values are:  | Reason code | Description | | :----: | ----------- | | C | Account closed | | D | Issuer consumer deleted | | F | Cardholder reported token device found or not stolen | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other | 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteDigitalizedWithResponseSpec(String id, String reasonCode) throws WebClientResponseException {
        return deleteDigitalizedRequestCreation(id, reasonCode);
    }

    /**
     * Get Digitized Cards
     * Retrieve the list of Digitized Cards for a given &#x60;cardId&#x60;. 
     * <p><b>200</b> - List successfully retrieved
     * <p><b>400</b> - Invalid or missing input (or invalid card status)
     * <p><b>401</b> - User not authorized to make this request
     * <p><b>404</b> - Digitized Card does not exist
     * <p><b>500</b> - Internal error.
     * @param cardId The unique identifier of the virtual or physical card.
     * @return List&lt;DigitalizedCardsGetDigitalizedCardResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDigitalizedRequestCreation(String cardId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling getDigitalized", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("cardId", cardId);

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

        ParameterizedTypeReference<DigitalizedCardsGetDigitalizedCardResponse> localVarReturnType = new ParameterizedTypeReference<DigitalizedCardsGetDigitalizedCardResponse>() {};
        return apiClient.invokeAPI("/v1/{cardId}/digitalizedCards", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Digitized Cards
     * Retrieve the list of Digitized Cards for a given &#x60;cardId&#x60;. 
     * <p><b>200</b> - List successfully retrieved
     * <p><b>400</b> - Invalid or missing input (or invalid card status)
     * <p><b>401</b> - User not authorized to make this request
     * <p><b>404</b> - Digitized Card does not exist
     * <p><b>500</b> - Internal error.
     * @param cardId The unique identifier of the virtual or physical card.
     * @return List&lt;DigitalizedCardsGetDigitalizedCardResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<DigitalizedCardsGetDigitalizedCardResponse> getDigitalized(String cardId) throws WebClientResponseException {
        ParameterizedTypeReference<DigitalizedCardsGetDigitalizedCardResponse> localVarReturnType = new ParameterizedTypeReference<DigitalizedCardsGetDigitalizedCardResponse>() {};
        return getDigitalizedRequestCreation(cardId).bodyToFlux(localVarReturnType);
    }

    /**
     * Get Digitized Cards
     * Retrieve the list of Digitized Cards for a given &#x60;cardId&#x60;. 
     * <p><b>200</b> - List successfully retrieved
     * <p><b>400</b> - Invalid or missing input (or invalid card status)
     * <p><b>401</b> - User not authorized to make this request
     * <p><b>404</b> - Digitized Card does not exist
     * <p><b>500</b> - Internal error.
     * @param cardId The unique identifier of the virtual or physical card.
     * @return ResponseEntity&lt;List&lt;DigitalizedCardsGetDigitalizedCardResponse&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<DigitalizedCardsGetDigitalizedCardResponse>>> getDigitalizedWithHttpInfo(String cardId) throws WebClientResponseException {
        ParameterizedTypeReference<DigitalizedCardsGetDigitalizedCardResponse> localVarReturnType = new ParameterizedTypeReference<DigitalizedCardsGetDigitalizedCardResponse>() {};
        return getDigitalizedRequestCreation(cardId).toEntityList(localVarReturnType);
    }

    /**
     * Get Digitized Cards
     * Retrieve the list of Digitized Cards for a given &#x60;cardId&#x60;. 
     * <p><b>200</b> - List successfully retrieved
     * <p><b>400</b> - Invalid or missing input (or invalid card status)
     * <p><b>401</b> - User not authorized to make this request
     * <p><b>404</b> - Digitized Card does not exist
     * <p><b>500</b> - Internal error.
     * @param cardId The unique identifier of the virtual or physical card.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDigitalizedWithResponseSpec(String cardId) throws WebClientResponseException {
        return getDigitalizedRequestCreation(cardId);
    }

    /**
     * Get Payment Token
     * Retrieve a payment token.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Invalid or missing input (or invalid card status)
     * <p><b>401</b> - User not authorized to make this request
     * <p><b>404</b> - Digitized Card does not exist
     * <p><b>500</b> - Internal error.
     * @param id The unique identifier of a digitized card. 
     * @return DigitalizedCardsGetDigitalizedCardResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPaymentTokenRequestCreation(String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getPaymentToken", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DigitalizedCardsGetDigitalizedCardResponse> localVarReturnType = new ParameterizedTypeReference<DigitalizedCardsGetDigitalizedCardResponse>() {};
        return apiClient.invokeAPI("/v1/digitalizedCard/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Payment Token
     * Retrieve a payment token.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Invalid or missing input (or invalid card status)
     * <p><b>401</b> - User not authorized to make this request
     * <p><b>404</b> - Digitized Card does not exist
     * <p><b>500</b> - Internal error.
     * @param id The unique identifier of a digitized card. 
     * @return DigitalizedCardsGetDigitalizedCardResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DigitalizedCardsGetDigitalizedCardResponse> getPaymentToken(String id) throws WebClientResponseException {
        ParameterizedTypeReference<DigitalizedCardsGetDigitalizedCardResponse> localVarReturnType = new ParameterizedTypeReference<DigitalizedCardsGetDigitalizedCardResponse>() {};
        return getPaymentTokenRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Get Payment Token
     * Retrieve a payment token.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Invalid or missing input (or invalid card status)
     * <p><b>401</b> - User not authorized to make this request
     * <p><b>404</b> - Digitized Card does not exist
     * <p><b>500</b> - Internal error.
     * @param id The unique identifier of a digitized card. 
     * @return ResponseEntity&lt;DigitalizedCardsGetDigitalizedCardResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DigitalizedCardsGetDigitalizedCardResponse>> getPaymentTokenWithHttpInfo(String id) throws WebClientResponseException {
        ParameterizedTypeReference<DigitalizedCardsGetDigitalizedCardResponse> localVarReturnType = new ParameterizedTypeReference<DigitalizedCardsGetDigitalizedCardResponse>() {};
        return getPaymentTokenRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Get Payment Token
     * Retrieve a payment token.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Invalid or missing input (or invalid card status)
     * <p><b>401</b> - User not authorized to make this request
     * <p><b>404</b> - Digitized Card does not exist
     * <p><b>500</b> - Internal error.
     * @param id The unique identifier of a digitized card. 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPaymentTokenWithResponseSpec(String id) throws WebClientResponseException {
        return getPaymentTokenRequestCreation(id);
    }

    /**
     * Update Payment Token Status
     * Update the status of a payment Token. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Invalid or missing input (or invalid card status)
     * <p><b>401</b> - User not authorized to make this request
     * <p><b>404</b> - Digitized Card does not exist
     * <p><b>500</b> - Internal error.
     * @param id The unique identifier of a digitalized card. 
     * @param putDigitalizedRequest The putDigitalizedRequest parameter
     * @return DigitalizedCardsPutDigitalizedCardResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putDigitalizedRequestCreation(String id, PutDigitalizedRequest putDigitalizedRequest) throws WebClientResponseException {
        Object postBody = putDigitalizedRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling putDigitalized", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<DigitalizedCardsPutDigitalizedCardResponse> localVarReturnType = new ParameterizedTypeReference<DigitalizedCardsPutDigitalizedCardResponse>() {};
        return apiClient.invokeAPI("/v1/digitalizedCard/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update Payment Token Status
     * Update the status of a payment Token. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Invalid or missing input (or invalid card status)
     * <p><b>401</b> - User not authorized to make this request
     * <p><b>404</b> - Digitized Card does not exist
     * <p><b>500</b> - Internal error.
     * @param id The unique identifier of a digitalized card. 
     * @param putDigitalizedRequest The putDigitalizedRequest parameter
     * @return DigitalizedCardsPutDigitalizedCardResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DigitalizedCardsPutDigitalizedCardResponse> putDigitalized(String id, PutDigitalizedRequest putDigitalizedRequest) throws WebClientResponseException {
        ParameterizedTypeReference<DigitalizedCardsPutDigitalizedCardResponse> localVarReturnType = new ParameterizedTypeReference<DigitalizedCardsPutDigitalizedCardResponse>() {};
        return putDigitalizedRequestCreation(id, putDigitalizedRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update Payment Token Status
     * Update the status of a payment Token. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Invalid or missing input (or invalid card status)
     * <p><b>401</b> - User not authorized to make this request
     * <p><b>404</b> - Digitized Card does not exist
     * <p><b>500</b> - Internal error.
     * @param id The unique identifier of a digitalized card. 
     * @param putDigitalizedRequest The putDigitalizedRequest parameter
     * @return ResponseEntity&lt;DigitalizedCardsPutDigitalizedCardResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DigitalizedCardsPutDigitalizedCardResponse>> putDigitalizedWithHttpInfo(String id, PutDigitalizedRequest putDigitalizedRequest) throws WebClientResponseException {
        ParameterizedTypeReference<DigitalizedCardsPutDigitalizedCardResponse> localVarReturnType = new ParameterizedTypeReference<DigitalizedCardsPutDigitalizedCardResponse>() {};
        return putDigitalizedRequestCreation(id, putDigitalizedRequest).toEntity(localVarReturnType);
    }

    /**
     * Update Payment Token Status
     * Update the status of a payment Token. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Invalid or missing input (or invalid card status)
     * <p><b>401</b> - User not authorized to make this request
     * <p><b>404</b> - Digitized Card does not exist
     * <p><b>500</b> - Internal error.
     * @param id The unique identifier of a digitalized card. 
     * @param putDigitalizedRequest The putDigitalizedRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putDigitalizedWithResponseSpec(String id, PutDigitalizedRequest putDigitalizedRequest) throws WebClientResponseException {
        return putDigitalizedRequestCreation(id, putDigitalizedRequest);
    }

    /**
     * Request issuerInitiatedDigitizationData
     * Create a new issuerInitiatedDigitizationData request  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param tavRequestPOSTRequest The tavRequestPOSTRequest parameter
     * @return TavRequestPOST200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec tavRequestPOSTRequestCreation(TavRequestPOSTRequest tavRequestPOSTRequest) throws WebClientResponseException {
        Object postBody = tavRequestPOSTRequest;
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

        ParameterizedTypeReference<TavRequestPOST200Response> localVarReturnType = new ParameterizedTypeReference<TavRequestPOST200Response>() {};
        return apiClient.invokeAPI("/v1/issuerInitiatedDigitizationDatas", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Request issuerInitiatedDigitizationData
     * Create a new issuerInitiatedDigitizationData request  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param tavRequestPOSTRequest The tavRequestPOSTRequest parameter
     * @return TavRequestPOST200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TavRequestPOST200Response> tavRequestPOST(TavRequestPOSTRequest tavRequestPOSTRequest) throws WebClientResponseException {
        ParameterizedTypeReference<TavRequestPOST200Response> localVarReturnType = new ParameterizedTypeReference<TavRequestPOST200Response>() {};
        return tavRequestPOSTRequestCreation(tavRequestPOSTRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Request issuerInitiatedDigitizationData
     * Create a new issuerInitiatedDigitizationData request  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param tavRequestPOSTRequest The tavRequestPOSTRequest parameter
     * @return ResponseEntity&lt;TavRequestPOST200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TavRequestPOST200Response>> tavRequestPOSTWithHttpInfo(TavRequestPOSTRequest tavRequestPOSTRequest) throws WebClientResponseException {
        ParameterizedTypeReference<TavRequestPOST200Response> localVarReturnType = new ParameterizedTypeReference<TavRequestPOST200Response>() {};
        return tavRequestPOSTRequestCreation(tavRequestPOSTRequest).toEntity(localVarReturnType);
    }

    /**
     * Request issuerInitiatedDigitizationData
     * Create a new issuerInitiatedDigitizationData request  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param tavRequestPOSTRequest The tavRequestPOSTRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec tavRequestPOSTWithResponseSpec(TavRequestPOSTRequest tavRequestPOSTRequest) throws WebClientResponseException {
        return tavRequestPOSTRequestCreation(tavRequestPOSTRequest);
    }
}
