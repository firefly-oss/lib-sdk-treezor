package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import java.time.OffsetDateTime;
import com.sdk.treezor.model.PostUsersRequest;
import com.sdk.treezor.model.PutUserRequest;
import com.sdk.treezor.model.UserObject;

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
public class UsersApi {
    private ApiClient apiClient;

    public UsersApi() {
        this(new ApiClient());
    }

    @Autowired
    public UsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Disable User
     * Update the user Status to &#x60;CANCELED&#x60;. See the [Deletion](/guide/users/modifications.html#deletion) article for more information. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @param origin The origin of the request for cancelling the User, which can be one of the following:  * &#x60;OPERATOR&#x60; – When you are at the origin of the deactivation. * &#x60;USER&#x60; – When the end user is at the origin of the deactivation. 
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @return UserObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteUserRequestCreation(Integer userId, String origin, String accessTag) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new WebClientResponseException("Missing the required parameter 'userId' when calling deleteUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'origin' is set
        if (origin == null) {
            throw new WebClientResponseException("Missing the required parameter 'origin' when calling deleteUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("userId", userId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "origin", origin));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<UserObject> localVarReturnType = new ParameterizedTypeReference<UserObject>() {};
        return apiClient.invokeAPI("/v1/users/{userId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Disable User
     * Update the user Status to &#x60;CANCELED&#x60;. See the [Deletion](/guide/users/modifications.html#deletion) article for more information. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @param origin The origin of the request for cancelling the User, which can be one of the following:  * &#x60;OPERATOR&#x60; – When you are at the origin of the deactivation. * &#x60;USER&#x60; – When the end user is at the origin of the deactivation. 
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @return UserObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UserObject> deleteUser(Integer userId, String origin, String accessTag) throws WebClientResponseException {
        ParameterizedTypeReference<UserObject> localVarReturnType = new ParameterizedTypeReference<UserObject>() {};
        return deleteUserRequestCreation(userId, origin, accessTag).bodyToMono(localVarReturnType);
    }

    /**
     * Disable User
     * Update the user Status to &#x60;CANCELED&#x60;. See the [Deletion](/guide/users/modifications.html#deletion) article for more information. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @param origin The origin of the request for cancelling the User, which can be one of the following:  * &#x60;OPERATOR&#x60; – When you are at the origin of the deactivation. * &#x60;USER&#x60; – When the end user is at the origin of the deactivation. 
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @return ResponseEntity&lt;UserObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<UserObject>> deleteUserWithHttpInfo(Integer userId, String origin, String accessTag) throws WebClientResponseException {
        ParameterizedTypeReference<UserObject> localVarReturnType = new ParameterizedTypeReference<UserObject>() {};
        return deleteUserRequestCreation(userId, origin, accessTag).toEntity(localVarReturnType);
    }

    /**
     * Disable User
     * Update the user Status to &#x60;CANCELED&#x60;. See the [Deletion](/guide/users/modifications.html#deletion) article for more information. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @param origin The origin of the request for cancelling the User, which can be one of the following:  * &#x60;OPERATOR&#x60; – When you are at the origin of the deactivation. * &#x60;USER&#x60; – When the end user is at the origin of the deactivation. 
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteUserWithResponseSpec(Integer userId, String origin, String accessTag) throws WebClientResponseException {
        return deleteUserRequestCreation(userId, origin, accessTag);
    }

    /**
     * Get User
     * Retrieve user&#39;s information for given user&#39;s &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @return UserObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getUserRequestCreation(Integer userId, String accessTag) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new WebClientResponseException("Missing the required parameter 'userId' when calling getUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("userId", userId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<UserObject> localVarReturnType = new ParameterizedTypeReference<UserObject>() {};
        return apiClient.invokeAPI("/v1/users/{userId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get User
     * Retrieve user&#39;s information for given user&#39;s &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @return UserObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UserObject> getUser(Integer userId, String accessTag) throws WebClientResponseException {
        ParameterizedTypeReference<UserObject> localVarReturnType = new ParameterizedTypeReference<UserObject>() {};
        return getUserRequestCreation(userId, accessTag).bodyToMono(localVarReturnType);
    }

    /**
     * Get User
     * Retrieve user&#39;s information for given user&#39;s &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @return ResponseEntity&lt;UserObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<UserObject>> getUserWithHttpInfo(Integer userId, String accessTag) throws WebClientResponseException {
        ParameterizedTypeReference<UserObject> localVarReturnType = new ParameterizedTypeReference<UserObject>() {};
        return getUserRequestCreation(userId, accessTag).toEntity(localVarReturnType);
    }

    /**
     * Get User
     * Retrieve user&#39;s information for given user&#39;s &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getUserWithResponseSpec(Integer userId, String accessTag) throws WebClientResponseException {
        return getUserRequestCreation(userId, accessTag);
    }

    /**
     * Search Users
     * Retrieve Users matching your search criteria.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param userId The unique identifier of the User.
     * @param userTypeId The type of the user.
     * @param userStatus The status of the user.
     * @param userTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Max length: 250 characters.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param specifiedUSPerson You may read more about who is considered a US Person in the [dedicated article](/guide/user-verification/tax-residence.html#the-specific-case-of-us-taxpayers). 
     * @param controllingPersonType Type of relationship
     * @param employeeType Type of user&#39;s role
     * @param email User&#39;s email address (must be valid).
     * @param name Name of the user.
     * @param legalName Business name
     * @param parentUserId Unique identifier of the parent of the user.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @return UserObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getUsersRequestCreation(String accessTag, Integer userId, Integer userTypeId, String userStatus, String userTag, Integer specifiedUSPerson, Integer controllingPersonType, Integer employeeType, String email, String name, String legalName, String parentUserId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userTypeId", userTypeId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userStatus", userStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userTag", userTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "specifiedUSPerson", specifiedUSPerson));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "controllingPersonType", controllingPersonType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "employeeType", employeeType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "email", email));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "legalName", legalName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "parentUserId", parentUserId));
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

        ParameterizedTypeReference<UserObject> localVarReturnType = new ParameterizedTypeReference<UserObject>() {};
        return apiClient.invokeAPI("/v1/users", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search Users
     * Retrieve Users matching your search criteria.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param userId The unique identifier of the User.
     * @param userTypeId The type of the user.
     * @param userStatus The status of the user.
     * @param userTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Max length: 250 characters.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param specifiedUSPerson You may read more about who is considered a US Person in the [dedicated article](/guide/user-verification/tax-residence.html#the-specific-case-of-us-taxpayers). 
     * @param controllingPersonType Type of relationship
     * @param employeeType Type of user&#39;s role
     * @param email User&#39;s email address (must be valid).
     * @param name Name of the user.
     * @param legalName Business name
     * @param parentUserId Unique identifier of the parent of the user.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @return UserObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UserObject> getUsers(String accessTag, Integer userId, Integer userTypeId, String userStatus, String userTag, Integer specifiedUSPerson, Integer controllingPersonType, Integer employeeType, String email, String name, String legalName, String parentUserId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        ParameterizedTypeReference<UserObject> localVarReturnType = new ParameterizedTypeReference<UserObject>() {};
        return getUsersRequestCreation(accessTag, userId, userTypeId, userStatus, userTag, specifiedUSPerson, controllingPersonType, employeeType, email, name, legalName, parentUserId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo).bodyToMono(localVarReturnType);
    }

    /**
     * Search Users
     * Retrieve Users matching your search criteria.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param userId The unique identifier of the User.
     * @param userTypeId The type of the user.
     * @param userStatus The status of the user.
     * @param userTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Max length: 250 characters.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param specifiedUSPerson You may read more about who is considered a US Person in the [dedicated article](/guide/user-verification/tax-residence.html#the-specific-case-of-us-taxpayers). 
     * @param controllingPersonType Type of relationship
     * @param employeeType Type of user&#39;s role
     * @param email User&#39;s email address (must be valid).
     * @param name Name of the user.
     * @param legalName Business name
     * @param parentUserId Unique identifier of the parent of the user.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @return ResponseEntity&lt;UserObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<UserObject>> getUsersWithHttpInfo(String accessTag, Integer userId, Integer userTypeId, String userStatus, String userTag, Integer specifiedUSPerson, Integer controllingPersonType, Integer employeeType, String email, String name, String legalName, String parentUserId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        ParameterizedTypeReference<UserObject> localVarReturnType = new ParameterizedTypeReference<UserObject>() {};
        return getUsersRequestCreation(accessTag, userId, userTypeId, userStatus, userTag, specifiedUSPerson, controllingPersonType, employeeType, email, name, legalName, parentUserId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo).toEntity(localVarReturnType);
    }

    /**
     * Search Users
     * Retrieve Users matching your search criteria.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param userId The unique identifier of the User.
     * @param userTypeId The type of the user.
     * @param userStatus The status of the user.
     * @param userTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Max length: 250 characters.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param specifiedUSPerson You may read more about who is considered a US Person in the [dedicated article](/guide/user-verification/tax-residence.html#the-specific-case-of-us-taxpayers). 
     * @param controllingPersonType Type of relationship
     * @param employeeType Type of user&#39;s role
     * @param email User&#39;s email address (must be valid).
     * @param name Name of the user.
     * @param legalName Business name
     * @param parentUserId Unique identifier of the parent of the user.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60; 
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getUsersWithResponseSpec(String accessTag, Integer userId, Integer userTypeId, String userStatus, String userTag, Integer specifiedUSPerson, Integer controllingPersonType, Integer employeeType, String email, String name, String legalName, String parentUserId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        return getUsersRequestCreation(accessTag, userId, userTypeId, userStatus, userTag, specifiedUSPerson, controllingPersonType, employeeType, email, name, legalName, parentUserId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
    }

    /**
     * Create User
     * You may read [the dedicated documentation for this feature](/guide/users/introduction.html#creation) 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postUsersRequest The postUsersRequest parameter
     * @return UserObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postUsersRequestCreation(PostUsersRequest postUsersRequest) throws WebClientResponseException {
        Object postBody = postUsersRequest;
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

        ParameterizedTypeReference<UserObject> localVarReturnType = new ParameterizedTypeReference<UserObject>() {};
        return apiClient.invokeAPI("/v1/users", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create User
     * You may read [the dedicated documentation for this feature](/guide/users/introduction.html#creation) 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postUsersRequest The postUsersRequest parameter
     * @return UserObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UserObject> postUsers(PostUsersRequest postUsersRequest) throws WebClientResponseException {
        ParameterizedTypeReference<UserObject> localVarReturnType = new ParameterizedTypeReference<UserObject>() {};
        return postUsersRequestCreation(postUsersRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create User
     * You may read [the dedicated documentation for this feature](/guide/users/introduction.html#creation) 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postUsersRequest The postUsersRequest parameter
     * @return ResponseEntity&lt;UserObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<UserObject>> postUsersWithHttpInfo(PostUsersRequest postUsersRequest) throws WebClientResponseException {
        ParameterizedTypeReference<UserObject> localVarReturnType = new ParameterizedTypeReference<UserObject>() {};
        return postUsersRequestCreation(postUsersRequest).toEntity(localVarReturnType);
    }

    /**
     * Create User
     * You may read [the dedicated documentation for this feature](/guide/users/introduction.html#creation) 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postUsersRequest The postUsersRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postUsersWithResponseSpec(PostUsersRequest postUsersRequest) throws WebClientResponseException {
        return postUsersRequestCreation(postUsersRequest);
    }

    /**
     * Update User
     * Update information regarding the User.  This endpoint may require per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @param putUserRequest The putUserRequest parameter
     * @return UserObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putUserRequestCreation(Integer userId, PutUserRequest putUserRequest) throws WebClientResponseException {
        Object postBody = putUserRequest;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new WebClientResponseException("Missing the required parameter 'userId' when calling putUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("userId", userId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "applicationcjson", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<UserObject> localVarReturnType = new ParameterizedTypeReference<UserObject>() {};
        return apiClient.invokeAPI("/v1/users/{userId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update User
     * Update information regarding the User.  This endpoint may require per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @param putUserRequest The putUserRequest parameter
     * @return UserObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UserObject> putUser(Integer userId, PutUserRequest putUserRequest) throws WebClientResponseException {
        ParameterizedTypeReference<UserObject> localVarReturnType = new ParameterizedTypeReference<UserObject>() {};
        return putUserRequestCreation(userId, putUserRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update User
     * Update information regarding the User.  This endpoint may require per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @param putUserRequest The putUserRequest parameter
     * @return ResponseEntity&lt;UserObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<UserObject>> putUserWithHttpInfo(Integer userId, PutUserRequest putUserRequest) throws WebClientResponseException {
        ParameterizedTypeReference<UserObject> localVarReturnType = new ParameterizedTypeReference<UserObject>() {};
        return putUserRequestCreation(userId, putUserRequest).toEntity(localVarReturnType);
    }

    /**
     * Update User
     * Update information regarding the User.  This endpoint may require per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @param putUserRequest The putUserRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putUserWithResponseSpec(Integer userId, PutUserRequest putUserRequest) throws WebClientResponseException {
        return putUserRequestCreation(userId, putUserRequest);
    }
}
