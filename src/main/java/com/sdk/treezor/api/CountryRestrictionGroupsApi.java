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
import com.sdk.treezor.model.GetCountryRestrictionGroups200Response;
import com.sdk.treezor.model.PostCountryRestrictionGroup200Response;
import com.sdk.treezor.model.PostCountryRestrictionGroupRequest;
import com.sdk.treezor.model.PutCountryRestrictionGroups200Response;
import com.sdk.treezor.model.PutCountryRestrictionGroupsRequest;

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
public class CountryRestrictionGroupsApi {
    private ApiClient apiClient;

    public CountryRestrictionGroupsApi() {
        this(new ApiClient());
    }

    @Autowired
    public CountryRestrictionGroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Cancel Country Restriction Group
     * Cancel a country restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Country Group.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return PostCountryRestrictionGroup200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteCountryRestrictionGroupsRequestCreation(UUID id, List<String> fields) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteCountryRestrictionGroups", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<PostCountryRestrictionGroup200Response> localVarReturnType = new ParameterizedTypeReference<PostCountryRestrictionGroup200Response>() {};
        return apiClient.invokeAPI("/v1/countryRestrictionGroups/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Cancel Country Restriction Group
     * Cancel a country restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Country Group.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return PostCountryRestrictionGroup200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PostCountryRestrictionGroup200Response> deleteCountryRestrictionGroups(UUID id, List<String> fields) throws WebClientResponseException {
        ParameterizedTypeReference<PostCountryRestrictionGroup200Response> localVarReturnType = new ParameterizedTypeReference<PostCountryRestrictionGroup200Response>() {};
        return deleteCountryRestrictionGroupsRequestCreation(id, fields).bodyToMono(localVarReturnType);
    }

    /**
     * Cancel Country Restriction Group
     * Cancel a country restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Country Group.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return ResponseEntity&lt;PostCountryRestrictionGroup200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PostCountryRestrictionGroup200Response>> deleteCountryRestrictionGroupsWithHttpInfo(UUID id, List<String> fields) throws WebClientResponseException {
        ParameterizedTypeReference<PostCountryRestrictionGroup200Response> localVarReturnType = new ParameterizedTypeReference<PostCountryRestrictionGroup200Response>() {};
        return deleteCountryRestrictionGroupsRequestCreation(id, fields).toEntity(localVarReturnType);
    }

    /**
     * Cancel Country Restriction Group
     * Cancel a country restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Country Group.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteCountryRestrictionGroupsWithResponseSpec(UUID id, List<String> fields) throws WebClientResponseException {
        return deleteCountryRestrictionGroupsRequestCreation(id, fields);
    }

    /**
     * Search Country Restriction Groups
     * Retrieve country restriction groups that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @param filter You can filter the API response by using filter(s). Filterable fields are:   - id   - name   - isWhitelist   - status   - startDate   - createdDate  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax: \&quot;fieldName criterion expression\&quot;, where:   - fieldName: the name of a filterable field of this object.   - expression: the values to be included or excluded (see the table below for more information)   - criterion: a filter criterion.  Here are the possible values for criterion:  | Criteria |         Description    |                   Type                   | Expression Example | |----------|------------------------|------------------------------------------|--------------------| |     &gt;    |      greater than      |            alphanumeric string           |         100        | |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        | |     &lt;    |        less than       |            alphanumeric string           |         100        | |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        | |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        | |   like   |          like          |            alphanumeric string           |         100        | |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     | |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        | 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. 
     * @return GetCountryRestrictionGroups200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCountryRestrictionGroupsRequestCreation(String accessTag, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter", filter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageCount", pageCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortBy", sortBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortOrder", sortOrder));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<GetCountryRestrictionGroups200Response> localVarReturnType = new ParameterizedTypeReference<GetCountryRestrictionGroups200Response>() {};
        return apiClient.invokeAPI("/v1/countryRestrictionGroups", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search Country Restriction Groups
     * Retrieve country restriction groups that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @param filter You can filter the API response by using filter(s). Filterable fields are:   - id   - name   - isWhitelist   - status   - startDate   - createdDate  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax: \&quot;fieldName criterion expression\&quot;, where:   - fieldName: the name of a filterable field of this object.   - expression: the values to be included or excluded (see the table below for more information)   - criterion: a filter criterion.  Here are the possible values for criterion:  | Criteria |         Description    |                   Type                   | Expression Example | |----------|------------------------|------------------------------------------|--------------------| |     &gt;    |      greater than      |            alphanumeric string           |         100        | |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        | |     &lt;    |        less than       |            alphanumeric string           |         100        | |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        | |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        | |   like   |          like          |            alphanumeric string           |         100        | |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     | |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        | 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. 
     * @return GetCountryRestrictionGroups200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetCountryRestrictionGroups200Response> getCountryRestrictionGroups(String accessTag, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
        ParameterizedTypeReference<GetCountryRestrictionGroups200Response> localVarReturnType = new ParameterizedTypeReference<GetCountryRestrictionGroups200Response>() {};
        return getCountryRestrictionGroupsRequestCreation(accessTag, fields, filter, pageNumber, pageCount, sortBy, sortOrder).bodyToMono(localVarReturnType);
    }

    /**
     * Search Country Restriction Groups
     * Retrieve country restriction groups that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @param filter You can filter the API response by using filter(s). Filterable fields are:   - id   - name   - isWhitelist   - status   - startDate   - createdDate  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax: \&quot;fieldName criterion expression\&quot;, where:   - fieldName: the name of a filterable field of this object.   - expression: the values to be included or excluded (see the table below for more information)   - criterion: a filter criterion.  Here are the possible values for criterion:  | Criteria |         Description    |                   Type                   | Expression Example | |----------|------------------------|------------------------------------------|--------------------| |     &gt;    |      greater than      |            alphanumeric string           |         100        | |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        | |     &lt;    |        less than       |            alphanumeric string           |         100        | |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        | |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        | |   like   |          like          |            alphanumeric string           |         100        | |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     | |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        | 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. 
     * @return ResponseEntity&lt;GetCountryRestrictionGroups200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetCountryRestrictionGroups200Response>> getCountryRestrictionGroupsWithHttpInfo(String accessTag, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
        ParameterizedTypeReference<GetCountryRestrictionGroups200Response> localVarReturnType = new ParameterizedTypeReference<GetCountryRestrictionGroups200Response>() {};
        return getCountryRestrictionGroupsRequestCreation(accessTag, fields, filter, pageNumber, pageCount, sortBy, sortOrder).toEntity(localVarReturnType);
    }

    /**
     * Search Country Restriction Groups
     * Retrieve country restriction groups that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @param filter You can filter the API response by using filter(s). Filterable fields are:   - id   - name   - isWhitelist   - status   - startDate   - createdDate  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax: \&quot;fieldName criterion expression\&quot;, where:   - fieldName: the name of a filterable field of this object.   - expression: the values to be included or excluded (see the table below for more information)   - criterion: a filter criterion.  Here are the possible values for criterion:  | Criteria |         Description    |                   Type                   | Expression Example | |----------|------------------------|------------------------------------------|--------------------| |     &gt;    |      greater than      |            alphanumeric string           |         100        | |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        | |     &lt;    |        less than       |            alphanumeric string           |         100        | |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        | |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        | |   like   |          like          |            alphanumeric string           |         100        | |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     | |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        | 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCountryRestrictionGroupsWithResponseSpec(String accessTag, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
        return getCountryRestrictionGroupsRequestCreation(accessTag, fields, filter, pageNumber, pageCount, sortBy, sortOrder);
    }

    /**
     * Get Country Restriction Group
     * Retrive a Country Restriction Group based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Country Group.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return PostCountryRestrictionGroup200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCountryRestrictionGroupsIdRequestCreation(UUID id, List<String> fields) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getCountryRestrictionGroupsId", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<PostCountryRestrictionGroup200Response> localVarReturnType = new ParameterizedTypeReference<PostCountryRestrictionGroup200Response>() {};
        return apiClient.invokeAPI("/v1/countryRestrictionGroups/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Country Restriction Group
     * Retrive a Country Restriction Group based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Country Group.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return PostCountryRestrictionGroup200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PostCountryRestrictionGroup200Response> getCountryRestrictionGroupsId(UUID id, List<String> fields) throws WebClientResponseException {
        ParameterizedTypeReference<PostCountryRestrictionGroup200Response> localVarReturnType = new ParameterizedTypeReference<PostCountryRestrictionGroup200Response>() {};
        return getCountryRestrictionGroupsIdRequestCreation(id, fields).bodyToMono(localVarReturnType);
    }

    /**
     * Get Country Restriction Group
     * Retrive a Country Restriction Group based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Country Group.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return ResponseEntity&lt;PostCountryRestrictionGroup200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PostCountryRestrictionGroup200Response>> getCountryRestrictionGroupsIdWithHttpInfo(UUID id, List<String> fields) throws WebClientResponseException {
        ParameterizedTypeReference<PostCountryRestrictionGroup200Response> localVarReturnType = new ParameterizedTypeReference<PostCountryRestrictionGroup200Response>() {};
        return getCountryRestrictionGroupsIdRequestCreation(id, fields).toEntity(localVarReturnType);
    }

    /**
     * Get Country Restriction Group
     * Retrive a Country Restriction Group based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Country Group.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCountryRestrictionGroupsIdWithResponseSpec(UUID id, List<String> fields) throws WebClientResponseException {
        return getCountryRestrictionGroupsIdRequestCreation(id, fields);
    }

    /**
     * Create Country Restriction Group
     * Create a new country restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postCountryRestrictionGroupRequest The postCountryRestrictionGroupRequest parameter
     * @return PostCountryRestrictionGroup200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postCountryRestrictionGroupRequestCreation(PostCountryRestrictionGroupRequest postCountryRestrictionGroupRequest) throws WebClientResponseException {
        Object postBody = postCountryRestrictionGroupRequest;
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

        ParameterizedTypeReference<PostCountryRestrictionGroup200Response> localVarReturnType = new ParameterizedTypeReference<PostCountryRestrictionGroup200Response>() {};
        return apiClient.invokeAPI("/v1/countryRestrictionGroups", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Country Restriction Group
     * Create a new country restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postCountryRestrictionGroupRequest The postCountryRestrictionGroupRequest parameter
     * @return PostCountryRestrictionGroup200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PostCountryRestrictionGroup200Response> postCountryRestrictionGroup(PostCountryRestrictionGroupRequest postCountryRestrictionGroupRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PostCountryRestrictionGroup200Response> localVarReturnType = new ParameterizedTypeReference<PostCountryRestrictionGroup200Response>() {};
        return postCountryRestrictionGroupRequestCreation(postCountryRestrictionGroupRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Country Restriction Group
     * Create a new country restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postCountryRestrictionGroupRequest The postCountryRestrictionGroupRequest parameter
     * @return ResponseEntity&lt;PostCountryRestrictionGroup200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PostCountryRestrictionGroup200Response>> postCountryRestrictionGroupWithHttpInfo(PostCountryRestrictionGroupRequest postCountryRestrictionGroupRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PostCountryRestrictionGroup200Response> localVarReturnType = new ParameterizedTypeReference<PostCountryRestrictionGroup200Response>() {};
        return postCountryRestrictionGroupRequestCreation(postCountryRestrictionGroupRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Country Restriction Group
     * Create a new country restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postCountryRestrictionGroupRequest The postCountryRestrictionGroupRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postCountryRestrictionGroupWithResponseSpec(PostCountryRestrictionGroupRequest postCountryRestrictionGroupRequest) throws WebClientResponseException {
        return postCountryRestrictionGroupRequestCreation(postCountryRestrictionGroupRequest);
    }

    /**
     * Update Country Restriction Group
     * Edit a country restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Country Group.
     * @param putCountryRestrictionGroupsRequest The putCountryRestrictionGroupsRequest parameter
     * @return PutCountryRestrictionGroups200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putCountryRestrictionGroupsRequestCreation(Integer id, PutCountryRestrictionGroupsRequest putCountryRestrictionGroupsRequest) throws WebClientResponseException {
        Object postBody = putCountryRestrictionGroupsRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling putCountryRestrictionGroups", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PutCountryRestrictionGroups200Response> localVarReturnType = new ParameterizedTypeReference<PutCountryRestrictionGroups200Response>() {};
        return apiClient.invokeAPI("/v1/countryRestrictionGroups/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update Country Restriction Group
     * Edit a country restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Country Group.
     * @param putCountryRestrictionGroupsRequest The putCountryRestrictionGroupsRequest parameter
     * @return PutCountryRestrictionGroups200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PutCountryRestrictionGroups200Response> putCountryRestrictionGroups(Integer id, PutCountryRestrictionGroupsRequest putCountryRestrictionGroupsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PutCountryRestrictionGroups200Response> localVarReturnType = new ParameterizedTypeReference<PutCountryRestrictionGroups200Response>() {};
        return putCountryRestrictionGroupsRequestCreation(id, putCountryRestrictionGroupsRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update Country Restriction Group
     * Edit a country restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Country Group.
     * @param putCountryRestrictionGroupsRequest The putCountryRestrictionGroupsRequest parameter
     * @return ResponseEntity&lt;PutCountryRestrictionGroups200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PutCountryRestrictionGroups200Response>> putCountryRestrictionGroupsWithHttpInfo(Integer id, PutCountryRestrictionGroupsRequest putCountryRestrictionGroupsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PutCountryRestrictionGroups200Response> localVarReturnType = new ParameterizedTypeReference<PutCountryRestrictionGroups200Response>() {};
        return putCountryRestrictionGroupsRequestCreation(id, putCountryRestrictionGroupsRequest).toEntity(localVarReturnType);
    }

    /**
     * Update Country Restriction Group
     * Edit a country restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Country Group.
     * @param putCountryRestrictionGroupsRequest The putCountryRestrictionGroupsRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putCountryRestrictionGroupsWithResponseSpec(Integer id, PutCountryRestrictionGroupsRequest putCountryRestrictionGroupsRequest) throws WebClientResponseException {
        return putCountryRestrictionGroupsRequestCreation(id, putCountryRestrictionGroupsRequest);
    }
}
