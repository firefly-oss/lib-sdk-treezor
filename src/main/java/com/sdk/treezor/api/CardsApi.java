package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.ActivateCardRequest;
import com.sdk.treezor.model.AssignCardWalletRequest;
import com.sdk.treezor.model.CardObject;
import com.sdk.treezor.model.CardOptionsRequest;
import com.sdk.treezor.model.ChangePinRequest;
import com.sdk.treezor.model.ConvertVirtualRequest;
import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.GetCardImage200Response;
import com.sdk.treezor.model.GetRenewalDetails200Response;
import java.time.OffsetDateTime;
import com.sdk.treezor.model.Post3dsRequest;
import com.sdk.treezor.model.PostCardPhysicalRequest;
import com.sdk.treezor.model.PostCardVirtualRequest;
import com.sdk.treezor.model.PutCardRequest;
import com.sdk.treezor.model.PutLimitsRequest;
import com.sdk.treezor.model.ReassignCardRequest;
import com.sdk.treezor.model.SetPinRequest;
import com.sdk.treezor.model.UpdateBlockStatusRequest;
import com.sdk.treezor.model.UpdateRenewalDetailsRequest;

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
public class CardsApi {
    private ApiClient apiClient;

    public CardsApi() {
        this(new ApiClient());
    }

    @Autowired
    public CardsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Activate Card
     * Activate the Card (updating the &#x60;isLive&#x60; attribute to &#x60;1&#x60;). A Card must be activated to be used.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param activateCardRequest The activateCardRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec activateCardRequestCreation(Integer cardId, ActivateCardRequest activateCardRequest) throws WebClientResponseException {
        Object postBody = activateCardRequest;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling activateCard", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return apiClient.invokeAPI("/v1/cards/{cardId}/Activate", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Activate Card
     * Activate the Card (updating the &#x60;isLive&#x60; attribute to &#x60;1&#x60;). A Card must be activated to be used.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param activateCardRequest The activateCardRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CardObject> activateCard(Integer cardId, ActivateCardRequest activateCardRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return activateCardRequestCreation(cardId, activateCardRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Activate Card
     * Activate the Card (updating the &#x60;isLive&#x60; attribute to &#x60;1&#x60;). A Card must be activated to be used.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param activateCardRequest The activateCardRequest parameter
     * @return ResponseEntity&lt;CardObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CardObject>> activateCardWithHttpInfo(Integer cardId, ActivateCardRequest activateCardRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return activateCardRequestCreation(cardId, activateCardRequest).toEntity(localVarReturnType);
    }

    /**
     * Activate Card
     * Activate the Card (updating the &#x60;isLive&#x60; attribute to &#x60;1&#x60;). A Card must be activated to be used.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param activateCardRequest The activateCardRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec activateCardWithResponseSpec(Integer cardId, ActivateCardRequest activateCardRequest) throws WebClientResponseException {
        return activateCardRequestCreation(cardId, activateCardRequest);
    }

    /**
     * Activate Card Public Token
     * Activate the Card (updating the &#x60;isLive&#x60; attribute to &#x60;1&#x60;). Ideal for end user oriented action. A Card must be activated to be used.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardToken The &#x60;publicToken&#x60; of the Card.
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec activateCardTokenRequestCreation(String cardToken) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cardToken' is set
        if (cardToken == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardToken' when calling activateCardToken", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("cardToken", cardToken);

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

        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return apiClient.invokeAPI("/v1/cards/{cardToken}/public-token-activation", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Activate Card Public Token
     * Activate the Card (updating the &#x60;isLive&#x60; attribute to &#x60;1&#x60;). Ideal for end user oriented action. A Card must be activated to be used.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardToken The &#x60;publicToken&#x60; of the Card.
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CardObject> activateCardToken(String cardToken) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return activateCardTokenRequestCreation(cardToken).bodyToMono(localVarReturnType);
    }

    /**
     * Activate Card Public Token
     * Activate the Card (updating the &#x60;isLive&#x60; attribute to &#x60;1&#x60;). Ideal for end user oriented action. A Card must be activated to be used.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardToken The &#x60;publicToken&#x60; of the Card.
     * @return ResponseEntity&lt;CardObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CardObject>> activateCardTokenWithHttpInfo(String cardToken) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return activateCardTokenRequestCreation(cardToken).toEntity(localVarReturnType);
    }

    /**
     * Activate Card Public Token
     * Activate the Card (updating the &#x60;isLive&#x60; attribute to &#x60;1&#x60;). Ideal for end user oriented action. A Card must be activated to be used.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardToken The &#x60;publicToken&#x60; of the Card.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec activateCardTokenWithResponseSpec(String cardToken) throws WebClientResponseException {
        return activateCardTokenRequestCreation(cardToken);
    }

    /**
     * Assign Wallet
     * Assign the Card to another Wallet. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card to reassign.
     * @param assignCardWalletRequest The assignCardWalletRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec assignCardWalletRequestCreation(Integer cardId, AssignCardWalletRequest assignCardWalletRequest) throws WebClientResponseException {
        Object postBody = assignCardWalletRequest;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling assignCardWallet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return apiClient.invokeAPI("/v1/cards/{cardId}/AssignWallet", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Assign Wallet
     * Assign the Card to another Wallet. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card to reassign.
     * @param assignCardWalletRequest The assignCardWalletRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CardObject> assignCardWallet(Integer cardId, AssignCardWalletRequest assignCardWalletRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return assignCardWalletRequestCreation(cardId, assignCardWalletRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Assign Wallet
     * Assign the Card to another Wallet. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card to reassign.
     * @param assignCardWalletRequest The assignCardWalletRequest parameter
     * @return ResponseEntity&lt;CardObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CardObject>> assignCardWalletWithHttpInfo(Integer cardId, AssignCardWalletRequest assignCardWalletRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return assignCardWalletRequestCreation(cardId, assignCardWalletRequest).toEntity(localVarReturnType);
    }

    /**
     * Assign Wallet
     * Assign the Card to another Wallet. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card to reassign.
     * @param assignCardWalletRequest The assignCardWalletRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec assignCardWalletWithResponseSpec(Integer cardId, AssignCardWalletRequest assignCardWalletRequest) throws WebClientResponseException {
        return assignCardWalletRequestCreation(cardId, assignCardWalletRequest);
    }

    /**
     * Update Card Options
     * Modify the Card permissions group.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param cardOptionsRequest The cardOptionsRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec cardOptionsRequestCreation(Integer cardId, CardOptionsRequest cardOptionsRequest) throws WebClientResponseException {
        Object postBody = cardOptionsRequest;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling cardOptions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return apiClient.invokeAPI("/v1/cards/{cardId}/Options", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update Card Options
     * Modify the Card permissions group.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param cardOptionsRequest The cardOptionsRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CardObject> cardOptions(Integer cardId, CardOptionsRequest cardOptionsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return cardOptionsRequestCreation(cardId, cardOptionsRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update Card Options
     * Modify the Card permissions group.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param cardOptionsRequest The cardOptionsRequest parameter
     * @return ResponseEntity&lt;CardObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CardObject>> cardOptionsWithHttpInfo(Integer cardId, CardOptionsRequest cardOptionsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return cardOptionsRequestCreation(cardId, cardOptionsRequest).toEntity(localVarReturnType);
    }

    /**
     * Update Card Options
     * Modify the Card permissions group.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param cardOptionsRequest The cardOptionsRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec cardOptionsWithResponseSpec(Integer cardId, CardOptionsRequest cardOptionsRequest) throws WebClientResponseException {
        return cardOptionsRequestCreation(cardId, cardOptionsRequest);
    }

    /**
     * Change Card PIN
     * Change the Card PIN code knowing the current one.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param changePinRequest The changePinRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec changePinRequestCreation(Integer cardId, ChangePinRequest changePinRequest) throws WebClientResponseException {
        Object postBody = changePinRequest;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling changePin", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return apiClient.invokeAPI("/v1/cards/{cardId}/ChangePIN", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Change Card PIN
     * Change the Card PIN code knowing the current one.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param changePinRequest The changePinRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CardObject> changePin(Integer cardId, ChangePinRequest changePinRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return changePinRequestCreation(cardId, changePinRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Change Card PIN
     * Change the Card PIN code knowing the current one.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param changePinRequest The changePinRequest parameter
     * @return ResponseEntity&lt;CardObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CardObject>> changePinWithHttpInfo(Integer cardId, ChangePinRequest changePinRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return changePinRequestCreation(cardId, changePinRequest).toEntity(localVarReturnType);
    }

    /**
     * Change Card PIN
     * Change the Card PIN code knowing the current one.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param changePinRequest The changePinRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec changePinWithResponseSpec(Integer cardId, ChangePinRequest changePinRequest) throws WebClientResponseException {
        return changePinRequestCreation(cardId, changePinRequest);
    }

    /**
     * Convert virtual card to physical
     * Convert a virtual Card into a physical one. The converted card will be both virtual and physical. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card to convert.
     * @param convertVirtualRequest The convertVirtualRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertVirtualRequestCreation(Integer cardId, ConvertVirtualRequest convertVirtualRequest) throws WebClientResponseException {
        Object postBody = convertVirtualRequest;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling convertVirtual", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return apiClient.invokeAPI("/v1/cards/{cardId}/ConvertVirtual", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert virtual card to physical
     * Convert a virtual Card into a physical one. The converted card will be both virtual and physical. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card to convert.
     * @param convertVirtualRequest The convertVirtualRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CardObject> convertVirtual(Integer cardId, ConvertVirtualRequest convertVirtualRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return convertVirtualRequestCreation(cardId, convertVirtualRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Convert virtual card to physical
     * Convert a virtual Card into a physical one. The converted card will be both virtual and physical. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card to convert.
     * @param convertVirtualRequest The convertVirtualRequest parameter
     * @return ResponseEntity&lt;CardObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CardObject>> convertVirtualWithHttpInfo(Integer cardId, ConvertVirtualRequest convertVirtualRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return convertVirtualRequestCreation(cardId, convertVirtualRequest).toEntity(localVarReturnType);
    }

    /**
     * Convert virtual card to physical
     * Convert a virtual Card into a physical one. The converted card will be both virtual and physical. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card to convert.
     * @param convertVirtualRequest The convertVirtualRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec convertVirtualWithResponseSpec(Integer cardId, ConvertVirtualRequest convertVirtualRequest) throws WebClientResponseException {
        return convertVirtualRequestCreation(cardId, convertVirtualRequest);
    }

    /**
     * Get Card
     * Retrieve a Card based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCardRequestCreation(UUID cardId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling getCard", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return apiClient.invokeAPI("/v1/cards/{cardId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Card
     * Retrieve a Card based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CardObject> getCard(UUID cardId) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return getCardRequestCreation(cardId).bodyToMono(localVarReturnType);
    }

    /**
     * Get Card
     * Retrieve a Card based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @return ResponseEntity&lt;CardObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CardObject>> getCardWithHttpInfo(UUID cardId) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return getCardRequestCreation(cardId).toEntity(localVarReturnType);
    }

    /**
     * Get Card
     * Retrieve a Card based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCardWithResponseSpec(UUID cardId) throws WebClientResponseException {
        return getCardRequestCreation(cardId);
    }

    /**
     * Get Card Image
     * Retrieve a virtual card image.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the virtual card.
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @return GetCardImage200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCardImageRequestCreation(Integer cardId, String accessTag) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling getCardImage", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cardId", cardId));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<GetCardImage200Response> localVarReturnType = new ParameterizedTypeReference<GetCardImage200Response>() {};
        return apiClient.invokeAPI("/v1/cardimages", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Card Image
     * Retrieve a virtual card image.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the virtual card.
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @return GetCardImage200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetCardImage200Response> getCardImage(Integer cardId, String accessTag) throws WebClientResponseException {
        ParameterizedTypeReference<GetCardImage200Response> localVarReturnType = new ParameterizedTypeReference<GetCardImage200Response>() {};
        return getCardImageRequestCreation(cardId, accessTag).bodyToMono(localVarReturnType);
    }

    /**
     * Get Card Image
     * Retrieve a virtual card image.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the virtual card.
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @return ResponseEntity&lt;GetCardImage200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetCardImage200Response>> getCardImageWithHttpInfo(Integer cardId, String accessTag) throws WebClientResponseException {
        ParameterizedTypeReference<GetCardImage200Response> localVarReturnType = new ParameterizedTypeReference<GetCardImage200Response>() {};
        return getCardImageRequestCreation(cardId, accessTag).toEntity(localVarReturnType);
    }

    /**
     * Get Card Image
     * Retrieve a virtual card image.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the virtual card.
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCardImageWithResponseSpec(Integer cardId, String accessTag) throws WebClientResponseException {
        return getCardImageRequestCreation(cardId, accessTag);
    }

    /**
     * Search Cards
     * Retrieve Cards based on search criteria.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param cardId The unique identifier of the Card.
     * @param userId The unique identifier of the cardholder
     * @param embossedName Embossed name of the card
     * @param publicToken Public token of the card
     * @param permsGroup Permissions group of the card.   See [available values on the documentation](/guide/cards/restrictions-limits.html#permission-groups-permsgroup) 
     * @param isPhysical Whether or not the card is a Physical Card. Values can be:   * &#x60;1&#x60; – Physical card   * &#x60;0&#x60; – Virtual card 
     * @param isConverted Whether or not the card is a Virtual Card that has been converted into a Physical Card. Values can be:   * &#x60;1&#x60; – Physical card converted from a virtual card   * &#x60;0&#x60; – Not converted, virtual card only 
     * @param lockStatus The Status of the card, indicating whether it is locked, lost, or destroyed for instance.  While this field is an integer, it returns a plaintext value. See the full list of &#x60;lockStatus&#x60;in the [Block a Card](/guide/cards/modification.html#status) article. 
     * @param mccRestrictionGroupId mccRestrictionGroupId of the card
     * @param merchantRestrictionGroupId merchantRestrictionGroupId of the card
     * @param countryRestrictionGroupId countryRestrictionGroupId of the card
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The reference value for sorting the list. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateTo The modification date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCardsRequestCreation(String accessTag, Integer cardId, Integer userId, String embossedName, String publicToken, String permsGroup, Integer isPhysical, Integer isConverted, Integer lockStatus, Integer mccRestrictionGroupId, Integer merchantRestrictionGroupId, Integer countryRestrictionGroupId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cardId", cardId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "embossedName", embossedName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "publicToken", publicToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "permsGroup", permsGroup));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isPhysical", isPhysical));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isConverted", isConverted));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lockStatus", lockStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mccRestrictionGroupId", mccRestrictionGroupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "merchantRestrictionGroupId", merchantRestrictionGroupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "countryRestrictionGroupId", countryRestrictionGroupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
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

        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return apiClient.invokeAPI("/v1/cards", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search Cards
     * Retrieve Cards based on search criteria.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param cardId The unique identifier of the Card.
     * @param userId The unique identifier of the cardholder
     * @param embossedName Embossed name of the card
     * @param publicToken Public token of the card
     * @param permsGroup Permissions group of the card.   See [available values on the documentation](/guide/cards/restrictions-limits.html#permission-groups-permsgroup) 
     * @param isPhysical Whether or not the card is a Physical Card. Values can be:   * &#x60;1&#x60; – Physical card   * &#x60;0&#x60; – Virtual card 
     * @param isConverted Whether or not the card is a Virtual Card that has been converted into a Physical Card. Values can be:   * &#x60;1&#x60; – Physical card converted from a virtual card   * &#x60;0&#x60; – Not converted, virtual card only 
     * @param lockStatus The Status of the card, indicating whether it is locked, lost, or destroyed for instance.  While this field is an integer, it returns a plaintext value. See the full list of &#x60;lockStatus&#x60;in the [Block a Card](/guide/cards/modification.html#status) article. 
     * @param mccRestrictionGroupId mccRestrictionGroupId of the card
     * @param merchantRestrictionGroupId merchantRestrictionGroupId of the card
     * @param countryRestrictionGroupId countryRestrictionGroupId of the card
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The reference value for sorting the list. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateTo The modification date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CardObject> getCards(String accessTag, Integer cardId, Integer userId, String embossedName, String publicToken, String permsGroup, Integer isPhysical, Integer isConverted, Integer lockStatus, Integer mccRestrictionGroupId, Integer merchantRestrictionGroupId, Integer countryRestrictionGroupId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return getCardsRequestCreation(accessTag, cardId, userId, embossedName, publicToken, permsGroup, isPhysical, isConverted, lockStatus, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo).bodyToMono(localVarReturnType);
    }

    /**
     * Search Cards
     * Retrieve Cards based on search criteria.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param cardId The unique identifier of the Card.
     * @param userId The unique identifier of the cardholder
     * @param embossedName Embossed name of the card
     * @param publicToken Public token of the card
     * @param permsGroup Permissions group of the card.   See [available values on the documentation](/guide/cards/restrictions-limits.html#permission-groups-permsgroup) 
     * @param isPhysical Whether or not the card is a Physical Card. Values can be:   * &#x60;1&#x60; – Physical card   * &#x60;0&#x60; – Virtual card 
     * @param isConverted Whether or not the card is a Virtual Card that has been converted into a Physical Card. Values can be:   * &#x60;1&#x60; – Physical card converted from a virtual card   * &#x60;0&#x60; – Not converted, virtual card only 
     * @param lockStatus The Status of the card, indicating whether it is locked, lost, or destroyed for instance.  While this field is an integer, it returns a plaintext value. See the full list of &#x60;lockStatus&#x60;in the [Block a Card](/guide/cards/modification.html#status) article. 
     * @param mccRestrictionGroupId mccRestrictionGroupId of the card
     * @param merchantRestrictionGroupId merchantRestrictionGroupId of the card
     * @param countryRestrictionGroupId countryRestrictionGroupId of the card
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The reference value for sorting the list. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateTo The modification date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @return ResponseEntity&lt;CardObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CardObject>> getCardsWithHttpInfo(String accessTag, Integer cardId, Integer userId, String embossedName, String publicToken, String permsGroup, Integer isPhysical, Integer isConverted, Integer lockStatus, Integer mccRestrictionGroupId, Integer merchantRestrictionGroupId, Integer countryRestrictionGroupId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return getCardsRequestCreation(accessTag, cardId, userId, embossedName, publicToken, permsGroup, isPhysical, isConverted, lockStatus, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo).toEntity(localVarReturnType);
    }

    /**
     * Search Cards
     * Retrieve Cards based on search criteria.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param cardId The unique identifier of the Card.
     * @param userId The unique identifier of the cardholder
     * @param embossedName Embossed name of the card
     * @param publicToken Public token of the card
     * @param permsGroup Permissions group of the card.   See [available values on the documentation](/guide/cards/restrictions-limits.html#permission-groups-permsgroup) 
     * @param isPhysical Whether or not the card is a Physical Card. Values can be:   * &#x60;1&#x60; – Physical card   * &#x60;0&#x60; – Virtual card 
     * @param isConverted Whether or not the card is a Virtual Card that has been converted into a Physical Card. Values can be:   * &#x60;1&#x60; – Physical card converted from a virtual card   * &#x60;0&#x60; – Not converted, virtual card only 
     * @param lockStatus The Status of the card, indicating whether it is locked, lost, or destroyed for instance.  While this field is an integer, it returns a plaintext value. See the full list of &#x60;lockStatus&#x60;in the [Block a Card](/guide/cards/modification.html#status) article. 
     * @param mccRestrictionGroupId mccRestrictionGroupId of the card
     * @param merchantRestrictionGroupId merchantRestrictionGroupId of the card
     * @param countryRestrictionGroupId countryRestrictionGroupId of the card
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The reference value for sorting the list. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateTo The modification date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCardsWithResponseSpec(String accessTag, Integer cardId, Integer userId, String embossedName, String publicToken, String permsGroup, Integer isPhysical, Integer isConverted, Integer lockStatus, Integer mccRestrictionGroupId, Integer merchantRestrictionGroupId, Integer countryRestrictionGroupId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        return getCardsRequestCreation(accessTag, cardId, userId, embossedName, publicToken, permsGroup, isPhysical, isConverted, lockStatus, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
    }

    /**
     * Get Renewal Details
     * Retrieve the Card &#x60;renewalType&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @return GetRenewalDetails200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRenewalDetailsRequestCreation(Integer cardId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling getRenewalDetails", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetRenewalDetails200Response> localVarReturnType = new ParameterizedTypeReference<GetRenewalDetails200Response>() {};
        return apiClient.invokeAPI("/v1/cards/{cardId}/renewalDetails", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Renewal Details
     * Retrieve the Card &#x60;renewalType&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @return GetRenewalDetails200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetRenewalDetails200Response> getRenewalDetails(Integer cardId) throws WebClientResponseException {
        ParameterizedTypeReference<GetRenewalDetails200Response> localVarReturnType = new ParameterizedTypeReference<GetRenewalDetails200Response>() {};
        return getRenewalDetailsRequestCreation(cardId).bodyToMono(localVarReturnType);
    }

    /**
     * Get Renewal Details
     * Retrieve the Card &#x60;renewalType&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @return ResponseEntity&lt;GetRenewalDetails200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetRenewalDetails200Response>> getRenewalDetailsWithHttpInfo(Integer cardId) throws WebClientResponseException {
        ParameterizedTypeReference<GetRenewalDetails200Response> localVarReturnType = new ParameterizedTypeReference<GetRenewalDetails200Response>() {};
        return getRenewalDetailsRequestCreation(cardId).toEntity(localVarReturnType);
    }

    /**
     * Get Renewal Details
     * Retrieve the Card &#x60;renewalType&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRenewalDetailsWithResponseSpec(Integer cardId) throws WebClientResponseException {
        return getRenewalDetailsRequestCreation(cardId);
    }

    /**
     * Register 3D secure
     * Register a card to 3D secure service. The user&#39;s mobile number must begin with &#x60;+&#x60;, or &#x60;00&#x60;, and the country dialing code. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param post3dsRequest The post3dsRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec post3dsRequestCreation(Post3dsRequest post3dsRequest) throws WebClientResponseException {
        Object postBody = post3dsRequest;
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

        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return apiClient.invokeAPI("/v1/cards/Register3DS", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Register 3D secure
     * Register a card to 3D secure service. The user&#39;s mobile number must begin with &#x60;+&#x60;, or &#x60;00&#x60;, and the country dialing code. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param post3dsRequest The post3dsRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CardObject> post3ds(Post3dsRequest post3dsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return post3dsRequestCreation(post3dsRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Register 3D secure
     * Register a card to 3D secure service. The user&#39;s mobile number must begin with &#x60;+&#x60;, or &#x60;00&#x60;, and the country dialing code. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param post3dsRequest The post3dsRequest parameter
     * @return ResponseEntity&lt;CardObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CardObject>> post3dsWithHttpInfo(Post3dsRequest post3dsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return post3dsRequestCreation(post3dsRequest).toEntity(localVarReturnType);
    }

    /**
     * Register 3D secure
     * Register a card to 3D secure service. The user&#39;s mobile number must begin with &#x60;+&#x60;, or &#x60;00&#x60;, and the country dialing code. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param post3dsRequest The post3dsRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec post3dsWithResponseSpec(Post3dsRequest post3dsRequest) throws WebClientResponseException {
        return post3dsRequestCreation(post3dsRequest);
    }

    /**
     * Create Physical Card
     * Create a new physical card. To use a card, it must be activated (&#x60;/cards/{id}/Activate&#x60;).  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param postCardPhysicalRequest The postCardPhysicalRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postCardPhysicalRequestCreation(PostCardPhysicalRequest postCardPhysicalRequest) throws WebClientResponseException {
        Object postBody = postCardPhysicalRequest;
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

        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return apiClient.invokeAPI("/v1/cards/RequestPhysical", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Physical Card
     * Create a new physical card. To use a card, it must be activated (&#x60;/cards/{id}/Activate&#x60;).  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param postCardPhysicalRequest The postCardPhysicalRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CardObject> postCardPhysical(PostCardPhysicalRequest postCardPhysicalRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return postCardPhysicalRequestCreation(postCardPhysicalRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Physical Card
     * Create a new physical card. To use a card, it must be activated (&#x60;/cards/{id}/Activate&#x60;).  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param postCardPhysicalRequest The postCardPhysicalRequest parameter
     * @return ResponseEntity&lt;CardObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CardObject>> postCardPhysicalWithHttpInfo(PostCardPhysicalRequest postCardPhysicalRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return postCardPhysicalRequestCreation(postCardPhysicalRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Physical Card
     * Create a new physical card. To use a card, it must be activated (&#x60;/cards/{id}/Activate&#x60;).  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param postCardPhysicalRequest The postCardPhysicalRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postCardPhysicalWithResponseSpec(PostCardPhysicalRequest postCardPhysicalRequest) throws WebClientResponseException {
        return postCardPhysicalRequestCreation(postCardPhysicalRequest);
    }

    /**
     * Create Virtual Card
     * Create a new virtual card. To use a card, it must be activated (&#x60;/v1/cards/{cardId}/Activate&#x60;).  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param postCardVirtualRequest The postCardVirtualRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postCardVirtualRequestCreation(PostCardVirtualRequest postCardVirtualRequest) throws WebClientResponseException {
        Object postBody = postCardVirtualRequest;
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

        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return apiClient.invokeAPI("/v1/cards/CreateVirtual", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Virtual Card
     * Create a new virtual card. To use a card, it must be activated (&#x60;/v1/cards/{cardId}/Activate&#x60;).  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param postCardVirtualRequest The postCardVirtualRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CardObject> postCardVirtual(PostCardVirtualRequest postCardVirtualRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return postCardVirtualRequestCreation(postCardVirtualRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Virtual Card
     * Create a new virtual card. To use a card, it must be activated (&#x60;/v1/cards/{cardId}/Activate&#x60;).  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param postCardVirtualRequest The postCardVirtualRequest parameter
     * @return ResponseEntity&lt;CardObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CardObject>> postCardVirtualWithHttpInfo(PostCardVirtualRequest postCardVirtualRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return postCardVirtualRequestCreation(postCardVirtualRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Virtual Card
     * Create a new virtual card. To use a card, it must be activated (&#x60;/v1/cards/{cardId}/Activate&#x60;).  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param postCardVirtualRequest The postCardVirtualRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postCardVirtualWithResponseSpec(PostCardVirtualRequest postCardVirtualRequest) throws WebClientResponseException {
        return postCardVirtualRequestCreation(postCardVirtualRequest);
    }

    /**
     * Update Card
     * Update the restriction groups of the card, as well as the &#x60;cardTag&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param putCardRequest The putCardRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putCardRequestCreation(Integer cardId, PutCardRequest putCardRequest) throws WebClientResponseException {
        Object postBody = putCardRequest;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling putCard", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return apiClient.invokeAPI("/v1/cards/{cardId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update Card
     * Update the restriction groups of the card, as well as the &#x60;cardTag&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param putCardRequest The putCardRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CardObject> putCard(Integer cardId, PutCardRequest putCardRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return putCardRequestCreation(cardId, putCardRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update Card
     * Update the restriction groups of the card, as well as the &#x60;cardTag&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param putCardRequest The putCardRequest parameter
     * @return ResponseEntity&lt;CardObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CardObject>> putCardWithHttpInfo(Integer cardId, PutCardRequest putCardRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return putCardRequestCreation(cardId, putCardRequest).toEntity(localVarReturnType);
    }

    /**
     * Update Card
     * Update the restriction groups of the card, as well as the &#x60;cardTag&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param putCardRequest The putCardRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putCardWithResponseSpec(Integer cardId, PutCardRequest putCardRequest) throws WebClientResponseException {
        return putCardRequestCreation(cardId, putCardRequest);
    }

    /**
     * Update Card Limits
     * Modify the Card limits.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param putLimitsRequest The putLimitsRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putLimitsRequestCreation(Integer cardId, PutLimitsRequest putLimitsRequest) throws WebClientResponseException {
        Object postBody = putLimitsRequest;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling putLimits", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return apiClient.invokeAPI("/v1/cards/{cardId}/Limits", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update Card Limits
     * Modify the Card limits.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param putLimitsRequest The putLimitsRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CardObject> putLimits(Integer cardId, PutLimitsRequest putLimitsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return putLimitsRequestCreation(cardId, putLimitsRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update Card Limits
     * Modify the Card limits.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param putLimitsRequest The putLimitsRequest parameter
     * @return ResponseEntity&lt;CardObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CardObject>> putLimitsWithHttpInfo(Integer cardId, PutLimitsRequest putLimitsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return putLimitsRequestCreation(cardId, putLimitsRequest).toEntity(localVarReturnType);
    }

    /**
     * Update Card Limits
     * Modify the Card limits.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param putLimitsRequest The putLimitsRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putLimitsWithResponseSpec(Integer cardId, PutLimitsRequest putLimitsRequest) throws WebClientResponseException {
        return putLimitsRequestCreation(cardId, putLimitsRequest);
    }

    /**
     * Renew Card
     * Renew a Card manually. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putRenewRequestCreation(Integer cardId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling putRenew", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return apiClient.invokeAPI("/v1/cards/{cardId}/renew", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Renew Card
     * Renew a Card manually. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CardObject> putRenew(Integer cardId) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return putRenewRequestCreation(cardId).bodyToMono(localVarReturnType);
    }

    /**
     * Renew Card
     * Renew a Card manually. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @return ResponseEntity&lt;CardObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CardObject>> putRenewWithHttpInfo(Integer cardId) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return putRenewRequestCreation(cardId).toEntity(localVarReturnType);
    }

    /**
     * Renew Card
     * Renew a Card manually. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putRenewWithResponseSpec(Integer cardId) throws WebClientResponseException {
        return putRenewRequestCreation(cardId);
    }

    /**
     * Reassign Card
     * Assign the Card to another User or Wallet. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card to reassign.
     * @param reassignCardRequest The reassignCardRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec reassignCardRequestCreation(Integer cardId, ReassignCardRequest reassignCardRequest) throws WebClientResponseException {
        Object postBody = reassignCardRequest;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling reassignCard", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return apiClient.invokeAPI("/v1/cards/{cardId}/Assign", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Reassign Card
     * Assign the Card to another User or Wallet. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card to reassign.
     * @param reassignCardRequest The reassignCardRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CardObject> reassignCard(Integer cardId, ReassignCardRequest reassignCardRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return reassignCardRequestCreation(cardId, reassignCardRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Reassign Card
     * Assign the Card to another User or Wallet. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card to reassign.
     * @param reassignCardRequest The reassignCardRequest parameter
     * @return ResponseEntity&lt;CardObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CardObject>> reassignCardWithHttpInfo(Integer cardId, ReassignCardRequest reassignCardRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return reassignCardRequestCreation(cardId, reassignCardRequest).toEntity(localVarReturnType);
    }

    /**
     * Reassign Card
     * Assign the Card to another User or Wallet. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card to reassign.
     * @param reassignCardRequest The reassignCardRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec reassignCardWithResponseSpec(Integer cardId, ReassignCardRequest reassignCardRequest) throws WebClientResponseException {
        return reassignCardRequestCreation(cardId, reassignCardRequest);
    }

    /**
     * Regenerate Card
     * Recreate the card image if the card is unlocked.   Useful when changing card design, company name, or when retrieving the image results in a 404. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param convertVirtualRequest The convertVirtualRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec regenerateCardRequestCreation(Integer cardId, ConvertVirtualRequest convertVirtualRequest) throws WebClientResponseException {
        Object postBody = convertVirtualRequest;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling regenerateCard", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return apiClient.invokeAPI("/v1/cards/{cardId}/Regenerate", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Regenerate Card
     * Recreate the card image if the card is unlocked.   Useful when changing card design, company name, or when retrieving the image results in a 404. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param convertVirtualRequest The convertVirtualRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CardObject> regenerateCard(Integer cardId, ConvertVirtualRequest convertVirtualRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return regenerateCardRequestCreation(cardId, convertVirtualRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Regenerate Card
     * Recreate the card image if the card is unlocked.   Useful when changing card design, company name, or when retrieving the image results in a 404. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param convertVirtualRequest The convertVirtualRequest parameter
     * @return ResponseEntity&lt;CardObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CardObject>> regenerateCardWithHttpInfo(Integer cardId, ConvertVirtualRequest convertVirtualRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return regenerateCardRequestCreation(cardId, convertVirtualRequest).toEntity(localVarReturnType);
    }

    /**
     * Regenerate Card
     * Recreate the card image if the card is unlocked.   Useful when changing card design, company name, or when retrieving the image results in a 404. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param convertVirtualRequest The convertVirtualRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec regenerateCardWithResponseSpec(Integer cardId, ConvertVirtualRequest convertVirtualRequest) throws WebClientResponseException {
        return regenerateCardRequestCreation(cardId, convertVirtualRequest);
    }

    /**
     * Set Card PIN
     * Overwrite the Card PIN code.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param setPinRequest The setPinRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec setPinRequestCreation(Integer cardId, SetPinRequest setPinRequest) throws WebClientResponseException {
        Object postBody = setPinRequest;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling setPin", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return apiClient.invokeAPI("/v1/cards/{cardId}/setPIN", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Set Card PIN
     * Overwrite the Card PIN code.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param setPinRequest The setPinRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CardObject> setPin(Integer cardId, SetPinRequest setPinRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return setPinRequestCreation(cardId, setPinRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Set Card PIN
     * Overwrite the Card PIN code.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param setPinRequest The setPinRequest parameter
     * @return ResponseEntity&lt;CardObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CardObject>> setPinWithHttpInfo(Integer cardId, SetPinRequest setPinRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return setPinRequestCreation(cardId, setPinRequest).toEntity(localVarReturnType);
    }

    /**
     * Set Card PIN
     * Overwrite the Card PIN code.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param setPinRequest The setPinRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec setPinWithResponseSpec(Integer cardId, SetPinRequest setPinRequest) throws WebClientResponseException {
        return setPinRequestCreation(cardId, setPinRequest);
    }

    /**
     * Unblock Card CVC2
     * Unblock a Card whose CVC2 is locked.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>204</b> - successfully unblocked.
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec unblockCvcRequestCreation(Integer cardId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling unblockCvc", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/v1/cards/{cardId}/unblockcvc2", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Unblock Card CVC2
     * Unblock a Card whose CVC2 is locked.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>204</b> - successfully unblocked.
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> unblockCvc(Integer cardId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return unblockCvcRequestCreation(cardId).bodyToMono(localVarReturnType);
    }

    /**
     * Unblock Card CVC2
     * Unblock a Card whose CVC2 is locked.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>204</b> - successfully unblocked.
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> unblockCvcWithHttpInfo(Integer cardId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return unblockCvcRequestCreation(cardId).toEntity(localVarReturnType);
    }

    /**
     * Unblock Card CVC2
     * Unblock a Card whose CVC2 is locked.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>204</b> - successfully unblocked.
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec unblockCvcWithResponseSpec(Integer cardId) throws WebClientResponseException {
        return unblockCvcRequestCreation(cardId);
    }

    /**
     * Unblock Card PIN
     * Unblock the Card PIN code.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param convertVirtualRequest The convertVirtualRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec unblockPinRequestCreation(Integer cardId, ConvertVirtualRequest convertVirtualRequest) throws WebClientResponseException {
        Object postBody = convertVirtualRequest;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling unblockPin", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return apiClient.invokeAPI("/v1/cards/{cardId}/UnblockPIN", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Unblock Card PIN
     * Unblock the Card PIN code.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param convertVirtualRequest The convertVirtualRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CardObject> unblockPin(Integer cardId, ConvertVirtualRequest convertVirtualRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return unblockPinRequestCreation(cardId, convertVirtualRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Unblock Card PIN
     * Unblock the Card PIN code.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param convertVirtualRequest The convertVirtualRequest parameter
     * @return ResponseEntity&lt;CardObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CardObject>> unblockPinWithHttpInfo(Integer cardId, ConvertVirtualRequest convertVirtualRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return unblockPinRequestCreation(cardId, convertVirtualRequest).toEntity(localVarReturnType);
    }

    /**
     * Unblock Card PIN
     * Unblock the Card PIN code.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param convertVirtualRequest The convertVirtualRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec unblockPinWithResponseSpec(Integer cardId, ConvertVirtualRequest convertVirtualRequest) throws WebClientResponseException {
        return unblockPinRequestCreation(cardId, convertVirtualRequest);
    }

    /**
     * Update Card Lock Status
     * Block or unblock a card.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param updateBlockStatusRequest The updateBlockStatusRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateBlockStatusRequestCreation(Integer cardId, UpdateBlockStatusRequest updateBlockStatusRequest) throws WebClientResponseException {
        Object postBody = updateBlockStatusRequest;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling updateBlockStatus", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return apiClient.invokeAPI("/v1/cards/{cardId}/LockUnlock", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update Card Lock Status
     * Block or unblock a card.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param updateBlockStatusRequest The updateBlockStatusRequest parameter
     * @return CardObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CardObject> updateBlockStatus(Integer cardId, UpdateBlockStatusRequest updateBlockStatusRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return updateBlockStatusRequestCreation(cardId, updateBlockStatusRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update Card Lock Status
     * Block or unblock a card.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param updateBlockStatusRequest The updateBlockStatusRequest parameter
     * @return ResponseEntity&lt;CardObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CardObject>> updateBlockStatusWithHttpInfo(Integer cardId, UpdateBlockStatusRequest updateBlockStatusRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CardObject> localVarReturnType = new ParameterizedTypeReference<CardObject>() {};
        return updateBlockStatusRequestCreation(cardId, updateBlockStatusRequest).toEntity(localVarReturnType);
    }

    /**
     * Update Card Lock Status
     * Block or unblock a card.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param updateBlockStatusRequest The updateBlockStatusRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateBlockStatusWithResponseSpec(Integer cardId, UpdateBlockStatusRequest updateBlockStatusRequest) throws WebClientResponseException {
        return updateBlockStatusRequestCreation(cardId, updateBlockStatusRequest);
    }

    /**
     * Update Renewal Details
     * Update the Card &#x60;renewalType&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param updateRenewalDetailsRequest The updateRenewalDetailsRequest parameter
     * @return GetRenewalDetails200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateRenewalDetailsRequestCreation(Integer cardId, UpdateRenewalDetailsRequest updateRenewalDetailsRequest) throws WebClientResponseException {
        Object postBody = updateRenewalDetailsRequest;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling updateRenewalDetails", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<GetRenewalDetails200Response> localVarReturnType = new ParameterizedTypeReference<GetRenewalDetails200Response>() {};
        return apiClient.invokeAPI("/v1/cards/{cardId}/renewalDetails", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update Renewal Details
     * Update the Card &#x60;renewalType&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param updateRenewalDetailsRequest The updateRenewalDetailsRequest parameter
     * @return GetRenewalDetails200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetRenewalDetails200Response> updateRenewalDetails(Integer cardId, UpdateRenewalDetailsRequest updateRenewalDetailsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<GetRenewalDetails200Response> localVarReturnType = new ParameterizedTypeReference<GetRenewalDetails200Response>() {};
        return updateRenewalDetailsRequestCreation(cardId, updateRenewalDetailsRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update Renewal Details
     * Update the Card &#x60;renewalType&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param updateRenewalDetailsRequest The updateRenewalDetailsRequest parameter
     * @return ResponseEntity&lt;GetRenewalDetails200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetRenewalDetails200Response>> updateRenewalDetailsWithHttpInfo(Integer cardId, UpdateRenewalDetailsRequest updateRenewalDetailsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<GetRenewalDetails200Response> localVarReturnType = new ParameterizedTypeReference<GetRenewalDetails200Response>() {};
        return updateRenewalDetailsRequestCreation(cardId, updateRenewalDetailsRequest).toEntity(localVarReturnType);
    }

    /**
     * Update Renewal Details
     * Update the Card &#x60;renewalType&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param updateRenewalDetailsRequest The updateRenewalDetailsRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateRenewalDetailsWithResponseSpec(Integer cardId, UpdateRenewalDetailsRequest updateRenewalDetailsRequest) throws WebClientResponseException {
        return updateRenewalDetailsRequestCreation(cardId, updateRenewalDetailsRequest);
    }
}
