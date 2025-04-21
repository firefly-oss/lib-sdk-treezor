package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.PostKycliveness201Response;
import com.sdk.treezor.model.PostKyclivenessRequest;
import com.sdk.treezor.model.PostKycqes201Response;
import com.sdk.treezor.model.PostKycqesRequest;

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
public class VerificationSolutionsKycApi {
    private ApiClient apiClient;

    public VerificationSolutionsKycApi() {
        this(new ApiClient());
    }

    @Autowired
    public VerificationSolutionsKycApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Initiate Video Conference Verification
     * Start the [Video conference verification](/guide/user-verification/videoconf.html) process. 
     * <p><b>201</b> - Created
     * <p><b>403</b> - Forbidden
     * <p><b>428</b> - Precondition Required.
     * <p><b>500</b> - Internal server error
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the user.
     * @param postKycqesRequest The postKycqesRequest parameter
     * @return PostKycqes201Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postKycVconfRequestCreation(Integer userId, PostKycqesRequest postKycqesRequest) throws WebClientResponseException {
        Object postBody = postKycqesRequest;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new WebClientResponseException("Missing the required parameter 'userId' when calling postKycVconf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("userId", userId);

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

        ParameterizedTypeReference<PostKycqes201Response> localVarReturnType = new ParameterizedTypeReference<PostKycqes201Response>() {};
        return apiClient.invokeAPI("/v1/users/{userId}/videoconference", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Initiate Video Conference Verification
     * Start the [Video conference verification](/guide/user-verification/videoconf.html) process. 
     * <p><b>201</b> - Created
     * <p><b>403</b> - Forbidden
     * <p><b>428</b> - Precondition Required.
     * <p><b>500</b> - Internal server error
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the user.
     * @param postKycqesRequest The postKycqesRequest parameter
     * @return PostKycqes201Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PostKycqes201Response> postKycVconf(Integer userId, PostKycqesRequest postKycqesRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PostKycqes201Response> localVarReturnType = new ParameterizedTypeReference<PostKycqes201Response>() {};
        return postKycVconfRequestCreation(userId, postKycqesRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Initiate Video Conference Verification
     * Start the [Video conference verification](/guide/user-verification/videoconf.html) process. 
     * <p><b>201</b> - Created
     * <p><b>403</b> - Forbidden
     * <p><b>428</b> - Precondition Required.
     * <p><b>500</b> - Internal server error
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the user.
     * @param postKycqesRequest The postKycqesRequest parameter
     * @return ResponseEntity&lt;PostKycqes201Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PostKycqes201Response>> postKycVconfWithHttpInfo(Integer userId, PostKycqesRequest postKycqesRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PostKycqes201Response> localVarReturnType = new ParameterizedTypeReference<PostKycqes201Response>() {};
        return postKycVconfRequestCreation(userId, postKycqesRequest).toEntity(localVarReturnType);
    }

    /**
     * Initiate Video Conference Verification
     * Start the [Video conference verification](/guide/user-verification/videoconf.html) process. 
     * <p><b>201</b> - Created
     * <p><b>403</b> - Forbidden
     * <p><b>428</b> - Precondition Required.
     * <p><b>500</b> - Internal server error
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the user.
     * @param postKycqesRequest The postKycqesRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postKycVconfWithResponseSpec(Integer userId, PostKycqesRequest postKycqesRequest) throws WebClientResponseException {
        return postKycVconfRequestCreation(userId, postKycqesRequest);
    }

    /**
     * Initiate Live Verification
     * Start the Live Verficiation process, whether it is KYC Liveness or Certified Video. You may read [the dedicated documentation for this feature](/guide/user-verification/live-verification.html). 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Request is invalid i.e., missing userId 
     * <p><b>401</b> - The Authorization header is missing
     * <p><b>403</b> - Your agent is not found in our services 
     * <p><b>428</b> - Specified userId is not found in our services 
     * <p><b>500</b> - Internal error
     * <p><b>504</b> - Internal server error: the request did not respond on time 
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the user.
     * @param postKyclivenessRequest The postKyclivenessRequest parameter
     * @return PostKycliveness201Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postKyclivenessRequestCreation(Integer userId, PostKyclivenessRequest postKyclivenessRequest) throws WebClientResponseException {
        Object postBody = postKyclivenessRequest;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new WebClientResponseException("Missing the required parameter 'userId' when calling postKycliveness", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("userId", userId);

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

        ParameterizedTypeReference<PostKycliveness201Response> localVarReturnType = new ParameterizedTypeReference<PostKycliveness201Response>() {};
        return apiClient.invokeAPI("/v1/users/{userId}/kycliveness", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Initiate Live Verification
     * Start the Live Verficiation process, whether it is KYC Liveness or Certified Video. You may read [the dedicated documentation for this feature](/guide/user-verification/live-verification.html). 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Request is invalid i.e., missing userId 
     * <p><b>401</b> - The Authorization header is missing
     * <p><b>403</b> - Your agent is not found in our services 
     * <p><b>428</b> - Specified userId is not found in our services 
     * <p><b>500</b> - Internal error
     * <p><b>504</b> - Internal server error: the request did not respond on time 
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the user.
     * @param postKyclivenessRequest The postKyclivenessRequest parameter
     * @return PostKycliveness201Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PostKycliveness201Response> postKycliveness(Integer userId, PostKyclivenessRequest postKyclivenessRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PostKycliveness201Response> localVarReturnType = new ParameterizedTypeReference<PostKycliveness201Response>() {};
        return postKyclivenessRequestCreation(userId, postKyclivenessRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Initiate Live Verification
     * Start the Live Verficiation process, whether it is KYC Liveness or Certified Video. You may read [the dedicated documentation for this feature](/guide/user-verification/live-verification.html). 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Request is invalid i.e., missing userId 
     * <p><b>401</b> - The Authorization header is missing
     * <p><b>403</b> - Your agent is not found in our services 
     * <p><b>428</b> - Specified userId is not found in our services 
     * <p><b>500</b> - Internal error
     * <p><b>504</b> - Internal server error: the request did not respond on time 
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the user.
     * @param postKyclivenessRequest The postKyclivenessRequest parameter
     * @return ResponseEntity&lt;PostKycliveness201Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PostKycliveness201Response>> postKyclivenessWithHttpInfo(Integer userId, PostKyclivenessRequest postKyclivenessRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PostKycliveness201Response> localVarReturnType = new ParameterizedTypeReference<PostKycliveness201Response>() {};
        return postKyclivenessRequestCreation(userId, postKyclivenessRequest).toEntity(localVarReturnType);
    }

    /**
     * Initiate Live Verification
     * Start the Live Verficiation process, whether it is KYC Liveness or Certified Video. You may read [the dedicated documentation for this feature](/guide/user-verification/live-verification.html). 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Request is invalid i.e., missing userId 
     * <p><b>401</b> - The Authorization header is missing
     * <p><b>403</b> - Your agent is not found in our services 
     * <p><b>428</b> - Specified userId is not found in our services 
     * <p><b>500</b> - Internal error
     * <p><b>504</b> - Internal server error: the request did not respond on time 
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the user.
     * @param postKyclivenessRequest The postKyclivenessRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postKyclivenessWithResponseSpec(Integer userId, PostKyclivenessRequest postKyclivenessRequest) throws WebClientResponseException {
        return postKyclivenessRequestCreation(userId, postKyclivenessRequest);
    }

    /**
     * Initiate QES Verification
     * Start the qualified electronic signature (QES) verification.  
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>410</b> - Gone
     * <p><b>500</b> - Internal server error
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the user.
     * @param postKycqesRequest The postKycqesRequest parameter
     * @return PostKycqes201Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postKycqesRequestCreation(Integer userId, PostKycqesRequest postKycqesRequest) throws WebClientResponseException {
        Object postBody = postKycqesRequest;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new WebClientResponseException("Missing the required parameter 'userId' when calling postKycqes", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("userId", userId);

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

        ParameterizedTypeReference<PostKycqes201Response> localVarReturnType = new ParameterizedTypeReference<PostKycqes201Response>() {};
        return apiClient.invokeAPI("/v1/users/{userId}/qes", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Initiate QES Verification
     * Start the qualified electronic signature (QES) verification.  
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>410</b> - Gone
     * <p><b>500</b> - Internal server error
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the user.
     * @param postKycqesRequest The postKycqesRequest parameter
     * @return PostKycqes201Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PostKycqes201Response> postKycqes(Integer userId, PostKycqesRequest postKycqesRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PostKycqes201Response> localVarReturnType = new ParameterizedTypeReference<PostKycqes201Response>() {};
        return postKycqesRequestCreation(userId, postKycqesRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Initiate QES Verification
     * Start the qualified electronic signature (QES) verification.  
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>410</b> - Gone
     * <p><b>500</b> - Internal server error
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the user.
     * @param postKycqesRequest The postKycqesRequest parameter
     * @return ResponseEntity&lt;PostKycqes201Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PostKycqes201Response>> postKycqesWithHttpInfo(Integer userId, PostKycqesRequest postKycqesRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PostKycqes201Response> localVarReturnType = new ParameterizedTypeReference<PostKycqes201Response>() {};
        return postKycqesRequestCreation(userId, postKycqesRequest).toEntity(localVarReturnType);
    }

    /**
     * Initiate QES Verification
     * Start the qualified electronic signature (QES) verification.  
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>410</b> - Gone
     * <p><b>500</b> - Internal server error
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the user.
     * @param postKycqesRequest The postKycqesRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postKycqesWithResponseSpec(Integer userId, PostKycqesRequest postKycqesRequest) throws WebClientResponseException {
        return postKycqesRequestCreation(userId, postKycqesRequest);
    }

    /**
     * Retrieve and Upload Live Verification Result
     * Retrieve the live verification results, and make them available to Treezor. You may read [the dedicated documentation for this feature](/guide/user-verification/live-verification.html) 
     * <p><b>200</b> - 200 response
     * <p><b>400</b> - The request is incorrect e.g., missing userId 
     * <p><b>401</b> - The Authorization header is missing
     * <p><b>403</b> - Your agent is not found in our services 
     * <p><b>404</b> - The identification is not found in our services 
     * <p><b>405</b> - The documents can not be stored in our services 
     * <p><b>406</b> - The last initiated identification for userId is not in processed state. 
     * <p><b>410</b> - The identification no longer exists
     * <p><b>504</b> - Internal server error: the request did not respond on time 
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the user.
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putKycLivenessRequestCreation(Integer userId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new WebClientResponseException("Missing the required parameter 'userId' when calling putKycLiveness", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("userId", userId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/v1/users/{userId}/kycliveness", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve and Upload Live Verification Result
     * Retrieve the live verification results, and make them available to Treezor. You may read [the dedicated documentation for this feature](/guide/user-verification/live-verification.html) 
     * <p><b>200</b> - 200 response
     * <p><b>400</b> - The request is incorrect e.g., missing userId 
     * <p><b>401</b> - The Authorization header is missing
     * <p><b>403</b> - Your agent is not found in our services 
     * <p><b>404</b> - The identification is not found in our services 
     * <p><b>405</b> - The documents can not be stored in our services 
     * <p><b>406</b> - The last initiated identification for userId is not in processed state. 
     * <p><b>410</b> - The identification no longer exists
     * <p><b>504</b> - Internal server error: the request did not respond on time 
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the user.
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> putKycLiveness(Integer userId) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return putKycLivenessRequestCreation(userId).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve and Upload Live Verification Result
     * Retrieve the live verification results, and make them available to Treezor. You may read [the dedicated documentation for this feature](/guide/user-verification/live-verification.html) 
     * <p><b>200</b> - 200 response
     * <p><b>400</b> - The request is incorrect e.g., missing userId 
     * <p><b>401</b> - The Authorization header is missing
     * <p><b>403</b> - Your agent is not found in our services 
     * <p><b>404</b> - The identification is not found in our services 
     * <p><b>405</b> - The documents can not be stored in our services 
     * <p><b>406</b> - The last initiated identification for userId is not in processed state. 
     * <p><b>410</b> - The identification no longer exists
     * <p><b>504</b> - Internal server error: the request did not respond on time 
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the user.
     * @return ResponseEntity&lt;Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Object>> putKycLivenessWithHttpInfo(Integer userId) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return putKycLivenessRequestCreation(userId).toEntity(localVarReturnType);
    }

    /**
     * Retrieve and Upload Live Verification Result
     * Retrieve the live verification results, and make them available to Treezor. You may read [the dedicated documentation for this feature](/guide/user-verification/live-verification.html) 
     * <p><b>200</b> - 200 response
     * <p><b>400</b> - The request is incorrect e.g., missing userId 
     * <p><b>401</b> - The Authorization header is missing
     * <p><b>403</b> - Your agent is not found in our services 
     * <p><b>404</b> - The identification is not found in our services 
     * <p><b>405</b> - The documents can not be stored in our services 
     * <p><b>406</b> - The last initiated identification for userId is not in processed state. 
     * <p><b>410</b> - The identification no longer exists
     * <p><b>504</b> - Internal server error: the request did not respond on time 
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the user.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putKycLivenessWithResponseSpec(Integer userId) throws WebClientResponseException {
        return putKycLivenessRequestCreation(userId);
    }
}
