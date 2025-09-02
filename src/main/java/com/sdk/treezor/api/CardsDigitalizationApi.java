package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.CardDigitalizationsId200Response;
import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.ReadcardDigitalizations200Response;

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
public class CardsDigitalizationApi {
    private ApiClient apiClient;

    public CardsDigitalizationApi() {
        this(new ApiClient());
    }

    @Autowired
    public CardsDigitalizationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Get Card Digitalization
     * Retrieve a Card Digitalization based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id Card digitalization internal id.
     * @return CardDigitalizationsId200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    private ResponseSpec cardDigitalizationsIdRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling cardDigitalizationsId", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CardDigitalizationsId200Response> localVarReturnType = new ParameterizedTypeReference<CardDigitalizationsId200Response>() {};
        return apiClient.invokeAPI("/v1/cardDigitalizations/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Card Digitalization
     * Retrieve a Card Digitalization based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id Card digitalization internal id.
     * @return CardDigitalizationsId200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CardDigitalizationsId200Response> cardDigitalizationsId(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<CardDigitalizationsId200Response> localVarReturnType = new ParameterizedTypeReference<CardDigitalizationsId200Response>() {};
        return cardDigitalizationsIdRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Get Card Digitalization
     * Retrieve a Card Digitalization based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id Card digitalization internal id.
     * @return ResponseEntity&lt;CardDigitalizationsId200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CardDigitalizationsId200Response>> cardDigitalizationsIdWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<CardDigitalizationsId200Response> localVarReturnType = new ParameterizedTypeReference<CardDigitalizationsId200Response>() {};
        return cardDigitalizationsIdRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Get Card Digitalization
     * Retrieve a Card Digitalization based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id Card digitalization internal id.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec cardDigitalizationsIdWithResponseSpec(UUID id) throws WebClientResponseException {
        return cardDigitalizationsIdRequestCreation(id);
    }

    /**
     * Delete Payment Token
     * Delete a payment Token
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Card Digitalization (internal).
     * @param reasonCode The reason code for the action. Possible values are:  | Reason code | Description | | ---- | ----------- | | C | Account closed | | F | Issuer or cardholder confirmed fraudulent token transactions (Deprecated) | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other | 
     * @return ReadcardDigitalizations200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    private ResponseSpec deletecardDigitalizationsIdRequestCreation(UUID id, String reasonCode) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deletecardDigitalizationsId", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'reasonCode' is set
        if (reasonCode == null) {
            throw new WebClientResponseException("Missing the required parameter 'reasonCode' when calling deletecardDigitalizationsId", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ReadcardDigitalizations200Response> localVarReturnType = new ParameterizedTypeReference<ReadcardDigitalizations200Response>() {};
        return apiClient.invokeAPI("/v1/cardDigitalizations/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete Payment Token
     * Delete a payment Token
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Card Digitalization (internal).
     * @param reasonCode The reason code for the action. Possible values are:  | Reason code | Description | | ---- | ----------- | | C | Account closed | | F | Issuer or cardholder confirmed fraudulent token transactions (Deprecated) | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other | 
     * @return ReadcardDigitalizations200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ReadcardDigitalizations200Response> deletecardDigitalizationsId(UUID id, String reasonCode) throws WebClientResponseException {
        ParameterizedTypeReference<ReadcardDigitalizations200Response> localVarReturnType = new ParameterizedTypeReference<ReadcardDigitalizations200Response>() {};
        return deletecardDigitalizationsIdRequestCreation(id, reasonCode).bodyToMono(localVarReturnType);
    }

    /**
     * Delete Payment Token
     * Delete a payment Token
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Card Digitalization (internal).
     * @param reasonCode The reason code for the action. Possible values are:  | Reason code | Description | | ---- | ----------- | | C | Account closed | | F | Issuer or cardholder confirmed fraudulent token transactions (Deprecated) | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other | 
     * @return ResponseEntity&lt;ReadcardDigitalizations200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ReadcardDigitalizations200Response>> deletecardDigitalizationsIdWithHttpInfo(UUID id, String reasonCode) throws WebClientResponseException {
        ParameterizedTypeReference<ReadcardDigitalizations200Response> localVarReturnType = new ParameterizedTypeReference<ReadcardDigitalizations200Response>() {};
        return deletecardDigitalizationsIdRequestCreation(id, reasonCode).toEntity(localVarReturnType);
    }

    /**
     * Delete Payment Token
     * Delete a payment Token
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Card Digitalization (internal).
     * @param reasonCode The reason code for the action. Possible values are:  | Reason code | Description | | ---- | ----------- | | C | Account closed | | F | Issuer or cardholder confirmed fraudulent token transactions (Deprecated) | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other | 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deletecardDigitalizationsIdWithResponseSpec(UUID id, String reasonCode) throws WebClientResponseException {
        return deletecardDigitalizationsIdRequestCreation(id, reasonCode);
    }

    /**
     * Update Payment Token Status
     * Update the status of a payment Token  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id Card digitalization internal id.
     * @param status The new status for the payment Token. Possible values are:  | Status | Description | | ---- | ----------- | | unsuspend | Unsuspend | | suspend | Suspend | 
     * @param reasonCode The reason code for the action. Possible values are:  For a suspension:  | Reason code | Description | | ---- | ----------- | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other |  For an unsuspension:  | Reason code | Description | | ---- | ----------- | | F | Cardholder reported token device found or not stolen | | T | Issuer or cardholder confirmed no fraudulent token transactions | | Z | Other | 
     * @return CardDigitalizationsId200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    private ResponseSpec putcardDigitalizationsIdRequestCreation(UUID id, String status, String reasonCode) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling putcardDigitalizationsId", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'status' is set
        if (status == null) {
            throw new WebClientResponseException("Missing the required parameter 'status' when calling putcardDigitalizationsId", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'reasonCode' is set
        if (reasonCode == null) {
            throw new WebClientResponseException("Missing the required parameter 'reasonCode' when calling putcardDigitalizationsId", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "reasonCode", reasonCode));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<CardDigitalizationsId200Response> localVarReturnType = new ParameterizedTypeReference<CardDigitalizationsId200Response>() {};
        return apiClient.invokeAPI("/v1/cardDigitalizations/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update Payment Token Status
     * Update the status of a payment Token  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id Card digitalization internal id.
     * @param status The new status for the payment Token. Possible values are:  | Status | Description | | ---- | ----------- | | unsuspend | Unsuspend | | suspend | Suspend | 
     * @param reasonCode The reason code for the action. Possible values are:  For a suspension:  | Reason code | Description | | ---- | ----------- | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other |  For an unsuspension:  | Reason code | Description | | ---- | ----------- | | F | Cardholder reported token device found or not stolen | | T | Issuer or cardholder confirmed no fraudulent token transactions | | Z | Other | 
     * @return CardDigitalizationsId200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CardDigitalizationsId200Response> putcardDigitalizationsId(UUID id, String status, String reasonCode) throws WebClientResponseException {
        ParameterizedTypeReference<CardDigitalizationsId200Response> localVarReturnType = new ParameterizedTypeReference<CardDigitalizationsId200Response>() {};
        return putcardDigitalizationsIdRequestCreation(id, status, reasonCode).bodyToMono(localVarReturnType);
    }

    /**
     * Update Payment Token Status
     * Update the status of a payment Token  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id Card digitalization internal id.
     * @param status The new status for the payment Token. Possible values are:  | Status | Description | | ---- | ----------- | | unsuspend | Unsuspend | | suspend | Suspend | 
     * @param reasonCode The reason code for the action. Possible values are:  For a suspension:  | Reason code | Description | | ---- | ----------- | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other |  For an unsuspension:  | Reason code | Description | | ---- | ----------- | | F | Cardholder reported token device found or not stolen | | T | Issuer or cardholder confirmed no fraudulent token transactions | | Z | Other | 
     * @return ResponseEntity&lt;CardDigitalizationsId200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CardDigitalizationsId200Response>> putcardDigitalizationsIdWithHttpInfo(UUID id, String status, String reasonCode) throws WebClientResponseException {
        ParameterizedTypeReference<CardDigitalizationsId200Response> localVarReturnType = new ParameterizedTypeReference<CardDigitalizationsId200Response>() {};
        return putcardDigitalizationsIdRequestCreation(id, status, reasonCode).toEntity(localVarReturnType);
    }

    /**
     * Update Payment Token Status
     * Update the status of a payment Token  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id Card digitalization internal id.
     * @param status The new status for the payment Token. Possible values are:  | Status | Description | | ---- | ----------- | | unsuspend | Unsuspend | | suspend | Suspend | 
     * @param reasonCode The reason code for the action. Possible values are:  For a suspension:  | Reason code | Description | | ---- | ----------- | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other |  For an unsuspension:  | Reason code | Description | | ---- | ----------- | | F | Cardholder reported token device found or not stolen | | T | Issuer or cardholder confirmed no fraudulent token transactions | | Z | Other | 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putcardDigitalizationsIdWithResponseSpec(UUID id, String status, String reasonCode) throws WebClientResponseException {
        return putcardDigitalizationsIdRequestCreation(id, status, reasonCode);
    }

    /**
     * Search Card Digitalizations
     * Search for card digitalizations.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param filter Filterable fields are:  - &#x60;cardId&#x60; - &#x60;createdDate&#x60; - &#x60;detailsFromGPS&#x60; - &#x60;externalId&#x60; - &#x60;id&#x60; - &#x60;modifiedDate&#x60; - &#x60;status&#x60; 
     * @return ReadcardDigitalizations200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    private ResponseSpec readcardDigitalizationsRequestCreation(String accessTag, String filter) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter", filter));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<ReadcardDigitalizations200Response> localVarReturnType = new ParameterizedTypeReference<ReadcardDigitalizations200Response>() {};
        return apiClient.invokeAPI("/v1/cardDigitalizations", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search Card Digitalizations
     * Search for card digitalizations.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param filter Filterable fields are:  - &#x60;cardId&#x60; - &#x60;createdDate&#x60; - &#x60;detailsFromGPS&#x60; - &#x60;externalId&#x60; - &#x60;id&#x60; - &#x60;modifiedDate&#x60; - &#x60;status&#x60; 
     * @return ReadcardDigitalizations200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ReadcardDigitalizations200Response> readcardDigitalizations(String accessTag, String filter) throws WebClientResponseException {
        ParameterizedTypeReference<ReadcardDigitalizations200Response> localVarReturnType = new ParameterizedTypeReference<ReadcardDigitalizations200Response>() {};
        return readcardDigitalizationsRequestCreation(accessTag, filter).bodyToMono(localVarReturnType);
    }

    /**
     * Search Card Digitalizations
     * Search for card digitalizations.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param filter Filterable fields are:  - &#x60;cardId&#x60; - &#x60;createdDate&#x60; - &#x60;detailsFromGPS&#x60; - &#x60;externalId&#x60; - &#x60;id&#x60; - &#x60;modifiedDate&#x60; - &#x60;status&#x60; 
     * @return ResponseEntity&lt;ReadcardDigitalizations200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ReadcardDigitalizations200Response>> readcardDigitalizationsWithHttpInfo(String accessTag, String filter) throws WebClientResponseException {
        ParameterizedTypeReference<ReadcardDigitalizations200Response> localVarReturnType = new ParameterizedTypeReference<ReadcardDigitalizations200Response>() {};
        return readcardDigitalizationsRequestCreation(accessTag, filter).toEntity(localVarReturnType);
    }

    /**
     * Search Card Digitalizations
     * Search for card digitalizations.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param filter Filterable fields are:  - &#x60;cardId&#x60; - &#x60;createdDate&#x60; - &#x60;detailsFromGPS&#x60; - &#x60;externalId&#x60; - &#x60;id&#x60; - &#x60;modifiedDate&#x60; - &#x60;status&#x60; 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readcardDigitalizationsWithResponseSpec(String accessTag, String filter) throws WebClientResponseException {
        return readcardDigitalizationsRequestCreation(accessTag, filter);
    }
}
