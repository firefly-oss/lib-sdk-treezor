package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.CreateSupportUserRequest;
import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.SupportUserObject;
import com.sdk.treezor.model.UpdateSupportUserRequest;

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
public class SupportUsersApi {
    private ApiClient apiClient;

    public SupportUsersApi() {
        this(new ApiClient());
    }

    @Autowired
    public SupportUsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Create Support User
     * Create a new Support User.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param createSupportUserRequest The createSupportUserRequest parameter
     * @return SupportUserObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createSupportUserRequestCreation(CreateSupportUserRequest createSupportUserRequest) throws WebClientResponseException {
        Object postBody = createSupportUserRequest;
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

        ParameterizedTypeReference<SupportUserObject> localVarReturnType = new ParameterizedTypeReference<SupportUserObject>() {};
        return apiClient.invokeAPI("/core-connect/support-user", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Support User
     * Create a new Support User.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param createSupportUserRequest The createSupportUserRequest parameter
     * @return SupportUserObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SupportUserObject> createSupportUser(CreateSupportUserRequest createSupportUserRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SupportUserObject> localVarReturnType = new ParameterizedTypeReference<SupportUserObject>() {};
        return createSupportUserRequestCreation(createSupportUserRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Support User
     * Create a new Support User.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param createSupportUserRequest The createSupportUserRequest parameter
     * @return ResponseEntity&lt;SupportUserObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SupportUserObject>> createSupportUserWithHttpInfo(CreateSupportUserRequest createSupportUserRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SupportUserObject> localVarReturnType = new ParameterizedTypeReference<SupportUserObject>() {};
        return createSupportUserRequestCreation(createSupportUserRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Support User
     * Create a new Support User.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param createSupportUserRequest The createSupportUserRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createSupportUserWithResponseSpec(CreateSupportUserRequest createSupportUserRequest) throws WebClientResponseException {
        return createSupportUserRequestCreation(createSupportUserRequest);
    }

    /**
     * Delete Support User
     * Delete a Support User
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param supportUserId The unique identifier of the Support User.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteSupportUserRequestCreation(String supportUserId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'supportUserId' is set
        if (supportUserId == null) {
            throw new WebClientResponseException("Missing the required parameter 'supportUserId' when calling deleteSupportUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("supportUserId", supportUserId);

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
        return apiClient.invokeAPI("/core-connect/support-user/{supportUserId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete Support User
     * Delete a Support User
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param supportUserId The unique identifier of the Support User.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteSupportUser(String supportUserId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return deleteSupportUserRequestCreation(supportUserId).bodyToMono(localVarReturnType);
    }

    /**
     * Delete Support User
     * Delete a Support User
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param supportUserId The unique identifier of the Support User.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> deleteSupportUserWithHttpInfo(String supportUserId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return deleteSupportUserRequestCreation(supportUserId).toEntity(localVarReturnType);
    }

    /**
     * Delete Support User
     * Delete a Support User
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param supportUserId The unique identifier of the Support User.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteSupportUserWithResponseSpec(String supportUserId) throws WebClientResponseException {
        return deleteSupportUserRequestCreation(supportUserId);
    }

    /**
     * Get Support User
     * Retrieve a Support User based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param supportUserId The unique identifier of the Support User.
     * @return SupportUserObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findOneSupportUserByIdRequestCreation(String supportUserId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'supportUserId' is set
        if (supportUserId == null) {
            throw new WebClientResponseException("Missing the required parameter 'supportUserId' when calling findOneSupportUserById", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("supportUserId", supportUserId);

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

        ParameterizedTypeReference<SupportUserObject> localVarReturnType = new ParameterizedTypeReference<SupportUserObject>() {};
        return apiClient.invokeAPI("/core-connect/support-user/{supportUserId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Support User
     * Retrieve a Support User based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param supportUserId The unique identifier of the Support User.
     * @return SupportUserObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SupportUserObject> findOneSupportUserById(String supportUserId) throws WebClientResponseException {
        ParameterizedTypeReference<SupportUserObject> localVarReturnType = new ParameterizedTypeReference<SupportUserObject>() {};
        return findOneSupportUserByIdRequestCreation(supportUserId).bodyToMono(localVarReturnType);
    }

    /**
     * Get Support User
     * Retrieve a Support User based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param supportUserId The unique identifier of the Support User.
     * @return ResponseEntity&lt;SupportUserObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SupportUserObject>> findOneSupportUserByIdWithHttpInfo(String supportUserId) throws WebClientResponseException {
        ParameterizedTypeReference<SupportUserObject> localVarReturnType = new ParameterizedTypeReference<SupportUserObject>() {};
        return findOneSupportUserByIdRequestCreation(supportUserId).toEntity(localVarReturnType);
    }

    /**
     * Get Support User
     * Retrieve a Support User based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param supportUserId The unique identifier of the Support User.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findOneSupportUserByIdWithResponseSpec(String supportUserId) throws WebClientResponseException {
        return findOneSupportUserByIdRequestCreation(supportUserId);
    }

    /**
     * Get all Support Users
     * Retrieve all the Support Users.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @return List&lt;SupportUserObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getAllSupportUserRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<SupportUserObject> localVarReturnType = new ParameterizedTypeReference<SupportUserObject>() {};
        return apiClient.invokeAPI("/core-connect/support-user", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all Support Users
     * Retrieve all the Support Users.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @return List&lt;SupportUserObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<SupportUserObject> getAllSupportUser() throws WebClientResponseException {
        ParameterizedTypeReference<SupportUserObject> localVarReturnType = new ParameterizedTypeReference<SupportUserObject>() {};
        return getAllSupportUserRequestCreation().bodyToFlux(localVarReturnType);
    }

    /**
     * Get all Support Users
     * Retrieve all the Support Users.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @return ResponseEntity&lt;List&lt;SupportUserObject&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<SupportUserObject>>> getAllSupportUserWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<SupportUserObject> localVarReturnType = new ParameterizedTypeReference<SupportUserObject>() {};
        return getAllSupportUserRequestCreation().toEntityList(localVarReturnType);
    }

    /**
     * Get all Support Users
     * Retrieve all the Support Users.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getAllSupportUserWithResponseSpec() throws WebClientResponseException {
        return getAllSupportUserRequestCreation();
    }

    /**
     * Unblock Support User
     * Unblock a Support User. Support Users may be blocked if they failed to login 3 times in a row.
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param supportUserId The unique identifier of the Support User.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec unblockSupportUserRequestCreation(String supportUserId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'supportUserId' is set
        if (supportUserId == null) {
            throw new WebClientResponseException("Missing the required parameter 'supportUserId' when calling unblockSupportUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("supportUserId", supportUserId);

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
        return apiClient.invokeAPI("/core-connect/support-user/{supportUserId}/unblock", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Unblock Support User
     * Unblock a Support User. Support Users may be blocked if they failed to login 3 times in a row.
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param supportUserId The unique identifier of the Support User.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> unblockSupportUser(String supportUserId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return unblockSupportUserRequestCreation(supportUserId).bodyToMono(localVarReturnType);
    }

    /**
     * Unblock Support User
     * Unblock a Support User. Support Users may be blocked if they failed to login 3 times in a row.
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param supportUserId The unique identifier of the Support User.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> unblockSupportUserWithHttpInfo(String supportUserId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return unblockSupportUserRequestCreation(supportUserId).toEntity(localVarReturnType);
    }

    /**
     * Unblock Support User
     * Unblock a Support User. Support Users may be blocked if they failed to login 3 times in a row.
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param supportUserId The unique identifier of the Support User.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec unblockSupportUserWithResponseSpec(String supportUserId) throws WebClientResponseException {
        return unblockSupportUserRequestCreation(supportUserId);
    }

    /**
     * Update Support User
     * Modify a Support User information.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param supportUserId The unique identifier of the Support User.
     * @param updateSupportUserRequest The updateSupportUserRequest parameter
     * @return SupportUserObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateSupportUserRequestCreation(String supportUserId, UpdateSupportUserRequest updateSupportUserRequest) throws WebClientResponseException {
        Object postBody = updateSupportUserRequest;
        // verify the required parameter 'supportUserId' is set
        if (supportUserId == null) {
            throw new WebClientResponseException("Missing the required parameter 'supportUserId' when calling updateSupportUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("supportUserId", supportUserId);

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

        ParameterizedTypeReference<SupportUserObject> localVarReturnType = new ParameterizedTypeReference<SupportUserObject>() {};
        return apiClient.invokeAPI("/core-connect/support-user/{supportUserId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update Support User
     * Modify a Support User information.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param supportUserId The unique identifier of the Support User.
     * @param updateSupportUserRequest The updateSupportUserRequest parameter
     * @return SupportUserObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SupportUserObject> updateSupportUser(String supportUserId, UpdateSupportUserRequest updateSupportUserRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SupportUserObject> localVarReturnType = new ParameterizedTypeReference<SupportUserObject>() {};
        return updateSupportUserRequestCreation(supportUserId, updateSupportUserRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update Support User
     * Modify a Support User information.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param supportUserId The unique identifier of the Support User.
     * @param updateSupportUserRequest The updateSupportUserRequest parameter
     * @return ResponseEntity&lt;SupportUserObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SupportUserObject>> updateSupportUserWithHttpInfo(String supportUserId, UpdateSupportUserRequest updateSupportUserRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SupportUserObject> localVarReturnType = new ParameterizedTypeReference<SupportUserObject>() {};
        return updateSupportUserRequestCreation(supportUserId, updateSupportUserRequest).toEntity(localVarReturnType);
    }

    /**
     * Update Support User
     * Modify a Support User information.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param supportUserId The unique identifier of the Support User.
     * @param updateSupportUserRequest The updateSupportUserRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateSupportUserWithResponseSpec(String supportUserId, UpdateSupportUserRequest updateSupportUserRequest) throws WebClientResponseException {
        return updateSupportUserRequestCreation(supportUserId, updateSupportUserRequest);
    }
}
