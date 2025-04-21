package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.GetAuthMethods200Response;
import com.sdk.treezor.model.PostAuthMethodsRequest;

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
public class Card3DSecureEnrollmentScaApi {
    private ApiClient apiClient;

    public Card3DSecureEnrollmentScaApi() {
        this(new ApiClient());
    }

    @Autowired
    public Card3DSecureEnrollmentScaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Delete Authentication Method
     * Delete the authentication method of a Card. Only available for OOB method.
     * <p><b>204</b> - The auth method has been removed
     * <p><b>400</b> - Unknown card ID
     * <p><b>404</b> - Auth method not found
     * <p><b>500</b> - Internal server error
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param methodId The unique identifier of the authentication method.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteAuthMethodsRequestCreation(String cardId, String methodId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling deleteAuthMethods", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'methodId' is set
        if (methodId == null) {
            throw new WebClientResponseException("Missing the required parameter 'methodId' when calling deleteAuthMethods", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("cardId", cardId);
        pathParams.put("methodId", methodId);

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
        return apiClient.invokeAPI("/v1/cards/{cardId}/authentication-methods/{methodId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete Authentication Method
     * Delete the authentication method of a Card. Only available for OOB method.
     * <p><b>204</b> - The auth method has been removed
     * <p><b>400</b> - Unknown card ID
     * <p><b>404</b> - Auth method not found
     * <p><b>500</b> - Internal server error
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param methodId The unique identifier of the authentication method.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteAuthMethods(String cardId, String methodId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return deleteAuthMethodsRequestCreation(cardId, methodId).bodyToMono(localVarReturnType);
    }

    /**
     * Delete Authentication Method
     * Delete the authentication method of a Card. Only available for OOB method.
     * <p><b>204</b> - The auth method has been removed
     * <p><b>400</b> - Unknown card ID
     * <p><b>404</b> - Auth method not found
     * <p><b>500</b> - Internal server error
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param methodId The unique identifier of the authentication method.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> deleteAuthMethodsWithHttpInfo(String cardId, String methodId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return deleteAuthMethodsRequestCreation(cardId, methodId).toEntity(localVarReturnType);
    }

    /**
     * Delete Authentication Method
     * Delete the authentication method of a Card. Only available for OOB method.
     * <p><b>204</b> - The auth method has been removed
     * <p><b>400</b> - Unknown card ID
     * <p><b>404</b> - Auth method not found
     * <p><b>500</b> - Internal server error
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param methodId The unique identifier of the authentication method.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteAuthMethodsWithResponseSpec(String cardId, String methodId) throws WebClientResponseException {
        return deleteAuthMethodsRequestCreation(cardId, methodId);
    }

    /**
     * Get Authentication Methods
     * Retrieve the authentication methods of a Card. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @return GetAuthMethods200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getAuthMethodsRequestCreation(String cardId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling getAuthMethods", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetAuthMethods200Response> localVarReturnType = new ParameterizedTypeReference<GetAuthMethods200Response>() {};
        return apiClient.invokeAPI("/v1/cards/{cardId}/authentication-methods", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Authentication Methods
     * Retrieve the authentication methods of a Card. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @return GetAuthMethods200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetAuthMethods200Response> getAuthMethods(String cardId) throws WebClientResponseException {
        ParameterizedTypeReference<GetAuthMethods200Response> localVarReturnType = new ParameterizedTypeReference<GetAuthMethods200Response>() {};
        return getAuthMethodsRequestCreation(cardId).bodyToMono(localVarReturnType);
    }

    /**
     * Get Authentication Methods
     * Retrieve the authentication methods of a Card. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @return ResponseEntity&lt;GetAuthMethods200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetAuthMethods200Response>> getAuthMethodsWithHttpInfo(String cardId) throws WebClientResponseException {
        ParameterizedTypeReference<GetAuthMethods200Response> localVarReturnType = new ParameterizedTypeReference<GetAuthMethods200Response>() {};
        return getAuthMethodsRequestCreation(cardId).toEntity(localVarReturnType);
    }

    /**
     * Get Authentication Methods
     * Retrieve the authentication methods of a Card. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getAuthMethodsWithResponseSpec(String cardId) throws WebClientResponseException {
        return getAuthMethodsRequestCreation(cardId);
    }

    /**
     * Get Authentication Method
     * Retrieve details regarding the authentication method of a Card.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Unknown card ID
     * <p><b>404</b> - Auth method not found
     * <p><b>500</b> - Internal server error
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param methodId The unique identifier of the authentication method.
     * @return GetAuthMethods200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getAuthMethodsDetailsRequestCreation(String cardId, String methodId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling getAuthMethodsDetails", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'methodId' is set
        if (methodId == null) {
            throw new WebClientResponseException("Missing the required parameter 'methodId' when calling getAuthMethodsDetails", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("cardId", cardId);
        pathParams.put("methodId", methodId);

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

        ParameterizedTypeReference<GetAuthMethods200Response> localVarReturnType = new ParameterizedTypeReference<GetAuthMethods200Response>() {};
        return apiClient.invokeAPI("/v1/cards/{cardId}/authentication-methods/{methodId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Authentication Method
     * Retrieve details regarding the authentication method of a Card.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Unknown card ID
     * <p><b>404</b> - Auth method not found
     * <p><b>500</b> - Internal server error
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param methodId The unique identifier of the authentication method.
     * @return GetAuthMethods200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetAuthMethods200Response> getAuthMethodsDetails(String cardId, String methodId) throws WebClientResponseException {
        ParameterizedTypeReference<GetAuthMethods200Response> localVarReturnType = new ParameterizedTypeReference<GetAuthMethods200Response>() {};
        return getAuthMethodsDetailsRequestCreation(cardId, methodId).bodyToMono(localVarReturnType);
    }

    /**
     * Get Authentication Method
     * Retrieve details regarding the authentication method of a Card.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Unknown card ID
     * <p><b>404</b> - Auth method not found
     * <p><b>500</b> - Internal server error
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param methodId The unique identifier of the authentication method.
     * @return ResponseEntity&lt;GetAuthMethods200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetAuthMethods200Response>> getAuthMethodsDetailsWithHttpInfo(String cardId, String methodId) throws WebClientResponseException {
        ParameterizedTypeReference<GetAuthMethods200Response> localVarReturnType = new ParameterizedTypeReference<GetAuthMethods200Response>() {};
        return getAuthMethodsDetailsRequestCreation(cardId, methodId).toEntity(localVarReturnType);
    }

    /**
     * Get Authentication Method
     * Retrieve details regarding the authentication method of a Card.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Unknown card ID
     * <p><b>404</b> - Auth method not found
     * <p><b>500</b> - Internal server error
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param methodId The unique identifier of the authentication method.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getAuthMethodsDetailsWithResponseSpec(String cardId, String methodId) throws WebClientResponseException {
        return getAuthMethodsDetailsRequestCreation(cardId, methodId);
    }

    /**
     * Create Authenticaton Methods
     * Define the authentication method of a Card. 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param postAuthMethodsRequest The postAuthMethodsRequest parameter
     * @return GetAuthMethods200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postAuthMethodsRequestCreation(String cardId, PostAuthMethodsRequest postAuthMethodsRequest) throws WebClientResponseException {
        Object postBody = postAuthMethodsRequest;
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new WebClientResponseException("Missing the required parameter 'cardId' when calling postAuthMethods", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetAuthMethods200Response> localVarReturnType = new ParameterizedTypeReference<GetAuthMethods200Response>() {};
        return apiClient.invokeAPI("/v1/cards/{cardId}/authentication-methods", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Authenticaton Methods
     * Define the authentication method of a Card. 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param postAuthMethodsRequest The postAuthMethodsRequest parameter
     * @return GetAuthMethods200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetAuthMethods200Response> postAuthMethods(String cardId, PostAuthMethodsRequest postAuthMethodsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<GetAuthMethods200Response> localVarReturnType = new ParameterizedTypeReference<GetAuthMethods200Response>() {};
        return postAuthMethodsRequestCreation(cardId, postAuthMethodsRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Authenticaton Methods
     * Define the authentication method of a Card. 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param postAuthMethodsRequest The postAuthMethodsRequest parameter
     * @return ResponseEntity&lt;GetAuthMethods200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetAuthMethods200Response>> postAuthMethodsWithHttpInfo(String cardId, PostAuthMethodsRequest postAuthMethodsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<GetAuthMethods200Response> localVarReturnType = new ParameterizedTypeReference<GetAuthMethods200Response>() {};
        return postAuthMethodsRequestCreation(cardId, postAuthMethodsRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Authenticaton Methods
     * Define the authentication method of a Card. 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param cardId The unique identifier of the Card.
     * @param postAuthMethodsRequest The postAuthMethodsRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postAuthMethodsWithResponseSpec(String cardId, PostAuthMethodsRequest postAuthMethodsRequest) throws WebClientResponseException {
        return postAuthMethodsRequestCreation(cardId, postAuthMethodsRequest);
    }
}
