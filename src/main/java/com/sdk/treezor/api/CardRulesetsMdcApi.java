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

import com.sdk.treezor.model.CardRuleset;
import com.sdk.treezor.model.CreateRuleset201Response;
import com.sdk.treezor.model.CreateRulesetRequest;
import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.FullRuleset;
import com.sdk.treezor.model.GetFactsBalance200Response;
import com.sdk.treezor.model.GetRulesetFromCard200ResponseInner;
import com.sdk.treezor.model.GetRulesets200Response;
import java.util.UUID;

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
public class CardRulesetsMdcApi {
    private ApiClient apiClient;

    public CardRulesetsMdcApi() {
        this(new ApiClient());
    }

    @Autowired
    public CardRulesetsMdcApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Assign Rulesets
     * Assign rulesets to a given card.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param cardRuleset The cardRuleset parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec attachRulesetToCardRequestCreation(String cardId, List<CardRuleset> cardRuleset) throws WebClientResponseException {
        Object postBody = cardRuleset;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling attachRulesetToCard", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'cardRuleset' is set
        if (cardRuleset == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardRuleset' when calling attachRulesetToCard", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/v1/mdc/{cardId}/rulesets", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Assign Rulesets
     * Assign rulesets to a given card.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param cardRuleset The cardRuleset parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> attachRulesetToCard(String cardId, List<CardRuleset> cardRuleset) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return attachRulesetToCardRequestCreation(cardId, cardRuleset).bodyToMono(localVarReturnType);
    }

    /**
     * Assign Rulesets
     * Assign rulesets to a given card.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param cardRuleset The cardRuleset parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> attachRulesetToCardWithHttpInfo(String cardId, List<CardRuleset> cardRuleset) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return attachRulesetToCardRequestCreation(cardId, cardRuleset).toEntity(localVarReturnType);
    }

    /**
     * Assign Rulesets
     * Assign rulesets to a given card.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param cardRuleset The cardRuleset parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec attachRulesetToCardWithResponseSpec(String cardId, List<CardRuleset> cardRuleset) throws WebClientResponseException {
        return attachRulesetToCardRequestCreation(cardId, cardRuleset);
    }

    /**
     * Create Ruleset
     * Create a Ruleset.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param createRulesetRequest The createRulesetRequest parameter
     * @return CreateRuleset201Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createRulesetRequestCreation(CreateRulesetRequest createRulesetRequest) throws WebClientResponseException {
        Object postBody = createRulesetRequest;
        // verify the required parameter 'createRulesetRequest' is set
        if (createRulesetRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createRulesetRequest' when calling createRuleset", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
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

        ParameterizedTypeReference<CreateRuleset201Response> localVarReturnType = new ParameterizedTypeReference<CreateRuleset201Response>() {};
        return apiClient.invokeAPI("/v1/mdc/rulesets", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Ruleset
     * Create a Ruleset.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param createRulesetRequest The createRulesetRequest parameter
     * @return CreateRuleset201Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CreateRuleset201Response> createRuleset(CreateRulesetRequest createRulesetRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CreateRuleset201Response> localVarReturnType = new ParameterizedTypeReference<CreateRuleset201Response>() {};
        return createRulesetRequestCreation(createRulesetRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Ruleset
     * Create a Ruleset.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param createRulesetRequest The createRulesetRequest parameter
     * @return ResponseEntity&lt;CreateRuleset201Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CreateRuleset201Response>> createRulesetWithHttpInfo(CreateRulesetRequest createRulesetRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CreateRuleset201Response> localVarReturnType = new ParameterizedTypeReference<CreateRuleset201Response>() {};
        return createRulesetRequestCreation(createRulesetRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Ruleset
     * Create a Ruleset.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param createRulesetRequest The createRulesetRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createRulesetWithResponseSpec(CreateRulesetRequest createRulesetRequest) throws WebClientResponseException {
        return createRulesetRequestCreation(createRulesetRequest);
    }

    /**
     * Disable Ruleset
     * Disable a Ruleset.
     * <p><b>204</b> - No content
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param rulesetId The unique identifier of the Ruleset.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec disableRulesetRequestCreation(UUID rulesetId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'rulesetId' is set
        if (rulesetId == null) {
            throw new WebClientResponseException("Missing the required parameter 'rulesetId' when calling disableRuleset", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("rulesetId", rulesetId);

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
        return apiClient.invokeAPI("/v1/mdc/rulesets/{rulesetId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Disable Ruleset
     * Disable a Ruleset.
     * <p><b>204</b> - No content
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param rulesetId The unique identifier of the Ruleset.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> disableRuleset(UUID rulesetId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return disableRulesetRequestCreation(rulesetId).bodyToMono(localVarReturnType);
    }

    /**
     * Disable Ruleset
     * Disable a Ruleset.
     * <p><b>204</b> - No content
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param rulesetId The unique identifier of the Ruleset.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> disableRulesetWithHttpInfo(UUID rulesetId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return disableRulesetRequestCreation(rulesetId).toEntity(localVarReturnType);
    }

    /**
     * Disable Ruleset
     * Disable a Ruleset.
     * <p><b>204</b> - No content
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param rulesetId The unique identifier of the Ruleset.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec disableRulesetWithResponseSpec(UUID rulesetId) throws WebClientResponseException {
        return disableRulesetRequestCreation(rulesetId);
    }

    /**
     * Retrieve Ruleset virtual balance
     * Retrieve a ruleset virtual balance.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param rulesetId The unique identifier of the Ruleset.
     * @return GetFactsBalance200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getFactsBalanceRequestCreation(String cardId, UUID rulesetId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling getFactsBalance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'rulesetId' is set
        if (rulesetId == null) {
            throw new WebClientResponseException("Missing the required parameter 'rulesetId' when calling getFactsBalance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("cardId", cardId);
        pathParams.put("rulesetId", rulesetId);

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

        ParameterizedTypeReference<GetFactsBalance200Response> localVarReturnType = new ParameterizedTypeReference<GetFactsBalance200Response>() {};
        return apiClient.invokeAPI("/v1/mdc/{cardId}/ruleset/{rulesetId}/factsBalance", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve Ruleset virtual balance
     * Retrieve a ruleset virtual balance.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param rulesetId The unique identifier of the Ruleset.
     * @return GetFactsBalance200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetFactsBalance200Response> getFactsBalance(String cardId, UUID rulesetId) throws WebClientResponseException {
        ParameterizedTypeReference<GetFactsBalance200Response> localVarReturnType = new ParameterizedTypeReference<GetFactsBalance200Response>() {};
        return getFactsBalanceRequestCreation(cardId, rulesetId).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve Ruleset virtual balance
     * Retrieve a ruleset virtual balance.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param rulesetId The unique identifier of the Ruleset.
     * @return ResponseEntity&lt;GetFactsBalance200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetFactsBalance200Response>> getFactsBalanceWithHttpInfo(String cardId, UUID rulesetId) throws WebClientResponseException {
        ParameterizedTypeReference<GetFactsBalance200Response> localVarReturnType = new ParameterizedTypeReference<GetFactsBalance200Response>() {};
        return getFactsBalanceRequestCreation(cardId, rulesetId).toEntity(localVarReturnType);
    }

    /**
     * Retrieve Ruleset virtual balance
     * Retrieve a ruleset virtual balance.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param rulesetId The unique identifier of the Ruleset.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getFactsBalanceWithResponseSpec(String cardId, UUID rulesetId) throws WebClientResponseException {
        return getFactsBalanceRequestCreation(cardId, rulesetId);
    }

    /**
     * Get Ruleset
     * Retrieve a Ruleset with its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param rulesetId The unique identifier of the Ruleset.
     * @return FullRuleset
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRulesetRequestCreation(UUID rulesetId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'rulesetId' is set
        if (rulesetId == null) {
            throw new WebClientResponseException("Missing the required parameter 'rulesetId' when calling getRuleset", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("rulesetId", rulesetId);

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

        ParameterizedTypeReference<FullRuleset> localVarReturnType = new ParameterizedTypeReference<FullRuleset>() {};
        return apiClient.invokeAPI("/v1/mdc/rulesets/{rulesetId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Ruleset
     * Retrieve a Ruleset with its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param rulesetId The unique identifier of the Ruleset.
     * @return FullRuleset
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<FullRuleset> getRuleset(UUID rulesetId) throws WebClientResponseException {
        ParameterizedTypeReference<FullRuleset> localVarReturnType = new ParameterizedTypeReference<FullRuleset>() {};
        return getRulesetRequestCreation(rulesetId).bodyToMono(localVarReturnType);
    }

    /**
     * Get Ruleset
     * Retrieve a Ruleset with its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param rulesetId The unique identifier of the Ruleset.
     * @return ResponseEntity&lt;FullRuleset&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<FullRuleset>> getRulesetWithHttpInfo(UUID rulesetId) throws WebClientResponseException {
        ParameterizedTypeReference<FullRuleset> localVarReturnType = new ParameterizedTypeReference<FullRuleset>() {};
        return getRulesetRequestCreation(rulesetId).toEntity(localVarReturnType);
    }

    /**
     * Get Ruleset
     * Retrieve a Ruleset with its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param rulesetId The unique identifier of the Ruleset.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRulesetWithResponseSpec(UUID rulesetId) throws WebClientResponseException {
        return getRulesetRequestCreation(rulesetId);
    }

    /**
     * Retrieve Card Rulesets
     * Get all rulesets assigned to a given card.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @return List&lt;GetRulesetFromCard200ResponseInner&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRulesetFromCardRequestCreation(String cardId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling getRulesetFromCard", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetRulesetFromCard200ResponseInner> localVarReturnType = new ParameterizedTypeReference<GetRulesetFromCard200ResponseInner>() {};
        return apiClient.invokeAPI("/v1/mdc/{cardId}/rulesets", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve Card Rulesets
     * Get all rulesets assigned to a given card.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @return List&lt;GetRulesetFromCard200ResponseInner&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<GetRulesetFromCard200ResponseInner> getRulesetFromCard(String cardId) throws WebClientResponseException {
        ParameterizedTypeReference<GetRulesetFromCard200ResponseInner> localVarReturnType = new ParameterizedTypeReference<GetRulesetFromCard200ResponseInner>() {};
        return getRulesetFromCardRequestCreation(cardId).bodyToFlux(localVarReturnType);
    }

    /**
     * Retrieve Card Rulesets
     * Get all rulesets assigned to a given card.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @return ResponseEntity&lt;List&lt;GetRulesetFromCard200ResponseInner&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<GetRulesetFromCard200ResponseInner>>> getRulesetFromCardWithHttpInfo(String cardId) throws WebClientResponseException {
        ParameterizedTypeReference<GetRulesetFromCard200ResponseInner> localVarReturnType = new ParameterizedTypeReference<GetRulesetFromCard200ResponseInner>() {};
        return getRulesetFromCardRequestCreation(cardId).toEntityList(localVarReturnType);
    }

    /**
     * Retrieve Card Rulesets
     * Get all rulesets assigned to a given card.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRulesetFromCardWithResponseSpec(String cardId) throws WebClientResponseException {
        return getRulesetFromCardRequestCreation(cardId);
    }

    /**
     * Get Rulesets
     * Retrieve all rulesets.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @return GetRulesets200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRulesetsRequestCreation() throws WebClientResponseException {
        Object postBody = null;
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<GetRulesets200Response> localVarReturnType = new ParameterizedTypeReference<GetRulesets200Response>() {};
        return apiClient.invokeAPI("/v1/mdc/rulesets", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Rulesets
     * Retrieve all rulesets.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @return GetRulesets200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetRulesets200Response> getRulesets() throws WebClientResponseException {
        ParameterizedTypeReference<GetRulesets200Response> localVarReturnType = new ParameterizedTypeReference<GetRulesets200Response>() {};
        return getRulesetsRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Get Rulesets
     * Retrieve all rulesets.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @return ResponseEntity&lt;GetRulesets200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetRulesets200Response>> getRulesetsWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<GetRulesets200Response> localVarReturnType = new ParameterizedTypeReference<GetRulesets200Response>() {};
        return getRulesetsRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Get Rulesets
     * Retrieve all rulesets.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRulesetsWithResponseSpec() throws WebClientResponseException {
        return getRulesetsRequestCreation();
    }

    /**
     * Update Ruleset
     * Modify a Ruleset.
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param rulesetId The unique identifier of the Ruleset.
     * @param createRulesetRequest The createRulesetRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putRulesetRequestCreation(UUID rulesetId, CreateRulesetRequest createRulesetRequest) throws WebClientResponseException {
        Object postBody = createRulesetRequest;
        // verify the required parameter 'rulesetId' is set
        if (rulesetId == null) {
            throw new WebClientResponseException("Missing the required parameter 'rulesetId' when calling putRuleset", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'createRulesetRequest' is set
        if (createRulesetRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createRulesetRequest' when calling putRuleset", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("rulesetId", rulesetId);

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
        return apiClient.invokeAPI("/v1/mdc/rulesets/{rulesetId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update Ruleset
     * Modify a Ruleset.
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param rulesetId The unique identifier of the Ruleset.
     * @param createRulesetRequest The createRulesetRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> putRuleset(UUID rulesetId, CreateRulesetRequest createRulesetRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return putRulesetRequestCreation(rulesetId, createRulesetRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update Ruleset
     * Modify a Ruleset.
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param rulesetId The unique identifier of the Ruleset.
     * @param createRulesetRequest The createRulesetRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> putRulesetWithHttpInfo(UUID rulesetId, CreateRulesetRequest createRulesetRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return putRulesetRequestCreation(rulesetId, createRulesetRequest).toEntity(localVarReturnType);
    }

    /**
     * Update Ruleset
     * Modify a Ruleset.
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param rulesetId The unique identifier of the Ruleset.
     * @param createRulesetRequest The createRulesetRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putRulesetWithResponseSpec(UUID rulesetId, CreateRulesetRequest createRulesetRequest) throws WebClientResponseException {
        return putRulesetRequestCreation(rulesetId, createRulesetRequest);
    }
}
